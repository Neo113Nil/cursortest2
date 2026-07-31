package com.smaato.sdk.ng.viewability.baseom;

import java.net.URL;

/* loaded from: classes15.dex */
public class BaseVerificationScriptResource {
    private final String a;
    private final URL b;
    private final String c;

    private BaseVerificationScriptResource(String str, URL url, String str2) {
        this.a = str;
        this.b = url;
        this.c = str2;
    }

    public static BaseVerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        return new BaseVerificationScriptResource(str, url, str2);
    }

    public URL getResourceUrl() {
        return this.b;
    }

    public String getVendorKey() {
        return this.a;
    }

    public String getVerificationParameters() {
        return this.c;
    }
}
