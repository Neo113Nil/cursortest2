package z0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4673c;

    public C0389c(int i) {
        this.f4671a = i;
    }

    public final int a() {
        switch (this.f4672b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4673c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f2787n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0389c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4672b = i;
        switch (i) {
            case 1:
                this.f4673c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4673c = carouselLayoutManager;
                break;
        }
    }
}
