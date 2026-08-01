package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ku0 extends t50 implements ah0, sl, zg0 {
    public qg0 A;
    public long B;
    public Object r;
    public Object s;
    public qu t;
    public PointerInputEventHandler u;
    public ws0 v;
    public qg0 w = hu0.a;
    public final l70 x;
    public final l70 y;
    public final l70 z;

    public ku0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.r = obj;
        this.s = obj2;
        this.u = pointerInputEventHandler;
        l70 l70Var = new l70(new ju0[16]);
        this.x = l70Var;
        this.y = l70Var;
        this.z = new l70(new ju0[16]);
        this.B = 0L;
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.zg0
    public final void H() {
        k0();
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.zg0
    public final void L() {
        qg0 qg0Var = this.A;
        if (qg0Var == null) {
            return;
        }
        List list = qg0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((wg0) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    wg0 wg0Var = (wg0) list.get(i2);
                    long j = wg0Var.a;
                    long j2 = wg0Var.c;
                    long j3 = wg0Var.b;
                    float f = wg0Var.e;
                    boolean z = wg0Var.d;
                    arrayList.add(new wg0(j, j3, j2, false, f, j3, j2, z, z, wg0Var.i, 0L));
                }
                qg0 qg0Var2 = new qg0(arrayList, null);
                this.w = qg0Var2;
                j0(qg0Var2, sg0.d);
                j0(qg0Var2, sg0.e);
                j0(qg0Var2, sg0.f);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / a(), this);
    }

    @Override // defpackage.zg0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // defpackage.sl
    public final float a() {
        return nz.a0(this).y.a();
    }

    @Override // defpackage.t50
    public final void a0() {
        k0();
    }

    @Override // defpackage.t50
    public final void b0() {
        k0();
    }

    @Override // defpackage.sl
    public final float h() {
        return nz.a0(this).y.h();
    }

    public final void j0(qg0 qg0Var, sg0 sg0Var) {
        hc hcVar;
        hc hcVar2;
        synchronized (this.y) {
            l70 l70Var = this.z;
            l70Var.c(l70Var.f, this.x);
        }
        try {
            int ordinal = sg0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    l70 l70Var2 = this.z;
                    int i = l70Var2.f - 1;
                    Object[] objArr = l70Var2.d;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            ju0 ju0Var = (ju0) objArr[i];
                            if (sg0Var == ju0Var.g && (hcVar2 = ju0Var.f) != null) {
                                ju0Var.f = null;
                                hcVar2.resumeWith(qg0Var);
                            }
                            i--;
                        }
                    }
                    this.z.g();
                }
                if (ordinal != 2) {
                    throw new kf();
                }
            }
            l70 l70Var3 = this.z;
            Object[] objArr2 = l70Var3.d;
            int i2 = l70Var3.f;
            for (int i3 = 0; i3 < i2; i3++) {
                ju0 ju0Var2 = (ju0) objArr2[i3];
                if (sg0Var == ju0Var2.g && (hcVar = ju0Var2.f) != null) {
                    ju0Var2.f = null;
                    hcVar.resumeWith(qg0Var);
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void k0() {
        ws0 ws0Var = this.v;
        if (ws0Var != null) {
            ws0Var.z(new y50("Pointer input was reset", 0));
            this.v = null;
        }
    }

    @Override // defpackage.zg0
    public final long l() {
        return nz.m;
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.zg0
    public final void s(qg0 qg0Var, sg0 sg0Var, long j) {
        this.B = j;
        if (sg0Var == sg0.d) {
            this.w = qg0Var;
        }
        kj kjVar = null;
        if (this.v == null) {
            this.v = d31.E(V(), null, new qk(this, kjVar, 3), 1);
        }
        j0(qg0Var, sg0Var);
        List list = qg0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                qg0Var = null;
                break;
            } else if (!rg0.d((wg0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.A = qg0Var;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
