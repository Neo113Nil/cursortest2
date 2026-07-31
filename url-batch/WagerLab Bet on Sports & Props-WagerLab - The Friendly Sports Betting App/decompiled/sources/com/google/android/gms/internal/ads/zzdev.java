package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdev extends zzdbq {
    private boolean zzb;

    protected zzdev(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdeu.zza);
    }

    public final void zzb() {
        zzs(zzdeq.zza);
    }

    public final synchronized void zzc() {
        zzs(zzder.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(zzdet.zza);
            this.zzb = true;
        }
        zzs(zzdes.zza);
    }
}
