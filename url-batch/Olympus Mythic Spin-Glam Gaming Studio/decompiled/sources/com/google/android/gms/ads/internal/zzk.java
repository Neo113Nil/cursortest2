package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfzf;
import com.google.android.gms.internal.ads.zzfzz;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzk implements Runnable, zzbay {
    private static final long zzc = System.currentTimeMillis();

    @VisibleForTesting
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfyi zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zzd(zzbjg.zzds)).booleanValue();
        this.zzo = booleanValue;
        this.zzj = zzfyi.zza(context, newCachedThreadPool, booleanValue);
        this.zzg = ((Boolean) zzba.zzc().zzd(zzbjg.zzdp)).booleanValue();
        this.zzh = ((Boolean) zzba.zzc().zzd(zzbjg.zzdt)).booleanValue();
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzdr)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zzex)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzet)).booleanValue()) {
            zzcgj.zza.execute(this);
            return;
        }
        zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            zzcgj.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzbay zzs = zzs();
        if (list.isEmpty() || zzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzs.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.zzd.clear();
    }

    private final void zzr(boolean z) {
        String str = this.zzm.afmaVersion;
        Context zzt = zzt(this.zzk);
        zzaxb zze = zzaxc.zze();
        zze.zzb(z);
        zze.zza(str);
        this.zze.set(zzbbc.zzt(zzt, (zzaxc) zze.zzbu()));
    }

    @Nullable
    private final zzbay zzs() {
        return zzp() == 2 ? (zzbay) this.zzf.get() : (zzbay) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzbav zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzaxb zze = zzaxc.zze();
        zze.zzb(z);
        zze.zza(versionInfoParcel.afmaVersion);
        return zzbav.zza(zzt(context), (zzaxc) zze.zzbu(), z2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzex)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z = this.zzm.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zzd(zzbjg.zzbN)).booleanValue() && z) {
                z2 = true;
            }
            if (zzp() == 1) {
                zzr(z2);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzk.this.zzn(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzbav zzu = zzu(this.zzk, this.zzm, z2, this.zzo);
                    this.zzf.set(zzu);
                    if (this.zzh && !zzu.zzb()) {
                        this.zzp = 1;
                        zzr(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzp = 1;
                    zzr(z2);
                    this.zzj.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzbay zzs;
        if (!zza() || (zzs = zzs()) == null) {
            return "";
        }
        zzq();
        try {
            return zzs.zzl(zzt(context));
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzc() {
        int i = this.zzp;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        zzbay zzs = zzs();
        if (zzs == null) {
            this.zzd.add(new Object[]{motionEvent});
            return;
        }
        zzq();
        try {
            zzs.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i, int i2, int i3) {
        zzbay zzs = zzs();
        if (zzs == null) {
            this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzq();
        try {
            zzs.zze(i, i2, i3);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        zzbay zzs = zzs();
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzmn)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (zzs == null) {
            return "";
        }
        zzq();
        try {
            return zzs.zzf(zzt(context), str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
        zzbay zzs = zzs();
        if (zzs != null) {
            try {
                zzs.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbay zzs;
        zzbay zzs2;
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzdM)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzs2 = zzs()) == null) {
                return;
            }
            try {
                zzs2.zzi(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!zza() || (zzs = zzs()) == null) {
            return;
        }
        try {
            zzs.zzi(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzba.zzc().zzd(zzbjg.zzmm)).booleanValue()) {
                zzbay zzs = zzs();
                if (((Boolean) zzba.zzc().zzd(zzbjg.zzmn)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return zzs != null ? zzs.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            zzbay zzs2 = zzs();
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzmn)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return zzs2 != null ? zzs2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(final Context context) {
        try {
            return (String) zzhcy.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzk.this.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzba.zzc().zzd(zzbjg.zzdG)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzbar.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    protected final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfyi zzfyiVar = this.zzj;
        return new zzfzz(this.zzk, zzfzf.zzb(context, zzfyiVar), zzhVar, ((Boolean) zzba.zzc().zzd(zzbjg.zzdq)).booleanValue()).zzd(1);
    }

    final /* synthetic */ void zzn(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z, this.zzo).zzm();
        } catch (NullPointerException e) {
            this.zzj.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    final /* synthetic */ zzfyi zzo() {
        return this.zzj;
    }

    protected final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }
}
