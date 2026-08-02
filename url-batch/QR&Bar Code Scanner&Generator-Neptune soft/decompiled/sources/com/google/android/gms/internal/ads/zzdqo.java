package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzdqo implements zzdoy {
    private final zzbvz zza;
    private final zzdds zzb;
    private final zzdcy zzc;
    private final zzdkl zzd;
    private final Context zze;
    private final zzfdk zzf;
    private final zzcgv zzg;
    private final zzfef zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbvv zzl;
    private final zzbvw zzm;

    public zzdqo(zzbvv zzbvvVar, zzbvw zzbvwVar, zzbvz zzbvzVar, zzdds zzddsVar, zzdcy zzdcyVar, zzdkl zzdklVar, Context context, zzfdk zzfdkVar, zzcgv zzcgvVar, zzfef zzfefVar, byte[] bArr) {
        this.zzl = zzbvvVar;
        this.zzm = zzbvwVar;
        this.zza = zzbvzVar;
        this.zzb = zzddsVar;
        this.zzc = zzdcyVar;
        this.zzd = zzdklVar;
        this.zze = context;
        this.zzf = zzfdkVar;
        this.zzg = zzcgvVar;
        this.zzh = zzfefVar;
    }

    private final void zza(View view) {
        try {
            zzbvz zzbvzVar = this.zza;
            if (zzbvzVar != null && !zzbvzVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbvv zzbvvVar = this.zzl;
            if (zzbvvVar != null && !zzbvvVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbvw zzbvwVar = this.zzm;
            if (zzbvwVar == null || zzbvwVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziw)).booleanValue()) {
                this.zzd.zzq();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzb(Map map) {
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

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final boolean zzA(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final JSONObject zzd(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final JSONObject zze(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzi(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        com.google.android.gms.ads.internal.util.zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzk(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzl(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzn(View view, Map map, Map map2, boolean z) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.zze.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zza(view);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzp(View view, Map map, Map map2) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbvz zzbvzVar = this.zza;
                if (zzbvzVar != null && !zzbvzVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbvv zzbvvVar = this.zzl;
                if (zzbvvVar != null && !zzbvvVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbvw zzbvwVar = this.zzm;
                if (zzbvwVar == null || zzbvwVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzr(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzs(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzt(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzu() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzv(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        com.google.android.gms.ads.internal.util.zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzw(zzbny zzbnyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzal;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbq)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbr)).booleanValue() && next.equals("3010")) {
                                zzbvz zzbvzVar = this.zza;
                                Object obj2 = null;
                                if (zzbvzVar != null) {
                                    try {
                                        zzn = zzbvzVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbvv zzbvvVar = this.zzl;
                                    if (zzbvvVar != null) {
                                        zzn = zzbvvVar.zzk();
                                    } else {
                                        zzbvw zzbvwVar = this.zzm;
                                        zzn = zzbvwVar != null ? zzbvwVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
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
            this.zzk = z;
            HashMap zzb = zzb(map);
            HashMap zzb2 = zzb(map2);
            zzbvz zzbvzVar2 = this.zza;
            if (zzbvzVar2 != null) {
                zzbvzVar2.zzy(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                return;
            }
            zzbvv zzbvvVar2 = this.zzl;
            if (zzbvvVar2 != null) {
                zzbvvVar2.zzv(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbvw zzbvwVar2 = this.zzm;
            if (zzbvwVar2 != null) {
                zzbvwVar2.zzt(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final void zzy(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbvz zzbvzVar = this.zza;
            if (zzbvzVar != null) {
                zzbvzVar.zzz(wrap);
                return;
            }
            zzbvv zzbvvVar = this.zzl;
            if (zzbvvVar != null) {
                zzbvvVar.zzw(wrap);
                return;
            }
            zzbvw zzbvwVar = this.zzm;
            if (zzbvwVar != null) {
                zzbvwVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    public final boolean zzz() {
        return this.zzf.zzM;
    }
}
