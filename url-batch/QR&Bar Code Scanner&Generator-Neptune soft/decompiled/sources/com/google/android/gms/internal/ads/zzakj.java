package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzakj {
    public final Object zza;
    public final zzajm zzb;
    public final zzakm zzc;
    public boolean zzd;

    private zzakj(zzakm zzakmVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakmVar;
    }

    private zzakj(Object obj, zzajm zzajmVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajmVar;
        this.zzc = null;
    }

    public static zzakj zza(zzakm zzakmVar) {
        return new zzakj(zzakmVar);
    }

    public static zzakj zzb(Object obj, zzajm zzajmVar) {
        return new zzakj(obj, zzajmVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
