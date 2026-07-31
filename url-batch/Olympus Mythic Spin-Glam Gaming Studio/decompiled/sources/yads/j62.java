package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class j62 implements s62 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // yads.s62
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s62) it.next()).a();
        }
    }

    @Override // yads.s62
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s62) it.next()).b();
        }
    }

    @Override // yads.s62
    public final void a(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s62) it.next()).a(j, j2);
        }
    }
}
