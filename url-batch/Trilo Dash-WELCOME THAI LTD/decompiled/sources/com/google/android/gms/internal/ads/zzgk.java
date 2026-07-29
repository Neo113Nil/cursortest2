package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgk {
    private final AudioManager zza;
    private final zzgi zzb;
    private zzgj zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgk(Context context, Handler handler, zzgj zzgjVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgjVar;
        this.zzb = new zzgi(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzeg.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzah;
        zzgj zzgjVar = this.zzc;
        if (zzgjVar != null) {
            zzij zzijVar = (zzij) zzgjVar;
            boolean zzq = zzijVar.zza.zzq();
            zzin zzinVar = zzijVar.zza;
            zzah = zzin.zzah(zzq, i);
            zzinVar.zzau(zzq, i, zzah);
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
        zzgj zzgjVar = this.zzc;
        if (zzgjVar != null) {
            ((zzij) zzgjVar).zza.zzar();
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

    static /* bridge */ /* synthetic */ void zzc(zzgk zzgkVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgkVar.zzg(3);
                return;
            } else {
                zzgkVar.zzf(0);
                zzgkVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzgkVar.zzf(-1);
            zzgkVar.zze();
        } else if (i == 1) {
            zzgkVar.zzg(1);
            zzgkVar.zzf(1);
        } else {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
