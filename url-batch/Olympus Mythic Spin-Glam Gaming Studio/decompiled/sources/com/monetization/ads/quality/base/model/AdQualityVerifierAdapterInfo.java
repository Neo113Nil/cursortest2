package com.monetization.ads.quality.base.model;

import com.ironsource.Qf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000bB%\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerifierAdapterInfo;", "", Qf.b, "", "verifierName", "verifierSdkVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdapterVersion", "()Ljava/lang/String;", "getVerifierName", "getVerifierSdkVersion", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdQualityVerifierAdapterInfo {

    @Nullable
    private final String adapterVersion;

    @Nullable
    private final String verifierName;

    @Nullable
    private final String verifierSdkVersion;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerifierAdapterInfo$Builder;", "", "<init>", "()V", "Lcom/monetization/ads/quality/base/model/AdQualityVerifierAdapterInfo;", "build", "()Lcom/monetization/ads/quality/base/model/AdQualityVerifierAdapterInfo;", "", Qf.b, "setAdapterVersion", "(Ljava/lang/String;)Lcom/monetization/ads/quality/base/model/AdQualityVerifierAdapterInfo$Builder;", "name", "setVerifierName", "version", "setVerifierSdkVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private String a;
        private String b;
        private String c;

        @NotNull
        public final AdQualityVerifierAdapterInfo build() {
            return new AdQualityVerifierAdapterInfo(this.a, this.b, this.c, null);
        }

        @NotNull
        public final Builder setAdapterVersion(@Nullable String adapterVersion) {
            this.a = adapterVersion;
            return this;
        }

        @NotNull
        public final Builder setVerifierName(@Nullable String name) {
            this.b = name;
            return this;
        }

        @NotNull
        public final Builder setVerifierSdkVersion(@Nullable String version) {
            this.c = version;
            return this;
        }
    }

    public /* synthetic */ AdQualityVerifierAdapterInfo(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @Nullable
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @Nullable
    public final String getVerifierName() {
        return this.verifierName;
    }

    @Nullable
    public final String getVerifierSdkVersion() {
        return this.verifierSdkVersion;
    }

    private AdQualityVerifierAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.verifierName = str2;
        this.verifierSdkVersion = str3;
    }
}
