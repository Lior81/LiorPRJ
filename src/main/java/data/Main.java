package data;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

/**
 * Created by student15 on 30/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Lior");
        person.setAge(12);

        System.out.println(person.getName() +" is over 18? " + person.IsAdult());


    }








}
