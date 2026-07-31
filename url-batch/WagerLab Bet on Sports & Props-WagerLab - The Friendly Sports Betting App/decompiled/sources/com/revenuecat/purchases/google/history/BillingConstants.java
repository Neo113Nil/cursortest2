package com.revenuecat.purchases.google.history;

import kotlin.Metadata;

/* compiled from: BillingConstants.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/google/history/BillingConstants;", "", "()V", "BILLING_API_VERSION", "", "BILLING_SERVICE_ACTION", "", BillingConstants.INAPP_CONTINUATION_TOKEN, BillingConstants.INAPP_DATA_SIGNATURE_LIST, BillingConstants.INAPP_PURCHASE_DATA_LIST, BillingConstants.RESPONSE_CODE, "VENDING_PACKAGE", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BillingConstants {
    public static final int BILLING_API_VERSION = 7;
    public static final String BILLING_SERVICE_ACTION = "com.android.vending.billing.InAppBillingService.BIND";
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final String INAPP_DATA_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    public static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final BillingConstants INSTANCE = new BillingConstants();
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String VENDING_PACKAGE = "com.android.vending";

    private BillingConstants() {
    }
}
