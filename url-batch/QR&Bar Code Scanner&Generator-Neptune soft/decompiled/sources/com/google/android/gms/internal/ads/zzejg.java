package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzejg implements zzdmp {
    private final zzfdk zza;
    private final zzbxd zzb;
    private final boolean zzc;
    private zzdds zzd = null;

    zzejg(zzfdk zzfdkVar, zzbxd zzbxdVar, boolean z) {
        this.zza = zzfdkVar;
        this.zzb = zzbxdVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdmp
    public final void zza(boolean z, Context context, zzddn zzddnVar) throws zzdmo {
        try {
            if (!(this.zzc ? this.zzb.zzr(ObjectWrapper.wrap(context)) : this.zzb.zzq(ObjectWrapper.wrap(context)))) {
                throw new zzdmo("Adapter failed to show.");
            }
            if (this.zzd == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbp)).booleanValue() || this.zza.zzZ != 2) {
                return;
            }
            this.zzd.zza();
        } catch (Throwable th) {
            throw new zzdmo(th);
        }
    }

    public final void zzb(zzdds zzddsVar) {
        this.zzd = zzddsVar;
    }
}
