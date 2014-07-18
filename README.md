#Core API SDK (Java)

##Development
Package locally via
``` bash
mvn clean package
```

Deploy via
``` bash
mvn -DperformRelease=true deploy
```

Version should be set in pom.xml
```
  <groupId>com.risevision.core.api</groupId>
  <artifactId>CoreAPI</artifactId>
  <version>1.0</version>
```

Before releasing the next version we should incorporate this in a CI build that automates version incrementing and deployment of artifacts.

**Copyright © 2010 - May 2014 Rise Vision Incorporated.**
