package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D8 implements InterfaceC0957eD {
    public final LE h;
    public Throwable j;
    public final Object i = new Object();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final Z6 m = new Z6(0);

    public D8(LE le) {
        this.h = le;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        return PX.E0(this, interfaceC0189He);
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }

    public final void a(long j) {
        Object d;
        synchronized (this.i) {
            try {
                ArrayList arrayList = this.k;
                this.k = this.l;
                this.l = arrayList;
                this.m.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C8 c8 = (C8) arrayList.get(i);
                    C0849ca c0849ca = c8.b;
                    try {
                        d = c8.a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        d = AbstractC1494mO.d(th);
                    }
                    c0849ca.resumeWith(d);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.J(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0957eD
    public final Object v(InterfaceC2114vp interfaceC2114vp, AbstractC2367ze abstractC2367ze) {
        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(abstractC2367ze));
        c0849ca.r();
        C8 c8 = new C8(c0849ca, interfaceC2114vp);
        synchronized (this.i) {
            Throwable th = this.j;
            if (th != null) {
                c0849ca.resumeWith(AbstractC1494mO.d(th));
            } else {
                boolean isEmpty = this.k.isEmpty();
                this.k.add(c8);
                if (isEmpty) {
                    this.m.set(1);
                }
                c0849ca.t(new C0810c0(this, 6, c8));
                if (isEmpty) {
                    try {
                        this.h.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.i) {
                            try {
                                if (this.j == null) {
                                    this.j = th2;
                                    ArrayList arrayList = this.k;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((C8) arrayList.get(i)).b.resumeWith(AbstractC1494mO.d(th2));
                                    }
                                    this.k.clear();
                                    this.m.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0849ca.q();
    }
}
