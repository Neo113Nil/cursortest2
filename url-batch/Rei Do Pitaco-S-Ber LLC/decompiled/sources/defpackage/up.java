package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class up {
    public int a = -1;
    public RecyclerView b;
    public ny c;
    public boolean d;
    public boolean e;
    public View f;
    public final xy g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public up(Context context) {
        xy xyVar = new xy();
        xyVar.d = -1;
        xyVar.f = false;
        xyVar.g = 0;
        xyVar.a = 0;
        xyVar.b = 0;
        xyVar.c = Integer.MIN_VALUE;
        xyVar.e = null;
        this.g = xyVar;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            l8.l("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
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
        ny nyVar = this.c;
        if (nyVar == null || !nyVar.d()) {
            return 0;
        }
        oy oyVar = (oy) view.getLayoutParams();
        return a((view.getLeft() - ((oy) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) oyVar).leftMargin, view.getRight() + ((oy) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) oyVar).rightMargin, nyVar.D(), nyVar.n - nyVar.E(), i);
    }

    public int c(View view, int i) {
        ny nyVar = this.c;
        if (nyVar == null || !nyVar.e()) {
            return 0;
        }
        oy oyVar = (oy) view.getLayoutParams();
        return a((view.getTop() - ((oy) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) oyVar).topMargin, view.getBottom() + ((oy) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) oyVar).bottomMargin, nyVar.F(), nyVar.o - nyVar.C(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof yy) {
            return ((yy) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + yy.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.f0((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        xy xyVar = this.g;
        if (view != null) {
            this.b.getClass();
            dz M = RecyclerView.M(view);
            if ((M != null ? M.b() : -1) == this.a) {
                View view2 = this.f;
                zy zyVar = recyclerView.l0;
                h(view2, xyVar);
                xyVar.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            zy zyVar2 = recyclerView.l0;
            if (this.b.s.v() == 0) {
                i();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f3 = f(this.a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.k = f3;
                            this.o = (int) (f5 * 10000.0f);
                            this.p = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            xyVar.a = (int) (this.o * 1.2f);
                            xyVar.b = (int) (this.p * 1.2f);
                            xyVar.c = (int) (e * 1.2f);
                            xyVar.e = this.i;
                            xyVar.f = true;
                        }
                    }
                    xyVar.d = this.a;
                    i();
                }
            }
            boolean z = xyVar.d >= 0;
            xyVar.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.i0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, xy xyVar) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.k;
        int i2 = 0;
        if (pointF2 != null) {
            float f = pointF2.x;
            if (f != 0.0f) {
                i = f > 0.0f ? 1 : -1;
                int b = b(view, i);
                pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.y;
                    if (f2 != 0.0f) {
                        i2 = f2 > 0.0f ? 1 : -1;
                    }
                }
                int c = c(view, i2);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b * b))) / 0.3356d);
                if (ceil <= 0) {
                    xyVar.a = -b;
                    xyVar.b = -c;
                    xyVar.c = ceil;
                    xyVar.e = this.j;
                    xyVar.f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b2 = b(view, i);
        pointF = this.k;
        if (pointF != null) {
        }
        int c2 = c(view, i2);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c2 * c2) + (b2 * b2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.l0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            ny nyVar = this.c;
            if (nyVar.e == this) {
                nyVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
