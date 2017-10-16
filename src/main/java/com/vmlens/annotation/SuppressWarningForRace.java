package com.vmlens.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(value={ElementType.FIELD})
@Retention(value=RetentionPolicy.CLASS)
public @interface SuppressWarningForRace {

}
