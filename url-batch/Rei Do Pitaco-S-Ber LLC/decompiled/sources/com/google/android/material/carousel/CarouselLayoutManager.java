package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ionia.reidopitaco.libya.R;
import defpackage.b9;
import defpackage.c9;
import defpackage.d9;
import defpackage.e9;
import defpackage.jg;
import defpackage.jx;
import defpackage.l8;
import defpackage.n20;
import defpackage.ny;
import defpackage.oy;
import defpackage.ty;
import defpackage.yy;
import defpackage.zy;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends ny implements yy {
    public final jg p;
    public e9 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new d9();
        this.r = new b9(0, this);
        this.p = new jg();
        o0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.d);
            obtainStyledAttributes.getInt(0, 0);
            o0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.ny
    public final void A0(RecyclerView recyclerView, int i) {
        c9 c9Var = new c9(this, recyclerView.getContext());
        c9Var.a = i;
        B0(c9Var);
    }

    public final float D0(float f, float f2) {
        return F0() ? f - f2 : f + f2;
    }

    public final boolean E0() {
        return this.q.a == 0;
    }

    public final boolean F0() {
        return E0() && this.b.getLayoutDirection() == 1;
    }

    public final void G0(int i) {
        e9 e9Var;
        if (i != 0 && i != 1) {
            l8.l(n20.e("invalid orientation:", i));
            return;
        }
        c(null);
        e9 e9Var2 = this.q;
        if (e9Var2 == null || i != e9Var2.a) {
            if (i == 0) {
                e9Var = new e9(this, 1);
            } else {
                if (i != 1) {
                    l8.l("invalid orientation");
                    return;
                }
                e9Var = new e9(this, 0);
            }
            this.q = e9Var;
            o0();
        }
    }

    @Override // defpackage.ny
    public final boolean K() {
        return true;
    }

    @Override // defpackage.ny
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        jg jgVar = this.p;
        float f = jgVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        jgVar.a = f;
        float f2 = jgVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        jgVar.b = f2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.ny
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003b, code lost:
    
        if (r7 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (F0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0049, code lost:
    
        if (r7 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
    
        if (F0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, ty tyVar, zy zyVar) {
        char c;
        if (v() != 0) {
            int i2 = this.q.a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 17) {
                        if (i2 == 0) {
                        }
                        c = 0;
                    } else if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                            }
                            c = 0;
                        } else {
                            if (i2 == 0) {
                            }
                            c = 0;
                        }
                    }
                    if (c != 0) {
                        if (c == 65535) {
                            if (ny.G(view) != 0) {
                                int G = ny.G(u(0)) - 1;
                                if (G < 0 || G >= B()) {
                                    return u(F0() ? v() - 1 : 0);
                                }
                                this.q.a();
                                throw null;
                            }
                        } else if (ny.G(view) != B() - 1) {
                            int G2 = ny.G(u(v() - 1)) + 1;
                            if (G2 < 0 || G2 >= B()) {
                                return u(F0() ? 0 : v() - 1);
                            }
                            this.q.a();
                            throw null;
                        }
                    }
                }
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        return null;
    }

    @Override // defpackage.ny
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(ny.G(u(0)));
            accessibilityEvent.setToIndex(ny.G(u(v() - 1)));
        }
    }

    @Override // defpackage.ny
    public final void Y(int i, int i2) {
        B();
    }

    @Override // defpackage.ny
    public final void Z() {
        B();
    }

    @Override // defpackage.yy
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.ny
    public final void b0(int i, int i2) {
        B();
    }

    @Override // defpackage.ny
    public final boolean d() {
        return E0();
    }

    @Override // defpackage.ny
    public final void d0(ty tyVar, zy zyVar) {
        if (zyVar.b() > 0) {
            if ((E0() ? this.n : this.o) > 0.0f) {
                F0();
                tyVar.d(0);
                l8.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        j0(tyVar);
    }

    @Override // defpackage.ny
    public final boolean e() {
        return !E0();
    }

    @Override // defpackage.ny
    public final void e0(zy zyVar) {
        if (v() == 0) {
            return;
        }
        ny.G(u(0));
    }

    @Override // defpackage.ny
    public final int j(zy zyVar) {
        v();
        return 0;
    }

    @Override // defpackage.ny
    public final int k(zy zyVar) {
        return 0;
    }

    @Override // defpackage.ny
    public final int l(zy zyVar) {
        return 0;
    }

    @Override // defpackage.ny
    public final int m(zy zyVar) {
        v();
        return 0;
    }

    @Override // defpackage.ny
    public final int n(zy zyVar) {
        return 0;
    }

    @Override // defpackage.ny
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.ny
    public final int o(zy zyVar) {
        return 0;
    }

    @Override // defpackage.ny
    public final int p0(int i, ty tyVar, zy zyVar) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        tyVar.d(0);
        l8.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.ny
    public final oy r() {
        return new oy(-2, -2);
    }

    @Override // defpackage.ny
    public final int r0(int i, ty tyVar, zy zyVar) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        tyVar.d(0);
        l8.u("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.ny
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager() {
        jg jgVar = new jg();
        new d9();
        this.r = new b9(0, this);
        this.p = jgVar;
        o0();
        G0(0);
    }

    @Override // defpackage.ny
    public final void q0(int i) {
    }
}
