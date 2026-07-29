package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzewm implements zzems {
    protected final zzcnf zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexc zzd;
    private final zzeyv zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    private final zzfhs zzh;
    private final zzfbw zzi;

    @Nullable
    private zzfvj zzj;

    protected zzewm(Context context, Executor executor, zzcnf zzcnfVar, zzeyv zzeyvVar, zzexc zzexcVar, zzfbw zzfbwVar, zzcfo zzcfoVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnfVar;
        this.zze = zzeyvVar;
        this.zzd = zzexcVar;
        this.zzi = zzfbwVar;
        this.zzf = zzcfoVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnfVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzdba zzm(zzeyt zzeytVar) {
        zzewl zzewlVar = (zzewl) zzeytVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
            zzcvr zzcvrVar = new zzcvr(this.zzg);
            zzdbc zzdbcVar = new zzdbc();
            zzdbcVar.zzc(this.zzb);
            zzdbcVar.zzf(zzewlVar.zza);
            zzdbe zzg = zzdbcVar.zzg();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zzc(this.zzd, this.zzc);
            zzdhcVar.zzl(this.zzd, this.zzc);
            return zzc(zzcvrVar, zzg, zzdhcVar.zzn());
        }
        zzexc zzi = zzexc.zzi(this.zzd);
        zzdhc zzdhcVar2 = new zzdhc();
        zzdhcVar2.zzb(zzi, this.zzc);
        zzdhcVar2.zzg(zzi, this.zzc);
        zzdhcVar2.zzh(zzi, this.zzc);
        zzdhcVar2.zzi(zzi, this.zzc);
        zzdhcVar2.zzc(zzi, this.zzc);
        zzdhcVar2.zzl(zzi, this.zzc);
        zzdhcVar2.zzm(zzi);
        zzcvr zzcvrVar2 = new zzcvr(this.zzg);
        zzdbc zzdbcVar2 = new zzdbc();
        zzdbcVar2.zzc(this.zzb);
        zzdbcVar2.zzf(zzewlVar.zza);
        return zzc(zzcvrVar2, zzdbcVar2.zzg(), zzdhcVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        zzfvj zzfvjVar = this.zzj;
        return (zzfvjVar == null || zzfvjVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0018, B:8:0x002d, B:12:0x004c, B:16:0x005d, B:20:0x0063, B:22:0x0072, B:24:0x007a, B:25:0x008f, B:27:0x00a8, B:29:0x00ac, B:30:0x00b5, B:34:0x0045), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0018, B:8:0x002d, B:12:0x004c, B:16:0x005d, B:20:0x0063, B:22:0x0072, B:24:0x007a, B:25:0x008f, B:27:0x00a8, B:29:0x00ac, B:30:0x00b5, B:34:0x0045), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzems
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemq zzemqVar, zzemr zzemrVar) throws RemoteException {
        boolean z;
        zzfhq zzfhqVar;
        zzfhg zzb = zzfhf.zzb(this.zzb, 7, 7, zzlVar);
        if (((Boolean) zzbjm.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                z = true;
                if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzir)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzewm.this.zzk();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                    zzeyv zzeyvVar = this.zze;
                    if (zzeyvVar.zzd() != null) {
                        zzfhq zzh = ((zzcvc) zzeyvVar.zzd()).zzh();
                        zzh.zzh(7);
                        zzh.zzb(zzlVar.zzp);
                        zzfhqVar = zzh;
                        zzfcs.zza(this.zzb, zzlVar.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzlVar.zzf) {
                            this.zza.zzk().zzl(true);
                        }
                        zzfbw zzfbwVar = this.zzi;
                        zzfbwVar.zzs(str);
                        zzfbwVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                        zzfbwVar.zzE(zzlVar);
                        zzfby zzG = zzfbwVar.zzG();
                        zzewl zzewlVar = new zzewl(null);
                        zzewlVar.zza = zzG;
                        zzfvj zzc = this.zze.zzc(new zzeyw(zzewlVar, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzewh
                            @Override // com.google.android.gms.internal.ads.zzeyu
                            public final zzdba zza(zzeyt zzeytVar) {
                                zzdba zzm;
                                zzm = zzewm.this.zzm(zzeytVar);
                                return zzm;
                            }
                        }, null);
                        this.zzj = zzc;
                        zzfva.zzr(zzc, new zzewj(this, zzemrVar, zzfhqVar, zzb, zzewlVar), this.zzc);
                        return true;
                    }
                }
                zzfhqVar = null;
                zzfcs.zza(this.zzb, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
                    this.zza.zzk().zzl(true);
                }
                zzfbw zzfbwVar2 = this.zzi;
                zzfbwVar2.zzs(str);
                zzfbwVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                zzfbwVar2.zzE(zzlVar);
                zzfby zzG2 = zzfbwVar2.zzG();
                zzewl zzewlVar2 = new zzewl(null);
                zzewlVar2.zza = zzG2;
                zzfvj zzc2 = this.zze.zzc(new zzeyw(zzewlVar2, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzewh
                    @Override // com.google.android.gms.internal.ads.zzeyu
                    public final zzdba zza(zzeyt zzeytVar) {
                        zzdba zzm;
                        zzm = zzewm.this.zzm(zzeytVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc2;
                zzfva.zzr(zzc2, new zzewj(this, zzemrVar, zzfhqVar, zzb, zzewlVar2), this.zzc);
                return true;
            }
        }
        z = false;
        if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzir)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    protected abstract zzdba zzc(zzcvr zzcvrVar, zzdbe zzdbeVar, zzdhe zzdheVar);

    final /* synthetic */ void zzk() {
        this.zzd.zza(zzfcx.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
