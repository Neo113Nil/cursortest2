package com.pubmatic.sdk.common.base;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* loaded from: classes4.dex */
public interface POBPartnerInstantiator<T extends POBAdDescriptor> {
    @Nullable
    POBBidding<T> getBidder();
}
