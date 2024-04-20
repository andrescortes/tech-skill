package co.com.hotel.hotel.controller;

import co.com.hotel.hotel.controller.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class HotelController {
    @GetMapping
    public Mono<ResponseEntity<ApiResponse>> getRoomsByCriteria(RequestRoomDTO request)
}
