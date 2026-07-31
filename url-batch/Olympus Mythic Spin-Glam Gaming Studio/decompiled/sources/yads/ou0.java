package yads;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class ou0 extends mp {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ou0(final xu0 xu0Var, int i, long j, long j2) {
        super(r1, r2, r3, r5, j, j2, r7 + r9, Math.max(6, xu0Var.c));
        long j3;
        long j4;
        Objects.requireNonNull(xu0Var);
        jp jpVar = new jp() { // from class: yads.ou0$$ExternalSyntheticLambda0
            @Override // yads.jp
            public final long a(long j5) {
                return xu0.this.a(j5);
            }
        };
        nu0 nu0Var = new nu0(xu0Var, i);
        long j5 = xu0Var.j;
        long j6 = j5 == 0 ? -9223372036854775807L : (1000000 * j5) / xu0Var.e;
        int i2 = xu0Var.d;
        if (i2 > 0) {
            j3 = (i2 + xu0Var.c) / 2;
            j4 = 1;
        } else {
            int i3 = xu0Var.a;
            j3 = ((((i3 != xu0Var.b || i3 <= 0) ? 4096L : i3) * xu0Var.g) * xu0Var.h) / 8;
            j4 = 64;
        }
    }
}
