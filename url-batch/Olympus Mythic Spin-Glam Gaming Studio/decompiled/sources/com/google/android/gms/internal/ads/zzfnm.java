package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfnm implements zzfnl {
    private final ConcurrentHashMap zza;
    private final zzfns zzb;
    private final zzfno zzc = new zzfno();

    public zzfnm(zzfns zzfnsVar) {
        this.zza = new ConcurrentHashMap(zzfnsVar.zzd);
        this.zzb = zzfnsVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfns> creator = zzfns.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzht)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfns zzfnsVar = this.zzb;
            sb.append(zzfnsVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfnv) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfnk) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfnk) entry.getValue()).zzc(); zzc < zzfnsVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfnk) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfnsVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    @Nullable
    public final synchronized zzfnu zza(zzfnv zzfnvVar) {
        zzfnu zzfnuVar;
        try {
            zzfnk zzfnkVar = (zzfnk) this.zza.get(zzfnvVar);
            if (zzfnkVar != null) {
                zzfnuVar = zzfnkVar.zzb();
                if (zzfnuVar == null) {
                    this.zzc.zzb();
                }
                zzfoi zzh = zzfnkVar.zzh();
                if (zzfnuVar != null) {
                    zzbil.zzb.zzc zzs = zzbil.zzb.zzs();
                    zzbil.zzb.zza.C0243zza zzs2 = zzbil.zzb.zza.zzs();
                    zzs2.zzc(zzbil.zzb.zzd.IN_MEMORY);
                    zzbil.zzb.zze.zza zzq = zzbil.zzb.zze.zzq();
                    zzq.zzc(zzh.zza);
                    zzq.zzg(zzh.zzb);
                    zzs2.zzh(zzq);
                    zzs.zzh(zzs2);
                    zzfnuVar.zza.zza().zzd().zzj(zzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfnuVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized boolean zzb(zzfnv zzfnvVar, zzfnu zzfnuVar) {
        boolean zza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfnk zzfnkVar = (zzfnk) concurrentHashMap.get(zzfnvVar);
            zzfnuVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfnkVar == null) {
                zzfns zzfnsVar = this.zzb;
                zzfnk zzfnkVar2 = new zzfnk(zzfnsVar.zzd, zzfnsVar.zze * 1000);
                if (concurrentHashMap.size() == zzfnsVar.zzc) {
                    int i = zzfnsVar.zzg;
                    int i2 = i - 1;
                    zzfnv zzfnvVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry.getValue()).zzd() < j) {
                                j = ((zzfnk) entry.getValue()).zzd();
                                zzfnvVar2 = (zzfnv) entry.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry2.getValue()).zze() < j) {
                                j = ((zzfnk) entry2.getValue()).zze();
                                zzfnvVar2 = (zzfnv) entry2.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry3.getValue()).zzf() < i3) {
                                i3 = ((zzfnk) entry3.getValue()).zzf();
                                zzfnvVar2 = (zzfnv) entry3.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfnvVar, zzfnkVar2);
                this.zzc.zzc();
                zzfnkVar = zzfnkVar2;
            }
            zza = zzfnkVar.zza(zzfnuVar);
            zzfno zzfnoVar = this.zzc;
            zzfnoVar.zze();
            zzfnn zzf = zzfnoVar.zzf();
            zzfoi zzh = zzfnkVar.zzh();
            zzbil.zzb.zzc zzs = zzbil.zzb.zzs();
            zzbil.zzb.zza.C0243zza zzs2 = zzbil.zzb.zza.zzs();
            zzs2.zzc(zzbil.zzb.zzd.IN_MEMORY);
            zzbil.zzb.zzg.zza zzs3 = zzbil.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfnuVar.zza.zza().zzd().zzk(zzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized boolean zzc(zzfnv zzfnvVar) {
        zzfnk zzfnkVar = (zzfnk) this.zza.get(zzfnvVar);
        if (zzfnkVar == null) {
            return true;
        }
        return zzfnkVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    @Deprecated
    public final zzfnv zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfns zzfnsVar = this.zzb;
        return new zzfnw(zzmVar, str, new zzcby(zzfnsVar.zza).zza().zzj, zzfnsVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final zzfns zze() {
        return this.zzb;
    }
}
