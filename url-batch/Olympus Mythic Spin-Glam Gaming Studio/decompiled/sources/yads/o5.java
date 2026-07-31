package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o5 implements nq {
    public static final mq i = new mq() { // from class: yads.o5$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return o5.a(bundle);
        }
    };
    public final long b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    public o5(long j, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        if (iArr.length != uriArr.length) {
            throw new IllegalArgumentException();
        }
        this.b = j;
        this.c = i2;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.g = j2;
        this.h = z;
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.b == o5Var.b && this.c == o5Var.c && Arrays.equals(this.d, o5Var.d) && Arrays.equals(this.e, o5Var.e) && Arrays.equals(this.f, o5Var.f) && this.g == o5Var.g && this.h == o5Var.h;
    }

    public final int hashCode() {
        int i2 = this.c * 31;
        long j = this.b;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j2 = this.g;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.h ? 1 : 0);
    }

    public final o5 a() {
        int[] iArr = this.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new o5(this.b, 0, copyOf, (Uri[]) Arrays.copyOf(this.d, 0), copyOf2, this.g, this.h);
    }

    public static o5 a(Bundle bundle) {
        long j = bundle.getLong(Integer.toString(0, 36));
        int i2 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        return new o5(j, i2, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
    }
}
