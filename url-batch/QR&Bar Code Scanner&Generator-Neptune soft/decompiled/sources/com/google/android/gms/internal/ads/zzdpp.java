package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdpp implements zzblr {
    final /* synthetic */ zzdql zza;
    final /* synthetic */ ViewGroup zzb;

    zzdpp(zzdql zzdqlVar, ViewGroup viewGroup) {
        this.zza = zzdqlVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzc() {
        zzdql zzdqlVar = this.zza;
        zzfvn zzfvnVar = zzdpm.zza;
        Map zzm = zzdqlVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfvnVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzm.get((String) zzfvnVar.get(i)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
