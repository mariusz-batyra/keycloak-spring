package pl.mbatyra.keycloak.spring.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mariusz Batyra
 */
@RestController
@RequestMapping("rest")
public class NonSecuredResource {

    private static final Logger LOG = Logger.getLogger(NonSecuredResource.class.getName());

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getTest() {
        LOG.log(Level.INFO, "Access to non secured resource granted!");
        return "Content of non secured resource";
    }

}
