package o;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: o.hs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1196hs {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
