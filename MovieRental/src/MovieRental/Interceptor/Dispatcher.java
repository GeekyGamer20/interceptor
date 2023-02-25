package MovieRental.Interceptor;
import java.util.Vector;

public class Dispatcher { 
    Vector<ILoggerInterceptor> interceptors;
  
    public Dispatcher() {
        interceptors = new Vector<>();
    }

    public void attachInterceptor(ILoggerInterceptor i){
        interceptors.addElement(i);
    }

    public void detachInterceptor(ILoggerInterceptor i){
        interceptors.removeElement(i);
    }

    public void dispatchRentalAdd(ContextObject co){
        for(ILoggerInterceptor i: interceptors){
            i.interceptRentalAdd(co);
        }
    }

    public void dispatchFrequentRenterPoints(ContextObject co){
        for(ILoggerInterceptor i: interceptors){
            i.interceptFrequentRenterPoints(co);
        }
    }
    
}
