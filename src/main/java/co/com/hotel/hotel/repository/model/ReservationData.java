package co.com.hotel.hotel.repository.model;

import co.com.hotel.hotel.model.Customer;
import co.com.hotel.hotel.model.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class ReservationData {

    private Integer id;
    private Customer customer;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    private Room room;
}
