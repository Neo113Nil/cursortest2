package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfaa implements zzfaz {
    private zzdcj zza;
    private final Executor zzb = zzfzw.zzb();

    public final zzdcj zza() {
        return this.zza;
    }

    public final zzfzp zzb(zzfba zzfbaVar, zzfay zzfayVar, zzdcj zzdcjVar) {
        zzdci zza = zzfayVar.zza(zzfbaVar.zzb);
        zza.zzb(new zzfbf(true));
        zzdcj zzdcjVar2 = (zzdcj) zza.zzh();
        this.zza = zzdcjVar2;
        final zzdah zzb = zzdcjVar2.zzb();
        final zzffz zzffzVar = new zzffz();
        return zzfzg.zzm(zzfzg.zzn(zzfyx.zzv(zzb.zzi()), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                zzffz zzffzVar2 = zzffzVar;
                zzdah zzdahVar = zzb;
                zzfdw zzfdwVar = (zzfdw) obj;
                zzffzVar2.zzb = zzfdwVar;
                Iterator it = zzfdwVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfdk) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzdahVar.zzh(zzfzg.zzi(zzfdwVar));
                    }
                }
                return zzfzg.zzi(null);
            }
        }, this.zzb), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzffz zzffzVar2 = zzffz.this;
                zzffzVar2.zzc = (zzcze) obj;
                return zzffzVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzfba zzfbaVar, zzfay zzfayVar, Object obj) {
        return zzb(zzfbaVar, zzfayVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
