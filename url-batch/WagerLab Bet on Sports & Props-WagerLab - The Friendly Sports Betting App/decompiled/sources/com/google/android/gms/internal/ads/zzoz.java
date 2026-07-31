package com.google.android.gms.internal.ads;

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
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.OpusUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzoz {
    static final zzgkc zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzoz zza = new zzoz(zzgjz.zzj(zzoy.zza));
    private static final zzgjz zzc = zzgjz.zzl(2, 5, 6);

    static {
        zzgkb zzgkbVar = new zzgkb();
        zzgkbVar.zza(5, 6);
        zzgkbVar.zza(17, 6);
        zzgkbVar.zza(7, 6);
        zzgkbVar.zza(30, 10);
        zzgkbVar.zza(18, 6);
        zzgkbVar.zza(6, 8);
        zzgkbVar.zza(8, 8);
        zzgkbVar.zza(14, 8);
        zzb = zzgkbVar.zzc();
    }

    private zzoz(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzoy zzoyVar = (zzoy) list.get(i);
            this.zzd.put(zzoyVar.zzb, zzoyVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzoy) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    static zzoz zza(Context context, zzc zzcVar, AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzcVar, audioDeviceInfo);
    }

    static zzoz zzb(Context context, Intent intent, zzc zzcVar, AudioDeviceInfo audioDeviceInfo) {
        AudioManager zza2 = zzca.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = zza2.getAudioDevicesForAttributes(zzcVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        if (Build.VERSION.SDK_INT >= 33 && (zzeo.zzN(context) || zzeo.zzO(context))) {
            List<AudioProfile> directProfilesForAttributes = zza2.getDirectProfilesForAttributes(zzcVar.zza());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(zzgne.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzeo.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(zzgne.zzg(audioProfile.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(zzgne.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = zzgjz.zzd;
            zzgjw zzgjwVar = new zzgjw();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzgjwVar.zzf(new zzoy(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzoz(zzgjwVar.zzi());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? zza2.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        zzgkd zzgkdVar = new zzgkd();
        zzgkdVar.zzg(8, 7);
        if (Build.VERSION.SDK_INT >= 31) {
            zzgkdVar.zzg(26, 27);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            zzgkdVar.zzf((Object) 30);
        }
        zzgke zzi = zzgkdVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzgkd zzgkdVar2 = new zzgkd();
        zzgkdVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzeo.zzN(context) || zzeo.zzO(context))) {
            int i3 = zzgjz.zzd;
            zzgjw zzgjwVar2 = new zzgjw();
            zzgmd it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzeo.zzD(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), zzcVar.zza())) {
                    zzgjwVar2.zzf(Integer.valueOf(intValue));
                }
            }
            zzgjwVar2.zzf((Object) 2);
            zzgkdVar2.zzh(zzgjwVar2.zzi());
            return new zzoz(zzf(zzgne.zzf(zzgkdVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgkdVar2.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzoz(zzf(zzgne.zzf(zzgkdVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgkdVar2.zzh(zzgne.zzg(intArrayExtra));
        }
        return new zzoz(zzf(zzgne.zzf(zzgkdVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static zzgjz zzf(int[] iArr, int i) {
        int i2 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        for (int i3 : iArr) {
            zzgjwVar.zzf(new zzoy(i3, i));
        }
        return zzgjwVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1.contentEquals(r3) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoz)) {
            return false;
        }
        zzoz zzozVar = (zzoz) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray<?> sparseArray2 = zzozVar.zzd;
        String str = zzeo.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        break;
                    }
                }
                if (this.zze == zzozVar.zze) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = zzeo.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int i = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + obj.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r7 != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if (com.google.android.gms.internal.ads.zzeo.zza(r9.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzd(zzu zzuVar, zzc zzcVar) {
        SparseArray sparseArray;
        int zzB;
        String str = zzuVar.zzo;
        str.getClass();
        int zzh = zzar.zzh(str, zzuVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(zzh))) {
            return null;
        }
        int i = 6;
        if (zzh == 18) {
            if (zzeo.zza(this.zzd, 18)) {
                zzh = 18;
            } else {
                zzh = 6;
                sparseArray = this.zzd;
                if (!zzeo.zza(sparseArray, zzh)) {
                    return null;
                }
                zzoy zzoyVar = (zzoy) sparseArray.get(zzh);
                zzoyVar.getClass();
                int i2 = zzuVar.zzG;
                if (i2 == -1 || zzh == 18) {
                    int i3 = zzuVar.zzH;
                    if (i3 == -1) {
                        i3 = OpusUtil.SAMPLE_RATE;
                    }
                    i2 = zzoyVar.zzb(i3, zzcVar);
                } else if (!str.equals(MimeTypes.AUDIO_DTS_X) || Build.VERSION.SDK_INT >= 33) {
                    if (!zzoyVar.zza(i2)) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (Build.VERSION.SDK_INT <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (Build.VERSION.SDK_INT <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    zzB = zzeo.zzB(i);
                    if (zzB == 0) {
                        return Pair.create(Integer.valueOf(zzh), Integer.valueOf(zzB));
                    }
                    return null;
                }
                i = i2;
                if (Build.VERSION.SDK_INT <= 26) {
                    i = 2;
                }
                zzB = zzeo.zzB(i);
                if (zzB == 0) {
                }
            }
        }
        if (zzh == 8) {
            if (zzeo.zza(this.zzd, 8)) {
                zzh = 8;
            }
            zzh = 7;
            sparseArray = this.zzd;
            if (!zzeo.zza(sparseArray, zzh)) {
            }
        }
        if (zzh == 30) {
        }
        sparseArray = this.zzd;
        if (!zzeo.zza(sparseArray, zzh)) {
        }
    }
}
