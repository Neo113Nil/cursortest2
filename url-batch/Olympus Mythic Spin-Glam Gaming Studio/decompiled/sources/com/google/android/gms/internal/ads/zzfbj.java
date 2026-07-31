package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfbj implements zzfdg {
    private final zzflw zza;

    @Nullable
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzfbj(zzflw zzflwVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzflwVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r0 == 3) goto L72;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzflw zzflwVar = this.zza;
        ArrayList<String> arrayList = zzflwVar.zzh;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzflwVar.zzi);
        zzbmk zzbmkVar = zzflwVar.zzj;
        if (zzbmkVar != null) {
            if (zzbmkVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbmkVar.zzh;
                String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i2 = zzbmkVar.zzc;
            String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbmkVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbmkVar.zzg);
            int i3 = zzbmkVar.zzi;
            if (i3 != 0) {
                bundle.putBoolean("sccg_tap", zzbmkVar.zzj);
                bundle.putInt("sccg_dir", i3);
            }
        }
        PackageInfo packageInfo = this.zzb;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i4 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i4);
        }
        JSONObject zzs = zzgVar.zzs();
        String str3 = null;
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzflwVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i5 = zzflwVar.zzl;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbst zzbstVar = zzflwVar.zzb;
        if (zzbstVar != null) {
            String str4 = zzbstVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                String str5 = "p";
                if (zzbstVar.zza >= 2) {
                    int i6 = zzbstVar.zzd;
                    if (i6 != 2) {
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                } else {
                    int i7 = zzbstVar.zzb;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i7);
                            sb.append(" is wrong.");
                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                        }
                        bundle.putString("ia_var", str5);
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznA)).booleanValue() || zzbmkVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmkVar.zzf;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmkVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbmkVar.zze);
    }
}
