package pl.mbatyra.keycloak.spring.rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.keycloak.representations.AccessToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mariusz Batyra
 */
@RestController
@RequestMapping("rest/secured")
public class SecuredResource {

    private static final Logger LOG = Logger.getLogger(SecuredResource.class.getName());

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String getTest(KeycloakPrincipal<RefreshableKeycloakSecurityContext> principal) {
        LOG.log(Level.INFO, "Access to secured resource granted!");

        AccessToken accessToken = principal.getKeycloakSecurityContext().getToken();
        String issuer = accessToken.getIssuer();
        String username = accessToken.getPreferredUsername();

        LOG.log(Level.INFO, "Token Issuer: {0}", issuer);
        LOG.log(Level.INFO, "username: {0}", username);

        return "Content of secured resource. Username: " + username;
    }

}
