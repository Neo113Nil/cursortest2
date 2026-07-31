package com.smaato.sdk.ng.vpaid.macros;

import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.utils.EncodingUtils;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import java.util.Locale;

/* loaded from: classes6.dex */
public class CapabilitiesMacros {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public CapabilitiesMacros() {
        this(NextGen.getViewabilityManager());
    }

    private String a() {
        return this.b;
    }

    private String b() {
        return "1";
    }

    private String c() {
        return "AdVerifications";
    }

    private String d() {
        return this.d;
    }

    private String e() {
        return this.c;
    }

    private String f() {
        return this.a;
    }

    private String g() {
        return "iabtechlab.com-omid";
    }

    public String processUrl(String str) {
        return str.replace("[VASTVERSIONS]", f()).replace("[APIFRAMEWORKS]", a()).replace("[EXTENSIONS]", c()).replace("[VERIFICATIONVENDORS]", g()).replace("[OMIDPARTNER]", d()).replace("[PLAYERCAPABILITIES]", e()).replace("[CLICKTYPE]", b());
    }

    CapabilitiesMacros(BaseViewabilityManager baseViewabilityManager) {
        this.a = "1,2,3,4,5,6,7,8,11,12,13,14";
        this.b = "3,5,6,7,";
        this.c = "skip,mute,autoplay,mautoplay";
        if (baseViewabilityManager == null || baseViewabilityManager.getPartner() == null) {
            this.d = String.valueOf(-1);
        } else {
            this.d = EncodingUtils.urlEncode(String.format(Locale.ENGLISH, "%s/%s", baseViewabilityManager.getPartnerName(), baseViewabilityManager.getSdkVersion()));
        }
    }
}
