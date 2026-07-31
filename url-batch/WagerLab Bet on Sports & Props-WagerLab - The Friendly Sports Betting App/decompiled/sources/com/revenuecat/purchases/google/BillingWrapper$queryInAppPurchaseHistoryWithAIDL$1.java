package com.revenuecat.purchases.google;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.history.PurchaseHistoryManager;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1", f = "BillingWrapper.kt", i = {4}, l = {397, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 419, 419, TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "invokeSuspend", n = {"e"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<StoreTransaction>, Unit> $onReceivePurchaseHistory;
    final /* synthetic */ Function1<PurchasesError, Unit> $onReceivePurchaseHistoryError;
    Object L$0;
    int label;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1(BillingWrapper billingWrapper, Function1<? super List<StoreTransaction>, Unit> function1, Function1<? super PurchasesError, Unit> function12, Continuation<? super BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1> continuation) {
        super(2, continuation);
        this.this$0 = billingWrapper;
        this.$onReceivePurchaseHistory = function1;
        this.$onReceivePurchaseHistoryError = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1(this.this$0, this.$onReceivePurchaseHistory, this.$onReceivePurchaseHistoryError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r1.disconnect(r8) != r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PurchaseHistoryManager purchaseHistoryManager;
        Throwable th;
        Object th2;
        PurchaseHistoryManager purchaseHistoryManager2;
        Handler handler;
        PurchaseHistoryManager purchaseHistoryManager3;
        PurchaseHistoryManager purchaseHistoryManager4;
        Handler handler2;
        Handler handler3;
        PurchaseHistoryManager purchaseHistoryManager5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Throwable th3) {
                purchaseHistoryManager = this.this$0.purchaseHistoryManager;
                this.L$0 = th3;
                this.label = 4;
                if (purchaseHistoryManager.disconnect(this) != coroutine_suspended) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                purchaseHistoryManager2 = this.this$0.purchaseHistoryManager;
                this.L$0 = th4;
                this.label = 5;
            } catch (Throwable th5) {
                th = th4;
                th2 = th5;
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error disconnecting from purchase history manager: " + th2, th);
                handler = this.this$0.mainHandler;
                final BillingWrapper billingWrapper = this.this$0;
                final Function1<List<StoreTransaction>, Unit> function1 = this.$onReceivePurchaseHistory;
                final Function1<PurchasesError, Unit> function12 = this.$onReceivePurchaseHistoryError;
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.this.queryPurchaseHistoryAsync("inapp", function1, function12, false);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            purchaseHistoryManager3 = this.this$0.purchaseHistoryManager;
            this.label = 1;
            obj = purchaseHistoryManager3.connect(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    final List list = (List) obj;
                    handler3 = this.this$0.mainHandler;
                    final Function1<List<StoreTransaction>, Unit> function13 = this.$onReceivePurchaseHistory;
                    handler3.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function1.this.invoke(list);
                        }
                    });
                    purchaseHistoryManager5 = this.this$0.purchaseHistoryManager;
                    this.label = 3;
                    if (purchaseHistoryManager5.disconnect(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 4) {
                    Throwable th6 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th6;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th7) {
                    th2 = th7;
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error disconnecting from purchase history manager: " + th2, th);
                    handler = this.this$0.mainHandler;
                    final BillingWrapper billingWrapper2 = this.this$0;
                    final Function1 function14 = this.$onReceivePurchaseHistory;
                    final Function1 function122 = this.$onReceivePurchaseHistoryError;
                    handler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", function14, function122, false);
                        }
                    });
                    return Unit.INSTANCE;
                }
                handler = this.this$0.mainHandler;
                final BillingWrapper billingWrapper22 = this.this$0;
                final Function1 function142 = this.$onReceivePurchaseHistory;
                final Function1 function1222 = this.$onReceivePurchaseHistoryError;
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.this.queryPurchaseHistoryAsync("inapp", function142, function1222, false);
                    }
                });
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            handler2 = this.this$0.mainHandler;
            final BillingWrapper billingWrapper3 = this.this$0;
            final Function1<List<StoreTransaction>, Unit> function15 = this.$onReceivePurchaseHistory;
            final Function1<PurchasesError, Unit> function16 = this.$onReceivePurchaseHistoryError;
            handler2.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BillingWrapper.this.queryPurchaseHistoryAsync("inapp", function15, function16, false);
                }
            });
            return Unit.INSTANCE;
        }
        purchaseHistoryManager4 = this.this$0.purchaseHistoryManager;
        this.label = 2;
        obj = purchaseHistoryManager4.queryAllPurchaseHistory("inapp", this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        final List list2 = (List) obj;
        handler3 = this.this$0.mainHandler;
        final Function1 function132 = this.$onReceivePurchaseHistory;
        handler3.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Function1.this.invoke(list2);
            }
        });
        purchaseHistoryManager5 = this.this$0.purchaseHistoryManager;
        this.label = 3;
        if (purchaseHistoryManager5.disconnect(this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
