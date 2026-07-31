package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdip extends zzcqs {
    public static final zzgjz zzc = zzgjz.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdiu zze;
    private final zzdjc zzf;
    private final zzdjt zzg;
    private final zzdiz zzh;
    private final zzdje zzi;
    private final zzhpr zzj;
    private final zzhpr zzk;
    private final zzhpr zzl;
    private final zzhpr zzm;
    private final zzhpr zzn;
    private zzdkr zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbxo zzt;
    private final zzauu zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdir zzx;
    private final zzell zzy;
    private final Map zzz;

    public zzdip(zzcqr zzcqrVar, Executor executor, zzdiu zzdiuVar, zzdjc zzdjcVar, zzdjt zzdjtVar, zzdiz zzdizVar, zzdje zzdjeVar, zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzhpr zzhprVar4, zzhpr zzhprVar5, zzbxo zzbxoVar, zzauu zzauuVar, VersionInfoParcel versionInfoParcel, Context context, zzdir zzdirVar, zzell zzellVar, zzayl zzaylVar) {
        super(zzcqrVar);
        this.zzd = executor;
        this.zze = zzdiuVar;
        this.zzf = zzdjcVar;
        this.zzg = zzdjtVar;
        this.zzh = zzdizVar;
        this.zzi = zzdjeVar;
        this.zzj = zzhprVar;
        this.zzk = zzhprVar2;
        this.zzl = zzhprVar3;
        this.zzm = zzhprVar4;
        this.zzn = zzhprVar5;
        this.zzt = zzbxoVar;
        this.zzu = zzauuVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdirVar;
        this.zzy = zzellVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlt)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzA >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlu)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdkr zzdkrVar) {
        Iterator<String> keys;
        View view;
        zzaup zzb;
        if (!this.zzp) {
            this.zzo = zzdkrVar;
            this.zzg.zza(zzdkrVar);
            this.zzf.zza(zzdkrVar.zzdJ(), zzdkrVar.zzk(), zzdkrVar.zzl(), zzdkrVar, zzdkrVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcV)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                zzb.zzh(zzdkrVar.zzdJ());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbX)).booleanValue()) {
                zzfcj zzfcjVar = this.zzb;
                if (zzfcjVar.zzak && (keys = zzfcjVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zzdkr zzdkrVar2 = this.zzo;
                        WeakReference weakReference = zzdkrVar2 == null ? null : (WeakReference) zzdkrVar2.zzj().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzayk zzaykVar = new zzayk(this.zzw, view);
                            this.zzA.add(zzaykVar);
                            zzaykVar.zza(new zzdie(this, next));
                        }
                    }
                }
            }
            if (zzdkrVar.zzh() != null) {
                zzdkrVar.zzh().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdkr zzdkrVar) {
        this.zzf.zzb(zzdkrVar.zzdJ(), zzdkrVar.zzj());
        if (zzdkrVar.zzdF() != null) {
            zzdkrVar.zzdF().setClickable(false);
            zzdkrVar.zzdF().removeAllViews();
        }
        if (zzdkrVar.zzh() != null) {
            zzdkrVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzon)).booleanValue()) {
                Rect rect = new Rect();
                if (zzag.getGlobalVisibleRect(rect, new Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoo)).booleanValue()) {
                zzbbz zzbbzVar = zzbci.zzop;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgjz zzgjzVar = zzc;
            int size = zzgjzVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgjzVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzo = zzdkrVar.zzo();
        if (zzo != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzo);
        }
        return zzdjt.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        zzgot.zzq(zzX, new zzdif(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzedu zzeduVar) {
        zzcek zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzeduVar == null || zzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzeduVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzr(zzdjVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzs(zzdfVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdkrVar instanceof zzdjn;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdip.this.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmp)).booleanValue()) {
            zzdkr zzdkrVar = this.zzo;
            if (zzdkrVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdkrVar instanceof zzdjn;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdip.this.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzedu zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzedq zzedqVar;
        zzedr zzedrVar;
        zzdiz zzdizVar = this.zzh;
        if (zzdizVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdiu zzdiuVar = this.zze;
            zzcek zzW = zzdiuVar.zzW();
            zzcek zzT = zzdiuVar.zzT();
            if (zzW == null && zzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdizVar.zzg();
            int zzc2 = zzdizVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL;
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzW = zzT;
            }
            if (zzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            String sb4 = sb3.toString();
            if (z2) {
                zzedqVar = zzedq.VIDEO;
                zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
            } else {
                zzedqVar = zzedq.NATIVE_DISPLAY;
                zzedrVar = zzdiuVar.zzx() == 3 ? zzedr.UNSPECIFIED : zzedr.ONE_PIXEL;
            }
            zzedu zzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzedrVar, zzedqVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdiuVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                zzflj zza = zzd.zza();
                if (zzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzx() != 3) {
                zzbzm zzY = zzdiuVar.zzY();
                if (zzY == null) {
                    return;
                }
                zzgot.zzq(zzY, new zzdig(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzedu zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzZ.zza(), view);
    }

    public final zzdir zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcek zzT = this.zze.zzT();
        if (zzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgjz zzgjzVar = zzdip.zzc;
                    zzcek.this.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(null, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdkr zzdkrVar = this.zzo;
        if (zzdkrVar != null) {
            this.zzf.zzf(view, zzdkrVar.zzdJ(), this.zzo.zzj(), this.zzo.zzk(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdiu zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdkr zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdip.this.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdkr zzdkrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdii
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdip.this.zzU(zzdkrVar);
                }
            });
        } else {
            zzU(zzdkrVar);
        }
    }

    public final synchronized void zzh(final zzdkr zzdkrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdip.this.zzV(zzdkrVar);
                }
            });
        } else {
            zzV(zzdkrVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzcek zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdiu zzdiuVar = this.zze;
            if (zzdiuVar.zzT() != null && (zzT = zzdiuVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqs
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdip.this.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdjc zzdjcVar = this.zzf;
            Objects.requireNonNull(zzdjcVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdjc.this.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbX)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) map3.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            zzae(view, map, map2);
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzep)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && zzI(view2)) {
                    zzae(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbhn zzbhnVar) {
        this.zzf.zzp(zzbhnVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdiu zzdiuVar = this.zze;
            int zzx = zzdiuVar.zzx();
            if (zzx == 1) {
                zzbgx zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((zzbgn) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                zzbgu zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((zzbgl) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                zzbhd zzf = this.zzi.zzf(zzdiuVar.zzS());
                if (zzf != null) {
                    if (zzdiuVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((zzbgq) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                zzbhk zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((zzbhq) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbmf zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((zzblz) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
