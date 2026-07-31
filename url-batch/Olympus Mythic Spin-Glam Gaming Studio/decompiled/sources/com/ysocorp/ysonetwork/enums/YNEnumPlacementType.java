package com.ysocorp.ysonetwork.enums;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public enum YNEnumPlacementType {
    None("none"),
    Banner("banner"),
    Interstitial("interstitial"),
    Rewarded("rewarded");

    private final String value;

    YNEnumPlacementType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.value;
    }

    public static YNEnumPlacementType stringToType(String str) {
        YNEnumPlacementType yNEnumPlacementType = Banner;
        if (str.equalsIgnoreCase(yNEnumPlacementType.toString())) {
            return yNEnumPlacementType;
        }
        YNEnumPlacementType yNEnumPlacementType2 = Interstitial;
        if (str.equalsIgnoreCase(yNEnumPlacementType2.toString())) {
            return yNEnumPlacementType2;
        }
        YNEnumPlacementType yNEnumPlacementType3 = Rewarded;
        return str.equalsIgnoreCase(yNEnumPlacementType3.toString()) ? yNEnumPlacementType3 : None;
    }
}
