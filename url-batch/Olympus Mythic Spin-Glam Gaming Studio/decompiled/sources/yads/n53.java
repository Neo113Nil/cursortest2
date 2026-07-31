package yads;

import android.media.MediaCodec;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class n53 implements vj1 {
    public static MediaCodec b(uj1 uj1Var) {
        uj1Var.a.getClass();
        String str = uj1Var.a.a;
        t73.a("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        t73.a();
        return createByCodecName;
    }

    @Override // yads.vj1
    public final xj1 a(uj1 uj1Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = b(uj1Var);
            t73.a("configureCodec");
            mediaCodec.configure(uj1Var.b, uj1Var.d, uj1Var.e, 0);
            t73.a();
            t73.a("startCodec");
            mediaCodec.start();
            t73.a();
            return new o53(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
