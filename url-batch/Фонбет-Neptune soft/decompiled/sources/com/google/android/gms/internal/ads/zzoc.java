package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzoc {
    public static zzof zza(AudioManager audioManager, zzh zzhVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzhVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgap.zzg(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile m290m = zznv$$ExternalSyntheticApiModelOutline1.m290m(directProfilesForAttributes.get(i));
            encapsulationType = m290m.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m290m.getFormat();
                if (zzet.zzK(format) || zzof.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = m290m.getChannelMasks();
                        set.addAll(zzgap.zzg(channelMasks2));
                    } else {
                        channelMasks = m290m.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgap.zzg(channelMasks)));
                    }
                }
            }
        }
        zzfxo zzfxoVar = new zzfxo();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfxoVar.zzf(new zzod(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzof(zzfxoVar.zzi());
    }

    public static zzon zzb(AudioManager audioManager, zzh zzhVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzhVar.zza().zza);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new zzon(zznv$$ExternalSyntheticApiModelOutline1.m(audioDevicesForAttributes.get(0)));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
