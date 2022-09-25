package firstweb.firstweb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    //getAll
    @RequestMapping("/all")
    public List<BookingModel> getAll(){
        return bookingRepository.findAll();
    }


    //Get By price
    @RequestMapping(value = "/affordable/{price}")
    public List<BookingModel> getAffordable(@PathVariable double price){
       return bookingRepository.findByPricePerNightLessThan(price);
    }


    //get by name
//    @RequestMapping(value = "/name/{name}")
//    public List<BookingModel> getName(@PathVariable String name){
//        return bookings.stream().filter(x -> x.getHotelName().equals(name))
//                .collect(Collectors.toList());
//    }


    //post
    @RequestMapping(value = "/create", method =  RequestMethod.POST)
    public List<BookingModel> create(@RequestBody BookingModel bookingModel){
       bookingRepository.save(bookingModel);
       return bookingRepository.findAll();
    }

//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public List<BookingModel> remove(@PathVariable long id){
//        bookingRepository.delete(id);
//
//        return bookingRepository.findAll();
//    }
}
