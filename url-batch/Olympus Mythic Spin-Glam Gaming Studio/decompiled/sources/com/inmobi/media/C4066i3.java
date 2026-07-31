package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4066i3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3932d3 b;
    public final /* synthetic */ HandlerC4224o3 c;
    public final /* synthetic */ AdConfig.ImaiConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4066i3(C3932d3 c3932d3, HandlerC4224o3 handlerC4224o3, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.b = c3932d3;
        this.c = handlerC4224o3;
        this.d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4066i3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4066i3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3932d3 c3932d3 = this.b;
            this.a = 1;
            obj = c3932d3.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            E3.g.set(false);
            return Unit.INSTANCE;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        return Boxing.boxBoolean(this.c.sendMessageDelayed(obtain, this.d.getPingInterval() * 1000));
    }
}
