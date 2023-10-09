package dev.danwalkercs.sproutpass.common;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Utility {

    public static ZonedDateTime now() {
        return ZonedDateTime.now(ZoneOffset.UTC);
    }
}
