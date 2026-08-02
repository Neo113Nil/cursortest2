package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbn extends zzgbk {
    private zzgbn() {
        throw null;
    }

    /* synthetic */ zzgbn(zzgbm zzgbmVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final int zza(zzgbo zzgboVar) {
        int i;
        int i2;
        synchronized (zzgboVar) {
            i = zzgboVar.remaining;
            i2 = i - 1;
            zzgboVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final void zzb(zzgbo zzgboVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzgboVar) {
            set3 = zzgboVar.seenExceptions;
            if (set3 == null) {
                zzgboVar.seenExceptions = set2;
            }
        }
    }
}
