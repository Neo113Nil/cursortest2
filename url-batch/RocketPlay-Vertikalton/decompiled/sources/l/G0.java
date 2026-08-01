package l;

import a1.AbstractC0067d;
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
import k.InterfaceC0187C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0187C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f3297A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3298B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3299a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3300b;

    /* renamed from: c, reason: collision with root package name */
    public C0278t0 f3301c;

    /* renamed from: f, reason: collision with root package name */
    public int f3303f;

    /* renamed from: g, reason: collision with root package name */
    public int f3304g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3306k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f3309n;

    /* renamed from: o, reason: collision with root package name */
    public View f3310o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3311p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3312q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3317v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f3319x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3320y;

    /* renamed from: z, reason: collision with root package name */
    public final C0222B f3321z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f3302e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f3307l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f3308m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f3313r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f3314s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f3315t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f3316u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3318w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3297A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3298B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f3299a = context;
        this.f3317v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2570o, i, 0);
        this.f3303f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3304g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0222B c0222b = new C0222B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2574s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.l.c(c0222b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0222b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0067d.k(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3321z = c0222b;
        c0222b.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        return this.f3321z.isShowing();
    }

    public final void c(int i) {
        this.f3303f = i;
    }

    public final int d() {
        return this.f3303f;
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        C0222B c0222b = this.f3321z;
        c0222b.dismiss();
        c0222b.setContentView(null);
        this.f3301c = null;
        this.f3317v.removeCallbacks(this.f3313r);
    }

    @Override // k.InterfaceC0187C
    public final C0278t0 f() {
        return this.f3301c;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        int i;
        int paddingBottom;
        C0278t0 c0278t0;
        C0278t0 c0278t02 = this.f3301c;
        C0222B c0222b = this.f3321z;
        Context context = this.f3299a;
        if (c0278t02 == null) {
            C0278t0 q2 = q(context, !this.f3320y);
            this.f3301c = q2;
            q2.setAdapter(this.f3300b);
            this.f3301c.setOnItemClickListener(this.f3311p);
            this.f3301c.setFocusable(true);
            this.f3301c.setFocusableInTouchMode(true);
            this.f3301c.setOnItemSelectedListener(new C0290z0(this));
            this.f3301c.setOnScrollListener(this.f3315t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3312q;
            if (onItemSelectedListener != null) {
                this.f3301c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0222b.setContentView(this.f3301c);
        }
        Drawable background = c0222b.getBackground();
        Rect rect = this.f3318w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f3304g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0222b, this.f3310o, this.f3304g, c0222b.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f3302e;
            int a3 = this.f3301c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f3301c.getPaddingBottom() + this.f3301c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f3321z.getInputMethodMode() == 2;
        Q.l.d(c0222b, this.h);
        if (c0222b.isShowing()) {
            if (this.f3310o.isAttachedToWindow()) {
                int i5 = this.f3302e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3310o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0222b.setWidth(this.f3302e == -1 ? -1 : 0);
                        c0222b.setHeight(0);
                    } else {
                        c0222b.setWidth(this.f3302e == -1 ? -1 : 0);
                        c0222b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0222b.setOutsideTouchable(true);
                View view = this.f3310o;
                int i6 = this.f3303f;
                int i7 = this.f3304g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0222b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f3302e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3310o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0222b.setWidth(i8);
        c0222b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3297A;
            if (method != null) {
                try {
                    method.invoke(c0222b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0222b, true);
        }
        c0222b.setOutsideTouchable(true);
        c0222b.setTouchInterceptor(this.f3314s);
        if (this.f3306k) {
            Q.l.c(c0222b, this.f3305j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3298B;
            if (method2 != null) {
                try {
                    method2.invoke(c0222b, this.f3319x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0222b, this.f3319x);
        }
        c0222b.showAsDropDown(this.f3310o, this.f3303f, this.f3304g, this.f3307l);
        this.f3301c.setSelection(-1);
        if ((!this.f3320y || this.f3301c.isInTouchMode()) && (c0278t0 = this.f3301c) != null) {
            c0278t0.setListSelectionHidden(true);
            c0278t0.requestLayout();
        }
        if (this.f3320y) {
            return;
        }
        this.f3317v.post(this.f3316u);
    }

    public final int j() {
        if (this.i) {
            return this.f3304g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f3321z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f3304g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f3321z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f3309n;
        if (d02 == null) {
            this.f3309n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f3300b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f3300b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3309n);
        }
        C0278t0 c0278t0 = this.f3301c;
        if (c0278t0 != null) {
            c0278t0.setAdapter(this.f3300b);
        }
    }

    public C0278t0 q(Context context, boolean z2) {
        return new C0278t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f3321z.getBackground();
        if (background == null) {
            this.f3302e = i;
            return;
        }
        Rect rect = this.f3318w;
        background.getPadding(rect);
        this.f3302e = rect.left + rect.right + i;
    }
}
