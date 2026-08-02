package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzffr implements zzffq {
    private final ConcurrentHashMap zza;
    private final zzffx zzb;
    private final zzfft zzc = new zzfft();

    public zzffr(zzffx zzffxVar) {
        this.zza = new ConcurrentHashMap(zzffxVar.zzd);
        this.zzb = zzffxVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzffx> creator = zzffx.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfv)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfga) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzffp) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzffp) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzffp) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.zze.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffq
    public final zzffx zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzffq
    public final synchronized zzffz zzb(zzfga zzfgaVar) {
        zzffz zzffzVar;
        zzffp zzffpVar = (zzffp) this.zza.get(zzfgaVar);
        if (zzffpVar != null) {
            zzffzVar = zzffpVar.zze();
            if (zzffzVar == null) {
                this.zzc.zze();
            }
            zzfgn zzf = zzffpVar.zzf();
            if (zzffzVar != null) {
                zzbfe zza = zzbfk.zza();
                zzbfc zza2 = zzbfd.zza();
                zza2.zzd(2);
                zzbfg zza3 = zzbfh.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzffzVar.zza.zzb().zzc().zze((zzbfk) zza.zzam());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzffzVar = null;
        }
        return zzffzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffq
    @Deprecated
    public final zzfga zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfgb(zzlVar, str, new zzcbg(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzffq
    public final synchronized boolean zzd(zzfga zzfgaVar, zzffz zzffzVar) {
        boolean zzh;
        zzffp zzffpVar = (zzffp) this.zza.get(zzfgaVar);
        zzffzVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzffpVar == null) {
            zzffx zzffxVar = this.zzb;
            zzffpVar = new zzffp(zzffxVar.zzd, zzffxVar.zze * 1000);
            int size = this.zza.size();
            zzffx zzffxVar2 = this.zzb;
            if (size == zzffxVar2.zzc) {
                int i = zzffxVar2.zzg;
                int i2 = i - 1;
                zzfga zzfgaVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzffp) entry.getValue()).zzc() < j) {
                            j = ((zzffp) entry.getValue()).zzc();
                            zzfgaVar2 = (zzfga) entry.getKey();
                        }
                    }
                    if (zzfgaVar2 != null) {
                        this.zza.remove(zzfgaVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzffp) entry2.getValue()).zzd() < j) {
                            j = ((zzffp) entry2.getValue()).zzd();
                            zzfgaVar2 = (zzfga) entry2.getKey();
                        }
                    }
                    if (zzfgaVar2 != null) {
                        this.zza.remove(zzfgaVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzffp) entry3.getValue()).zza() < i3) {
                            i3 = ((zzffp) entry3.getValue()).zza();
                            zzfgaVar2 = (zzfga) entry3.getKey();
                        }
                    }
                    if (zzfgaVar2 != null) {
                        this.zza.remove(zzfgaVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfgaVar, zzffpVar);
            this.zzc.zzd();
        }
        zzh = zzffpVar.zzh(zzffzVar);
        this.zzc.zzc();
        zzffs zza = this.zzc.zza();
        zzfgn zzf = zzffpVar.zzf();
        if (zzffzVar != null) {
            zzbfe zza2 = zzbfk.zza();
            zzbfc zza3 = zzbfd.zza();
            zza3.zzd(2);
            zzbfi zza4 = zzbfj.zza();
            zza4.zza(zza.zza);
            zza4.zzb(zza.zzb);
            zza4.zzc(zzf.zzb);
            zza3.zzc(zza4);
            zza2.zza(zza3);
            zzffzVar.zza.zzb().zzc().zzf((zzbfk) zza2.zzam());
        }
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzffq
    public final synchronized boolean zze(zzfga zzfgaVar) {
        zzffp zzffpVar = (zzffp) this.zza.get(zzfgaVar);
        if (zzffpVar != null) {
            return zzffpVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
