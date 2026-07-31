package io.ktor.client.plugins;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: BodyProgress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BodyProgressKt$BodyProgress$1$1 extends SuspendLambda implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BodyProgressKt$BodyProgress$1$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, Continuation continuation) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(continuation);
        bodyProgressKt$BodyProgress$1$1.L$0 = httpRequestBuilder;
        bodyProgressKt$BodyProgress$1$1.L$1 = outgoingContent;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AttributeKey attributeKey;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        Attributes attributes = httpRequestBuilder.getAttributes();
        attributeKey = BodyProgressKt.UploadProgressListenerAttributeKey;
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(attributes.getOrNull(attributeKey));
        return null;
    }
}
