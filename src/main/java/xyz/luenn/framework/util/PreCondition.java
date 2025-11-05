package xyz.luenn.framework.util;

public final class PreCondition {
    public static void nonNull(Object object, String message) {
        if (object == null) throw new NullPointerException(message);
    }
}
