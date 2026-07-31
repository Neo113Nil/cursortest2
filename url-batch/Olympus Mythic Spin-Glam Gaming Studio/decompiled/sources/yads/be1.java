package yads;

import java.util.Map;

/* loaded from: classes13.dex */
public final class be1 implements t01 {
    public final /* synthetic */ lw1 a;
    public final /* synthetic */ ie1 b;
    public final /* synthetic */ xw1 c;

    public be1(lw1 lw1Var, ie1 ie1Var, xw1 xw1Var) {
        this.a = lw1Var;
        this.b = ie1Var;
        this.c = xw1Var;
    }

    @Override // yads.t01
    public final void a(xw1 xw1Var, Map map) {
        this.a.a(xw1Var, map);
    }

    @Override // yads.t01
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // yads.t01
    public final void a() {
        this.a.a();
    }

    @Override // yads.t01
    public final void a(String str) {
        if (this.b.d.a(this.c, str)) {
            return;
        }
        this.a.c(str);
    }
}
