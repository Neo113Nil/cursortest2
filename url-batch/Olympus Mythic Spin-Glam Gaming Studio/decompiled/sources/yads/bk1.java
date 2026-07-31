package yads;

import android.media.MediaCodec;

/* loaded from: classes14.dex */
public class bk1 extends db0 {
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bk1(IllegalStateException illegalStateException, ck1 ck1Var) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String str = null;
        sb.append(ck1Var == null ? null : ck1Var.a);
        if (sb3.a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.b = str;
    }
}
