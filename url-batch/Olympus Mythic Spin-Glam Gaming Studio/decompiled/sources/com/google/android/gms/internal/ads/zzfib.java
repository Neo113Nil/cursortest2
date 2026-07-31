package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfib implements zzfiu {
    private final zzfiu zza;
    private final zzfiu zzb;
    private final zzfoh zzc;
    private final String zzd;
    private zzdcx zze;
    private final Executor zzf;

    public zzfib(zzfiu zzfiuVar, zzfiu zzfiuVar2, zzfoh zzfohVar, String str, Executor executor) {
        this.zza = zzfiuVar;
        this.zzb = zzfiuVar2;
        this.zzc = zzfohVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfnu zzfnuVar, zzfiv zzfivVar) {
        zzdcx zzdcxVar = zzfnuVar.zza;
        this.zze = zzdcxVar;
        if (zzfnuVar.zzc != null) {
            if (zzdcxVar.zzc() != null) {
                zzfnuVar.zzc.zzp().zzv(zzfnuVar.zza.zzc());
            }
            return zzhcy.zza(zzfnuVar.zzc);
        }
        zzdcxVar.zza().zzh(zzfnuVar.zzb);
        return ((zzfil) this.zza).zzb(zzfivVar, null, zzfnuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcx zzd() {
        return this.zze;
    }

    public final synchronized ListenableFuture zzb(final zzfiv zzfivVar, final zzfit zzfitVar, zzdcx zzdcxVar) {
        zzdcw zza = zzfitVar.zza(zzfivVar.zzb);
        zza.zzi(new zzfic(this.zzd));
        final zzdcx zzdcxVar2 = (zzdcx) zza.zzh();
        zzdcxVar2.zzb();
        zzdcxVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdcxVar2.zzb().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzflw zzb = zzdcxVar2.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzb.zzd;
            String str = zzb.zzg;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzb.zzk;
            Executor executor = this.zzf;
            final zzfia zzfiaVar = new zzfia(zzfitVar, zzfivVar, zzmVar2, str, executor, zzxVar, null);
            return (zzhcq) zzhcy.zzj(zzhcq.zzw(((zzfih) this.zzb).zza(zzfivVar, zzfitVar, zzdcxVar2)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfhz
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzfib.this.zze(zzfivVar, zzfiaVar, zzfitVar, zzdcxVar2, (zzfig) obj);
                }
            }, executor);
        }
        this.zze = zzdcxVar2;
        return ((zzfil) this.zza).zzb(zzfivVar, zzfitVar, zzdcxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfiv zzfivVar, zzfia zzfiaVar, zzfit zzfitVar, zzdcx zzdcxVar, zzfig zzfigVar) {
        if (zzfigVar != null) {
            zzfia zzfiaVar2 = new zzfia(zzfiaVar.zza, zzfiaVar.zzb, zzfiaVar.zzc, zzfiaVar.zzd, zzfiaVar.zze, zzfiaVar.zzf, zzfigVar.zza);
            zzfnu zzfnuVar = zzfigVar.zzc;
            if (zzfnuVar != null) {
                this.zze = null;
                this.zzc.zza(zzfiaVar2);
                return zzg(zzfnuVar, zzfivVar);
            }
            zzfoh zzfohVar = this.zzc;
            ListenableFuture zzb = zzfohVar.zzb(zzfiaVar2);
            if (zzb != null) {
                this.zze = null;
                return zzhcy.zzj(zzb, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfhy
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzfib.this.zzf((zzfod) obj);
                    }
                }, this.zzf);
            }
            zzfohVar.zza(zzfiaVar2);
            zzfivVar = new zzfiv(zzfivVar.zzb, zzfigVar.zzb);
        }
        ListenableFuture zzb2 = ((zzfil) this.zza).zzb(zzfivVar, zzfitVar, zzdcxVar);
        this.zze = zzdcxVar;
        return zzb2;
    }

    final /* synthetic */ ListenableFuture zzf(zzfod zzfodVar) {
        zzfnu zzfnuVar;
        zzfof zzfofVar;
        if (zzfodVar == null || (zzfnuVar = zzfodVar.zza) == null || (zzfofVar = zzfodVar.zzb) == null) {
            throw new zzefb(1, "Empty prefetch");
        }
        zzbil.zzb.zzc zzs = zzbil.zzb.zzs();
        zzbil.zzb.zza.C0243zza zzs2 = zzbil.zzb.zza.zzs();
        zzs2.zzc(zzbil.zzb.zzd.IN_MEMORY);
        zzs2.zzg(zzbil.zzb.zze.zzs());
        zzs.zzh(zzs2);
        zzfnuVar.zza.zza().zzd().zzl(zzs.zzbu());
        return zzg(zzfnuVar, ((zzfia) zzfofVar).zzb);
    }
}
