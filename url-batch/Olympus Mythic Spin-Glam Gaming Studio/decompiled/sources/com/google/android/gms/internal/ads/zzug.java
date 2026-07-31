package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.audio.AudioCapabilities$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzug {
    private static final zzgxm zza = zzgxm.zzj(12);

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0175, code lost:
    
        if (r0.isEmpty() != false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgxm zza(AudioDeviceInfo audioDeviceInfo) {
        int type;
        List audioDescriptors;
        zzgxm zzi;
        int standard;
        byte[] descriptor;
        List audioDescriptors2;
        int speakerLayoutChannelMask;
        if (!zztz.zza(audioDeviceInfo.getType())) {
            if (audioDeviceInfo.getType() == 1) {
                return zzgxm.zzj(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return zzgxm.zzj(Integer.valueOf(speakerLayoutChannelMask));
                }
                zzeh.zzc("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return zza;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                zzi = zzb(audioDeviceInfo);
                if (zzi.isEmpty()) {
                    audioDescriptors2 = audioDeviceInfo.getAudioDescriptors();
                    zzgxm zza2 = zzqu.zza(audioDescriptors2);
                    if (!zza2.isEmpty()) {
                        return zza2;
                    }
                }
                return zzi;
            }
            if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    zzgxm zzb = zzb(audioDeviceInfo);
                    if (!zzb.isEmpty()) {
                        return zzb;
                    }
                    audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            zzi = zzgxm.zzi();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor m = zzqu$$ExternalSyntheticApiModelOutline0.m(it.next());
                                standard = m.getStandard();
                                if (standard == 2) {
                                    descriptor = m.getDescriptor();
                                    int length = descriptor.length;
                                    if (length != 3) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
                                        sb.append("Invalid SADB length: ");
                                        sb.append(length);
                                        zzeh.zzc("AudioDescriptorUtil", sb.toString());
                                    } else {
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            byte b = descriptor[0];
                                            r8 = 1 == (b & 1) ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                r8 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                r8 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                r8 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                r8 |= 1024;
                                            }
                                            if ((b & 32) != 0) {
                                                r8 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                r8 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                r8 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                r8 |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                r8 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                r8 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                r8 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                r8 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                r8 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                r8 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                r8 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                r8 = 8388608 | r8;
                                            }
                                            if ((b3 & 4) != 0) {
                                                r8 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(r8));
                                    }
                                }
                            }
                            arrayList.sort(zzqs.zza);
                            zzi = zzgxm.zzq(arrayList);
                        }
                    }
                    zzgxm zza3 = zzqu.zza(audioDescriptors);
                    if (!zza3.isEmpty()) {
                        return zza3;
                    }
                }
            }
            if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                zzgxm zzb2 = zzb(audioDeviceInfo);
                if (!zzb2.isEmpty()) {
                    return zzb2;
                }
            }
        }
        return zza;
    }

    @RequiresApi
    private static zzgxm zzb(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzuf.zza).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile m = AudioCapabilities$$ExternalSyntheticApiModelOutline0.m(it.next());
            encapsulationType = m.getEncapsulationType();
            if (encapsulationType != 1) {
                format = m.getFormat();
                if (zzfm.zzE(format)) {
                    channelMasks = m.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return zzgxm.zzq(treeSet);
    }
}
