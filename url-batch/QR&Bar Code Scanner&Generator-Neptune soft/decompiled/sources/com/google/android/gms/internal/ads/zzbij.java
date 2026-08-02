package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbij extends zzgra implements zzgsp {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzbij() {
        super(r0);
        zzbik zzbikVar;
        zzbikVar = zzbik.zzb;
    }

    public final zzbij zza(boolean z) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        zzbik.zzd((zzbik) this.zza, z);
        return this;
    }

    public final zzbij zzb(int i) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        zzbik.zze((zzbik) this.zza, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbik) this.zza).zzf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzbij(zzbew zzbewVar) {
        super(r1);
        zzbik zzbikVar;
        zzbikVar = zzbik.zzb;
    }
}
