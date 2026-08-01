package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0129i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1571a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1572b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1573c;
    public final /* synthetic */ AbstractActivityC0129i d;

    public i(AbstractActivityC0129i abstractActivityC0129i) {
        this.d = abstractActivityC0129i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i1.f.e(runnable, "runnable");
        this.f1572b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        i1.f.d(decorView, "window.decorView");
        if (!this.f1573c) {
            decorView.postOnAnimation(new G0.o(8, this));
        } else if (i1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1572b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1571a) {
                this.f1573c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1572b = null;
        n nVar = (n) this.d.f1588g.a();
        synchronized (nVar.f1600a) {
            z2 = nVar.f1601b;
        }
        if (z2) {
            this.f1573c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
