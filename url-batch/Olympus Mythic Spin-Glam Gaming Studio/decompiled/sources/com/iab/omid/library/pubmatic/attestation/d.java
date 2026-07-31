package com.iab.omid.library.pubmatic.attestation;

import android.content.Context;

/* loaded from: classes15.dex */
public class d {
    public b a(String str, Context context) {
        try {
            if (str == null) {
                com.iab.omid.library.pubmatic.utils.d.b("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                com.iab.omid.library.pubmatic.utils.d.b("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new i(context);
            }
            return null;
        } catch (Exception e) {
            com.iab.omid.library.pubmatic.utils.d.a("Error creating attestation mechanism: " + str, e);
            return null;
        }
    }
}
