package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class o implements UpdatePolicy {
    public final SystemTimeProvider a;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3.purchaseToken, r2.purchaseToken) != false) goto L22;
     */
    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    @WorkerThread
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, BillingInfo> getBillingInfoToUpdate(@NotNull BillingConfig billingConfig, @NotNull Map<String, ? extends BillingInfo> map, @NotNull BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo != null) {
                }
                if (this.a.currentTimeMillis() - value.purchaseTime > TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                    if (value.type == ProductType.SUBS) {
                    }
                    if (billingInfo != null && value.type == ProductType.SUBS && this.a.currentTimeMillis() - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (this.a.currentTimeMillis() - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public o(@NotNull SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public /* synthetic */ o(SystemTimeProvider systemTimeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
