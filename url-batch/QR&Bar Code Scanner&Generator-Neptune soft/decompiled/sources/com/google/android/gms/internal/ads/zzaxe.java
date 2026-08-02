package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaxe {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map zzf;
    private static final zzaws zza = zzaws.zzb("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int zza() throws zzawz {
        int i = zzg;
        if (i == -1) {
            zzaws zzc2 = zzc("video/avc", false);
            if (zzc2 != null) {
                int i2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i3 = codecProfileLevel.level;
                    int i4 = 9437184;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                }
                i = Math.max(i2, zzbar.zza >= 21 ? 345600 : 172800);
            } else {
                i = 0;
            }
            zzg = i;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair zzb(String str) {
        char c;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            if (split.length < 4) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i = 1;
            } else if (!"2".equals(group)) {
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            Integer num = (Integer) zzf.get(split[3]);
            if (num != null) {
                return new Pair(Integer.valueOf(i), num);
            }
            Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1))));
            return null;
        }
        if (c != 2 && c != 3) {
            return null;
        }
        int length = split.length;
        if (length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
            return null;
        }
        try {
            if (split[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
            } else {
                if (length < 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
            }
            return new Pair(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
            return null;
        }
    }

    public static zzaws zzc(String str, boolean z) throws zzawz {
        List zzd2 = zzd(str, z);
        if (zzd2.isEmpty()) {
            return null;
        }
        return (zzaws) zzd2.get(0);
    }

    public static synchronized List zzd(String str, boolean z) throws zzawz {
        int i;
        synchronized (zzaxe.class) {
            zzawx zzawxVar = new zzawx(str, z);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzawxVar);
            if (list != null) {
                return list;
            }
            List zze2 = zze(zzawxVar, zzbar.zza >= 21 ? new zzaxd(z) : new zzaxc(null));
            if (z && zze2.isEmpty() && (i = zzbar.zza) >= 21 && i <= 23) {
                zze2 = zze(zzawxVar, new zzaxc(null));
                if (!zze2.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzaws) zze2.get(0)).zza);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzawxVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01f0 A[Catch: Exception -> 0x01eb, TryCatch #1 {Exception -> 0x01eb, blocks: (B:179:0x01c5, B:181:0x01cf, B:183:0x01d9, B:185:0x01e1, B:144:0x01f0, B:167:0x01f9), top: B:178:0x01c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List zze(zzawx zzawxVar, zzaxa zzaxaVar) throws zzawz {
        int i;
        MediaCodecInfo mediaCodecInfo;
        boolean z;
        zzaxa zzaxaVar2 = zzaxaVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = zzawxVar.zza;
            int zza2 = zzaxaVar.zza();
            boolean zzd2 = zzaxaVar.zzd();
            int i2 = 0;
            while (i2 < zza2) {
                MediaCodecInfo zzb2 = zzaxaVar2.zzb(i2);
                String name = zzb2.getName();
                if (!zzb2.isEncoder() && ((zzd2 || !name.endsWith(".secure")) && ((zzbar.zza >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((zzbar.zza >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && ((zzbar.zza >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(zzbar.zzb)) && ((zzbar.zza != 16 || !"OMX.qcom.audio.decoder.mp3".equals(name) || (!"dlxu".equals(zzbar.zzb) && !"protou".equals(zzbar.zzb) && !"ville".equals(zzbar.zzb) && !"villeplus".equals(zzbar.zzb) && !"villec2".equals(zzbar.zzb) && !zzbar.zzb.startsWith("gee") && !"C6602".equals(zzbar.zzb) && !"C6603".equals(zzbar.zzb) && !"C6606".equals(zzbar.zzb) && !"C6616".equals(zzbar.zzb) && !"L36h".equals(zzbar.zzb) && !"SO-02E".equals(zzbar.zzb))) && ((zzbar.zza != 16 || !"OMX.qcom.audio.decoder.aac".equals(name) || (!"C1504".equals(zzbar.zzb) && !"C1505".equals(zzbar.zzb) && !"C1604".equals(zzbar.zzb) && !"C1605".equals(zzbar.zzb))) && ((zzbar.zza > 19 || !"OMX.SEC.vp8.dec".equals(name) || !"samsung".equals(zzbar.zzc) || (!zzbar.zzb.startsWith("d2") && !zzbar.zzb.startsWith("serrano") && !zzbar.zzb.startsWith("jflte") && !zzbar.zzb.startsWith("santos") && !zzbar.zzb.startsWith("t0"))) && (zzbar.zza > 19 || !zzbar.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)))))))))) {
                    String[] supportedTypes = zzb2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str2 = supportedTypes[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str2);
                                boolean zzc2 = zzaxaVar2.zzc(str, capabilitiesForType);
                                i = zza2;
                                mediaCodecInfo = zzb2;
                                if (zzbar.zza <= 22) {
                                    try {
                                        if ((zzbar.zzd.equals("ODROID-XU3") || zzbar.zzd.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                            z = true;
                                            try {
                                                if (zzd2) {
                                                    if (zzawxVar.zzb == zzc2) {
                                                    }
                                                    arrayList.add(zzaws.zza(name, str, capabilitiesForType, z, false));
                                                }
                                                arrayList.add(zzaws.zza(name, str, capabilitiesForType, z, false));
                                            } catch (Exception e) {
                                                e = e;
                                                if (zzbar.zza <= 23) {
                                                }
                                                Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                                throw e;
                                            }
                                            if (!zzd2 || zzawxVar.zzb) {
                                                if (!zzd2 && zzc2) {
                                                    arrayList.add(zzaws.zza(name + ".secure", str, capabilitiesForType, z, true));
                                                    return arrayList;
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (zzbar.zza <= 23 || arrayList.isEmpty()) {
                                            Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                            throw e;
                                        }
                                        Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                        i3++;
                                        zzaxaVar2 = zzaxaVar;
                                        zza2 = i;
                                        zzb2 = mediaCodecInfo;
                                    }
                                }
                                z = false;
                                if (zzd2) {
                                }
                                if (!zzd2) {
                                }
                                if (!zzd2) {
                                    arrayList.add(zzaws.zza(name + ".secure", str, capabilitiesForType, z, true));
                                    return arrayList;
                                }
                                continue;
                            } catch (Exception e3) {
                                e = e3;
                                i = zza2;
                                mediaCodecInfo = zzb2;
                            }
                        } else {
                            i = zza2;
                            mediaCodecInfo = zzb2;
                        }
                        i3++;
                        zzaxaVar2 = zzaxaVar;
                        zza2 = i;
                        zzb2 = mediaCodecInfo;
                    }
                }
                i2++;
                zzaxaVar2 = zzaxaVar;
                zza2 = zza2;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new zzawz(e4, null);
        }
    }
}
