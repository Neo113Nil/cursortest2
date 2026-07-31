package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzdkw implements zzdjc, zzdau {
    private final zzbpm zza;
    private final zzcwk zzb;
    private final zzcyl zzc;
    private final zzcvq zzd;
    private final zzddx zze;
    private final Context zzf;
    private final zzfcj zzg;
    private final VersionInfoParcel zzh;
    private final zzfdc zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbpi zzm;
    private final zzbpj zzn;

    public zzdkw(zzbpi zzbpiVar, zzbpj zzbpjVar, zzbpm zzbpmVar, zzcwk zzcwkVar, zzcyl zzcylVar, zzcvq zzcvqVar, zzddx zzddxVar, Context context, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar) {
        this.zzm = zzbpiVar;
        this.zzn = zzbpjVar;
        this.zza = zzbpmVar;
        this.zzb = zzcwkVar;
        this.zzc = zzcylVar;
        this.zzd = zzcvqVar;
        this.zze = zzddxVar;
        this.zzf = context;
        this.zzg = zzfcjVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfdcVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final void zzi(View view) {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null && !zzbpmVar.zzu()) {
                zzbpmVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null && !zzbpiVar.zzq()) {
                zzbpiVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar == null || zzbpjVar.zzo()) {
                return;
            }
            zzbpjVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlB)).booleanValue()) {
                this.zze.zzdz();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzA() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbK)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbL)).booleanValue() && next.equals("3010")) {
                                zzbpm zzbpmVar = this.zza;
                                Object obj2 = null;
                                if (zzbpmVar != null) {
                                    try {
                                        zzq = zzbpmVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpi zzbpiVar = this.zzm;
                                    if (zzbpiVar != null) {
                                        zzq = zzbpiVar.zzw();
                                    } else {
                                        zzbpj zzbpjVar = this.zzn;
                                        zzq = zzbpjVar != null ? zzbpjVar.zzu() : null;
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
            zzbpm zzbpmVar2 = this.zza;
            if (zzbpmVar2 != null) {
                zzbpmVar2.zzx(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                return;
            }
            zzbpi zzbpiVar2 = this.zzm;
            if (zzbpiVar2 != null) {
                zzbpiVar2.zzy(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbpiVar2.zzo(wrap);
                return;
            }
            zzbpj zzbpjVar2 = this.zzn;
            if (zzbpjVar2 != null) {
                zzbpjVar2.zzw(wrap, ObjectWrapper.wrap(zzB), ObjectWrapper.wrap(zzB2));
                zzbpjVar2.zzm(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzy(wrap);
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null) {
                zzbpiVar.zzs(wrap);
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar != null) {
                zzbpjVar.zzq(wrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar == null || !zzbpmVar.zzt()) {
                return;
            }
            zzfcj zzfcjVar = this.zzg;
            if (zzfcjVar.zze == 4 || zzfcjVar.zzaD) {
                zzbpmVar.zzv();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
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

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzp(zzbhn zzbhnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbpm zzbpmVar = this.zza;
                if (zzbpmVar == null) {
                    zzbpi zzbpiVar = this.zzm;
                    if (zzbpiVar != null && !zzbpiVar.zzp()) {
                        zzbpiVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbpj zzbpjVar = this.zzn;
                    if (zzbpjVar == null || zzbpjVar.zzn()) {
                        return;
                    }
                    zzbpjVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfcj zzfcjVar = this.zzg;
                if (zzfcjVar.zzaD) {
                    if (zzbpmVar.zzt()) {
                        return;
                    }
                    zzbpmVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbpmVar.zzt() && zzfcjVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbpmVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
