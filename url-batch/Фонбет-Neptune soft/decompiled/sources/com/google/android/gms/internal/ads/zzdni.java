package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdni extends zzbfw {
    private final Context zza;
    private final zzdjb zzb;
    private zzdkb zzc;
    private zzdiw zzd;

    public zzdni(Context context, zzdjb zzdjbVar, zzdkb zzdkbVar, zzdiw zzdiwVar) {
        this.zza = context;
        this.zzb = zzdjbVar;
        this.zzc = zzdkbVar;
        this.zzd = zzdiwVar;
    }

    private final zzber zzd(String str) {
        return new zzdnh(this, NativeCustomFormatAd.ASSET_NAME_VIDEO);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfa zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfd zzg(String str) {
        return (zzbfd) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final List zzk() {
        try {
            SimpleArrayMap zzh = this.zzb.zzh();
            SimpleArrayMap zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.size() + zzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < zzh.size(); i2++) {
                strArr[i] = (String) zzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzi.size(); i3++) {
                strArr[i] = (String) zzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzl() {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(zzC)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdiw zzdiwVar = this.zzd;
            if (zzdiwVar != null) {
                zzdiwVar.zzf(zzC, false);
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzn(String str) {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzo() {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdiw zzdiwVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdiwVar = this.zzd) == null) {
            return;
        }
        zzdiwVar.zzJ((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzq() {
        zzdiw zzdiwVar = this.zzd;
        return (zzdiwVar == null || zzdiwVar.zzW()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdkb zzdkbVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkbVar = this.zzc) == null || !zzdkbVar.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdkb zzdkbVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdkbVar = this.zzc) == null || !zzdkbVar.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzt() {
        zzeeo zzu = this.zzb.zzu();
        if (zzu == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzk(zzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
