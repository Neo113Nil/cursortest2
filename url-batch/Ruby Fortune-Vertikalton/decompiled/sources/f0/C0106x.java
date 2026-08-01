package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106x extends C0104v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2178q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2179r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106x(Object obj, Context context, int i) {
        super(context);
        this.f2178q = i;
        this.f2179r = obj;
    }

    @Override // f0.C0104v
    public int b(View view, int i) {
        switch (this.f2178q) {
            case 1:
                ((CarouselLayoutManager) this.f2179r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0104v
    public int c(View view, int i) {
        switch (this.f2178q) {
            case 1:
                ((CarouselLayoutManager) this.f2179r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0104v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2178q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0104v
    public int e(int i) {
        switch (this.f2178q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0104v
    public PointF f(int i) {
        switch (this.f2178q) {
            case 1:
                ((CarouselLayoutManager) this.f2179r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0104v
    public void h(View view, S s2) {
        switch (this.f2178q) {
            case 0:
                C0107y c0107y = (C0107y) this.f2179r;
                int[] a2 = c0107y.a(c0107y.f2180a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2171j;
                    s2.f1982a = i;
                    s2.f1983b = i2;
                    s2.f1984c = ceil;
                    s2.f1985e = decelerateInterpolator;
                    s2.f1986f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
