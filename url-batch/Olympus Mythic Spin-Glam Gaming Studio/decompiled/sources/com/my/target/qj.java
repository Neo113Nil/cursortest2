package com.my.target;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public abstract class qj {
    private final boolean a;
    private final List b;
    private final List c;
    private final z4 d;
    private long e;
    private final long f;
    private final Runnable g = new Runnable() { // from class: com.my.target.qj$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            qj.this.d();
        }
    };
    private final Runnable h = new Runnable() { // from class: com.my.target.qj$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            qj.this.c();
        }
    };
    private final ViewTreeObserver.OnScrollChangedListener i = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.my.target.qj$$ExternalSyntheticLambda2
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            qj.this.a();
        }
    };
    private WeakReference k = new WeakReference(null);
    private float l = -1.0f;
    private WeakReference m = new WeakReference(null);
    private float n = -1.0f;
    private boolean o = false;
    private final View.OnAttachStateChangeListener j = new a();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (qj.this.o) {
                view.getViewTreeObserver().addOnScrollChangedListener(qj.this.i);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnScrollChangedListener(qj.this.i);
        }
    }

    protected qj(boolean z, long j, List list, List list2, z4 z4Var) {
        this.a = z;
        this.f = j;
        this.b = list;
        this.c = list2;
        this.d = z4Var;
    }

    private int b(long j) {
        a(this.b, j, a(this.k, this.l));
        if (this.m.get() != null) {
            a(this.c, j, a(this.m, this.n));
        }
        return (this.b.isEmpty() && this.c.isEmpty()) ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b(SystemClock.elapsedRealtime());
    }

    public void a(View view, View view2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o) {
            mi.c("ViewabilityTrackerV2: ", "second startTracking, restart tracking");
            e();
        }
        if (this.b.isEmpty() && this.c.isEmpty()) {
            return;
        }
        if (this.a) {
            view.addOnAttachStateChangeListener(this.j);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnScrollChangedListener(this.i);
            }
        }
        this.k = new WeakReference(view);
        a(this.b);
        if (view2 != null && !this.c.isEmpty()) {
            this.m = new WeakReference(view2);
            a(this.c);
        }
        this.e = elapsedRealtime;
        this.o = true;
        if (b(elapsedRealtime) == 1) {
            a(elapsedRealtime);
        } else {
            e();
        }
    }

    protected void d() {
        if (this.o) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(elapsedRealtime) == 1) {
                a(elapsedRealtime);
            } else {
                e();
            }
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o) {
            b(elapsedRealtime);
            this.o = false;
            Handler handler = o0.g;
            handler.removeCallbacks(this.g);
            handler.removeCallbacks(this.h);
            View view = (View) this.k.get();
            if (view != null && this.a) {
                view.removeOnAttachStateChangeListener(this.j);
                if (view.isAttachedToWindow()) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(this.i);
                }
            }
            this.l = -1.0f;
            this.k.clear();
            this.n = -1.0f;
            this.m.clear();
        }
    }

    private void b() {
        Handler handler = o0.g;
        handler.removeCallbacks(this.h);
        handler.postDelayed(this.h, 2L);
    }

    private float a(WeakReference weakReference, float f) {
        View view = (View) weakReference.get();
        if (view == null) {
            return 0.0f;
        }
        return f != -1.0f ? f : ((Float) this.d.apply(view)).floatValue();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sj) it.next()).a();
        }
    }

    private void a(List list, long j, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((sj) it.next()).a(j, f) == 2) {
                it.remove();
            }
        }
    }

    private void a(long j) {
        if (this.b.isEmpty() && this.c.isEmpty()) {
            e();
            return;
        }
        long j2 = this.e + this.f;
        this.e = j2;
        long max = Math.max(5L, j2 - j);
        Handler handler = o0.g;
        handler.removeCallbacks(this.g);
        handler.postDelayed(this.g, max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        View view = (View) this.k.get();
        if (view != null) {
            float floatValue = ((Float) this.d.apply(view)).floatValue();
            this.l = floatValue;
            if (v4.a(floatValue, 0.0f) == 0) {
                this.l = -1.0f;
            }
        }
        View view2 = (View) this.m.get();
        if (view2 != null) {
            float floatValue2 = ((Float) this.d.apply(view2)).floatValue();
            this.n = floatValue2;
            if (v4.a(floatValue2, 0.0f) == 0) {
                this.n = -1.0f;
            }
        }
        if (view != null) {
            b();
        }
    }
}
