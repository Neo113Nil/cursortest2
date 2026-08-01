package w0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import f0.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329b extends F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4091b;

    public C0329b() {
        Paint paint = new Paint();
        this.f4090a = paint;
        this.f4091b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // f0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f4090a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f4091b.iterator();
        while (it.hasNext()) {
            ((AbstractC0331d) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f52a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                C0330c c0330c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1623q;
                switch (c0330c.f4093b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0330c.f4094c.G();
                        break;
                }
                float f3 = i;
                C0330c c0330c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1623q;
                switch (c0330c2.f4093b) {
                    case 0:
                        i2 = c0330c2.f4094c.f1974o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0330c2.f4094c;
                        i2 = carouselLayoutManager.f1974o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                C0330c c0330c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1623q;
                switch (c0330c3.f4093b) {
                    case 0:
                        E2 = c0330c3.f4094c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                C0330c c0330c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1623q;
                switch (c0330c4.f4093b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0330c4.f4094c;
                        F = carouselLayoutManager2.f1973n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = c0330c4.f4094c.f1973n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, F, 0.0f, paint);
            }
        }
    }
}
