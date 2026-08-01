package androidx.compose.ui.layout;

import defpackage.c40;
import defpackage.jy;
import defpackage.k21;
import defpackage.l21;
import defpackage.m21;
import defpackage.p60;
import defpackage.py;
import defpackage.u50;
import defpackage.ud0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class b {
    public static final p60 a;
    public static final l21[] b;
    public static final p60 c;

    static {
        p60 p60Var = new p60(8);
        l21.a.getClass();
        m21 m21Var = k21.g;
        p60Var.h(1, m21Var);
        m21 m21Var2 = k21.f;
        p60Var.h(2, m21Var2);
        m21 m21Var3 = k21.b;
        p60Var.h(4, m21Var3);
        m21 m21Var4 = k21.d;
        p60Var.h(8, m21Var4);
        m21 m21Var5 = k21.h;
        p60Var.h(16, m21Var5);
        m21 m21Var6 = k21.e;
        p60Var.h(32, m21Var6);
        m21 m21Var7 = k21.i;
        p60Var.h(64, m21Var7);
        a = p60Var;
        b = new l21[]{m21Var, m21Var2, m21Var3, m21Var7, m21Var5, m21Var6, m21Var4, k21.j, k21.c};
        p60 p60Var2 = new p60(7);
        p60Var2.h(1, m21Var);
        p60Var2.h(2, m21Var2);
        p60Var2.h(4, m21Var3);
        p60Var2.h(16, m21Var5);
        p60Var2.h(64, m21Var7);
        p60Var2.h(32, m21Var6);
        p60Var2.h(8, m21Var4);
        c = p60Var2;
    }

    public static final void a(c40 c40Var, jy jyVar, long j, int i, int i2) {
        if (ud0.j(j, -1L)) {
            return;
        }
        c40Var.b(jyVar.b(), (int) ((j >>> 48) & 65535));
        c40Var.b(jyVar.d(), (int) ((j >>> 32) & 65535));
        c40Var.b(jyVar.c(), i - ((int) ((j >>> 16) & 65535)));
        c40Var.b(jyVar.a(), i2 - ((int) (j & 65535)));
    }

    public static final u50 b(py pyVar) {
        return new RulerProviderModifierElement(pyVar);
    }
}
