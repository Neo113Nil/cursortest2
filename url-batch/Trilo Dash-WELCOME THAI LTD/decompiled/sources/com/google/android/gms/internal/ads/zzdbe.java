package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdbe {
    private final Context zza;
    private final zzfby zzb;
    private final Bundle zzc;
    private final zzfbt zzd;

    /* synthetic */ zzdbe(zzdbc zzdbcVar, zzdbd zzdbdVar) {
        Context context;
        zzfby zzfbyVar;
        Bundle bundle;
        zzfbt zzfbtVar;
        context = zzdbcVar.zza;
        this.zza = context;
        zzfbyVar = zzdbcVar.zzb;
        this.zzb = zzfbyVar;
        bundle = zzdbcVar.zzc;
        this.zzc = bundle;
        zzfbtVar = zzdbcVar.zzd;
        this.zzd = zzfbtVar;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzdbc zzc() {
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(this.zza);
        zzdbcVar.zzf(this.zzb);
        zzdbcVar.zzd(this.zzc);
        return zzdbcVar;
    }

    final zzfbt zzd() {
        return this.zzd;
    }

    final zzfby zze() {
        return this.zzb;
    }
}
