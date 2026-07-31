package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhmn extends zzhih implements zzhjt {
    private static final zzhmn zzy;
    private static volatile zzhka zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzhit zze = zzhih.zzbM();
    private String zzj = "";
    private zzhit zzo = zzbM();
    private zzhip zzv = zzbC();
    private zzhip zzx = zzbC();

    static {
        zzhmn zzhmnVar = new zzhmn();
        zzy = zzhmnVar;
        zzhih.zzbu(zzhmn.class, zzhmnVar);
    }

    private zzhmn() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zzhmm.zza, "zzc", "zzd", "zze", "zzf", zzhmk.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzhmj.class, "zzp", "zzu", "zzv", zzhmb.zza(), "zzw", "zzx", zzhml.zza});
        }
        if (ordinal == 3) {
            return new zzhmn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhmg(bArr);
        }
        if (ordinal == 5) {
            return zzy;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzz;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhmn.class) {
            zzhkaVar = zzz;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzy);
                zzz = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
