package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdst implements zzdqz, zzdir {

    @Nullable
    private final zzbwj zza;
    private final zzdeh zzb;
    private final zzdgi zzc;
    private final zzddn zzd;
    private final zzdlu zze;
    private final Context zzf;
    private final zzfld zzg;
    private final VersionInfoParcel zzh;
    private final zzflw zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;

    @Nullable
    private final zzbwf zzm;

    @Nullable
    private final zzbwg zzn;

    public zzdst(@Nullable zzbwf zzbwfVar, @Nullable zzbwg zzbwgVar, @Nullable zzbwj zzbwjVar, zzdeh zzdehVar, zzdgi zzdgiVar, zzddn zzddnVar, zzdlu zzdluVar, Context context, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzflw zzflwVar) {
        this.zzm = zzbwfVar;
        this.zzn = zzbwgVar;
        this.zza = zzbwjVar;
        this.zzb = zzdehVar;
        this.zzc = zzdgiVar;
        this.zzd = zzddnVar;
        this.zze = zzdluVar;
        this.zzf = context;
        this.zzg = zzfldVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzflwVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    private final void zzi(View view) {
        try {
            zzbwj zzbwjVar = this.zza;
            if (zzbwjVar != null && !zzbwjVar.zzu()) {
                zzbwjVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbwf zzbwfVar = this.zzm;
            if (zzbwfVar != null && !zzbwfVar.zzq()) {
                zzbwfVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbwg zzbwgVar = this.zzn;
            if (zzbwgVar == null || zzbwgVar.zzo()) {
                return;
            }
            zzbwgVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzA() {
        try {
            zzbwj zzbwjVar = this.zza;
            if (zzbwjVar != null) {
                zzbwjVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zza(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcn)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzco)).booleanValue() && next.equals("3010")) {
                                zzbwj zzbwjVar = this.zza;
                                Object obj2 = null;
                                if (zzbwjVar != null) {
                                    try {
                                        zzq = zzbwjVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbwf zzbwfVar = this.zzm;
                                    if (zzbwfVar != null) {
                                        zzq = zzbwfVar.zzw();
                                    } else {
                                        zzbwg zzbwgVar = this.zzn;
                                        zzq = zzbwgVar != null ? zzbwgVar.zzu() : null;
                                    }
                                }
                                if (zzq != null) {
                                    obj2 = ObjectWrapper.unwrap(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbp.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ClassLoader classLoader = this.zzf.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzl = z;
            HashMap zzB = zzB(map);
            HashMap zzB2 = zzB(map2);
            zzbwj zzbwjVar2 = this.zza;
            if (zzbwjVar2 != null) {
                zzbwjVar2.zzx(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                return;
            }
            zzbwf zzbwfVar2 = this.zzm;
            if (zzbwfVar2 != null) {
                zzbwfVar2.zzy(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbwfVar2.zzo(wrap);
                return;
            }
            zzbwg zzbwgVar2 = this.zzn;
            if (zzbwgVar2 != null) {
                zzbwgVar2.zzw(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbwgVar2.zzm(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzb(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbwj zzbwjVar = this.zza;
            if (zzbwjVar != null) {
                zzbwjVar.zzy(wrap);
                return;
            }
            zzbwf zzbwfVar = this.zzm;
            if (zzbwfVar != null) {
                zzbwfVar.zzs(wrap);
                return;
            }
            zzbwg zzbwgVar = this.zzn;
            if (zzbwgVar != null) {
                zzbwgVar.zzq(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzc(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdH() {
        try {
            zzbwj zzbwjVar = this.zza;
            if (zzbwjVar == null || !zzbwjVar.zzt()) {
                return;
            }
            zzfld zzfldVar = this.zzg;
            if (zzfldVar.zze != 4 && !zzfldVar.zzaD) {
                return;
            }
            zzbwjVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzj(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    @Nullable
    public final JSONObject zzl(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    @Nullable
    public final JSONObject zzm(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzp(zzboj zzbojVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzr(@Nullable com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzw(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbwj zzbwjVar = this.zza;
                if (zzbwjVar == null) {
                    zzbwf zzbwfVar = this.zzm;
                    if (zzbwfVar != null && !zzbwfVar.zzp()) {
                        zzbwfVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbwg zzbwgVar = this.zzn;
                    if (zzbwgVar == null || zzbwgVar.zzn()) {
                        return;
                    }
                    zzbwgVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfld zzfldVar = this.zzg;
                if (zzfldVar.zzaD) {
                    if (zzbwjVar.zzt()) {
                        return;
                    }
                    zzbwjVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbwjVar.zzt() && zzfldVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbwjVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzx(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
