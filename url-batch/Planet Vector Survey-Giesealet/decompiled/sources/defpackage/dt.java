package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dt implements ct {
    public final b2 a;
    public final u4 b;
    public final j3 c;
    public final ht d;
    public final p01 e;

    public dt(b2 b2Var, u4 u4Var) {
        j3 j3Var = et.a;
        ht htVar = new ht();
        gt gtVar = ht.a;
        cw cwVar = um.a;
        gtVar.getClass();
        x40.d(nz.Q(gtVar, cwVar).i(up.d).i(new xt0(null)));
        p01 p01Var = new p01(12);
        this.a = b2Var;
        this.b = u4Var;
        this.c = j3Var;
        this.d = htVar;
        this.e = p01Var;
        new h(2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #2 {Exception -> 0x0081, blocks: (B:15:0x0027, B:17:0x003a, B:20:0x003f, B:22:0x0043, B:23:0x0050, B:39:0x0079, B:40:0x0080, B:43:0x004c), top: B:14:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final by0 a(ay0 ay0Var) {
        Typeface a;
        by0 by0Var;
        j3 j3Var = this.c;
        synchronized (((pg0) j3Var.e)) {
            by0 by0Var2 = (by0) ((n40) j3Var.f).a(ay0Var);
            if (by0Var2 != null) {
                if (by0Var2.e) {
                    return by0Var2;
                }
            }
            try {
                this.d.getClass();
                qu0 qu0Var = ay0Var.a;
                og0 og0Var = (og0) this.e.e;
                int i = ay0Var.c;
                ut utVar = ay0Var.b;
                if (qu0Var != null && !(qu0Var instanceof yk)) {
                    if (qu0Var instanceof ev) {
                        a = og0Var.c((ev) qu0Var, utVar, i);
                        by0Var = new by0(a);
                        if (by0Var == null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((pg0) j3Var.e)) {
                            if (((n40) j3Var.f).a(ay0Var) == null && by0Var.e) {
                                ((n40) j3Var.f).b(ay0Var, by0Var);
                            }
                        }
                        return by0Var;
                    }
                    by0Var = null;
                    if (by0Var == null) {
                    }
                }
                a = og0Var.a(utVar, i);
                by0Var = new by0(a);
                if (by0Var == null) {
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final by0 b(qu0 qu0Var, ut utVar, int i, int i2) {
        u4 u4Var = this.b;
        u4Var.getClass();
        int i3 = u4Var.a;
        ut utVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? utVar : new ut(rg0.g(utVar.d + i3, 1, 1000));
        this.a.getClass();
        return a(new ay0(qu0Var, utVar2, i, i2, null));
    }
}
