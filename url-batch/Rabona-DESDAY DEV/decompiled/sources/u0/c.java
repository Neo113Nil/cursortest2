package u0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f3833c;

    public c(int i) {
        this.f3831a = i;
    }

    public final int a() {
        switch (this.f3832b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f3833c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1971n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f3832b = i;
        switch (i) {
            case 1:
                this.f3833c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f3833c = carouselLayoutManager;
                break;
        }
    }
}
