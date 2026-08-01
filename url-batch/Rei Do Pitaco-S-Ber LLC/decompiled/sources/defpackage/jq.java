package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class jq implements b20 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final n4 E;
    public final Context f;
    public ListAdapter g;
    public bg h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public gq s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final fq w = new fq(this, 1);
    public final iq x = new iq(0, this);
    public final hq y = new hq(this);
    public final fq z = new fq(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public jq(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kx.o, i, i2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        n4 n4Var = new n4(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kx.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            n4Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        n4Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : vv.t(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = n4Var;
        n4Var.setInputMethodMode(1);
    }

    public bg a(Context context, boolean z) {
        return new bg(context, z);
    }

    @Override // defpackage.b20
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int c() {
        return this.k;
    }

    @Override // defpackage.b20
    public final void d() {
        int i;
        int paddingBottom;
        bg bgVar;
        bg bgVar2 = this.h;
        Context context = this.f;
        n4 n4Var = this.E;
        if (bgVar2 == null) {
            bg a = a(context, !this.D);
            this.h = a;
            a.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new cq(this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            n4Var.setContentView(this.h);
        }
        Drawable background = n4Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.n) {
                this.l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = dq.a(n4Var, this.t, this.l, n4Var.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.j;
            int a3 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = n4Var.getInputMethodMode() == 2;
        n4Var.setWindowLayoutType(this.m);
        if (n4Var.isShowing()) {
            if (this.t.isAttachedToWindow()) {
                int i5 = this.j;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.j;
                    if (z) {
                        n4Var.setWidth(i6 == -1 ? -1 : 0);
                        n4Var.setHeight(0);
                    } else {
                        n4Var.setWidth(i6 == -1 ? -1 : 0);
                        n4Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                n4Var.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.t;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                n4Var.update(view, i8, i9, i10, i3);
                return;
            }
            return;
        }
        int i11 = this.j;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        n4Var.setWidth(i11);
        n4Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(n4Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            eq.b(n4Var, true);
        }
        n4Var.setOutsideTouchable(true);
        n4Var.setTouchInterceptor(this.x);
        if (this.p) {
            n4Var.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(n4Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            eq.a(n4Var, this.C);
        }
        n4Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (bgVar = this.h) != null) {
            bgVar.setListSelectionHidden(true);
            bgVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    @Override // defpackage.b20
    public final void dismiss() {
        n4 n4Var = this.E;
        n4Var.dismiss();
        n4Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final Drawable e() {
        return this.E.getBackground();
    }

    @Override // defpackage.b20
    public final bg h() {
        return this.h;
    }

    public final void i(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void k(int i) {
        this.l = i;
        this.n = true;
    }

    public final void m(int i) {
        this.k = i;
    }

    public final int o() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        gq gqVar = this.s;
        if (gqVar == null) {
            this.s = new gq(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(gqVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        bg bgVar = this.h;
        if (bgVar != null) {
            bgVar.setAdapter(this.g);
        }
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }
}
