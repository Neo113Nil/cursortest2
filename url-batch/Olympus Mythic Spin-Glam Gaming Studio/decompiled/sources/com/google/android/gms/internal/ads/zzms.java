package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzms implements zzmk {
    public final zzxj zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzms(zzxq zzxqVar, boolean z) {
        this.zza = new zzxj(zzxqVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final zzbf zzb() {
        return this.zza.zzA();
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
