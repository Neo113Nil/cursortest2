package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5732un extends Lambda implements Function0 {
    public final /* synthetic */ C5758vn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5732un(C5758vn c5758vn) {
        super(0);
        this.a = c5758vn;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        HashMap hashMap = new HashMap();
        C5758vn c5758vn = this.a;
        String a = c5758vn.a.a();
        if (a != null) {
        }
        String a2 = c5758vn.b.a();
        if (a2 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a2);
        }
        return hashMap;
    }
}
