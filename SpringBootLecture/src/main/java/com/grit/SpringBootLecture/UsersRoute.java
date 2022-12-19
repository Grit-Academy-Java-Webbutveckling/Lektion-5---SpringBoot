package com.grit.SpringBootLecture;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UsersRoute {

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getAllUsers() {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("key", "value");
        myHashMap.put("School", "Grit");
        myHashMap.put("Year", "2022");
        return myHashMap;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "Welcome User with ID" + id;
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user){
        return "Welcome " + user.getFirstName() + " " + user.getLastName() + " has age: " + user.getAge();
    }

}
