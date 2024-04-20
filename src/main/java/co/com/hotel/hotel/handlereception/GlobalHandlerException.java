package co.com.hotel.hotel.handlereception;

import co.com.hotel.hotel.controller.response.ApiResponse;
import co.com.hotel.hotel.handlereception.exceptions.NotFoundRoom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(value = NotFoundRoom.class)
    public ResponseEntity<ErrorResponse> handlerNotFoundRoom(NotFoundRoom ex){
        var errorReponse = ErrorResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now());
        return
    }
}
