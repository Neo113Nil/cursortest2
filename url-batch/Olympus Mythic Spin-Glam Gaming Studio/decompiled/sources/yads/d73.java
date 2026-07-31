package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class d73 implements nq {
    public static final mq i = new mq() { // from class: yads.d73$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return d73.a(bundle);
        }
    };
    public Object b;
    public Object c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public p5 h = p5.g;

    public final d73 a(Object obj, Object obj2, int i2, long j, long j2, p5 p5Var, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = p5Var;
        this.g = z;
        return this;
    }

    public final int b(long j) {
        p5 p5Var = this.h;
        long j2 = this.e;
        int i2 = p5Var.b - 1;
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            long j3 = p5Var.a(i2).b;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            o5 a = p5Var.a(i2);
            if (a.c == -1) {
                return i2;
            }
            for (int i3 = 0; i3 < a.c; i3++) {
                int i4 = a.e[i3];
                if (i4 == 0 || i4 == 1) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d73.class.equals(obj.getClass())) {
            return false;
        }
        d73 d73Var = (d73) obj;
        return sb3.a(this.b, d73Var.b) && sb3.a(this.c, d73Var.c) && this.d == d73Var.d && this.e == d73Var.e && this.f == d73Var.f && this.g == d73Var.g && sb3.a(this.h, d73Var.h);
    }

    public final int hashCode() {
        Object obj = this.b;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
        Object obj2 = this.c;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.d) * 31;
        long j = this.e;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        return this.h.hashCode() + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31);
    }

    public final int a(int i2) {
        return this.h.a(i2).a(-1);
    }

    public final int a(long j) {
        p5 p5Var = this.h;
        long j2 = this.e;
        p5Var.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i2 = p5Var.e;
        while (i2 < p5Var.b) {
            if (p5Var.a(i2).b == Long.MIN_VALUE || p5Var.a(i2).b > j) {
                o5 a = p5Var.a(i2);
                if (a.c == -1 || a.a(-1) < a.c) {
                    break;
                }
            }
            i2++;
        }
        if (i2 < p5Var.b) {
            return i2;
        }
        return -1;
    }

    public final long a(int i2, int i3) {
        o5 a = this.h.a(i2);
        if (a.c != -1) {
            return a.f[i3];
        }
        return -9223372036854775807L;
    }

    public static d73 a(Bundle bundle) {
        p5 p5Var;
        int i2 = bundle.getInt(Integer.toString(0, 36), 0);
        long j = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        if (bundle2 != null) {
            p5Var = (p5) p5.i.a(bundle2);
        } else {
            p5Var = p5.g;
        }
        p5 p5Var2 = p5Var;
        d73 d73Var = new d73();
        d73Var.a(null, null, i2, j, j2, p5Var2, z);
        return d73Var;
    }
}
