package o;

import org.conscrypt.Conscrypt;

/* renamed from: o.Qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0421Qd {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
