package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public class zzdnb {
    private final zzdom zza;

    @Nullable
    private final zzclm zzb;

    public zzdnb(zzdom zzdomVar, @Nullable zzclm zzclmVar) {
        this.zza = zzdomVar;
        this.zzb = zzclmVar;
    }

    public final zzdom zza() {
        return this.zza;
    }

    @Nullable
    public final zzclm zzb() {
        return this.zzb;
    }

    @Nullable
    public final View zzc() {
        zzclm zzclmVar = this.zzb;
        if (zzclmVar != null) {
            return zzclmVar.zzD();
        }
        return null;
    }

    @Nullable
    public final View zzd() {
        zzclm zzclmVar = this.zzb;
        if (zzclmVar == null) {
            return null;
        }
        return zzclmVar.zzD();
    }

    public Set zze(zzdce zzdceVar) {
        return Collections.singleton(new zzdlo(zzdceVar, zzcgj.zzh));
    }

    public Set zzf(zzdce zzdceVar) {
        return Collections.singleton(new zzdlo(zzdceVar, zzcgj.zzh));
    }

    public final zzdlo zzg(Executor executor) {
        final zzclm zzclmVar = this.zzb;
        return new zzdlo(new zzdim() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // com.google.android.gms.internal.ads.zzdim
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzclm zzclmVar2 = zzclm.this;
                if (zzclmVar2 == null || (zzL = zzclmVar2.zzL()) == null) {
                    return;
                }
                zzL.zza();
            }
        }, executor);
    }
}
