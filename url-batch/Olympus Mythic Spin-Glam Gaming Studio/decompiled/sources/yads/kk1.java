package yads;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public final class kk1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public kk1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != kk1.class) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return TextUtils.equals(this.a, kk1Var.a) && this.b == kk1Var.b && this.c == kk1Var.c;
    }

    public final int hashCode() {
        return ((c4.a(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
