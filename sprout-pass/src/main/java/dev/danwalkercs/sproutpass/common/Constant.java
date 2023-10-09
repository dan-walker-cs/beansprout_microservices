package dev.danwalkercs.sproutpass.common;

/**
 * Class file for all Sprout-Pass microservice constants.
 */
public class Constant {

    public static final String[] DEFAULT_USERNAME_POOL = {
            "Anthill", "Blob", "Crow", "Dog", "Elbow", "Flow", "Gnat", "Heckle", "Igloo", "Jerky",
            "Kale", "Lemon", "Monad", "Nugget", "Oboe", "Polka", "Quartz", "Rattle", "Strobe", "Tetra",
            "Ube", "Valet", "Wonky", "Xray", "Yonder", "Zoinks"
    };

    public static final String OPEN_REQUEST_MATCHERS = "/open/**";
    public static final String SECURE_REQUEST_MATCHERS = "/secure/**";
    public static final String DEFAULT_OAUTH_SUCCESS_URL = "/secure/user/current";
}
