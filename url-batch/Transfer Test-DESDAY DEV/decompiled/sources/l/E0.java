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
import k.InterfaceC0149C;

/* loaded from: classes.dex */
public class E0 implements InterfaceC0149C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2865A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2866B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2867a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2868b;

    /* renamed from: c, reason: collision with root package name */
    public C0233r0 f2869c;

    /* renamed from: f, reason: collision with root package name */
    public int f2871f;

    /* renamed from: g, reason: collision with root package name */
    public int f2872g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2873j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2874k;

    /* renamed from: n, reason: collision with root package name */
    public B0 f2877n;

    /* renamed from: o, reason: collision with root package name */
    public View f2878o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2879p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2880q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2885v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2887x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2888y;

    /* renamed from: z, reason: collision with root package name */
    public final C0179A f2889z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2870e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2875l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2876m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f2881r = new A0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final D0 f2882s = new D0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0 f2883t = new C0(this);

    /* renamed from: u, reason: collision with root package name */
    public final A0 f2884u = new A0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2886w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2865A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2866B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public E0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2867a = context;
        this.f2885v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2148o, i, 0);
        this.f2871f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2872g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0179A c0179a = new C0179A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2152s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0179a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0179a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : T.e.w(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2889z = c0179a;
        c0179a.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        return this.f2889z.isShowing();
    }

    public final void c(int i) {
        this.f2871f = i;
    }

    public final int d() {
        return this.f2871f;
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        C0179A c0179a = this.f2889z;
        c0179a.dismiss();
        c0179a.setContentView(null);
        this.f2869c = null;
        this.f2885v.removeCallbacks(this.f2881r);
    }

    @Override // k.InterfaceC0149C
    public final C0233r0 e() {
        return this.f2869c;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        int i;
        int paddingBottom;
        C0233r0 c0233r0;
        C0233r0 c0233r02 = this.f2869c;
        C0179A c0179a = this.f2889z;
        Context context = this.f2867a;
        if (c0233r02 == null) {
            C0233r0 p2 = p(context, !this.f2888y);
            this.f2869c = p2;
            p2.setAdapter(this.f2868b);
            this.f2869c.setOnItemClickListener(this.f2879p);
            this.f2869c.setFocusable(true);
            this.f2869c.setFocusableInTouchMode(true);
            this.f2869c.setOnItemSelectedListener(new C0245x0(this));
            this.f2869c.setOnScrollListener(this.f2883t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2880q;
            if (onItemSelectedListener != null) {
                this.f2869c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0179a.setContentView(this.f2869c);
        }
        Drawable background = c0179a.getBackground();
        Rect rect = this.f2886w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2872g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0247y0.a(c0179a, this.f2878o, this.f2872g, c0179a.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2870e;
            int a3 = this.f2869c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2869c.getPaddingBottom() + this.f2869c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2889z.getInputMethodMode() == 2;
        Q.m.d(c0179a, this.h);
        if (c0179a.isShowing()) {
            if (this.f2878o.isAttachedToWindow()) {
                int i5 = this.f2870e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2878o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0179a.setWidth(this.f2870e == -1 ? -1 : 0);
                        c0179a.setHeight(0);
                    } else {
                        c0179a.setWidth(this.f2870e == -1 ? -1 : 0);
                        c0179a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0179a.setOutsideTouchable(true);
                View view = this.f2878o;
                int i6 = this.f2871f;
                int i7 = this.f2872g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0179a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2870e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2878o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0179a.setWidth(i8);
        c0179a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2865A;
            if (method != null) {
                try {
                    method.invoke(c0179a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0249z0.b(c0179a, true);
        }
        c0179a.setOutsideTouchable(true);
        c0179a.setTouchInterceptor(this.f2882s);
        if (this.f2874k) {
            Q.m.c(c0179a, this.f2873j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2866B;
            if (method2 != null) {
                try {
                    method2.invoke(c0179a, this.f2887x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0249z0.a(c0179a, this.f2887x);
        }
        c0179a.showAsDropDown(this.f2878o, this.f2871f, this.f2872g, this.f2875l);
        this.f2869c.setSelection(-1);
        if ((!this.f2888y || this.f2869c.isInTouchMode()) && (c0233r0 = this.f2869c) != null) {
            c0233r0.setListSelectionHidden(true);
            c0233r0.requestLayout();
        }
        if (this.f2888y) {
            return;
        }
        this.f2885v.post(this.f2884u);
    }

    public final int j() {
        if (this.i) {
            return this.f2872g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2889z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2872g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2889z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        B0 b02 = this.f2877n;
        if (b02 == null) {
            this.f2877n = new B0(this);
        } else {
            ListAdapter listAdapter2 = this.f2868b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(b02);
            }
        }
        this.f2868b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2877n);
        }
        C0233r0 c0233r0 = this.f2869c;
        if (c0233r0 != null) {
            c0233r0.setAdapter(this.f2868b);
        }
    }

    public C0233r0 p(Context context, boolean z2) {
        return new C0233r0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2889z.getBackground();
        if (background == null) {
            this.f2870e = i;
            return;
        }
        Rect rect = this.f2886w;
        background.getPadding(rect);
        this.f2870e = rect.left + rect.right + i;
    }
}
