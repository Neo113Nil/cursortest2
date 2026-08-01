package B0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import g0.C0133w;
import g0.C0135y;
import g0.T;

/* loaded from: classes.dex */
public final class c extends C0133w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f83q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f84r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i) {
        super(context);
        this.f83q = i;
        this.f84r = obj;
    }

    @Override // g0.C0133w
    public int b(View view, int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g0.C0133w
    public int c(View view, int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g0.C0133w
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f83q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g0.C0133w
    public int e(int i) {
        switch (this.f83q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // g0.C0133w
    public PointF f(int i) {
        switch (this.f83q) {
            case 0:
                ((CarouselLayoutManager) this.f84r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // g0.C0133w
    public void h(View view, T t2) {
        switch (this.f83q) {
            case 1:
                C0135y c0135y = (C0135y) this.f84r;
                int[] a2 = c0135y.a(c0135y.f2568a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2561j;
                    t2.f2368a = i;
                    t2.f2369b = i2;
                    t2.f2370c = ceil;
                    t2.f2371e = decelerateInterpolator;
                    t2.f2372f = true;
                    break;
                }
                break;
            default:
                super.h(view, t2);
                break;
        }
    }
}
