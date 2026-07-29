package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzdof implements zzbkn {
    final /* synthetic */ zzdpb zza;
    final /* synthetic */ ViewGroup zzb;

    zzdof(zzdpb zzdpbVar, ViewGroup viewGroup) {
        this.zza = zzdpbVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzc() {
        zzdpb zzdpbVar = this.zza;
        zzfrh zzfrhVar = zzdoc.zza;
        Map zzm = zzdpbVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfrhVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzm.get((String) zzfrhVar.get(i)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
