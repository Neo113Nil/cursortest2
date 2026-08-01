package u1;

import b1.AbstractC0094c;
import b1.InterfaceC0095d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q1.AbstractC0349o;
import q1.AbstractC0352s;
import q1.AbstractC0357x;
import q1.C0344j;
import q1.C0345k;
import q1.D;
import q1.c0;

/* loaded from: classes.dex */
public final class f extends AbstractC0357x implements InterfaceC0095d, Z0.d {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final AbstractC0349o d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0094c f4182e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4183f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4184g;

    public f(AbstractC0349o abstractC0349o, AbstractC0094c abstractC0094c) {
        super(-1);
        this.d = abstractC0349o;
        this.f4182e = abstractC0094c;
        this.f4183f = a.f4175b;
        Object q2 = abstractC0094c.getContext().q(0, s.f4204c);
        i1.f.b(q2);
        this.f4184g = q2;
    }

    @Override // q1.AbstractC0357x
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0345k) {
            ((C0345k) obj).f3905b.g(cancellationException);
        }
    }

    @Override // q1.AbstractC0357x
    public final Z0.d b() {
        return this;
    }

    @Override // q1.AbstractC0357x
    public final Object f() {
        Object obj = this.f4183f;
        this.f4183f = a.f4175b;
        return obj;
    }

    @Override // b1.InterfaceC0095d
    public final InterfaceC0095d getCallerFrame() {
        AbstractC0094c abstractC0094c = this.f4182e;
        if (abstractC0094c != null) {
            return abstractC0094c;
        }
        return null;
    }

    @Override // Z0.d
    public final Z0.i getContext() {
        return this.f4182e.getContext();
    }

    @Override // Z0.d
    public final void resumeWith(Object obj) {
        AbstractC0094c abstractC0094c = this.f4182e;
        Z0.i context = abstractC0094c.getContext();
        Throwable a2 = V0.f.a(obj);
        Object c0344j = a2 == null ? obj : new C0344j(a2, false);
        AbstractC0349o abstractC0349o = this.d;
        if (abstractC0349o.E()) {
            this.f4183f = c0344j;
            this.f3923c = 0;
            abstractC0349o.D(context, this);
            return;
        }
        D a3 = c0.a();
        if (a3.f3863c >= 4294967296L) {
            this.f4183f = c0344j;
            this.f3923c = 0;
            W0.h hVar = a3.f3864e;
            if (hVar == null) {
                hVar = new W0.h();
                a3.f3864e = hVar;
            }
            hVar.addLast(this);
            return;
        }
        a3.H(true);
        try {
            Z0.i context2 = abstractC0094c.getContext();
            Object g2 = a.g(context2, this.f4184g);
            try {
                abstractC0094c.resumeWith(obj);
                while (a3.I()) {
                }
            } finally {
                a.b(context2, g2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC0352s.j(this.f4182e) + ']';
    }
}
