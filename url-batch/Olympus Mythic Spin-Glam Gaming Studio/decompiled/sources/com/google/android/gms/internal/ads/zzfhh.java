package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzfhh implements zzeup {
    final /* synthetic */ zzfhk zza;

    zzfhh(zzfhk zzfhkVar) {
        Objects.requireNonNull(zzfhkVar);
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        zzfhk zzfhkVar = this.zza;
        synchronized (zzfhkVar) {
            zzfhkVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvx zzcvxVar = (zzcvx) obj;
        zzfhk zzfhkVar = this.zza;
        synchronized (zzfhkVar) {
            try {
                zzcvx zzcvxVar2 = zzfhkVar.zza;
                if (zzcvxVar2 != null) {
                    zzcvxVar2.zzd();
                }
                zzfhkVar.zza = zzcvxVar;
                zzcvxVar.zza(zzfhkVar);
                zzfhkVar.zzU().zzt(new zzcvy(zzcvxVar, zzfhkVar, zzfhkVar.zzU(), zzfhkVar.zzV()));
                zzcvxVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
