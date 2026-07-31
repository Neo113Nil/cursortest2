package com.monetization.ads.quality.base.model.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdapterConfiguration;", "", "apiKey", "", "verificationTimeoutInSec", "", "debug", "", "blockAll", "(Ljava/lang/String;JZZ)V", "getApiKey", "()Ljava/lang/String;", "getBlockAll", "()Z", "getDebug", "getVerificationTimeoutInSec", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AdQualityVerifierAdapterConfiguration {

    @NotNull
    private final String apiKey;
    private final boolean blockAll;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(@NotNull String str, long j, boolean z, boolean z2) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j;
        this.debug = z;
        this.blockAll = z2;
    }

    public static /* synthetic */ AdQualityVerifierAdapterConfiguration copy$default(AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adQualityVerifierAdapterConfiguration.apiKey;
        }
        if ((i & 2) != 0) {
            j = adQualityVerifierAdapterConfiguration.verificationTimeoutInSec;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = adQualityVerifierAdapterConfiguration.debug;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = adQualityVerifierAdapterConfiguration.blockAll;
        }
        return adQualityVerifierAdapterConfiguration.copy(str, j2, z3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBlockAll() {
        return this.blockAll;
    }

    @NotNull
    public final AdQualityVerifierAdapterConfiguration copy(@NotNull String apiKey, long verificationTimeoutInSec, boolean debug, boolean blockAll) {
        return new AdQualityVerifierAdapterConfiguration(apiKey, verificationTimeoutInSec, debug, blockAll);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) other;
        return Intrinsics.areEqual(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug && this.blockAll == adQualityVerifierAdapterConfiguration.blockAll;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final boolean getBlockAll() {
        return this.blockAll;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.blockAll) + ((Boolean.hashCode(this.debug) + ((Long.hashCode(this.verificationTimeoutInSec) + (this.apiKey.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + ", blockAll=" + this.blockAll + ")";
    }

    public /* synthetic */ AdQualityVerifierAdapterConfiguration(String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
