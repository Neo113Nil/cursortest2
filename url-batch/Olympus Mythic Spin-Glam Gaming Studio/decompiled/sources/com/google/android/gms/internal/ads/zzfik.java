package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfik implements zzfiu {

    @Nullable
    private zzdcx zza;

    @Override // com.google.android.gms.internal.ads.zzfiu
    @Nullable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcx zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, @Nullable Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, @Nullable zzdcx zzdcxVar) {
        zzczp zza;
        try {
            if (zzdcxVar != null) {
                this.zza = zzdcxVar;
            } else {
                this.zza = (zzdcx) zzfitVar.zza(zzfivVar.zzb).zzh();
            }
            zza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zza.zzc(zza.zzb());
    }
}
