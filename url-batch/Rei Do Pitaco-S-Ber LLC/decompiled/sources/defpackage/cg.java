package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cg implements h10 {
    public final h10 a;
    public final int b;

    public cg(h10 h10Var, int i) {
        this.a = h10Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.h10
    public final Iterator iterator() {
        return new i(this);
    }
}
