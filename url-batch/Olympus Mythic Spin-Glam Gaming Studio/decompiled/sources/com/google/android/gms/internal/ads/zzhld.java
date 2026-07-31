package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhld implements zzhek {
    private final zzhoh zza;

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] zza = ((zzhlc) it.next()).zza.zza(bArr, bArr2);
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
