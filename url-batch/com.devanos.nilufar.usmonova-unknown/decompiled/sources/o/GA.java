package o;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class GA {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = a;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    int length2 = localeArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            String c = AbstractC1196hs.c(AbstractC1196hs.a(AbstractC1196hs.b(locale)));
                            if (!c.isEmpty()) {
                                return c.equals(AbstractC1196hs.c(AbstractC1196hs.a(AbstractC1196hs.b(locale2))));
                            }
                            String country = locale.getCountry();
                            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                return true;
                            }
                        } else {
                            if (localeArr[i2].equals(locale2)) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (localeArr[i].equals(locale)) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
