package com.pubmatic.sdk.common.base;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import java.util.Set;

/* loaded from: classes14.dex */
public abstract class POBBaseBidder<T extends POBAdDescriptor> implements POBBidding<T> {
    private String a;

    @Nullable
    protected POBBidderListener<T> bidderListener;

    public interface CountryFilterConfig {
        @Nullable
        String getCountryFilteringMode();

        @Nullable
        Set<String> getFilteringCountries();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public String getIdentifier() {
        return this.a;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void setBidderListener(@Nullable POBBidderListener<T> pOBBidderListener) {
        this.bidderListener = pOBBidderListener;
    }

    public void setCountryFilterConfig(@Nullable CountryFilterConfig countryFilterConfig) {
    }

    public void setIdentifier(@Nullable String str) {
        this.a = str;
    }
}
