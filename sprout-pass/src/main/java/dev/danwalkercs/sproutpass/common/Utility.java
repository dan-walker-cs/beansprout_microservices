package dev.danwalkercs.sproutpass.common;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Class file for all Sprout-Pass microservice static utilities.
 */
public class Utility {

    public static ZonedDateTime now() {
        return ZonedDateTime.now(ZoneOffset.UTC);
    }
}
