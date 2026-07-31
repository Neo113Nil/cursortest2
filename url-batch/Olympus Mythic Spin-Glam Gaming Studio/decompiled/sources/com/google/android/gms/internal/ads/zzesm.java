package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
final class zzesm implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdmy zza;

    zzesm(zzesn zzesnVar, zzdmy zzdmyVar) {
        this.zza = zzdmyVar;
        Objects.requireNonNull(zzesnVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdmy zzdmyVar = this.zza;
        zzdmyVar.zzd().zza();
        zzdmyVar.zze().zza();
    }
}
