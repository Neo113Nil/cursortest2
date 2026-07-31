package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4092j3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Z2 c;
    public final /* synthetic */ HandlerC4224o3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092j3(Z2 z2, HandlerC4224o3 handlerC4224o3, Continuation continuation) {
        super(2, continuation);
        this.c = z2;
        this.d = handlerC4224o3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4092j3 c4092j3 = new C4092j3(this.c, this.d, continuation);
        c4092j3.b = obj;
        return c4092j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4092j3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            C4328s3 c4328s3 = new C4328s3();
            Z2 z2 = this.c;
            this.b = coroutineScope;
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
        if (((EnumC4069i6) obj) != null) {
            HandlerC4224o3 handlerC4224o3 = this.d;
            Z2 z22 = this.c;
            int i2 = HandlerC4224o3.a;
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = z22;
            handlerC4224o3.sendMessage(obtain);
        } else {
            Z2 z23 = this.c;
            HandlerC4224o3 handlerC4224o32 = this.d;
            E3 e3 = E3.a;
            Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
            String str = z23.b;
            E3.b(z23);
            int i3 = HandlerC4224o3.a;
            handlerC4224o32.b(z23);
        }
        return Unit.INSTANCE;
    }
}
