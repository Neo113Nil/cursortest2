package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzjh implements zzabp {
    final /* synthetic */ zzjj zza;

    @GuardedBy
    private final HashMap zzb;

    @GuardedBy
    private final zzqj zzc;

    public zzjh(zzjj zzjjVar, zzqj zzqjVar) {
        Objects.requireNonNull(zzjjVar);
        this.zza = zzjjVar;
        this.zzb = new HashMap();
        this.zzc = zzqjVar;
    }

    @GuardedBy
    private final void zze(zzabn zzabnVar) {
        zzqj zzqjVar = (zzqj) this.zzb.remove(zzabnVar);
        zzqjVar.getClass();
        zzji zzjiVar = (zzji) this.zza.zzl().get(zzqjVar);
        if (zzjiVar != null) {
            zzjiVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized zzabn zza() {
        zzabn zza;
        zzjj zzjjVar = this.zza;
        zzabv zzk = zzjjVar.zzk();
        HashMap hashMap = this.zzb;
        zza = zzk.zza();
        zzqj zzqjVar = this.zzc;
        hashMap.put(zza, zzqjVar);
        zzji zzjiVar = (zzji) zzjjVar.zzl().get(zzqjVar);
        if (zzjiVar != null) {
            zzjiVar.zza();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzb(zzabn zzabnVar) {
        this.zza.zzk().zzb(zzabnVar);
        zze(zzabnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzc(@Nullable zzabo zzaboVar) {
        this.zza.zzk().zzc(zzaboVar);
        while (zzaboVar != null) {
            zze(zzaboVar.zzd());
            zzaboVar = zzaboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}
