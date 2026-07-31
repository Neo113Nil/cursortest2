package io.ktor.client.statement;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {147}, m = "bodyAsText")
/* loaded from: classes13.dex */
final class HttpResponseKt$bodyAsText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    HttpResponseKt$bodyAsText$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpResponseKt.bodyAsText(null, null, this);
    }
}
