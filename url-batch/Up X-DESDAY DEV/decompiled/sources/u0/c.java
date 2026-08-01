package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3811c;

    public c(int i) {
        this.f3809a = i;
    }

    public final int a() {
        switch (this.f3810b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3811c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1968n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3810b = i;
        switch (i) {
            case 1:
                this.f3811c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3811c = carouselLayoutManager;
                break;
        }
    }
}
