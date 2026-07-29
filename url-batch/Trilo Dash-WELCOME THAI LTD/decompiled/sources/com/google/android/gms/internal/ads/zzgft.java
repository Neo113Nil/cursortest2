package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgft extends zzgko implements zzglz {
    private static final zzgft zzb;
    private zzgfh zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgft zzgftVar = new zzgft();
        zzb = zzgftVar;
        zzgko.zzaN(zzgft.class, zzgftVar);
    }

    private zzgft() {
    }

    public static zzgfs zzd() {
        return (zzgfs) zzb.zzaw();
    }

    static /* synthetic */ void zzf(zzgft zzgftVar, zzgfh zzgfhVar) {
        zzgfhVar.getClass();
        zzgftVar.zze = zzgfhVar;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgft();
        }
        zzgfq zzgfqVar = null;
        if (i2 == 4) {
            return new zzgfs(zzgfqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgfh zzc() {
        zzgfh zzgfhVar = this.zze;
        return zzgfhVar == null ? zzgfh.zzd() : zzgfhVar;
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
        int zzb2 = zzggn.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
