package w0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4094c;

    public C0330c(int i) {
        this.f4092a = i;
    }

    public final int a() {
        switch (this.f4093b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4094c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f1973n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0330c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4093b = i;
        switch (i) {
            case 1:
                this.f4094c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f4094c = carouselLayoutManager;
                break;
        }
    }
}
