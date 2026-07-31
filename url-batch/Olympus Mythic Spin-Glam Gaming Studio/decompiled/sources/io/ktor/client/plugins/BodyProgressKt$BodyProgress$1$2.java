package io.ktor.client.plugins;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: BodyProgress.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements Function2 {
    /* synthetic */ Object L$0;
    int label;

    BodyProgressKt$BodyProgress$1$2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(continuation);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HttpResponse httpResponse, Continuation continuation) {
        return ((BodyProgressKt$BodyProgress$1$2) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AttributeKey attributeKey;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Attributes attributes = ((HttpResponse) this.L$0).getCall().getRequest().getAttributes();
        attributeKey = BodyProgressKt.DownloadProgressListenerAttributeKey;
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(attributes.getOrNull(attributeKey));
        return null;
    }
}
