package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzedc implements zzdfv {
    private final Context zza;
    private final zzceu zzb;

    zzedc(Context context, zzceu zzceuVar) {
        this.zza = context;
        this.zzb = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
        if (TextUtils.isEmpty(zzfdwVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzfdwVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzfdwVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
    }
}
