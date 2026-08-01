package com.google.android.material.carousel;

import E1.AbstractC0001b;
import G0.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.luckycounter.drinkwater.R;
import g0.AbstractC0139I;
import g0.C0140J;
import g0.C0145O;
import g0.C0170x;
import g0.U;
import g0.V;
import s0.AbstractC0363a;
import z0.C0388b;
import z0.C0389c;
import z0.C0391e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0139I implements U {

    /* renamed from: p, reason: collision with root package name */
    public final C0391e f2216p;

    /* renamed from: q, reason: collision with root package name */
    public C0389c f2217q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f2218r;

    public CarouselLayoutManager() {
        C0391e c0391e = new C0391e();
        new C0388b();
        this.f2218r = new View.OnLayoutChangeListener() { // from class: z0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new o(13, carouselLayoutManager));
            }
        };
        this.f2216p = c0391e;
        n0();
        E0(0);
    }

    public final boolean C0() {
        return this.f2217q.f4671a == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        C0389c c0389c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("invalid orientation:", i));
        }
        c(null);
        C0389c c0389c2 = this.f2217q;
        if (c0389c2 == null || i != c0389c2.f4671a) {
            if (i == 0) {
                c0389c = new C0389c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0389c = new C0389c(this, 0);
            }
            this.f2217q = c0389c;
            n0();
        }
    }

    @Override // g0.AbstractC0139I
    public final boolean L() {
        return true;
    }

    @Override // g0.AbstractC0139I
    public final void R(RecyclerView recyclerView) {
        C0391e c0391e = this.f2216p;
        Context context = recyclerView.getContext();
        float f2 = c0391e.f4674a;
        if (f2 <= RecyclerView.f1949A0) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0391e.f4674a = f2;
        float f3 = c0391e.f4675b;
        if (f3 <= RecyclerView.f1949A0) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0391e.f4675b = f3;
        n0();
        recyclerView.addOnLayoutChangeListener(this.f2218r);
    }

    @Override // g0.AbstractC0139I
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2218r);
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
    @Override // g0.AbstractC0139I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, C0145O c0145o, V v2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f2217q.f4671a;
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
                    if (AbstractC0139I.H(view) == 0) {
                        return null;
                    }
                    int H2 = AbstractC0139I.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(D0() ? v() - 1 : 0);
                    }
                    this.f2217q.a();
                    throw null;
                }
                if (AbstractC0139I.H(view) == B() - 1) {
                    return null;
                }
                int H3 = AbstractC0139I.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(D0() ? 0 : v() - 1);
                }
                this.f2217q.a();
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

    @Override // g0.AbstractC0139I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0139I.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC0139I.H(u(v() - 1)));
        }
    }

    @Override // g0.AbstractC0139I
    public final void Y(int i, int i2) {
        B();
    }

    @Override // g0.U
    public final PointF a(int i) {
        return null;
    }

    @Override // g0.AbstractC0139I
    public final void b0(int i, int i2) {
        B();
    }

    @Override // g0.AbstractC0139I
    public final boolean d() {
        return C0();
    }

    @Override // g0.AbstractC0139I
    public final void d0(C0145O c0145o, V v2) {
        if (v2.b() > 0) {
            if ((C0() ? this.f2787n : this.f2788o) > RecyclerView.f1949A0) {
                D0();
                View view = c0145o.k(0, Long.MAX_VALUE).f2830a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        i0(c0145o);
    }

    @Override // g0.AbstractC0139I
    public final boolean e() {
        return !C0();
    }

    @Override // g0.AbstractC0139I
    public final void e0(V v2) {
        if (v() == 0) {
            return;
        }
        AbstractC0139I.H(u(0));
    }

    @Override // g0.AbstractC0139I
    public final int j(V v2) {
        v();
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final int k(V v2) {
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final int l(V v2) {
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final int m(V v2) {
        v();
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // g0.AbstractC0139I
    public final int n(V v2) {
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final int o(V v2) {
        return 0;
    }

    @Override // g0.AbstractC0139I
    public final int o0(int i, C0145O c0145o, V v2) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0145o.k(0, Long.MAX_VALUE).f2830a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.AbstractC0139I
    public final void p0(int i) {
    }

    @Override // g0.AbstractC0139I
    public final int q0(int i, C0145O c0145o, V v2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0145o.k(0, Long.MAX_VALUE).f2830a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // g0.AbstractC0139I
    public final C0140J r() {
        return new C0140J(-2, -2);
    }

    @Override // g0.AbstractC0139I
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // g0.AbstractC0139I
    public final void z0(RecyclerView recyclerView, int i) {
        C0170x c0170x = new C0170x(this, recyclerView.getContext(), 1);
        c0170x.f2991a = i;
        A0(c0170x);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0388b();
        this.f2218r = new View.OnLayoutChangeListener() { // from class: z0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new o(13, carouselLayoutManager));
            }
        };
        this.f2216p = new C0391e();
        n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4095b);
            obtainStyledAttributes.getInt(0, 0);
            n0();
            E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
