package yads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public final class hb0 {
    public final String a;
    public final jw0 b;
    public final jw0 c;
    public final int d;
    public final int e;

    public hb0(String str, jw0 jw0Var, jw0 jw0Var2, int i, int i2) {
        if (i != 0 && i2 != 0) {
            throw new IllegalArgumentException();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        jw0Var.getClass();
        this.b = jw0Var;
        jw0Var2.getClass();
        this.c = jw0Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hb0.class != obj.getClass()) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        return this.d == hb0Var.d && this.e == hb0Var.e && this.a.equals(hb0Var.a) && this.b.equals(hb0Var.b) && this.c.equals(hb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + c4.a((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
