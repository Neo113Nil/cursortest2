package yads;

import java.io.EOFException;

/* loaded from: classes6.dex */
public final class hl0 implements c83 {
    public final byte[] a = new byte[4096];

    @Override // yads.c83
    public final void a(long j, int i, int i2, int i3, b83 b83Var) {
    }

    @Override // yads.c83
    public final void a(jw0 jw0Var) {
    }

    @Override // yads.c83
    public final int a(n30 n30Var, int i, boolean z) {
        int c = n30Var.c(this.a, 0, Math.min(this.a.length, i));
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.c83
    public final void a(int i, xb2 xb2Var) {
        xb2Var.e(xb2Var.b + i);
    }
}
