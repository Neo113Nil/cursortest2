package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdsu extends zzbmx {
    private final Context zza;
    private final zzdoq zzb;
    private zzdpq zzc;
    private zzdol zzd;

    public zzdsu(Context context, zzdoq zzdoqVar, zzdpq zzdpqVar, zzdol zzdolVar) {
        this.zza = context;
        this.zzb = zzdoqVar;
        this.zzc = zzdpqVar;
        this.zzd = zzdolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final zzbmb zzf() throws RemoteException {
        return this.zzd.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final zzbme zzg(String str) {
        return (zzbme) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzi() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final List zzk() {
        SimpleArrayMap zzh = this.zzb.zzh();
        SimpleArrayMap zzi = this.zzb.zzi();
        String[] strArr = new String[zzh.size() + zzi.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzh.size()) {
            strArr[i3] = (String) zzh.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzi.size()) {
            strArr[i3] = (String) zzi.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzl() {
        zzdol zzdolVar = this.zzd;
        if (zzdolVar != null) {
            zzdolVar.zzV();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzm() {
        String zzA = this.zzb.zzA();
        if ("Google".equals(zzA)) {
            com.google.android.gms.ads.internal.util.zze.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(zzA)) {
            com.google.android.gms.ads.internal.util.zze.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdol zzdolVar = this.zzd;
        if (zzdolVar != null) {
            zzdolVar.zzq(zzA, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzn(String str) {
        zzdol zzdolVar = this.zzd;
        if (zzdolVar != null) {
            zzdolVar.zzy(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzo() {
        zzdol zzdolVar = this.zzd;
        if (zzdolVar != null) {
            zzdolVar.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdol zzdolVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdolVar = this.zzd) == null) {
            return;
        }
        zzdolVar.zzC((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzq() {
        zzdol zzdolVar = this.zzd;
        return (zzdolVar == null || zzdolVar.zzO()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdpq zzdpqVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdpqVar = this.zzc) == null || !zzdpqVar.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzr().zzaq(new zzdst(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzs() {
        IObjectWrapper zzu = this.zzb.zzu();
        if (zzu == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzd(zzu);
        if (this.zzb.zzq() == null) {
            return true;
        }
        this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
