package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zm0 extends sz2 {
    @Override // yads.sz2
    public final ht1 a(jt1 jt1Var, ByteBuffer byteBuffer) {
        xb2 xb2Var = new xb2(byteBuffer.array(), byteBuffer.limit());
        String h = xb2Var.h();
        h.getClass();
        String h2 = xb2Var.h();
        h2.getClass();
        return new ht1(new ym0(h, h2, xb2Var.g(), xb2Var.g(), Arrays.copyOfRange(xb2Var.a, xb2Var.b, xb2Var.c)));
    }
}
