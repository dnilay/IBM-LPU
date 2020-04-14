package comm.example;

import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comm.example.bean.Image;
import comm.example.config.MyAppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
       Image image=context.getBean("image",Image.class);
       image.setImageID(UUID.randomUUID().toString());
       image.setImageURL("demo url");
       System.out.println(image);
    }
}
