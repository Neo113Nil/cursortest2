package com.my.target;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.my.target.uj;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public final class pj implements t5 {
    final ArrayList a;
    final zf b;
    private final float c;
    private final boolean d;
    WeakReference j;
    WeakReference k;
    private a l;
    private final wh.c m;
    private final ViewTreeObserver.OnScrollChangedListener f = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.my.target.pj$$ExternalSyntheticLambda0
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            pj.this.b();
        }
    };
    boolean g = false;
    boolean h = false;
    boolean i = false;
    private final Runnable e = new Runnable() { // from class: com.my.target.pj$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            pj.this.b();
        }
    };

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }

        public void b() {
        }
    }

    private pj(lj ljVar, th thVar, boolean z, boolean z2, wh.c cVar, rj rjVar) {
        this.m = cVar;
        float b = ljVar.b();
        if (b == 1.0f) {
            this.b = zf.e;
        } else {
            this.b = zf.a((int) (b * 1000.0f));
        }
        this.a = new ArrayList();
        a(ljVar, thVar, z2, rjVar);
        this.c = ljVar.c() * 100.0f;
        this.d = z;
    }

    public static pj a(lj ljVar, th thVar, wh.c cVar) {
        return a(ljVar, thVar, true, false, cVar, null);
    }

    public void b(View view) {
        if (this.g) {
            return;
        }
        if (this.a.isEmpty() && this.d) {
            return;
        }
        mi.b("ViewabilityTracker", "start tracking");
        this.g = true;
        this.j = new WeakReference(view);
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((di) this.a.get(size)).a(view);
        }
        b();
        if (this.g) {
            this.b.a(this.e);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
        if (this.i) {
            return;
        }
        view.getViewTreeObserver().addOnScrollChangedListener(this.f);
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        WeakReference weakReference = this.k;
        uj ujVar = weakReference == null ? null : (uj) weakReference.get();
        this.k = null;
        if (ujVar == null) {
            return;
        }
        ujVar.setStateChangedListener(null);
        ViewParent parent = ujVar.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(ujVar);
        mi.b("ViewabilityTracker", "help view removed");
    }

    public void e() {
        View view;
        if (this.g) {
            this.g = false;
            mi.b("ViewabilityTracker", "stop tracking");
            d();
            this.b.b(this.e);
            this.h = false;
            WeakReference weakReference = this.j;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f);
            }
            this.j = null;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                ((di) this.a.get(size)).c();
            }
        }
    }

    public static pj a(lj ljVar, th thVar, boolean z, boolean z2, wh.c cVar, rj rjVar) {
        return new pj(ljVar, thVar, z, z2, cVar, rjVar);
    }

    public void a(View view) {
        if (this.g) {
            this.j = new WeakReference(view);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    @Override // com.my.target.t5
    public a a() {
        return this.l;
    }

    public void a(a aVar) {
        this.l = aVar;
    }

    @Override // com.my.target.t5
    public void a(di diVar) {
        int size = this.a.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.a.get(size) == diVar) {
                this.a.remove(size);
                break;
            }
            size--;
        }
        if (this.a.isEmpty() && this.d) {
            mi.b("ViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            e();
        }
    }

    public void a(ViewGroup viewGroup) {
        d();
        try {
            uj ujVar = new uj(viewGroup.getContext());
            qi.b(ujVar, "viewability_view");
            viewGroup.addView(ujVar);
            mi.b("ViewabilityTracker", "help view added");
            ujVar.setStateChangedListener(new uj.a() { // from class: com.my.target.pj$$ExternalSyntheticLambda2
                @Override // com.my.target.uj.a
                public final void a(boolean z) {
                    pj.this.a(z);
                }
            });
            this.k = new WeakReference(ujVar);
        } catch (Throwable th) {
            mi.c("ViewabilityTracker", "Unable to add Viewability View - " + th.getMessage());
            this.k = null;
        }
    }

    public void b() {
        WeakReference weakReference = this.j;
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null) {
            mi.b("ViewabilityTracker", "Tracking view disappeared");
            e();
            return;
        }
        float a2 = qi.a(view);
        boolean z = v4.a(a2, this.c) != -1;
        mi.b("ViewabilityTracker", "View visibility " + a2 + "% (isVisible = " + z + ")");
        if (z) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f);
            this.i = true;
        }
        a(z, a2, view);
    }

    public void a(boolean z, float f, View view) {
        boolean z2 = this.h;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ((di) this.a.get(size)).a(z, f, view.getContext());
        }
        if (z2 == z) {
            return;
        }
        this.h = this.g && z;
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    void a(boolean z) {
        WeakReference weakReference = this.k;
        uj ujVar = weakReference == null ? null : (uj) weakReference.get();
        if (ujVar == null) {
            mi.b("ViewabilityTracker", "help view is null");
            this.k = null;
            return;
        }
        ViewParent parent = ujVar.getParent();
        WeakReference weakReference2 = this.j;
        View view = weakReference2 == null ? null : (View) weakReference2.get();
        if (parent != null && parent == view) {
            mi.b("ViewabilityTracker", "onViewVisibilityChanged = " + z);
            if (z) {
                b();
                if (this.g) {
                    this.b.a(this.e);
                    return;
                }
                return;
            }
            this.b.b(this.e);
            a(false, 0.0f, view);
            return;
        }
        mi.b("ViewabilityTracker", "onStateChanged viewParent is null or not equals to rootView");
        ujVar.setStateChangedListener(null);
        this.k.clear();
        this.k = null;
    }

    private void a(lj ljVar, th thVar, boolean z, rj rjVar) {
        uh a2;
        long a3 = (long) (ljVar.a() * 1000.0f);
        uh b = thVar.b("viewabilityDuration");
        mi.b("ViewabilityTracker", "ViewabilityDuration stats count = " + b.c.size());
        if (!b.c.isEmpty()) {
            this.a.add(nj.a(this, b, a3, this.m));
        }
        uh b2 = thVar.b("show");
        mi.b("ViewabilityTracker", "Show stats count = " + b2.c.size());
        this.a.add(wg.a(this, b2, a3, thVar, this.m));
        uh b3 = thVar.b("viewin");
        mi.b("ViewabilityTracker", "View In stats count = " + b3.c.size());
        this.a.add(kj.a(this, b3));
        uh b4 = thVar.b("render");
        mi.b("ViewabilityTracker", "Render stats count = " + b4.c.size());
        uh b5 = thVar.b("viewabilityMeasurable");
        mi.b("ViewabilityTracker", "ViewabilityMeasurable stats count = " + b5.c.size());
        this.a.add(yf.a(this, b4, b5, this.m));
        if (z) {
            uh b6 = thVar.b(1);
            mi.b("ViewabilityTracker", "OvvStats stats count = " + b6.c.size());
            if (rjVar == null) {
                a2 = thVar.a(1);
                mi.b("ViewabilityTracker", "MrcStats stats count = " + a2.c.size());
            } else {
                a2 = uh.a(thVar);
                mi.b("ViewabilityTracker", "MrcStats stats ignored (viewabilityTrackerV2FeatureFlag)");
            }
            this.a.add(me.a(this, b6, a2, this.m));
        }
    }
}
