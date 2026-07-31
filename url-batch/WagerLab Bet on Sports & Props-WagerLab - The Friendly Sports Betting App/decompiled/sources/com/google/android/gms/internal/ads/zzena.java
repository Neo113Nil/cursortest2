package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.amazon.a.a.o.b.f;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzena implements zzeup {
    private final zzeup zza;
    private final zzfdc zzb;
    private final Context zzc;
    private final zzbyv zzd;

    zzena(zzepd zzepdVar, zzfdc zzfdcVar, Context context, zzbyv zzbyvVar) {
        this.zza = zzepdVar;
        this.zzb = zzfdcVar;
        this.zzc = context;
        this.zzd = zzbyvVar;
    }

    private final Insets zzd(float f) {
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        if (f == 0.0f) {
            return Insets.NONE;
        }
        Insets insets = Insets.NONE;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.zzc.getSystemService("window");
            if (windowManager != null) {
                insets = Insets.toCompatInsets(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (zzd != null && (window = zzd.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
                insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            }
        }
        return Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zzk(this.zza.zza(), new zzggr() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return zzena.this.zzc((zzeuy) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 7;
    }

    final /* synthetic */ zzenb zzc(zzeuy zzeuyVar) {
        String str;
        boolean z;
        int i;
        String str2;
        float f;
        int i2;
        int i3;
        WindowManager windowManager;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzfdc zzfdcVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfdcVar.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z4 = zzrVar2.zzi;
                if (!z4 && !z2) {
                    str = zzrVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z = true;
                    }
                    z3 = true;
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
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i = 0;
            str2 = null;
            f = 0.0f;
            i2 = 0;
        } else {
            zzbyv zzbyvVar = this.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = zzbyvVar.zzo().zzu();
        }
        Insets zzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoe)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : zzd(f);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzof)).booleanValue() && Build.VERSION.SDK_INT <= 34 && Build.VERSION.SDK_INT >= 28 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                i4 = currentWindowMetrics.getBounds().width();
                i5 = currentWindowMetrics.getBounds().height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                i4 = point.x;
                i5 = point.y;
            }
            i = i5;
            i2 = i4;
            zzd = zzd(f);
        }
        int i6 = i;
        StringBuilder sb = new StringBuilder();
        if (zzrVarArr != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr) {
                if (zzrVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append(f.c);
                    }
                    int i7 = zzrVar3.zze;
                    if (i7 == -1) {
                        i7 = f != 0.0f ? (int) (zzrVar3.zzf / f) : -1;
                    }
                    sb.append(i7);
                    sb.append("x");
                    int i8 = zzrVar3.zzb;
                    if (i8 == -2) {
                        i8 = f != 0.0f ? (int) (zzrVar3.zzc / f) : -2;
                    }
                    sb.append(i8);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, f.c);
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzenb(zzrVar, str, z, sb.toString(), f, i2, i6, str2, zzfdcVar.zzr, zzd);
    }
}
