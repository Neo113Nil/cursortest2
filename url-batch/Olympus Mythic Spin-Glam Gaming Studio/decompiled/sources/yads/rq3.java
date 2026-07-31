package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class rq3 extends Lambda implements Function0 {
    public final /* synthetic */ sq3 b;
    public final /* synthetic */ xq3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq3(sq3 sq3Var, xq3 xq3Var) {
        super(0);
        this.b = sq3Var;
        this.c = xq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        BannerAdEventListener bannerAdEventListener = this.b.a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(this.c);
        }
        return Unit.INSTANCE;
    }
}
