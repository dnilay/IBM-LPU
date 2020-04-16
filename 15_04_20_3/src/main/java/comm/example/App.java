package comm.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entities.Event;
import comm.example.entities.Speaker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().
        		addAnnotatedClass(Speaker.class).
        		addAnnotatedClass(Event.class).buildSessionFactory();
        Event event=new Event();
        event.setDuration(10);
        event.setName("Spring Security");
        event.setStartDate(new Date());
        Speaker speaker=new Speaker("John","Doe");
       
        Set<Event> events=new HashSet<Event>();
        events.add(event);
        speaker.setEvents(events);
        Session session=factory.openSession();
        session.getTransaction().begin();
        session.save(speaker);
        session.getTransaction().commit();
        System.out.println("done");
    }
}
