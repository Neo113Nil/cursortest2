package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfal implements zzfaz {
    private final zzffq zza;
    private final Executor zzb;
    private final zzfzc zzc = new zzfaj(this);

    public zzfal(zzffq zzffqVar, Executor executor) {
        this.zza = zzffqVar;
        this.zzb = executor;
    }

    final /* synthetic */ zzfzp zza(zzdcj zzdcjVar, zzfau zzfauVar) throws Exception {
        zzfga zzfgaVar = zzfauVar.zzb;
        zzcbc zzcbcVar = zzfauVar.zza;
        zzffz zzb = zzfgaVar != null ? this.zza.zzb(zzfgaVar) : null;
        if (zzfgaVar == null) {
            return zzfzg.zzi(null);
        }
        if (zzb != null && zzcbcVar != null) {
            zzfzg.zzr(zzdcjVar.zzb().zzg(zzcbcVar), this.zzc, this.zzb);
        }
        return zzfzg.zzi(new zzfak(zzfgaVar, zzcbcVar, zzb));
    }

    public final zzfzp zzb(zzfba zzfbaVar, zzfay zzfayVar, final zzdcj zzdcjVar) {
        return zzfzg.zzf(zzfzg.zzn(zzfyx.zzv(new zzfav(this.zza, zzdcjVar, this.zzb).zzc()), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfal.this.zza(zzdcjVar, (zzfau) obj);
            }
        }, this.zzb), Exception.class, new zzfai(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzfba zzfbaVar, zzfay zzfayVar, Object obj) {
        return zzb(zzfbaVar, zzfayVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
