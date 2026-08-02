package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.messaging.Constants;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcde extends zzccv implements zzcba {
    public static final /* synthetic */ int zzd = 0;
    private zzcbb zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccn zzi;
    private long zzj;
    private long zzk;

    public zzcde(zzcbk zzcbkVar, zzcbj zzcbjVar) {
        super(zzcbkVar);
        zzcdw zzcdwVar = new zzcdw(zzcbkVar.getContext(), zzcbjVar, (zzcbk) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcdwVar;
        zzcdwVar.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdd
            @Override // java.lang.Runnable
            public final void run() {
                zzcde.this.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzccv, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbb zzcbbVar = this.zze;
        if (zzcbbVar != null) {
            zzcbbVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzD(int i, int i2) {
    }

    public final zzcbb zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbb zzcbbVar = this.zze;
        this.zze = null;
        return zzcbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzccv, com.google.android.gms.internal.ads.zzcde] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.zzcde] */
    /* JADX WARN: Type inference failed for: r3v31 */
    final /* synthetic */ void zzb() {
        String str;
        zzcde zzcdeVar;
        zzcde zzcdeVar2;
        ?? longValue;
        long intValue;
        zzcde zzcdeVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc = zzc(this.zzf);
        String str3 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzr)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzq)).intValue();
            zzcdeVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzcdeVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzz = this.zze.zzz();
                            if (zzz > 0) {
                                long zzv = this.zze.zzv();
                                if (zzv != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzc;
                                        try {
                                            zzo(this.zzf, zzc, zzv, zzz, zzv > 0, zzcdeVar != 0 ? this.zze.zzA() : -1L, zzcdeVar != 0 ? this.zze.zzx() : -1L, zzcdeVar != 0 ? this.zze.zzB() : -1L, zzcbb.zzs(), zzcbb.zzu());
                                            zzcdeVar = this;
                                            j = zzv;
                                            try {
                                                zzcdeVar.zzk = j;
                                                j3 = zzz;
                                                zzcdeVar = zzcdeVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzcdeVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = zzc;
                                        zzcdeVar = this;
                                    }
                                } else {
                                    j = zzv;
                                    j2 = intValue;
                                    str2 = zzc;
                                    zzcdeVar = this;
                                    j3 = zzz;
                                }
                                if (j >= j3) {
                                    zzcdeVar.zzj(zzcdeVar.zzf, str2, j3);
                                    zzcdeVar2 = zzcdeVar;
                                } else {
                                    long zzw = zzcdeVar.zze.zzw();
                                    zzcdeVar3 = zzcdeVar;
                                    if (zzw >= j2) {
                                        zzcdeVar3 = zzcdeVar;
                                        if (j > 0) {
                                            zzcdeVar2 = zzcdeVar;
                                        }
                                    }
                                }
                            } else {
                                zzcdeVar3 = this;
                            }
                            zzcdeVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzs)).longValue());
                            return;
                        }
                        zzcdeVar2 = this;
                        com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcdeVar2.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = longValue;
                        str = i;
                    }
                } else {
                    str = zzc;
                    zzcdeVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + ((long) longValue) + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzcdeVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + zzcdeVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcdeVar.zzg(zzcdeVar.zzf, str, str4, zzd(str4, e));
                zzcdeVar2 = zzcdeVar;
                com.google.android.gms.ads.internal.zzu.zzy().zzc(zzcdeVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzi(final boolean z, final long j) {
        final zzcbk zzcbkVar = (zzcbk) this.zzc.get();
        if (zzcbkVar != null) {
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcde.zzd;
                    zzcbk.this.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzm.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzccv] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzu(String str, String[] strArr) {
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
        zzcde zzcdeVar = this;
        String str4 = str;
        zzcdeVar.zzf = str4;
        String str5 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcdeVar.zze.zzF(uriArr, zzcdeVar.zzb);
            zzcbk zzcbkVar = (zzcbk) zzcdeVar.zzc.get();
            if (zzcbkVar != null) {
                zzcbkVar.zzt(zzc, zzcdeVar);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzu.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzs)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzr)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzq)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue();
            long j7 = -1;
            long j8 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzB.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (zzcdeVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzcdeVar.zzh) {
                            break;
                        }
                        if (!zzcdeVar.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = zzcdeVar.zze.zzz();
                        if (zzz > 0) {
                            long zzv = zzcdeVar.zze.zzv();
                            if (zzv != j7) {
                                try {
                                    j = j8;
                                    long j9 = zzz;
                                    j2 = longValue2;
                                    j4 = longValue;
                                    str3 = zzc;
                                    try {
                                        zzo(str, zzc, zzv, j9, zzv > 0, booleanValue ? zzcdeVar.zze.zzA() : -1L, booleanValue ? zzcdeVar.zze.zzx() : -1L, booleanValue ? zzcdeVar.zze.zzB() : -1L, zzcbb.zzs(), zzcbb.zzu());
                                        j6 = zzv;
                                        j5 = zzz;
                                        r6 = j9;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = this;
                                        r6 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            String str6 = str5;
                                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r5.zzg(r6, str2, str6, zzd(str6, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str3 = zzc;
                                }
                            } else {
                                j = j8;
                                j2 = longValue2;
                                j4 = longValue;
                                str3 = zzc;
                                j5 = zzz;
                                j6 = j7;
                                r6 = j8;
                            }
                            r5 = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzj(str, str3, j5);
                            } else {
                                try {
                                    zzcde zzcdeVar2 = this;
                                    r6 = str;
                                    str2 = str3;
                                    if (zzcdeVar2.zze.zzw() < j || zzv <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzcdeVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            j = j8;
                            j2 = longValue2;
                            r6 = str4;
                            str2 = zzc;
                            r5 = zzcdeVar;
                            j3 = longValue;
                            r1 = j7;
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
                        str2 = zzc;
                        r5 = zzcdeVar;
                    }
                }
                longValue = j3;
                zzcdeVar = r5;
                str4 = r6;
                zzc = str2;
                j8 = j;
                longValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            r6 = str4;
            str2 = zzc;
            r5 = zzcdeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcba
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzccv
    public final boolean zzw(String str, String[] strArr, zzccn zzccnVar) {
        this.zzf = str;
        this.zzi = zzccnVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbk zzcbkVar = (zzcbk) this.zzc.get();
            if (zzcbkVar != null) {
                zzcbkVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, Constants.IPC_BUNDLE_KEY_SEND_ERROR, zzd(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e));
            return false;
        }
    }
}
