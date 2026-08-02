package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeyg extends com.google.android.gms.ads.internal.client.zzbr implements com.google.android.gms.ads.internal.overlay.zzad, zzbdd, zzdez {
    protected zzcwl zza;
    private final zzcom zzb;
    private final Context zzc;
    private final ViewGroup zzd;
    private final String zzf;
    private final zzeya zzg;
    private final zzezg zzh;
    private final zzcgv zzi;
    private zzcvw zzk;
    private AtomicBoolean zze = new AtomicBoolean();
    private long zzj = -1;

    public zzeyg(zzcom zzcomVar, Context context, String str, zzeya zzeyaVar, zzezg zzezgVar, zzcgv zzcgvVar) {
        this.zzd = new FrameLayout(context);
        this.zzb = zzcomVar;
        this.zzc = context;
        this.zzf = str;
        this.zzg = zzeyaVar;
        this.zzh = zzezgVar;
        zzezgVar.zzn(this);
        this.zzi = zzcgvVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.overlay.zzr zze(zzeyg zzeygVar, zzcwl zzcwlVar) {
        boolean zzh = zzcwlVar.zzh();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdZ)).intValue();
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = new com.google.android.gms.ads.internal.overlay.zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != zzh ? 0 : intValue;
        zzqVar.zzb = true != zzh ? intValue : 0;
        zzqVar.zzc = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzr(zzeygVar.zzc, zzqVar, zzeygVar);
    }

    private final synchronized void zzq(int i) {
        if (this.zze.compareAndSet(false, true)) {
            zzcwl zzcwlVar = this.zza;
            if (zzcwlVar != null && zzcwlVar.zzj() != null) {
                this.zzh.zzt(zzcwlVar.zzj());
            }
            this.zzh.zzj();
            this.zzd.removeAllViews();
            zzcvw zzcvwVar = this.zzk;
            if (zzcvwVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcvwVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzj;
                }
                this.zza.zzi(j, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdm zzbdmVar) {
        this.zzh.zzr(zzbdmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzg.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzl zzbzlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbjx zzbjxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzo zzbzoVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcby zzcbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zza() {
        zzq(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0025, B:11:0x0042, B:13:0x004d, B:16:0x0052, B:20:0x0064, B:24:0x006c, B:27:0x003d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        boolean z;
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziM)).booleanValue()) {
                z = true;
                if (this.zzi.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziN)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Failed to load the ad because app ID is missing.");
                    this.zzh.zza(zzffe.zzd(4, null, null));
                    return false;
                }
                if (!zzY()) {
                    return false;
                }
                this.zze = new AtomicBoolean();
                return this.zzg.zzb(zzlVar, this.zzf, new zzeye(this), new zzeyf(this));
            }
        }
        z = false;
        if (this.zzi.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziN)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
            com.google.android.gms.ads.internal.util.zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzh.zza(zzffe.zzd(4, null, null));
            return false;
        }
        if (!zzY()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbJ() {
        zzq(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcwl zzcwlVar = this.zza;
        if (zzcwlVar == null) {
            return null;
        }
        return zzfej.zza(this.zzc, Collections.singletonList(zzcwlVar.zzc()));
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zzh() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        int zza = this.zza.zza();
        if (zza <= 0) {
            return;
        }
        zzcvw zzcvwVar = new zzcvw(this.zzb.zzB(), com.google.android.gms.ads.internal.zzt.zzB());
        this.zzk = zzcvwVar;
        zzcvwVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // java.lang.Runnable
            public final void run() {
                zzeyg.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzd);
    }

    final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcgi.zzt()) {
            zzq(5);
        } else {
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyg.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcwl zzcwlVar = this.zza;
        if (zzcwlVar != null) {
            zzcwlVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
