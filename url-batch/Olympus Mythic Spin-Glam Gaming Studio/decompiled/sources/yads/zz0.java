package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class zz0 extends ul2 {
    public static final mq e = new mq() { // from class: yads.zz0$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return zz0.b(bundle);
        }
    };
    public final boolean c;
    public final boolean d;

    public zz0() {
        this.c = false;
        this.d = false;
    }

    public static zz0 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new zz0(bundle.getBoolean(Integer.toString(2, 36), false)) : new zz0();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zz0)) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return this.d == zz0Var.d && this.c == zz0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public zz0(boolean z) {
        this.c = true;
        this.d = z;
    }
}
