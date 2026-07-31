package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzibf implements zzibg {
    private final zzibp zza;

    @Override // com.google.android.gms.internal.ads.zzibg
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzibh.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
