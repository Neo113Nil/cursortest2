package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "privacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "isTestMode", "", "bidFloor", "", "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)V", "getBidFloor", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Z", "getPrivacyPreferences", "()Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "component1", "component2", "component3", "copy", "(Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final /* data */ class MobileFuseBiddingTokenRequest implements IMobileFuseBiddingTokenRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float bidFloor;
    private final boolean isTestMode;

    @NotNull
    private final MobileFusePrivacyPreferences privacyPreferences;

    public MobileFuseBiddingTokenRequest(@NotNull MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z) {
        this(mobileFusePrivacyPreferences, z, null, 4, null);
    }

    public static /* synthetic */ MobileFuseBiddingTokenRequest copy$default(MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileFusePrivacyPreferences = mobileFuseBiddingTokenRequest.getPrivacyPreferences();
        }
        if ((i & 2) != 0) {
            z = mobileFuseBiddingTokenRequest.getIsTestMode();
        }
        if ((i & 4) != 0) {
            f = mobileFuseBiddingTokenRequest.getBidFloor();
        }
        return mobileFuseBiddingTokenRequest.copy(mobileFusePrivacyPreferences, z, f);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
        return Companion.forPartner$default(INSTANCE, partner, null, false, null, 14, null);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        return Companion.forPartner$default(INSTANCE, partner, mobileFusePrivacyPreferences, false, null, 12, null);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z) {
        return Companion.forPartner$default(INSTANCE, partner, mobileFusePrivacyPreferences, z, null, 8, null);
    }

    @NotNull
    public static final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, @Nullable Float f) {
        return INSTANCE.forPartner(partner, mobileFusePrivacyPreferences, z, f);
    }

    @NotNull
    public final MobileFusePrivacyPreferences component1() {
        return getPrivacyPreferences();
    }

    public final boolean component2() {
        return getIsTestMode();
    }

    @Nullable
    public final Float component3() {
        return getBidFloor();
    }

    @NotNull
    public final MobileFuseBiddingTokenRequest copy(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean isTestMode, @Nullable Float bidFloor) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        return new MobileFuseBiddingTokenRequest(privacyPreferences, isTestMode, bidFloor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileFuseBiddingTokenRequest)) {
            return false;
        }
        MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest = (MobileFuseBiddingTokenRequest) other;
        return Intrinsics.areEqual(getPrivacyPreferences(), mobileFuseBiddingTokenRequest.getPrivacyPreferences()) && getIsTestMode() == mobileFuseBiddingTokenRequest.getIsTestMode() && Intrinsics.areEqual((Object) getBidFloor(), (Object) mobileFuseBiddingTokenRequest.getBidFloor());
    }

    public int hashCode() {
        MobileFusePrivacyPreferences privacyPreferences = getPrivacyPreferences();
        int hashCode = (privacyPreferences != null ? privacyPreferences.hashCode() : 0) * 31;
        boolean isTestMode = getIsTestMode();
        int i = isTestMode;
        if (isTestMode) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Float bidFloor = getBidFloor();
        return i2 + (bidFloor != null ? bidFloor.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MobileFuseBiddingTokenRequest(privacyPreferences=" + getPrivacyPreferences() + ", isTestMode=" + getIsTestMode() + ", bidFloor=" + getBidFloor() + ")";
    }

    public MobileFuseBiddingTokenRequest(@NotNull MobileFusePrivacyPreferences privacyPreferences, boolean z, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        this.privacyPreferences = privacyPreferences;
        this.isTestMode = z;
        this.bidFloor = f;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @NotNull
    public MobileFusePrivacyPreferences getPrivacyPreferences() {
        return this.privacyPreferences;
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    /* renamed from: isTestMode, reason: from getter */
    public boolean getIsTestMode() {
        return this.isTestMode;
    }

    public /* synthetic */ MobileFuseBiddingTokenRequest(MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mobileFusePrivacyPreferences, z, (i & 4) != 0 ? null : f);
    }

    @Override // com.mobilefuse.sdk.internal.IMobileFuseBiddingTokenRequest
    @Nullable
    public Float getBidFloor() {
        return this.bidFloor;
    }

    /* compiled from: MobileFuseBiddingTokenProvider.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest$Companion;", "", "()V", "forPartner", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "partner", "Lcom/mobilefuse/sdk/internal/bidding/Partner;", "privacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "isTestMode", "", "bidFloor", "", "(Lcom/mobilefuse/sdk/internal/bidding/Partner;Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/internal/MobileFuseBiddingPartnerTokenRequest;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner) {
            return forPartner$default(this, partner, null, false, null, 14, null);
        }

        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
            return forPartner$default(this, partner, mobileFusePrivacyPreferences, false, null, 12, null);
        }

        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z) {
            return forPartner$default(this, partner, mobileFusePrivacyPreferences, z, null, 8, null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MobileFuseBiddingPartnerTokenRequest forPartner$default(Companion companion, Partner partner, MobileFusePrivacyPreferences mobileFusePrivacyPreferences, boolean z, Float f, int i, Object obj) {
            if ((i & 2) != 0) {
                mobileFusePrivacyPreferences = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                f = null;
            }
            return companion.forPartner(partner, mobileFusePrivacyPreferences, z, f);
        }

        @NotNull
        public final MobileFuseBiddingPartnerTokenRequest forPartner(@NotNull Partner partner, @Nullable MobileFusePrivacyPreferences privacyPreferences, boolean isTestMode, @Nullable Float bidFloor) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return MobileFuseBiddingTokenRequest_forPartnerKt.createBiddingTokenRequest(partner, privacyPreferences, isTestMode, bidFloor);
        }
    }
}
