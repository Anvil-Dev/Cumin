package dev.anvilcraft.cumin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.SOURCE)
public @interface CodecField {
    String value() default "";
    String getter() default "";
    /**
     * 手动指定 Codec 的完全限定名或表达式。
     * @apiNote "net.minecraft.core.registries.BuiltInRegistries.BLOCK.asCodec()"
     */
    String codec() default "";
}
