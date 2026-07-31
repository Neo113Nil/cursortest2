package com.revenuecat.purchases.storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultFileRepository.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.storage.DefaultFileRepository", f = "DefaultFileRepository.kt", i = {0, 0}, l = {131}, m = "downloadFile", n = {"this", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class DefaultFileRepository$downloadFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFileRepository$downloadFile$1(DefaultFileRepository defaultFileRepository, Continuation<? super DefaultFileRepository$downloadFile$1> continuation) {
        super(continuation);
        this.this$0 = defaultFileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object downloadFile;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        downloadFile = this.this$0.downloadFile(null, this);
        return downloadFile;
    }
}
