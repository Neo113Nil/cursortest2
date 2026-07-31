package com.ogury.ad.internal;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends f5 {
    public final b b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b ad, String url, String str, String str2) {
        super("ad_history");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(POBConstants.KEY_FORMAT, "source");
        this.b = ad;
        this.c = url;
        this.d = str;
        this.e = str2;
    }
}
