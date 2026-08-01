package s1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o1.AbstractC0299p;
import o1.AbstractC0302t;
import o1.AbstractC0307y;
import o1.C0294k;
import o1.C0295l;
import o1.G;
import o1.e0;

/* loaded from: classes.dex */
public final class f extends AbstractC0307y implements Z0.d, X0.d {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final AbstractC0299p d;

    /* renamed from: e, reason: collision with root package name */
    public final Z0.c f3695e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3696f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3697g;

    public f(AbstractC0299p abstractC0299p, Z0.c cVar) {
        super(-1);
        this.d = abstractC0299p;
        this.f3695e = cVar;
        this.f3696f = a.f3688b;
        X0.i iVar = cVar.f1176b;
        g1.f.b(iVar);
        this.f3697g = a.f(iVar);
    }

    @Override // o1.AbstractC0307y
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0295l) {
            ((C0295l) obj).f3326b.g(cancellationException);
        }
    }

    @Override // X0.d
    public final void b(Object obj) {
        Z0.c cVar = this.f3695e;
        X0.i iVar = cVar.f1176b;
        g1.f.b(iVar);
        Throwable a2 = U0.f.a(obj);
        Object c0294k = a2 == null ? obj : new C0294k(a2, false);
        AbstractC0299p abstractC0299p = this.d;
        if (abstractC0299p.A()) {
            this.f3696f = c0294k;
            this.f3344c = 0;
            abstractC0299p.z(iVar, this);
            return;
        }
        G a3 = e0.a();
        if (a3.f3283c >= 4294967296L) {
            this.f3696f = c0294k;
            this.f3344c = 0;
            V0.c cVar2 = a3.f3284e;
            if (cVar2 == null) {
                cVar2 = new V0.c();
                a3.f3284e = cVar2;
            }
            cVar2.addLast(this);
            return;
        }
        a3.D(true);
        try {
            X0.i iVar2 = cVar.f1176b;
            g1.f.b(iVar2);
            Object g2 = a.g(iVar2, this.f3697g);
            try {
                cVar.b(obj);
                while (a3.E()) {
                }
            } finally {
                a.b(iVar2, g2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // o1.AbstractC0307y
    public final X0.d c() {
        return this;
    }

    @Override // Z0.d
    public final Z0.d e() {
        Z0.c cVar = this.f3695e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // X0.d
    public final X0.i h() {
        X0.i iVar = this.f3695e.f1176b;
        g1.f.b(iVar);
        return iVar;
    }

    @Override // o1.AbstractC0307y
    public final Object i() {
        Object obj = this.f3696f;
        this.f3696f = a.f3688b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC0302t.l(this.f3695e) + ']';
    }
}
