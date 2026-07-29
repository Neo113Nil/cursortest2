package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.gC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088gC {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public C1088gC(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((C0406Po) ((InterfaceC2207xC) it.next())).a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC2207xC interfaceC2207xC) {
        this.b.remove(interfaceC2207xC);
        C1022fC c1022fC = (C1022fC) this.c.remove(interfaceC2207xC);
        if (c1022fC != null) {
            c1022fC.a.b(c1022fC.b);
            c1022fC.b = null;
        }
        this.a.run();
    }
}
