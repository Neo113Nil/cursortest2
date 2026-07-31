package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaum implements zzaup {
    private static zzaum zzb;
    private final Context zzc;
    private final zzfpr zzd;
    private final zzfpy zze;
    private final zzfqa zzf;
    private final zzavr zzg;
    private final zzfoh zzh;
    private final Executor zzi;
    private final zzaxq zzj;
    private final zzfpx zzk;
    private final zzawg zzm;
    private final zzavy zzn;
    private final zzavp zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzaum(Context context, zzfoh zzfohVar, zzfpr zzfprVar, zzfpy zzfpyVar, zzfqa zzfqaVar, zzavr zzavrVar, Executor executor, zzfoc zzfocVar, zzaxq zzaxqVar, zzawg zzawgVar, zzavy zzavyVar, zzavp zzavpVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfohVar;
        this.zzd = zzfprVar;
        this.zze = zzfpyVar;
        this.zzf = zzfqaVar;
        this.zzg = zzavrVar;
        this.zzi = executor;
        this.zzj = zzaxqVar;
        this.zzm = zzawgVar;
        this.zzn = zzavyVar;
        this.zzo = zzavpVar;
        this.zzr = false;
        this.zzk = new zzauk(this, zzfocVar);
    }

    public static synchronized zzaum zza(Context context, zzaqy zzaqyVar, boolean z) {
        zzaum zzs;
        synchronized (zzaum.class) {
            zzfoi zzh = zzfoj.zzh();
            zzh.zza(zzaqyVar.zza());
            zzh.zzb(zzaqyVar.zzb());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzh.zzh(), z);
        }
        return zzs;
    }

    private static synchronized zzaum zzs(Context context, Executor executor, zzfoj zzfojVar, boolean z) {
        zzaum zzaumVar;
        synchronized (zzaum.class) {
            if (zzb == null) {
                zzfoh zza = zzfoh.zza(context, executor, z);
                zzava zza2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdN)).booleanValue() ? zzava.zza(context) : null;
                zzawg zza3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdO)).booleanValue() ? zzawg.zza(context, executor) : null;
                zzavy zzavyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue() ? new zzavy() : null;
                zzavp zzavpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdg)).booleanValue() ? new zzavp() : null;
                zzfox zza4 = zzfox.zza(context, executor, zza, zzfojVar);
                zzavq zzavqVar = new zzavq(context);
                zzavr zzavrVar = new zzavr(zzfojVar, zza4, new zzawe(context, zzavqVar), zzavqVar, zza2, zza3, zzavyVar, zzavpVar);
                zzaxq zzb2 = zzfpe.zzb(context, zza);
                zzfoc zzfocVar = new zzfoc();
                zzaum zzaumVar2 = new zzaum(context, zza, new zzfpr(context, zzb2), new zzfpy(context, zzb2, new zzauj(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcH)).booleanValue()), new zzfqa(context, zzavrVar, zza, zzfocVar, false), zzavrVar, executor, zzfocVar, zzb2, zza3, zzavyVar, zzavpVar);
                zzb = zzaumVar2;
                zzaumVar2.zzc();
                zzb.zzm();
            }
            zzaumVar = zzb;
        }
        return zzaumVar;
    }

    private final void zzt() {
        zzawg zzawgVar = this.zzm;
        if (zzawgVar != null) {
            zzawgVar.zzb();
        }
    }

    private final zzfpq zzu(int i) {
        if (zzfpe.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcF)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfpq zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zza(zzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        zzfok zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (zzfpz e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmM)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfok zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zzb2.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzavp zzavpVar = this.zzo;
        if (zzavpVar != null) {
            zzavpVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfok zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb3 = zzb2.zzb(context, null, view, activity);
        this.zzh.zzd(PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED, System.currentTimeMillis() - currentTimeMillis, zzb3, null);
        return zzb3;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfok zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzb2.zza(context, null);
        this.zzh.zzd(PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfpq zzc = this.zzf.zzc();
                if ((zzc == null || zzc.zze(3600L)) && zzfpe.zza(this.zzj)) {
                    this.zzi.execute(new zzaul(this));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r4.zza().zzb().equals(r5.zzb()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzn() {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfpq zzu = zzu(1);
        if (zzu != null) {
            String zza2 = zzu.zza().zza();
            str2 = zzu.zza().zzb();
            str = zza2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzaxq zzaxqVar = this.zzj;
                zzfoh zzfohVar = this.zzh;
                zzfpv zza3 = zzfoq.zza(context, 1, zzaxqVar, str, str2, "1", zzfohVar);
                byte[] bArr = zza3.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfohVar.zzb(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzaxs zzd = zzaxs.zzd(zzhhb.zzr(bArr, 0, length), zzhhr.zza());
                        if (!zzd.zza().zza().isEmpty()) {
                            if (!zzd.zza().zzb().isEmpty()) {
                                if (zzd.zzc().zzv().length != 0) {
                                    zzfpq zzu2 = zzu(1);
                                    if (zzu2 != null) {
                                        zzaxw zza4 = zzu2.zza();
                                        if (zza4 != null) {
                                            if (zzd.zza().zza().equals(zza4.zza())) {
                                            }
                                        }
                                    }
                                    zzfpx zzfpxVar = this.zzk;
                                    int i = zza3.zzc;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcF)).booleanValue()) {
                                        zza = this.zzd.zza(zzd, zzfpxVar);
                                    } else if (i == 3) {
                                        zza = this.zze.zzb(zzd);
                                    } else {
                                        if (i == 4) {
                                            zza = this.zze.zza(zzd, zzfpxVar);
                                        }
                                        this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (zza) {
                                        zzfpq zzu3 = zzu(1);
                                        if (zzu3 != null) {
                                            if (this.zzf.zza(zzu3)) {
                                                this.zzr = true;
                                            }
                                            this.zza = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.zzh.zzb(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzhiw e) {
                this.zzh.zzc(PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfoh zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
