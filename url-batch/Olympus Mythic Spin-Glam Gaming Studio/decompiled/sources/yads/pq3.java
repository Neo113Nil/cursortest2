package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class pq3 extends Lambda implements Function0 {
    public final /* synthetic */ sq3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(sq3 sq3Var, AdRequestError adRequestError) {
        super(0);
        this.b = sq3Var;
        this.c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        BannerAdEventListener bannerAdEventListener = this.b.a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(this.c);
        }
        return Unit.INSTANCE;
    }
}
