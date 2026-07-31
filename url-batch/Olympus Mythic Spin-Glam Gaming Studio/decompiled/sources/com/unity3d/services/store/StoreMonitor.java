package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StoreMonitor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ(\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J2\u0010!\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010#2\u0006\u0010$\u001a\u00020%J&\u0010&\u001a\u00020\u00102\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00170(j\b\u0012\u0004\u0012\u00020\u0017`)2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006-"}, d2 = {"Lcom/unity3d/services/store/StoreMonitor;", "", "storeExceptionHandler", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "<init>", "(Lcom/unity3d/services/store/core/StoreExceptionHandler;)V", "storeBilling", "Lcom/unity3d/services/store/gpbl/StoreBilling;", "storeLifecycleListener", "Lcom/unity3d/services/store/core/StoreLifecycleListener;", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isInitialized", "()Z", "initialize", "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "isFeatureSupported", "", "operationId", "purchaseType", "", "featureSupportedListener", "Lcom/unity3d/services/store/gpbl/listeners/FeatureSupportedListener;", "getPurchases", "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "getPurchaseHistory", "maxPurchases", "purchaseHistoryResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseHistoryResponseListener;", "getSkuDetails", "skuList", "", "skuDetailsResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/SkuDetailsResponseListener;", "startPurchaseTracking", "purchaseTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "storeEventListener", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "stopPurchaseTracking", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StoreMonitor {

    @NotNull
    private final MutableStateFlow _isInitialized;

    @Nullable
    private StoreBilling storeBilling;

    @NotNull
    private final StoreExceptionHandler storeExceptionHandler;

    @Nullable
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(@NotNull StoreExceptionHandler storeExceptionHandler) {
        Intrinsics.checkNotNullParameter(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }

    public final void initialize(@NotNull BillingInitializationListener billingInitializationListener) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        this._isInitialized.setValue(Boolean.TRUE);
    }

    public final int isFeatureSupported(int operationId, @Nullable String purchaseType, @NotNull FeatureSupportedListener featureSupportedListener) {
        Intrinsics.checkNotNullParameter(featureSupportedListener, "featureSupportedListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            r0 = storeBilling != null ? storeBilling.isFeatureSupported(purchaseType) : -1;
            featureSupportedListener.onFeatureSupported(r0);
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, operationId, e);
        }
        return r0;
    }

    public final void getPurchases(int operationId, @Nullable String purchaseType, @NotNull PurchasesResponseListener purchasesResponseListener) {
        Intrinsics.checkNotNullParameter(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (storeBilling != null) {
                storeBilling.getPurchases(purchaseType, purchasesResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, operationId, e);
        }
    }

    public final void getPurchaseHistory(int operationId, @Nullable String purchaseType, int maxPurchases, @NotNull PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        Intrinsics.checkNotNullParameter(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(purchaseType, maxPurchases, purchaseHistoryResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, operationId, e);
        }
    }

    public final void getSkuDetails(int operationId, @Nullable String purchaseType, @Nullable List<String> skuList, @NotNull SkuDetailsResponseListener skuDetailsResponseListener) {
        Intrinsics.checkNotNullParameter(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(purchaseType, skuList, skuDetailsResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, operationId, e);
        }
    }

    public final void startPurchaseTracking(@NotNull ArrayList<String> purchaseTypes, @NotNull StoreEventListener storeEventListener) {
        Intrinsics.checkNotNullParameter(purchaseTypes, "purchaseTypes");
        Intrinsics.checkNotNullParameter(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        Intrinsics.checkNotNull(storeBilling);
        this.storeLifecycleListener = new StoreLifecycleListener(purchaseTypes, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
