package com.unity3d.ads.core.domain.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiagnosticEventJob.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {28, 35, 37}, m = "doWork")
/* loaded from: classes9.dex */
final class DiagnosticEventJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiagnosticEventJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiagnosticEventJob$doWork$1(DiagnosticEventJob diagnosticEventJob, Continuation continuation) {
        super(continuation);
        this.this$0 = diagnosticEventJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
