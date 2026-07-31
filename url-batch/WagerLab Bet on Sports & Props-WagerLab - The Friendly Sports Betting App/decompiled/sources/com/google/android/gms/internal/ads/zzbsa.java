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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbsa extends zzbsb implements zzbjl {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcek zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbp zzk;
    private float zzl;
    private int zzm;

    public zzbsa(zzcek zzcekVar, Context context, zzbbp zzbbpVar) {
        super(zzcekVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcekVar;
        this.zzi = context;
        this.zzk = zzbbpVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcek zzcekVar = this.zzh;
        Activity zzj = zzcekVar.zzj();
        if (zzj == null || zzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, zzV[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, zzV[1]);
        }
        if (zzcekVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcekVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrz zzbrzVar = new zzbrz();
        zzbbp zzbbpVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrzVar.zzb(zzbbpVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrzVar.zza(zzbbpVar.zzc(intent2));
        zzbrzVar.zzc(zzbbpVar.zzb());
        zzbrzVar.zzd(zzbbpVar.zza());
        zzbrzVar.zze(true);
        boolean zzf = zzbrzVar.zzf();
        boolean zzg = zzbrzVar.zzg();
        boolean zzh = zzbrzVar.zzh();
        boolean zzi = zzbrzVar.zzi();
        try {
            jSONObject = new JSONObject().put("sms", zzf).put("tel", zzg).put("calendar", zzh).put("storePicture", zzi).put("inlineVideo", zzbrzVar.zzj());
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcekVar.zzd("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzcekVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcekVar.zzs().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzW((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzcek zzcekVar = this.zzh;
        if (zzcekVar.zzN() == null || !zzcekVar.zzN().zzg()) {
            int width = zzcekVar.getWidth();
            int height = zzcekVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaj)).booleanValue()) {
                if (width == 0) {
                    width = zzcekVar.zzN() != null ? zzcekVar.zzN().zzb : 0;
                }
                if (height == 0) {
                    if (zzcekVar.zzN() != null) {
                        i4 = zzcekVar.zzN().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i4);
        }
        zzj(i, i2 - i3, this.zzf, this.zzg);
        zzcekVar.zzP().zzN(i, i2);
    }
}
