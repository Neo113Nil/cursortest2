package l;

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
import k.InterfaceC0153C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0153C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2864A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2865B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2866a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2867b;

    /* renamed from: c, reason: collision with root package name */
    public C0251t0 f2868c;

    /* renamed from: f, reason: collision with root package name */
    public int f2870f;

    /* renamed from: g, reason: collision with root package name */
    public int f2871g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2872j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2873k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2876n;

    /* renamed from: o, reason: collision with root package name */
    public View f2877o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2878p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2879q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2884v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2886x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2887y;

    /* renamed from: z, reason: collision with root package name */
    public final C0196C f2888z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2869e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2874l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2875m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2880r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2881s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2882t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2883u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2885w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2864A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2865B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2866a = context;
        this.f2884v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1939o, i, 0);
        this.f2870f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2871g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0196C c0196c = new C0196C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1943s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0196c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0196c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q1.d.u(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2888z = c0196c;
        c0196c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0153C
    public final boolean a() {
        return this.f2888z.isShowing();
    }

    public final void c(int i) {
        this.f2870f = i;
    }

    public final int d() {
        return this.f2870f;
    }

    @Override // k.InterfaceC0153C
    public final void dismiss() {
        C0196C c0196c = this.f2888z;
        c0196c.dismiss();
        c0196c.setContentView(null);
        this.f2868c = null;
        this.f2884v.removeCallbacks(this.f2880r);
    }

    @Override // k.InterfaceC0153C
    public final C0251t0 f() {
        return this.f2868c;
    }

    @Override // k.InterfaceC0153C
    public final void i() {
        int i;
        int paddingBottom;
        C0251t0 c0251t0;
        C0251t0 c0251t02 = this.f2868c;
        C0196C c0196c = this.f2888z;
        Context context = this.f2866a;
        if (c0251t02 == null) {
            C0251t0 q2 = q(context, !this.f2887y);
            this.f2868c = q2;
            q2.setAdapter(this.f2867b);
            this.f2868c.setOnItemClickListener(this.f2878p);
            this.f2868c.setFocusable(true);
            this.f2868c.setFocusableInTouchMode(true);
            this.f2868c.setOnItemSelectedListener(new C0263z0(this));
            this.f2868c.setOnScrollListener(this.f2882t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2879q;
            if (onItemSelectedListener != null) {
                this.f2868c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0196c.setContentView(this.f2868c);
        }
        Drawable background = c0196c.getBackground();
        Rect rect = this.f2885w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2871g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0196c, this.f2877o, this.f2871g, c0196c.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2869e;
            int a3 = this.f2868c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2868c.getPaddingBottom() + this.f2868c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2888z.getInputMethodMode() == 2;
        Q.m.d(c0196c, this.h);
        if (c0196c.isShowing()) {
            if (this.f2877o.isAttachedToWindow()) {
                int i5 = this.f2869e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2877o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0196c.setWidth(this.f2869e == -1 ? -1 : 0);
                        c0196c.setHeight(0);
                    } else {
                        c0196c.setWidth(this.f2869e == -1 ? -1 : 0);
                        c0196c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0196c.setOutsideTouchable(true);
                View view = this.f2877o;
                int i6 = this.f2870f;
                int i7 = this.f2871g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0196c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2869e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2877o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0196c.setWidth(i8);
        c0196c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2864A;
            if (method != null) {
                try {
                    method.invoke(c0196c, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0196c, true);
        }
        c0196c.setOutsideTouchable(true);
        c0196c.setTouchInterceptor(this.f2881s);
        if (this.f2873k) {
            Q.m.c(c0196c, this.f2872j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2865B;
            if (method2 != null) {
                try {
                    method2.invoke(c0196c, this.f2886x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0196c, this.f2886x);
        }
        c0196c.showAsDropDown(this.f2877o, this.f2870f, this.f2871g, this.f2874l);
        this.f2868c.setSelection(-1);
        if ((!this.f2887y || this.f2868c.isInTouchMode()) && (c0251t0 = this.f2868c) != null) {
            c0251t0.setListSelectionHidden(true);
            c0251t0.requestLayout();
        }
        if (this.f2887y) {
            return;
        }
        this.f2884v.post(this.f2883u);
    }

    public final int j() {
        if (this.i) {
            return this.f2871g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2888z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2871g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2888z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2876n;
        if (d02 == null) {
            this.f2876n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2867b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2867b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2876n);
        }
        C0251t0 c0251t0 = this.f2868c;
        if (c0251t0 != null) {
            c0251t0.setAdapter(this.f2867b);
        }
    }

    public C0251t0 q(Context context, boolean z2) {
        return new C0251t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2888z.getBackground();
        if (background == null) {
            this.f2869e = i;
            return;
        }
        Rect rect = this.f2885w;
        background.getPadding(rect);
        this.f2869e = rect.left + rect.right + i;
    }
}
