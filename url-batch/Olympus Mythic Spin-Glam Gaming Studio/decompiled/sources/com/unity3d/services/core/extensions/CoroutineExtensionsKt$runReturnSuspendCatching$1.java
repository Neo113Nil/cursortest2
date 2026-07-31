package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineExtensions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", l = {49}, m = "runReturnSuspendCatching")
/* loaded from: classes9.dex */
final class CoroutineExtensionsKt$runReturnSuspendCatching$1<R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    CoroutineExtensionsKt$runReturnSuspendCatching$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runReturnSuspendCatching = CoroutineExtensionsKt.runReturnSuspendCatching(null, this);
        return runReturnSuspendCatching == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runReturnSuspendCatching : Result.m8022boximpl(runReturnSuspendCatching);
    }
}
