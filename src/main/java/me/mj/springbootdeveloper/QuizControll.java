package me.mj.springbootdeveloper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizControll {

    @GetMapping("/quiz")
    public ResponseEntity<String> quiz(@RequestParam("code") int code){
        switch (code){
            case 1:
                return ResponseEntity.created(null).body("Created!");

            case 2:
                return ResponseEntity.badRequest().body("Bad Request!");

            default:
                return ResponseEntity.ok().body("OK!");
        }
    }
    @PostMapping("/quiz")
    public ResponseEntity<String> quiz2(@RequestParam Code code) {
        switch (code.value()){
            case 1:
                return ResponseEntity.status(403).body("Forbidden!");
            default:
                return ResponseEntity.ok().body("OK!");
        }
    }
}
record Code(int value){}
