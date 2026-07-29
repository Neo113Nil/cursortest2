package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzws extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzwq zzd;
    private boolean zze;

    /* synthetic */ zzws(zzwq zzwqVar, SurfaceTexture surfaceTexture, boolean z, zzwr zzwrVar) {
        super(surfaceTexture);
        this.zzd = zzwqVar;
        this.zza = z;
    }

    public static zzws zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        return new zzwq().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        String eglQueryString;
        synchronized (zzws.class) {
            if (!zzc) {
                int i2 = 2;
                if (zzeg.zza >= 24 && ((zzeg.zza >= 26 || (!"samsung".equals(zzeg.zzc) && !"XT1650".equals(zzeg.zzd))) && ((zzeg.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                    zzb = i2;
                    zzc = true;
                }
                i2 = 0;
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
