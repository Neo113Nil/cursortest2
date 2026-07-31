package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.media3.common.MimeTypes;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.google.history.PurchaseHistoryManager;
import com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingFactory.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/BillingFactory;", "", "()V", "createBilling", "Lcom/revenuecat/purchases/common/BillingAbstract;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "cache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "finishTransactions", "", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "stateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "pendingTransactionsForPrepaidPlansEnabled", "backend", "Lcom/revenuecat/purchases/common/Backend;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    /* compiled from: BillingFactory.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.TEST_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache cache, boolean finishTransactions, DiagnosticsTracker diagnosticsTrackerIfEnabled, PurchasesStateProvider stateProvider, boolean pendingTransactionsForPrepaidPlansEnabled, Backend backend) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(backendHelper, "backendHelper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(backend, "backend");
        int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i == 1) {
            return new SimulatedStoreBillingWrapper(cache, new Handler(application.getMainLooper()), stateProvider, backend, null, 16, null);
        }
        if (i == 2) {
            Application application2 = application;
            return new BillingWrapper(new BillingWrapper.ClientFactory(application2, pendingTransactionsForPrepaidPlansEnabled), new Handler(application.getMainLooper()), cache, diagnosticsTrackerIfEnabled, stateProvider, new PurchaseHistoryManager(application2), null, null, false, 448, null);
        }
        if (i == 3) {
            try {
                Context applicationContext = application.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, cache, finishTransactions, new Handler(application.getMainLooper()), backendHelper, stateProvider, diagnosticsTrackerIfEnabled);
            } catch (NoClassDefFoundError e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Make sure purchases-amazon is added as dependency", e);
                throw e;
            }
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Incompatible store (" + store + ") used", null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
