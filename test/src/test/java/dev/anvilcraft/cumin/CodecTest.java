package dev.anvilcraft.cumin;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

@AutoCodec
public class CodecTest {
    @Test
    public void test() {
        CodecTestClass codecTest = new CodecTestClass(
            "test",
            1,
            true,
            2.0F,
            3.0,
            4,
            (short) 5,
            6.0,
            List.of("test"),
            List.of(1, 2, 3),
            Map.of("test", 1),
            7.0,
            8
        );
        System.out.println(codecTest);
    }
}
