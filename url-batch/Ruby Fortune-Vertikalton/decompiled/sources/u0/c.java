package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3827c;

    public c(int i) {
        this.f3825a = i;
    }

    public final int a() {
        switch (this.f3826b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3827c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1965n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3826b = i;
        switch (i) {
            case 1:
                this.f3827c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3827c = carouselLayoutManager;
                break;
        }
    }
}
