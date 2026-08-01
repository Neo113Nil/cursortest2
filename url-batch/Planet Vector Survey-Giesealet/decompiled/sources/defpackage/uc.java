package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uc extends vc {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(uc.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final tc g;
    public final boolean h;

    public /* synthetic */ uc(tc tcVar, boolean z) {
        this(tcVar, z, up.d, -3, cb.d);
    }

    @Override // defpackage.or
    public final Object a(pr prVar, kj kjVar) {
        int i2 = this.e;
        kj kjVar2 = null;
        ck ckVar = ck.d;
        ky0 ky0Var = ky0.a;
        if (i2 == -3) {
            boolean z = this.h;
            if (z && i.getAndSet(this, 1) != 0) {
                g8.s("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object w = px0.w(prVar, this.g, z, kjVar);
            if (w == ckVar) {
                return w;
            }
        } else {
            Object v = x40.v(new u6(prVar, this, kjVar2, 2), kjVar);
            if (v != ckVar) {
                v = ky0Var;
            }
            if (v == ckVar) {
                return v;
            }
        }
        return ky0Var;
    }

    @Override // defpackage.vc
    public final String c() {
        return "channel=" + this.g;
    }

    @Override // defpackage.vc
    public final Object d(wh0 wh0Var, c cVar) {
        Object w = px0.w(new hq0(wh0Var), this.g, this.h, cVar);
        return w == ck.d ? w : ky0.a;
    }

    @Override // defpackage.vc
    public final vc e(rj rjVar, int i2, cb cbVar) {
        return new uc(this.g, this.h, rjVar, i2, cbVar);
    }

    @Override // defpackage.vc
    public final or f() {
        return new uc(this.g, this.h);
    }

    @Override // defpackage.vc
    public final tc g(bk bkVar) {
        if (!this.h || i.getAndSet(this, 1) == 0) {
            return this.e == -3 ? this.g : super.g(bkVar);
        }
        g8.s("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public uc(tc tcVar, boolean z, rj rjVar, int i2, cb cbVar) {
        super(rjVar, i2, cbVar);
        this.g = tcVar;
        this.h = z;
        this.consumed$volatile = 0;
    }
}
