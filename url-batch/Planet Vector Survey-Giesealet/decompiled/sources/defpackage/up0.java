package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class up0 {
    public final p10 a;
    public final zp b;
    public final zy c;
    public final x60 d = new x60(2);

    public up0(p10 p10Var, zp zpVar, p60 p60Var) {
        this.a = p10Var;
        this.b = zpVar;
        this.c = p60Var;
    }

    public final rp0 a() {
        return new rp0(this.b, false, this.a, new np0());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(p10 p10Var, np0 np0Var) {
        String str;
        boolean z;
        boolean z2;
        AutofillValue forText;
        x60 x60Var = this.d;
        Object[] objArr = x60Var.a;
        int i = x60Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m2 m2Var = (m2) objArr[i2];
            f3 f3Var = m2Var.c;
            p01 p01Var = m2Var.a;
            np0 p = p10Var.p();
            int i3 = p10Var.e;
            String str2 = null;
            if (np0Var != null) {
                Object g = np0Var.d.g(vp0.C);
                if (g == null) {
                    g = null;
                }
                l7 l7Var = (l7) g;
                if (l7Var != null) {
                    str = l7Var.e;
                    if (p != null) {
                        Object g2 = p.d.g(vp0.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        l7 l7Var2 = (l7) g2;
                        if (l7Var2 != null) {
                            str2 = l7Var2.e;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            p01Var.p(f3Var, i3, true);
                        } else if (str2 == null) {
                            p01Var.p(f3Var, i3, false);
                        } else if (nz.l((f4) rg0.m(p, vp0.r), b2.s)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) p01Var.e).notifyValueChanged(f3Var, i3, forText);
                        }
                    }
                    z = np0Var == null && np0Var.d.b(vp0.q);
                    z2 = p == null && p.d.b(vp0.q);
                    if (z == z2) {
                        q60 q60Var = m2Var.g;
                        if (z2) {
                            q60Var.a(i3);
                        } else {
                            q60Var.e(i3);
                        }
                    }
                }
            }
            str = null;
            if (p != null) {
            }
            if (str != str2) {
            }
            if (np0Var == null) {
            }
            if (p == null) {
            }
            if (z == z2) {
            }
        }
    }
}
