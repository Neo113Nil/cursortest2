package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2367ze extends Y7 {
    private final InterfaceC0189He _context;
    private transient InterfaceC2235xe<Object> intercepted;

    public AbstractC2367ze(InterfaceC2235xe interfaceC2235xe, InterfaceC0189He interfaceC0189He) {
        super(interfaceC2235xe);
        this._context = interfaceC0189He;
    }

    @Override // o.InterfaceC2235xe
    public InterfaceC0189He getContext() {
        InterfaceC0189He interfaceC0189He = this._context;
        AbstractC0048Bt.k(interfaceC0189He);
        return interfaceC0189He;
    }

    public final InterfaceC2235xe<Object> intercepted() {
        InterfaceC2235xe<Object> interfaceC2235xe = this.intercepted;
        if (interfaceC2235xe != null) {
            return interfaceC2235xe;
        }
        InterfaceC0007Ae interfaceC0007Ae = (InterfaceC0007Ae) getContext().k(C0460Rq.w);
        InterfaceC2235xe<Object> c0011Ai = interfaceC0007Ae != null ? new C0011Ai((AbstractC0267Ke) interfaceC0007Ae, this) : this;
        this.intercepted = c0011Ai;
        return c0011Ai;
    }

    @Override // o.Y7
    public void releaseIntercepted() {
        InterfaceC2235xe<Object> interfaceC2235xe = this.intercepted;
        if (interfaceC2235xe != null && interfaceC2235xe != this) {
            InterfaceC0137Fe k = getContext().k(C0460Rq.w);
            AbstractC0048Bt.k(k);
            C0011Ai c0011Ai = (C0011Ai) interfaceC2235xe;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0011Ai.f12o;
            while (atomicReferenceFieldUpdater.get(c0011Ai) == AbstractC0022At.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c0011Ai);
            C0849ca c0849ca = obj instanceof C0849ca ? (C0849ca) obj : null;
            if (c0849ca != null) {
                c0849ca.n();
            }
        }
        this.intercepted = C0005Ac.i;
    }

    public AbstractC2367ze(InterfaceC2235xe interfaceC2235xe) {
        this(interfaceC2235xe, interfaceC2235xe != null ? interfaceC2235xe.getContext() : null);
    }
}
