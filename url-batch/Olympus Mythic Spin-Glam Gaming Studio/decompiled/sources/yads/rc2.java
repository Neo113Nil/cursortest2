package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class rc2 extends ul2 {
    public static final mq d = new mq() { // from class: yads.rc2$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return rc2.b(bundle);
        }
    };
    public final float c;

    public rc2() {
        this.c = -1.0f;
    }

    public static rc2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new rc2() : new rc2(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rc2) && this.c == ((rc2) obj).c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public rc2(float f) {
        oh.a("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.c = f;
    }
}
