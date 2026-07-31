package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class ss3 extends Lambda implements Function0 {
    public final /* synthetic */ us3 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss3(us3 us3Var, AdRequestError adRequestError) {
        super(0);
        this.b = us3Var;
        this.c = adRequestError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onAdFailedToLoad(this.c);
        return Unit.INSTANCE;
    }
}
