package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.MdtaMetadataEntry;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaih {
    public static void zza(int i, zzao zzaoVar, zzs zzsVar, zzao zzaoVar2, zzao... zzaoVarArr) {
        if (zzaoVar2 == null) {
            zzaoVar2 = new zzao(C.TIME_UNSET, new zzan[0]);
        }
        if (zzaoVar != null) {
            for (int i2 = 0; i2 < zzaoVar.zza(); i2++) {
                zzan zzb = zzaoVar.zzb(i2);
                if (zzb instanceof zzer) {
                    zzer zzerVar = (zzer) zzb;
                    if (!zzerVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    } else if (i == 2) {
                        zzaoVar2 = zzaoVar2.zzd(zzerVar);
                    }
                }
            }
        }
        for (zzao zzaoVar3 : zzaoVarArr) {
            zzaoVar2 = zzaoVar2.zzc(zzaoVar3);
        }
        if (zzaoVar2.zza() > 0) {
            zzsVar.zzk(zzaoVar2);
        }
    }

    public static void zzb(int i, zzadk zzadkVar, zzs zzsVar) {
        if (i == 1 && zzadkVar.zzb()) {
            zzsVar.zzH(zzadkVar.zza);
            zzsVar.zzI(zzadkVar.zzb);
        }
    }

    public static zzan zzc(zzef zzefVar) {
        String str;
        zzan zzafxVar;
        int zzg = zzefVar.zzg() + zzefVar.zzB();
        int zzB = zzefVar.zzB();
        int i = (zzB >> 24) & 255;
        zzan zzanVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzB & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzB2 = zzefVar.zzB();
                    if (zzefVar.zzB() == 1684108385) {
                        zzefVar.zzk(8);
                        String zzL = zzefVar.zzL(zzB2 - 16);
                        zzanVar = new zzagb(C.LANGUAGE_UNDETERMINED, zzL, zzL);
                    } else {
                        zzds.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzev.zze(zzB)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzanVar = zzd(zzB, "TDRC", zzefVar);
                            } else if (i2 == 4280916) {
                                zzanVar = zzd(zzB, "TPE1", zzefVar);
                            } else if (i2 == 7630703) {
                                zzanVar = zzd(zzB, "TSSE", zzefVar);
                            } else if (i2 == 6384738) {
                                zzanVar = zzd(zzB, "TALB", zzefVar);
                            } else if (i2 == 7108978) {
                                zzanVar = zzd(zzB, "USLT", zzefVar);
                            } else if (i2 == 6776174) {
                                zzanVar = zzd(zzB, "TCON", zzefVar);
                            } else {
                                if (i2 == 6779504) {
                                    zzanVar = zzd(zzB, "TIT1", zzefVar);
                                }
                                String zze = zzev.zze(zzB);
                                StringBuilder sb = new StringBuilder(zze.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(zze);
                                zzds.zza("MetadataUtil", sb.toString());
                            }
                        }
                        zzanVar = zzd(zzB, "TCOM", zzefVar);
                    }
                    zzanVar = zzd(zzB, "TIT2", zzefVar);
                }
            } else if (zzB == 1735291493) {
                String zza = zzagi.zza(zzf(zzefVar) - 1);
                if (zza != null) {
                    zzafxVar = new zzagm("TCON", null, zzgjz.zzj(zza));
                    zzanVar = zzafxVar;
                } else {
                    zzds.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzB == 1684632427) {
                zzanVar = zzg(1684632427, "TPOS", zzefVar);
            } else if (zzB == 1953655662) {
                zzanVar = zzg(1953655662, "TRCK", zzefVar);
            } else if (zzB == 1953329263) {
                zzanVar = zze(1953329263, "TBPM", zzefVar, true, false);
            } else if (zzB == 1668311404) {
                zzanVar = zze(1668311404, "TCMP", zzefVar, true, true);
            } else if (zzB == 1668249202) {
                int zzB3 = zzefVar.zzB();
                if (zzefVar.zzB() == 1684108385) {
                    int zzB4 = zzefVar.zzB();
                    int i3 = zzahy.zza;
                    int i4 = zzB4 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = MimeTypes.IMAGE_PNG;
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        zzds.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzefVar.zzk(4);
                        int i5 = zzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzefVar.zzm(bArr, 0, i5);
                        zzafxVar = new zzafx(str, null, 3, bArr);
                        zzanVar = zzafxVar;
                    }
                } else {
                    zzds.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzB == 1631670868) {
                zzanVar = zzd(1631670868, "TPE2", zzefVar);
            } else if (zzB == 1936682605) {
                zzanVar = zzd(1936682605, "TSOT", zzefVar);
            } else if (zzB == 1936679276) {
                zzanVar = zzd(1936679276, "TSOA", zzefVar);
            } else if (zzB == 1936679282) {
                zzanVar = zzd(1936679282, "TSOP", zzefVar);
            } else if (zzB == 1936679265) {
                zzanVar = zzd(1936679265, "TSO2", zzefVar);
            } else if (zzB == 1936679791) {
                zzanVar = zzd(1936679791, "TSOC", zzefVar);
            } else if (zzB == 1920233063) {
                zzanVar = zze(1920233063, "ITUNESADVISORY", zzefVar, false, false);
            } else if (zzB == 1885823344) {
                zzanVar = zze(1885823344, "ITUNESGAPLESS", zzefVar, false, true);
            } else if (zzB == 1936683886) {
                zzanVar = zzd(1936683886, "TVSHOWSORT", zzefVar);
            } else if (zzB == 1953919848) {
                zzanVar = zzd(1953919848, "TVSHOW", zzefVar);
            } else {
                if (zzB == 757935405) {
                    int i6 = -1;
                    int i7 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (zzefVar.zzg() < zzg) {
                        int zzg2 = zzefVar.zzg();
                        int zzB5 = zzefVar.zzB();
                        int zzB6 = zzefVar.zzB();
                        zzefVar.zzk(4);
                        if (zzB6 == 1835360622) {
                            str2 = zzefVar.zzL(zzB5 - 12);
                        } else {
                            int i8 = zzB5 - 12;
                            if (zzB6 == 1851878757) {
                                str3 = zzefVar.zzL(i8);
                            } else {
                                if (zzB6 == 1684108385) {
                                    i7 = zzB5;
                                }
                                if (zzB6 == 1684108385) {
                                    i6 = zzg2;
                                }
                                zzefVar.zzk(i8);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i6 != -1) {
                        zzefVar.zzh(i6);
                        zzefVar.zzk(16);
                        zzanVar = new zzagj(str2, str3, zzefVar.zzL(i7 - 16));
                    }
                }
                String zze2 = zzev.zze(zzB);
                StringBuilder sb3 = new StringBuilder(zze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(zze2);
                zzds.zza("MetadataUtil", sb3.toString());
            }
            return zzanVar;
        } finally {
            zzefVar.zzh(zzg);
        }
    }

    private static zzagm zzd(int i, String str, zzef zzefVar) {
        int zzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            return new zzagm(str, null, zzgjz.zzj(zzefVar.zzL(zzB - 16)));
        }
        zzds.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static zzagh zze(int i, String str, zzef zzefVar, boolean z, boolean z2) {
        int zzf = zzf(zzefVar);
        if (z2) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new zzagm(str, null, zzgjz.zzj(Integer.toString(zzf))) : new zzagb(C.LANGUAGE_UNDETERMINED, str, Integer.toString(zzf));
        }
        zzds.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i)));
        return null;
    }

    private static int zzf(zzef zzefVar) {
        int zzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385) {
            zzefVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzefVar.zzs();
            }
            if (i == 2) {
                return zzefVar.zzt();
            }
            if (i == 3) {
                return zzefVar.zzx();
            }
            if (i == 4 && (zzefVar.zzn() & 128) == 0) {
                return zzefVar.zzH();
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagm zzg(int i, String str, zzef zzefVar) {
        int zzB = zzefVar.zzB();
        if (zzefVar.zzB() == 1684108385 && zzB >= 22) {
            zzefVar.zzk(10);
            int zzt = zzefVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzefVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzagm(str, null, zzgjz.zzj(sb2));
            }
        }
        zzds.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i)));
        return null;
    }
}
