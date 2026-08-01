package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107x extends C0105v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2185r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0107x(Object obj, Context context, int i) {
        super(context);
        this.f2184q = i;
        this.f2185r = obj;
    }

    @Override // f0.C0105v
    public int b(View view, int i) {
        switch (this.f2184q) {
            case 1:
                ((CarouselLayoutManager) this.f2185r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0105v
    public int c(View view, int i) {
        switch (this.f2184q) {
            case 1:
                ((CarouselLayoutManager) this.f2185r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0105v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2184q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0105v
    public int e(int i) {
        switch (this.f2184q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0105v
    public PointF f(int i) {
        switch (this.f2184q) {
            case 1:
                ((CarouselLayoutManager) this.f2185r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0105v
    public void h(View view, S s2) {
        switch (this.f2184q) {
            case 0:
                C0108y c0108y = (C0108y) this.f2185r;
                int[] a2 = c0108y.a(c0108y.f2186a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2177j;
                    s2.f1988a = i;
                    s2.f1989b = i2;
                    s2.f1990c = ceil;
                    s2.f1991e = decelerateInterpolator;
                    s2.f1992f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
