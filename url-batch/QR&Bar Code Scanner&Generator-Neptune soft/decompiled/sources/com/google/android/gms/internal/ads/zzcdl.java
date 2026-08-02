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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcdl implements zzcdq {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzguz zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcdn zzi;
    private final zzcdm zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcdl(Context context, zzcgv zzcgvVar, zzcdn zzcdnVar, String str, zzcdm zzcdmVar, byte[] bArr) {
        Preconditions.checkNotNull(zzcdnVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcdmVar;
        this.zzi = zzcdnVar;
        Iterator it = zzcdnVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzguz zza = zzgwe.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgva zza2 = zzgvb.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzgvb) zza2.zzam());
        zzgvz zza3 = zzgwa.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcgvVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgwa) zza3.zzam());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzcdn zza() {
        return this.zzi;
    }

    final /* synthetic */ zzfzp zzb(Map map) throws Exception {
        zzgvx zzgvxVar;
        zzfzp zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgvxVar = (zzgvx) this.zze.get(str);
                            }
                            if (zzgvxVar == null) {
                                zzcdp.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgvxVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbkz.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfzg.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfzg.zzi(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzgvy) ((zzgvx) it.next()).zzam());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzcdp.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgvy zzgvyVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgvyVar.zza());
                    sb.append("] ");
                    sb.append(zzgvyVar.zze());
                }
                zzcdp.zza(sb.toString());
            }
            zzfzp zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgwe) this.zzd.zzam()).zzax());
            if (zzcdp.zzb()) {
                zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcdp.zza("Pinged SB successfully.");
                    }
                }, zzchc.zza);
            }
            zzm = zzfzg.zzm(zzb2, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzcdh
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    int i2 = zzcdl.zzb;
                    return null;
                }
            }, zzchc.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzgvx) this.zze.get(str)).zze(zzgvw.zza(3));
                }
                return;
            }
            zzgvx zzc2 = zzgvy.zzc();
            int zza = zzgvw.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgvi zza2 = zzgvl.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgvg zza3 = zzgvh.zza();
                        zza3.zza(zzgpw.zzx(str2));
                        zza3.zzb(zzgpw.zzx(str3));
                        zza2.zza((zzgvh) zza3.zzam());
                    }
                }
            }
            zzc2.zzc((zzgvl) zza2.zzam());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfzp zzn = zzfzg.zzn(zzfzg.zzi(Collections.emptyMap()), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzcdi
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return zzcdl.this.zzb((Map) obj);
                }
            }, zzchc.zzf);
            zzfzp zzo = zzfzg.zzo(zzn, 10L, TimeUnit.SECONDS, zzchc.zzd);
            zzfzg.zzr(zzn, new zzcdk(this, zzo), zzchc.zzf);
            zzc.add(zzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgpt zzt = zzgpw.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzguz zzguzVar = this.zzd;
            zzgvq zza = zzgvs.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzguzVar.zzi((zzgvs) zza.zzam());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzcdq
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
                zzcdp.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcdl.this.zzf(bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
