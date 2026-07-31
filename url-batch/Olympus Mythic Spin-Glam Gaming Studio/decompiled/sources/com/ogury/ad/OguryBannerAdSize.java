package com.ogury.ad;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ogury/ad/OguryBannerAdSize;", "", "width", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "getWidth", "MREC_300x250", "SMALL_BANNER_320x50", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OguryBannerAdSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OguryBannerAdSize[] $VALUES;
    public static final OguryBannerAdSize MREC_300x250 = new OguryBannerAdSize("MREC_300x250", 0, 300, POBCommonConstants.DEFAULT_MIN_BITRATE);
    public static final OguryBannerAdSize SMALL_BANNER_320x50 = new OguryBannerAdSize("SMALL_BANNER_320x50", 1, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    private final int height;
    private final int width;

    private static final /* synthetic */ OguryBannerAdSize[] $values() {
        return new OguryBannerAdSize[]{MREC_300x250, SMALL_BANNER_320x50};
    }

    static {
        OguryBannerAdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OguryBannerAdSize(String str, int i, int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OguryBannerAdSize valueOf(String str) {
        return (OguryBannerAdSize) Enum.valueOf(OguryBannerAdSize.class, str);
    }

    public static OguryBannerAdSize[] values() {
        return (OguryBannerAdSize[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
