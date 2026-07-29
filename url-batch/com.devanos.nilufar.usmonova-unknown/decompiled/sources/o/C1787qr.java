package o;

import java.util.ArrayList;

/* renamed from: o.qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1787qr {
    public final ArrayList a = new ArrayList(20);

    public final void a(String str, String str2) {
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "value");
        AbstractC0048Bt.j(str);
        AbstractC0048Bt.o(str2, str);
        b(str, str2);
    }

    public final void b(String str, String str2) {
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "value");
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(UT.T(str2).toString());
    }

    public final void c(String str, String str2) {
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(HY.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
        b(str, str2);
    }

    public final C1852rr d() {
        return new C1852rr((String[]) this.a.toArray(new String[0]));
    }

    public final void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
