package io.ktor.client.plugins;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ boolean $expectSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCallValidatorKt$HttpCallValidator$2$1(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$expectSuccess = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z) {
        return z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, continuation);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(httpRequestBuilder, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Attributes attributes = ((HttpRequestBuilder) this.L$0).getAttributes();
        AttributeKey expectSuccessAttributeKey = HttpCallValidatorKt.getExpectSuccessAttributeKey();
        final boolean z = this.$expectSuccess;
        attributes.computeIfAbsent(expectSuccessAttributeKey, new Function0() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                boolean invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = HttpCallValidatorKt$HttpCallValidator$2$1.invokeSuspend$lambda$0(z);
                return Boolean.valueOf(invokeSuspend$lambda$0);
            }
        });
        return Unit.INSTANCE;
    }
}
