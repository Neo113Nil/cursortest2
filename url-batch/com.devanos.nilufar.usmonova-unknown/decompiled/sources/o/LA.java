package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LA {
    public final C0208Hx a;
    public final Context b;

    public LA(Context context, C0208Hx c0208Hx) {
        C1590ns c1590ns = new C1590ns(11, this);
        this.b = context;
        this.a = c0208Hx;
        c0208Hx.j = c1590ns;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            builder.setRegion(split[i]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((C0950e6) this.a.i).E("setLocale", arrayList2, null);
    }
}
