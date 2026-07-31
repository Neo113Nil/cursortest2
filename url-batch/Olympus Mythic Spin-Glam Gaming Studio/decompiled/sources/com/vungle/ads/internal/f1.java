package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class f1 {
    public final Map a;
    public final Handler b;
    public final Rect c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public WeakReference e;
    public final e1 f;
    public boolean g;
    public boolean h;

    public f1(Context context, WeakHashMap trackedViews, Handler visibilityHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.a = trackedViews;
        this.b = visibilityHandler;
        this.c = new Rect();
        this.f = new e1(this);
        this.d = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.f1$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return f1.a(f1.this);
            }
        };
        this.e = new WeakReference(null);
        this.h = a(context, (View) null);
    }

    public static final boolean a(f1 f1Var, View view, int i) {
        f1Var.getClass();
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(f1Var.c)) {
            return false;
        }
        long height = view.getHeight() * view.getWidth();
        return height > 0 && ((long) 100) * (f1Var.c.height() * f1Var.c.width()) >= ((long) i) * height;
    }

    public static final void d(f1 f1Var) {
        if (f1Var.g) {
            return;
        }
        f1Var.g = true;
        f1Var.b.postDelayed(f1Var.f, 100L);
    }

    public final boolean a(Context context, View view) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View view2 = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view2 = decorView.findViewById(R.id.content);
        }
        if (view2 == null && view != null) {
            if (!ViewCompat.isAttachedToWindow(view)) {
                boolean z = com.vungle.ads.internal.util.u.a;
                Intrinsics.checkNotNullExpressionValue("f1", "TAG");
                com.vungle.ads.internal.util.t.c("f1", "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                view2 = rootView.findViewById(R.id.content);
            }
            if (view2 == null) {
                view2 = rootView;
            }
        }
        if (view2 == null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            Intrinsics.checkNotNullExpressionValue("f1", "TAG");
            com.vungle.ads.internal.util.t.a("f1", "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            Intrinsics.checkNotNullExpressionValue("f1", "TAG");
            com.vungle.ads.internal.util.t.a("f1", "The root view tree observer was not alive");
            return false;
        }
        this.e = new WeakReference(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.d);
        return true;
    }

    public final void a(View view, c1 c1Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.h = a(view.getContext(), view);
        d1 d1Var = (d1) this.a.get(view);
        if (d1Var == null) {
            d1Var = new d1();
            this.a.put(view, d1Var);
            if (!this.g) {
                this.g = true;
                this.b.postDelayed(this.f, 100L);
            }
        }
        d1Var.c();
        d1Var.a(c1Var);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.remove(view);
    }

    public final void a() {
        this.a.clear();
        this.b.removeMessages(0);
        this.g = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.e.clear();
    }

    public static final boolean a(f1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.g) {
            this$0.g = true;
            this$0.b.postDelayed(this$0.f, 100L);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
