package g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170x extends C0168v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3004q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3005r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0170x(Object obj, Context context, int i) {
        super(context);
        this.f3004q = i;
        this.f3005r = obj;
    }

    @Override // g0.C0168v
    public int b(View view, int i) {
        switch (this.f3004q) {
            case 1:
                ((CarouselLayoutManager) this.f3005r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g0.C0168v
    public int c(View view, int i) {
        switch (this.f3004q) {
            case 1:
                ((CarouselLayoutManager) this.f3005r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g0.C0168v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f3004q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g0.C0168v
    public int e(int i) {
        switch (this.f3004q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // g0.C0168v
    public PointF f(int i) {
        switch (this.f3004q) {
            case 1:
                ((CarouselLayoutManager) this.f3005r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // g0.C0168v
    public void h(View view, T t2) {
        switch (this.f3004q) {
            case 0:
                C0171y c0171y = (C0171y) this.f3005r;
                int[] a2 = c0171y.a(c0171y.f3006a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2997j;
                    t2.f2806a = i;
                    t2.f2807b = i2;
                    t2.f2808c = ceil;
                    t2.f2809e = decelerateInterpolator;
                    t2.f2810f = true;
                    break;
                }
                break;
            default:
                super.h(view, t2);
                break;
        }
    }
}
