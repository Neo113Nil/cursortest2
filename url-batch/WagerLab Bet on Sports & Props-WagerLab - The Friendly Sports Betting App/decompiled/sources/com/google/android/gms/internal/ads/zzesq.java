package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import expo.modules.devlauncher.launcher.manifest.DevLauncherOrientation;
import java.util.ArrayList;
import org.apache.commons.codec.language.bm.Languages;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzesq implements zzeun {
    private final zzfdc zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzesq(zzfdc zzfdcVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfdcVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbfl zzbflVar = this.zza.zzj;
        if (zzbflVar == null || (i = zzbflVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbflVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r0 == 3) goto L71;
     */
    @Override // com.google.android.gms.internal.ads.zzeun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzfdc zzfdcVar = this.zza;
        ArrayList<String> arrayList = zzfdcVar.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcuuVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfdcVar.zzi);
        zzbfl zzbflVar = zzfdcVar.zzj;
        if (zzbflVar != null) {
            int i = zzbflVar.zza;
            String str = DevLauncherOrientation.LANDSCAPE;
            if (i > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = zzbflVar.zzh;
                String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "square" : DevLauncherOrientation.PORTRAIT : DevLauncherOrientation.LANDSCAPE : Languages.ANY;
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i3 = zzbflVar.zzc;
            if (i3 == 0) {
                str = Languages.ANY;
            } else if (i3 == 1) {
                str = DevLauncherOrientation.PORTRAIT;
            } else if (i3 != 2) {
                str = "unknown";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbflVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbflVar.zzg);
            zzc(bundle);
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
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzfdcVar.zzg)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i5 = zzfdcVar.zzl;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzblw zzblwVar = zzfdcVar.zzb;
        if (zzblwVar != null) {
            String str4 = zzblwVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                String str5 = "p";
                if (zzblwVar.zza >= 2) {
                    int i6 = zzblwVar.zzd;
                    if (i6 != 2) {
                    }
                    str5 = CmcdData.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                } else {
                    int i7 = zzblwVar.zzb;
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
                    str5 = CmcdData.STREAM_TYPE_LIVE;
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmG)).booleanValue() || zzbflVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbflVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbflVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbflVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcuuVar.zzb);
    }
}
