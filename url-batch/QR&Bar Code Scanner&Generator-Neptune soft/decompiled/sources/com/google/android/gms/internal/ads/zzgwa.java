package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwa extends zzgre implements zzgsp {
    private static final zzgwa zzb;
    private int zze;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzgwa zzgwaVar = new zzgwa();
        zzb = zzgwaVar;
        zzgre.zzaQ(zzgwa.class, zzgwaVar);
    }

    private zzgwa() {
    }

    public static zzgvz zza() {
        return (zzgvz) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgwa zzgwaVar, String str) {
        zzgwaVar.zze |= 1;
        zzgwaVar.zzf = str;
    }

    static /* synthetic */ void zze(zzgwa zzgwaVar, long j) {
        zzgwaVar.zze |= 2;
        zzgwaVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzgwa zzgwaVar, boolean z) {
        zzgwaVar.zze |= 4;
        zzgwaVar.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzgwb.zza, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgwa();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvz(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
