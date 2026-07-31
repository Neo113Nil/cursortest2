package yads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class uz2 extends pz2 implements d53 {
    public uz2() {
        super(new g53[2], new h53[2]);
        int i = this.g;
        fb0[] fb0VarArr = this.e;
        if (i != fb0VarArr.length) {
            throw new IllegalStateException();
        }
        for (fb0 fb0Var : fb0VarArr) {
            fb0Var.c(1024);
        }
    }

    public abstract c53 a(byte[] bArr, int i, boolean z);

    @Override // yads.pz2
    public final e53 a(fb0 fb0Var, h53 h53Var, boolean z) {
        g53 g53Var = (g53) fb0Var;
        try {
            ByteBuffer byteBuffer = g53Var.d;
            byteBuffer.getClass();
            c53 a = a(byteBuffer.array(), byteBuffer.limit(), z);
            long j = g53Var.f;
            long j2 = g53Var.i;
            h53Var.c = j;
            h53Var.d = a;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            h53Var.e = j;
            h53Var.b &= Integer.MAX_VALUE;
            return null;
        } catch (e53 e) {
            return e;
        }
    }

    @Override // yads.d53
    public final void a(long j) {
    }
}
