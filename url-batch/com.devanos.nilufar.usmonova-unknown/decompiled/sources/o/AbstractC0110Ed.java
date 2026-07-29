package o;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: o.Ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110Ed {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, IA ia) {
        configuration.setLocales(ia.a.a);
    }
}
