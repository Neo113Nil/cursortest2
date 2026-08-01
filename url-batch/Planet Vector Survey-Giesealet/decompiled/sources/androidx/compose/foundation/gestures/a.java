package androidx.compose.foundation.gestures;

import defpackage.bd0;
import defpackage.ck;
import defpackage.d;
import defpackage.dj0;
import defpackage.g8;
import defpackage.jo0;
import defpackage.ko0;
import defpackage.lj;
import defpackage.lo0;
import defpackage.qm;
import defpackage.r60;
import defpackage.ra0;
import defpackage.rg0;
import defpackage.ro0;
import defpackage.sc0;
import defpackage.u50;
import defpackage.zo0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class a {
    public static final jo0 a = new jo0();
    public static final qm b = new qm(1);
    public static final ko0 c = new ko0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zo0 zo0Var, long j, lj ljVar) {
        lo0 lo0Var;
        int i;
        dj0 dj0Var;
        zo0 zo0Var2;
        if (ljVar instanceof lo0) {
            lo0Var = (lo0) ljVar;
            int i2 = lo0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lo0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = lo0Var.f;
                i = lo0Var.g;
                if (i != 0) {
                    rg0.u(obj);
                    dj0Var = new dj0();
                    d dVar = new d(zo0Var, j, dj0Var, null, 1);
                    lo0Var.d = zo0Var;
                    lo0Var.e = dj0Var;
                    lo0Var.g = 1;
                    Object e = zo0Var.e(1, dVar, lo0Var);
                    ck ckVar = ck.d;
                    if (e == ckVar) {
                        return ckVar;
                    }
                    zo0Var2 = zo0Var;
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dj0 dj0Var2 = lo0Var.e;
                    zo0 zo0Var3 = lo0Var.d;
                    rg0.u(obj);
                    dj0Var = dj0Var2;
                    zo0Var2 = zo0Var3;
                }
                return new ra0(zo0Var2.g(dj0Var.d));
            }
        }
        lo0Var = new lo0(ljVar);
        Object obj2 = lo0Var.f;
        i = lo0Var.g;
        if (i != 0) {
        }
        return new ra0(zo0Var2.g(dj0Var.d));
    }

    public static final u50 b(u50 u50Var, ro0 ro0Var, sc0 sc0Var, bd0 bd0Var, boolean z, r60 r60Var) {
        return u50Var.c(new ScrollableElement(r60Var, sc0Var, bd0Var, ro0Var, z));
    }
}
