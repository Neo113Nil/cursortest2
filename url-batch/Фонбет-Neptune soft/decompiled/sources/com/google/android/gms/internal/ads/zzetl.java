package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetl implements zzevo {
    private final zzgcu zza;
    private final zzffg zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzetl(zzgcu zzgcuVar, zzffg zzffgVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgcuVar;
        this.zzb = zzffgVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzetm zzc(final zzetl zzetlVar) {
        final ArrayList arrayList = zzetlVar.zzb.zzg;
        return arrayList == null ? new zzetm() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzetm() { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzetm() { // from class: com.google.android.gms.internal.ads.zzetk
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                zzetl.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetl.zzc(zzetl.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r9 == 3) goto L64;
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
        zzbes zzbesVar = this.zzb.zzi;
        if (zzbesVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbesVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzt();
            this.zzd.zzw(i3);
        }
        JSONObject zzq = this.zzd.zzq();
        String str3 = null;
        if (zzq != null && (optJSONArray = zzq.optJSONArray(this.zzb.zzf)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzblh zzblhVar = this.zzb.zzb;
        if (zzblhVar != null) {
            if (TextUtils.isEmpty(zzblhVar.zzc)) {
                String str4 = "p";
                if (zzblhVar.zza >= 2) {
                    int i5 = zzblhVar.zzd;
                    if (i5 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzblhVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzblhVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkS)).booleanValue()) {
            if (this.zzb.zzi.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.zzb.zzi.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.zzb.zzi.zzf.zzb);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}
