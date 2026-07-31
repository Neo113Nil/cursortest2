package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4991yc;
import com.ironsource.Fd;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class BannerAdRequest {

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final AdSize d;

    @Nullable
    private final Bundle e;

    @NotNull
    private final Fd f;

    @NotNull
    private final String g;

    public static final class Builder {

        @NotNull
        private final Context a;

        @NotNull
        private final String b;

        @NotNull
        private final String c;

        @NotNull
        private final AdSize d;

        @Nullable
        private Bundle e;

        public Builder(@NotNull Context context, @NotNull String instanceId, @NotNull String adm, @NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(size, "size");
            this.a = context;
            this.b = instanceId;
            this.c = adm;
            this.d = size;
        }

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.b + ", size: " + this.d.getSizeDescription());
            return new BannerAdRequest(this.a, this.b, this.c, this.d, this.e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.c;
        }

        @NotNull
        public final Context getContext() {
            return this.a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.g;
    }

    @NotNull
    public final String getAdm() {
        return this.c;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.b;
    }

    @NotNull
    public final Fd getProviderName$mediationsdk_release() {
        return this.f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = adSize;
        this.e = bundle;
        this.f = new C4991yc(str);
        String b = W9.b();
        Intrinsics.checkNotNullExpressionValue(b, "generateMultipleUniqueInstanceId()");
        this.g = b;
    }
}
