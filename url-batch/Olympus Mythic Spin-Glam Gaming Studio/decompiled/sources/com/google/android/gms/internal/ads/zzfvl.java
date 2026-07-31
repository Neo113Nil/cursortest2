package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfvl {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(Context context) {
        zzfxk.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfws.zza().zzb(context);
        zzfwj.zza().zzd(context);
        zzfxf.zza(context);
        zzfxg.zza(context);
        zzfxj.zza(context);
        zzfwp.zza().zzc(context);
        zzfwi.zza().zzc(context);
        zzfwu.zza().zzb(context);
    }
}
