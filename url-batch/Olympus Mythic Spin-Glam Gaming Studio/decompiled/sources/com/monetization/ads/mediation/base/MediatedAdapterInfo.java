package com.monetization.ads.mediation.base;

import com.ironsource.Qf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/mediation/base/MediatedAdapterInfo;", "", "", Qf.b, "networkName", "networkSdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getAdapterVersion", "()Ljava/lang/String;", "b", "getNetworkName", "c", "getNetworkSdkVersion", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MediatedAdapterInfo {

    /* renamed from: a, reason: from kotlin metadata */
    private final String adapterVersion;

    /* renamed from: b, reason: from kotlin metadata */
    private final String networkName;

    /* renamed from: c, reason: from kotlin metadata */
    private final String networkSdkVersion;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/mediation/base/MediatedAdapterInfo$Builder;", "", "<init>", "()V", "Lcom/monetization/ads/mediation/base/MediatedAdapterInfo;", "build", "()Lcom/monetization/ads/mediation/base/MediatedAdapterInfo;", "", Qf.b, "setAdapterVersion", "(Ljava/lang/String;)Lcom/monetization/ads/mediation/base/MediatedAdapterInfo$Builder;", "networkName", "setNetworkName", "networkSdkVersion", "setNetworkSdkVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String a;
        private String b;
        private String c;

        @NotNull
        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.a, this.b, this.c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@NotNull String adapterVersion) {
            this.a = adapterVersion;
            return this;
        }

        @NotNull
        public final Builder setNetworkName(@NotNull String networkName) {
            this.b = networkName;
            return this;
        }

        @NotNull
        public final Builder setNetworkSdkVersion(@NotNull String networkSdkVersion) {
            this.c = networkSdkVersion;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final String getNetworkSdkVersion() {
        return this.networkSdkVersion;
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.networkName = str2;
        this.networkSdkVersion = str3;
    }
}
