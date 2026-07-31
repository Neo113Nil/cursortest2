package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdcz {
    private final Context zza;
    private final zzflw zzb;
    private final Bundle zzc;

    @Nullable
    private final zzflp zzd;

    @Nullable
    private final zzdcs zze;

    @Nullable
    private final zzemv zzf;

    /* synthetic */ zzdcz(zzdcy zzdcyVar, byte[] bArr) {
        this.zza = zzdcyVar.zzh();
        this.zzb = zzdcyVar.zzi();
        this.zzc = zzdcyVar.zzj();
        this.zzd = zzdcyVar.zzk();
        this.zze = zzdcyVar.zzl();
        this.zzf = zzdcyVar.zzm();
    }

    final zzdcy zza() {
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(this.zza);
        zzdcyVar.zzb(this.zzb);
        zzdcyVar.zzc(this.zzc);
        zzdcyVar.zzd(this.zze);
        zzdcyVar.zzg(this.zzf);
        return zzdcyVar;
    }

    final zzflw zzb() {
        return this.zzb;
    }

    @Nullable
    final zzflp zzc() {
        return this.zzd;
    }

    @Nullable
    final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    final zzdcs zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzemv zzg(String str) {
        zzemv zzemvVar = this.zzf;
        return zzemvVar != null ? zzemvVar : new zzemv(str);
    }
}
