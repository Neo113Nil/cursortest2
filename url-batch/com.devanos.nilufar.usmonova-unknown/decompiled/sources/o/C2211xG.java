package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.xG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211xG extends JG {
    public static final C2211xG c = new C2211xG(0, 3, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        C0841cS c0841cS = (C0841cS) c0575Wb.c(1);
        C1471m2 c1471m2 = (C1471m2) c0575Wb.c(0);
        C1386km c1386km = (C1386km) c0575Wb.c(2);
        C0972eS l = c0841cS.l();
        try {
            if (!c1386km.t.g0()) {
                EB.h("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c1386km.s.f0(c0950e6, l, c1970td);
            l.e(true);
            c0972eS.d();
            c1471m2.getClass();
            c0972eS.t(c0841cS, c0841cS.j(c1471m2));
            c0972eS.j();
        } catch (Throwable th) {
            l.e(false);
            throw th;
        }
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "anchor" : i == 1 ? Constants.MessagePayloadKeys.FROM : i == 2 ? "fixups" : super.c(i);
    }
}
