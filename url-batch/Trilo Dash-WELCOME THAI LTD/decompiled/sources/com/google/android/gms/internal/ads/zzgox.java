package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgox extends zzgko implements zzglz {
    private static final zzgox zzb;
    private int zze;
    private int zzf;
    private zzgok zzh;
    private zzgoo zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private zzgkt zzk = zzaE();
    private String zzl = "";
    private zzgkx zzn = zzgko.zzaH();

    static {
        zzgox zzgoxVar = new zzgox();
        zzb = zzgoxVar;
        zzgko.zzaN(zzgox.class, zzgoxVar);
    }

    private zzgox() {
    }

    public static zzgow zzc() {
        return (zzgow) zzb.zzaw();
    }

    static /* synthetic */ void zzf(zzgox zzgoxVar, int i) {
        zzgoxVar.zze |= 1;
        zzgoxVar.zzf = i;
    }

    static /* synthetic */ void zzg(zzgox zzgoxVar, String str) {
        str.getClass();
        zzgoxVar.zze |= 2;
        zzgoxVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzgox zzgoxVar, zzgok zzgokVar) {
        zzgokVar.getClass();
        zzgoxVar.zzh = zzgokVar;
        zzgoxVar.zze |= 4;
    }

    static /* synthetic */ void zzi(zzgox zzgoxVar, String str) {
        str.getClass();
        zzgkx zzgkxVar = zzgoxVar.zzn;
        if (!zzgkxVar.zzc()) {
            zzgoxVar.zzn = zzgko.zzaI(zzgkxVar);
        }
        zzgoxVar.zzn.add(str);
    }

    static /* synthetic */ void zzj(zzgox zzgoxVar, int i) {
        zzgoxVar.zzm = i - 1;
        zzgoxVar.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final String zze() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgou.zza, "zzn"});
        }
        if (i2 == 3) {
            return new zzgox();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgow(zzgoaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
