package com.revenuecat.purchases.google.history;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: PurchaseData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseData;", "", "orderId", "", "packageName", "productId", Constants.GP_IAP_PURCHASE_TIME, "", "purchaseState", "", "purchaseToken", FirebaseAnalytics.Param.QUANTITY, "acknowledged", "", Constants.GP_IAP_AUTORENEWING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;IZZ)V", "getAcknowledged", "()Z", "getAutoRenewing", "getOrderId", "()Ljava/lang/String;", "getPackageName", "getProductId", "getPurchaseState", "()I", "getPurchaseTime", "()J", "getPurchaseToken", "getQuantity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PurchaseData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean acknowledged;
    private final boolean autoRenewing;
    private final String orderId;
    private final String packageName;
    private final String productId;
    private final int purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final int quantity;

    public static /* synthetic */ PurchaseData copy$default(PurchaseData purchaseData, String str, String str2, String str3, long j, int i, String str4, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = purchaseData.orderId;
        }
        if ((i3 & 2) != 0) {
            str2 = purchaseData.packageName;
        }
        if ((i3 & 4) != 0) {
            str3 = purchaseData.productId;
        }
        if ((i3 & 8) != 0) {
            j = purchaseData.purchaseTime;
        }
        if ((i3 & 16) != 0) {
            i = purchaseData.purchaseState;
        }
        if ((i3 & 32) != 0) {
            str4 = purchaseData.purchaseToken;
        }
        if ((i3 & 64) != 0) {
            i2 = purchaseData.quantity;
        }
        if ((i3 & 128) != 0) {
            z = purchaseData.acknowledged;
        }
        if ((i3 & 256) != 0) {
            z2 = purchaseData.autoRenewing;
        }
        boolean z3 = z2;
        int i4 = i2;
        int i5 = i;
        long j2 = j;
        String str5 = str3;
        return purchaseData.copy(str, str2, str5, j2, i5, str4, i4, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component7, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final PurchaseData copy(String orderId, String packageName, String productId, long purchaseTime, int purchaseState, String purchaseToken, int quantity, boolean acknowledged, boolean autoRenewing) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new PurchaseData(orderId, packageName, productId, purchaseTime, purchaseState, purchaseToken, quantity, acknowledged, autoRenewing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseData)) {
            return false;
        }
        PurchaseData purchaseData = (PurchaseData) other;
        return Intrinsics.areEqual(this.orderId, purchaseData.orderId) && Intrinsics.areEqual(this.packageName, purchaseData.packageName) && Intrinsics.areEqual(this.productId, purchaseData.productId) && this.purchaseTime == purchaseData.purchaseTime && this.purchaseState == purchaseData.purchaseState && Intrinsics.areEqual(this.purchaseToken, purchaseData.purchaseToken) && this.quantity == purchaseData.quantity && this.acknowledged == purchaseData.acknowledged && this.autoRenewing == purchaseData.autoRenewing;
    }

    public int hashCode() {
        return (((((((((((((((this.orderId.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.productId.hashCode()) * 31) + Long.hashCode(this.purchaseTime)) * 31) + Integer.hashCode(this.purchaseState)) * 31) + this.purchaseToken.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.acknowledged)) * 31) + Boolean.hashCode(this.autoRenewing);
    }

    public String toString() {
        return "PurchaseData(orderId=" + this.orderId + ", packageName=" + this.packageName + ", productId=" + this.productId + ", purchaseTime=" + this.purchaseTime + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", acknowledged=" + this.acknowledged + ", autoRenewing=" + this.autoRenewing + ')';
    }

    public PurchaseData(String orderId, String packageName, String productId, long j, int i, String purchaseToken, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.orderId = orderId;
        this.packageName = packageName;
        this.productId = productId;
        this.purchaseTime = j;
        this.purchaseState = i;
        this.purchaseToken = purchaseToken;
        this.quantity = i2;
        this.acknowledged = z;
        this.autoRenewing = z2;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    /* compiled from: PurchaseData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseData$Companion;", "", "()V", "fromJson", "Lcom/revenuecat/purchases/google/history/PurchaseData;", "json", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseData fromJson(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                String optString = jSONObject.optString("orderId", "");
                Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"orderId\", \"\")");
                String optString2 = jSONObject.optString("packageName", "");
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"packageName\", \"\")");
                String optString3 = jSONObject.optString("productId", "");
                Intrinsics.checkNotNullExpressionValue(optString3, "jsonObject.optString(\"productId\", \"\")");
                long optLong = jSONObject.optLong(Constants.GP_IAP_PURCHASE_TIME, 0L);
                int optInt = jSONObject.optInt("purchaseState", 0);
                String optString4 = jSONObject.optString("purchaseToken", "");
                Intrinsics.checkNotNullExpressionValue(optString4, "jsonObject.optString(\"purchaseToken\", \"\")");
                return new PurchaseData(optString, optString2, optString3, optLong, optInt, optString4, jSONObject.optInt(FirebaseAnalytics.Param.QUANTITY, 1), jSONObject.optBoolean("acknowledged", false), jSONObject.optBoolean(Constants.GP_IAP_AUTORENEWING, false));
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing AIDL purchase data JSON: " + json, th);
                return null;
            }
        }
    }
}
