package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public class zzcyl implements zzeqc {
    protected final zzflo zza;
    protected final zzfld zzb;
    private final zzdeo zzc;
    private final zzdfb zzd;

    @Nullable
    private final zzfir zze;
    private final zzddi zzf;
    private final zzdig zzg;
    private final zzdff zzh;
    private final zzdll zzi;
    private final zzdck zzj;
    private final zzebm zzk;

    protected zzcyl(zzcyk zzcykVar) {
        this.zza = zzcykVar.zza();
        this.zzb = zzcykVar.zzb();
        this.zzc = zzcykVar.zzc();
        this.zzd = zzcykVar.zzd();
        this.zze = zzcykVar.zze();
        this.zzf = zzcykVar.zzf();
        this.zzg = zzcykVar.zzg();
        this.zzh = zzcykVar.zzh();
        this.zzi = zzcykVar.zzi();
        this.zzj = zzcykVar.zzj();
        this.zzk = zzcykVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzdeo zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeqc
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzddi zzn() {
        return this.zzf;
    }

    public final zzdck zzo() {
        return this.zzj;
    }

    @Nullable
    public final zzfir zzp() {
        return this.zze;
    }

    public final zzdhf zzq() {
        return this.zzg.zzn();
    }

    public final zzflo zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzebm zzebmVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzebmVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziR)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzhab listIterator = ((zzgxm) list).listIterator(0);
        while (listIterator.hasNext()) {
            zzebn zzebnVar = (zzebn) listIterator.next();
            int[] iArr = zzebnVar.zzb;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    zzebmVar.zza(zzebnVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }
}
