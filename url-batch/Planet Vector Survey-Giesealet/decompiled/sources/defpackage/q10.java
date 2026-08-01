package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q10 {
    public final g2 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public g2 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    public q10(g2 g2Var, int i) {
        this.h = i;
        this.a = g2Var;
    }

    public static final void a(q10 q10Var, lw lwVar, int i, ea0 ea0Var) {
        HashMap hashMap = q10Var.g;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (q10Var.h) {
                    case 0:
                        wk0 wk0Var = ea0.M;
                        j = ea0Var.Q0(j);
                        break;
                    default:
                        h40 t0 = ea0Var.t0();
                        t0.getClass();
                        long j2 = t0.s;
                        j = ra0.h((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                ea0Var = ea0Var.t;
                ea0Var.getClass();
                if (ea0Var.equals(q10Var.a.l())) {
                    int round = Math.round(lwVar instanceof lw ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(lwVar)) {
                        hashMap.getClass();
                        Object obj = hashMap.get(lwVar);
                        if (obj == null && !hashMap.containsKey(lwVar)) {
                            throw new NoSuchElementException("Key " + lwVar + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        lw lwVar2 = e2.a;
                        round = ((Number) lwVar.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(lwVar, Integer.valueOf(round));
                    return;
                }
            } while (!q10Var.b(ea0Var).containsKey(lwVar));
            float c = q10Var.c(ea0Var, lwVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(ea0 ea0Var) {
        switch (this.h) {
            case 0:
                return ea0Var.a0().a();
            default:
                h40 t0 = ea0Var.t0();
                t0.getClass();
                return t0.a0().a();
        }
    }

    public final int c(ea0 ea0Var, lw lwVar) {
        switch (this.h) {
            case 0:
                return ea0Var.V(lwVar);
            default:
                h40 t0 = ea0Var.t0();
                t0.getClass();
                return t0.V(lwVar);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    public final void f() {
        this.b = true;
        g2 g2Var = this.a;
        g2 m = g2Var.m();
        if (m == null) {
            return;
        }
        if (this.c) {
            m.requestLayout();
        }
        if (this.d) {
            g2Var.C();
        }
        if (this.e) {
            g2Var.requestLayout();
        }
        m.B().f();
    }

    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        f2 f2Var = new f2(0, this);
        g2 g2Var = this.a;
        g2Var.i(f2Var);
        hashMap.putAll(b(g2Var.l()));
        this.b = false;
    }

    public final void h() {
        q10 B;
        q10 B2;
        boolean d = d();
        g2 g2Var = this.a;
        if (!d) {
            g2 m = g2Var.m();
            if (m == null) {
                return;
            }
            g2Var = m.B().f;
            if (g2Var == null || !g2Var.B().d()) {
                g2 g2Var2 = this.f;
                if (g2Var2 == null || g2Var2.B().d()) {
                    return;
                }
                g2 m2 = g2Var2.m();
                if (m2 != null && (B2 = m2.B()) != null) {
                    B2.h();
                }
                g2 m3 = g2Var2.m();
                g2Var = (m3 == null || (B = m3.B()) == null) ? null : B.f;
            }
        }
        this.f = g2Var;
    }
}
