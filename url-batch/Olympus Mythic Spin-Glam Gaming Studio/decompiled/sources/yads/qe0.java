package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final /* synthetic */ class qe0 extends FunctionReferenceImpl implements Function2 {
    public qe0(xx0 xx0Var) {
        super(2, xx0Var, xx0.class, "preload", "preload(Lcom/monetization/ads/common/AdRequestData;Lcom/monetization/ads/fullscreen/cache/FullscreenFormat;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d8 d8Var = (d8) obj;
        px0 px0Var = (px0) obj2;
        xx0 xx0Var = (xx0) this.receiver;
        pn pnVar = (pn) xx0Var.b.get(px0Var);
        if (pnVar != null) {
            BuildersKt__Builders_commonKt.launch$default(xx0Var.a, Dispatchers.getMain(), null, new wx0(xx0Var, d8Var, px0Var, pnVar, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
