package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpCallValidator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {110}, m = "HttpCallValidator$lambda$2$validateResponse")
/* loaded from: classes11.dex */
final class HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object HttpCallValidator$lambda$2$validateResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpCallValidator$lambda$2$validateResponse = HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(null, null, this);
        return HttpCallValidator$lambda$2$validateResponse;
    }
}
