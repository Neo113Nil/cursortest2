package com.unity3d.ads.core.extensions;

import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdFormatExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProtoAdFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lcom/unity3d/ads/AdFormat;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdFormatExtensions {

    /* compiled from: AdFormatExtensions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(@NotNull AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
    }
}
