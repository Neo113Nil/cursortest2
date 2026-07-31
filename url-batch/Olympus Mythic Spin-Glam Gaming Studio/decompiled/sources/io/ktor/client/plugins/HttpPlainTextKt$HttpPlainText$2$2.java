package io.ktor.client.plugins;

import io.ktor.client.plugins.api.TransformResponseBodyContext;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.io.Source;

/* compiled from: HttpPlainText.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements Function5 {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainTextKt$HttpPlainText$2$2(Charset charset, Continuation continuation) {
        super(5, continuation);
        this.$responseCharsetFallback = charset;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(TransformResponseBodyContext transformResponseBodyContext, HttpResponse httpResponse, ByteReadChannel byteReadChannel, TypeInfo typeInfo, Continuation continuation) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, continuation);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = httpResponse;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = byteReadChannel;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = typeInfo;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HttpResponse httpResponse;
        String HttpPlainText$lambda$6$read;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HttpResponse httpResponse2 = (HttpResponse) this.L$0;
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$1;
            if (!Intrinsics.areEqual(((TypeInfo) this.L$2).getType(), Reflection.getOrCreateKotlinClass(String.class))) {
                return null;
            }
            this.L$0 = httpResponse2;
            this.L$1 = null;
            this.label = 1;
            Object readRemaining = ByteReadChannelOperationsKt.readRemaining(byteReadChannel, this);
            if (readRemaining == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpResponse = httpResponse2;
            obj = readRemaining;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpResponse = (HttpResponse) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        HttpPlainText$lambda$6$read = HttpPlainTextKt.HttpPlainText$lambda$6$read(this.$responseCharsetFallback, httpResponse.getCall(), (Source) obj);
        return HttpPlainText$lambda$6$read;
    }
}
