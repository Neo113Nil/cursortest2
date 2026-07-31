package com.pubmatic.sdk.openwrap.core.nativead;

/* loaded from: classes5.dex */
public enum POBNativeContextType {
    CONTENT_CENTRIC(1),
    SOCIAL_CENTRIC(2),
    PRODUCT(3),
    EXCHANGE(500);

    private final int a;

    POBNativeContextType(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
