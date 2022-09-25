package firstweb.firstweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Long> {

    //same as interface in spark

    List<BookingModel> findByPricePerNightLessThan(double price);



}
