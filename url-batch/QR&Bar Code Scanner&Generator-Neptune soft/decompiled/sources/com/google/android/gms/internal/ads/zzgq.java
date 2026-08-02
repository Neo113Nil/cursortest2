package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgq {
    private final AudioManager zza;
    private final zzgo zzb;
    private zzgp zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgq(Context context, Handler handler, zzgp zzgpVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgpVar;
        this.zzb = new zzgo(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzen.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzah;
        zzgp zzgpVar = this.zzc;
        if (zzgpVar != null) {
            zzip zzipVar = (zzip) zzgpVar;
            boolean zzq = zzipVar.zza.zzq();
            zzit zzitVar = zzipVar.zza;
            zzah = zzit.zzah(zzq, i);
            zzitVar.zzau(zzq, i, zzah);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzgp zzgpVar = this.zzc;
        if (zzgpVar != null) {
            ((zzip) zzgpVar).zza.zzar();
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

    static /* bridge */ /* synthetic */ void zzc(zzgq zzgqVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgqVar.zzg(3);
                return;
            } else {
                zzgqVar.zzf(0);
                zzgqVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzgqVar.zzf(-1);
            zzgqVar.zze();
        } else if (i == 1) {
            zzgqVar.zzg(1);
            zzgqVar.zzf(1);
        } else {
            zzdw.zze("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
