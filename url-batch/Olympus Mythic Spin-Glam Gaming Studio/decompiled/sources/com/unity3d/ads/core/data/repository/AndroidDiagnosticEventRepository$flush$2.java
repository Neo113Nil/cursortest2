package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidDiagnosticEventRepository$flush$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
    int label;
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDiagnosticEventRepository$flush$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidDiagnosticEventRepository;
        this.$events = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidDiagnosticEventRepository$flush$2(this.this$0, this.$events, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidDiagnosticEventRepository$flush$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._diagnosticEvents;
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
            this.label = 1;
            if (mutableSharedFlow.emit(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
