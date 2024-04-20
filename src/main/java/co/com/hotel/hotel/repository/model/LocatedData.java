package co.com.hotel.hotel.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "locateds")
public class LocatedData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String placeHotel;
}
