package com.meta.analytics.dsp.uinode;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0304Av extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C0874Xy A01;

    public C0304Av(C0874Xy c0874Xy, AudioTrack audioTrack) {
        this.A01 = c0874Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                conditionVariable = this.A01.A0f;
                conditionVariable.open();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
