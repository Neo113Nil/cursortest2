package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzakm;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzbh implements zzakh {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zza(zzakm zzakmVar) {
        zze.zzj("Failed to load URL: " + this.zza + "\n" + zzakmVar.toString());
        this.zzb.zza((Object) null);
    }
}
