package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918sr {
    public final N8 a;
    public long b;

    public C1918sr(N8 n8) {
        AbstractC0048Bt.n(n8, Constants.ScionAnalytics.PARAM_SOURCE);
        this.a = n8;
        this.b = 262144L;
    }

    public final C1852rr a() {
        C1787qr c1787qr = new C1787qr();
        while (true) {
            String u = this.a.u(this.b);
            this.b -= u.length();
            if (u.length() == 0) {
                return c1787qr.d();
            }
            int H = UT.H(u, ':', 1, 4);
            if (H != -1) {
                String substring = u.substring(0, H);
                AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = u.substring(H + 1);
                AbstractC0048Bt.m(substring2, "this as java.lang.String).substring(startIndex)");
                c1787qr.b(substring, substring2);
            } else if (u.charAt(0) == ':') {
                String substring3 = u.substring(1);
                AbstractC0048Bt.m(substring3, "this as java.lang.String).substring(startIndex)");
                c1787qr.b("", substring3);
            } else {
                c1787qr.b("", u);
            }
        }
    }
}
