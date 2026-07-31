package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WinningBidInfo.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/WinningBidInfo;", "", "cpmPrice", "", "creativeId", "", "currency", "(FLjava/lang/String;Ljava/lang/String;)V", "getCpmPrice", "()F", "getCreativeId", "()Ljava/lang/String;", "getCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* data */ class WinningBidInfo {

    @NotNull
    public static final String CURRENCY_USD = "USD";

    @NotNull
    public static final String DEFAULT_CURRENCY = "USD";
    private final float cpmPrice;

    @NotNull
    private final String creativeId;

    @NotNull
    private final String currency;

    public WinningBidInfo(float f, @NotNull String str) {
        this(f, str, null, 4, null);
    }

    public static /* synthetic */ WinningBidInfo copy$default(WinningBidInfo winningBidInfo, float f, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = winningBidInfo.cpmPrice;
        }
        if ((i & 2) != 0) {
            str = winningBidInfo.creativeId;
        }
        if ((i & 4) != 0) {
            str2 = winningBidInfo.currency;
        }
        return winningBidInfo.copy(f, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCpmPrice() {
        return this.cpmPrice;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final WinningBidInfo copy(float cpmPrice, @NotNull String creativeId, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WinningBidInfo(cpmPrice, creativeId, currency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WinningBidInfo)) {
            return false;
        }
        WinningBidInfo winningBidInfo = (WinningBidInfo) other;
        return Float.compare(this.cpmPrice, winningBidInfo.cpmPrice) == 0 && Intrinsics.areEqual(this.creativeId, winningBidInfo.creativeId) && Intrinsics.areEqual(this.currency, winningBidInfo.currency);
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.cpmPrice) * 31;
        String str = this.creativeId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currency;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WinningBidInfo(cpmPrice=" + this.cpmPrice + ", creativeId=" + this.creativeId + ", currency=" + this.currency + ")";
    }

    public WinningBidInfo(float f, @NotNull String creativeId, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.cpmPrice = f;
        this.creativeId = creativeId;
        this.currency = currency;
    }

    public final float getCpmPrice() {
        return this.cpmPrice;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    public /* synthetic */ WinningBidInfo(float f, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, str, (i & 4) != 0 ? "USD" : str2);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }
}
