package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzary extends zzgre implements zzgsp {
    private static final zzary zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzary zzaryVar = new zzary();
        zzb = zzaryVar;
        zzgre.zzaQ(zzary.class, zzaryVar);
    }

    private zzary() {
    }

    public static zzarx zze() {
        return (zzarx) zzb.zzaz();
    }

    public static zzary zzg() {
        return zzb;
    }

    public static zzary zzh(zzgpw zzgpwVar) throws zzgrq {
        return (zzary) zzgre.zzaC(zzb, zzgpwVar);
    }

    public static zzary zzi(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzary) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzl(zzary zzaryVar, String str) {
        str.getClass();
        zzaryVar.zze |= 1;
        zzaryVar.zzf = str;
    }

    static /* synthetic */ void zzm(zzary zzaryVar, long j) {
        zzaryVar.zze |= 16;
        zzaryVar.zzj = j;
    }

    static /* synthetic */ void zzn(zzary zzaryVar, String str) {
        str.getClass();
        zzaryVar.zze |= 2;
        zzaryVar.zzg = str;
    }

    static /* synthetic */ void zzo(zzary zzaryVar, long j) {
        zzaryVar.zze |= 4;
        zzaryVar.zzh = j;
    }

    static /* synthetic */ void zzp(zzary zzaryVar, long j) {
        zzaryVar.zze |= 8;
        zzaryVar.zzi = j;
    }

    public final long zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzary();
        }
        zzarw zzarwVar = null;
        if (i2 == 4) {
            return new zzarx(zzarwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zzf;
    }
}
