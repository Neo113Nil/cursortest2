package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class Sf extends Rf {
    public Partner b = Partner.createPartner("Inmobi", a());

    public final String a() {
        return "a" + StringsKt.replace$default("11.3.0", ".", "", false, 4, (Object) null);
    }
}
