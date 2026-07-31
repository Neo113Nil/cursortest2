package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventObservers.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/EventObservers;", "", "operativeEventObserver", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "diagnosticEventObserver", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "transactionEventObserver", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "<init>", "(Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;)V", "getOperativeEventObserver", "()Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "getDiagnosticEventObserver", "()Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "getTransactionEventObserver", "()Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EventObservers {

    @NotNull
    private final DiagnosticEventObserver diagnosticEventObserver;

    @NotNull
    private final OperativeEventObserver operativeEventObserver;

    @NotNull
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(@NotNull OperativeEventObserver operativeEventObserver, @NotNull DiagnosticEventObserver diagnosticEventObserver, @NotNull TransactionEventObserver transactionEventObserver) {
        Intrinsics.checkNotNullParameter(operativeEventObserver, "operativeEventObserver");
        Intrinsics.checkNotNullParameter(diagnosticEventObserver, "diagnosticEventObserver");
        Intrinsics.checkNotNullParameter(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    @NotNull
    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    @NotNull
    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    @NotNull
    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull Continuation continuation) {
        EventObservers$invoke$1 eventObservers$invoke$1;
        Object coroutine_suspended;
        int i;
        DiagnosticEventObserver diagnosticEventObserver;
        if (continuation instanceof EventObservers$invoke$1) {
            eventObservers$invoke$1 = (EventObservers$invoke$1) continuation;
            int i2 = eventObservers$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eventObservers$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eventObservers$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eventObservers$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
                    eventObservers$invoke$1.label = 1;
                    if (operativeEventObserver.invoke(eventObservers$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.transactionEventObserver.invoke();
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                diagnosticEventObserver = this.diagnosticEventObserver;
                eventObservers$invoke$1.label = 2;
                if (diagnosticEventObserver.invoke(eventObservers$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.transactionEventObserver.invoke();
                return Unit.INSTANCE;
            }
        }
        eventObservers$invoke$1 = new EventObservers$invoke$1(this, continuation);
        Object obj2 = eventObservers$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eventObservers$invoke$1.label;
        if (i != 0) {
        }
        diagnosticEventObserver = this.diagnosticEventObserver;
        eventObservers$invoke$1.label = 2;
        if (diagnosticEventObserver.invoke(eventObservers$invoke$1) == coroutine_suspended) {
        }
        this.transactionEventObserver.invoke();
        return Unit.INSTANCE;
    }
}
