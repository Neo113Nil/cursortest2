package com.ogury.ad.internal;

import com.iab.omid.library.ogury.adsession.AdSessionConfiguration;
import com.iab.omid.library.ogury.adsession.AdSessionContext;
import com.iab.omid.library.ogury.adsession.CreativeType;
import com.iab.omid.library.ogury.adsession.ImpressionType;
import com.iab.omid.library.ogury.adsession.Owner;
import com.iab.omid.library.ogury.adsession.Partner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class p9 {
    public static q9 a(y7 adWebView, boolean z) {
        Partner partner;
        AdSessionContext adSessionContext;
        Intrinsics.checkNotNullParameter(adWebView, "adWebView");
        q9 q9Var = new q9();
        AdSessionConfiguration adSessionConfiguration = null;
        try {
            partner = Partner.createPartner("Ogury", "5.2.2");
        } catch (IllegalArgumentException e) {
            r9.a(e);
            partner = null;
        }
        if (partner == null) {
            return null;
        }
        try {
            adSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, adWebView, "", null);
        } catch (IllegalArgumentException e2) {
            r9.a(e2);
            adSessionContext = null;
        }
        q9Var.a = adSessionContext;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        Owner owner2 = Owner.NONE;
        if (z) {
            owner2 = owner;
        }
        try {
            adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, false);
        } catch (IllegalArgumentException e3) {
            boolean z2 = r9.a;
            r9.a(e3);
        }
        q9Var.b = adSessionConfiguration;
        return q9Var;
    }
}
