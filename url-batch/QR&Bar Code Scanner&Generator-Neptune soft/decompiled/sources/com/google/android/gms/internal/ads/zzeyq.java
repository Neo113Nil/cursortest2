package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzeyq implements zzeov {
    protected final zzcom zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzezg zzd;
    private final zzfaz zze;
    private final zzcgv zzf;
    private final ViewGroup zzg;
    private final zzfjw zzh;
    private final zzfed zzi;

    @Nullable
    private zzfzp zzj;

    protected zzeyq(Context context, Executor executor, zzcom zzcomVar, zzfaz zzfazVar, zzezg zzezgVar, zzfed zzfedVar, zzcgv zzcgvVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcomVar;
        this.zze = zzfazVar;
        this.zzd = zzezgVar;
        this.zzi = zzfedVar;
        this.zzf = zzcgvVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcomVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzdci zzm(zzfax zzfaxVar) {
        zzeyp zzeypVar = (zzeyp) zzfaxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgZ)).booleanValue()) {
            zzcwz zzcwzVar = new zzcwz(this.zzg);
            zzdck zzdckVar = new zzdck();
            zzdckVar.zzc(this.zzb);
            zzdckVar.zzf(zzeypVar.zza);
            zzdcm zzg = zzdckVar.zzg();
            zzdik zzdikVar = new zzdik();
            zzdikVar.zzc(this.zzd, this.zzc);
            zzdikVar.zzl(this.zzd, this.zzc);
            return zzc(zzcwzVar, zzg, zzdikVar.zzn());
        }
        zzezg zzi = zzezg.zzi(this.zzd);
        zzdik zzdikVar2 = new zzdik();
        zzdikVar2.zzb(zzi, this.zzc);
        zzdikVar2.zzg(zzi, this.zzc);
        zzdikVar2.zzh(zzi, this.zzc);
        zzdikVar2.zzi(zzi, this.zzc);
        zzdikVar2.zzc(zzi, this.zzc);
        zzdikVar2.zzl(zzi, this.zzc);
        zzdikVar2.zzm(zzi);
        zzcwz zzcwzVar2 = new zzcwz(this.zzg);
        zzdck zzdckVar2 = new zzdck();
        zzdckVar2.zzc(this.zzb);
        zzdckVar2.zzf(zzeypVar.zza);
        return zzc(zzcwzVar2, zzdckVar2.zzg(), zzdikVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zza() {
        zzfzp zzfzpVar = this.zzj;
        return (zzfzpVar == null || zzfzpVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzeov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeot zzeotVar, zzeou zzeouVar) throws RemoteException {
        boolean z;
        zzfju zzfjuVar;
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziM)).booleanValue()) {
                z = true;
                if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziN)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeyq.this.zzk();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
                    zzfaz zzfazVar = this.zze;
                    if (zzfazVar.zzd() != null) {
                        zzfju zzh = ((zzcwk) zzfazVar.zzd()).zzh();
                        zzh.zzh(7);
                        zzh.zzb(zzlVar.zzp);
                        zzfjuVar = zzh;
                        zzfez.zza(this.zzb, zzlVar.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzlVar.zzf) {
                            this.zza.zzk().zzm(true);
                        }
                        zzfed zzfedVar = this.zzi;
                        zzfedVar.zzs(str);
                        zzfedVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                        zzfedVar.zzE(zzlVar);
                        zzfef zzG = zzfedVar.zzG();
                        zzfjj zzb = zzfji.zzb(this.zzb, zzfjt.zzf(zzG), 7, zzlVar);
                        zzeyp zzeypVar = new zzeyp(null);
                        zzeypVar.zza = zzG;
                        zzfzp zzc = this.zze.zzc(new zzfba(zzeypVar, null), new zzfay() { // from class: com.google.android.gms.internal.ads.zzeyl
                            @Override // com.google.android.gms.internal.ads.zzfay
                            public final zzdci zza(zzfax zzfaxVar) {
                                zzdci zzm;
                                zzm = zzeyq.this.zzm(zzfaxVar);
                                return zzm;
                            }
                        }, null);
                        this.zzj = zzc;
                        zzfzg.zzr(zzc, new zzeyn(this, zzeouVar, zzfjuVar, zzb, zzeypVar), this.zzc);
                        return true;
                    }
                }
                zzfjuVar = null;
                zzfez.zza(this.zzb, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
                    this.zza.zzk().zzm(true);
                }
                zzfed zzfedVar2 = this.zzi;
                zzfedVar2.zzs(str);
                zzfedVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                zzfedVar2.zzE(zzlVar);
                zzfef zzG2 = zzfedVar2.zzG();
                zzfjj zzb2 = zzfji.zzb(this.zzb, zzfjt.zzf(zzG2), 7, zzlVar);
                zzeyp zzeypVar2 = new zzeyp(null);
                zzeypVar2.zza = zzG2;
                zzfzp zzc2 = this.zze.zzc(new zzfba(zzeypVar2, null), new zzfay() { // from class: com.google.android.gms.internal.ads.zzeyl
                    @Override // com.google.android.gms.internal.ads.zzfay
                    public final zzdci zza(zzfax zzfaxVar) {
                        zzdci zzm;
                        zzm = zzeyq.this.zzm(zzfaxVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc2;
                zzfzg.zzr(zzc2, new zzeyn(this, zzeouVar, zzfjuVar, zzb2, zzeypVar2), this.zzc);
                return true;
            }
        }
        z = false;
        if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziN)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    protected abstract zzdci zzc(zzcwz zzcwzVar, zzdcm zzdcmVar, zzdim zzdimVar);

    final /* synthetic */ void zzk() {
        this.zzd.zza(zzffe.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
