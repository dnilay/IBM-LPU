package comm.example.mypackage;

import java.util.HashSet;

import javax.persistence.EntityManager;

import comm.example.entities.Event;
import comm.example.entities.Speaker;

public class CreateTestData {

    public static void createTestData(EntityManager em) {
        em.getTransaction().begin();

        // Create the first event with multiple speakers
        Event event = new Event();
        event.setName("JavaOne conference");
        event.setSpeakers(new HashSet());
        event.getSpeakers().add(new Speaker("John", "Smith", event));
        event.getSpeakers().add(new Speaker("Joe", "Smith", event));
        event.getSpeakers().add(new Speaker("Sang", "Shin", event));

        // Persist event object
        em.persist(event);

        // Create the second event with multiple speakers
        Event event2 = new Event();
        event2.setName("Passion Conference");
        event2.setSpeakers(new HashSet());
        event2.getSpeakers().add(new Speaker("Sang", "Shin", event2));
        event2.getSpeakers().add(new Speaker("Shelly", "Lumm", event2));
        event2.getSpeakers().add(new Speaker("Diane", "Woon", event2));

        // Persist event object
        em.persist(event2);

        em.getTransaction().commit();

    }
}