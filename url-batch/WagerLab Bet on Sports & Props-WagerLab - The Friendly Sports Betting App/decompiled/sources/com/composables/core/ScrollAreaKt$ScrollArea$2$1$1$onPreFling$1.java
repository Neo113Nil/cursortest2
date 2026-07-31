package com.composables.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ScrollArea.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.ScrollAreaKt$ScrollArea$2$1$1", f = "ScrollArea.kt", i = {0}, l = {219, 223}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
/* loaded from: classes3.dex */
final class ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollAreaKt$ScrollArea$2$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1(ScrollAreaKt$ScrollArea$2$1$1 scrollAreaKt$ScrollArea$2$1$1, Continuation<? super ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = scrollAreaKt$ScrollArea$2$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo922onPreFlingQWom1Mo(0L, this);
    }
}
