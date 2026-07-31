package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4381u3 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InterfaceC4466x9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4381u3(String str, boolean z, InterfaceC4466x9 interfaceC4466x9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = z;
        this.d = interfaceC4466x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4381u3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4381u3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                E3 e3 = E3.a;
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                E3 e32 = E3.a;
                if (E3.e()) {
                    int maxRetries = E3.c().getMaxRetries();
                    String str = this.b;
                    Z2 z2 = new Z2(str, this.c, false, maxRetries + 1, 197);
                    InterfaceC4466x9 interfaceC4466x9 = this.d;
                    if (interfaceC4466x9 != null) {
                        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                        ((C4493y9) interfaceC4466x9).a("E3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    InterfaceC4466x9 interfaceC4466x92 = this.d;
                    this.a = 1;
                    if (e32.a(z2, null, interfaceC4466x92, this) == coroutine_suspended) {
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
            InterfaceC4466x9 interfaceC4466x93 = this.d;
            if (interfaceC4466x93 != null) {
                E3 e33 = E3.a;
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x93).b("E3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }
}
