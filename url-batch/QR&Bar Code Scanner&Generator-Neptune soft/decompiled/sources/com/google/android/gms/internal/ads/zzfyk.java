package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfyk extends zzfyi {
    private zzfyk() {
        super(null);
    }

    /* synthetic */ zzfyk(zzfyh zzfyhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    final int zza(zzfyl zzfylVar) {
        int zzA;
        synchronized (zzfylVar) {
            zzA = zzfyl.zzA(zzfylVar);
        }
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi
    final void zzb(zzfyl zzfylVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzfylVar) {
            set3 = zzfylVar.seenExceptions;
            if (set3 == null) {
                zzfylVar.seenExceptions = set2;
            }
        }
    }
}
