package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfj extends zzgre implements zzgsp {
    private static final zzbfj zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbfj zzbfjVar = new zzbfj();
        zzb = zzbfjVar;
        zzgre.zzaQ(zzbfj.class, zzbfjVar);
    }

    private zzbfj() {
    }

    public static zzbfi zza() {
        return (zzbfi) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbfj zzbfjVar, boolean z) {
        zzbfjVar.zze |= 1;
        zzbfjVar.zzf = z;
    }

    static /* synthetic */ void zze(zzbfj zzbfjVar, boolean z) {
        zzbfjVar.zze |= 2;
        zzbfjVar.zzg = z;
    }

    static /* synthetic */ void zzf(zzbfj zzbfjVar, int i) {
        zzbfjVar.zze |= 4;
        zzbfjVar.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbfj();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfi(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
