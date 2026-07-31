package yads;

import android.media.MediaCodec;

/* loaded from: classes14.dex */
public final class fk1 extends Exception {
    public final String b;
    public final boolean c;
    public final ck1 d;
    public final String e;

    public fk1(jw0 jw0Var, lk1 lk1Var, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + jw0Var, lk1Var, jw0Var.m, z, null, "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public fk1(jw0 jw0Var, Exception exc, boolean z, ck1 ck1Var) {
        this("Decoder init failed: " + ck1Var.a + ", " + jw0Var, exc, jw0Var.m, z, ck1Var, (sb3.a < 21 || !(exc instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) exc).getDiagnosticInfo());
    }

    public fk1(String str, Throwable th, String str2, boolean z, ck1 ck1Var, String str3) {
        super(str, th);
        this.b = str2;
        this.c = z;
        this.d = ck1Var;
        this.e = str3;
    }
}
