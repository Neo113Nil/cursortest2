package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfd extends zzgre implements zzgsp {
    private static final zzbfd zzb;
    private int zze;
    private int zzf;
    private zzbfh zzg;
    private zzbfj zzh;

    static {
        zzbfd zzbfdVar = new zzbfd();
        zzb = zzbfdVar;
        zzgre.zzaQ(zzbfd.class, zzbfdVar);
    }

    private zzbfd() {
    }

    public static zzbfc zza() {
        return (zzbfc) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfd zzbfdVar, zzbfh zzbfhVar) {
        zzbfhVar.getClass();
        zzbfdVar.zzg = zzbfhVar;
        zzbfdVar.zze |= 2;
    }

    static /* synthetic */ void zze(zzbfd zzbfdVar, zzbfj zzbfjVar) {
        zzbfjVar.getClass();
        zzbfdVar.zzh = zzbfjVar;
        zzbfdVar.zze |= 4;
    }

    static /* synthetic */ void zzf(zzbfd zzbfdVar, int i) {
        zzbfdVar.zzf = 1;
        zzbfdVar.zze = 1 | zzbfdVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbff.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbfd();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfc(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
