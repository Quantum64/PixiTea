package co.q64.pixitea.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this API class is ready to be injected anywhere in your
 * application with an @Inject annotation. API classes will only exist in
 * a single instance during a typical runtime environment.
 */
@SPI
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface API {}