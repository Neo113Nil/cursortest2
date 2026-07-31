package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public interface zzedp {
    boolean zza(Context context);

    String zzb(Context context);

    zzedu zzc(String str, WebView webView, String str2, String str3, String str4, zzedr zzedrVar, zzedq zzedqVar, String str5);

    zzedu zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzedr zzedrVar, zzedq zzedqVar, String str6);

    void zze(zzflj zzfljVar);

    void zzf(zzflj zzfljVar);

    void zzg(zzflj zzfljVar, View view);

    void zzh(zzflj zzfljVar, View view);

    zzflv zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    void zzj(zzflv zzflvVar, zzflu zzfluVar);

    void zzk(zzflv zzflvVar, View view);
}
