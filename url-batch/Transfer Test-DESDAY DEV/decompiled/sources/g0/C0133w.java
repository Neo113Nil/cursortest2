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

/* renamed from: g0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0133w {

    /* renamed from: a, reason: collision with root package name */
    public int f2555a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2556b;

    /* renamed from: c, reason: collision with root package name */
    public I f2557c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2558e;

    /* renamed from: f, reason: collision with root package name */
    public View f2559f;

    /* renamed from: g, reason: collision with root package name */
    public final T f2560g;
    public boolean h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f2561j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2562k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2563l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2564m;

    /* renamed from: n, reason: collision with root package name */
    public float f2565n;

    /* renamed from: o, reason: collision with root package name */
    public int f2566o;

    /* renamed from: p, reason: collision with root package name */
    public int f2567p;

    public C0133w(Context context) {
        T t2 = new T();
        t2.d = -1;
        t2.f2372f = false;
        t2.f2373g = 0;
        t2.f2368a = 0;
        t2.f2369b = 0;
        t2.f2370c = Integer.MIN_VALUE;
        t2.f2371e = null;
        this.f2560g = t2;
        this.i = new LinearInterpolator();
        this.f2561j = new DecelerateInterpolator();
        this.f2564m = false;
        this.f2566o = 0;
        this.f2567p = 0;
        this.f2563l = context.getResources().getDisplayMetrics();
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
        I i2 = this.f2557c;
        if (i2 == null || !i2.d()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getLeft() - ((J) view.getLayoutParams()).f2352b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, view.getRight() + ((J) view.getLayoutParams()).f2352b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, i2.E(), i2.f2349n - i2.F(), i);
    }

    public int c(View view, int i) {
        I i2 = this.f2557c;
        if (i2 == null || !i2.e()) {
            return 0;
        }
        J j2 = (J) view.getLayoutParams();
        return a((view.getTop() - ((J) view.getLayoutParams()).f2352b.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getBottom() + ((J) view.getLayoutParams()).f2352b.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin, i2.G(), i2.f2350o - i2.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f2564m) {
            this.f2565n = d(this.f2563l);
            this.f2564m = true;
        }
        return (int) Math.ceil(abs * this.f2565n);
    }

    public PointF f(int i) {
        Object obj = this.f2557c;
        if (obj instanceof U) {
            return ((U) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + U.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f2;
        RecyclerView recyclerView = this.f2556b;
        if (this.f2555a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f2559f == null && this.f2557c != null && (f2 = f(this.f2555a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.f1570A0 || f2.y != RecyclerView.f1570A0) {
                recyclerView.d0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        this.d = false;
        View view = this.f2559f;
        T t2 = this.f2560g;
        if (view != null) {
            this.f2556b.getClass();
            Z L2 = RecyclerView.L(view);
            if ((L2 != null ? L2.b() : -1) == this.f2555a) {
                View view2 = this.f2559f;
                V v2 = recyclerView.f1608e0;
                h(view2, t2);
                t2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2559f = null;
            }
        }
        if (this.f2558e) {
            V v3 = recyclerView.f1608e0;
            if (this.f2556b.f1621m.v() == 0) {
                i();
            } else {
                int i3 = this.f2566o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f2566o = i4;
                int i5 = this.f2567p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f2567p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f4 = f(this.f2555a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.f1570A0 || f4.y != RecyclerView.f1570A0) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.f2562k = f4;
                            this.f2566o = (int) (f6 * 10000.0f);
                            this.f2567p = (int) (f7 * 10000.0f);
                            int e2 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            t2.f2368a = (int) (this.f2566o * 1.2f);
                            t2.f2369b = (int) (this.f2567p * 1.2f);
                            t2.f2370c = (int) (e2 * 1.2f);
                            t2.f2371e = linearInterpolator;
                            t2.f2372f = true;
                        }
                    }
                    t2.d = this.f2555a;
                    i();
                }
            }
            boolean z2 = t2.d >= 0;
            t2.a(recyclerView);
            if (z2 && this.f2558e) {
                this.d = true;
                recyclerView.f1603b0.b();
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
        PointF pointF2 = this.f2562k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != RecyclerView.f1570A0) {
                i = f2 > RecyclerView.f1570A0 ? 1 : -1;
                int b2 = b(view, i);
                pointF = this.f2562k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != RecyclerView.f1570A0) {
                        i2 = f3 > RecyclerView.f1570A0 ? 1 : -1;
                    }
                }
                int c2 = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2561j;
                    t2.f2368a = -b2;
                    t2.f2369b = -c2;
                    t2.f2370c = ceil;
                    t2.f2371e = decelerateInterpolator;
                    t2.f2372f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b22 = b(view, i);
        pointF = this.f2562k;
        if (pointF != null) {
        }
        int c22 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c22 * c22) + (b22 * b22))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f2558e) {
            this.f2558e = false;
            this.f2567p = 0;
            this.f2566o = 0;
            this.f2562k = null;
            this.f2556b.f1608e0.f2374a = -1;
            this.f2559f = null;
            this.f2555a = -1;
            this.d = false;
            I i = this.f2557c;
            if (i.f2342e == this) {
                i.f2342e = null;
            }
            this.f2557c = null;
            this.f2556b = null;
        }
    }
}
