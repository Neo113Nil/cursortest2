package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.dagger.Names;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
final class zzgsr {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgtj zzc = new zzgtj("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    @VisibleForTesting
    final zzgti zza;
    private final String zze;

    zzgsr(Context context) {
        if (zzgtl.zza(context)) {
            this.zza = new zzgti(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgsc.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgvb.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgsq zzgsqVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgsqVar.zza(str.trim());
    }

    private static boolean zzj(zzgsw zzgswVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgsu zze = zzgsv.zze();
        zze.zzc(0);
        zze.zza(8160);
        zzgswVar.zza(zze.zze());
        return false;
    }

    final void zza(final zzgst zzgstVar, final zzgsw zzgswVar) {
        zzgti zzgtiVar = this.zza;
        if (zzgtiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgswVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgstVar.zzb()))) {
            zzgtiVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgso
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgsr.this.zze(zzgstVar, zzgswVar);
                }
            });
        }
    }

    final void zzb(final zzgry zzgryVar, final zzgsw zzgswVar) {
        zzgti zzgtiVar = this.zza;
        if (zzgtiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgswVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgryVar.zza(), zzgryVar.zzb()))) {
            zzgtiVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgsr.this.zzf(zzgryVar, zzgswVar);
                }
            });
        }
    }

    final void zzc(final zzgsy zzgsyVar, final zzgsw zzgswVar, final int i) {
        zzgti zzgtiVar = this.zza;
        if (zzgtiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgswVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgsyVar.zza(), zzgsyVar.zzb()))) {
            zzgtiVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgsr.this.zzg(zzgsyVar, i, zzgswVar);
                }
            });
        }
    }

    final void zzd() {
        zzgti zzgtiVar = this.zza;
        if (zzgtiVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgtiVar.zzb();
    }

    final /* synthetic */ void zze(zzgst zzgstVar, zzgsw zzgswVar) {
        try {
            zzgti zzgtiVar = this.zza;
            if (zzgtiVar == null) {
                throw null;
            }
            zzgrm zzgrmVar = (zzgrm) zzgtiVar.zzc();
            if (zzgrmVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgstVar.zza());
            zzi(zzgstVar.zzk(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsg
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgstVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgstVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt(Names.THEME, 0);
            bundle.putInt("windowWidthPx", zzgstVar.zzi());
            zzi(null, new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsh
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsi
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgstVar.zzb(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsj
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzi(null, new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsk
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgrmVar.zze(str, bundle, new zzgsp(this, zzgswVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzf(zzgry zzgryVar, zzgsw zzgswVar) {
        try {
            zzgti zzgtiVar = this.zza;
            if (zzgtiVar == null) {
                throw null;
            }
            zzgrm zzgrmVar = (zzgrm) zzgtiVar.zzc();
            if (zzgrmVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgryVar.zza(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsl
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgryVar.zzb(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsm
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgsr.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgrmVar.zzf(bundle, new zzgsp(this, zzgswVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzg(zzgsy zzgsyVar, int i, zzgsw zzgswVar) {
        try {
            zzgti zzgtiVar = this.zza;
            if (zzgtiVar == null) {
                throw null;
            }
            zzgrm zzgrmVar = (zzgrm) zzgtiVar.zzc();
            if (zzgrmVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzgsyVar.zza(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgsn
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgsr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgsyVar.zzb(), new zzgsq() { // from class: com.google.android.gms.internal.ads.zzgse
                @Override // com.google.android.gms.internal.ads.zzgsq
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgsr.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgrmVar.zzg(bundle, new zzgsp(this, zzgswVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }
}
