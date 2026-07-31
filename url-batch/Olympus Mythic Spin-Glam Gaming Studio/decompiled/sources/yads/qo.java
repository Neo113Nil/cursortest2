package yads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class qo extends fb0 {
    public long i;
    public int j;
    public int k;

    public qo() {
        super(2);
        this.k = 32;
    }

    public final boolean a(fb0 fb0Var) {
        ByteBuffer byteBuffer;
        if (fb0Var.b(1073741824)) {
            throw new IllegalArgumentException();
        }
        if (fb0Var.b(268435456)) {
            throw new IllegalArgumentException();
        }
        if (fb0Var.b(4)) {
            throw new IllegalArgumentException();
        }
        int i = this.j;
        if (i > 0) {
            if (i >= this.k || fb0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = fb0Var.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.j;
        this.j = i2 + 1;
        if (i2 == 0) {
            this.f = fb0Var.f;
            if (fb0Var.b(1)) {
                this.b = 1;
            }
        }
        if (fb0Var.b(Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = fb0Var.d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = fb0Var.f;
        return true;
    }

    @Override // yads.fb0
    public final void b() {
        super.b();
        this.j = 0;
    }
}
