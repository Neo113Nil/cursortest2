package com.pubmatic.sdk.common;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/pubmatic/sdk/common/POBAdType;", "", "(Ljava/lang/String;I)V", "isAppOpen", "", "()Z", "isFullScreen", "isNative", "isRewarded", "BANNER", "INTERSTITIAL", BrandSafetyUtils.k, "NATIVE", "APP_OPEN", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public enum POBAdType {
    BANNER,
    INTERSTITIAL,
    REWARDED,
    NATIVE,
    APP_OPEN;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/pubmatic/sdk/common/POBAdType$Companion;", "", "()V", "fromAdFormat", "Lcom/pubmatic/sdk/common/POBAdType;", "adFormat", "Lcom/pubmatic/sdk/common/POBAdFormat;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[POBAdFormat.values().length];
                iArr[POBAdFormat.APP_OPEN_AD.ordinal()] = 1;
                iArr[POBAdFormat.REWARDEDAD.ordinal()] = 2;
                iArr[POBAdFormat.INTERSTITIAL.ordinal()] = 3;
                iArr[POBAdFormat.NATIVE.ordinal()] = 4;
                iArr[POBAdFormat.BANNER.ordinal()] = 5;
                iArr[POBAdFormat.MREC.ordinal()] = 6;
                iArr[POBAdFormat.BANNER_AND_MREC.ordinal()] = 7;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBAdType fromAdFormat(@NotNull POBAdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            switch (WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()]) {
                case 1:
                    return POBAdType.APP_OPEN;
                case 2:
                    return POBAdType.REWARDED;
                case 3:
                    return POBAdType.INTERSTITIAL;
                case 4:
                    return POBAdType.NATIVE;
                case 5:
                case 6:
                case 7:
                    return POBAdType.BANNER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private Companion() {
        }
    }

    @NotNull
    public static final POBAdType fromAdFormat(@NotNull POBAdFormat pOBAdFormat) {
        return INSTANCE.fromAdFormat(pOBAdFormat);
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isFullScreen() {
        return this == INTERSTITIAL || this == REWARDED || this == APP_OPEN;
    }

    public final boolean isNative() {
        return this == NATIVE;
    }

    public final boolean isRewarded() {
        return this == REWARDED;
    }
}
