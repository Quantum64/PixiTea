package co.q64.teagame.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Indicates that this SPI class is either intended to be implemented,
 * returned from a factory, or otherwise accessed by means other than
 * injection. <b>Never</b> attempt to @Inject an SPI class.
 * 
 * Note that some SPI classes may be located in the API package
 * because I personally feel like it makes more sense for them
 * to be part of the API.
 */
@SPI
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface SPI {
	public Reason value() default Reason.GENERAL;
	
	@AllArgsConstructor
	public static enum Reason {
		// @formatter:off
		/** A reason indicating that this class should be implemented or extended by the programmer as no default implementation is supplied. */
		IMPLEMENT("This class is intended to be implemented or extended."),
		/** A reason indicating that this is an object returned by an internally implemented factory. Try injecting the factory interface API class instead. */
		PRODUCT("This class is produced by an internally implemented factory."),
		/** A reason indicating that this class is accessed by its static members and an instance cannot (and should not) be created via injection. */
		TYPE("This class is an enum or other type that exposes final static constants."),
		/** A reason indicating a general purpose SPI class that cannot be injected. Prefer to use a more specific reason. */
		GENERAL("This class is part of the SPI and cannot be injected.");
		// @formatter:on
		private @Getter String description;
	}
}