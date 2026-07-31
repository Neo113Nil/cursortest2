package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒉ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class ChoreographerFrameCallbackC0805 implements Choreographer.FrameCallback {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0796 f1989;

    public ChoreographerFrameCallbackC0805(C0796 c0796) {
        this.f1989 = c0796;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        try {
            AbstractC1026.m4316(this.f1989);
        } catch (Throwable th) {
            String decrypt = StringFog.decrypt("PpqIIS5oA+8GrZ0f\n", "f/7ZVE8Eaps=\n");
            AbstractC0580.m4080(decrypt, decrypt, StringFog.decrypt("Y3PbBCu/hUdqVMAJIL4=\n", "BRKyaE7bpSM=\n"), th, null, false);
        }
    }
}
