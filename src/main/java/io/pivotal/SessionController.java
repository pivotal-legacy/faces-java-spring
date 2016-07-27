package io.pivotal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {
    @RequestMapping(value = "/api/session", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void create() {

    }

}
