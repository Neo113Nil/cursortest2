package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r63 extends ul2 {
    public static final mq e = new mq() { // from class: yads.r63$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return r63.b(bundle);
        }
    };
    public final boolean c;
    public final boolean d;

    public r63() {
        this.c = false;
        this.d = false;
    }

    public static r63 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new r63(bundle.getBoolean(Integer.toString(2, 36), false)) : new r63();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r63)) {
            return false;
        }
        r63 r63Var = (r63) obj;
        return this.d == r63Var.d && this.c == r63Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public r63(boolean z) {
        this.c = true;
        this.d = z;
    }
}
