package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfue extends zzfuc {
    private zzfue() {
        super(null);
    }

    /* synthetic */ zzfue(zzfub zzfubVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final int zza(zzfuf zzfufVar) {
        int zzA;
        synchronized (zzfufVar) {
            zzA = zzfuf.zzA(zzfufVar);
        }
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzb(zzfuf zzfufVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzfufVar) {
            set3 = zzfufVar.seenExceptions;
            if (set3 == null) {
                zzfufVar.seenExceptions = set2;
            }
        }
    }
}
