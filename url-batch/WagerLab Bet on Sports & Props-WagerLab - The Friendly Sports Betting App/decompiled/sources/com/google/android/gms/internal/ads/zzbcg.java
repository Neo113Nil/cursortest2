package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import io.invertase.googlemobileads.BuildConfig;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbcg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcd
                    @Override // com.google.android.gms.internal.ads.zzght
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0114, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbck.zza(new com.google.android.gms.internal.ads.zzbce(r3))).optBoolean("local_flags_enabled") != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a A[Catch: all -> 0x0175, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x000f, B:13:0x0014, B:14:0x0016, B:16:0x0028, B:17:0x002c, B:19:0x002e, B:38:0x0098, B:39:0x009f, B:48:0x00cf, B:54:0x011a, B:66:0x0163, B:67:0x016a, B:82:0x016d, B:83:0x0174, B:22:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x0061, B:31:0x0069, B:33:0x006f, B:35:0x007f, B:37:0x0094, B:41:0x00a2, B:43:0x00a6, B:45:0x00b6, B:47:0x00cb, B:49:0x00d7, B:52:0x0116, B:55:0x0123, B:57:0x0130, B:59:0x013e, B:60:0x0147, B:62:0x0155, B:64:0x0159, B:65:0x015c, B:69:0x00e8, B:71:0x00f6, B:73:0x00fe, B:75:0x0109), top: B:5:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123 A[Catch: all -> 0x016c, TRY_ENTER, TryCatch #3 {all -> 0x016c, blocks: (B:22:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x0061, B:31:0x0069, B:33:0x006f, B:35:0x007f, B:37:0x0094, B:41:0x00a2, B:43:0x00a6, B:45:0x00b6, B:47:0x00cb, B:49:0x00d7, B:52:0x0116, B:55:0x0123, B:57:0x0130, B:59:0x013e, B:60:0x0147, B:62:0x0155, B:64:0x0159, B:65:0x015c, B:69:0x00e8, B:71:0x00f6, B:73:0x00fe, B:75:0x0109), top: B:21:0x0043, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    sharedPreferences = zzbcb.zzb(context2);
                } else {
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    zzbfa.zzc(new zzbcc(this, sharedPreferences));
                }
                if (!this.zzi) {
                    zzbds zzbdsVar = zzbea.zzd;
                    if (((Long) zzbdsVar.zze()).longValue() > 0 && zzbbt.zzd(this.zzg) >= ((Long) zzbdsVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbds zzbdsVar2 = zzbea.zzf;
                    if (((Long) zzbdsVar2.zze()).longValue() > 0 && zzbbt.zzc(this.zzg) >= ((Long) zzbdsVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                Context context3 = this.zzg;
                if (!((Boolean) zzbei.zzi.zze()).booleanValue()) {
                    if (((Boolean) zzbei.zzj.zze()).booleanValue() && (r3 = context3.getSharedPreferences("admob", 0)) != null) {
                    }
                    if (context2 != null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    this.zze = zzbcb.zzb(context2);
                    if (!this.zzi && ((Boolean) zzbei.zzc.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                    }
                    if (!((Boolean) zzbei.zzb.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context2 = this.zzg;
                if (context2 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbbz zzbbzVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbzVar.zzf();
            }
        }
        if (zzbbzVar.zzm() != 2) {
            return (zzbbzVar.zzm() == 1 && this.zzh.has(zzbbzVar.zze())) ? zzbbzVar.zzc(this.zzh) : zzbck.zza(new zzght() { // from class: com.google.android.gms.internal.ads.zzbcf
                @Override // com.google.android.gms.internal.ads.zzght
                public final /* synthetic */ Object zza() {
                    return zzbcg.this.zzf(zzbbzVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbzVar.zzf() : zzbbzVar.zza(bundle);
    }

    final /* synthetic */ Object zzf(zzbbz zzbbzVar) {
        return zzbbzVar.zzd(this.zze);
    }

    public final Object zze(zzbbz zzbbzVar) {
        return (this.zzd || this.zza) ? zzd(zzbbzVar) : zzbbzVar.zzf();
    }
}
