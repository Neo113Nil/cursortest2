package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaef implements zzadx {
    public final zzfxr zza;
    private final int zzb;

    private zzaef(int i, zzfxr zzfxrVar) {
        this.zzb = i;
        this.zza = zzfxrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaef zzc(int i, zzek zzekVar) {
        zzadx zzaegVar;
        String str;
        zzfxo zzfxoVar = new zzfxo();
        int zze = zzekVar.zze();
        int i2 = -2;
        while (zzekVar.zzb() > 8) {
            int zzi = zzekVar.zzi();
            int zzd = zzekVar.zzd() + zzekVar.zzi();
            zzekVar.zzJ(zzd);
            if (zzi != 1414744396) {
                zzaeg zzaegVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzekVar.zzL(4);
                            int zzi2 = zzekVar.zzi();
                            int zzi3 = zzekVar.zzi();
                            zzekVar.zzL(4);
                            int zzi4 = zzekVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzea.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzi4);
                            } else {
                                zzad zzadVar = new zzad();
                                zzadVar.zzac(zzi2);
                                zzadVar.zzI(zzi3);
                                zzadVar.zzX(str);
                                zzaegVar2 = new zzaeg(zzadVar.zzad());
                            }
                        } else if (i2 == 1) {
                            int zzk = zzekVar.zzk();
                            String str2 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzk2 = zzekVar.zzk();
                                int zzi5 = zzekVar.zzi();
                                zzekVar.zzL(6);
                                int zzl = zzet.zzl(zzekVar.zzq());
                                int zzk3 = zzekVar.zzk();
                                byte[] bArr = new byte[zzk3];
                                zzekVar.zzG(bArr, 0, zzk3);
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzX(str2);
                                zzadVar2.zzy(zzk2);
                                zzadVar2.zzY(zzi5);
                                if ("audio/raw".equals(str2) && zzl != 0) {
                                    zzadVar2.zzR(zzl);
                                }
                                if ("audio/mp4a-latm".equals(str2) && zzk3 > 0) {
                                    zzadVar2.zzL(zzfxr.zzn(bArr));
                                }
                                zzaegVar = new zzaeg(zzadVar2.zzad());
                                break;
                            } else {
                                zzea.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzk);
                            }
                        } else {
                            zzea.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzet.zzC(i2)));
                        }
                        zzaegVar = zzaegVar2;
                        break;
                    case 1751742049:
                        zzaegVar = zzaec.zzb(zzekVar);
                        break;
                    case 1752331379:
                        zzaegVar = zzaed.zzb(zzekVar);
                        break;
                    case 1852994675:
                        zzaegVar = zzaeh.zzb(zzekVar);
                        break;
                    default:
                        zzaegVar = zzaegVar2;
                        break;
                }
            } else {
                zzaegVar = zzc(zzekVar.zzi(), zzekVar);
            }
            if (zzaegVar != null) {
                if (zzaegVar.zza() == 1752331379) {
                    int i3 = ((zzaed) zzaegVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfxoVar.zzf(zzaegVar);
            }
            zzekVar.zzK(zzd);
            zzekVar.zzJ(zze);
        }
        return new zzaef(i, zzfxoVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return this.zzb;
    }

    public final zzadx zzb(Class cls) {
        zzfxr zzfxrVar = this.zza;
        int size = zzfxrVar.size();
        int i = 0;
        while (i < size) {
            zzadx zzadxVar = (zzadx) zzfxrVar.get(i);
            i++;
            if (zzadxVar.getClass() == cls) {
                return zzadxVar;
            }
        }
        return null;
    }
}
