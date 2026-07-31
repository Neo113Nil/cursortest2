package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes11.dex */
public class im1 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public im1(im1 im1Var) {
        this.a = im1Var.a;
        this.b = im1Var.b;
        this.c = im1Var.c;
        this.d = im1Var.d;
        this.e = im1Var.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im1)) {
            return false;
        }
        im1 im1Var = (im1) obj;
        return this.a.equals(im1Var.a) && this.b == im1Var.b && this.c == im1Var.c && this.d == im1Var.d && this.e == im1Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public im1(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
