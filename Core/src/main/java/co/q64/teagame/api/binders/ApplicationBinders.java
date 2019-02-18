package co.q64.teagame.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

public interface ApplicationBinders {
	public interface BaseConstantBinders {
		// @formatter:off
		@Qualifier @Retention(RUNTIME) public static @interface Width {}
		@Qualifier @Retention(RUNTIME) public static @interface Height {}
		@Qualifier @Retention(RUNTIME) public static @interface Transparent {}
		// @formatter:on
	}
}
