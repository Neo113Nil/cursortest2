package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabg implements zzaay {
    public final zzfvn zza;
    private final int zzb;

    private zzabg(int i, zzfvn zzfvnVar) {
        this.zzb = i;
        this.zza = zzfvnVar;
    }

    public static zzabg zzc(int i, zzef zzefVar) {
        String str;
        zzfvk zzfvkVar = new zzfvk();
        int zzd = zzefVar.zzd();
        int i2 = -2;
        while (zzefVar.zza() > 8) {
            int zzg = zzefVar.zzg();
            int zzc = zzefVar.zzc() + zzefVar.zzg();
            zzefVar.zzE(zzc);
            zzaay zzaayVar = null;
            if (zzg != 1414744396) {
                switch (zzg) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 != 1) {
                                zzdw.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzO(i2)));
                                break;
                            } else {
                                int zzi = zzefVar.zzi();
                                String str2 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int zzi2 = zzefVar.zzi();
                                    int zzg2 = zzefVar.zzg();
                                    zzefVar.zzG(6);
                                    int zzn = zzen.zzn(zzefVar.zzo());
                                    int zzi3 = zzefVar.zzi();
                                    byte[] bArr = new byte[zzi3];
                                    zzefVar.zzB(bArr, 0, zzi3);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzS(str2);
                                    zzadVar.zzw(zzi2);
                                    zzadVar.zzT(zzg2);
                                    if ("audio/raw".equals(str2) && zzn != 0) {
                                        zzadVar.zzN(zzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzi3 > 0) {
                                        zzadVar.zzI(zzfvn.zzp(bArr));
                                    }
                                    zzaayVar = new zzabh(zzadVar.zzY());
                                    break;
                                } else {
                                    zzdw.zze("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzi);
                                    break;
                                }
                            }
                        } else {
                            zzefVar.zzG(4);
                            int zzg3 = zzefVar.zzg();
                            int zzg4 = zzefVar.zzg();
                            zzefVar.zzG(4);
                            int zzg5 = zzefVar.zzg();
                            switch (zzg5) {
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
                            if (str != null) {
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzX(zzg3);
                                zzadVar2.zzF(zzg4);
                                zzadVar2.zzS(str);
                                zzaayVar = new zzabh(zzadVar2.zzY());
                                break;
                            } else {
                                zzdw.zze("StreamFormatChunk", "Ignoring track with unsupported compression " + zzg5);
                                break;
                            }
                        }
                    case 1751742049:
                        zzaayVar = zzabd.zzb(zzefVar);
                        break;
                    case 1752331379:
                        zzaayVar = zzabe.zzb(zzefVar);
                        break;
                    case 1852994675:
                        zzaayVar = zzabi.zzb(zzefVar);
                        break;
                }
            } else {
                zzaayVar = zzc(zzefVar.zzg(), zzefVar);
            }
            if (zzaayVar != null) {
                if (zzaayVar.zza() == 1752331379) {
                    int i3 = ((zzabe) zzaayVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzdw.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfvkVar.zze(zzaayVar);
            }
            zzefVar.zzF(zzc);
            zzefVar.zzE(zzd);
        }
        return new zzabg(i, zzfvkVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final int zza() {
        return this.zzb;
    }

    public final zzaay zzb(Class cls) {
        zzfvn zzfvnVar = this.zza;
        int size = zzfvnVar.size();
        int i = 0;
        while (i < size) {
            zzaay zzaayVar = (zzaay) zzfvnVar.get(i);
            i++;
            if (zzaayVar.getClass() == cls) {
                return zzaayVar;
            }
        }
        return null;
    }
}
