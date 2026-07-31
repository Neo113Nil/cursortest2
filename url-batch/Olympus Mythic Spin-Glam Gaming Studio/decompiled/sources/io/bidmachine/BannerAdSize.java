package io.bidmachine;

import android.util.Size;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.bigo.ads.api.AdSize;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/bidmachine/BannerAdSize;", "", "width", "", "height", "isAdaptive", "", "(IIZ)V", "getHeight", "()I", "()Z", "getWidth", "equals", "other", "hashCode", "isSuitable", "otherWidth", "otherHeight", "toSize", "Landroid/util/Size;", "toString", "", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class BannerAdSize {

    @NotNull
    public static final BannerAdSize Banner;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BannerAdSize[] FIXED_BANNER_AD_SIZES;

    @NotNull
    public static final BannerAdSize Leaderboard;

    @NotNull
    public static final BannerAdSize MediumRectangle;

    @NotNull
    public static final BannerAdSize Undefined;
    private final int height;
    private final boolean isAdaptive;
    private final int width;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/bidmachine/BannerAdSize$Companion;", "", "()V", "Banner", "Lio/bidmachine/BannerAdSize;", "FIXED_BANNER_AD_SIZES", "", "[Lio/bidmachine/BannerAdSize;", "Leaderboard", "MediumRectangle", "Undefined", AdSize.ADAPTIVE, "width", "", "maxHeight", "firstFixedOrNull", "height", "getMaxAdaptiveHeight", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerAdSize adaptive(int width, int maxHeight) {
            return new BannerAdSize(width, maxHeight, true, null);
        }

        @Nullable
        public final BannerAdSize firstFixedOrNull(int width, int height) {
            for (BannerAdSize bannerAdSize : BannerAdSize.FIXED_BANNER_AD_SIZES) {
                if (bannerAdSize.isSuitable(width, height)) {
                    return bannerAdSize;
                }
            }
            return null;
        }

        public final int getMaxAdaptiveHeight(int width) {
            BannerAdSize bannerAdSize = BannerAdSize.Leaderboard;
            return width >= bannerAdSize.getWidth() ? bannerAdSize.getHeight() : BannerAdSize.Banner.getHeight();
        }

        private Companion() {
        }
    }

    static {
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        BannerAdSize bannerAdSize = new BannerAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, z, i, defaultConstructorMarker);
        Banner = bannerAdSize;
        BannerAdSize bannerAdSize2 = new BannerAdSize(728, 90, false, 4, null);
        Leaderboard = bannerAdSize2;
        BannerAdSize bannerAdSize3 = new BannerAdSize(300, POBCommonConstants.DEFAULT_MIN_BITRATE, z, i, defaultConstructorMarker);
        MediumRectangle = bannerAdSize3;
        Undefined = new BannerAdSize(-1, -1, false, 4, null);
        FIXED_BANNER_AD_SIZES = new BannerAdSize[]{bannerAdSize, bannerAdSize2, bannerAdSize3};
    }

    public /* synthetic */ BannerAdSize(int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z);
    }

    @NotNull
    public static final BannerAdSize adaptive(int i, int i2) {
        return INSTANCE.adaptive(i, i2);
    }

    @Nullable
    public static final BannerAdSize firstFixedOrNull(int i, int i2) {
        return INSTANCE.firstFixedOrNull(i, i2);
    }

    public static final int getMaxAdaptiveHeight(int i) {
        return INSTANCE.getMaxAdaptiveHeight(i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BannerAdSize.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.bidmachine.BannerAdSize");
        BannerAdSize bannerAdSize = (BannerAdSize) other;
        return this.width == bannerAdSize.width && this.height == bannerAdSize.height && this.isAdaptive == bannerAdSize.isAdaptive;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + Boolean.hashCode(this.isAdaptive);
    }

    /* renamed from: isAdaptive, reason: from getter */
    public final boolean getIsAdaptive() {
        return this.isAdaptive;
    }

    public final boolean isSuitable(@NotNull BannerAdSize other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return isSuitable(other.width, other.height);
    }

    @NotNull
    public final Size toSize() {
        return new Size(this.width, this.height);
    }

    @NotNull
    public String toString() {
        return "BannerAdSize(width=" + this.width + ", height=" + this.height + ", isAdaptive=" + this.isAdaptive + ')';
    }

    private BannerAdSize(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.isAdaptive = z;
    }

    public final boolean isSuitable(int otherWidth, int otherHeight) {
        int i;
        return !this.isAdaptive ? !(this.width == otherWidth && this.height == otherHeight) : this.width < otherWidth || ((i = this.height) != 0 && i < otherHeight);
    }

    /* synthetic */ BannerAdSize(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? false : z);
    }
}
