package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpb implements zzbqh {
    zzbpb() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        WindowManager windowManager = (WindowManager) zzclmVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        int i = zzv.widthPixels;
        int i2 = zzv.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzclmVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzclmVar.zze("locationReady", hashMap);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GET LOCATION COMPILED");
    }
}
