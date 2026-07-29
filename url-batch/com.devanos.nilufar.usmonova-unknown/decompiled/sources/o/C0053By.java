package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.By, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053By {
    public final AbstractC0700aI a;
    public boolean c;
    public boolean d;
    public boolean e;
    public InterfaceC1405l2 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C0053By(InterfaceC1405l2 interfaceC1405l2, int i) {
        this.h = i;
        this.a = (AbstractC0700aI) interfaceC1405l2;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [o.aI, o.l2] */
    public static final void a(C0053By c0053By, AbstractC2248xr abstractC2248xr, int i, ME me) {
        HashMap hashMap = c0053By.g;
        float f = i;
        long h = PX.h(f, f);
        while (true) {
            switch (c0053By.h) {
                case 0:
                    C1823rO c1823rO = ME.D;
                    h = me.z0(h);
                    break;
                default:
                    AbstractC1547nB f0 = me.f0();
                    AbstractC0048Bt.k(f0);
                    long j = f0.m;
                    h = BF.f(PX.h((int) (j >> 32), (int) (j & 4294967295L)), h);
                    break;
            }
            me = me.n;
            AbstractC0048Bt.k(me);
            if (me.equals(c0053By.a.n())) {
                int round = Math.round(abstractC2248xr instanceof AbstractC2248xr ? BF.c(h) : BF.b(h));
                if (!hashMap.containsKey(abstractC2248xr)) {
                    hashMap.put(abstractC2248xr, Integer.valueOf(round));
                    return;
                } else {
                    ((Number) EB.x(abstractC2248xr, hashMap)).intValue();
                    int i2 = AbstractC1339k2.a;
                    throw null;
                }
            }
            if (c0053By.b(me).containsKey(abstractC2248xr)) {
                float c = c0053By.c(me, abstractC2248xr);
                h = PX.h(c, c);
            }
        }
    }

    public final Map b(ME me) {
        switch (this.h) {
            case 0:
                return me.P().k();
            default:
                AbstractC1547nB f0 = me.f0();
                AbstractC0048Bt.k(f0);
                return f0.P().k();
        }
    }

    public final int c(ME me, AbstractC2248xr abstractC2248xr) {
        switch (this.h) {
            case 0:
                return me.J(abstractC2248xr);
            default:
                AbstractC1547nB f0 = me.f0();
                AbstractC0048Bt.k(f0);
                return f0.J(abstractC2248xr);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.aI, o.l2] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        InterfaceC1405l2 q = r0.q();
        if (q == null) {
            return;
        }
        if (this.c) {
            q.requestLayout();
        }
        if (this.d) {
            r0.B();
        }
        if (this.e) {
            r0.requestLayout();
        }
        q.z().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o.aI, o.l2] */
    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        C1400l c1400l = new C1400l(5, this);
        ?? r2 = this.a;
        r2.b(c1400l);
        hashMap.putAll(b(r2.n()));
        this.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.aI, o.l2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        C0053By z;
        C0053By z2;
        boolean d = d();
        ?? r1 = this.a;
        InterfaceC1405l2 interfaceC1405l2 = r1;
        if (!d) {
            InterfaceC1405l2 q = r1.q();
            if (q == null) {
                return;
            }
            InterfaceC1405l2 interfaceC1405l22 = q.z().f;
            if (interfaceC1405l22 != null) {
                boolean d2 = interfaceC1405l22.z().d();
                interfaceC1405l2 = interfaceC1405l22;
            }
            InterfaceC1405l2 interfaceC1405l23 = this.f;
            if (interfaceC1405l23 == null || interfaceC1405l23.z().d()) {
                return;
            }
            InterfaceC1405l2 q2 = interfaceC1405l23.q();
            if (q2 != null && (z2 = q2.z()) != null) {
                z2.h();
            }
            InterfaceC1405l2 q3 = interfaceC1405l23.q();
            interfaceC1405l2 = (q3 == null || (z = q3.z()) == null) ? null : z.f;
        }
        this.f = interfaceC1405l2;
    }
}
