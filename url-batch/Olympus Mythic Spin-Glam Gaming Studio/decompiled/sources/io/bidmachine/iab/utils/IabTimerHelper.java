package io.bidmachine.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class IabTimerHelper {
    private final View a;
    private final TimerHelperCallback b;
    private boolean c = false;
    private float d = 0.0f;
    private long e = 0;
    private long f = 0;
    private final ViewTreeObserver.OnGlobalLayoutListener g;
    private final Runnable h;

    public interface TimerHelperCallback {
        void onTimerFinish();

        void onTimerTick(float f, long j, long j2);
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IabTimerHelper.this.a();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = IabTimerHelper.this.f;
            if (IabTimerHelper.this.a.isShown()) {
                j = Math.min(IabTimerHelper.this.e, j + 16);
                IabTimerHelper.this.a(j);
                IabTimerHelper.this.b.onTimerTick((IabTimerHelper.this.f * 100.0f) / IabTimerHelper.this.e, IabTimerHelper.this.f, IabTimerHelper.this.e);
            }
            if (j >= IabTimerHelper.this.e) {
                IabTimerHelper.this.b.onTimerFinish();
            } else {
                IabTimerHelper.this.a.postDelayed(this, 16L);
            }
        }
    }

    public IabTimerHelper(@NonNull View view, @NonNull TimerHelperCallback timerHelperCallback) {
        a aVar = new a();
        this.g = aVar;
        this.h = new b();
        this.a = view;
        this.b = timerHelperCallback;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        a();
    }

    public void detach() {
        stop();
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this.g);
    }

    public boolean isTicking() {
        long j = this.e;
        return j != 0 && this.f < j;
    }

    public void setTime(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        this.e = (long) (f * 1000.0f);
        start();
    }

    public void start() {
        if (!this.a.isShown() || this.e == 0) {
            return;
        }
        this.a.postDelayed(this.h, 16L);
    }

    public void stop() {
        this.a.removeCallbacks(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean isShown = this.a.isShown();
        if (this.c == isShown) {
            return;
        }
        this.c = isShown;
        if (!isShown) {
            stop();
        } else if (isTicking()) {
            start();
        }
    }
}
