# keycloak-spring
Simple application to integrate keycloak and spring

## Configuration
### Step 1. Download keycloak server
I use version:`keycloak-1.9.1.Final`  
http://keycloak.jboss.org/downloads
### Step 2. Unzip and start server
```
$ cd keycloak/bin
$ ./standalone.sh
```
### Step 3. Login to administration console (`localhost:8080/auth/admin`)
  - click `Add realm` and import realm from file (`keycloak-spring/docs/keycloak-test-realm.json`)

### Step 4. Run application and test
  - call GET request: `http://localhost:9090/keycloak-spring/rest/main/test`
  - log in as: user/user and see result 
