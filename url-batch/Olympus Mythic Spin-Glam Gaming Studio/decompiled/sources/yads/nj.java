package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class nj implements nq {
    public static final nj h = new nj(0, 0, 1, 1, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public mj g;

    static {
        new mq() { // from class: yads.nj$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return nj.a(bundle);
            }
        };
    }

    public nj(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public static nj a(Bundle bundle) {
        return new nj(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj.class != obj.getClass()) {
            return false;
        }
        nj njVar = (nj) obj;
        return this.b == njVar.b && this.c == njVar.c && this.d == njVar.d && this.e == njVar.e && this.f == njVar.f;
    }

    public final int hashCode() {
        return ((((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
