package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzccd implements zzccj {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgoc zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccg zzi;
    private final zzccf zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzccd(Context context, zzcfo zzcfoVar, zzccg zzccgVar, String str, zzccf zzccfVar, byte[] bArr) {
        Preconditions.checkNotNull(zzccgVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzccfVar;
        this.zzi = zzccgVar;
        Iterator it = zzccgVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgoc zza = zzgpa.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgod zza2 = zzgoe.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzgoe) zza2.zzaj());
        zzgoy zza3 = zzgoz.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcfoVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgoz) zza3.zzaj());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zza() {
        return this.zzi;
    }

    final /* synthetic */ zzfvj zzb(Map map) throws Exception {
        zzgow zzgowVar;
        zzfvj zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgowVar = (zzgow) this.zze.get(str);
                            }
                            if (zzgowVar == null) {
                                zzcci.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgowVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbjv.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfva.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfva.zzi(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzgox) ((zzgow) it.next()).zzaj());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzcci.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgox zzgoxVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgoxVar.zza());
                    sb.append("] ");
                    sb.append(zzgoxVar.zze());
                }
                zzcci.zza(sb.toString());
            }
            zzfvj zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgpa) this.zzd.zzaj()).zzau());
            if (zzcci.zzb()) {
                zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcci.zza("Pinged SB successfully.");
                    }
                }, zzcfv.zza);
            }
            zzm = zzfva.zzm(zzb2, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzcbz
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    int i2 = zzccd.zzb;
                    return null;
                }
            }, zzcfv.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzgow) this.zze.get(str)).zze(zzgov.zza(3));
                }
                return;
            }
            zzgow zzc2 = zzgox.zzc();
            int zza = zzgov.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgoh zza2 = zzgok.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgof zza3 = zzgog.zza();
                        zza3.zza(zzgjg.zzx(str2));
                        zza3.zzb(zzgjg.zzx(str3));
                        zza2.zza((zzgog) zza3.zzaj());
                    }
                }
            }
            zzc2.zzc((zzgok) zza2.zzaj());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfvj zzn = zzfva.zzn(zzfva.zzi(Collections.emptyMap()), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcca
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzccd.this.zzb((Map) obj);
                }
            }, zzcfv.zzf);
            zzfvj zzo = zzfva.zzo(zzn, 10L, TimeUnit.SECONDS, zzcfv.zzd);
            zzfva.zzr(zzn, new zzccc(this, zzo), zzcfv.zzf);
            zzc.add(zzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgjd zzt = zzgjg.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgoc zzgocVar = this.zzd;
            zzgop zza = zzgor.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgocVar.zzi((zzgor) zza.zzaj());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzccj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
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
                    com.google.android.gms.ads.internal.util.zze.zzh("Fail to capture the web view", e);
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
                        com.google.android.gms.ads.internal.util.zze.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzcci.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzccd.this.zzf(bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
