package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C4991yc;
import com.ironsource.Fd;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class InterstitialAdRequest {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final Bundle c;

    @NotNull
    private final Fd d;

    @NotNull
    private final String e;

    public static final class Builder {

        @NotNull
        private final String a;

        @NotNull
        private final String b;

        @Nullable
        private Bundle c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.a = instanceId;
            this.b = adm;
        }

        @NotNull
        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.a);
            return new InterstitialAdRequest(this.a, this.b, this.c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.e;
    }

    @NotNull
    public final String getAdm() {
        return this.b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public final Fd getProviderName$mediationsdk_release() {
        return this.d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new C4991yc(str);
        String b = W9.b();
        Intrinsics.checkNotNullExpressionValue(b, "generateMultipleUniqueInstanceId()");
        this.e = b;
    }
}
