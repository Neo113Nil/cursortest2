package g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0168v {

    /* renamed from: a, reason: collision with root package name */
    public int f2991a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2992b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0139I f2993c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2994e;

    /* renamed from: f, reason: collision with root package name */
    public View f2995f;

    /* renamed from: g, reason: collision with root package name */
    public final T f2996g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2997j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2998k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3000m;

    /* renamed from: n, reason: collision with root package name */
    public float f3001n;

    /* renamed from: o, reason: collision with root package name */
    public int f3002o;

    /* renamed from: p, reason: collision with root package name */
    public int f3003p;

    public C0168v(Context context) {
        T t2 = new T();
        t2.d = -1;
        t2.f2810f = false;
        t2.f2811g = 0;
        t2.f2806a = 0;
        t2.f2807b = 0;
        t2.f2808c = Integer.MIN_VALUE;
        t2.f2809e = null;
        this.f2996g = t2;
        this.i = new LinearInterpolator();
        this.f2997j = new DecelerateInterpolator();
        this.f3000m = false;
        this.f3002o = 0;
        this.f3003p = 0;
        this.f2999l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC0139I abstractC0139I = this.f2993c;
        if (abstractC0139I == null || !abstractC0139I.d()) {
            return 0;
        }
        C0140J c0140j = (C0140J) view.getLayoutParams();
        return a((view.getLeft() - ((C0140J) view.getLayoutParams()).f2790b.left) - ((ViewGroup.MarginLayoutParams) c0140j).leftMargin, view.getRight() + ((C0140J) view.getLayoutParams()).f2790b.right + ((ViewGroup.MarginLayoutParams) c0140j).rightMargin, abstractC0139I.E(), abstractC0139I.f2787n - abstractC0139I.F(), i);
    }

    public int c(View view, int i) {
        AbstractC0139I abstractC0139I = this.f2993c;
        if (abstractC0139I == null || !abstractC0139I.e()) {
            return 0;
        }
        C0140J c0140j = (C0140J) view.getLayoutParams();
        return a((view.getTop() - ((C0140J) view.getLayoutParams()).f2790b.top) - ((ViewGroup.MarginLayoutParams) c0140j).topMargin, view.getBottom() + ((C0140J) view.getLayoutParams()).f2790b.bottom + ((ViewGroup.MarginLayoutParams) c0140j).bottomMargin, abstractC0139I.G(), abstractC0139I.f2788o - abstractC0139I.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f3000m) {
            this.f3001n = d(this.f2999l);
            this.f3000m = true;
        }
        return (int) Math.ceil(abs * this.f3001n);
    }

    public PointF f(int i) {
        Object obj = this.f2993c;
        if (obj instanceof U) {
            return ((U) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + U.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2992b;
        if (this.f2991a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2995f == null && this.f2993c != null && (f2 = f(this.f2991a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.f1949A0 || f2.y != RecyclerView.f1949A0) {
                recyclerView.d0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2995f;
        T t2 = this.f2996g;
        if (view != null) {
            this.f2992b.getClass();
            Z L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.b() : -1) == this.f2991a) {
                View view2 = this.f2995f;
                V v2 = recyclerView.f1987e0;
                h(view2, t2);
                t2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2995f = null;
            }
        }
        if (this.f2994e) {
            V v3 = recyclerView.f1987e0;
            if (this.f2992b.f2000m.v() == 0) {
                i();
            } else {
                int i3 = this.f3002o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3002o = i4;
                int i5 = this.f3003p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3003p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2991a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.f1949A0 || f4.y != RecyclerView.f1949A0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2998k = f4;
                            this.f3002o = (int) (f6 * 10000.0f);
                            this.f3003p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            t2.f2806a = (int) (this.f3002o * 1.2f);
                            t2.f2807b = (int) (this.f3003p * 1.2f);
                            t2.f2808c = (int) (e2 * 1.2f);
                            t2.f2809e = linearInterpolator;
                            t2.f2810f = true;
                        }
                    }
                    t2.d = this.f2991a;
                    i();
                }
            }
            boolean z2 = t2.d >= 0;
            t2.a(recyclerView);
            if (z2 && this.f2994e) {
                this.d = true;
                recyclerView.f1982b0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, T t2) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f2998k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.f1949A0) {
                i = f2 > RecyclerView.f1949A0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2998k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.f1949A0) {
                        i2 = f3 > RecyclerView.f1949A0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2997j;
                    t2.f2806a = -b2;
                    t2.f2807b = -c2;
                    t2.f2808c = ceil;
                    t2.f2809e = decelerateInterpolator;
                    t2.f2810f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2998k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2994e) {
            this.f2994e = false;
            this.f3003p = 0;
            this.f3002o = 0;
            this.f2998k = null;
            this.f2992b.f1987e0.f2812a = -1;
            this.f2995f = null;
            this.f2991a = -1;
            this.d = false;
            AbstractC0139I abstractC0139I = this.f2993c;
            if (abstractC0139I.f2780e == this) {
                abstractC0139I.f2780e = null;
            }
            this.f2993c = null;
            this.f2992b = null;
        }
    }
}
