package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class vy2 extends g {
    public final Iterator d;
    public final /* synthetic */ wy2 e;

    public vy2(wy2 wy2Var) {
        this.e = wy2Var;
        this.d = wy2Var.b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.d.hasNext()) {
            Object next = this.d.next();
            if (this.e.c.contains(next)) {
                return next;
            }
        }
        this.b = 3;
        return null;
    }
}
