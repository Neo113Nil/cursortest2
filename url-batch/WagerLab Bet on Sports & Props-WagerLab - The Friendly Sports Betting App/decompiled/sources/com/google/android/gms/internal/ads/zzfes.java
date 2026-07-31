package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfes implements zzfer {
    private final ConcurrentHashMap zza;
    private final zzfey zzb;
    private final zzfeu zzc = new zzfeu();

    public zzfes(zzfey zzfeyVar) {
        this.zza = new ConcurrentHashMap(zzfeyVar.zzd);
        this.zzb = zzfeyVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfey> creator = zzfey.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgL)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfey zzfeyVar = this.zzb;
            sb.append(zzfeyVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzffb) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfeq) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfeq) entry.getValue()).zzc(); zzc < zzfeyVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfeq) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfeyVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized zzffa zza(zzffb zzffbVar) {
        zzffa zzffaVar;
        zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
        if (zzfeqVar != null) {
            zzffaVar = zzfeqVar.zzb();
            if (zzffaVar == null) {
                this.zzc.zzb();
            }
            zzffo zzh = zzfeqVar.zzh();
            if (zzffaVar != null) {
                zzbbn.zzb.zzc zzs = zzbbn.zzb.zzs();
                zzbbn.zzb.zza.C0073zza zzs2 = zzbbn.zzb.zza.zzs();
                zzs2.zzc(zzbbn.zzb.zzd.IN_MEMORY);
                zzbbn.zzb.zze.zza zzq = zzbbn.zzb.zze.zzq();
                zzq.zzc(zzh.zza);
                zzq.zzg(zzh.zzb);
                zzs2.zzh(zzq);
                zzs.zzh(zzs2);
                zzffaVar.zza.zza().zzd().zzj(zzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzffaVar = null;
        }
        return zzffaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzb(zzffb zzffbVar, zzffa zzffaVar) {
        boolean zza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfeq zzfeqVar = (zzfeq) concurrentHashMap.get(zzffbVar);
        zzffaVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfeqVar == null) {
            zzfey zzfeyVar = this.zzb;
            zzfeq zzfeqVar2 = new zzfeq(zzfeyVar.zzd, zzfeyVar.zze * 1000);
            if (concurrentHashMap.size() == zzfeyVar.zzc) {
                int i = zzfeyVar.zzg;
                int i2 = i - 1;
                zzffb zzffbVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfeq) entry.getValue()).zzd() < j) {
                            j = ((zzfeq) entry.getValue()).zzd();
                            zzffbVar2 = (zzffb) entry.getKey();
                        }
                    }
                    if (zzffbVar2 != null) {
                        concurrentHashMap.remove(zzffbVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfeq) entry2.getValue()).zze() < j) {
                            j = ((zzfeq) entry2.getValue()).zze();
                            zzffbVar2 = (zzffb) entry2.getKey();
                        }
                    }
                    if (zzffbVar2 != null) {
                        concurrentHashMap.remove(zzffbVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfeq) entry3.getValue()).zzf() < i3) {
                            i3 = ((zzfeq) entry3.getValue()).zzf();
                            zzffbVar2 = (zzffb) entry3.getKey();
                        }
                    }
                    if (zzffbVar2 != null) {
                        concurrentHashMap.remove(zzffbVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzffbVar, zzfeqVar2);
            this.zzc.zzc();
            zzfeqVar = zzfeqVar2;
        }
        zza = zzfeqVar.zza(zzffaVar);
        zzfeu zzfeuVar = this.zzc;
        zzfeuVar.zze();
        zzfet zzf = zzfeuVar.zzf();
        zzffo zzh = zzfeqVar.zzh();
        if (zzffaVar != null) {
            zzbbn.zzb.zzc zzs = zzbbn.zzb.zzs();
            zzbbn.zzb.zza.C0073zza zzs2 = zzbbn.zzb.zza.zzs();
            zzs2.zzc(zzbbn.zzb.zzd.IN_MEMORY);
            zzbbn.zzb.zzg.zza zzs3 = zzbbn.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzffaVar.zza.zza().zzd().zzk(zzs.zzbu());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final synchronized boolean zzc(zzffb zzffbVar) {
        zzfeq zzfeqVar = (zzfeq) this.zza.get(zzffbVar);
        if (zzfeqVar == null) {
            return true;
        }
        return zzfeqVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    @Deprecated
    public final zzffb zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfey zzfeyVar = this.zzb;
        return new zzffc(zzmVar, str, new zzbuy(zzfeyVar.zza).zza().zzj, zzfeyVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final zzfey zze() {
        return this.zzb;
    }
}
