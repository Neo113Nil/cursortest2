package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgrj implements zzgpx {
    private final zzgyz zza;

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzgrh zzgrhVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzgrhVar.zza.zza(bArr, bArr2);
                int i = zzgrhVar.zzb;
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
