package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import io.bidmachine.iab.vast.tags.VastTagName;

/* loaded from: classes3.dex */
public final class qi implements vj1 {
    public final i53 a;
    public final i53 b;

    public qi(final int i) {
        i53 i53Var = new i53() { // from class: yads.qi$$ExternalSyntheticLambda0
            @Override // yads.i53
            public final Object get() {
                return qi.a(i);
            }
        };
        i53 i53Var2 = new i53() { // from class: yads.qi$$ExternalSyntheticLambda1
            @Override // yads.i53
            public final Object get() {
                return qi.b(i);
            }
        };
        this.a = i53Var;
        this.b = i53Var2;
    }

    public static HandlerThread b(int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append(VastTagName.VIDEO);
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return new HandlerThread(sb.toString());
    }

    public static HandlerThread a(int i) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append(VastTagName.VIDEO);
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return new HandlerThread(sb.toString());
    }

    @Override // yads.vj1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ri a(uj1 uj1Var) {
        MediaCodec mediaCodec;
        ri riVar;
        String str = uj1Var.a.a;
        ri riVar2 = null;
        try {
            t73.a("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                riVar = new ri(mediaCodec, (HandlerThread) this.a.get(), (HandlerThread) this.b.get());
            } catch (Exception e) {
                e = e;
            }
            try {
                t73.a();
                riVar.a(uj1Var.b, uj1Var.d, uj1Var.e);
                return riVar;
            } catch (Exception e2) {
                e = e2;
                riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}
