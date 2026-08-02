package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaox implements zzapa {
    private static zzaox zzb;
    private final Context zzc;
    private final zzfom zzd;
    private final zzfot zze;
    private final zzfov zzf;
    private final zzapy zzg;
    private final zzfmx zzh;
    private final Executor zzi;
    private final zzfos zzj;
    private final zzaqn zzl;
    private volatile boolean zzn;
    private final int zzp;
    volatile long zza = 0;
    private final Object zzm = new Object();
    private volatile boolean zzo = false;
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzaox(Context context, zzfmx zzfmxVar, zzfom zzfomVar, zzfot zzfotVar, zzfov zzfovVar, zzapy zzapyVar, Executor executor, zzfms zzfmsVar, int i, zzaqn zzaqnVar) {
        this.zzc = context;
        this.zzh = zzfmxVar;
        this.zzd = zzfomVar;
        this.zze = zzfotVar;
        this.zzf = zzfovVar;
        this.zzg = zzapyVar;
        this.zzi = executor;
        this.zzp = i;
        this.zzl = zzaqnVar;
        this.zzj = new zzaov(this, zzfmsVar);
    }

    public static synchronized zzaox zza(String str, Context context, boolean z, boolean z2) {
        zzaox zzb2;
        synchronized (zzaox.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzaox zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzaox zzaoxVar;
        synchronized (zzaox.class) {
            if (zzb == null) {
                zzfmy zza = zzfmz.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfmz zzd = zza.zzd();
                zzfmx zza2 = zzfmx.zza(context, executor, z2);
                zzapi zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcB)).booleanValue() ? zzapi.zzc(context) : null;
                zzaqn zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcC)).booleanValue() ? zzaqn.zzd(context, executor) : null;
                zzfnq zze = zzfnq.zze(context, executor, zza2, zzd);
                zzapx zzapxVar = new zzapx(context);
                zzapy zzapyVar = new zzapy(zzd, zze, new zzaql(context, zzapxVar), zzapxVar, zzc, zzd2);
                int zzb2 = zzfnz.zzb(context, zza2);
                zzfms zzfmsVar = new zzfms();
                zzaox zzaoxVar2 = new zzaox(context, zza2, new zzfom(context, zzb2), new zzfot(context, zzb2, new zzaou(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbS)).booleanValue()), new zzfov(context, zzapyVar, zza2, zzfmsVar), zzapyVar, executor, zzfmsVar, zzb2, zzd2);
                zzb = zzaoxVar2;
                zzaoxVar2.zzm();
                zzb.zzo();
            }
            zzaoxVar = zzb;
        }
        return zzaoxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void zzj(zzaox zzaoxVar) {
        String str;
        String str2;
        CountDownLatch countDownLatch;
        boolean zzb2;
        long currentTimeMillis = System.currentTimeMillis();
        zzfol zzs = zzaoxVar.zzs(1);
        if (zzs != null) {
            String zzk = zzs.zza().zzk();
            str2 = zzs.zza().zzj();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfoq zza = zzfnh.zza(zzaoxVar.zzc, 1, zzaoxVar.zzp, str, str2, "1", zzaoxVar.zzh);
                byte[] bArr = zza.zzb;
                if (bArr == null || bArr.length == 0) {
                    zzaoxVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                    countDownLatch = zzaoxVar.zzk;
                } else {
                    try {
                        zzarv zzc = zzarv.zzc(zzgpw.zzv(bArr), zzgqq.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzE().length != 0) {
                            zzfol zzs2 = zzaoxVar.zzs(1);
                            if (zzs2 != null) {
                                zzary zza2 = zzs2.zza();
                                if (zzc.zzd().zzk().equals(zza2.zzk())) {
                                }
                            }
                            zzfos zzfosVar = zzaoxVar.zzj;
                            int i = zza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbQ)).booleanValue()) {
                                zzb2 = zzaoxVar.zzd.zzb(zzc, zzfosVar);
                            } else if (i == 3) {
                                zzb2 = zzaoxVar.zze.zza(zzc);
                            } else {
                                if (i == 4) {
                                    zzb2 = zzaoxVar.zze.zzb(zzc, zzfosVar);
                                }
                                zzaoxVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                                countDownLatch = zzaoxVar.zzk;
                            }
                            if (zzb2) {
                                zzfol zzs3 = zzaoxVar.zzs(1);
                                if (zzs3 != null) {
                                    if (zzaoxVar.zzf.zzc(zzs3)) {
                                        zzaoxVar.zzo = true;
                                    }
                                    zzaoxVar.zza = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzaoxVar.zzk;
                            }
                            zzaoxVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            countDownLatch = zzaoxVar.zzk;
                        }
                        zzaoxVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzaoxVar.zzk;
                    } catch (NullPointerException unused) {
                        zzaoxVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzaoxVar.zzk;
                    }
                }
            } catch (zzgrq e) {
                zzaoxVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
                countDownLatch = zzaoxVar.zzk;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzaoxVar.zzk.countDown();
            throw th;
        }
    }

    private final void zzr() {
        zzaqn zzaqnVar = this.zzl;
        if (zzaqnVar != null) {
            zzaqnVar.zzh();
        }
    }

    private final zzfol zzs(int i) {
        if (zzfnz.zza(this.zzp)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbQ)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzd(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        zzo();
        zzfna zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzg(Context context) {
        zzr();
        zzo();
        zzfna zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        zzo();
        zzfna zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzk(MotionEvent motionEvent) {
        zzfna zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfou e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzl(int i, int i2, int i3) {
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfol zzs = zzs(1);
        if (zzs == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzs)) {
            this.zzo = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzn) {
            return;
        }
        synchronized (this.zzm) {
            if (!this.zzn) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfol zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfnz.zza(this.zzp)) {
                    this.zzi.execute(new zzaow(this));
                }
            }
        }
    }

    public final synchronized boolean zzq() {
        return this.zzo;
    }
}
