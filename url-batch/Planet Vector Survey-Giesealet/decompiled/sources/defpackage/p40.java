package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p40 extends r40 implements Iterator, j00 {
    public final /* synthetic */ int h;

    public p40(s40 s40Var, int i) {
        this.h = i;
        s40Var.getClass();
        this.g = s40Var;
        this.e = -1;
        this.f = s40Var.k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                b();
                int i = this.d;
                s40 s40Var = (s40) this.g;
                if (i >= s40Var.i) {
                    g8.k();
                    break;
                } else {
                    this.d = i + 1;
                    this.e = i;
                    q40 q40Var = new q40(s40Var, i);
                    c();
                    break;
                }
            case 1:
                b();
                int i2 = this.d;
                s40 s40Var2 = (s40) this.g;
                if (i2 >= s40Var2.i) {
                    g8.k();
                    break;
                } else {
                    this.d = i2 + 1;
                    this.e = i2;
                    Object obj = s40Var2.d[i2];
                    c();
                    break;
                }
            default:
                b();
                int i3 = this.d;
                s40 s40Var3 = (s40) this.g;
                if (i3 >= s40Var3.i) {
                    g8.k();
                    break;
                } else {
                    this.d = i3 + 1;
                    this.e = i3;
                    Object[] objArr = s40Var3.e;
                    objArr.getClass();
                    Object obj2 = objArr[this.e];
                    c();
                    break;
                }
        }
        return null;
    }
}
