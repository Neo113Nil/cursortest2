package yads;

import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class i52 implements cb2 {
    public final c63 a;
    public final kh1 b;

    public i52(c63 c63Var) {
        kh1 kh1Var = new kh1();
        this.a = c63Var;
        this.b = kh1Var;
    }

    @Override // yads.cb2
    public final void a(String str) {
        String a = this.b.a(str, MapsKt.emptyMap());
        if (a.length() > 0) {
            this.a.a(a);
        } else {
            boolean z = ob1.a;
            eo2 eo2Var = eo2.c;
        }
    }
}
