import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        boolean hello = bean == bean1;
        System.out.println(hello);
        Cat beans =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(beans.getMessage());
        Cat beans1 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(beans.getMessage());
        boolean cats = beans == beans1;
        System.out.println(cats);


    }
}