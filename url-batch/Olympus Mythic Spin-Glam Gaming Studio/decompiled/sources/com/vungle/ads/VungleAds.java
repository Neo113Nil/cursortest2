package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.w2;
import com.vungle.ads.internal.z2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/VungleAds;", "", "()V", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class VungleAds {

    @NotNull
    public static final String TAG = "VungleAds";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static z2 a = new z2();
    public static w2 b = new w2();

    @NotNull
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/vungle/ads/VungleAds$Companion;", "", "Landroid/content/Context;", "context", "", "appId", "Lcom/vungle/ads/InitializationListener;", "callback", "", "init", "", "isInitialized", "Lcom/vungle/ads/BidTokenCallback;", "getBiddingToken", "getSdkVersion", "placementId", "isInline", "integrationName", "version", "setIntegrationName", "deInit", "TAG", "Ljava/lang/String;", "Lcom/vungle/ads/fpd/FirstPartyData;", "firstPartyData", "Lcom/vungle/ads/fpd/FirstPartyData;", "Lcom/vungle/ads/internal/w2;", "initializer", "Lcom/vungle/ads/internal/w2;", "Lcom/vungle/ads/internal/z2;", "vungleInternal", "Lcom/vungle/ads/internal/z2;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deInit(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            VungleAds.b.a();
        }

        public final void getBiddingToken(@NotNull Context context, @NotNull BidTokenCallback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            VungleAds.a.getClass();
            z2.a(context, callback);
        }

        @NotNull
        public final String getSdkVersion() {
            VungleAds.a.getClass();
            return BuildConfig.VERSION_NAME;
        }

        public final void init(@NotNull Context context, @NotNull String appId, @NotNull InitializationListener callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            w2 w2Var = VungleAds.b;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            w2Var.a(context, appId, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.b.a.get();
        }

        public final boolean isInline(@NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            ConfigManager.INSTANCE.getClass();
            i3 a = ConfigManager.a(placementId);
            if (a != null) {
                return a.f();
            }
            return false;
        }

        public final void setIntegrationName(@NotNull String integrationName, @NotNull String version) {
            Intrinsics.checkNotNullParameter(integrationName, "integrationName");
            Intrinsics.checkNotNullParameter(version, "version");
            VungleAds.b.a(integrationName, version);
        }
    }

    public static final void deInit(@NotNull Context context) {
        INSTANCE.deInit(context);
    }

    public static final void getBiddingToken(@NotNull Context context, @NotNull BidTokenCallback bidTokenCallback) {
        INSTANCE.getBiddingToken(context, bidTokenCallback);
    }

    @NotNull
    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    public static final void init(@NotNull Context context, @NotNull String str, @NotNull InitializationListener initializationListener) {
        INSTANCE.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public static final boolean isInline(@NotNull String str) {
        return INSTANCE.isInline(str);
    }

    public static final void setIntegrationName(@NotNull String str, @NotNull String str2) {
        INSTANCE.setIntegrationName(str, str2);
    }
}
