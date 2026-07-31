package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbvq;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzek {

    @VisibleForTesting
    final zzaz zza;
    private final zzbvq zzb;
    private final zzq zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;

    @Nullable
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;

    @Nullable
    private AppEventListener zzi;

    @Nullable
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;

    @Nullable
    private OnPaidEventListener zzp;
    private final AtomicLong zzq;

    public zzek(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzq.zza, null, i);
    }

    private static zzr zzF(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = zzG(i);
        return zzrVar;
    }

    private static boolean zzG(int i) {
        return i == 1;
    }

    public final VideoOptions zzB() {
        return this.zzk;
    }

    public final boolean zzC(zzbu zzbuVar) {
        try {
            IObjectWrapper zza = zzbuVar.zza();
            if (zza == null || ((View) ObjectWrapper.unwrap(zza)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zza));
            this.zzj = zzbuVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    final /* synthetic */ void zzD(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    final /* synthetic */ VideoController zzE() {
        return this.zze;
    }

    public final void zza() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzb();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final AdListener zzb() {
        return this.zzg;
    }

    @Nullable
    public final AdSize zzc() {
        zzr zzm;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null && (zzm = zzbuVar.zzm()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzm.zze, zzm.zzb, zzm.zza);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.zzh;
    }

    public final String zze() {
        zzbu zzbuVar;
        if (this.zzl == null && (zzbuVar = this.zzj) != null) {
            try {
                this.zzl = zzbuVar.zzt();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    @Nullable
    public final AppEventListener zzf() {
        return this.zzi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[Catch: RemoteException -> 0x0013, TryCatch #0 {RemoteException -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:10:0x0018, B:12:0x004c, B:13:0x0056, B:15:0x005a, B:16:0x0064, B:18:0x0068, B:19:0x0074, B:34:0x00c9, B:36:0x00cd, B:37:0x00d4, B:39:0x00d5, B:41:0x00e2, B:42:0x00eb, B:44:0x00ef, B:46:0x00f9, B:47:0x0100, B:50:0x0111, B:22:0x008c, B:24:0x0092, B:26:0x00a0, B:28:0x00b2, B:29:0x00bf), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: RemoteException -> 0x0013, TryCatch #0 {RemoteException -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:10:0x0018, B:12:0x004c, B:13:0x0056, B:15:0x005a, B:16:0x0064, B:18:0x0068, B:19:0x0074, B:34:0x00c9, B:36:0x00cd, B:37:0x00d4, B:39:0x00d5, B:41:0x00e2, B:42:0x00eb, B:44:0x00ef, B:46:0x00f9, B:47:0x0100, B:50:0x0111, B:22:0x008c, B:24:0x0092, B:26:0x00a0, B:28:0x00b2, B:29:0x00bf), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: RemoteException -> 0x0013, TryCatch #0 {RemoteException -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x000e, B:10:0x0018, B:12:0x004c, B:13:0x0056, B:15:0x005a, B:16:0x0064, B:18:0x0068, B:19:0x0074, B:34:0x00c9, B:36:0x00cd, B:37:0x00d4, B:39:0x00d5, B:41:0x00e2, B:42:0x00eb, B:44:0x00ef, B:46:0x00f9, B:47:0x0100, B:50:0x0111, B:22:0x008c, B:24:0x0092, B:26:0x00a0, B:28:0x00b2, B:29:0x00bf), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(zzeh zzehVar) {
        zza zzaVar;
        AppEventListener appEventListener;
        zzbu zzbuVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVar2 = this.zzj;
            if (zzbuVar2 == null) {
                if (this.zzh != null) {
                    if (this.zzl == null) {
                    }
                    ViewGroup viewGroup = this.zzm;
                    Context context = viewGroup.getContext();
                    zzbu zzbuVar3 = (zzbu) new zzal(zzay.zzb(), context, zzF(context, this.zzh, this.zzn), this.zzl, this.zzb).zzd(context, false);
                    this.zzj = zzbuVar3;
                    zzbuVar3.zzg(new zzg(this.zza));
                    zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzx(new zzb(zzaVar));
                    }
                    appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzdU(new zzbfv(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzF(new zzfw(this.zzk));
                    }
                    this.zzj.zzO(new zzfo(this.zzp));
                    this.zzj.zzy(this.zzo);
                    zzbuVar = this.zzj;
                    if (zzbuVar != null) {
                        try {
                            final IObjectWrapper zza = zzbuVar.zza();
                            if (zza != null) {
                                if (((Boolean) zzblf.zzf.zze()).booleanValue()) {
                                    if (((Boolean) zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzek.this.zzD(zza);
                                            }
                                        });
                                    }
                                }
                                viewGroup.addView((View) ObjectWrapper.unwrap(zza));
                            }
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                        }
                    }
                }
                if (zzbuVar2 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup2 = this.zzm;
                Context context2 = viewGroup2.getContext();
                zzbu zzbuVar32 = (zzbu) new zzal(zzay.zzb(), context2, zzF(context2, this.zzh, this.zzn), this.zzl, this.zzb).zzd(context2, false);
                this.zzj = zzbuVar32;
                zzbuVar32.zzg(new zzg(this.zza));
                zzaVar = this.zzf;
                if (zzaVar != null) {
                }
                appEventListener = this.zzi;
                if (appEventListener != null) {
                }
                if (this.zzk != null) {
                }
                this.zzj.zzO(new zzfo(this.zzp));
                this.zzj.zzy(this.zzo);
                zzbuVar = this.zzj;
                if (zzbuVar != null) {
                }
            }
            zzehVar.zzp(currentTimeMillis);
            if (zzehVar.zzr() != 0) {
                this.zzq.set(zzehVar.zzr());
            }
            zzbu zzbuVar4 = this.zzj;
            if (zzbuVar4 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != 0) {
                zzbuVar4.zzS(atomicLong.get());
            }
            zzbuVar4.zzd(this.zzc.zza(this.zzm.getContext(), zzehVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzh() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzi() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzl();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzk(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzl(@Nullable zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzx(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public final void zzn(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzn(zzF(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzo(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzp(@Nullable AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzdU(appEventListener != null ? new zzbfv(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(boolean z) {
        this.zzo = z;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzy(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzr() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzz();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                return zzbuVar.zzA();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Nullable
    public final ResponseInfo zzt() {
        zzdx zzdxVar = null;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzdxVar = zzbuVar.zzs();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdxVar);
    }

    public final void zzu(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzO(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final long zzv() {
        AtomicLong atomicLong = this.zzq;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                atomicLong.set(zzbuVar.zzT());
                return atomicLong.get();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return 0L;
    }

    public final void zzw(long j) {
        this.zzq.set(j);
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzS(j);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Nullable
    public final OnPaidEventListener zzx() {
        return this.zzp;
    }

    public final VideoController zzy() {
        return this.zze;
    }

    @Nullable
    public final zzea zzz() {
        zzbu zzbuVar = this.zzj;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzE();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzq.zza, null, 0);
    }

    public final void zzA(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbu zzbuVar = this.zzj;
            if (zzbuVar != null) {
                zzbuVar.zzF(videoOptions == null ? null : new zzfw(videoOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzq.zza, null, i);
    }

    @VisibleForTesting
    zzek(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z, zzq zzqVar, @Nullable zzbu zzbuVar, int i) {
        zzr zzrVar;
        this.zzb = new zzbvq();
        this.zze = new VideoController();
        this.zza = new zzei(this);
        this.zzq = new AtomicLong();
        this.zzm = viewGroup;
        this.zzc = zzqVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.zzh = zzzVar.zza(z);
                this.zzl = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zza = zzay.zza();
                    AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
                    } else {
                        zzr zzrVar2 = new zzr(context, adSize);
                        zzrVar2.zzj = zzG(i2);
                        zzrVar = zzrVar2;
                    }
                    zza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzay.zza().zzb(viewGroup, new zzr(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
