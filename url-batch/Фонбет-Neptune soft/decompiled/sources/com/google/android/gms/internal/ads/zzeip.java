package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeip {
    private final zzffy zza;
    private final zzdpy zzb;
    private final zzdsk zzc;

    public zzeip(zzffy zzffyVar, zzdpy zzdpyVar, zzdsk zzdskVar) {
        this.zza = zzffyVar;
        this.zzb = zzdpyVar;
        this.zzc = zzdskVar;
    }

    public final void zza(zzfeo zzfeoVar, zzfel zzfelVar, int i, @Nullable zzeex zzeexVar, long j) {
        zzdpx zzdpxVar;
        zzdsj zza = this.zzc.zza();
        zza.zzd(zzfeoVar);
        zza.zzc(zzfelVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j));
        zza.zzb("sc", Integer.toString(i));
        if (zzeexVar != null) {
            zza.zzb("arec", Integer.toString(zzeexVar.zzb().zza));
            String zza2 = this.zza.zza(zzeexVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdpy zzdpyVar = this.zzb;
        Iterator it = zzfelVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpxVar = null;
                break;
            } else {
                zzdpxVar = zzdpyVar.zza((String) it.next());
                if (zzdpxVar != null) {
                    break;
                }
            }
        }
        if (zzdpxVar != null) {
            zza.zzb("ancn", zzdpxVar.zza);
            zzbra zzbraVar = zzdpxVar.zzb;
            if (zzbraVar != null) {
                zza.zzb("adapter_v", zzbraVar.toString());
            }
            zzbra zzbraVar2 = zzdpxVar.zzc;
            if (zzbraVar2 != null) {
                zza.zzb("adapter_sv", zzbraVar2.toString());
            }
        }
        zza.zzf();
    }
}
