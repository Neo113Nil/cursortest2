package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public abstract class X0 {
    public static final Partner a;

    static {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner createPartner = Partner.createPartner(partnerKey, a());
        Intrinsics.checkNotNullExpressionValue(createPartner, "createPartner(...)");
        a = createPartner;
    }

    public static AdSessionContext a(String omsdkScript, List adVerifications, Map macros, String str, String customReferenceData) {
        VerificationScriptResource verificationScriptResource;
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(adVerifications, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
        Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            Nf nf = (Nf) it.next();
            try {
                String str2 = nf.a;
                if (macros != null) {
                    String str3 = str2;
                    for (Map.Entry entry : macros.entrySet()) {
                        str3 = StringsKt.replace$default(str3, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                    }
                    str2 = str3;
                }
                URL url = new URL(str2);
                String str4 = nf.c;
                String str5 = nf.d;
                verificationScriptResource = (str4.length() <= 0 || !N3.a(str5)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str4, url, str5);
            } catch (MalformedURLException unused) {
                verificationScriptResource = null;
            }
            arrayList.add(verificationScriptResource);
        }
        AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(a, omsdkScript, CollectionsKt.filterNotNull(arrayList), str, customReferenceData);
        Intrinsics.checkNotNullExpressionValue(createNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return createNativeAdSessionContext;
    }

    public static String a() {
        return "a" + StringsKt.replace$default("11.3.0", ".", "", false, 4, (Object) null);
    }
}
