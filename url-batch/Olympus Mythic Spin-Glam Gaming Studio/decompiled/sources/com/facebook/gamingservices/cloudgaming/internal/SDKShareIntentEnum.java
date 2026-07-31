package com.facebook.gamingservices.cloudgaming.internal;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public enum SDKShareIntentEnum {
    INVITE("INVITE"),
    REQUEST("REQUEST"),
    CHALLENGE("CHALLENGE"),
    SHARE("SHARE");

    private final String mStringValue;

    SDKShareIntentEnum(String str) {
        this.mStringValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mStringValue;
    }

    @Nullable
    public static String validate(String str) {
        for (SDKShareIntentEnum sDKShareIntentEnum : values()) {
            if (sDKShareIntentEnum.toString().equals(str)) {
                return str;
            }
        }
        return null;
    }

    @Nullable
    public static SDKShareIntentEnum fromString(String str) {
        for (SDKShareIntentEnum sDKShareIntentEnum : values()) {
            if (sDKShareIntentEnum.toString().equals(str)) {
                return sDKShareIntentEnum;
            }
        }
        return null;
    }
}
