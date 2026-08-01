package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zx {
    public final l70 a = new l70(new xx[16]);
    public final ce0 b = ud0.o(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final ce0 d = ud0.o(Boolean.TRUE);

    public final void a(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-318043801);
        if ((((qhVar.h(this) ? 4 : 2) | i) & 3) == 2 && qhVar.z()) {
            qhVar.Q();
        } else {
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (K == y7Var) {
                K = ud0.o(null);
                qhVar.e0(K);
            }
            f70 f70Var = (f70) K;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                qhVar.V(1719915818);
                boolean h = qhVar.h(this);
                Object K2 = qhVar.K();
                if (h || K2 == y7Var) {
                    K2 = new wg(f70Var, this, null);
                    qhVar.e0(K2);
                }
                mz.k(qhVar, (qu) K2, this);
                qhVar.q(false);
            } else {
                qhVar.V(1721436120);
                qhVar.q(false);
            }
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new j(i, 8, this);
        }
    }
}
