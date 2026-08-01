package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hy extends h40 {
    @Override // defpackage.f40
    public final int R(lw lwVar) {
        m40 m40Var = this.r.r.G.p;
        m40Var.getClass();
        s10 s10Var = m40Var.i;
        m10 m10Var = s10Var.c;
        q10 q10Var = m40Var.t;
        if (m10Var == m10.e) {
            q10Var.d = true;
            if (q10Var.b) {
                s10Var.e = true;
                s10Var.f = true;
            }
        } else {
            q10Var.e = true;
        }
        hy hyVar = m40Var.l().R;
        if (hyVar != null) {
            hyVar.n = true;
        }
        m40Var.n();
        hy hyVar2 = m40Var.l().R;
        if (hyVar2 != null) {
            hyVar2.n = false;
        }
        Integer num = (Integer) q10Var.g.get(lwVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.w.h(intValue, lwVar);
        return intValue;
    }

    @Override // defpackage.b50
    public final yf0 d(long j) {
        List f;
        O(j);
        ea0 ea0Var = this.r;
        l70 s = ea0Var.r.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            m40 m40Var = ((p10) objArr[i2]).G.p;
            m40Var.getClass();
            m40Var.m = n10.f;
        }
        p10 p10Var = ea0Var.r;
        g50 g50Var = p10Var.x;
        m40 m40Var2 = p10Var.G.p;
        m40Var2.getClass();
        l70 l70Var = m40Var2.u;
        s10 s10Var = m40Var2.i;
        s10Var.a.i();
        if (m40Var2.v) {
            p10 p10Var2 = s10Var.a;
            l70 s2 = p10Var2.s();
            Object[] objArr2 = s2.d;
            int i3 = s2.f;
            for (int i4 = 0; i4 < i3; i4++) {
                p10 p10Var3 = (p10) objArr2[i4];
                if (l70Var.f <= i4) {
                    m40 m40Var3 = p10Var3.G.p;
                    m40Var3.getClass();
                    l70Var.b(m40Var3);
                } else {
                    m40 m40Var4 = p10Var3.G.p;
                    m40Var4.getClass();
                    Object[] objArr3 = l70Var.d;
                    Object obj = objArr3[i4];
                    objArr3[i4] = m40Var4;
                }
            }
            l70Var.k(((i70) p10Var2.i()).d.f, l70Var.f);
            m40Var2.v = false;
            f = l70Var.f();
        } else {
            f = l70Var.f();
        }
        h40.k0(this, g50Var.f(this, f, j));
        return this;
    }

    @Override // defpackage.h40
    public final void l0() {
        m40 m40Var = this.r.r.G.p;
        m40Var.getClass();
        m40Var.T();
    }
}
