package androidx.compose.foundation.text.modifiers;

import defpackage.a50;
import defpackage.ch0;
import defpackage.ct;
import defpackage.cw0;
import defpackage.dw0;
import defpackage.mz;
import defpackage.nz;
import defpackage.t50;
import defpackage.vd0;
import defpackage.z50;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends z50 {
    public final String a;
    public final dw0 b;
    public final ct c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public TextStringSimpleElement(String str, dw0 dw0Var, ct ctVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dw0Var;
        this.c = ctVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return nz.l(this.a, textStringSimpleElement.a) && nz.l(this.b, textStringSimpleElement.b) && nz.l(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    @Override // defpackage.z50
    public final t50 f() {
        cw0 cw0Var = new cw0();
        cw0Var.r = this.a;
        cw0Var.s = this.b;
        cw0Var.t = this.c;
        cw0Var.u = this.d;
        cw0Var.v = this.e;
        cw0Var.w = this.f;
        cw0Var.x = this.g;
        return cw0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5.a.a(r3.a) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.z50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(t50 t50Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        dw0 dw0Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        ct ctVar;
        ct ctVar2;
        int i5;
        int i6;
        cw0 cw0Var = (cw0) t50Var;
        cw0Var.getClass();
        dw0 dw0Var2 = cw0Var.s;
        boolean z5 = false;
        boolean z6 = true;
        dw0 dw0Var3 = this.b;
        if (dw0Var3 == dw0Var2) {
            dw0Var3.getClass();
        } else if (!dw0Var3.a.b(dw0Var2.a)) {
            z = true;
            str = cw0Var.r;
            str2 = this.a;
            if (nz.l(str, str2)) {
                cw0Var.r = str2;
                cw0Var.B = null;
                z2 = true;
            } else {
                z2 = false;
            }
            dw0Var = cw0Var.s;
            if (dw0Var == dw0Var3) {
                if (nz.l(dw0Var.b, dw0Var3.b)) {
                }
                boolean z7 = !z5;
                cw0Var.s = dw0Var3;
                i = cw0Var.x;
                i2 = this.g;
                if (i != i2) {
                    cw0Var.x = i2;
                    z7 = true;
                }
                i3 = cw0Var.w;
                i4 = this.f;
                if (i3 != i4) {
                    cw0Var.w = i4;
                    z7 = true;
                }
                z3 = cw0Var.v;
                z4 = this.e;
                if (z3 != z4) {
                    cw0Var.v = z4;
                    z7 = true;
                }
                ctVar = cw0Var.t;
                ctVar2 = this.c;
                if (!nz.l(ctVar, ctVar2)) {
                    cw0Var.t = ctVar2;
                    z7 = true;
                }
                i5 = cw0Var.u;
                i6 = this.d;
                if (i5 == i6) {
                    z6 = z7;
                } else {
                    cw0Var.u = i6;
                }
                if (!z2 || z6) {
                    vd0 j0 = cw0Var.j0();
                    String str3 = cw0Var.r;
                    dw0 dw0Var4 = cw0Var.s;
                    ct ctVar3 = cw0Var.t;
                    int i7 = cw0Var.u;
                    boolean z8 = cw0Var.v;
                    int i8 = cw0Var.w;
                    int i9 = cw0Var.x;
                    j0.a = str3;
                    j0.b = dw0Var4;
                    j0.c = ctVar3;
                    j0.d = i7;
                    j0.e = z8;
                    j0.f = i8;
                    j0.g = i9;
                    j0.a();
                }
                if (cw0Var.q) {
                    if (z2 || (z && cw0Var.A != null)) {
                        ch0.h(cw0Var);
                    }
                    if (z2 || z6) {
                        a50.z(cw0Var);
                        mz.H(cw0Var);
                    }
                    if (z) {
                        mz.H(cw0Var);
                        return;
                    }
                    return;
                }
                return;
            }
            dw0Var.getClass();
            z5 = true;
            boolean z72 = !z5;
            cw0Var.s = dw0Var3;
            i = cw0Var.x;
            i2 = this.g;
            if (i != i2) {
            }
            i3 = cw0Var.w;
            i4 = this.f;
            if (i3 != i4) {
            }
            z3 = cw0Var.v;
            z4 = this.e;
            if (z3 != z4) {
            }
            ctVar = cw0Var.t;
            ctVar2 = this.c;
            if (!nz.l(ctVar, ctVar2)) {
            }
            i5 = cw0Var.u;
            i6 = this.d;
            if (i5 == i6) {
            }
            if (!z2) {
            }
            vd0 j02 = cw0Var.j0();
            String str32 = cw0Var.r;
            dw0 dw0Var42 = cw0Var.s;
            ct ctVar32 = cw0Var.t;
            int i72 = cw0Var.u;
            boolean z82 = cw0Var.v;
            int i82 = cw0Var.w;
            int i92 = cw0Var.x;
            j02.a = str32;
            j02.b = dw0Var42;
            j02.c = ctVar32;
            j02.d = i72;
            j02.e = z82;
            j02.f = i82;
            j02.g = i92;
            j02.a();
            if (cw0Var.q) {
            }
        }
        z = false;
        str = cw0Var.r;
        str2 = this.a;
        if (nz.l(str, str2)) {
        }
        dw0Var = cw0Var.s;
        if (dw0Var == dw0Var3) {
        }
        z5 = true;
        boolean z722 = !z5;
        cw0Var.s = dw0Var3;
        i = cw0Var.x;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = cw0Var.w;
        i4 = this.f;
        if (i3 != i4) {
        }
        z3 = cw0Var.v;
        z4 = this.e;
        if (z3 != z4) {
        }
        ctVar = cw0Var.t;
        ctVar2 = this.c;
        if (!nz.l(ctVar, ctVar2)) {
        }
        i5 = cw0Var.u;
        i6 = this.d;
        if (i5 == i6) {
        }
        if (!z2) {
        }
        vd0 j022 = cw0Var.j0();
        String str322 = cw0Var.r;
        dw0 dw0Var422 = cw0Var.s;
        ct ctVar322 = cw0Var.t;
        int i722 = cw0Var.u;
        boolean z822 = cw0Var.v;
        int i822 = cw0Var.w;
        int i922 = cw0Var.x;
        j022.a = str322;
        j022.b = dw0Var422;
        j022.c = ctVar322;
        j022.d = i722;
        j022.e = z822;
        j022.f = i822;
        j022.g = i922;
        j022.a();
        if (cw0Var.q) {
        }
    }

    public final int hashCode() {
        return (((((((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g) * 31;
    }
}
