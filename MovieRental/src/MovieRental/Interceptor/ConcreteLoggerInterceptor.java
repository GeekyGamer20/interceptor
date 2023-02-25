package MovieRental.Interceptor;
public class ConcreteLoggerInterceptor implements ILoggerInterceptor {

    @Override
    public void interceptRentalAdd(ContextObject co) {
        String result = co.getCustomerName() + " rented " 
                        + co.getMovieDetails() +" for $" 
                        + co.getPrice() + " and " 
                        + co.getDuration() + " days\n";
        System.out.println(result);
    }

    @Override
    public void interceptFrequentRenterPoints(ContextObject co) {
        String result = "You earned " + String.valueOf(co.getTotalFrequentRenterPoints()) 
                        + " frequent renter points from renting "+ co.getMovieDetails() + "\n";
        System.out.println(result);
    }
    
}