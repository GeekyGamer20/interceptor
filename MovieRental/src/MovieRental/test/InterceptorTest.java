package MovieRental.test;

import MovieRental.*;
import MovieRental.Interceptor.*;

import org.junit.Test;

public class InterceptorTest {

    @Test
    public static void testInterceptorPoints() {

        ConcreteLoggerInterceptor concInterceptor = new ConcreteLoggerInterceptor();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.attachInterceptor(concInterceptor);

        Customer customer = new Customer("Josh");

        customer.setDispatcher(dispatcher);

        Movie movie1 = new Movie("Inception", 1);
        Movie movie2 = new Movie("Star Wars: Episode IV", 2);
        Rental rental1 = new Rental(movie1, 4);
        Rental rental2 = new Rental(movie2, 6);

        customer.addRental(rental1);
        customer.Statement();

        customer.addRental(rental2);
        customer.Statement();

    }
}
