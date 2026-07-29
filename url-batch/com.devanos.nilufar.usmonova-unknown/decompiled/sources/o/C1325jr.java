package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: o.jr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325jr extends AbstractC0267Ke implements InterfaceC0658Zg {
    public final Handler j;
    public final String k;
    public final boolean l;
    public final C1325jr m;

    public C1325jr(Handler handler, String str, boolean z) {
        this.j = handler;
        this.k = str;
        this.l = z;
        this.m = z ? this : new C1325jr(handler, str, true);
    }

    @Override // o.AbstractC0267Ke
    public final void L(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        if (this.j.post(runnable)) {
            return;
        }
        O(interfaceC0189He, runnable);
    }

    @Override // o.AbstractC0267Ke
    public final boolean M(InterfaceC0189He interfaceC0189He) {
        return (this.l && AbstractC0048Bt.h(Looper.myLooper(), this.j.getLooper())) ? false : true;
    }

    public final void O(InterfaceC0189He interfaceC0189He, Runnable runnable) {
        PX.s(interfaceC0189He, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        ExecutorC0035Bg.j.L(interfaceC0189He, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1325jr)) {
            return false;
        }
        C1325jr c1325jr = (C1325jr) obj;
        return c1325jr.j == this.j && c1325jr.l == this.l;
    }

    public final int hashCode() {
        return System.identityHashCode(this.j) ^ (this.l ? 1231 : 1237);
    }

    @Override // o.InterfaceC0658Zg
    public final InterfaceC0297Li m(long j, final PV pv, InterfaceC0189He interfaceC0189He) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(pv, j)) {
            return new InterfaceC0297Li() { // from class: o.ir
                @Override // o.InterfaceC0297Li
                public final void a() {
                    C1325jr.this.j.removeCallbacks(pv);
                }
            };
        }
        O(interfaceC0189He, pv);
        return PE.h;
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        C1325jr c1325jr;
        String str;
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        C1325jr c1325jr2 = AbstractC1810rB.a;
        if (this == c1325jr2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1325jr = c1325jr2.m;
            } catch (UnsupportedOperationException unused) {
                c1325jr = null;
            }
            str = this == c1325jr ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.k;
        if (str2 == null) {
            str2 = this.j.toString();
        }
        return this.l ? AbstractC1888sN.j(str2, ".immediate") : str2;
    }

    @Override // o.InterfaceC0658Zg
    public final void x(long j, C0849ca c0849ca) {
        final RunnableC1996u1 runnableC1996u1 = new RunnableC1996u1(5, c0849ca, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(runnableC1996u1, j)) {
            c0849ca.t(new InterfaceC2114vp() { // from class: o.hr
                @Override // o.InterfaceC2114vp
                public final Object invoke(Object obj) {
                    C1325jr.this.j.removeCallbacks(runnableC1996u1);
                    return C0782bY.a;
                }
            });
        } else {
            O(c0849ca.l, runnableC1996u1);
        }
    }

    public C1325jr(Handler handler) {
        this(handler, null, false);
    }
}
