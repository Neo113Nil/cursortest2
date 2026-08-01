package o1;

import java.util.concurrent.CancellationException;

/* renamed from: o1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0307y extends u1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f3344c;

    public AbstractC0307y(int i) {
        super(0L, u1.k.f3833g);
        this.f3344c = i;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract X0.d c();

    public Throwable d(Object obj) {
        C0294k c0294k = obj instanceof C0294k ? (C0294k) obj : null;
        if (c0294k != null) {
            return c0294k.f3324a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            T.e.g(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        g1.f.b(th);
        AbstractC0302t.f(c().h(), new C0301s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = U0.i.f870a;
        u1.i iVar = this.f3825b;
        try {
            X0.d c2 = c();
            g1.f.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            s1.f fVar = (s1.f) c2;
            Z0.c cVar = fVar.f3695e;
            Object obj2 = fVar.f3697g;
            X0.i iVar2 = cVar.f1176b;
            g1.f.b(iVar2);
            Object g2 = s1.a.g(iVar2, obj2);
            g0 m2 = g2 != s1.a.f3690e ? AbstractC0302t.m(cVar, iVar2, g2) : null;
            try {
                X0.i iVar3 = cVar.f1176b;
                g1.f.b(iVar3);
                Object i = i();
                Throwable d = d(i);
                O o2 = (d == null && AbstractC0302t.h(this.f3344c)) ? (O) iVar3.j(C0300q.f3334b) : null;
                if (o2 != null && !o2.a()) {
                    CancellationException s2 = ((W) o2).s();
                    a(i, s2);
                    cVar.b(T.e.s(s2));
                } else if (d != null) {
                    cVar.b(T.e.s(d));
                } else {
                    cVar.b(f(i));
                }
                if (m2 == null || m2.J()) {
                    s1.a.b(iVar2, g2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = T.e.s(th);
                }
                g(null, U0.f.a(obj));
            } catch (Throwable th2) {
                if (m2 == null || m2.J()) {
                    s1.a.b(iVar2, g2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = T.e.s(th4);
            }
            g(th3, U0.f.a(obj));
        }
    }
}
