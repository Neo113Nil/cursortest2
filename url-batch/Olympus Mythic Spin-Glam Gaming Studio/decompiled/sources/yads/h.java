package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class h implements Iterator {
    public int b = 2;
    public String c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int a = pg0.a(i);
        if (a == 0) {
            return true;
        }
        if (a == 2) {
            return false;
        }
        this.b = 4;
        f33 f33Var = (f33) this;
        int i2 = f33Var.f;
        while (true) {
            int i3 = f33Var.f;
            if (i3 == -1) {
                f33Var.b = 3;
                str = null;
                break;
            }
            xt xtVar = f33Var.h.a;
            CharSequence charSequence = f33Var.d;
            int length = charSequence.length();
            hg2.b(i3, length);
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (xtVar.a(charSequence.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = f33Var.d.length();
                f33Var.f = -1;
            } else {
                f33Var.f = i3 + 1;
            }
            int i4 = f33Var.f;
            if (i4 == i2) {
                int i5 = i4 + 1;
                f33Var.f = i5;
                if (i5 > f33Var.d.length()) {
                    f33Var.f = -1;
                }
            } else {
                if (i2 < i3) {
                    yt ytVar = f33Var.e;
                    f33Var.d.charAt(i2);
                    ytVar.getClass();
                }
                if (i3 > i2) {
                    yt ytVar2 = f33Var.e;
                    f33Var.d.charAt(i3 - 1);
                    ytVar2.getClass();
                }
                int i6 = f33Var.g;
                if (i6 == 1) {
                    i3 = f33Var.d.length();
                    f33Var.f = -1;
                    if (i3 > i2) {
                        yt ytVar3 = f33Var.e;
                        f33Var.d.charAt(i3 - 1);
                        ytVar3.getClass();
                    }
                } else {
                    f33Var.g = i6 - 1;
                }
                str = f33Var.d.subSequence(i2, i3).toString();
            }
        }
        this.c = str;
        if (this.b == 3) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        String str = this.c;
        this.c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
