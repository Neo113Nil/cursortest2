package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgmf extends zzgre implements zzgsp {
    private static final zzgmf zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzgmf zzgmfVar = new zzgmf();
        zzb = zzgmfVar;
        zzgre.zzaQ(zzgmf.class, zzgmfVar);
    }

    private zzgmf() {
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
            return zzaP(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgmf();
        }
        zzgmd zzgmdVar = null;
        if (i2 == 4) {
            return new zzgme(zzgmdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }
}
