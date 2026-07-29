package o;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N3 extends AbstractC0267Ke {
    public static final BU t = EB.D(T1.q);
    public static final L3 u = new L3(0);
    public final Choreographer j;
    public final Handler k;
    public boolean p;
    public boolean q;
    public final P3 s;
    public final Object l = new Object();
    public final D6 m = new D6();
    public ArrayList n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f69o = new ArrayList();
    public final M3 r = new M3(this);

    public N3(Choreographer choreographer, Handler handler) {
        this.j = choreographer;
        this.k = handler;
        this.s = new P3(choreographer, this);
    }

    public static final void O(N3 n3) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (n3.l) {
                D6 d6 = n3.m;
                runnable = (Runnable) (d6.isEmpty() ? null : d6.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (n3.l) {
                    D6 d62 = n3.m;
                    runnable = (Runnable) (d62.isEmpty() ? null : d62.removeFirst());
                }
            }
            synchronized (n3.l) {
                if (n3.m.isEmpty()) {
                    z = false;
                    n3.p = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        synchronized (this.l) {
            this.m.addLast(runnable);
            if (!this.p) {
                this.p = true;
                this.k.post(this.r);
                if (!this.q) {
                    this.q = true;
                    this.j.postFrameCallback(this.r);
                }
            }
        }
    }
}
