package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcvf {
    private final String zza;
    private final zzbut zzb;
    private final Executor zzc;
    private zzcvk zzd;
    private final zzbpu zze = new zzcvc(this);
    private final zzbpu zzf = new zzcve(this);

    public zzcvf(String str, zzbut zzbutVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbutVar;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcvf zzcvfVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcvfVar.zza);
    }

    public final void zzc(zzcvk zzcvkVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcvkVar;
    }

    public final void zzd(zzcmp zzcmpVar) {
        zzcmpVar.zzaf("/updateActiveView", this.zze);
        zzcmpVar.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcmp zzcmpVar) {
        zzcmpVar.zzaw("/updateActiveView", this.zze);
        zzcmpVar.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
