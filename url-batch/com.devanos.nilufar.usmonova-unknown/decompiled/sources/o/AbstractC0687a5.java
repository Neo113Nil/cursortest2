package o;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: o.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0687a5 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static IA b(Configuration configuration) {
        return IA.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(IA ia) {
        LocaleList.setDefault(LocaleList.forLanguageTags(ia.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, IA ia) {
        configuration.setLocales(LocaleList.forLanguageTags(ia.a.a.toLanguageTags()));
    }
}
