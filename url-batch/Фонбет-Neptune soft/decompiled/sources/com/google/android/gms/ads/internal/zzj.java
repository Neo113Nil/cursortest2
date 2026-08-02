package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzauk;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfqd;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzj implements Runnable, zzauk {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfoh zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zza(zzbbw.zzce)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfoh.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zza(zzbbw.zzcb)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbbw.zzcf)).booleanValue();
        if (((Boolean) zzba.zzc().zza(zzbbw.zzcd)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zza(zzbbw.zzdc)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zza(zzbbw.zzcW)).booleanValue()) {
            zzbzo.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            zzbzo.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzauk zzm() {
        return zzi() == 2 ? (zzauk) this.zze.get() : (zzauk) this.zzd.get();
    }

    private final void zzp() {
        List list = this.zzc;
        zzauk zzm = zzm();
        if (list.isEmpty() || zzm == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzm.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzm.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzq(boolean z) {
        this.zzd.set(zzaun.zzu(this.zzl.afmaVersion, zzr(this.zzj), z, this.zzo));
    }

    private static final Context zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zza(zzbbw.zzdc)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zza(zzbbw.zzaN)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzq(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzauh zza = zzauh.zza(this.zzl.afmaVersion, zzr(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzq(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzq(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzauh.zza(this.zzm.afmaVersion, zzr(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzi zziVar = new zzi(this);
        zzfoh zzfohVar = this.zzi;
        return new zzfqd(this.zzj, zzfpj.zzb(context, zzfohVar), zziVar, ((Boolean) zzba.zzc().zza(zzbbw.zzcc)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzauk zzm = zzm();
        if (((Boolean) zzba.zzc().zza(zzbbw.zzjM)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
        }
        if (zzm == null) {
            return "";
        }
        zzp();
        return zzm.zzf(zzr(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzg(Context context) {
        zzauk zzm;
        if (!zzd() || (zzm = zzm()) == null) {
            return "";
        }
        zzp();
        return zzm.zzg(zzr(context));
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zza(zzbbw.zzjL)).booleanValue()) {
            zzauk zzm = zzm();
            if (((Boolean) zzba.zzc().zza(zzbbw.zzjM)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
            }
            return zzm != null ? zzm.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzauk zzm2 = zzm();
        if (((Boolean) zzba.zzc().zza(zzbbw.zzjM)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        return zzm2 != null ? zzm2.zzh(context, view, activity) : "";
    }

    protected final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    public final int zzj() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzk(MotionEvent motionEvent) {
        zzauk zzm = zzm();
        if (zzm == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzp();
            zzm.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzl(int i, int i2, int i3) {
        zzauk zzm = zzm();
        if (zzm == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzp();
            zzm.zzl(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauk zzm;
        if (!zzd() || (zzm = zzm()) == null) {
            return;
        }
        zzm.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzo(View view) {
        zzauk zzm = zzm();
        if (zzm != null) {
            zzm.zzo(view);
        }
    }
}
