package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class if0 implements nq {
    public static final mq e = new mq() { // from class: yads.if0$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return if0.a(bundle);
        }
    };
    public final int b;
    public final int[] c;
    public final int d;

    public if0(int i, int i2, int[] iArr) {
        this.b = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.c = copyOf;
        this.d = i2;
        Arrays.sort(copyOf);
    }

    public static if0 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new if0(i, i2, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || if0.class != obj.getClass()) {
            return false;
        }
        if0 if0Var = (if0) obj;
        return this.b == if0Var.b && Arrays.equals(this.c, if0Var.c) && this.d == if0Var.d;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.c) + (this.b * 31)) * 31) + this.d;
    }
}
