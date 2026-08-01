package com.google.android.material.carousel;

import B0.c;
import B0.d;
import B0.e;
import B0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import g0.I;
import g0.J;
import g0.O;
import g0.U;
import g0.V;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends I implements U {

    /* renamed from: p, reason: collision with root package name */
    public final g f1848p;

    /* renamed from: q, reason: collision with root package name */
    public e f1849q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1850r;

    public CarouselLayoutManager() {
        g gVar = new g();
        new d();
        this.f1850r = new View.OnLayoutChangeListener() { // from class: B0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1848p = gVar;
        n0();
        E0(0);
    }

    public final boolean C0() {
        return this.f1849q.f87a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        e eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        c(null);
        e eVar2 = this.f1849q;
        if (eVar2 == null || i != eVar2.f87a) {
            if (i == 0) {
                eVar = new e(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new e(this, 0);
            }
            this.f1849q = eVar;
            n0();
        }
    }

    @Override // g0.I
    public final boolean L() {
        return true;
    }

    @Override // g0.I
    public final void R(RecyclerView recyclerView) {
        g gVar = this.f1848p;
        Context context = recyclerView.getContext();
        float f2 = gVar.f90a;
        if (f2 <= RecyclerView.f1570A0) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f90a = f2;
        float f3 = gVar.f91b;
        if (f3 <= RecyclerView.f1570A0) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f91b = f3;
        n0();
        recyclerView.addOnLayoutChangeListener(this.f1850r);
    }

    @Override // g0.I
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f1850r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (D0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (D0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // g0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, O o2, V v2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f1849q.f87a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (I.H(view) == 0) {
                        return null;
                    }
                    int H2 = I.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f1849q.a();
                    throw null;
                }
                if (I.H(view) == B() - 1) {
                    return null;
                }
                int H3 = I.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f1849q.a();
                throw null;
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // g0.I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(I.H(u(0)));
            accessibilityEvent.setToIndex(I.H(u(v() - 1)));
        }
    }

    @Override // g0.I
    public final void Y(int i, int i2) {
        B();
    }

    @Override // g0.U
    public final PointF a(int i) {
        return null;
    }

    @Override // g0.I
    public final void b0(int i, int i2) {
        B();
    }

    @Override // g0.I
    public final boolean d() {
        return C0();
    }

    @Override // g0.I
    public final void d0(O o2, V v2) {
        if (v2.b() > 0) {
            if ((C0() ? this.f2349n : this.f2350o) > RecyclerView.f1570A0) {
                D0();
                View view = o2.k(0, Long.MAX_VALUE).f2392a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(o2);
    }

    @Override // g0.I
    public final boolean e() {
        return !C0();
    }

    @Override // g0.I
    public final void e0(V v2) {
        if (v() == 0) {
            return;
        }
        I.H(u(0));
    }

    @Override // g0.I
    public final int j(V v2) {
        v();
        return 0;
    }

    @Override // g0.I
    public final int k(V v2) {
        return 0;
    }

    @Override // g0.I
    public final int l(V v2) {
        return 0;
    }

    @Override // g0.I
    public final int m(V v2) {
        v();
        return 0;
    }

    @Override // g0.I
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // g0.I
    public final int n(V v2) {
        return 0;
    }

    @Override // g0.I
    public final int o(V v2) {
        return 0;
    }

    @Override // g0.I
    public final int o0(int i, O o2, V v2) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = o2.k(0, Long.MAX_VALUE).f2392a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.I
    public final void p0(int i) {
    }

    @Override // g0.I
    public final int q0(int i, O o2, V v2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = o2.k(0, Long.MAX_VALUE).f2392a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.I
    public final J r() {
        return new J(-2, -2);
    }

    @Override // g0.I
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // g0.I
    public final void z0(RecyclerView recyclerView, int i) {
        c cVar = new c(this, recyclerView.getContext(), 0);
        cVar.f2555a = i;
        A0(cVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new d();
        this.f1850r = new View.OnLayoutChangeListener() { // from class: B0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new b(0, carouselLayoutManager));
            }
        };
        this.f1848p = new g();
        n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.f3785b);
            obtainStyledAttributes.getInt(0, 0);
            n0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
