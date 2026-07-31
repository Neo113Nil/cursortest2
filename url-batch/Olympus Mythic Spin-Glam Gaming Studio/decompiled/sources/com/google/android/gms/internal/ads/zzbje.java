package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbje implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbjb
                    @Override // com.google.android.gms.internal.ads.zzgvc
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
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

    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbji.zza(new com.google.android.gms.internal.ads.zzbjc(r3))).optBoolean("local_flags_enabled") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125 A[Catch: all -> 0x000e, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x000e, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x0011, B:14:0x0016, B:15:0x0018, B:17:0x002a, B:18:0x002e, B:20:0x0030, B:38:0x00a3, B:39:0x00aa, B:48:0x00d9, B:49:0x00e0, B:56:0x0125, B:57:0x012c, B:70:0x016e, B:71:0x0175, B:93:0x0177, B:94:0x017e, B:23:0x0045, B:28:0x0063, B:30:0x006c, B:31:0x0074, B:33:0x007a, B:35:0x008a, B:37:0x009f, B:41:0x00ac, B:43:0x00b0, B:45:0x00c0, B:47:0x00d5, B:51:0x00e2, B:54:0x0121, B:59:0x012e, B:61:0x013b, B:63:0x0149, B:64:0x0152, B:66:0x0160, B:68:0x0164, B:69:0x0167, B:73:0x00f3, B:75:0x0101, B:77:0x0109, B:79:0x0114, B:84:0x004c, B:86:0x0059), top: B:7:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:23:0x0045, B:28:0x0063, B:30:0x006c, B:31:0x0074, B:33:0x007a, B:35:0x008a, B:37:0x009f, B:41:0x00ac, B:43:0x00b0, B:45:0x00c0, B:47:0x00d5, B:51:0x00e2, B:54:0x0121, B:59:0x012e, B:61:0x013b, B:63:0x0149, B:64:0x0152, B:66:0x0160, B:68:0x0164, B:69:0x0167, B:73:0x00f3, B:75:0x0101, B:77:0x0109, B:79:0x0114, B:84:0x004c, B:86:0x0059), top: B:22:0x0045, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
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
                    Context context3 = this.zzg;
                    SharedPreferences sharedPreferences2 = null;
                    if (context3 == null) {
                        context3 = null;
                    } else {
                        try {
                            context2 = context3.createPackageContext("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            context2 = null;
                        }
                        if (context2 != null || (context2 = context3.getApplicationContext()) != null) {
                            context3 = context2;
                        }
                    }
                    if (context3 != null) {
                        com.google.android.gms.ads.internal.client.zzba.zza();
                        sharedPreferences2 = zzbiz.zzb(context3);
                    }
                    if (sharedPreferences2 != null) {
                        zzblz.zzc(new zzbja(this, sharedPreferences2));
                    }
                    if (!this.zzi) {
                        zzbkq zzbkqVar = zzbkz.zzd;
                        if (((Long) zzbkqVar.zze()).longValue() > 0 && zzbir.zzd(this.zzg) >= ((Long) zzbkqVar.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            return;
                        }
                    }
                    if (!this.zzi) {
                        zzbkq zzbkqVar2 = zzbkz.zzf;
                        if (((Long) zzbkqVar2.zze()).longValue() > 0 && zzbir.zzc(this.zzg) >= ((Long) zzbkqVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            return;
                        }
                    }
                    Context context4 = this.zzg;
                    if (!((Boolean) zzblh.zzk.zze()).booleanValue()) {
                        if (((Boolean) zzblh.zzl.zze()).booleanValue() && (r3 = context4.getSharedPreferences("admob", 0)) != null) {
                        }
                        if (context3 != null) {
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzba.zza();
                        this.zze = zzbiz.zzb(context3);
                        if (!this.zzi && ((Boolean) zzblh.zze.zze()).booleanValue()) {
                            com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                        }
                        if (!((Boolean) zzblh.zzc.zze()).booleanValue() && (sharedPreferences = this.zze) != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                        }
                        zzg(this.zze);
                        this.zzd = true;
                        return;
                    }
                    context3 = this.zzg;
                    if (context3 != null) {
                    }
                } finally {
                    this.zza = false;
                    this.zzc.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbix zzbixVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbixVar.zzf();
            }
        }
        if (zzbixVar.zzm() != 2) {
            return (zzbixVar.zzm() == 1 && this.zzh.has(zzbixVar.zze())) ? zzbixVar.zzc(this.zzh) : zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbjd
                @Override // com.google.android.gms.internal.ads.zzgvc
                public final /* synthetic */ Object zza() {
                    return zzbje.this.zzf(zzbixVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbixVar.zzf() : zzbixVar.zza(bundle);
    }

    public final Object zze(zzbix zzbixVar) {
        return (this.zzd || this.zza) ? zzd(zzbixVar) : zzbixVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbix zzbixVar) {
        return zzbixVar.zzd(this.zze);
    }
}
