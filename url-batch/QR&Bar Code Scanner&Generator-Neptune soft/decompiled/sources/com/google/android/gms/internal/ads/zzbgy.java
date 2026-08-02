package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbgy extends zzgre implements zzgsp {
    private static final zzgrk zzb = new zzbgw();
    private static final zzbgy zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgrj zzk = zzaH();
    private zzbgt zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbgy zzbgyVar = new zzbgy();
        zze = zzbgyVar;
        zzgre.zzaQ(zzbgy.class, zzbgyVar);
    }

    private zzbgy() {
    }

    static /* synthetic */ void zzA(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzn = i - 1;
        zzbgyVar.zzf |= 64;
    }

    static /* synthetic */ void zzB(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzo = i - 1;
        zzbgyVar.zzf |= 128;
    }

    static /* synthetic */ void zzC(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzq = i - 1;
        zzbgyVar.zzf |= 512;
    }

    public static zzbgx zzg() {
        return (zzbgx) zze.zzaz();
    }

    public static zzbgy zzi(byte[] bArr) throws zzgrq {
        return (zzbgy) zzgre.zzaD(zze, bArr);
    }

    static /* synthetic */ void zzl(zzbgy zzbgyVar, long j) {
        zzbgyVar.zzf |= 1;
        zzbgyVar.zzg = j;
    }

    static /* synthetic */ void zzm(zzbgy zzbgyVar, long j) {
        zzbgyVar.zzf |= 4;
        zzbgyVar.zzi = j;
    }

    static /* synthetic */ void zzn(zzbgy zzbgyVar, long j) {
        zzbgyVar.zzf |= 8;
        zzbgyVar.zzj = j;
    }

    static /* synthetic */ void zzo(zzbgy zzbgyVar, Iterable iterable) {
        zzgrj zzgrjVar = zzbgyVar.zzk;
        if (!zzgrjVar.zzc()) {
            zzbgyVar.zzk = zzgre.zzaI(zzgrjVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbgyVar.zzk.zzh(((zzbfn) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbgy zzbgyVar, zzbgt zzbgtVar) {
        zzbgtVar.getClass();
        zzbgyVar.zzl = zzbgtVar;
        zzbgyVar.zzf |= 16;
    }

    static /* synthetic */ void zzq(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzf |= 256;
        zzbgyVar.zzp = i;
    }

    static /* synthetic */ void zzr(zzbgy zzbgyVar, zzbhc zzbhcVar) {
        zzbgyVar.zzr = zzbhcVar.zza();
        zzbgyVar.zzf |= 1024;
    }

    static /* synthetic */ void zzs(zzbgy zzbgyVar, long j) {
        zzbgyVar.zzf |= 2048;
        zzbgyVar.zzs = j;
    }

    static /* synthetic */ void zzy(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzh = i - 1;
        zzbgyVar.zzf |= 2;
    }

    static /* synthetic */ void zzz(zzbgy zzbgyVar, int i) {
        zzbgyVar.zzm = i - 1;
        zzbgyVar.zzf |= 32;
    }

    public final int zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgriVar = zzbgc.zza;
            return zzaP(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", zzbgc.zza, "zzi", "zzj", "zzk", zzbfn.zzc(), "zzl", "zzm", zzgriVar, "zzn", zzgriVar, "zzo", zzgriVar, "zzp", "zzq", zzgriVar, "zzr", zzbhc.zzc(), "zzs"});
        }
        if (i2 == 3) {
            return new zzbgy();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbgx(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbgt zzf() {
        zzbgt zzbgtVar = this.zzl;
        return zzbgtVar == null ? zzbgt.zzd() : zzbgtVar;
    }

    public final zzbhc zzj() {
        zzbhc zzb2 = zzbhc.zzb(this.zzr);
        return zzb2 == null ? zzbhc.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgrl(this.zzk, zzb);
    }

    public final int zzt() {
        int zza = zzbgd.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbgd.zza(this.zzo);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbgd.zza(this.zzq);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbgd.zza(this.zzh);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbgd.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
