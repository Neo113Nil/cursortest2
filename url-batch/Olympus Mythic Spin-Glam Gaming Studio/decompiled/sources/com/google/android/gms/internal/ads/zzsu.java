package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes5.dex */
final class zzsu {
    private final AudioTrack zza;
    private final zzsq zzb;
    private final Handler zzc;

    @Nullable
    private AudioRouting.OnRoutingChangedListener zzd;

    /* synthetic */ zzsu(AudioTrack audioTrack, zzsq zzsqVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzb = zzsqVar;
        Handler zzd = zzfm.zzd(null);
        this.zzc = zzd;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzst
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                zzsu.this.zza(audioRouting);
            }
        };
        this.zzd = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, zzd);
    }

    final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzd == null) {
            return;
        }
        zzdi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzsu.this.zzb(audioRouting);
            }
        });
    }

    final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzsu.this.zzc(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzd == null) {
            return;
        }
        zzti zztiVar = ((zzth) this.zzb).zza;
        if (zztiVar.zzj() != null) {
            zztiVar.zzj().zzc(audioDeviceInfo);
        }
    }

    final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzd;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzd = null;
    }
}
