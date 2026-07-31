package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BillingClientAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0016\u001a\u00020\u0006H&J\u001c\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0015H&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "", "<init>", "()V", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_isInitialized$unity_ads_defaultRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isInitialized", "()Z", "initialize", "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "", "isReady", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, X3.i.m, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", "getAdapterVersion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class BillingClientAdapter {

    @NotNull
    private final MutableStateFlow _isInitialized = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @NotNull
    public abstract String getAdapterVersion();

    public abstract void initialize(@NotNull BillingInitializationListener billingInitializationListener);

    @Nullable
    public abstract BillingResultResponseCode isFeatureSupported(@Nullable String purchaseType);

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(@NotNull String productId, @NotNull String productType, @NotNull ProductDetailsListener listener);

    public abstract void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(@Nullable BillingClientStateListener billingClientStateListener);

    @NotNull
    /* renamed from: get_isInitialized$unity_ads_defaultRelease, reason: from getter */
    public final MutableStateFlow get_isInitialized() {
        return this._isInitialized;
    }

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }
}
