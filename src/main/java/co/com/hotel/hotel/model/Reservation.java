package co.com.hotel.hotel.model;

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
public class Reservation {
    private Integer id;
    private Customer customer;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    private Room room;
}
