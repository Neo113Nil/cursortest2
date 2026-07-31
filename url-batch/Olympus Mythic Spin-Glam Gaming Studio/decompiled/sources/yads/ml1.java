package yads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public abstract class ml1 implements nq {
    public static final mq g = new mq() { // from class: yads.ml1$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return ml1.a(bundle);
        }
    };
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ml1(ll1 ll1Var) {
        this.b = ll1Var.a;
        this.c = ll1Var.b;
        this.d = ll1Var.c;
        this.e = ll1Var.d;
        this.f = ll1Var.e;
    }

    public static nl1 a(Bundle bundle) {
        ll1 ll1Var = new ll1();
        long j = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        ll1Var.a = j;
        long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE && j2 < 0) {
            throw new IllegalArgumentException();
        }
        ll1Var.b = j2;
        ll1Var.c = bundle.getBoolean(Integer.toString(2, 36), false);
        ll1Var.d = bundle.getBoolean(Integer.toString(3, 36), false);
        ll1Var.e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new nl1(ll1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1Var = (ml1) obj;
        return this.b == ml1Var.b && this.c == ml1Var.c && this.d == ml1Var.d && this.e == ml1Var.e && this.f == ml1Var.f;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
