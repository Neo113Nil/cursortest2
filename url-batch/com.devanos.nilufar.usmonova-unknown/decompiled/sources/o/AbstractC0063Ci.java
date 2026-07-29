package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.Ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0063Ci extends KU {
    public int j;

    public AbstractC0063Ci(int i) {
        super(0L, false);
        this.j = i;
    }

    public abstract InterfaceC2235xe c();

    public Throwable d(Object obj) {
        C0031Bc c0031Bc = obj instanceof C0031Bc ? (C0031Bc) obj : null;
        if (c0031Bc != null) {
            return c0031Bc.a;
        }
        return null;
    }

    public final void f(Throwable th) {
        AbstractC1807r8.J(new C0526Ue("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (o.InterfaceC0075Cu) r5.k(o.C0460Rq.K);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            InterfaceC2235xe c = c();
            AbstractC0048Bt.l(c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0011Ai c0011Ai = (C0011Ai) c;
            AbstractC2367ze abstractC2367ze = c0011Ai.l;
            Object obj = c0011Ai.n;
            InterfaceC0189He context = abstractC2367ze.getContext();
            Object R0 = PX.R0(context, obj);
            InterfaceC0075Cu interfaceC0075Cu = null;
            YX V = R0 != PX.l ? AbstractC0946e20.V(abstractC2367ze, context, R0) : null;
            try {
                InterfaceC0189He context2 = abstractC2367ze.getContext();
                Object i = i();
                Throwable d = d(i);
                if (d == null) {
                    int i2 = this.j;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                }
                if (interfaceC0075Cu != null && !interfaceC0075Cu.b()) {
                    CancellationException t = interfaceC0075Cu.t();
                    b(t);
                    abstractC2367ze.resumeWith(AbstractC1494mO.d(t));
                } else if (d != null) {
                    abstractC2367ze.resumeWith(AbstractC1494mO.d(d));
                } else {
                    abstractC2367ze.resumeWith(e(i));
                }
                if (V != null && !V.d0()) {
                    return;
                }
                PX.K0(context, R0);
            } catch (Throwable th) {
                if (V == null || V.d0()) {
                    PX.K0(context, R0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
