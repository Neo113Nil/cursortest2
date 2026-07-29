package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.zG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343zG extends JG {
    public static final C2343zG c = new C2343zG(3, 0, 2);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        int b = c0575Wb.b(0);
        int b2 = c0575Wb.b(1);
        int b3 = c0575Wb.b(2);
        C0027Ay c0027Ay = (C0027Ay) c0950e6.k;
        C0208Hx c0208Hx = c0027Ay.f;
        if (b == b2) {
            return;
        }
        for (int i = 0; i < b3; i++) {
            int i2 = b > b2 ? b + i : b;
            int i3 = b > b2 ? b2 + i : (b2 + b3) - 2;
            YD yd = (YD) c0208Hx.i;
            C1139h0 c1139h0 = (C1139h0) c0208Hx.j;
            Object n = yd.n(i2);
            c1139h0.invoke();
            ((YD) c0208Hx.i).a(i3, (C0027Ay) n);
            c1139h0.invoke();
        }
        c0027Ay.z();
        c0027Ay.u();
        c0027Ay.s();
    }

    @Override // o.JG
    public final String b(int i) {
        return i == 0 ? Constants.MessagePayloadKeys.FROM : i == 1 ? "to" : i == 2 ? "count" : super.b(i);
    }
}
