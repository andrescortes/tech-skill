package co.com.hotel.hotel.handlereception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder(toBuilder = true)
public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
    private Integer code;
}
