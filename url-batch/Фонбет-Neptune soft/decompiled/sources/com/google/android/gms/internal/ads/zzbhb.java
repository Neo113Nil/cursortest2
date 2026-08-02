package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhb extends UnifiedNativeAd {
    private final zzbha zza;
    private final zzbfe zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbhb(zzbha zzbhaVar) {
        zzbfd zzbfdVar;
        IBinder iBinder;
        this.zza = zzbhaVar;
        zzbfe zzbfeVar = null;
        try {
            List zzu = zzbhaVar.zzu();
            if (zzu != null) {
                for (Object obj : zzu) {
                    if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfdVar = queryLocalInterface instanceof zzbfd ? (zzbfd) queryLocalInterface : new zzbfb(iBinder);
                        if (zzbfdVar == null) {
                            this.zzb.add(new zzbfe(zzbfdVar));
                        }
                    }
                    zzbfdVar = null;
                    if (zzbfdVar == null) {
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
        try {
            List zzv = this.zza.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    com.google.android.gms.ads.internal.client.zzcw zzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzcv.zzb((IBinder) obj2) : null;
                    if (zzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzcx(zzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
        try {
            zzbfd zzk = this.zza.zzk();
            if (zzk != null) {
                zzbfeVar = new zzbfe(zzk);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
        }
        this.zzc = zzbfeVar;
        try {
            if (this.zza.zzi() != null) {
                new zzbex(this.zza.zzi());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            IObjectWrapper zzl = this.zza.zzl();
            if (zzl != null) {
                return ObjectWrapper.unwrap(zzl);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
