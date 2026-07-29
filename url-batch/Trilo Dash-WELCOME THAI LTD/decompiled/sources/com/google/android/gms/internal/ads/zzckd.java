package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzckd extends zzcju implements zzchh {
    public static final /* synthetic */ int zzd = 0;
    private zzchi zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcjm zzi;
    private long zzj;
    private long zzk;

    public zzckd(zzchr zzchrVar, zzchq zzchqVar) {
        super(zzchrVar);
        Context context = zzchrVar.getContext();
        zzchi zzckvVar = zzchqVar.zzm ? new zzckv(context, zzchqVar, (zzchr) this.zzc.get()) : new zzciz(context, zzchqVar, (zzchr) this.zzc.get());
        this.zze = zzckvVar;
        zzckvVar.zzI(this);
    }

    protected static final String zzu(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private static String zzw(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
            @Override // java.lang.Runnable
            public final void run() {
                zzckd.this.zzt();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcju, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzI(null);
            this.zze.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzC(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzc(this.zzf, zzu(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzi(final boolean z, final long j) {
        final zzchr zzchrVar = (zzchr) this.zzc.get();
        if (zzchrVar != null) {
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // java.lang.Runnable
                public final void run() {
                    zzchr zzchrVar2 = zzchr.this;
                    boolean z2 = z;
                    long j2 = j;
                    int i = zzckd.zzd;
                    zzchrVar2.zzx(z2, j2);
                }
            });
        }
    }

    public final zzchi zzj() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzI(null);
        zzchi zzchiVar = this.zze;
        this.zze = null;
        return zzchiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzn(int i) {
        this.zze.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzo(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzp(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        return zzr(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcju] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzr(String str, String[] strArr) {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str3;
        long j5;
        long j6;
        long j7;
        zzckd zzckdVar = this;
        String str4 = str;
        zzckdVar.zzf = str4;
        String zzu = zzu(str);
        String str5 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzckdVar.zze.zzC(uriArr, zzckdVar.zzb);
            zzchr zzchrVar = (zzchr) zzckdVar.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzu, zzckdVar);
            }
            Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
            long currentTimeMillis = zzA.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzv)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzu)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
            long j8 = -1;
            long j9 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzA.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (zzckdVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzckdVar.zzh) {
                            break;
                        }
                        if (!zzckdVar.zze.zzR()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = zzckdVar.zze.zzz();
                        if (zzz > 0) {
                            long zzv = zzckdVar.zze.zzv();
                            if (zzv != j8) {
                                try {
                                    j = j9;
                                    j7 = zzz;
                                    j2 = longValue2;
                                    j4 = longValue;
                                    str3 = zzu;
                                } catch (Throwable th) {
                                    th = th;
                                    r5 = this;
                                    r6 = str;
                                    str2 = zzu;
                                }
                                try {
                                    zzg(str, zzu, zzv, j7, zzv > 0, booleanValue ? zzckdVar.zze.zzA() : -1L, booleanValue ? zzckdVar.zze.zzx() : -1L, booleanValue ? zzckdVar.zze.zzB() : -1L, zzchi.zzs(), zzchi.zzu());
                                    j6 = zzv;
                                    j5 = zzz;
                                    r6 = j7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = this;
                                    r6 = str;
                                    str2 = str3;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        String str6 = str5;
                                        com.google.android.gms.ads.internal.util.zze.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                        com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        r5.zzc(r6, str2, str6, zzw(str6, e));
                                        return false;
                                    }
                                }
                            } else {
                                j = j9;
                                j2 = longValue2;
                                j4 = longValue;
                                str3 = zzu;
                                j5 = zzz;
                                j6 = j8;
                                r6 = j9;
                            }
                            r5 = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zze(str, str3, j5);
                            } else {
                                try {
                                    zzckd zzckdVar2 = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzckdVar2.zze.zzw() < j || zzv <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzckdVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j9;
                            j2 = longValue2;
                            r6 = str4;
                            str2 = zzu;
                            r5 = zzckdVar;
                            j3 = longValue;
                            r1 = j8;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = r1;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str4;
                        str2 = zzu;
                        r5 = zzckdVar;
                    }
                }
                longValue = j3;
                zzckdVar = r5;
                str4 = r6;
                zzu = str2;
                j9 = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = zzu;
            r5 = zzckdVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzs(String str, String[] strArr, zzcjm zzcjmVar) {
        this.zzf = str;
        this.zzi = zzcjmVar;
        String zzu = zzu(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzC(uriArr, this.zzb);
            zzchr zzchrVar = (zzchr) this.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzu, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzc(str, zzu, "error", zzw("error", e));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcju, com.google.android.gms.internal.ads.zzckd] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzckd] */
    /* JADX WARN: Type inference failed for: r2v31 */
    final /* synthetic */ void zzt() {
        String str;
        zzckd zzckdVar;
        zzckd zzckdVar2;
        zzbhw zzc;
        long longValue;
        long intValue;
        zzckd zzckdVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzu = zzu(this.zzf);
        String str3 = "error";
        try {
            zzbhq zzbhqVar = zzbhy.zzv;
            zzc = com.google.android.gms.ads.internal.client.zzay.zzc();
            longValue = ((Long) zzc.zzb(zzbhqVar)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzu)).intValue();
            zzckdVar = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzu;
            zzckdVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzR()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzz = this.zze.zzz();
                            if (zzz > 0) {
                                long zzv = this.zze.zzv();
                                if (zzv != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzu;
                                        try {
                                            zzg(this.zzf, zzu, zzv, zzz, zzv > 0, zzckdVar != 0 ? this.zze.zzA() : -1L, zzckdVar != 0 ? this.zze.zzx() : -1L, zzckdVar != 0 ? this.zze.zzB() : -1L, zzchi.zzs(), zzchi.zzu());
                                            zzckdVar = this;
                                            j = zzv;
                                            try {
                                                zzckdVar.zzk = j;
                                                j3 = zzz;
                                                zzckdVar = zzckdVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzckdVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzckdVar = this;
                                        str = zzu;
                                    }
                                } else {
                                    j = zzv;
                                    j2 = intValue;
                                    str2 = zzu;
                                    zzckdVar = this;
                                    j3 = zzz;
                                }
                                if (j >= j3) {
                                    zzckdVar.zze(zzckdVar.zzf, str2, j3);
                                    zzckdVar2 = zzckdVar;
                                } else {
                                    long zzw = zzckdVar.zze.zzw();
                                    zzckdVar3 = zzckdVar;
                                    if (zzw >= j2) {
                                        zzckdVar3 = zzckdVar;
                                        if (j > 0) {
                                            zzckdVar2 = zzckdVar;
                                        }
                                    }
                                }
                            } else {
                                zzckdVar3 = this;
                            }
                            zzckdVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzw)).longValue());
                            return;
                        }
                        zzckdVar2 = this;
                        com.google.android.gms.ads.internal.zzt.zzy().zzc(zzckdVar2.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i;
                    }
                } else {
                    str = zzu;
                    zzckdVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzu;
                zzckdVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                com.google.android.gms.ads.internal.util.zze.zzj("Failed to preload url " + zzckdVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzckdVar.zzc(zzckdVar.zzf, str, str4, zzw(str4, e));
                zzckdVar2 = zzckdVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzckdVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache onRenderedFirstFrame");
    }
}
