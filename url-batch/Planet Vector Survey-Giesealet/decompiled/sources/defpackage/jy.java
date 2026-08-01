package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jy {
    public final /* synthetic */ int a;
    public final nw b;
    public final nw c;
    public final nw d;
    public final nw e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public jy(jy[] jyVarArr) {
        int i = 0;
        this.a = 0;
        this.f = jyVarArr;
        int length = jyVarArr.length;
        nw[] nwVarArr = new nw[length];
        for (int i2 = 0; i2 < length; i2++) {
            nwVarArr[i2] = ((jy[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new nw(new uz0(nwVarArr, i), 1);
        int length2 = ((jy[]) this.f).length;
        nw[] nwVarArr2 = new nw[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            nwVarArr2[i4] = ((jy[]) this.f)[i4].d();
        }
        this.c = new nw(new mw(nwVarArr2, i), 0);
        int length3 = ((jy[]) this.f).length;
        nw[] nwVarArr3 = new nw[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            nwVarArr3[i5] = ((jy[]) this.f)[i5].c();
        }
        this.d = new nw(new uz0(nwVarArr3, i3), 1);
        int length4 = ((jy[]) this.f).length;
        nw[] nwVarArr4 = new nw[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            nwVarArr4[i6] = ((jy[]) this.f)[i6].a();
        }
        this.e = new nw(new mw(nwVarArr4, i3), 0);
    }

    public final nw a() {
        int i = this.a;
        return this.e;
    }

    public final nw b() {
        int i = this.a;
        return this.b;
    }

    public final nw c() {
        int i = this.a;
        return this.d;
    }

    public final nw d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (jy jyVar : (jy[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    ud0.f(sb, jyVar, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public jy(String str) {
        this.a = 1;
        this.f = str;
        this.b = new nw(null, 1);
        this.c = new nw(null, 0);
        this.d = new nw(null, 1);
        this.e = new nw(null, 0);
    }
}
