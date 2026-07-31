package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/internal/BiddingPartnerTokenRequest;", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "getPartner", "()Lcom/mobilefuse/sdk/internal/bidding/Partner;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public interface BiddingPartnerTokenRequest extends IMobileFuseBiddingTokenRequest {
    @NotNull
    Partner getPartner();
}
