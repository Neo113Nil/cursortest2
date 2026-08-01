package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.b8;
import defpackage.c8;
import defpackage.d0;
import defpackage.d8;
import defpackage.db0;
import defpackage.e8;
import defpackage.f8;
import defpackage.f80;
import defpackage.g2;
import defpackage.g90;
import defpackage.h5;
import defpackage.h80;
import defpackage.hd;
import defpackage.jo;
import defpackage.js;
import defpackage.jx;
import defpackage.kd;
import defpackage.l8;
import defpackage.ls;
import defpackage.m60;
import defpackage.n20;
import defpackage.o10;
import defpackage.oo;
import defpackage.w;
import defpackage.x;
import defpackage.y70;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends hd {
    public boolean A;
    public final f8 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public h80 Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;
    public final int a;
    public final ArrayList a0;
    public boolean b;
    public VelocityTracker b0;
    public final float c;
    public int c0;
    public final int d;
    public int d0;
    public final boolean e;
    public WeakReference e0;
    public int f;
    public boolean f0;
    public boolean g;
    public HashMap g0;
    public int h;
    public final SparseIntArray h0;
    public final int i;
    public final SparseIntArray i0;
    public final ls j;
    public final SparseIntArray j0;
    public final ColorStateList k;
    public final Rect k0;
    public final int l;
    public final d8 l0;
    public final int m;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final o10 z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new f8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.d0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new Rect();
        this.l0 = new d8(this, i2);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.c);
        if (obtainStyledAttributes.hasValue(3)) {
            this.k = oo.o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.z = o10.g(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o10 o10Var = this.z;
        if (o10Var != null) {
            ls lsVar = new ls(o10Var);
            this.j = lsVar;
            lsVar.n(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new b8(i2, this));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            D(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                E(4);
            }
            I();
        }
        this.o = obtainStyledAttributes.getBoolean(16, false);
        boolean z2 = obtainStyledAttributes.getBoolean(8, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.Y != null) {
                s();
            }
            F((this.b && this.P == 6) ? 3 : this.P);
            J(this.P, true);
            I();
        }
        this.K = obtainStyledAttributes.getBoolean(15, false);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        this.a = obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            l8.l("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                l8.l("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            J(this.P, true);
        } else {
            int i3 = peekValue2.data;
            if (i3 < 0) {
                l8.l("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i3;
            J(this.P, true);
        }
        this.d = obtainStyledAttributes.getInt(14, 500);
        this.e = obtainStyledAttributes.getBoolean(11, false);
        this.O = obtainStyledAttributes.getBoolean(4, true);
        this.p = obtainStyledAttributes.getBoolean(20, false);
        this.q = obtainStyledAttributes.getBoolean(21, false);
        this.r = obtainStyledAttributes.getBoolean(22, false);
        this.s = obtainStyledAttributes.getBoolean(23, true);
        this.t = obtainStyledAttributes.getBoolean(17, false);
        this.u = obtainStyledAttributes.getBoolean(18, false);
        this.v = obtainStyledAttributes.getBoolean(19, false);
        this.y = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View w = w(viewGroup.getChildAt(i));
            if (w != null) {
                return w;
            }
        }
        return null;
    }

    public static int x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final boolean A() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean B(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void C(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C(viewGroup.getChildAt(i));
            }
        }
    }

    public final void D(int i) {
        boolean z = this.g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!z && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        L();
    }

    public final void E(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && z(i) <= this.E) ? 3 : i;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            F(i);
            return;
        }
        View view = (View) this.Y.get();
        h5 h5Var = new h5(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(h5Var);
        } else {
            h5Var.run();
        }
    }

    public final void F(int i) {
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            K(true);
        } else if (i == 6 || i == 5 || i == 4) {
            K(false);
        }
        J(i, true);
        ArrayList arrayList = this.a0;
        if (arrayList.size() <= 0) {
            I();
        } else {
            arrayList.get(0).getClass();
            l8.c();
        }
    }

    public final boolean G(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        F(2);
        J(r4, true);
        r2.B.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(View view, int i, boolean z) {
        int z2 = z(i);
        h80 h80Var = this.Q;
        if (h80Var != null) {
            if (!z) {
                int left = view.getLeft();
                h80Var.r = view;
                h80Var.c = -1;
                boolean h = h80Var.h(left, z2, 0, 0);
                if (!h && h80Var.a == 0 && h80Var.r != null) {
                    h80Var.r = null;
                }
            }
        }
        F(i);
    }

    public final void I() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        f80.j(view, 1048576);
        f80.h(view, 0);
        f80.j(view, 524288);
        f80.h(view, 0);
        f80.j(view, 262144);
        f80.h(view, 0);
        SparseIntArray sparseIntArray = this.i0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            f80.j(view, i);
            f80.h(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.h0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            f80.j(view, i2);
            f80.h(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.j0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            f80.j(view, i3);
            f80.h(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.b && this.P != 6) {
            sparseIntArray2.put(0, r(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J && this.P != 5) {
            f80.k(view, d0.i, new g2(this, 5));
        }
        int i4 = this.P;
        if (i4 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void J(int i, boolean z) {
        ls lsVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.y || A());
        if (this.A == z2 || (lsVar = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(lsVar.g.i, z2 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float t = this.A ? t() : 1.0f;
        js jsVar = lsVar.g;
        if (jsVar.i != t) {
            jsVar.i = t;
            lsVar.k = true;
            lsVar.l = true;
            lsVar.invalidateSelf();
        }
    }

    public final void K(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.g0 != null) {
                    return;
                } else {
                    this.g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.g0 = null;
        }
    }

    public final void L() {
        View view;
        if (this.Y != null) {
            s();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.hd
    public final void c(kd kdVar) {
        this.Y = null;
        this.Q = null;
    }

    @Override // defpackage.hd
    public final void e() {
        this.Y = null;
        this.Q = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        if (r1.get() != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r18.o(r6, (int) r20.getX(), (int) r20.getY()) != false) goto L87;
     */
    @Override // defpackage.hd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        h80 h80Var;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        view2 = null;
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    view2 = (View) ((WeakReference) obj).get();
                    if (view2 != null && coordinatorLayout.o(view2, x2, y)) {
                        break;
                    }
                }
            }
            WeakReference weakReference = new WeakReference(view2);
            this.e0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f0 = true;
            }
            this.R = this.c0 == -1 && !coordinatorLayout.o(view, x, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f0 = false;
            this.e0 = null;
            this.c0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (h80Var = this.Q) == null || !h80Var.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.e) {
                                WeakReference weakReference2 = this.e0;
                                if (weakReference2 != null) {
                                }
                                if (this.Q != null || (i = this.d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.b) {
                                    break;
                                }
                            } else {
                                View view3 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view3 != null) {
                                }
                                if (this.Q != null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                g90.a(view, new c8(this, z));
            }
            f80.o(view, new jo(view));
            this.Y = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            m60.T(context, R.attr.motionDurationMedium2, 300);
            m60.T(context, R.attr.motionDurationShort3, 150);
            m60.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            ls lsVar = this.j;
            if (lsVar != null) {
                view.setBackground(lsVar);
                float f = this.I;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                lsVar.q(f);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            I();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new h80(coordinatorLayout.getContext(), coordinatorLayout, this.l0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i2 = this.X;
        int i3 = i2 - height;
        int i4 = this.x;
        if (i3 < i4) {
            boolean z2 = this.s;
            int i5 = this.m;
            if (z2) {
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.V = i2;
            } else {
                int i6 = i2 - i4;
                if (i5 != -1) {
                    i6 = Math.min(i6, i5);
                }
                this.V = i6;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        this.F = (int) ((1.0f - this.G) * this.X);
        s();
        int i7 = this.P;
        if (i7 == 3) {
            int y = y();
            WeakHashMap weakHashMap = f80.a;
            view.offsetTopAndBottom(y);
        } else if (i7 == 6) {
            int i8 = this.F;
            WeakHashMap weakHashMap2 = f80.a;
            view.offsetTopAndBottom(i8);
        } else if (this.J && i7 == 5) {
            int i9 = this.X;
            WeakHashMap weakHashMap3 = f80.a;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.H;
            WeakHashMap weakHashMap4 = f80.a;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = f80.a;
            view.offsetTopAndBottom(top2);
        }
        J(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.e) {
            C(view);
        } else {
            arrayList.add(new WeakReference(w(view)));
        }
        ArrayList arrayList2 = this.a0;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        l8.c();
        return false;
    }

    @Override // defpackage.hd
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), x(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.hd
    public final boolean i(View view) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                if (!B(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hd
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean B;
        if (i3 != 1 && (B = B(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.L;
            boolean z2 = this.M;
            if (i2 > 0) {
                if (!this.T && !z2 && B && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < y()) {
                    int y = top - y();
                    iArr[1] = y;
                    WeakHashMap weakHashMap = f80.a;
                    view.offsetTopAndBottom(-y);
                    F(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = f80.a;
                    view.offsetTopAndBottom(-i2);
                    F(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z2 && B && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = f80.a;
                        view.offsetTopAndBottom(-i6);
                        F(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = f80.a;
                        view.offsetTopAndBottom(-i2);
                        F(1);
                    }
                }
            }
            v(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    @Override // defpackage.hd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.k0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = f80.a;
            db0 a = y70.a(view);
            if (a != null) {
                rect2.bottom -= a.a.h(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        E(3);
        return true;
    }

    @Override // defpackage.hd
    public final void m(View view, Parcelable parcelable) {
        e8 e8Var = (e8) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = e8Var.i;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = e8Var.j;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = e8Var.k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = e8Var.l;
            }
        }
        int i2 = e8Var.h;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    @Override // defpackage.hd
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new e8(this);
    }

    @Override // defpackage.hd
    public final boolean o(View view, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r3.F) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r5 - r3.E) < java.lang.Math.abs(r5 - r3.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.H)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (java.lang.Math.abs(r5 - r3.F) < java.lang.Math.abs(r5 - r3.H)) goto L48;
     */
    @Override // defpackage.hd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == y()) {
            F(3);
            return;
        }
        if (B(view2) && this.T) {
            if (this.S > 0) {
                if (!this.b) {
                }
                H(view, i2, false);
                this.T = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.b0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.b0.getYVelocity(this.c0);
                }
                if (G(view, yVelocity)) {
                    i2 = 5;
                    H(view, i2, false);
                    this.T = false;
                }
            }
            if (this.S == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.F;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            H(view, i2, false);
            this.T = false;
        }
    }

    @Override // defpackage.hd
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        h80 h80Var = this.Q;
        boolean z = this.L;
        if (h80Var != null && (z || i == 1)) {
            h80Var.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        if (this.Q != null && ((z || this.P == 1) && actionMasked == 2 && !this.R)) {
            float abs = Math.abs(this.d0 - motionEvent.getY());
            h80 h80Var2 = this.Q;
            if (abs > h80Var2.b) {
                h80Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.R;
    }

    public final int r(View view, int i, int i2) {
        int i3;
        String string = view.getResources().getString(i);
        g2 g2Var = new g2(this, i2);
        ArrayList f = f80.f(view);
        int i4 = 0;
        while (true) {
            if (i4 >= f.size()) {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = f80.d;
                    if (i5 >= 32 || i6 != -1) {
                        break;
                    }
                    int i7 = iArr[i5];
                    boolean z = true;
                    for (int i8 = 0; i8 < f.size(); i8++) {
                        z &= ((d0) f.get(i8)).a() != i7;
                    }
                    if (z) {
                        i6 = i7;
                    }
                    i5++;
                }
                i3 = i6;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d0) f.get(i4)).a).getLabel())) {
                    i3 = ((d0) f.get(i4)).a();
                    break;
                }
                i4++;
            }
        }
        if (i3 != -1) {
            d0 d0Var = new d0(null, i3, string, g2Var, null);
            View.AccessibilityDelegate d = f80.d(view);
            x xVar = d == null ? null : d instanceof w ? ((w) d).a : new x(d);
            if (xVar == null) {
                xVar = new x();
            }
            f80.m(view, xVar);
            f80.j(view, d0Var.a());
            f80.f(view).add(d0Var);
            f80.h(view, 0);
        }
        return i3;
    }

    public final void s() {
        int u = u();
        boolean z = this.b;
        int i = this.X;
        if (z) {
            this.H = Math.max(i - u, this.E);
        } else {
            this.H = i - u;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = 0.0f;
        ls lsVar = this.j;
        if (lsVar != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float[] fArr = lsVar.G;
                float a = fArr != null ? fArr[3] : lsVar.g.a.c().e.a(lsVar.h());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > 0.0f && a > 0.0f) {
                        f = f3 / a;
                        float[] fArr2 = lsVar.G;
                        float a2 = fArr2 == null ? fArr2[0] : lsVar.g.a.c().f.a(lsVar.h());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > 0.0f && a2 > 0.0f) {
                                f2 = f4 / a2;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float[] fArr22 = lsVar.G;
                if (fArr22 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int u() {
        int i;
        int i2;
        int i3;
        if (this.g) {
            i = Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V);
            i2 = this.w;
        } else {
            if (!this.o && !this.p && (i3 = this.n) > 0) {
                return Math.max(this.f, i3 + this.i);
            }
            i = this.f;
            i2 = this.w;
        }
        return i + i2;
    }

    public final void v(int i) {
        if (((View) this.Y.get()) != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.H;
            if (i <= i2 && i2 != y()) {
                y();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            l8.c();
        }
    }

    public final int y() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int z(int i) {
        if (i == 3) {
            return y();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        l8.l(n20.e("Invalid state to get top offset: ", i));
        return 0;
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new f8(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.d0 = -1;
        this.h0 = new SparseIntArray();
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new Rect();
        this.l0 = new d8(this, 0);
    }

    @Override // defpackage.hd
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
