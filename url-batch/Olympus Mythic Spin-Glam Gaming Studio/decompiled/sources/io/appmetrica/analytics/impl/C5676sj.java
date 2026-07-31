package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5676sj {
    public final String a;
    public final List b;
    public final String c;
    public final Map d;

    public C5676sj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.a + "', categoriesPath=" + this.b + ", searchQuery='" + this.c + "', payload=" + this.d + '}';
    }

    public C5676sj(String str, String str2, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = map;
    }
}
