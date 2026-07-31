package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class Bd extends SuspendLambda implements Function2 {
    public final /* synthetic */ Cd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Cd cd, Continuation continuation) {
        super(2, continuation);
        this.a = cd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Bd(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Bd(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC4466x9 l = this.a.l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        Cd cd = this.a;
        Uc uc = cd.i;
        C4261pe c4261pe = cd.f;
        G g = cd.a.b;
        uc.a(c4261pe, new AdMetaInfo(g.e, g.l));
        return Unit.INSTANCE;
    }
}
