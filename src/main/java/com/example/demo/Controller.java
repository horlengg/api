package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final List<UserDTO> users = List.of(
        new UserDTO("Ly Houleng", "MALE", "horleng.ly@gmail.com"),
        new UserDTO("Sok Pisey", "FEMALE", "pisey.sok@gmail.com"),
        new UserDTO("Heng Visal", "MALE", "visal.heng@gmail.com"),
        new UserDTO("Xen Axu", "MALE", "axu.xen@gmail.com"),
        new UserDTO("An Sreymey", "MALE", "mey.an@gmail.com")
    );

    @GetMapping
    public ResponseEntity<List<UserDTO>> greeting(){
        return ResponseEntity.ok(users);
    }
    
}
