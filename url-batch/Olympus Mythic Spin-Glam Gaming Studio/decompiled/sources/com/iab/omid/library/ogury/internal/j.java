package com.iab.omid.library.ogury.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class j {
    private static Map<String, String> a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.ogury.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.ogury.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.ogury.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                com.iab.omid.library.ogury.utils.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                a(a(uri));
                return;
            }
            com.iab.omid.library.ogury.utils.d.b("Unknown method in OmidNativeUrlHandler.handle :" + queryParameter);
        } catch (Exception e) {
            com.iab.omid.library.ogury.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + X3.j.e, e);
        }
    }
}
