package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonCacheFile.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {33}, m = "invoke")
/* loaded from: classes4.dex */
final class CommonCacheFile$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonCacheFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonCacheFile$invoke$1(CommonCacheFile commonCacheFile, Continuation continuation) {
        super(continuation);
        this.this$0 = commonCacheFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, 0, 0, null, this);
    }
}
