package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzezd implements zzfab {
    private zzcuz zza;
    private final Executor zzb = zzgpk.zza();

    public final zzcuz zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzcuy zza = zzfaaVar.zza(zzfacVar.zzb);
        zza.zzj(new zzfaf(true));
        zzcuz zzcuzVar2 = (zzcuz) zza.zzh();
        this.zza = zzcuzVar2;
        final zzcrw zza2 = zzcuzVar2.zza();
        final zzffa zzffaVar = new zzffa();
        zzgol zzw = zzgol.zzw(zza2.zzb());
        zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzfcu zzfcuVar = (zzfcu) obj;
                zzffaVar.zzb = zzfcuVar;
                Iterator it = zzfcuVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfcj) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zza2.zzc(zzgot.zza(zzfcuVar));
                    }
                }
                return zzgot.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgol) zzgot.zzk((zzgol) zzgot.zzj(zzw, zzgobVar, executor), new zzggr() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzffa zzffaVar2 = zzffa.this;
                zzffaVar2.zzc = (zzcqs) obj;
                return zzffaVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
