package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcbr extends zzcbo {
    private final Context zzb;

    @Nullable
    private SharedPreferences zzc;
    private final zzbuq zzd;
    private final VersionInfoParcel zze;
    private final Executor zzg;
    private final Object zza = new Object();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzcbr(Context context, zzbuq zzbuqVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbuqVar;
        this.zzg = executor;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzblh.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put(POBConstants.KEY_JS, versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzblh.zzg.zze());
            jSONObject.put("cl", "919173219");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final ListenableFuture zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzblh.zzh.zze()).longValue()) {
            return zzhcy.zza(null);
        }
        return zzhcy.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzgub() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzcbr.this.zze((JSONObject) obj);
                return null;
            }
        }, ((Boolean) zzblh.zzm.zze()).booleanValue() ? this.zzg : zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final ListenableFuture zzb() {
        if (!((Boolean) zzblh.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return zzhcy.zzb();
        }
        ListenableFuture zza = zza();
        zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbr.this.zzd();
            }
        }, zzcgj.zzh);
        return zza;
    }

    final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    final /* synthetic */ Void zze(JSONObject jSONObject) {
        zzbix zzbixVar = zzbjg.zza;
        com.google.android.gms.ads.internal.client.zzba.zza();
        Context context = this.zzb;
        SharedPreferences zzb = zzbiz.zzb(context);
        if (zzb == null) {
            return null;
        }
        SharedPreferences.Editor edit = zzb.edit();
        Objects.requireNonNull(com.google.android.gms.ads.internal.client.zzba.zzb());
        int i = zzbkx.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb().zzd(edit, 1, jSONObject);
        if ((((Boolean) zzblh.zzo.zze()).booleanValue() || ((Boolean) zzblh.zzp.zze()).booleanValue()) && !ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.apply();
        } else {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.commit();
        }
        if (((Boolean) zzblh.zze.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            SharedPreferences zza = zzbiz.zza(context);
            if (zza != null) {
                SharedPreferences.Editor edit2 = zza.edit();
                com.google.android.gms.ads.internal.client.zzba.zzb();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                edit2.putString("flag_configuration", jSONObject2.toString());
                edit2.apply();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()).apply();
        return null;
    }
}
