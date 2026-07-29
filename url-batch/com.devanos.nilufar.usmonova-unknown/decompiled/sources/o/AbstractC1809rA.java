package o;

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

/* renamed from: o.rA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1809rA implements InterfaceC1629oR {
    public static final Method G;
    public static final Method H;
    public final Handler B;
    public Rect D;
    public boolean E;
    public final C1936t5 F;
    public final Context h;
    public ListAdapter i;
    public C1713pj j;
    public int m;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public C1612oA u;
    public View v;
    public AdapterView.OnItemClickListener w;
    public final int k = -2;
    public int l = -2;

    /* renamed from: o, reason: collision with root package name */
    public final int f215o = 1002;
    public int s = 0;
    public final int t = Integer.MAX_VALUE;
    public final RunnableC1546nA x = new RunnableC1546nA(this, 1);
    public final ViewOnTouchListenerC1744qA y = new ViewOnTouchListenerC1744qA(this);
    public final C1678pA z = new C1678pA(this);
    public final RunnableC1546nA A = new RunnableC1546nA(this, 0);
    public final Rect C = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1809rA(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.h = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.f220o, i, 0);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        C1936t5 c1936t5 = new C1936t5(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            MI.c(c1936t5, obtainStyledAttributes2.getBoolean(2, false));
        }
        c1936t5.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : EB.t(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.F = c1936t5;
        c1936t5.setInputMethodMode(1);
    }

    @Override // o.InterfaceC1629oR
    public final boolean a() {
        return this.F.isShowing();
    }

    public final int b() {
        return this.m;
    }

    @Override // o.InterfaceC1629oR
    public final void d() {
        int i;
        int paddingBottom;
        C1713pj c1713pj;
        C1713pj c1713pj2 = this.j;
        Context context = this.h;
        C1936t5 c1936t5 = this.F;
        if (c1713pj2 == null) {
            C1713pj q = q(context, !this.E);
            this.j = q;
            q.setAdapter(this.i);
            this.j.setOnItemClickListener(this.w);
            this.j.setFocusable(true);
            this.j.setFocusableInTouchMode(true);
            this.j.setOnItemSelectedListener(new C1348kA(this));
            this.j.setOnScrollListener(this.z);
            c1936t5.setContentView(this.j);
        }
        Drawable background = c1936t5.getBackground();
        Rect rect = this.C;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.p) {
                this.n = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a = AbstractC1414lA.a(c1936t5, this.v, this.n, c1936t5.getInputMethodMode() == 2);
        int i3 = this.k;
        if (i3 == -1) {
            paddingBottom = a + i;
        } else {
            int i4 = this.l;
            int a2 = this.j.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a);
            paddingBottom = a2 + (a2 > 0 ? this.j.getPaddingBottom() + this.j.getPaddingTop() + i : 0);
        }
        boolean z = this.F.getInputMethodMode() == 2;
        MI.d(c1936t5, this.f215o);
        if (c1936t5.isShowing()) {
            if (this.v.isAttachedToWindow()) {
                int i5 = this.l;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.v.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c1936t5.setWidth(this.l == -1 ? -1 : 0);
                        c1936t5.setHeight(0);
                    } else {
                        c1936t5.setWidth(this.l == -1 ? -1 : 0);
                        c1936t5.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c1936t5.setOutsideTouchable(true);
                int i6 = i5;
                View view = this.v;
                int i7 = this.m;
                int i8 = this.n;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c1936t5.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int i10 = this.l;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.v.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c1936t5.setWidth(i10);
        c1936t5.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(c1936t5, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1480mA.b(c1936t5, true);
        }
        c1936t5.setOutsideTouchable(true);
        c1936t5.setTouchInterceptor(this.y);
        if (this.r) {
            MI.c(c1936t5, this.q);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(c1936t5, this.D);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1480mA.a(c1936t5, this.D);
        }
        c1936t5.showAsDropDown(this.v, this.m, this.n, this.s);
        this.j.setSelection(-1);
        if ((!this.E || this.j.isInTouchMode()) && (c1713pj = this.j) != null) {
            c1713pj.setListSelectionHidden(true);
            c1713pj.requestLayout();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    @Override // o.InterfaceC1629oR
    public final void dismiss() {
        C1936t5 c1936t5 = this.F;
        c1936t5.dismiss();
        c1936t5.setContentView(null);
        this.j = null;
        this.B.removeCallbacks(this.x);
    }

    public final Drawable e() {
        return this.F.getBackground();
    }

    @Override // o.InterfaceC1629oR
    public final C1713pj f() {
        return this.j;
    }

    public final void h(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.n = i;
        this.p = true;
    }

    public final void l(int i) {
        this.m = i;
    }

    public final int n() {
        if (this.p) {
            return this.n;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        C1612oA c1612oA = this.u;
        if (c1612oA == null) {
            this.u = new C1612oA(this);
        } else {
            ListAdapter listAdapter2 = this.i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1612oA);
            }
        }
        this.i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        C1713pj c1713pj = this.j;
        if (c1713pj != null) {
            c1713pj.setAdapter(this.i);
        }
    }

    public C1713pj q(Context context, boolean z) {
        return new C1713pj(context, z);
    }

    public final void r(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            this.l = i;
            return;
        }
        Rect rect = this.C;
        background.getPadding(rect);
        this.l = rect.left + rect.right + i;
    }
}
