package z0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.luckycounter.drinkwater.R;
import g0.AbstractC0136F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388b extends AbstractC0136F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4670b;

    public C0388b() {
        Paint paint = new Paint();
        this.f4669a = paint;
        this.f4670b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g0.AbstractC0136F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4669a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4670b.iterator();
        while (it.hasNext()) {
            ((AbstractC0390d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f230a;
            float f2 = 1.0f - RecyclerView.f1949A0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f1949A0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f1949A0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f1949A0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f1949A0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                C0389c c0389c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2217q;
                switch (c0389c.f4672b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0389c.f4673c.G();
                        break;
                }
                float f3 = i;
                C0389c c0389c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2217q;
                switch (c0389c2.f4672b) {
                    case 0:
                        i2 = c0389c2.f4673c.f2788o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0389c2.f4673c;
                        i2 = carouselLayoutManager.f2788o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f1949A0, f3, RecyclerView.f1949A0, i2, paint);
            } else {
                C0389c c0389c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2217q;
                switch (c0389c3.f4672b) {
                    case 0:
                        E2 = c0389c3.f4673c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                C0389c c0389c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2217q;
                switch (c0389c4.f4672b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0389c4.f4673c;
                        F = carouselLayoutManager2.f2787n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = c0389c4.f4673c.f2787n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f1949A0, F, RecyclerView.f1949A0, paint);
            }
        }
    }
}
