package org.studyeasy;

/*
 * Application will scan the entire application and register app based on annotation.
 * For which  URI pattern this configuration should be used we need to specify that also.
 */

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("JAXRS")
public class ApplicationConfig extends Application{

}
