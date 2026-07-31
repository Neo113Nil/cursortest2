package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class d82 implements xa2, lv1 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // yads.xa2
    public final void a(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e82) it.next()).a(z);
        }
    }

    @Override // yads.xa2
    public final void c() {
    }

    @Override // yads.lv1
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e82) it.next()).a();
        }
    }
}
