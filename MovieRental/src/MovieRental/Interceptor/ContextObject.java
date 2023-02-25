package MovieRental.Interceptor;
import MovieRental.Customer;
import MovieRental.Rental;


public class ContextObject {
    private Rental rental;
	private Customer customer;

	public ContextObject(Rental r, Customer c) {
        this.rental = r;
        this.customer = c;
    }
 
	public String getMovieDetails() {
		return rental.getMovie().getTitle();
    }
		
	public String getCustomerName() {
        return customer.getName();
    }

	public double getPrice() {
        return rental.getCharge();
    }

    public double getDuration() {
        return rental.getDaysRented();
    }

    public double getTotalFrequentRenterPoints(){
        return rental.getFrequentRenterPoints();
    }
}
