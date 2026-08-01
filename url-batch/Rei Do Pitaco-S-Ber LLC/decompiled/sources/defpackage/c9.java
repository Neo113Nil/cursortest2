package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c9 extends up {
    public final /* synthetic */ int q = 1;

    public /* synthetic */ c9(Context context) {
        super(context);
    }

    @Override // defpackage.up
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.up
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.up
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.up
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }

    public c9(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
