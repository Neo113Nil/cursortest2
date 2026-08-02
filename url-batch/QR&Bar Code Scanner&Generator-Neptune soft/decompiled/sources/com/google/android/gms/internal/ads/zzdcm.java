package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdcm {
    private final Context zza;
    private final zzfef zzb;
    private final Bundle zzc;
    private final zzfdx zzd;

    /* synthetic */ zzdcm(zzdck zzdckVar, zzdcl zzdclVar) {
        Context context;
        zzfef zzfefVar;
        Bundle bundle;
        zzfdx zzfdxVar;
        context = zzdckVar.zza;
        this.zza = context;
        zzfefVar = zzdckVar.zzb;
        this.zzb = zzfefVar;
        bundle = zzdckVar.zzc;
        this.zzc = bundle;
        zzfdxVar = zzdckVar.zzd;
        this.zzd = zzfdxVar;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzdck zzc() {
        zzdck zzdckVar = new zzdck();
        zzdckVar.zzc(this.zza);
        zzdckVar.zzf(this.zzb);
        zzdckVar.zzd(this.zzc);
        return zzdckVar;
    }

    final zzfdx zzd() {
        return this.zzd;
    }

    final zzfef zze() {
        return this.zzb;
    }
}
