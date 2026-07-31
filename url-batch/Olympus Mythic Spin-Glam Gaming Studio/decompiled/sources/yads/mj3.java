package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class mj3 implements nq {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
        new mq() { // from class: yads.mj3$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return mj3.a(bundle);
            }
        };
    }

    public mj3(int i, int i2, int i3, float f) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static mj3 a(Bundle bundle) {
        return new mj3(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj3)) {
            return false;
        }
        mj3 mj3Var = (mj3) obj;
        return this.b == mj3Var.b && this.c == mj3Var.c && this.d == mj3Var.d && this.e == mj3Var.e;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.e) + ((((((this.b + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.c) * 31) + this.d) * 31);
    }
}
