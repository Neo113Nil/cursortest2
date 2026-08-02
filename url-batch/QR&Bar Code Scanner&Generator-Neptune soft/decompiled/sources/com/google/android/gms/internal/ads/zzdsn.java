package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdsn extends zzbse implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblp {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzdol zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdsn(zzdol zzdolVar, zzdoq zzdoqVar) {
        this.zza = zzdoqVar.zzf();
        this.zzb = zzdoqVar.zzj();
        this.zzc = zzdolVar;
        if (zzdoqVar.zzr() != null) {
            zzdoqVar.zzr().zzao(this);
        }
    }

    private final void zzg() {
        View view;
        zzdol zzdolVar = this.zzc;
        if (zzdolVar == null || (view = this.zza) == null) {
            return;
        }
        zzdolVar.zzv(view, Collections.emptyMap(), Collections.emptyMap(), zzdol.zzP(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbsi zzbsiVar, int i) {
        try {
            zzbsiVar.zze(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final com.google.android.gms.ads.internal.client.zzdk zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        com.google.android.gms.ads.internal.util.zze.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final zzbmb zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdol zzdolVar = this.zzc;
        if (zzdolVar == null || zzdolVar.zza() == null) {
            return null;
        }
        return zzdolVar.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdol zzdolVar = this.zzc;
        if (zzdolVar != null) {
            zzdolVar.zzV();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdsm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final void zzf(IObjectWrapper iObjectWrapper, zzbsi zzbsiVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.zze.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbsiVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbsiVar, 0);
            return;
        }
        if (this.zze) {
            com.google.android.gms.ads.internal.util.zze.zzg("Instream ad should not be used again.");
            zzi(zzbsiVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzx();
        zzchp.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzchp.zzb(this.zza, this);
        zzg();
        try {
            zzbsiVar.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }
}
