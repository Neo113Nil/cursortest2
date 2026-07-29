package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaml extends zzgko implements zzglz {
    private static final zzaml zzb;
    private int zze;
    private zzgkx zzf = zzaH();
    private zzgjg zzg = zzgjg.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzaml zzamlVar = new zzaml();
        zzb = zzamlVar;
        zzgko.zzaN(zzaml.class, zzamlVar);
    }

    private zzaml() {
    }

    public static zzamk zza() {
        return (zzamk) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzaml zzamlVar, zzgjg zzgjgVar) {
        zzgkx zzgkxVar = zzamlVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzamlVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzamlVar.zzf.add(zzgjgVar);
    }

    static /* synthetic */ void zze(zzaml zzamlVar, zzgjg zzgjgVar) {
        zzamlVar.zze |= 1;
        zzamlVar.zzg = zzgjgVar;
    }

    static /* synthetic */ void zzf(zzaml zzamlVar, int i) {
        zzamlVar.zzi = i - 1;
        zzamlVar.zze |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzamf.zza, "zzi", zzamd.zza});
        }
        if (i2 == 3) {
            return new zzaml();
        }
        zzalh zzalhVar = null;
        if (i2 == 4) {
            return new zzamk(zzalhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
