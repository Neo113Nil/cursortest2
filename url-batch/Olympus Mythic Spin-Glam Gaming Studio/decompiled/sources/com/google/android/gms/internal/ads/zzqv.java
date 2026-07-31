package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzqv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzqv zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzqv zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzqv zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqw zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqw(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
