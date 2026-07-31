package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class v33 extends ul2 {
    public static final mq e = new mq() { // from class: yads.v33$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return v33.b(bundle);
        }
    };
    public final int c;
    public final float d;

    public v33(int i) {
        oh.a("maxStars must be a positive integer", i > 0);
        this.c = i;
        this.d = -1.0f;
    }

    public static v33 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new v33(i) : new v33(i, f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33Var = (v33) obj;
        return this.c == v33Var.c && this.d == v33Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    public v33(int i, float f) {
        boolean z = false;
        oh.a("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        oh.a("starRating is out of range [0, maxStars]", z);
        this.c = i;
        this.d = f;
    }
}
