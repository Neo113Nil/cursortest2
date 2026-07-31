package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhmb {
    private static final String[] zza = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider zza() {
        String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
