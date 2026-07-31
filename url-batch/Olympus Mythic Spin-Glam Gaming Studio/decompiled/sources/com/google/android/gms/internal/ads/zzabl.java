package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public abstract class zzabl {

    @Nullable
    private zzabk zza;

    @Nullable
    private zzabu zzb;

    @CallSuper
    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    @Nullable
    public zznf zzg() {
        throw null;
    }

    public abstract void zzq(@Nullable Object obj);

    public abstract zzabm zzr(zzng[] zzngVarArr, zzzr zzzrVar, zzxo zzxoVar, zzbf zzbfVar) throws zzjn;

    @CallSuper
    public final void zzs(zzabk zzabkVar, zzabu zzabuVar) {
        zzguk.zzi(this.zza == null);
        this.zza = zzabkVar;
        this.zzb = zzabuVar;
    }

    protected final void zzt() {
        zzabk zzabkVar = this.zza;
        if (zzabkVar != null) {
            zzabkVar.zzq();
        }
    }

    protected final zzabu zzu() {
        zzabu zzabuVar = this.zzb;
        zzabuVar.getClass();
        return zzabuVar;
    }
}
