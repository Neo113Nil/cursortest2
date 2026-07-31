package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaig implements zzahz {
    public final zzgxm zza;
    private final int zzb;

    private zzaig(int i, zzgxm zzgxmVar) {
        this.zzb = i;
        this.zza = zzgxmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaig zzb(int i, zzeu zzeuVar) {
        zzahz zzaihVar;
        String str;
        zzgxj zzgxjVar = new zzgxj();
        int zze = zzeuVar.zze();
        int i2 = -2;
        while (zzeuVar.zzd() > 8) {
            int zzC = zzeuVar.zzC();
            int zzg = zzeuVar.zzg() + zzeuVar.zzC();
            zzeuVar.zzf(zzg);
            if (zzC != 1414744396) {
                zzaih zzaihVar2 = null;
                switch (zzC) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzeuVar.zzk(4);
                            int zzC2 = zzeuVar.zzC();
                            int zzC3 = zzeuVar.zzC();
                            zzeuVar.zzk(4);
                            int zzC4 = zzeuVar.zzC();
                            switch (zzC4) {
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
                                StringBuilder sb = new StringBuilder(String.valueOf(zzC4).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(zzC4);
                                zzeh.zzc("StreamFormatChunk", sb.toString());
                            } else {
                                zzt zztVar = new zzt();
                                zztVar.zzv(zzC2);
                                zztVar.zzw(zzC3);
                                zztVar.zzo(str);
                                zzaihVar2 = new zzaih(zztVar.zzQ());
                            }
                        } else if (i2 == 1) {
                            int zzu = zzeuVar.zzu();
                            String str2 = zzu != 1 ? zzu != 85 ? zzu != 255 ? zzu != 8192 ? zzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzu2 = zzeuVar.zzu();
                                int zzC5 = zzeuVar.zzC();
                                zzeuVar.zzk(6);
                                int zzC6 = zzfm.zzC(zzeuVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int zzu3 = zzeuVar.zzd() > 0 ? zzeuVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzo(str2);
                                zztVar2.zzH(zzu2);
                                zztVar2.zzJ(zzC5);
                                if (str2.equals("audio/raw") && zzC6 != 0) {
                                    zztVar2.zzK(zzC6);
                                }
                                if (str2.equals("audio/mp4a-latm") && zzu3 > 0) {
                                    byte[] bArr = new byte[zzu3];
                                    zzeuVar.zzm(bArr, 0, zzu3);
                                    zztVar2.zzr(zzgxm.zzj(bArr));
                                }
                                zzaihVar = new zzaih(zztVar2.zzQ());
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(zzu).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(zzu);
                                zzeh.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            zzeh.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfm.zzU(i2)));
                        }
                        zzaihVar = zzaihVar2;
                        break;
                    case 1751742049:
                        zzaihVar = zzaid.zzb(zzeuVar);
                        break;
                    case 1752331379:
                        zzaihVar = zzaie.zzb(zzeuVar);
                        break;
                    case 1852994675:
                        zzaihVar = zzaii.zzb(zzeuVar);
                        break;
                    default:
                        zzaihVar = zzaihVar2;
                        break;
                }
            } else {
                zzaihVar = zzb(zzeuVar.zzC(), zzeuVar);
            }
            if (zzaihVar != null) {
                if (zzaihVar.zza() == 1752331379) {
                    i2 = ((zzaie) zzaihVar).zzc();
                }
                zzgxjVar.zzf(zzaihVar);
            }
            zzeuVar.zzh(zzg);
            zzeuVar.zzf(zze);
        }
        return new zzaig(i, zzgxjVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahz
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzahz zzc(Class cls) {
        zzgxm zzgxmVar = this.zza;
        int size = zzgxmVar.size();
        int i = 0;
        while (i < size) {
            zzahz zzahzVar = (zzahz) zzgxmVar.get(i);
            i++;
            if (zzahzVar.getClass() == cls) {
                return zzahzVar;
            }
        }
        return null;
    }
}
