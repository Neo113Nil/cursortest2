package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzann extends zzgre implements zzgsp {
    private static final zzann zzb;
    private int zze;
    private zzgrn zzf = zzaK();
    private zzgpw zzg = zzgpw.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzann zzannVar = new zzann();
        zzb = zzannVar;
        zzgre.zzaQ(zzann.class, zzannVar);
    }

    private zzann() {
    }

    public static zzanm zza() {
        return (zzanm) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzann zzannVar, zzgpw zzgpwVar) {
        zzgrn zzgrnVar = zzannVar.zzf;
        if (!zzgrnVar.zzc()) {
            zzannVar.zzf = zzgre.zzaL(zzgrnVar);
        }
        zzannVar.zzf.add(zzgpwVar);
    }

    static /* synthetic */ void zze(zzann zzannVar, zzgpw zzgpwVar) {
        zzannVar.zze |= 1;
        zzannVar.zzg = zzgpwVar;
    }

    static /* synthetic */ void zzf(zzann zzannVar, int i) {
        zzannVar.zzi = i - 1;
        zzannVar.zze |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzanh.zza, "zzi", zzanf.zza});
        }
        if (i2 == 3) {
            return new zzann();
        }
        zzamj zzamjVar = null;
        if (i2 == 4) {
            return new zzanm(zzamjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
