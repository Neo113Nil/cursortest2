package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcvg implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcvg(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
    }

    public static zzcvg zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcvg(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdlo((zzcuy) this.zza.zzb(), zzfoy.zzc()));
        zzioe.zzb(emptySet);
        return emptySet;
    }
}
