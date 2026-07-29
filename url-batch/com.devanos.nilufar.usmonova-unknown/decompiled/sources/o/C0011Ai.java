package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011Ai extends AbstractC0063Ci implements InterfaceC0474Se, InterfaceC2235xe {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12o = AtomicReferenceFieldUpdater.newUpdater(C0011Ai.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC0267Ke k;
    public final AbstractC2367ze l;
    public Object m;
    public final Object n;

    public C0011Ai(AbstractC0267Ke abstractC0267Ke, AbstractC2367ze abstractC2367ze) {
        super(-1);
        this.k = abstractC0267Ke;
        this.l = abstractC2367ze;
        this.m = AbstractC0022At.b;
        this.n = PX.O0(abstractC2367ze.getContext());
    }

    @Override // o.InterfaceC0474Se
    public final InterfaceC0474Se getCallerFrame() {
        return this.l;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return this.l.getContext();
    }

    @Override // o.AbstractC0063Ci
    public final Object i() {
        Object obj = this.m;
        this.m = AbstractC0022At.b;
        return obj;
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        Throwable a = C1428lO.a(obj);
        Object c0031Bc = a == null ? obj : new C0031Bc(a, false);
        AbstractC2367ze abstractC2367ze = this.l;
        InterfaceC0189He context = abstractC2367ze.getContext();
        AbstractC0267Ke abstractC0267Ke = this.k;
        if (abstractC0267Ke.M(context)) {
            this.m = c0031Bc;
            this.j = 0;
            abstractC0267Ke.L(abstractC2367ze.getContext(), this);
            return;
        }
        AbstractC0454Rk a2 = EV.a();
        if (a2.j >= 4294967296L) {
            this.m = c0031Bc;
            this.j = 0;
            a2.P(this);
            return;
        }
        a2.R(true);
        try {
            InterfaceC0189He context2 = abstractC2367ze.getContext();
            Object R0 = PX.R0(context2, this.n);
            try {
                abstractC2367ze.resumeWith(obj);
                while (a2.T()) {
                }
            } finally {
                PX.K0(context2, R0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.k + ", " + AbstractC1052fg.U(this.l) + ']';
    }

    @Override // o.AbstractC0063Ci
    public final InterfaceC2235xe c() {
        return this;
    }
}
