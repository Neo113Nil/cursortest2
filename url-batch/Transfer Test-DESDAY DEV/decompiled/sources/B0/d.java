package B0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import g0.F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends F {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f85a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86b;

    public d() {
        Paint paint = new Paint();
        this.f85a = paint;
        this.f86b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // g0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F;
        Paint paint = this.f85a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f86b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = C.a.f92a;
            float f2 = 1.0f - RecyclerView.f1570A0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f1570A0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f1570A0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f1570A0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f1570A0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1849q;
                switch (eVar.f88b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = eVar.f89c.G();
                        break;
                }
                float f3 = i;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1849q;
                switch (eVar2.f88b) {
                    case 0:
                        i2 = eVar2.f89c.f2350o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f89c;
                        i2 = carouselLayoutManager.f2350o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f1570A0, f3, RecyclerView.f1570A0, i2, paint);
            } else {
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1849q;
                switch (eVar3.f88b) {
                    case 0:
                        E2 = eVar3.f89c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1849q;
                switch (eVar4.f88b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f89c;
                        F = carouselLayoutManager2.f2349n - carouselLayoutManager2.F();
                        break;
                    default:
                        F = eVar4.f89c.f2349n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f1570A0, F, RecyclerView.f1570A0, paint);
            }
        }
    }
}
