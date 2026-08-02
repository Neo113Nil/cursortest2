package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvy extends zzgre implements zzgsp {
    private static final zzgvy zzb;
    private int zze;
    private int zzf;
    private zzgvl zzh;
    private zzgvp zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private zzgrj zzk = zzaH();
    private String zzl = "";
    private zzgrn zzn = zzgre.zzaK();

    static {
        zzgvy zzgvyVar = new zzgvy();
        zzb = zzgvyVar;
        zzgre.zzaQ(zzgvy.class, zzgvyVar);
    }

    private zzgvy() {
    }

    public static zzgvx zzc() {
        return (zzgvx) zzb.zzaz();
    }

    static /* synthetic */ void zzf(zzgvy zzgvyVar, int i) {
        zzgvyVar.zze |= 1;
        zzgvyVar.zzf = i;
    }

    static /* synthetic */ void zzg(zzgvy zzgvyVar, String str) {
        str.getClass();
        zzgvyVar.zze |= 2;
        zzgvyVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzgvy zzgvyVar, zzgvl zzgvlVar) {
        zzgvlVar.getClass();
        zzgvyVar.zzh = zzgvlVar;
        zzgvyVar.zze |= 4;
    }

    static /* synthetic */ void zzi(zzgvy zzgvyVar, String str) {
        str.getClass();
        zzgrn zzgrnVar = zzgvyVar.zzn;
        if (!zzgrnVar.zzc()) {
            zzgvyVar.zzn = zzgre.zzaL(zzgrnVar);
        }
        zzgvyVar.zzn.add(str);
    }

    static /* synthetic */ void zzj(zzgvy zzgvyVar, int i) {
        zzgvyVar.zzm = i - 1;
        zzgvyVar.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgvv.zza, "zzn"});
        }
        if (i2 == 3) {
            return new zzgvy();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvx(zzguqVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
