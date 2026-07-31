package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ts3 extends Lambda implements Function0 {
    public final /* synthetic */ us3 b;
    public final /* synthetic */ com.yandex.mobile.ads.nativeads.g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(us3 us3Var, com.yandex.mobile.ads.nativeads.g gVar) {
        super(0);
        this.b = us3Var;
        this.c = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a.onAdLoaded(this.c);
        return Unit.INSTANCE;
    }
}
