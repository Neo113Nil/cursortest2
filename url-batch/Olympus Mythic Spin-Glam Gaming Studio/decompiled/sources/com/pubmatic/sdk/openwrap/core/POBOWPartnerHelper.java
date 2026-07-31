package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.util.Set;

/* loaded from: classes.dex */
public class POBOWPartnerHelper {

    private static class a implements POBBaseBidder.CountryFilterConfig {
        private final POBProfileInfo a;

        a(POBProfileInfo pOBProfileInfo) {
            this.a = pOBProfileInfo;
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        public String getCountryFilteringMode() {
            return this.a.getCountryFilteringMode();
        }

        @Override // com.pubmatic.sdk.common.base.POBBaseBidder.CountryFilterConfig
        public Set getFilteringCountries() {
            return this.a.getFilteringCountries();
        }
    }

    @NonNull
    public static POBManager createPOBManager(@NonNull Context context, @NonNull POBRequest pOBRequest, @Nullable POBProfileInfo pOBProfileInfo) {
        POBManager pOBManager = new POBManager(pOBRequest, context);
        pOBManager.setIdentifier("OpenWrap");
        if (pOBProfileInfo != null) {
            pOBManager.setCountryFilterConfig(new a(pOBProfileInfo));
        }
        return pOBManager;
    }
}
