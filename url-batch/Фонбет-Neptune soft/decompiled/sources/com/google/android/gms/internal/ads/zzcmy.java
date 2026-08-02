package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcmy implements zzcxl {
    private final zzfge zza;

    public zzcmy(zzfge zzfgeVar) {
        this.zza = zzfgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzffn e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzffn e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzdm(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzffn e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
