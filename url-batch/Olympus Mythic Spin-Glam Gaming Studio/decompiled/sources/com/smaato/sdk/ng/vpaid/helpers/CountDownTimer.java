package com.smaato.sdk.ng.vpaid.helpers;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public abstract class CountDownTimer {
    private final long a;
    private final long b;
    private long c;
    private long d;
    private boolean e = false;
    private boolean f = false;
    private Handler g = new a();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (CountDownTimer.this) {
                try {
                    CountDownTimer countDownTimer = CountDownTimer.this;
                    if (!countDownTimer.f) {
                        long elapsedRealtime = countDownTimer.c - SystemClock.elapsedRealtime();
                        if (elapsedRealtime <= 0) {
                            CountDownTimer.this.onFinish();
                        } else if (elapsedRealtime < CountDownTimer.this.b) {
                            sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                        } else {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            CountDownTimer.this.onTick(elapsedRealtime);
                            long elapsedRealtime3 = (elapsedRealtime2 + CountDownTimer.this.b) - SystemClock.elapsedRealtime();
                            while (elapsedRealtime3 < 0) {
                                elapsedRealtime3 += CountDownTimer.this.b;
                            }
                            if (!CountDownTimer.this.e) {
                                sendMessageDelayed(obtainMessage(1), elapsedRealtime3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected CountDownTimer(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void cancel() {
        this.g.removeMessages(1);
        this.e = true;
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public long pause() {
        if (!this.f) {
            this.d = this.c - SystemClock.elapsedRealtime();
            this.f = true;
        }
        return this.d;
    }

    public long resume() {
        if (this.f) {
            this.c = this.d + SystemClock.elapsedRealtime();
            this.f = false;
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(1));
        }
        return this.d;
    }

    public final synchronized CountDownTimer start() {
        if (this.a <= 0) {
            onFinish();
            return this;
        }
        this.c = SystemClock.elapsedRealtime() + this.a;
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(1));
        this.e = false;
        this.f = false;
        return this;
    }
}
