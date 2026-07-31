package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes10.dex */
public final class Gg {
    public final String a;
    public final String b;
    public final C5676sj c;

    public Gg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C5676sj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.a + "', identifier='" + this.b + "', screen=" + this.c + '}';
    }

    public Gg(String str, String str2, C5676sj c5676sj) {
        this.a = str;
        this.b = str2;
        this.c = c5676sj;
    }
}
