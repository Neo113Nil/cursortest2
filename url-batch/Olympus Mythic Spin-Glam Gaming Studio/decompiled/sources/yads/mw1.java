package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class mw1 implements kv1, lv1, xa2 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    @Override // yads.lv1
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((lv1) it.next()).a();
        }
    }

    @Override // yads.kv1
    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kv1) it.next()).b();
        }
    }

    @Override // yads.xa2
    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((xa2) it.next()).c();
        }
    }

    @Override // yads.kv1
    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kv1) it.next()).e();
        }
    }

    @Override // yads.xa2
    public final void a(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((xa2) it.next()).a(z);
        }
    }
}
