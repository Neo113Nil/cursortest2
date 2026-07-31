package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzerz implements zzemq {
    private final Context zza;
    private final zzcxi zzb;

    @Nullable
    private final zzbkb zzc;
    private final zzhdi zzd;
    private final zzfqi zze;

    public zzerz(Context context, zzcxi zzcxiVar, zzfqi zzfqiVar, zzhdi zzhdiVar, @Nullable zzbkb zzbkbVar) {
        this.zza = context;
        this.zzb = zzcxiVar;
        this.zze = zzfqiVar;
        this.zzd = zzhdiVar;
        this.zzc = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.zzc == null || (zzfliVar = zzfldVar.zzs) == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        zzerv zzervVar = new zzerv(this, new View(this.zza), null, zzerx.zza, (zzfle) zzfldVar.zzu.get(0));
        zzcwe zzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, null), zzervVar);
        zzery zzl = zzf.zzl();
        zzfli zzfliVar = zzfldVar.zzs;
        final zzbjw zzbjwVar = new zzbjw(zzl, zzfliVar.zzb, zzfliVar.zza);
        zzfqc zzfqcVar = zzfqc.CUSTOM_RENDER_SYN;
        zzfqi zzfqiVar = this.zze;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() {
                zzerz.this.zzc(zzbjwVar);
            }
        }, this.zzd, zzfqcVar, zzfqiVar).zzj(zzfqc.CUSTOM_RENDER_ACK).zze(zzhcy.zza(zzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(zzbjw zzbjwVar) {
        this.zzc.zze(zzbjwVar);
    }
}
