package springDemo;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanClient {

    public static void main(String[] args) {
/*
        Student student2  =new Student();
*/
       Resource resource = new ClassPathResource("beanproject.xml");
      BeanFactory beanFactory = new XmlBeanFactory(resource);
      Student s =  (Student) beanFactory.getBean("student");
      Student s1 =  (Student) beanFactory.getBean("student");
      System.out.println(s);
      System.out.println(s1);

    }
}