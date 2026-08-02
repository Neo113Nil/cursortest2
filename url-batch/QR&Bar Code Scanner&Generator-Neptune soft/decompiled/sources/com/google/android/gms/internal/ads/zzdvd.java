package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdvd implements zzddv {
    private final zzcmp zza;

    zzdvd(zzcmp zzcmpVar) {
        this.zza = zzcmpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbq(Context context) {
        zzcmp zzcmpVar = this.zza;
        if (zzcmpVar != null) {
            zzcmpVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbs(Context context) {
        zzcmp zzcmpVar = this.zza;
        if (zzcmpVar != null) {
            zzcmpVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbt(Context context) {
        zzcmp zzcmpVar = this.zza;
        if (zzcmpVar != null) {
            zzcmpVar.onResume();
        }
    }
}
