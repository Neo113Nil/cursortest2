package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwe extends zzgre implements zzgsp {
    private static final zzgwe zzb;
    private zzgwd zzA;
    private zzgvf zzC;
    private zzgux zzE;
    private int zze;
    private int zzf;
    private int zzg;
    private zzgvb zzk;
    private zzgvs zzo;
    private boolean zzp;
    private boolean zzs;
    private boolean zzt;
    private zzgwa zzv;
    private boolean zzw;
    private byte zzF = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgrn zzl = zzaK();
    private zzgrn zzm = zzaK();
    private String zzn = "";
    private zzgrn zzq = zzgre.zzaK();
    private String zzr = "";
    private zzgpw zzu = zzgpw.zzb;
    private String zzx = "";
    private zzgrn zzy = zzgre.zzaK();
    private zzgrn zzz = zzgre.zzaK();
    private zzgrn zzB = zzaK();
    private String zzD = "";

    static {
        zzgwe zzgweVar = new zzgwe();
        zzb = zzgweVar;
        zzgre.zzaQ(zzgwe.class, zzgweVar);
    }

    private zzgwe() {
    }

    public static zzguz zza() {
        return (zzguz) zzb.zzaz();
    }

    static /* synthetic */ void zzg(zzgwe zzgweVar, String str) {
        str.getClass();
        zzgweVar.zze |= 4;
        zzgweVar.zzh = str;
    }

    static /* synthetic */ void zzh(zzgwe zzgweVar, String str) {
        str.getClass();
        zzgweVar.zze |= 8;
        zzgweVar.zzi = str;
    }

    static /* synthetic */ void zzi(zzgwe zzgweVar, zzgvb zzgvbVar) {
        zzgvbVar.getClass();
        zzgweVar.zzk = zzgvbVar;
        zzgweVar.zze |= 32;
    }

    static /* synthetic */ void zzj(zzgwe zzgweVar, zzgvy zzgvyVar) {
        zzgvyVar.getClass();
        zzgrn zzgrnVar = zzgweVar.zzl;
        if (!zzgrnVar.zzc()) {
            zzgweVar.zzl = zzgre.zzaL(zzgrnVar);
        }
        zzgweVar.zzl.add(zzgvyVar);
    }

    static /* synthetic */ void zzk(zzgwe zzgweVar, String str) {
        zzgweVar.zze |= 64;
        zzgweVar.zzn = str;
    }

    static /* synthetic */ void zzl(zzgwe zzgweVar) {
        zzgweVar.zze &= -65;
        zzgweVar.zzn = zzb.zzn;
    }

    static /* synthetic */ void zzm(zzgwe zzgweVar, zzgvs zzgvsVar) {
        zzgvsVar.getClass();
        zzgweVar.zzo = zzgvsVar;
        zzgweVar.zze |= 128;
    }

    static /* synthetic */ void zzn(zzgwe zzgweVar, zzgwa zzgwaVar) {
        zzgwaVar.getClass();
        zzgweVar.zzv = zzgwaVar;
        zzgweVar.zze |= 8192;
    }

    static /* synthetic */ void zzo(zzgwe zzgweVar, Iterable iterable) {
        zzgrn zzgrnVar = zzgweVar.zzy;
        if (!zzgrnVar.zzc()) {
            zzgweVar.zzy = zzgre.zzaL(zzgrnVar);
        }
        zzgpf.zzau(iterable, zzgweVar.zzy);
    }

    static /* synthetic */ void zzp(zzgwe zzgweVar, Iterable iterable) {
        zzgrn zzgrnVar = zzgweVar.zzz;
        if (!zzgrnVar.zzc()) {
            zzgweVar.zzz = zzgre.zzaL(zzgrnVar);
        }
        zzgpf.zzau(iterable, zzgweVar.zzz);
    }

    static /* synthetic */ void zzq(zzgwe zzgweVar, int i) {
        zzgweVar.zzf = i - 1;
        zzgweVar.zze |= 1;
    }

    public final String zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgvy.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", zzgvt.zza, "zzg", zzguy.zza, "zzk", "zzn", "zzo", "zzu", "zzm", zzgwi.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgwo.class, "zzC", "zzD", "zzE"});
        }
        if (i2 == 3) {
            return new zzgwe();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzguz(zzguqVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzF = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
