package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: TransactionEventManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class TransactionEventManager$invoke$1 extends SuspendLambda implements Function2 {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = transactionEventManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransactionEventManager$invoke$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TransactionEventManager$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        BillingClientAdapter billingClientAdapter;
        BillingClientAdapter billingClientAdapter2;
        SessionRepository sessionRepository;
        BillingClientAdapter billingClientAdapter3;
        BillingClientAdapter billingClientAdapter4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final MutableStateFlow hasBeenResumed = StateFlowKt.MutableStateFlow(Boolean.FALSE);

                    public final MutableStateFlow getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    private final void tryResume() {
                        Object value;
                        Boolean bool;
                        if (CancellableContinuation.this.isActive()) {
                            MutableStateFlow mutableStateFlow = this.hasBeenResumed;
                            do {
                                value = mutableStateFlow.getValue();
                                bool = (Boolean) value;
                                bool.booleanValue();
                            } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                        }
                    }

                    private final void tryResumeWithException(Exception exception) {
                        Object value;
                        Boolean bool;
                        if (CancellableContinuation.this.isActive()) {
                            MutableStateFlow mutableStateFlow = this.hasBeenResumed;
                            do {
                                value = mutableStateFlow.getValue();
                                bool = (Boolean) value;
                                bool.booleanValue();
                            } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(exception)));
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResult) {
                        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                            tryResumeWithException(new TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
                        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        transactionEventManager.onPurchasesReceived(billingResult, purchases, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager2 = this.this$0;
            billingClientAdapter3.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda0
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager$invoke$1.invokeSuspend$lambda$1(TransactionEventManager.this, billingResultBridge, list);
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager3 = this.this$0;
            billingClientAdapter4.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$$ExternalSyntheticLambda1
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager$invoke$1.invokeSuspend$lambda$2(TransactionEventManager.this, billingResultBridge, list);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }
}
