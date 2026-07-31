package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public final class tl2 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public tl2(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(ab3.a(str, this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tl2.class != obj.getClass()) {
            return false;
        }
        tl2 tl2Var = (tl2) obj;
        return this.a == tl2Var.a && this.b == tl2Var.b && this.c.equals(tl2Var.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((((int) this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }

    public final tl2 a(tl2 tl2Var, String str) {
        String a = ab3.a(str, this.c);
        if (tl2Var != null && a.equals(ab3.a(str, tl2Var.c))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == tl2Var.a) {
                    long j3 = tl2Var.b;
                    return new tl2(a, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = tl2Var.b;
            if (j4 != -1) {
                long j5 = tl2Var.a;
                if (j5 + j4 == this.a) {
                    return new tl2(a, j5, j == -1 ? -1L : j4 + j);
                }
            }
        }
        return null;
    }
}
