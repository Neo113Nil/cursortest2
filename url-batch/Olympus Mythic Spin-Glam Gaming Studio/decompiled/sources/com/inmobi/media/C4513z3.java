package com.inmobi.media;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4513z3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;
    public final /* synthetic */ InterfaceC4466x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4513z3(Z2 z2, InterfaceC4466x9 interfaceC4466x9, Continuation continuation) {
        super(2, continuation);
        this.b = z2;
        this.c = interfaceC4466x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4513z3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4513z3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            E3 e3 = E3.a;
            SystemClock.elapsedRealtime();
            if (this.b.e) {
                InterfaceC4466x9 interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                    Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                    ((C4493y9) interfaceC4466x9).c("E3", "ping in web view");
                }
                new C4276q3(E3.l).a(this.b);
                return Unit.INSTANCE;
            }
            InterfaceC4466x9 interfaceC4466x92 = this.c;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x92).c("E3", "ping in http executor");
            }
            C4328s3 c4328s3 = new C4328s3();
            Z2 z2 = this.b;
            this.a = 1;
            obj = c4328s3.a(z2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        EnumC4069i6 enumC4069i6 = (EnumC4069i6) obj;
        if (enumC4069i6 != null) {
            E3.l.a(this.b, enumC4069i6);
        } else {
            E3.l.a(this.b);
        }
        return Unit.INSTANCE;
    }
}
