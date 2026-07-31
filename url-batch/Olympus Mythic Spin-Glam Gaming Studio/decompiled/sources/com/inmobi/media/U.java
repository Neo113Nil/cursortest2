package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes13.dex */
public final class U {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public final Set b;
    public final long c;
    public final N d;
    public final InterfaceC4466x9 e;
    public final Context f;
    public L g;
    public M6 h;
    public final CoroutineScope i;
    public final AtomicBoolean j;
    public Job k;
    public Wo l;
    public final O m;
    public volatile boolean n;
    public final T o;

    public U(GestureDetectorOnGestureListenerC4476xi adView, Set friendlyViews, long j, N listener, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adView;
        this.b = friendlyViews;
        this.c = j;
        this.d = listener;
        this.e = interfaceC4466x9;
        this.f = adView.getContext();
        this.i = L9.d;
        this.j = new AtomicBoolean(false);
        this.m = new O(this);
        this.o = new T(this);
    }

    public static final M a(U u) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        u.getClass();
        Rect rect = new Rect();
        if (u.a.getRootView() == null || u.a.getVisibility() != 0 || !u.a.hasWindowFocus() || !u.n || !u.a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u.f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        Rect rect2 = new Rect();
        if (!u.a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u.a.getRootView();
        Set set = u.b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (Intrinsics.areEqual(view, u.a)) {
                        z = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (Intrinsics.areEqual(view, u.a) || (globalVisibleRect && rect4.intersect(rect))) {
                                F5.a.getClass();
                                boolean z2 = !F5.y() || view.getZ() >= u.a.getZ();
                                if (z && z2) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l = u.g;
            if (l != null && (rectF4 = l.b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l2 = u.g;
            if (l2 != null && (rectF3 = l2.b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l3 = u.g;
            if (l3 != null && (rectF2 = l3.c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l4 = u.g;
            if (l4 != null && (rectF = l4.d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, intValue, intValue2);
    }

    public static final Unit b(U u) {
        u.getClass();
        F5.a.getClass();
        if (F5.u()) {
            u.l = new Wo(u.a, u.o, u.e);
        } else {
            InterfaceC4466x9 interfaceC4466x9 = u.e;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u.k = N3.a(u.i, 0L, u.c, new S(u, null));
        return Unit.INSTANCE;
    }

    public static final Unit c(U u) {
        Job job = u.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Wo wo = u.l;
        if (wo != null) {
            wo.a();
        }
        u.l = null;
        u.k = null;
        M6 m6 = new M6(0.0f, null, null);
        if (!Intrinsics.areEqual(m6, u.h)) {
            ((C4133ki) u.d).a(m6);
            u.h = m6;
        }
        return Unit.INSTANCE;
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.b.remove(view);
    }

    public final void b() {
        InterfaceC4466x9 interfaceC4466x9;
        if (this.j.compareAndSet(true, false)) {
            Object a = P3.a(new Function0() { // from class: com.inmobi.media.U$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return U.c(U.this);
                }
            });
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
            if (m8026exceptionOrNullimpl != null && (interfaceC4466x9 = this.e) != null) {
                ((C4493y9) interfaceC4466x9).b("AdExposureTracker", "Error stopping exposure tracking - " + m8026exceptionOrNullimpl.getMessage());
            }
            Result.m8022boximpl(a);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.e;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.j.compareAndSet(false, true)) {
            Object a = P3.a(new Function0() { // from class: com.inmobi.media.U$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return U.b(U.this);
                }
            });
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
            if (m8026exceptionOrNullimpl != null) {
                InterfaceC4466x9 interfaceC4466x9 = this.e;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).b("AdExposureTracker", "Error starting exposure tracking - " + m8026exceptionOrNullimpl.getMessage());
                }
                this.j.set(false);
                Lazy lazy = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(m8026exceptionOrNullimpl));
            }
            Result.m8022boximpl(a);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.e;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.b.add(view);
    }

    public final void a(Throwable th) {
        InterfaceC4466x9 interfaceC4466x9 = this.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("AdExposureTracker", "Error calculating exposure metrics - " + th.getMessage());
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(N3.b(rectF.left), N3.b(rectF.top), N3.b(rectF.right), N3.b(rectF.bottom)));
        }
    }
}
