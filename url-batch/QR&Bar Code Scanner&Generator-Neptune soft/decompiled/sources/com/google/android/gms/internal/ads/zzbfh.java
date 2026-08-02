package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfh extends zzgre implements zzgsp {
    private static final zzbfh zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbfh zzbfhVar = new zzbfh();
        zzb = zzbfhVar;
        zzgre.zzaQ(zzbfh.class, zzbfhVar);
    }

    private zzbfh() {
    }

    public static zzbfg zza() {
        return (zzbfg) zzb.zzaz();
    }

    public static zzbfh zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbfh zzbfhVar, boolean z) {
        zzbfhVar.zze |= 1;
        zzbfhVar.zzf = z;
    }

    static /* synthetic */ void zzf(zzbfh zzbfhVar, int i) {
        zzbfhVar.zze |= 2;
        zzbfhVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbfh();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfg(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
