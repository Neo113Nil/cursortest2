package yads;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class qc1 extends g {
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ ig2 e;

    public qc1(Iterator it, ig2 ig2Var) {
        this.d = it;
        this.e = ig2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.d.hasNext()) {
            Object next = this.d.next();
            if (this.e.apply(next)) {
                return next;
            }
        }
        this.b = 3;
        return null;
    }
}
