package yads;

import android.text.TextUtils;
import com.ironsource.X3;

/* loaded from: classes14.dex */
public final class sz0 {
    public final String a;
    public final String b;

    public sz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return TextUtils.equals(this.a, sz0Var.a) && TextUtils.equals(this.b, sz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + X3.j.e;
    }
}
