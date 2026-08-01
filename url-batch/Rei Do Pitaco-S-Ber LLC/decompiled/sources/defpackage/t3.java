package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class t3 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static oq b(Configuration configuration) {
        return oq.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(oq oqVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(oqVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, oq oqVar) {
        configuration.setLocales(LocaleList.forLanguageTags(oqVar.a.a.toLanguageTags()));
    }
}
