package o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067fv extends AbstractC1807r8 {
    public final List i;

    public C1067fv(Class cls) {
        AbstractC0048Bt.n(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0048Bt.m(declaredMethods, "jClass.declaredMethods");
        C0685a3 c0685a3 = new C0685a3(10);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            AbstractC0048Bt.m(declaredMethods, "copyOf(...)");
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c0685a3);
            }
        }
        this.i = P6.W(declaredMethods);
    }

    @Override // o.AbstractC1807r8
    public final String i() {
        return AbstractC0720ac.t0(this.i, "", "<init>(", ")V", C2316yt.l, 24);
    }
}
