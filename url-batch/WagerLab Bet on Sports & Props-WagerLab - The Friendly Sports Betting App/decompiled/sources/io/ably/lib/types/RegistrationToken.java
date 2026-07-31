package io.ably.lib.types;

import java.util.Locale;

/* loaded from: classes7.dex */
public class RegistrationToken {
    public String token;
    public Type type;

    public RegistrationToken(Type type, String str) {
        this.type = type;
        this.token = str;
    }

    public enum Type {
        GCM,
        FCM;

        public static Type fromOrdinal(int i) {
            try {
                return values()[i];
            } catch (Throwable unused) {
                return null;
            }
        }

        public static Type fromName(String str) {
            try {
                return valueOf(str.toUpperCase(Locale.ROOT));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String toName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public String toString() {
        return "RegistrationToken{type=" + this.type + ", token='" + this.token + "'}";
    }
}
