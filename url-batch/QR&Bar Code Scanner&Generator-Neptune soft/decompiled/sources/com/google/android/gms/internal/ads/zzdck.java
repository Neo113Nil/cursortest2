package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdck {
    private Context zza;
    private zzfef zzb;
    private Bundle zzc;
    private zzfdx zzd;

    public final zzdck zzc(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdck zzd(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdck zze(zzfdx zzfdxVar) {
        this.zzd = zzfdxVar;
        return this;
    }

    public final zzdck zzf(zzfef zzfefVar) {
        this.zzb = zzfefVar;
        return this;
    }

    public final zzdcm zzg() {
        return new zzdcm(this, null);
    }
}
