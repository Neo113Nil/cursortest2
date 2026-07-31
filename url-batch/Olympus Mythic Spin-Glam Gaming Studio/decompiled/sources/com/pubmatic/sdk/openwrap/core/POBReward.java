package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.ui.POBCoreReward;
import java.util.Objects;

/* loaded from: classes6.dex */
public class POBReward implements POBCoreReward {
    public static final int DEFAULT_REWARD_AMOUNT_VALUE = 0;
    public static final String DEFAULT_REWARD_TYPE_LABEL = "";
    private final String a;
    private final int b;

    public POBReward(@NonNull String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            POBReward pOBReward = (POBReward) obj;
            if (this.b == pOBReward.b && this.a.equals(pOBReward.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pubmatic.sdk.common.ui.POBCoreReward
    public int getAmount() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.ui.POBCoreReward
    @NonNull
    public String getCurrencyType() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    @NonNull
    public String toString() {
        return "POBReward{currencyType='" + this.a + "', amount='" + this.b + "'}";
    }
}
