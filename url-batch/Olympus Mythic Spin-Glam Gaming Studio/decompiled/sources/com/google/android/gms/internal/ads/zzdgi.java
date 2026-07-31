package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdgi extends zzdjn {
    private boolean zzb;

    @VisibleForTesting
    public zzdgi(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzdgh.zza);
        this.zzb = true;
    }
}
