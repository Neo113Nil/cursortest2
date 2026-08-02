package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbik extends zzgre implements zzgsp {
    private static final zzbik zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbik zzbikVar = new zzbik();
        zzb = zzbikVar;
        zzgre.zzaQ(zzbik.class, zzbikVar);
    }

    private zzbik() {
    }

    public static zzbij zza() {
        return (zzbij) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbik zzbikVar, boolean z) {
        zzbikVar.zze |= 1;
        zzbikVar.zzf = z;
    }

    static /* synthetic */ void zze(zzbik zzbikVar, int i) {
        zzbikVar.zze |= 2;
        zzbikVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbik();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbij(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
