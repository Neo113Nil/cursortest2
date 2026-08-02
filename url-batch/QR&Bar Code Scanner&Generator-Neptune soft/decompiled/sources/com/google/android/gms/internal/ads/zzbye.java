package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbye extends zzbyf implements zzbpu {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcmp zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbim zzk;
    private float zzl;
    private int zzm;

    public zzbye(zzcmp zzcmpVar, Context context, zzbim zzbimVar) {
        super(zzcmpVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcmpVar;
        this.zzi = context;
        this.zzk = zzbimVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcgi.zzu(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcgi.zzu(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.zzh.zzk();
        if (zzk == null || zzk.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zzk);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zzd = zzcgi.zzu(this.zza, zzN[0]);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zze = zzcgi.zzu(this.zza, zzN[1]);
        }
        if (this.zzh.zzQ().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyd zzbydVar = new zzbyd();
        zzbim zzbimVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbydVar.zze(zzbimVar.zza(intent));
        zzbim zzbimVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbydVar.zzc(zzbimVar2.zza(intent2));
        zzbydVar.zza(this.zzk.zzb());
        zzbydVar.zzd(this.zzk.zzc());
        zzbydVar.zzb(true);
        z = zzbydVar.zza;
        z2 = zzbydVar.zzb;
        z3 = zzbydVar.zzc;
        z4 = zzbydVar.zzd;
        z5 = zzbydVar.zze;
        zzcmp zzcmpVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcmpVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzp().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzO((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzQ() == null || !this.zzh.zzQ().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzQ() != null ? this.zzh.zzQ().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzQ() != null) {
                        i4 = this.zzh.zzQ().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzP().zzA(i, i2);
    }
}
