package com.unity3d.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: BannerSize.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/BannerSize;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerSize {
    private final int height;
    private final int width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BannerSize leaderboard = new BannerSize(728, 90);

    @NotNull
    private static final BannerSize iabStandard = new BannerSize(468, 60);

    @NotNull
    private static final BannerSize standard = new BannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    /* compiled from: BannerSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/BannerSize$Companion;", "", "<init>", "()V", "leaderboard", "Lcom/unity3d/ads/BannerSize;", "getLeaderboard", "()Lcom/unity3d/ads/BannerSize;", "iabStandard", "getIabStandard", "standard", "getStandard", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final BannerSize getLeaderboard() {
            return BannerSize.leaderboard;
        }

        @NotNull
        public final BannerSize getIabStandard() {
            return BannerSize.iabStandard;
        }

        @NotNull
        public final BannerSize getStandard() {
            return BannerSize.standard;
        }
    }

    public BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
