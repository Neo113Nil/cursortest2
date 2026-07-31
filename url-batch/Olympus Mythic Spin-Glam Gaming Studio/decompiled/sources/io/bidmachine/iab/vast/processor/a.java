package io.bidmachine.iab.vast.processor;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastXmlTag;

/* loaded from: classes14.dex */
class a {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    a() {
        this(true, true, true);
    }

    boolean a() {
        return this.b;
    }

    boolean b() {
        return this.c;
    }

    boolean c() {
        return this.a;
    }

    a(VastXmlTag vastXmlTag) {
        this(vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.ALLOW_MULTIPLE_ADS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FALLBACK_ON_NO_AD, true));
    }

    private a(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
