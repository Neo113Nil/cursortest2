package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.m;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevt implements zzfdi {
    private final zzfdi zza;
    private final zzflw zzb;
    private final Context zzc;
    private final zzcfv zzd;

    zzevt(zzexw zzexwVar, zzflw zzflwVar, Context context, zzcfv zzcfvVar) {
        this.zza = zzexwVar;
        this.zzb = zzflwVar;
        this.zzc = context;
        this.zzd = zzcfvVar;
    }

    @RequiresApi
    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner == null) {
            return 0;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zzk(this.zza.zza(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzevt.this.zzc((zzfdr) obj);
            }
        }, zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevu zzc(zzfdr zzfdrVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        float f;
        String str2;
        zzbix zzbixVar;
        int i4;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr;
        int i5;
        String str3;
        int i6;
        String str4;
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        Insets zzf;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int statusBars;
        int displayCutout;
        int navigationBars;
        int captionBar;
        android.graphics.Insets insets;
        Insets insets2;
        zzevr zzevrVar;
        WindowManager windowManager;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets2;
        WindowManager windowManager2;
        WindowMetrics currentWindowMetrics3;
        WindowInsets windowInsets3;
        int displayCutout2;
        android.graphics.Insets insets3;
        WindowManager windowManager3;
        WindowMetrics currentWindowMetrics4;
        WindowInsets windowInsets4;
        int statusBars2;
        int displayCutout3;
        int navigationBars2;
        int captionBar2;
        android.graphics.Insets insets4;
        WindowMetrics currentWindowMetrics5;
        Rect bounds;
        Rect bounds2;
        DisplayMetrics displayMetrics;
        int i7;
        int i8;
        WindowManager windowManager4;
        WindowMetrics currentWindowMetrics6;
        Rect bounds3;
        Rect bounds4;
        DisplayMetrics displayMetrics2;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            str = null;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr2) {
                boolean z4 = zzrVar2.zzi;
                if (!z4 && !z2) {
                    str = zzrVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z = zzrVar.zzi;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpn)).booleanValue()) {
                try {
                    i = context.getPackageManager().getActivityInfo(zzd.getComponentName(), 0).screenOrientation;
                } catch (PackageManager.NameNotFoundException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdSizeParcelSignal.Source.readOrientationFromManifest");
                }
                if (resources != null || (displayMetrics2 = resources.getDisplayMetrics()) == null) {
                    i2 = 0;
                    i3 = 0;
                    f = 0.0f;
                    str2 = null;
                } else {
                    zzcfv zzcfvVar = this.zzd;
                    float f2 = displayMetrics2.density;
                    i3 = displayMetrics2.widthPixels;
                    i2 = displayMetrics2.heightPixels;
                    str2 = zzcfvVar.zzp().zzu();
                    f = f2;
                }
                zzbixVar = zzbjg.zzpk;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && (i8 = Build.VERSION.SDK_INT) <= 34 && i8 >= 28 && (windowManager4 = (WindowManager) this.zzc.getSystemService("window")) != null) {
                    if (i8 < 30) {
                        currentWindowMetrics6 = windowManager4.getCurrentWindowMetrics();
                        bounds3 = currentWindowMetrics6.getBounds();
                        int width = bounds3.width();
                        bounds4 = currentWindowMetrics6.getBounds();
                        i4 = bounds4.height();
                        i3 = width;
                        StringBuilder sb = new StringBuilder();
                        zzrVarArr = zzrVar.zzg;
                        if (zzrVarArr != null) {
                            int i9 = 0;
                            boolean z5 = false;
                            while (i9 < zzrVarArr.length) {
                                com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr[i9];
                                com.google.android.gms.ads.internal.client.zzr[] zzrVarArr3 = zzrVarArr;
                                if (zzrVar3.zzi) {
                                    z5 = true;
                                } else {
                                    if (sb.length() != 0) {
                                        sb.append(m.ad);
                                    }
                                    int i10 = zzrVar3.zze;
                                    if (i10 == -1) {
                                        i10 = f != 0.0f ? (int) (zzrVar3.zzf / f) : -1;
                                    }
                                    sb.append(i10);
                                    sb.append(VastAttributes.HORIZONTAL_POSITION);
                                    int i11 = zzrVar3.zzb;
                                    if (i11 == -2) {
                                        i11 = f != 0.0f ? (int) (zzrVar3.zzc / f) : -2;
                                    }
                                    sb.append(i11);
                                }
                                i9++;
                                zzrVarArr = zzrVarArr3;
                            }
                            if (z5) {
                                if (sb.length() != 0) {
                                    i7 = 0;
                                    sb.insert(0, m.ad);
                                } else {
                                    i7 = 0;
                                }
                                sb.insert(i7, "320x50");
                            }
                        }
                        String sb2 = sb.toString();
                        zzflw zzflwVar = this.zzb;
                        i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 35) {
                            zzbix zzbixVar2 = zzbjg.zzpe;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar2)).booleanValue()) {
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpf)).booleanValue()) {
                                    str3 = sb2;
                                    i6 = i;
                                    str4 = str2;
                                    insets2 = null;
                                }
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpi)).booleanValue()) {
                                Context context2 = this.zzc;
                                WindowManager windowManager5 = (WindowManager) context2.getSystemService("window");
                                if (windowManager5 != null) {
                                    i6 = i;
                                    if (i5 >= 30) {
                                        currentWindowMetrics5 = windowManager5.getCurrentWindowMetrics();
                                        bounds = currentWindowMetrics5.getBounds();
                                        int width2 = bounds.width();
                                        bounds2 = currentWindowMetrics5.getBounds();
                                        int height = bounds2.height();
                                        Resources resources2 = context2.getResources();
                                        if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
                                            str4 = str2;
                                            int i12 = displayMetrics.widthPixels;
                                            int i13 = displayMetrics.heightPixels;
                                            if (width2 > i12 || height > i13) {
                                                str3 = sb2;
                                                insets2 = null;
                                            }
                                            Context context3 = this.zzc;
                                            Insets insets5 = Insets.NONE;
                                            windowManager2 = (WindowManager) context3.getSystemService("window");
                                            if (windowManager2 != null) {
                                                currentWindowMetrics3 = windowManager2.getCurrentWindowMetrics();
                                                windowInsets3 = currentWindowMetrics3.getWindowInsets();
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar2)).booleanValue()) {
                                                    statusBars2 = WindowInsets.Type.statusBars();
                                                    displayCutout3 = WindowInsets.Type.displayCutout();
                                                    int i14 = statusBars2 | displayCutout3;
                                                    navigationBars2 = WindowInsets.Type.navigationBars();
                                                    int i15 = i14 | navigationBars2;
                                                    captionBar2 = WindowInsets.Type.captionBar();
                                                    insets4 = windowInsets3.getInsets(i15 | captionBar2);
                                                    insets5 = Insets.toCompatInsets(insets4);
                                                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpf)).booleanValue()) {
                                                    displayCutout2 = WindowInsets.Type.displayCutout();
                                                    insets3 = windowInsets3.getInsets(displayCutout2);
                                                    insets5 = Insets.toCompatInsets(insets3);
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpg)).booleanValue() && (windowManager3 = (WindowManager) context3.getSystemService("window")) != null) {
                                                        currentWindowMetrics4 = windowManager3.getCurrentWindowMetrics();
                                                        windowInsets4 = currentWindowMetrics4.getWindowInsets();
                                                        int zzd2 = zzd(windowInsets4, 0);
                                                        int zzd3 = zzd(windowInsets4, 1);
                                                        str3 = sb2;
                                                        int zzd4 = zzd(windowInsets4, 3);
                                                        int zzd5 = zzd(windowInsets4, 2);
                                                        insets5 = i4 >= i3 ? Insets.of(insets5.left, Math.max(insets5.top, Math.max(zzd2, zzd3)), insets5.right, Math.max(insets5.bottom, Math.max(zzd4, zzd5))) : Insets.of(Math.max(insets5.left, Math.max(zzd2, zzd4)), insets5.top, Math.max(insets5.right, Math.max(zzd3, zzd5)), insets5.bottom);
                                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue() && i4 < i3) {
                                                            int max = Math.max(insets5.left, insets5.right);
                                                            insets5 = Insets.of(max, insets5.top, max, insets5.bottom);
                                                        }
                                                        zzf = zzf(insets5, f);
                                                        insets2 = zzf;
                                                    }
                                                }
                                            }
                                            str3 = sb2;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue()) {
                                                int max2 = Math.max(insets5.left, insets5.right);
                                                insets5 = Insets.of(max2, insets5.top, max2, insets5.bottom);
                                            }
                                            zzf = zzf(insets5, f);
                                            insets2 = zzf;
                                        }
                                    }
                                    str4 = str2;
                                    Context context32 = this.zzc;
                                    Insets insets52 = Insets.NONE;
                                    windowManager2 = (WindowManager) context32.getSystemService("window");
                                    if (windowManager2 != null) {
                                    }
                                    str3 = sb2;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue()) {
                                    }
                                    zzf = zzf(insets52, f);
                                    insets2 = zzf;
                                }
                            }
                            i6 = i;
                            str4 = str2;
                            Context context322 = this.zzc;
                            Insets insets522 = Insets.NONE;
                            windowManager2 = (WindowManager) context322.getSystemService("window");
                            if (windowManager2 != null) {
                            }
                            str3 = sb2;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue()) {
                            }
                            zzf = zzf(insets522, f);
                            insets2 = zzf;
                        } else {
                            str3 = sb2;
                            i6 = i;
                            str4 = str2;
                            if (i5 <= 34 && i5 >= 28 && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                                Insets insets6 = Insets.NONE;
                                if (i5 >= 30) {
                                    WindowManager windowManager6 = (WindowManager) this.zzc.getSystemService("window");
                                    if (windowManager6 != null) {
                                        currentWindowMetrics = windowManager6.getCurrentWindowMetrics();
                                        windowInsets = currentWindowMetrics.getWindowInsets();
                                        statusBars = WindowInsets.Type.statusBars();
                                        displayCutout = WindowInsets.Type.displayCutout();
                                        int i16 = statusBars | displayCutout;
                                        navigationBars = WindowInsets.Type.navigationBars();
                                        int i17 = i16 | navigationBars;
                                        captionBar = WindowInsets.Type.captionBar();
                                        insets = windowInsets.getInsets(i17 | captionBar);
                                        insets6 = Insets.toCompatInsets(insets);
                                    }
                                } else {
                                    Activity zzd6 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                                    if (zzd6 != null && (window = zzd6.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
                                        insets6 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                                    }
                                }
                                zzf = zzf(insets6, f);
                                insets2 = zzf;
                            }
                            insets2 = null;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpj)).booleanValue() || i5 < 31 || f == 0.0f || (windowManager = (WindowManager) this.zzc.getSystemService("window")) == null) {
                            zzevrVar = null;
                        } else {
                            currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
                            windowInsets2 = currentWindowMetrics2.getWindowInsets();
                            zzevrVar = new zzevr(zze(zzd(windowInsets2, 0), f), zze(zzd(windowInsets2, 1), f), zze(zzd(windowInsets2, 3), f), zze(zzd(windowInsets2, 2), f));
                        }
                        return new zzevu(zzrVar, str, z, str3, f, i3, i4, str4, i6, zzflwVar.zzr, insets2, zzevrVar);
                    }
                    Point point = new Point();
                    windowManager4.getDefaultDisplay().getRealSize(point);
                    int i18 = point.x;
                    i2 = point.y;
                    i3 = i18;
                }
                i4 = i2;
                StringBuilder sb3 = new StringBuilder();
                zzrVarArr = zzrVar.zzg;
                if (zzrVarArr != null) {
                }
                String sb22 = sb3.toString();
                zzflw zzflwVar2 = this.zzb;
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 35) {
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpj)).booleanValue()) {
                }
                zzevrVar = null;
                return new zzevu(zzrVar, str, z, str3, f, i3, i4, str4, i6, zzflwVar2.zzr, insets2, zzevrVar);
            }
        }
        i = -1;
        if (resources != null) {
        }
        i2 = 0;
        i3 = 0;
        f = 0.0f;
        str2 = null;
        zzbixVar = zzbjg.zzpk;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            if (i8 < 30) {
            }
        }
        i4 = i2;
        StringBuilder sb32 = new StringBuilder();
        zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
        }
        String sb222 = sb32.toString();
        zzflw zzflwVar22 = this.zzb;
        i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpj)).booleanValue()) {
        }
        zzevrVar = null;
        return new zzevu(zzrVar, str, z, str3, f, i3, i4, str4, i6, zzflwVar22.zzr, insets2, zzevrVar);
    }
}
