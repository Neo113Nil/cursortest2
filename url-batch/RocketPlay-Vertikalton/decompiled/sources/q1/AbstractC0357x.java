package q1;

import b1.AbstractC0094c;
import java.util.concurrent.CancellationException;

/* renamed from: q1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0357x extends w1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f3923c;

    public AbstractC0357x(int i) {
        super(0L, w1.k.f4440g);
        this.f3923c = i;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract Z0.d b();

    public Throwable c(Object obj) {
        C0344j c0344j = obj instanceof C0344j ? (C0344j) obj : null;
        if (c0344j != null) {
            return c0344j.f3903a;
        }
        return null;
    }

    public Object d(Object obj) {
        return obj;
    }

    public final void e(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            F1.d.k(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        i1.f.b(th);
        AbstractC0352s.d(b().getContext(), new r("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object f();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = V0.i.f1250a;
        w1.i iVar = this.f4432b;
        try {
            Z0.d b2 = b();
            i1.f.c(b2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            u1.f fVar = (u1.f) b2;
            AbstractC0094c abstractC0094c = fVar.f4182e;
            Object obj2 = fVar.f4184g;
            Z0.i context = abstractC0094c.getContext();
            Object g2 = u1.a.g(context, obj2);
            e0 k2 = g2 != u1.a.f4177e ? AbstractC0352s.k(abstractC0094c, context, g2) : null;
            try {
                Z0.i context2 = abstractC0094c.getContext();
                Object f2 = f();
                Throwable c2 = c(f2);
                M m2 = (c2 == null && AbstractC0352s.f(this.f3923c)) ? (M) context2.f(C0350p.f3913b) : null;
                if (m2 != null && !m2.a()) {
                    CancellationException r2 = ((U) m2).r();
                    a(f2, r2);
                    abstractC0094c.resumeWith(F1.l.t(r2));
                } else if (c2 != null) {
                    abstractC0094c.resumeWith(F1.l.t(c2));
                } else {
                    abstractC0094c.resumeWith(d(f2));
                }
                if (k2 == null || k2.H()) {
                    u1.a.b(context, g2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = F1.l.t(th);
                }
                e(null, V0.f.a(obj));
            } catch (Throwable th2) {
                if (k2 == null || k2.H()) {
                    u1.a.b(context, g2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = F1.l.t(th4);
            }
            e(th3, V0.f.a(obj));
        }
    }
}
