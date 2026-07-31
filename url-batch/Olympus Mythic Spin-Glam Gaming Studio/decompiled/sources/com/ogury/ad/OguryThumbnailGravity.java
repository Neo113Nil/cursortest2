package com.ogury.ad;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ogury/ad/OguryThumbnailGravity;", "", "", "a", "I", "getValue", "()I", "value", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OguryThumbnailGravity {
    public static final OguryThumbnailGravity BOTTOM_LEFT;
    public static final OguryThumbnailGravity BOTTOM_RIGHT;
    public static final OguryThumbnailGravity TOP_LEFT;
    public static final OguryThumbnailGravity TOP_RIGHT;
    public static final /* synthetic */ OguryThumbnailGravity[] b;
    public static final /* synthetic */ EnumEntries c;

    /* renamed from: a, reason: from kotlin metadata */
    public final int value;

    static {
        OguryThumbnailGravity oguryThumbnailGravity = new OguryThumbnailGravity("TOP_LEFT", 0, 0);
        TOP_LEFT = oguryThumbnailGravity;
        OguryThumbnailGravity oguryThumbnailGravity2 = new OguryThumbnailGravity("TOP_RIGHT", 1, 1);
        TOP_RIGHT = oguryThumbnailGravity2;
        OguryThumbnailGravity oguryThumbnailGravity3 = new OguryThumbnailGravity("BOTTOM_LEFT", 2, 2);
        BOTTOM_LEFT = oguryThumbnailGravity3;
        OguryThumbnailGravity oguryThumbnailGravity4 = new OguryThumbnailGravity("BOTTOM_RIGHT", 3, 3);
        BOTTOM_RIGHT = oguryThumbnailGravity4;
        OguryThumbnailGravity[] oguryThumbnailGravityArr = {oguryThumbnailGravity, oguryThumbnailGravity2, oguryThumbnailGravity3, oguryThumbnailGravity4};
        b = oguryThumbnailGravityArr;
        c = EnumEntriesKt.enumEntries(oguryThumbnailGravityArr);
    }

    public OguryThumbnailGravity(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return c;
    }

    public static OguryThumbnailGravity valueOf(String str) {
        return (OguryThumbnailGravity) Enum.valueOf(OguryThumbnailGravity.class, str);
    }

    public static OguryThumbnailGravity[] values() {
        return (OguryThumbnailGravity[]) b.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
