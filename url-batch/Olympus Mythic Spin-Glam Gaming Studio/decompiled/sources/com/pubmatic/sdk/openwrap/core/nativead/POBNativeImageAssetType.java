package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public enum POBNativeImageAssetType {
    ICON(1),
    MAIN(3);

    final int a;

    POBNativeImageAssetType(int i) {
        this.a = i;
    }

    @Nullable
    public static POBNativeImageAssetType getImageAssetType(int i) {
        if (i == 1) {
            return ICON;
        }
        if (i != 3) {
            return null;
        }
        return MAIN;
    }

    public int getImageAssetTypeValue() {
        return this.a;
    }
}
