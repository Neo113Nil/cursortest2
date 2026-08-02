package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnu implements zzcwq, zzcye, zzcxk, com.google.android.gms.ads.internal.client.zza, zzcxg, zzdeh {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfex zze;
    private final zzfel zzf;
    private final zzflh zzg;
    private final zzffs zzh;
    private final zzauo zzi;
    private final zzbcz zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcvs zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    zzcnu(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfex zzfexVar, zzfel zzfelVar, zzflh zzflhVar, zzffs zzffsVar, View view, zzcej zzcejVar, zzauo zzauoVar, zzbcz zzbczVar, zzbdb zzbdbVar, zzfkf zzfkfVar, zzcvs zzcvsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfexVar;
        this.zzf = zzfelVar;
        this.zzg = zzflhVar;
        this.zzh = zzffsVar;
        this.zzi = zzauoVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcejVar);
        this.zzj = zzbczVar;
        this.zzm = zzcvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkx)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(this.zza)) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Integer zzs = com.google.android.gms.ads.internal.util.zzt.zzs(this.zza);
                if (zzs != null) {
                    int min = Math.min(zzs.intValue(), 20);
                    Integer valueOf = Integer.valueOf(min);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        Uri.Builder buildUpon = Uri.parse((String) it.next()).buildUpon();
                        valueOf.getClass();
                        arrayList.add(buildUpon.appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String str;
        int i;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdf)).booleanValue()) {
            str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzai)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbdr.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, null, zzu()));
            return;
        }
        if (((Boolean) zzbdr.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgcj.zzr((zzgca) zzgcj.zzo(zzgca.zzu(zzgcj.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaM)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnt(this, str), this.zzb);
    }

    private final void zzw(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnu.this.zzp(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzai)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            zzgcj.zzr(zzgcj.zze(zzgca.zzu(this.zzj.zza()), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzcno
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzbzo.zzf), new zzcns(this), this.zzb);
            return;
        }
        zzffs zzffsVar = this.zzh;
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        zzffsVar.zzc(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzc), true == com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
        zzflh zzflhVar = this.zzg;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zze(zzfelVar, zzfelVar.zzh, zzbvnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzg));
    }

    final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
            @Override // java.lang.Runnable
            public final void run() {
                zzcnu.this.zzv();
            }
        });
    }

    final /* synthetic */ void zzo(int i, int i2) {
        zzw(i - 1, i2);
    }

    final /* synthetic */ void zzp(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
            @Override // java.lang.Runnable
            public final void run() {
                zzcnu.this.zzo(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbl)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzflh.zzf(2, zzeVar.zza, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdo)).intValue();
            if (intValue > 0) {
                zzw(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdp)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdn)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcnu.this.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        zzcvs zzcvsVar;
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzffs zzffsVar = this.zzh;
            zzflh zzflhVar = this.zzg;
            zzfex zzfexVar = this.zze;
            zzfel zzfelVar = this.zzf;
            zzffsVar.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzm));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdk)).booleanValue() && (zzcvsVar = this.zzm) != null) {
                List zzh = zzflh.zzh(zzflh.zzg(zzcvsVar.zzb().zzm, zzcvsVar.zza().zzg()), this.zzm.zza().zza());
                zzffs zzffsVar2 = this.zzh;
                zzflh zzflhVar2 = this.zzg;
                zzcvs zzcvsVar2 = this.zzm;
                zzffsVar2.zza(zzflhVar2.zzc(zzcvsVar2.zzc(), zzcvsVar2.zzb(), zzh));
            }
            zzffs zzffsVar3 = this.zzh;
            zzflh zzflhVar3 = this.zzg;
            zzfex zzfexVar2 = this.zze;
            zzfel zzfelVar2 = this.zzf;
            zzffsVar3.zza(zzflhVar3.zzc(zzfexVar2, zzfelVar2, zzfelVar2.zzf));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final void zzt() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzau));
    }
}
