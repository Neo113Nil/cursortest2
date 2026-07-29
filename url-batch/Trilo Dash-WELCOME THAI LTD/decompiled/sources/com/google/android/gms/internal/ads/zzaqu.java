package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqu extends zzgko implements zzglz {
    private static final zzaqu zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaqu zzaquVar = new zzaqu();
        zzb = zzaquVar;
        zzgko.zzaN(zzaqu.class, zzaquVar);
    }

    private zzaqu() {
    }

    public static zzaqt zze() {
        return (zzaqt) zzb.zzaw();
    }

    public static zzaqu zzg() {
        return zzb;
    }

    public static zzaqu zzh(zzgjg zzgjgVar) throws zzgla {
        return (zzaqu) zzgko.zzaz(zzb, zzgjgVar);
    }

    public static zzaqu zzi(zzgjg zzgjgVar, zzgka zzgkaVar) throws zzgla {
        return (zzaqu) zzgko.zzaB(zzb, zzgjgVar, zzgkaVar);
    }

    static /* synthetic */ void zzl(zzaqu zzaquVar, String str) {
        str.getClass();
        zzaquVar.zze |= 1;
        zzaquVar.zzf = str;
    }

    static /* synthetic */ void zzm(zzaqu zzaquVar, long j) {
        zzaquVar.zze |= 16;
        zzaquVar.zzj = j;
    }

    static /* synthetic */ void zzn(zzaqu zzaquVar, String str) {
        str.getClass();
        zzaquVar.zze |= 2;
        zzaquVar.zzg = str;
    }

    static /* synthetic */ void zzo(zzaqu zzaquVar, long j) {
        zzaquVar.zze |= 4;
        zzaquVar.zzh = j;
    }

    static /* synthetic */ void zzp(zzaqu zzaquVar, long j) {
        zzaquVar.zze |= 8;
        zzaquVar.zzi = j;
    }

    public final long zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzaqu();
        }
        zzaqs zzaqsVar = null;
        if (i2 == 4) {
            return new zzaqt(zzaqsVar);
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
