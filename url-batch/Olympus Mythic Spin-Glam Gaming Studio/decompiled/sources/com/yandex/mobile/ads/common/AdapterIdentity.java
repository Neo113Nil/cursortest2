package com.yandex.mobile.ads.common;

import com.ironsource.Qf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.c4;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/yandex/mobile/ads/common/AdapterIdentity;", "", "", "adapterNetworkName", Qf.b, "adapterNetworkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAdapterNetworkName", "b", "getAdapterVersion", "c", "getAdapterNetworkVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdapterIdentity {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final String adapterNetworkName;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String adapterVersion;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final String adapterNetworkVersion;

    public AdapterIdentity(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.adapterNetworkName = str;
        this.adapterVersion = str2;
        this.adapterNetworkVersion = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AdapterIdentity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdapterIdentity");
        AdapterIdentity adapterIdentity = (AdapterIdentity) other;
        return Intrinsics.areEqual(this.adapterNetworkName, adapterIdentity.adapterNetworkName) && Intrinsics.areEqual(this.adapterVersion, adapterIdentity.adapterVersion) && Intrinsics.areEqual(this.adapterNetworkVersion, adapterIdentity.adapterNetworkVersion);
    }

    @NotNull
    public final String getAdapterNetworkName() {
        return this.adapterNetworkName;
    }

    @NotNull
    public final String getAdapterNetworkVersion() {
        return this.adapterNetworkVersion;
    }

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public int hashCode() {
        return this.adapterNetworkVersion.hashCode() + c4.a(this.adapterNetworkName.hashCode() * 31, 31, this.adapterVersion);
    }

    @NotNull
    public String toString() {
        return "AdapterIdentity(adapterNetworkName='" + this.adapterNetworkName + "', adapterVersion='" + this.adapterVersion + "', adapterNetworkVersion='" + this.adapterNetworkVersion + "')";
    }
}
