package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OkHttp3Client.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class OkHttp3Client$executeBlocking$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttp3Client$executeBlocking$1(OkHttp3Client okHttp3Client, HttpRequest httpRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = okHttp3Client;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OkHttp3Client$executeBlocking$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((OkHttp3Client$executeBlocking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OkHttp3Client okHttp3Client = this.this$0;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
