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
import k.InterfaceC0143C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0143C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2861A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2862B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2863a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2864b;

    /* renamed from: c, reason: collision with root package name */
    public C0262t0 f2865c;

    /* renamed from: f, reason: collision with root package name */
    public int f2867f;

    /* renamed from: g, reason: collision with root package name */
    public int f2868g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2869j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2870k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2873n;

    /* renamed from: o, reason: collision with root package name */
    public View f2874o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2875p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2876q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2881v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2883x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2884y;

    /* renamed from: z, reason: collision with root package name */
    public final C0207C f2885z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2866e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2871l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2872m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2877r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2878s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2879t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2880u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2882w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2861A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2862B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2863a = context;
        this.f2881v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1937o, i, 0);
        this.f2867f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2868g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0207C c0207c = new C0207C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1941s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0207c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0207c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q1.l.v(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2885z = c0207c;
        c0207c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0143C
    public final boolean a() {
        return this.f2885z.isShowing();
    }

    public final void c(int i) {
        this.f2867f = i;
    }

    public final int d() {
        return this.f2867f;
    }

    @Override // k.InterfaceC0143C
    public final void dismiss() {
        C0207C c0207c = this.f2885z;
        c0207c.dismiss();
        c0207c.setContentView(null);
        this.f2865c = null;
        this.f2881v.removeCallbacks(this.f2877r);
    }

    @Override // k.InterfaceC0143C
    public final C0262t0 f() {
        return this.f2865c;
    }

    @Override // k.InterfaceC0143C
    public final void i() {
        int i;
        int paddingBottom;
        C0262t0 c0262t0;
        C0262t0 c0262t02 = this.f2865c;
        C0207C c0207c = this.f2885z;
        Context context = this.f2863a;
        if (c0262t02 == null) {
            C0262t0 p2 = p(context, !this.f2884y);
            this.f2865c = p2;
            p2.setAdapter(this.f2864b);
            this.f2865c.setOnItemClickListener(this.f2875p);
            this.f2865c.setFocusable(true);
            this.f2865c.setFocusableInTouchMode(true);
            this.f2865c.setOnItemSelectedListener(new C0274z0(this));
            this.f2865c.setOnScrollListener(this.f2879t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2876q;
            if (onItemSelectedListener != null) {
                this.f2865c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0207c.setContentView(this.f2865c);
        }
        Drawable background = c0207c.getBackground();
        Rect rect = this.f2882w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2868g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0207c, this.f2874o, this.f2868g, c0207c.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2866e;
            int a3 = this.f2865c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2865c.getPaddingBottom() + this.f2865c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2885z.getInputMethodMode() == 2;
        Q.m.d(c0207c, this.h);
        if (c0207c.isShowing()) {
            if (this.f2874o.isAttachedToWindow()) {
                int i5 = this.f2866e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2874o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0207c.setWidth(this.f2866e == -1 ? -1 : 0);
                        c0207c.setHeight(0);
                    } else {
                        c0207c.setWidth(this.f2866e == -1 ? -1 : 0);
                        c0207c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0207c.setOutsideTouchable(true);
                View view = this.f2874o;
                int i6 = this.f2867f;
                int i7 = this.f2868g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0207c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2866e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2874o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0207c.setWidth(i8);
        c0207c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2861A;
            if (method != null) {
                try {
                    method.invoke(c0207c, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0207c, true);
        }
        c0207c.setOutsideTouchable(true);
        c0207c.setTouchInterceptor(this.f2878s);
        if (this.f2870k) {
            Q.m.c(c0207c, this.f2869j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2862B;
            if (method2 != null) {
                try {
                    method2.invoke(c0207c, this.f2883x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0207c, this.f2883x);
        }
        c0207c.showAsDropDown(this.f2874o, this.f2867f, this.f2868g, this.f2871l);
        this.f2865c.setSelection(-1);
        if ((!this.f2884y || this.f2865c.isInTouchMode()) && (c0262t0 = this.f2865c) != null) {
            c0262t0.setListSelectionHidden(true);
            c0262t0.requestLayout();
        }
        if (this.f2884y) {
            return;
        }
        this.f2881v.post(this.f2880u);
    }

    public final int j() {
        if (this.i) {
            return this.f2868g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2885z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2868g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2885z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2873n;
        if (d02 == null) {
            this.f2873n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2864b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2864b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2873n);
        }
        C0262t0 c0262t0 = this.f2865c;
        if (c0262t0 != null) {
            c0262t0.setAdapter(this.f2864b);
        }
    }

    public C0262t0 p(Context context, boolean z2) {
        return new C0262t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2885z.getBackground();
        if (background == null) {
            this.f2866e = i;
            return;
        }
        Rect rect = this.f2882w;
        background.getPadding(rect);
        this.f2866e = rect.left + rect.right + i;
    }
}
