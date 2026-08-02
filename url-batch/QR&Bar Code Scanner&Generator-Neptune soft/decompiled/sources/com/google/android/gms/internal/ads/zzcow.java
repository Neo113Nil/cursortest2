package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcow implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzcow(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzeew zzeewVar = (zzeew) this.zza.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbN)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
                emptySet = Collections.singleton(new zzdkg(zzeewVar, zzfzqVar));
                zzgxq.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzgxq.zzb(emptySet);
        return emptySet;
    }
}
