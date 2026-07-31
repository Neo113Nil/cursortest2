package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class d93 implements nq {
    public static final mq g = new mq() { // from class: yads.d93$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return d93.a(bundle);
        }
    };
    public final int b;
    public final x73 c;
    public final boolean d;
    public final int[] e;
    public final boolean[] f;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0 > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d93(x73 x73Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = x73Var.b;
        this.b = i;
        if (i != iArr.length || i != zArr.length) {
            throw new IllegalArgumentException();
        }
        this.c = x73Var;
        boolean z2 = z;
        this.d = z2;
        this.e = (int[]) iArr.clone();
        this.f = (boolean[]) zArr.clone();
    }

    public static d93 a(Bundle bundle) {
        mq mqVar = x73.g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        x73 x73Var = (x73) mqVar.a(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[x73Var.b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[x73Var.b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new d93(x73Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d93.class != obj.getClass()) {
            return false;
        }
        d93 d93Var = (d93) obj;
        return this.d == d93Var.d && this.c.equals(d93Var.c) && Arrays.equals(this.e, d93Var.e) && Arrays.equals(this.f, d93Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (((this.c.hashCode() * 31) + (this.d ? 1 : 0)) * 31)) * 31);
    }
}
