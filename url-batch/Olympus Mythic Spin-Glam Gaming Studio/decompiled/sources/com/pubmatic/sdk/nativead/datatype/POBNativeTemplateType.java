package com.pubmatic.sdk.nativead.datatype;

/* loaded from: classes4.dex */
public enum POBNativeTemplateType {
    SMALL(0),
    MEDIUM(1),
    CUSTOM(2);

    final int a;

    POBNativeTemplateType(int i) {
        this.a = i;
    }

    public int getTemplateType() {
        return this.a;
    }
}
