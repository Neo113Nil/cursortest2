package com.inmobi.media;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4408v3 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C4493y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408v3(String str, C4493y9 c4493y9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = c4493y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4408v3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4408v3(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                E3 e3 = E3.a;
                if (E3.e()) {
                    int maxRetries = E3.c().getMaxRetries();
                    String str = this.b;
                    Z2 z2 = new Z2(str, true, false, maxRetries + 1, 193);
                    C4493y9 c4493y9 = this.c;
                    if (c4493y9 != null) {
                        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                        c4493y9.a("E3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C4493y9 c4493y92 = this.c;
                    this.a = 1;
                    if (e3.a(z2, null, c4493y92, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            C4493y9 c4493y93 = this.c;
            if (c4493y93 != null) {
                E3 e32 = E3.a;
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                c4493y93.b("E3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        return Unit.INSTANCE;
    }
}
