package yads;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class p22 extends Lambda implements Function0 {
    public final /* synthetic */ r22 b;
    public final /* synthetic */ MediatedNativeAd c;
    public final /* synthetic */ dq2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p22(r22 r22Var, MediatedNativeAd mediatedNativeAd, dq2 dq2Var) {
        super(0);
        this.b = r22Var;
        this.c = mediatedNativeAd;
        this.d = dq2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a(this.c, this.d);
        return Unit.INSTANCE;
    }
}
