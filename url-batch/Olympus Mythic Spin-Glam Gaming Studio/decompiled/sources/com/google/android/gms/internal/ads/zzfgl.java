package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzfgl implements zzeuq {
    protected final zzcob zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfhc zzd;
    private final zzfiu zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfrj zzh;
    private final zzflv zzi;
    private ListenableFuture zzj;

    protected zzfgl(Context context, Executor executor, zzcob zzcobVar, zzfiu zzfiuVar, zzfhc zzfhcVar, zzflv zzflvVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcobVar;
        this.zze = zzfiuVar;
        this.zzd = zzfhcVar;
        this.zzi = zzflvVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcobVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdcw zzg(zzfis zzfisVar) {
        zzfgi zzfgiVar = (zzfgi) zzfisVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjB)).booleanValue()) {
            zzcwa zzcwaVar = new zzcwa(this.zzg);
            zzdcy zzdcyVar = new zzdcy();
            zzdcyVar.zza(this.zzb);
            zzdcyVar.zzb(zzfgiVar.zza);
            zzdcz zze = zzdcyVar.zze();
            zzdjo zzdjoVar = new zzdjo();
            zzfhc zzfhcVar = this.zzd;
            Executor executor = this.zzc;
            zzdjoVar.zzd(zzfhcVar, executor);
            zzdjoVar.zzg(zzfhcVar, executor);
            return zzc(zzcwaVar, zze, zzdjoVar.zzn());
        }
        zzfhc zzn = zzfhc.zzn(this.zzd);
        zzdjo zzdjoVar2 = new zzdjo();
        Executor executor2 = this.zzc;
        zzdjoVar2.zzc(zzn, executor2);
        zzdjoVar2.zzi(zzn, executor2);
        zzdjoVar2.zzj(zzn, executor2);
        zzdjoVar2.zzk(zzn, executor2);
        zzdjoVar2.zzd(zzn, executor2);
        zzdjoVar2.zzg(zzn, executor2);
        zzdjoVar2.zzl(zzn);
        zzcwa zzcwaVar2 = new zzcwa(this.zzg);
        zzdcy zzdcyVar2 = new zzdcy();
        zzdcyVar2.zza(this.zzb);
        zzdcyVar2.zzb(zzfgiVar.zza);
        return zzc(zzcwaVar2, zzdcyVar2.zze(), zzdjoVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) throws RemoteException {
        boolean z;
        zzfrg zzfrgVar;
        zzcvn zzcvnVar;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzblf.zzd.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                        z = true;
                        if (this.zzf.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue() || !z) {
                            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z = false;
                if (this.zzf.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue()) {
                }
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if (str == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfgl.this.zze();
                    }
                });
                return false;
            }
            if (this.zzj != null) {
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzcvnVar = (zzcvn) this.zze.zzd()) == null) {
                zzfrgVar = null;
            } else {
                zzfrg zzd = zzcvnVar.zzd();
                zzd.zzi(7);
                zzd.zzc(zzmVar.zzp);
                zzd.zzd(zzmVar.zzm);
                zzfrgVar = zzd;
            }
            Context context = this.zzb;
            boolean z2 = zzmVar.zzf;
            zzfmt.zzb(context, z2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue() && z2) {
                this.zza.zzw().zzc(true);
            }
            Bundle zza = zzdzu.zza(new Pair(zzdzs.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdzs.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzflv zzflvVar = this.zzi;
            zzflvVar.zzg(str);
            zzflvVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
            zzflvVar.zza(zzmVar);
            zzflvVar.zzv(zza);
            zzflw zzB = zzflvVar.zzB();
            zzfqw zzo = zzfqw.zzo(context, zzfrf.zzg(zzB), 7, zzmVar);
            zzfgi zzfgiVar = new zzfgi(null);
            zzfgiVar.zza = zzB;
            ListenableFuture zzc = this.zze.zzc(new zzfiv(zzfgiVar, null), new zzfit() { // from class: com.google.android.gms.internal.ads.zzfgj
                @Override // com.google.android.gms.internal.ads.zzfit
                public final /* synthetic */ zzdcw zza(zzfis zzfisVar) {
                    return zzfgl.this.zzf(zzfisVar);
                }
            }, null);
            this.zzj = zzc;
            zzhcy.zzr(zzc, new zzfgh(this, zzeupVar, zzfrgVar, zzo, zzfgiVar), this.zzc);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    protected abstract zzdcw zzc(zzcwa zzcwaVar, zzdcz zzdczVar, zzdjp zzdjpVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdJ(zzfmy.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzfhc zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfiu zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfrj zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
