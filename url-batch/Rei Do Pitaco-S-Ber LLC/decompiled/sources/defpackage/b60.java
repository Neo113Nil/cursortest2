package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b60 extends a60 {
    public final /* synthetic */ l6 a;
    public final /* synthetic */ c60 b;

    public b60(c60 c60Var, l6 l6Var) {
        this.b = c60Var;
        this.a = l6Var;
    }

    @Override // defpackage.w50
    public final void d(z50 z50Var) {
        ((ArrayList) this.a.get(this.b.g)).remove(z50Var);
        z50Var.y(this);
    }
}
