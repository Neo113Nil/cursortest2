package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zztp {

    @Nullable
    private final Context zza;
    private final zzql zzb;
    private boolean zzc;
    private zzto zzd;
    private zzrj zze;

    @Nullable
    private zztr zzf;
    private zztm zzg;

    @Deprecated
    public zztp() {
        this.zza = null;
        this.zzb = zzql.zza;
    }

    public final zztw zza() {
        zzguk.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zztr(new zzcp[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new zztm(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zzto.zza;
            }
            Context context = this.zza;
            zztg zztgVar = new zztg(context);
            zztgVar.zzb(context != null ? null : this.zzb);
            zztgVar.zzf(this.zzg);
            zztgVar.zza(this.zzd);
            this.zze = zztgVar.zzc();
        } else {
            zzguk.zzi(this.zzg == null);
            zzguk.zzi(this.zzd == null);
        }
        return new zztw(this, null);
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzrj zzc() {
        return this.zze;
    }

    final /* synthetic */ zztr zzd() {
        return this.zzf;
    }

    public zztp(Context context) {
        this.zza = context;
        this.zzb = zzql.zza;
    }
}
