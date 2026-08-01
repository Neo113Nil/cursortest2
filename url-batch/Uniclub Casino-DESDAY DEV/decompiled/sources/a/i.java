package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0138i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1047a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1048b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1049c;
    public final /* synthetic */ AbstractActivityC0138i d;

    public i(AbstractActivityC0138i abstractActivityC0138i) {
        this.d = abstractActivityC0138i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X0.d.e(runnable, "runnable");
        this.f1048b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        X0.d.d(decorView, "window.decorView");
        if (!this.f1049c) {
            decorView.postOnAnimation(new D0.p(6, this));
        } else if (X0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1048b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1047a) {
                this.f1049c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1048b = null;
        n nVar = (n) this.d.f1064g.a();
        synchronized (nVar.f1076a) {
            z2 = nVar.f1077b;
        }
        if (z2) {
            this.f1049c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
