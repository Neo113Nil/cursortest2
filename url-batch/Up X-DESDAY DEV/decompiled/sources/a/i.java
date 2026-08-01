package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0126i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1045a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1046b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1047c;
    public final /* synthetic */ AbstractActivityC0126i d;

    public i(AbstractActivityC0126i abstractActivityC0126i) {
        this.d = abstractActivityC0126i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.e.e(runnable, "runnable");
        this.f1046b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        X0.e.d(decorView, "window.decorView");
        if (!this.f1047c) {
            decorView.postOnAnimation(new B0.q(7, this));
        } else if (X0.e.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1046b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1045a) {
                this.f1047c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1046b = null;
        n nVar = (n) this.d.f1062g.a();
        synchronized (nVar.f1074a) {
            z2 = nVar.f1075b;
        }
        if (z2) {
            this.f1047c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
