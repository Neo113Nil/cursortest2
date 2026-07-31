package com.ogury.ad.internal;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class j1 implements a3 {
    public static final Lazy m = LazyKt.lazy(g1.a);
    public final ViewGroup a;
    public b3 b;
    public final ji c;
    public final ViewTreeObserver.OnScrollChangedListener d;
    public final Handler e;
    public boolean f;
    public boolean g;
    public Boolean h;
    public final WeakHashMap i;
    public final h1 j;
    public final i1 k;
    public final View l;

    public j1(ViewGroup adContainer, wi rectHelper) {
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(rectHelper, "rectHelper");
        this.a = adContainer;
        this.c = new ji(adContainer);
        this.d = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.ogury.ad.internal.j1$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                j1.b(j1.this);
            }
        };
        this.e = new Handler(Looper.getMainLooper());
        this.i = new WeakHashMap();
        this.j = new h1(this);
        i1 i1Var = new i1(this);
        this.k = i1Var;
        Intrinsics.checkNotNull(i1Var);
        adContainer.addOnAttachStateChangeListener(i1Var);
        this.l = adContainer.getRootView();
    }

    public static final void b(j1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // com.ogury.ad.internal.a3
    public final void a(b3 b3Var) {
        this.b = b3Var;
    }

    @Override // com.ogury.ad.internal.a3
    public final void destroy() {
        b();
        i1 i1Var = this.k;
        if (i1Var != null) {
            this.a.removeOnAttachStateChangeListener(i1Var);
        }
        this.i.clear();
        this.b = null;
    }

    public static final void a(j1 j1Var) {
        if (j1Var.f) {
            return;
        }
        j1Var.f = true;
        ViewTreeObserver viewTreeObserver = j1Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnScrollChangedListener(j1Var.d);
        }
        if (j1Var.g) {
            j1Var.h = Boolean.valueOf(j1Var.a.hasWindowFocus());
            j1Var.e.post(j1Var.j);
        }
        j1Var.a();
    }

    public final void b() {
        if (this.f) {
            this.f = false;
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.d);
            }
            this.e.removeCallbacks(this.j);
            this.h = null;
        }
    }

    @Override // com.ogury.ad.internal.a3
    public final void a() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof y7) {
                y7 y7Var = (y7) childAt;
                if (y7Var.getContainsMraid()) {
                    d adExposure = new d();
                    Rect a = wi.a((View) this.a);
                    int measuredHeight = this.a.getMeasuredHeight() * this.a.getMeasuredWidth();
                    if (measuredHeight != 0) {
                        Rect rect = new Rect();
                        this.l.getHitRect(rect);
                        adExposure.c = 100.0f - (((measuredHeight - ((!this.a.getLocalVisibleRect(rect) || this.a.getWindowToken() == null) ? 0 : a.height() * a.width())) * 100.0f) / measuredHeight);
                    }
                    if (adExposure.c == 0.0f) {
                        adExposure.a = null;
                    } else {
                        adExposure.a = a;
                    }
                    if (y7Var.k && !y7Var.l) {
                        d dVar = (d) this.i.get(y7Var);
                        if (dVar != null) {
                            boolean z = true;
                            if (Math.abs(dVar.c - adExposure.c) < 0.01f) {
                                Rect rect2 = dVar.a;
                                Rect rect3 = adExposure.a;
                                if (rect2 == null && rect3 == null) {
                                    z = false;
                                } else if (rect2 != null && rect3 != null) {
                                    z = true ^ Intrinsics.areEqual(rect2, rect3);
                                }
                            }
                            if (!z) {
                            }
                        }
                        WeakHashMap weakHashMap = this.i;
                        d dVar2 = new d();
                        dVar2.c = adExposure.c;
                        Rect rect4 = adExposure.a;
                        dVar2.a = rect4 != null ? new Rect(rect4) : null;
                        List list = adExposure.b;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Rect((Rect) it.next()));
                        }
                        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                        dVar2.b = arrayList;
                        weakHashMap.put(y7Var, dVar2);
                        ji jiVar = this.c;
                        jiVar.getClass();
                        Intrinsics.checkNotNullParameter(adExposure, "adExposure");
                        ViewParent parent = jiVar.a.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null && viewGroup.getVisibility() != 0) {
                            adExposure.c = 0.0f;
                        }
                        y7Var.getMraidCommandExecutor().a(adExposure);
                        b3 b3Var = this.b;
                        if (b3Var != null) {
                            ((f) b3Var).a(y7Var, adExposure.c);
                        }
                    }
                }
            }
        }
    }
}
