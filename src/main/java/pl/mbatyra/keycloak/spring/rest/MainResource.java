package pl.mbatyra.keycloak.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mariusz Batyra
 */
@RestController
@RequestMapping("rest/main")
public class MainResource {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getTest() {
        System.out.println("TEST !!!!");
        return "test rest";
    }
}
