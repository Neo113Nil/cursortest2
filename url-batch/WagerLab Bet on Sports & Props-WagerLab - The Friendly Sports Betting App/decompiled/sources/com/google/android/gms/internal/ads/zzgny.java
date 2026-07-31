package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgny extends zzgnw {
    private zzgny() {
        throw null;
    }

    /* synthetic */ zzgny(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        synchronized (zzgnzVar) {
            if (zzgnzVar.seenExceptionsField == null) {
                zzgnzVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final int zzb(zzgnz zzgnzVar) {
        int i;
        synchronized (zzgnzVar) {
            i = zzgnzVar.remainingField - 1;
            zzgnzVar.remainingField = i;
        }
        return i;
    }
}
