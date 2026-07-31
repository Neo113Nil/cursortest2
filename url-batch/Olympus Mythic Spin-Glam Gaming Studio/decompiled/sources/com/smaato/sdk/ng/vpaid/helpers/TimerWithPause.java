package com.smaato.sdk.ng.vpaid.helpers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes12.dex */
public abstract class TimerWithPause {
    private long a;
    private long b;
    private final long c;
    private final long d;
    private long e;

    @SuppressLint({"HandlerLeak"})
    private final Handler g = new a(Looper.myLooper());
    private final boolean f = true;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TimerWithPause.this.a();
        }
    }

    protected TimerWithPause(long j, long j2) {
        this.b = j;
        this.c = j;
        this.d = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        long timeLeft = timeLeft();
        if (timeLeft <= 0) {
            cancel();
            onFinish();
            return;
        }
        if (timeLeft < this.d) {
            Handler handler = this.g;
            handler.sendMessageDelayed(handler.obtainMessage(1), timeLeft);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        onTick(timeLeft);
        long elapsedRealtime2 = this.d - (SystemClock.elapsedRealtime() - elapsedRealtime);
        while (elapsedRealtime2 < 0) {
            elapsedRealtime2 += this.d;
        }
        Handler handler2 = this.g;
        handler2.sendMessageDelayed(handler2.obtainMessage(1), elapsedRealtime2);
    }

    public final void cancel() {
        this.g.removeMessages(1);
    }

    public final synchronized TimerWithPause create() {
        try {
            long j = this.b;
            if (j <= 0) {
                onFinish();
            } else {
                this.e = j;
            }
            if (!this.f) {
                return this;
            }
            resume();
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean hasBeenStarted() {
        return this.e <= this.b;
    }

    public boolean isPaused() {
        return this.e > 0;
    }

    public boolean isRunning() {
        return !isPaused();
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public void pause() {
        if (isRunning()) {
            this.e = timeLeft();
            cancel();
        }
    }

    public void resume() {
        if (isPaused()) {
            this.b = this.e;
            this.a = SystemClock.elapsedRealtime() + this.b;
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(1));
            this.e = 0L;
        }
    }

    public long timeLeft() {
        if (isPaused()) {
            return this.e;
        }
        long elapsedRealtime = this.a - SystemClock.elapsedRealtime();
        if (elapsedRealtime < 0) {
            return 0L;
        }
        return elapsedRealtime;
    }

    public long timePassed() {
        return this.c - timeLeft();
    }

    public long totalCountdown() {
        return this.c;
    }
}
