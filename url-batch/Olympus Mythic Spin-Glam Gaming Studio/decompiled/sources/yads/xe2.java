package yads;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class xe2 implements nq {
    public final Object b;
    public final int c;
    public final wl1 d;
    public final Object e;
    public final int f;
    public final long g;
    public final long h;
    public final int i;
    public final int j;

    static {
        new mq() { // from class: yads.xe2$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return xe2.a(bundle);
            }
        };
    }

    public xe2(Object obj, int i, wl1 wl1Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.b = obj;
        this.c = i;
        this.d = wl1Var;
        this.e = obj2;
        this.f = i2;
        this.g = j;
        this.h = j2;
        this.i = i3;
        this.j = i4;
    }

    public static xe2 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        return new xe2(null, i, bundle2 == null ? null : (wl1) wl1.h.a(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xe2.class != obj.getClass()) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        return this.c == xe2Var.c && this.f == xe2Var.f && this.g == xe2Var.g && this.h == xe2Var.h && this.i == xe2Var.i && this.j == xe2Var.j && x92.a(this.b, xe2Var.b) && x92.a(this.e, xe2Var.e) && x92.a(this.d, xe2Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j)});
    }
}
