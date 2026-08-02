package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhl {
    private final AudioManager zza;
    private final zzhj zzb;
    private zzhk zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhl(Context context, Handler handler, zzhk zzhkVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzhkVar;
        this.zzb = new zzhj(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzet.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzS;
        zzhk zzhkVar = this.zzc;
        if (zzhkVar != null) {
            zzji zzjiVar = (zzji) zzhkVar;
            boolean zzu = zzjiVar.zza.zzu();
            zzS = zzjm.zzS(zzu, i);
            zzjiVar.zza.zzaf(zzu, i, zzS);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze != f) {
            this.zze = f;
            zzhk zzhkVar = this.zzc;
            if (zzhkVar != null) {
                ((zzji) zzhkVar).zza.zzac();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzhl zzhlVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzhlVar.zzg(3);
                return;
            } else {
                zzhlVar.zzf(0);
                zzhlVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzhlVar.zzf(-1);
            zzhlVar.zze();
        } else if (i == 1) {
            zzhlVar.zzg(1);
            zzhlVar.zzf(1);
        } else {
            zzea.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
