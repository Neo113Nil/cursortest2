package yads;

import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public abstract class sz2 {
    public final ht1 a(jt1 jt1Var) {
        ByteBuffer byteBuffer = jt1Var.d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (jt1Var.b(Integer.MIN_VALUE)) {
            return null;
        }
        return a(jt1Var, byteBuffer);
    }

    public abstract ht1 a(jt1 jt1Var, ByteBuffer byteBuffer);
}
