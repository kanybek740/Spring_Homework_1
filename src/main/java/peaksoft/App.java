package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        Enot enot = context.getBean("myAnimal", Enot.class);
        enot.animalMinus();
        enot.animalPlus();

        context.close();
    }
}
