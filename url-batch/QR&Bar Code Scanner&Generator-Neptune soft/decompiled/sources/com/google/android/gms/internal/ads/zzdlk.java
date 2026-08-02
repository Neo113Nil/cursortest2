package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzdlk {
    private final zzdmp zza;
    private final zzcmp zzb;

    public zzdlk(zzdmp zzdmpVar, zzcmp zzcmpVar) {
        this.zza = zzdmpVar;
        this.zzb = zzcmpVar;
    }

    public static final zzdkg zzh(zzfjg zzfjgVar) {
        return new zzdkg(zzfjgVar, zzchc.zzf);
    }

    public static final zzdkg zzi(zzdmu zzdmuVar) {
        return new zzdkg(zzdmuVar, zzchc.zzf);
    }

    public final View zza() {
        zzcmp zzcmpVar = this.zzb;
        if (zzcmpVar == null) {
            return null;
        }
        return zzcmpVar.zzI();
    }

    public final View zzb() {
        zzcmp zzcmpVar = this.zzb;
        if (zzcmpVar != null) {
            return zzcmpVar.zzI();
        }
        return null;
    }

    public final zzcmp zzc() {
        return this.zzb;
    }

    public final zzdkg zzd(Executor executor) {
        final zzcmp zzcmpVar = this.zzb;
        return new zzdkg(new zzdhm() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzdhm
            public final void zza() {
                zzcmp zzcmpVar2 = zzcmp.this;
                if (zzcmpVar2.zzN() != null) {
                    zzcmpVar2.zzN().zzb();
                }
            }
        }, executor);
    }

    public final zzdmp zze() {
        return this.zza;
    }

    public Set zzf(zzdca zzdcaVar) {
        return Collections.singleton(new zzdkg(zzdcaVar, zzchc.zzf));
    }

    public Set zzg(zzdca zzdcaVar) {
        return Collections.singleton(new zzdkg(zzdcaVar, zzchc.zzf));
    }
}
