package com.smaato.sdk.ng.vpaid.helpers;

/* loaded from: classes13.dex */
public class SimpleTimer extends CountDownTimer {
    private final Listener h;

    public interface Listener {
        void onFinish();

        void onTick(long j);
    }

    public SimpleTimer(long j, Listener listener) {
        super(j, 60000L);
        this.h = listener;
    }

    @Override // com.smaato.sdk.ng.vpaid.helpers.CountDownTimer
    public void onFinish() {
        Listener listener = this.h;
        if (listener != null) {
            listener.onFinish();
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.helpers.CountDownTimer
    public void onTick(long j) {
        this.h.onTick(j);
    }

    public void pauseTimer() {
        pause();
    }

    public void resumeTimer() {
        resume();
    }

    public SimpleTimer(long j, Listener listener, long j2) {
        super(j, j2);
        this.h = listener;
    }
}
