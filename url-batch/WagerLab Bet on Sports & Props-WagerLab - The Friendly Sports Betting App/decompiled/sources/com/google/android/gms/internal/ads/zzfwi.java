package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfwi implements zzfvz, zzfvv, zzfwo {
    private static final zzhlt zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final ExecutorService zzd;
    private final zzfve zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzaqz zzq = zzara.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzhls zzc = zzhlt.zzc();
        zzc.zza(17);
        zza = (zzhlt) zzc.zzbu();
    }

    public zzfwi(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, zzfve zzfveVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
        this.zzd = executorService;
        this.zze = zzfveVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final ListenableFuture zza() {
        return zzgot.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfwi.this.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final void zzb(int i, long j, Throwable th, String str) {
        Long valueOf;
        if (this.zzf) {
            synchronized (this.zzo) {
                List list = this.zzr;
                synchronized (this.zzp) {
                    HashMap hashMap = this.zzt;
                    Integer valueOf2 = Integer.valueOf(i);
                    Long l = (Long) hashMap.get(valueOf2);
                    if (l == null) {
                        l = 0L;
                    }
                    valueOf = Long.valueOf(l.longValue() + 1);
                    hashMap.put(valueOf2, valueOf);
                }
                list.add(new zzfwf(i, j, th, str, valueOf.longValue()));
                if (!this.zzs) {
                    this.zzs = true;
                    this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwh
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfwi.this.zzd();
                        }
                    }, this.zzi, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final void zzc(zzfwn zzfwnVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzfwnVar.zza());
        }
    }

    final void zzd() {
        zzaqz zzaqzVar;
        zzgjz zzq;
        String str;
        synchronized (this.zzn) {
            zzaqzVar = (zzaqz) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzq = zzgjz.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            zzfwf zzfwfVar = (zzfwf) zzq.get(i);
            if (i2 >= this.zzh) {
                zze((zzara) zzaqzVar.zzbu());
                zzaqzVar.zzb();
                i2 = 0;
            }
            zzarr zza2 = zzars.zza();
            zza2.zza(zzfwfVar.zza);
            zza2.zzb(zzfwfVar.zzb);
            zza2.zze(zzfwfVar.zze);
            String str2 = zzfwfVar.zzd;
            if (str2 != null) {
                zza2.zzf(str2);
            }
            Throwable th = zzfwfVar.zzc;
            zza2.zzg(th == null ? 2 : 3);
            if (th != null) {
                zza2.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    str = "";
                }
                zza2.zzd(str);
            }
            zzaqzVar.zza((zzars) zza2.zzbu());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zze((zzara) zzaqzVar.zzbu());
            zzaqzVar.zzb();
        }
    }

    protected final void zze(zzara zzaraVar) {
        try {
            zzfwd zza2 = zzfwe.zza();
            zza2.zzb(zza);
            zzfwb zza3 = zzfwc.zza();
            zza3.zza(zzaraVar);
            zza2.zza((zzfwc) zza3.zzbu());
            this.zze.zza(this.zzg, ((zzfwe) zza2.zzbu()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzf() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        zzaqz zza2 = zzara.zza();
        zza2.zzc(Build.VERSION.SDK_INT);
        zza2.zzd(Build.MODEL);
        zza2.zze(locale.getLanguage());
        zza2.zzf(locale.getCountry());
        zza2.zzi(str);
        zza2.zzg(context.getPackageName());
        zza2.zzl(j);
        if (d > 0.0d) {
            zza2.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zza2.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zza2.zzm(i);
        } catch (RuntimeException unused2) {
        }
        zzara zzaraVar = (zzara) zza2.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzaraVar);
        }
    }
}
