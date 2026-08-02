package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeth implements zzeve {
    private final zzfzq zza;
    private final zzfef zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeth(zzfzq zzfzqVar, zzfef zzfefVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfefVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeti zzc(final zzeth zzethVar) {
        final ArrayList arrayList = zzethVar.zzb.zzg;
        return arrayList == null ? new zzeti() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // com.google.android.gms.internal.ads.zzevd
            public final void zzf(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzeti() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // com.google.android.gms.internal.ads.zzevd
            public final void zzf(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzeti() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzevd
            public final void zzf(Object obj) {
                zzeth.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeth.zzc(zzeth.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r9 == 3) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnvironmentCompat.MEDIA_UNKNOWN : "square" : "portrait" : "landscape" : "any";
            if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzb.zzi.zzc;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (!EnvironmentCompat.MEDIA_UNKNOWN.equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(i3);
        }
        JSONObject zzp = this.zzd.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.zzb.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbsc zzbscVar = this.zzb.zzb;
        if (zzbscVar != null) {
            if (TextUtils.isEmpty(zzbscVar.zzc)) {
                String str4 = "p";
                if (zzbscVar.zza >= 2) {
                    int i5 = zzbscVar.zzd;
                    if (i5 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzbscVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            zzcgp.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbscVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }
}
