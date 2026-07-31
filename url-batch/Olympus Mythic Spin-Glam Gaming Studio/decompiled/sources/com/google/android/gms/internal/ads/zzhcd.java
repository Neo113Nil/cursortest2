package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhcd extends zzhcb {
    private zzhcd() {
        throw null;
    }

    /* synthetic */ zzhcd(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    final void zza(zzhce zzhceVar, Set set, Set set2) {
        synchronized (zzhceVar) {
            try {
                if (zzhceVar.seenExceptionsField == null) {
                    zzhceVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    final int zzb(zzhce zzhceVar) {
        int i;
        synchronized (zzhceVar) {
            i = zzhceVar.remainingField - 1;
            zzhceVar.remainingField = i;
        }
        return i;
    }
}
