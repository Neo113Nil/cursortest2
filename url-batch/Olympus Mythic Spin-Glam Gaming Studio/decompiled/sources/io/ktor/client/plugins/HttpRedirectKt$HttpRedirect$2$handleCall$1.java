package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRedirect.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", l = {97}, m = "HttpRedirect$lambda$2$handleCall")
/* loaded from: classes9.dex */
final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    HttpRedirectKt$HttpRedirect$2$handleCall$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object HttpRedirect$lambda$2$handleCall;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpRedirect$lambda$2$handleCall = HttpRedirectKt.HttpRedirect$lambda$2$handleCall(null, null, null, false, null, this);
        return HttpRedirect$lambda$2$handleCall;
    }
}
