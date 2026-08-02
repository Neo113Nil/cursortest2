package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcuq implements zzddv {
    private final zzffa zza;

    public zzcuq(zzffa zzffaVar) {
        this.zza = zzffaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbq(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfek e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbs(Context context) {
        try {
            this.zza.zzs();
        } catch (zzfek e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfek e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
