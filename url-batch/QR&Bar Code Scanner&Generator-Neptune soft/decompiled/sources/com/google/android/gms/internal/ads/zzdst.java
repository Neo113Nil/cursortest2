package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdst implements zzblr {
    final /* synthetic */ zzdsu zza;

    zzdst(zzdsu zzdsuVar) {
        this.zza = zzdsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzc() {
        zzdol zzdolVar;
        zzdol zzdolVar2;
        zzdsu zzdsuVar = this.zza;
        zzdolVar = zzdsuVar.zzd;
        if (zzdolVar != null) {
            zzdolVar2 = zzdsuVar.zzd;
            zzdolVar2.zzy("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzd(MotionEvent motionEvent) {
    }
}
