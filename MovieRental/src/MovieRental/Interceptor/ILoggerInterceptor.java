package MovieRental.Interceptor;
public interface ILoggerInterceptor {
    void interceptRentalAdd(ContextObject co);
    void interceptFrequentRenterPoints(ContextObject co);
}
