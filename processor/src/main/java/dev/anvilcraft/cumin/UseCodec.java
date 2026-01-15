package dev.anvilcraft.cumin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface UseCodec {
    Class<?> clazz() default Void.class;
    String member() default "";
}

