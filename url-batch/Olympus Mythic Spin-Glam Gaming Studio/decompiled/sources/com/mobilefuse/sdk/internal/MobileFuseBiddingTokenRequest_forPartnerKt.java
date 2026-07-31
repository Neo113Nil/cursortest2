package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseBiddingTokenRequest_forPartner.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"createBiddingTokenRequest", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "privacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "isTestMode", "", "bidFloor", "", "(Lcom/mobilefuse/sdk/internal/bidding/Partner;Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class MobileFuseBiddingTokenRequest_forPartnerKt {
    public static /* synthetic */ MobileFuseBiddingPartnerTokenRequest createBiddingTokenRequest$default(Partner partner, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            mobileFusePrivacyPreferences = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        return createBiddingTokenRequest(partner, mobileFusePrivacyPreferences, z, f);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest createBiddingTokenRequest(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        if (mobileFusePrivacyPreferences == null) {
            mobileFusePrivacyPreferences = new MobileFusePrivacyPreferences.Builder().build();
        }
        return new MobileFuseBiddingPartnerTokenRequest(mobileFusePrivacyPreferences, z, partner, f);
    }
}
