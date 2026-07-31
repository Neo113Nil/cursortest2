package com.pubmatic.sdk.openwrap.core.nativead;

/* loaded from: classes6.dex */
public enum POBNativePlacementType {
    FEED(1),
    ATOMIC(2),
    OUTSIDE_CORE_CONTENT(3),
    BELOW_ARTICLE(4),
    EXCHANGE(500);

    private final int a;

    POBNativePlacementType(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
