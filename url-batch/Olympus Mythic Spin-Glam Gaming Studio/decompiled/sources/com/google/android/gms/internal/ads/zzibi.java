package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzibi implements zzibp {
    @Override // com.google.android.gms.internal.ads.zzibp
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
