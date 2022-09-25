package firstweb.firstweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DatabaseSeeder implements CommandLineRunner {

    //add the booking repository class
    private BookingRepository bookingRepository;

    //dependency injection constructor
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    //Immediately the programs runs, this commands are executed
    @Override
    public void run(String... args) throws Exception {

        List<BookingModel> bookings = new ArrayList<>();

        bookings.add(new BookingModel("Maina", 200.00, 3));
        bookings.add(new BookingModel("Kevin", 100.00, 5));
        bookings.add(new BookingModel("Kui", 150.00, 8));



        //saving the bookings
        bookingRepository.saveAll(bookings);
    }
}
