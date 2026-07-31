package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcea implements zzcef {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzijq zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcec zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcea(Context context, VersionInfoParcel versionInfoParcel, zzcec zzcecVar, @Nullable String str, zzceb zzcebVar) {
        Preconditions.checkNotNull(zzcecVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzcecVar;
        Iterator it = zzcecVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzijq zzg = zzilp.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        zzijr zzc2 = zzijs.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((zzijs) zzc2.zzbu());
        zzilb zzc3 = zzilc.zzc();
        zzc3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc3.zzb(apkVersion);
        }
        zzg.zzk((zzilc) zzc3.zzbu());
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final zzcec zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzcef
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
                zzcee.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcea.this.zzg(bitmap2);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcgj.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzikz) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzikz zze = zzila.zze();
            int zza = zziky.zza(i);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            zzikd zzc2 = zzikg.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzikb zzc3 = zzikc.zzc();
                        zzc3.zza(zziei.zzx(str2));
                        zzc3.zzb(zziei.zzx(str3));
                        zzc2.zza((zzikc) zzc3.zzbu());
                    }
                }
            }
            zze.zzc((zzikg) zzc2.zzbu());
            linkedHashMap.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcef
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zza = zzhcy.zza(Collections.emptyMap());
            zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzcdw
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzcea.this.zzh((Map) obj);
                }
            };
            zzhdi zzhdiVar = zzcgj.zzh;
            ListenableFuture zzj = zzhcy.zzj(zza, zzhcgVar, zzhdiVar);
            ListenableFuture zzi = zzhcy.zzi(zzj, 10L, TimeUnit.SECONDS, zzcgj.zzd);
            zzhcy.zzr(zzj, new zzcdv(this, zzi), zzhdiVar);
            zzc.add(zzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zzieh zzC = zziei.zzC();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzC);
        synchronized (this.zzj) {
            zzijq zzijqVar = this.zzd;
            zzikt zzc2 = zzikv.zzc();
            zzc2.zzb(zzC.zza());
            zzc2.zza("image/png");
            zzc2.zzc(2);
            zzijqVar.zzj((zzikv) zzc2.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzikz zzikzVar;
        ListenableFuture zzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = optJSONArray.length();
                                synchronized (obj) {
                                    zzikzVar = (zzikz) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzikzVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzcee.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzikzVar.zzd(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzblp.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzhcy.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzhcy.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzila) ((zzikz) it.next()).zzbu());
                }
                zzijq zzijqVar = this.zzd;
                zzijqVar.zzl(this.zzf);
                zzijqVar.zzm(this.zzg);
                if (zzcee.zzb()) {
                    String zza = zzijqVar.zza();
                    String zzg = zzijqVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 38 + String.valueOf(zzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(zza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(zzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzila zzilaVar : zzijqVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzilaVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzilaVar.zzc());
                    }
                    zzcee.zza(sb3.toString());
                }
                ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzilp) zzijqVar.zzbu()).zzaN());
                if (zzcee.zzb()) {
                    zzb2.addListener(zzcdy.zza, zzcgj.zza);
                }
                zzk = zzhcy.zzk(zzb2, zzcdx.zza, zzcgj.zzh);
            } finally {
            }
        }
        return zzk;
    }
}
