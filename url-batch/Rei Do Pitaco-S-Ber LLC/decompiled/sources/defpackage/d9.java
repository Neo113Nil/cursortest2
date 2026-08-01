package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d9 extends ky {
    public final Paint a;
    public final List b;

    public d9() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.ky
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int E;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yo) it.next()).getClass();
            ThreadLocal threadLocal = eb.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                e9 e9Var = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (e9Var.b) {
                    case 0:
                        break;
                    default:
                        i2 = e9Var.c.F();
                        break;
                }
                float f2 = i2;
                e9 e9Var2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (e9Var2.b) {
                    case 0:
                        i = e9Var2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = e9Var2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.C();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                e9 e9Var3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (e9Var3.b) {
                    case 0:
                        i2 = e9Var3.c.D();
                        break;
                }
                float f4 = i2;
                e9 e9Var4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (e9Var4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = e9Var4.c;
                        E = carouselLayoutManager2.n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = e9Var4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, E, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
