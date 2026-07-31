package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzdrk;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzeca;
import com.google.android.gms.internal.ads.zzetb;
import com.google.android.gms.internal.ads.zzfge;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfkw;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public class ClientApi extends zzcn {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zza(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfhs zzj = zzcob.zza(context, zzbvuVar, i).zzj();
        zzj.zzd(context);
        zzj.zzb(zzrVar);
        zzj.zzc(str);
        return zzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfji zzn = zzcob.zza(context, zzbvuVar, i).zzn();
        zzn.zzd(context);
        zzn.zzb(zzrVar);
        zzn.zzc(str);
        return zzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzc(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzetb(zzcob.zza(context, zzbvuVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmz zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdrm((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcck zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfkw zzq = zzcob.zza(context, zzbvuVar, i).zzq();
        zzq.zzc(context);
        return zzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzt zzf(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzw(activity) : new zzag(activity) : new zzac(activity, zza) : new zzaj(activity) : new zzai(activity) : new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return zzcob.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvuVar, i).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcob.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbne zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdrk((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcda zzk(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfkw zzq = zzcob.zza(context, zzbvuVar, i).zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        return zzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzl(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfge zzl = zzcob.zza(context, zzbvuVar, i).zzl();
        zzl.zzb(str);
        zzl.zzc(context);
        return zzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcfe zzm(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return zzcob.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvuVar, i).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzm zzn(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return zzcob.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvuVar, i).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrl zzo(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i, zzbri zzbriVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeca zzA = zzcob.zza(context, zzbvuVar, i).zzA();
        zzA.zzc(context);
        zzA.zzb(zzbriVar);
        return zzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzp(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return zzcob.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbvuVar, i).zzC();
    }
}
