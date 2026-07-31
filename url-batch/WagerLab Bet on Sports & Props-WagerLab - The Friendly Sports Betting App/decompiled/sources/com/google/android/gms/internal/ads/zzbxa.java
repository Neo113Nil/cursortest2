package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbxa implements zzbxf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhmp zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxc zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxa(Context context, VersionInfoParcel versionInfoParcel, zzbxc zzbxcVar, String str, zzbxb zzbxbVar) {
        Preconditions.checkNotNull(zzbxcVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxcVar;
        Iterator it = zzbxcVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhmp zzg = zzhot.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        zzhmq zzc2 = zzhmr.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((zzhmr) zzc2.zzbu());
        zzhof zzc3 = zzhog.zzc();
        zzc3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc3.zzb(apkVersion);
        }
        zzg.zzk((zzhog) zzc3.zzbu());
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final zzbxc zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzb(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzi();
            } else {
                this.zzd.zzh(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzc() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzbxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzbxe.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbxa.this.zzg(bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhod) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhod zze = zzhoe.zze();
            int zza = zzhoc.zza(i);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            zzhnc zzc2 = zzhnf.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhna zzc3 = zzhnb.zzc();
                        zzc3.zza(zzhhb.zzs(str2));
                        zzc3.zzb(zzhhb.zzs(str3));
                        zzc2.zza((zzhnb) zzc3.zzbu());
                    }
                }
            }
            zze.zzc((zzhnf) zzc2.zzbu());
            linkedHashMap.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zza = zzgot.zza(Collections.emptyMap());
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbww
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzbxa.this.zzh((Map) obj);
                }
            };
            zzgpd zzgpdVar = zzbzh.zzg;
            ListenableFuture zzj = zzgot.zzj(zza, zzgobVar, zzgpdVar);
            ListenableFuture zzi = zzgot.zzi(zzj, 10L, TimeUnit.SECONDS, zzbzh.zzd);
            zzgot.zzq(zzj, new zzbwv(this, zzi), zzgpdVar);
            zzc.add(zzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhha zzx = zzhhb.zzx();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzx);
        synchronized (this.zzj) {
            zzhmp zzhmpVar = this.zzd;
            zzhnx zzc2 = zzhnz.zzc();
            zzc2.zzb(zzx.zza());
            zzc2.zza(MimeTypes.IMAGE_PNG);
            zzc2.zzc(2);
            zzhmpVar.zzj((zzhnz) zzc2.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzhod zzhodVar;
        ListenableFuture zzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            length = optJSONArray.length();
                            synchronized (obj) {
                                zzhodVar = (zzhod) this.zze.get(str);
                            }
                        }
                        if (zzhodVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzbxe.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzhodVar.zzd(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzgot.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgot.zza(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf((zzhoe) ((zzhod) it.next()).zzbu());
            }
            zzhmp zzhmpVar = this.zzd;
            zzhmpVar.zzl(this.zzf);
            zzhmpVar.zzm(this.zzg);
            if (zzbxe.zzb()) {
                String zza = zzhmpVar.zza();
                String zzg = zzhmpVar.zzg();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 38 + String.valueOf(zzg).length() + 15);
                sb2.append("Sending SB report\n  url: ");
                sb2.append(zza);
                sb2.append("\n  clickUrl: ");
                sb2.append(zzg);
                sb2.append("\n  resources: \n");
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                for (zzhoe zzhoeVar : zzhmpVar.zze()) {
                    sb3.append("    [");
                    sb3.append(zzhoeVar.zzd());
                    sb3.append("] ");
                    sb3.append(zzhoeVar.zzc());
                }
                zzbxe.zza(sb3.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhot) zzhmpVar.zzbu()).zzaN());
            if (zzbxe.zzb()) {
                zzb2.addListener(zzbwy.zza, zzbzh.zza);
            }
            zzk = zzgot.zzk(zzb2, zzbwx.zza, zzbzh.zzg);
        }
        return zzk;
    }
}
