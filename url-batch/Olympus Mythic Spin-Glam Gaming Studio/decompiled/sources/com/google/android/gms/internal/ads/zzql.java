package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.audio.AudioCapabilities$$ExternalSyntheticApiModelOutline0;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzql {
    public static final zzql zza;

    @VisibleForTesting
    static final zzgxp zzb;
    private static final zzgxm zzc;
    private static final zzgxm zzd;

    @SuppressLint({"InlinedApi"})
    private static final zzgxm zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgxm zzh;
    private final zzgxm zzi;

    static {
        zzgxm zzj = zzgxm.zzj(12);
        zzc = zzj;
        zzgxm zzi = zzgxm.zzi();
        zzd = zzi;
        zza = new zzql(zzgxm.zzj(zzqk.zza), zzj, zzi);
        zze = zzgxm.zzl(2, 5, 6);
        zzgxo zzgxoVar = new zzgxo();
        zzgxoVar.zza(5, 6);
        zzgxoVar.zza(17, 6);
        zzgxoVar.zza(7, 6);
        zzgxoVar.zza(30, 10);
        zzgxoVar.zza(18, 6);
        zzgxoVar.zza(6, 8);
        zzgxoVar.zza(8, 8);
        zzgxoVar.zza(14, 8);
        zzb = zzgxoVar.zzc();
    }

    private zzql(List list, List list2, List list3) {
        for (int i = 0; i < list.size(); i++) {
            zzqk zzqkVar = (zzqk) list.get(i);
            this.zzf.put(zzqkVar.zzb, zzqkVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzf.size(); i3++) {
            i2 = Math.max(i2, ((zzqk) this.zzf.valueAt(i3)).zzc);
        }
        this.zzg = i2;
        this.zzh = zzgxm.zzq(list2);
        this.zzi = zzgxm.zzq(list3);
    }

    @SuppressLint({"UnprotectedReceiver"})
    static zzql zza(Context context, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    @SuppressLint({"InlinedApi"})
    static zzql zzb(Context context, @Nullable Intent intent, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo, List list) {
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager zza2 = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        zzgxm zza3 = audioDeviceInfo != null ? zzug.zza(audioDeviceInfo) : zzc;
        if (Build.VERSION.SDK_INT >= 33 && (zzfm.zzR(context) || zzfm.zzS(context))) {
            directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzhbj.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile m = AudioCapabilities$$ExternalSyntheticApiModelOutline0.m(directProfilesForAttributes.get(i));
                encapsulationType = m.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = m.getFormat();
                    if (zzfm.zzE(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = m.getChannelMasks();
                            set.addAll(zzhbj.zzg(channelMasks2));
                        } else {
                            channelMasks = m.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(zzhbj.zzg(channelMasks)));
                        }
                    }
                }
            }
            int i2 = zzgxm.zzd;
            zzgxj zzgxjVar = new zzgxj();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgxjVar.zzf(new zzqk(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzql(zzgxjVar.zzi(), zza3, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? zza2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (zztz.zza(audioDeviceInfo2.getType())) {
                return new zzql(zzgxm.zzj(zzqk.zza), zza3, list);
            }
        }
        zzgxv zzgxvVar = new zzgxv();
        zzgxvVar.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfm.zzR(context) || zzfm.zzS(context))) {
            int i3 = zzgxm.zzd;
            zzgxj zzgxjVar2 = new zzgxj();
            zzhaa it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzfm.zzH(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzdVar.zza());
                    if (isDirectPlaybackSupported) {
                        zzgxjVar2.zzf(num);
                    }
                }
            }
            zzgxjVar2.zzf((Object) 2);
            zzgxvVar.zzg(zzgxjVar2.zzi());
            return new zzql(zzh(zzhbj.zzf(zzgxvVar.zzh()), 10), zza3, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzg()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgxvVar.zzg(zze);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzql(zzh(zzhbj.zzf(zzgxvVar.zzh()), 10), zza3, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgxvVar.zzg(zzhbj.zzg(intArrayExtra));
        }
        return new zzql(zzh(zzhbj.zzf(zzgxvVar.zzh()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), zza3, list);
    }

    @Nullable
    static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzgxm zzh(@Nullable int[] iArr, int i) {
        int i2 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgxjVar.zzf(new zzqk(i3, i));
        }
        return zzgxjVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        boolean contentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzql)) {
            return false;
        }
        zzql zzqlVar = (zzql) obj;
        SparseArray sparseArray = this.zzf;
        SparseArray sparseArray2 = zzqlVar.zzf;
        String str = zzfm.zza;
        if (Build.VERSION.SDK_INT >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zzg != zzqlVar.zzg || !Objects.equals(this.zzh, zzqlVar.zzh) || !Objects.equals(this.zzi, zzqlVar.zzi)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzfm.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return (((((this.zzg * 31) + i) * 31) + Objects.hashCode(this.zzh)) * 31) + Objects.hashCode(this.zzi);
    }

    public final String toString() {
        zzgxm zzgxmVar = this.zzi;
        zzgxm zzgxmVar2 = this.zzh;
        String obj = this.zzf.toString();
        String valueOf = String.valueOf(zzgxmVar2);
        String valueOf2 = String.valueOf(zzgxmVar);
        int i = this.zzg;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + valueOf.length() + 26 + valueOf2.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append(", speakerLayoutChannelMasks=");
        sb.append(valueOf);
        sb.append(", spatializerChannelMasks=");
        sb.append(valueOf2);
        sb.append(X3.j.e);
        return sb.toString();
    }

    public final zzgxm zzd() {
        return this.zzh;
    }

    public final zzgxm zze() {
        return this.zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.zzfm.zza(r9.zzf, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[ORIG_RETURN, RETURN] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzf(zzv zzvVar, zzd zzdVar) {
        SparseArray sparseArray;
        int zza2;
        int i;
        String str = zzvVar.zzp;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zzg))) {
            return null;
        }
        int i2 = 8;
        if (zzg == 18) {
            if (zzfm.zza(this.zzf, 18)) {
                zzg = 18;
            } else {
                zzg = 6;
                sparseArray = this.zzf;
                if (!zzfm.zza(sparseArray, zzg)) {
                    return null;
                }
                zzqk zzqkVar = (zzqk) sparseArray.get(zzg);
                zzqkVar.getClass();
                int i3 = zzvVar.zzI;
                if (i3 == -1 || zzg == 18) {
                    int i4 = zzvVar.zzK;
                    if (i4 == -1) {
                        i4 = 48000;
                    }
                    zza2 = zzqkVar.zza(i4, zzdVar);
                } else {
                    if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                        if (!zzqkVar.zzb(i3, zzvVar)) {
                            return null;
                        }
                    } else if (i3 > 10) {
                        return null;
                    }
                    zza2 = i3;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 <= 28) {
                    if (zza2 != 7) {
                        if (zza2 == 3 || zza2 == 4 || zza2 == 5) {
                            i2 = 6;
                        }
                    }
                    if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
                        i2 = 2;
                    }
                    i = zzvVar.zzJ;
                    if (i != -1 || i3 != i2) {
                        i = zzfm.zzG(i2);
                    }
                    if (i == 0) {
                        return Pair.create(Integer.valueOf(zzg), Integer.valueOf(i));
                    }
                    return null;
                }
                i2 = zza2;
                if (i5 <= 26) {
                    i2 = 2;
                }
                i = zzvVar.zzJ;
                if (i != -1) {
                }
                i = zzfm.zzG(i2);
                if (i == 0) {
                }
            }
        }
        if (zzg == 8) {
            if (zzfm.zza(this.zzf, 8)) {
                zzg = 8;
            }
            zzg = 7;
            sparseArray = this.zzf;
            if (!zzfm.zza(sparseArray, zzg)) {
            }
        }
        if (zzg == 30) {
        }
        sparseArray = this.zzf;
        if (!zzfm.zza(sparseArray, zzg)) {
        }
    }
}
