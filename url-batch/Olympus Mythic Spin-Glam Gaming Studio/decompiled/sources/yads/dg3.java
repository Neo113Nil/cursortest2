package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class dg3 implements cg3, eg3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // yads.cg3
    public final void a(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cg3) it.next()).a(j, j2);
        }
    }

    @Override // yads.eg3
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eg3) it.next()).b();
        }
    }

    @Override // yads.eg3
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eg3) it.next()).a();
        }
    }
}
