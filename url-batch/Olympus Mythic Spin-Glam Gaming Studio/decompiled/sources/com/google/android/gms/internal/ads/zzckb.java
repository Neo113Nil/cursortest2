package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzckb extends zzcjs implements zzchv {
    public static final /* synthetic */ int zzd = 0;
    private zzchw zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcjk zzi;
    private long zzj;
    private long zzk;

    public zzckb(zzcif zzcifVar, zzcie zzcieVar) {
        super(zzcifVar);
        zzcku zzckuVar = new zzcku(zzcifVar.getContext(), zzcieVar, (zzcif) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzckuVar;
        zzckuVar.zzs(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckb.this.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzchw zzchwVar = this.zze;
        if (zzchwVar != null) {
            zzchwVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzchw zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzchw zzchwVar = this.zze;
        this.zze = null;
        return zzchwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb() {
        String str;
        zzckb zzckbVar;
        zzckb zzckbVar2;
        long longValue;
        long intValue;
        boolean booleanValue;
        zzckb zzckbVar3;
        long j;
        long j2;
        String str2;
        zzckb zzckbVar4;
        long j3;
        String zzc = zzc(this.zzf);
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzA)).intValue();
            zzbix zzbixVar = zzbjg.zzcG;
            zzbje zzc2 = com.google.android.gms.ads.internal.client.zzba.zzc();
            booleanValue = ((Boolean) zzc2.zzd(zzbixVar)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                zzckbVar = booleanValue;
                str = zzc2;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzckbVar = this;
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > longValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(longValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long zzH = this.zze.zzH();
                    if (zzH > 0) {
                        long zzN = this.zze.zzN();
                        if (zzN != this.zzk) {
                            try {
                                j2 = intValue;
                                str2 = zzc;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = zzc;
                                zzckbVar4 = this;
                            }
                            try {
                                zzm(this.zzf, zzc, zzN, zzH, zzN > 0, booleanValue != 0 ? this.zze.zzI() : -1L, booleanValue != 0 ? this.zze.zzJ() : -1L, booleanValue != 0 ? this.zze.zzK() : -1L, zzchw.zzP(), zzchw.zzQ());
                                zzckbVar4 = this;
                                j = zzN;
                                try {
                                    zzckbVar4.zzk = j;
                                    j3 = zzH;
                                    zzckbVar4 = zzckbVar4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str2;
                                    zzckbVar = zzckbVar4;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        String str3 = zzckbVar.zzf;
                                        String message = e.getMessage();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length());
                                        sb2.append("Failed to preload url ");
                                        sb2.append(str3);
                                        sb2.append(" Exception: ");
                                        sb2.append(message);
                                        String sb3 = sb2.toString();
                                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                                        com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        zzckbVar.zzq(zzckbVar.zzf, str, "error", zzx("error", e));
                                        zzckbVar2 = zzckbVar;
                                        com.google.android.gms.ads.internal.zzt.zzB().zzd(zzckbVar2.zzi);
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zzckbVar4 = this;
                                str = str2;
                                zzckbVar = zzckbVar4;
                                throw th;
                            }
                        } else {
                            j = zzN;
                            j2 = intValue;
                            str2 = zzc;
                            zzckbVar4 = this;
                            j3 = zzH;
                        }
                        if (j >= j3) {
                            zzckbVar4.zzp(zzckbVar4.zzf, str2, j3);
                            zzckbVar2 = zzckbVar4;
                        } else {
                            long zzO = zzckbVar4.zze.zzO();
                            zzckbVar3 = zzckbVar4;
                            if (zzO >= j2) {
                                zzckbVar3 = zzckbVar4;
                                if (j > 0) {
                                    zzckbVar2 = zzckbVar4;
                                }
                            }
                        }
                    } else {
                        zzckbVar3 = this;
                    }
                    zzckbVar3.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue());
                    return;
                }
                zzckbVar2 = this;
                com.google.android.gms.ads.internal.zzt.zzB().zzd(zzckbVar2.zzi);
            } catch (Throwable th5) {
                th = th5;
                str = zzc;
                zzckbVar = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3, types: [long] */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzf(String str, String[] strArr) {
        String str2;
        String str3;
        zzckb zzckbVar;
        Clock clock;
        long j;
        long j2;
        String str4;
        ?? r5;
        String str5;
        String str6;
        long j3;
        long j4;
        String str7;
        long j5;
        zzckb zzckbVar2 = this;
        String str8 = str;
        zzckbVar2.zzf = str8;
        String zzc = zzc(str);
        String str9 = " ms";
        String str10 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzckbVar2.zze.zzq(uriArr, zzckbVar2.zzb);
            zzcif zzcifVar = (zzcif) zzckbVar2.zzc.get();
            if (zzcifVar != null) {
                zzcifVar.zzt(zzc, zzckbVar2);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzA)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
            long j6 = -1;
            ?? r6 = longValue2;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzk.currentTimeMillis() - currentTimeMillis > r6) {
                            long j7 = r6;
                            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 27);
                            sb.append(str10);
                            sb.append(j7);
                            sb.append(str9);
                            throw new IOException(sb.toString());
                        }
                        if (zzckbVar2.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzckbVar2.zzh) {
                            break;
                        }
                        if (!zzckbVar2.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        String str11 = str9;
                        String str12 = str10;
                        long zzH = zzckbVar2.zze.zzH();
                        if (zzH > 0) {
                            long zzN = zzckbVar2.zze.zzN();
                            if (zzN != j6) {
                                try {
                                    j = intValue;
                                    j2 = r6;
                                    long j8 = zzH;
                                    j4 = longValue;
                                    clock = zzk;
                                    str5 = str12;
                                    str6 = str11;
                                    str7 = zzc;
                                    try {
                                        zzm(str, zzc, zzN, j8, zzN > 0, booleanValue ? zzckbVar2.zze.zzI() : -1L, booleanValue ? zzckbVar2.zze.zzJ() : -1L, booleanValue ? zzckbVar2.zze.zzK() : -1L, zzchw.zzP(), zzchw.zzQ());
                                        j6 = zzN;
                                        j5 = zzH;
                                        str4 = j8;
                                    } catch (Throwable th) {
                                        th = th;
                                        zzckbVar = this;
                                        str2 = str;
                                        str3 = str7;
                                        try {
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            String message = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                            sb2.append("Failed to preload url ");
                                            sb2.append(str2);
                                            sb2.append(" Exception: ");
                                            sb2.append(message);
                                            String sb3 = sb2.toString();
                                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            zzckbVar.zzq(str2, str3, "error", zzx("error", e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str7 = zzc;
                                }
                            } else {
                                clock = zzk;
                                j = intValue;
                                j2 = r6;
                                j4 = longValue;
                                str7 = zzc;
                                str5 = str12;
                                str6 = str11;
                                j5 = zzH;
                                str4 = r6;
                            }
                            r5 = (zzN > j5 ? 1 : (zzN == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzp(str, str7, j5);
                            } else {
                                try {
                                    zzckb zzckbVar3 = this;
                                    str4 = str;
                                    str3 = str7;
                                    if (zzckbVar3.zze.zzO() < j || zzN <= 0) {
                                        j3 = j4;
                                        r5 = zzckbVar3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zzckbVar = r5;
                                    str2 = str4;
                                    throw th;
                                }
                            }
                        } else {
                            clock = zzk;
                            j = intValue;
                            j2 = r6;
                            str4 = str8;
                            str3 = zzc;
                            r5 = zzckbVar2;
                            str5 = str12;
                            str6 = str11;
                            j3 = longValue;
                        }
                        try {
                            r5.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str8;
                        str3 = zzc;
                        zzckbVar = zzckbVar2;
                    }
                }
                str10 = str5;
                longValue = j3;
                zzckbVar2 = r5;
                str8 = str4;
                zzc = str3;
                str9 = str6;
                intValue = j;
                r6 = j2;
                zzk = clock;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str8;
            str3 = zzc;
            zzckbVar = zzckbVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zzg(String str, String[] strArr, zzcjk zzcjkVar) {
        this.zzf = str;
        this.zzi = zzcjkVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcif zzcifVar = (zzcif) this.zzc.get();
            if (zzcifVar != null) {
                zzcifVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzr(final boolean z, final long j) {
        final zzcif zzcifVar = (zzcif) this.zzc.get();
        if (zzcifVar != null) {
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcif.this.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "VideoStreamExoPlayerCache.onException");
    }
}
