package com.iab.omid.library.bigosg.attestation;

import android.content.Context;

/* loaded from: classes6.dex */
public final class e {
    private static final d a = new d();

    public static void a(Context context, String str, a aVar) {
        try {
            if (context == null) {
                com.iab.omid.library.bigosg.utils.d.b("Attestation failed: Application Context cannot be null");
                return;
            }
            if (str == null || str.trim().isEmpty()) {
                com.iab.omid.library.bigosg.utils.d.b("Attestation failed: Mechanism name cannot be null or empty");
                return;
            }
            if (aVar == null) {
                com.iab.omid.library.bigosg.utils.d.b("Attestation failed: Attestation arguments cannot be null");
                return;
            }
            if (!c.a(context).a(str)) {
                com.iab.omid.library.bigosg.utils.d.d("Mechanism not supported on this device: ".concat(str));
                return;
            }
            b a2 = a.a(str, context);
            if (a2 != null) {
                a2.a(aVar);
            } else {
                com.iab.omid.library.bigosg.utils.d.d("Failed to create mechanism: ".concat(str));
            }
        } catch (Exception e) {
            com.iab.omid.library.bigosg.utils.d.a("Error during attestation with mechanism: ".concat(String.valueOf(str)), e);
        }
    }
}
