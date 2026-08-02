package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmj extends zzgre implements zzgsp {
    private static final zzgmj zzb;
    private zzglx zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgmj zzgmjVar = new zzgmj();
        zzb = zzgmjVar;
        zzgre.zzaQ(zzgmj.class, zzgmjVar);
    }

    private zzgmj() {
    }

    public static zzgmi zzd() {
        return (zzgmi) zzb.zzaz();
    }

    static /* synthetic */ void zzf(zzgmj zzgmjVar, zzglx zzglxVar) {
        zzglxVar.getClass();
        zzgmjVar.zze = zzglxVar;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgmj();
        }
        zzgmg zzgmgVar = null;
        if (i2 == 4) {
            return new zzgmi(zzgmgVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglx zzc() {
        zzglx zzglxVar = this.zze;
        return zzglxVar == null ? zzglx.zzd() : zzglxVar;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzj() {
        int zzb2 = zzgnd.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
