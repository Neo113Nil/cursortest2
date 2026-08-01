package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class op implements np {
    public final /* synthetic */ int d;
    public final String e;

    public /* synthetic */ op(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.np
    public boolean b(CharSequence charSequence, int i, int i2, yx0 yx0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        yx0Var.c = (yx0Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return "<" + this.e + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.np
    public Object a() {
        return this;
    }
}
