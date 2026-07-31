package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zziai implements zzhfo {
    private final zzhoh zza;

    zziai(zzhoh zzhohVar, zzhni zzhniVar) {
        this.zza = zzhohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((zziaj) it.next()).zza.zza(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
