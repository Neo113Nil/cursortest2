package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zztg {

    @Nullable
    private final Context zza;
    private zzto zzb;

    @Nullable
    private zzql zzc;
    private zztm zzd;

    public zztg(@Nullable Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zzto.zza;
        if (context == null) {
            this.zzc = zzql.zza;
        }
    }

    public final zztg zza(zzto zztoVar) {
        this.zzb = zztoVar;
        return this;
    }

    final zztg zzb(@Nullable zzql zzqlVar) {
        if (this.zza == null) {
            this.zzc = zzqlVar;
        }
        return this;
    }

    public final zzti zzc() {
        if (this.zzd == null) {
            this.zzd = new zztm(this.zza);
        }
        return new zzti(this, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzql zze() {
        return this.zzc;
    }

    public final zztg zzf(zztm zztmVar) {
        this.zzd = zztmVar;
        return this;
    }

    final /* synthetic */ zztm zzg() {
        return this.zzd;
    }
}
