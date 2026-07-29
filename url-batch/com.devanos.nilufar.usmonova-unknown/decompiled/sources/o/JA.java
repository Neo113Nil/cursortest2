package o;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class JA {
    public static final JA a = new JA();

    public final Object a(FA fa) {
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(fa));
        Iterator it = fa.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((EA) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(I3 i3, FA fa) {
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(fa));
        Iterator it = fa.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((EA) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        throw null;
    }
}
