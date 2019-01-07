package com.rest.demo;

import com.rest.demo.Model.AppendA;
import com.rest.demo.Model.DoUntil;
import com.rest.demo.Model.Doubling;
import com.rest.demo.Model.Greeter;
import org.springframework.web.bind.annotation.*;

import java.util.function.ObjLongConsumer;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/doubling")
    Object doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new Error("Please provide an input!");
        } else {
            return new Doubling(input);
        }
    }

    @GetMapping("/greeter")
    Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null  && title == null) {
            return new Error("Please provide a name and a title!");
        } else if (title == null) {
            return new Error("Please provide a title!");
        } else if (name == null) {
            return new Error("Please provide a name!");
        } else {
            return new Greeter(name, title);
        }
    }
    @GetMapping("/appenda/{appendable}")
    Object appendA (@PathVariable String appendable) {
        if (appendable != null) {
            return new AppendA(appendable);
        } else {
            return new Error("404");
        }
    }
    @PostMapping("/dountil/{action}")
    Object doUntil (@PathVariable String action, @RequestBody (required = false)Integer until) {
        if (until == null){
            return new Error("Please provide a number!");
           // throw new UnsupportedOperationException("Please provide a number!");
        } else if (action.equals("sum")){
            return new DoUntil(until).sum(until);
        } else if (action.equals("factor")) {
            return new DoUntil(until).factor(until);
        } else {
           // return new Error("Please provide a number!");
            throw new UnsupportedOperationException("Please provide a number!");
        }
    }


}
