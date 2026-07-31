package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzamf {
    public static void zza(int i, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgxm zzd = zzapVar.zzd(zzfx.class);
            int size = zzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfx zzfxVar = (zzfx) zzd.get(i2);
                if (!zzfxVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfxVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i, zzaha zzahaVar, zzt zztVar) {
        if (i == 1 && zzahaVar.zzb()) {
            zztVar.zzL(zzahaVar.zza);
            zztVar.zzM(zzahaVar.zzb);
        }
    }

    @Nullable
    public static zzao zzc(zzeu zzeuVar) {
        String str;
        zzao zzajpVar;
        int zzg = zzeuVar.zzg();
        int zzB = zzeuVar.zzB();
        zzao zzaoVar = null;
        if (zzB < 8) {
            zzeh.zzc("MetadataUtil", "Skipped empty metadata entry");
            return null;
        }
        int i = zzg + zzB;
        int zzB2 = zzeuVar.zzB();
        int i2 = zzB2 >> 24;
        try {
            if (i - zzeuVar.zzg() < 8) {
                String zze = zzgb.zze(zzB2);
                StringBuilder sb = new StringBuilder(zze.length() + 30);
                sb.append("Skipped empty metadata entry: ");
                sb.append(zze);
                zzeh.zzc("MetadataUtil", sb.toString());
            } else {
                int i3 = i2 & 255;
                if (i3 == 169 || i3 == 253) {
                    int i4 = zzB2 & 16777215;
                    if (i4 == 6516084) {
                        int zzB3 = zzeuVar.zzB();
                        if (zzeuVar.zzB() == 1684108385) {
                            zzeuVar.zzk(8);
                            String zzL = zzeuVar.zzL(zzB3 - 16);
                            zzaoVar = new zzajt("und", zzL, zzL);
                        } else {
                            zzeh.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzgb.zze(zzB2)));
                        }
                    } else {
                        if (i4 != 7233901 && i4 != 7631467) {
                            if (i4 != 6516589 && i4 != 7828084) {
                                if (i4 == 6578553) {
                                    zzaoVar = zzd(zzB2, "TDRC", zzeuVar);
                                } else if (i4 == 4280916) {
                                    zzaoVar = zzd(zzB2, "TPE1", zzeuVar);
                                } else if (i4 == 7630703) {
                                    zzaoVar = zzd(zzB2, "TSSE", zzeuVar);
                                } else if (i4 == 6384738) {
                                    zzaoVar = zzd(zzB2, "TALB", zzeuVar);
                                } else if (i4 == 7108978) {
                                    zzaoVar = zzd(zzB2, "USLT", zzeuVar);
                                } else if (i4 == 6776174) {
                                    zzaoVar = zzd(zzB2, "TCON", zzeuVar);
                                } else if (i4 == 6779504) {
                                    zzaoVar = zzd(zzB2, "TIT1", zzeuVar);
                                } else if (i4 == 7173742) {
                                    zzaoVar = zzd(zzB2, "MVNM", zzeuVar);
                                } else {
                                    if (i4 == 7173737) {
                                        zzaoVar = zze(zzB2, "MVIN", zzeuVar, true, false);
                                    }
                                    String zze2 = zzgb.zze(zzB2);
                                    StringBuilder sb2 = new StringBuilder(zze2.length() + 32);
                                    sb2.append("Skipped unknown metadata entry: ");
                                    sb2.append(zze2);
                                    zzeh.zza("MetadataUtil", sb2.toString());
                                }
                            }
                            zzaoVar = zzd(zzB2, "TCOM", zzeuVar);
                        }
                        zzaoVar = zzd(zzB2, "TIT2", zzeuVar);
                    }
                } else if (zzB2 == 1735291493) {
                    String zza = zzaka.zza(zzf(zzeuVar) - 1);
                    if (zza != null) {
                        zzajpVar = new zzake("TCON", null, zzgxm.zzj(zza));
                        zzaoVar = zzajpVar;
                    } else {
                        zzeh.zzc("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (zzB2 == 1684632427) {
                    zzaoVar = zzg(1684632427, "TPOS", zzeuVar);
                } else if (zzB2 == 1953655662) {
                    zzaoVar = zzg(1953655662, "TRCK", zzeuVar);
                } else if (zzB2 == 1953329263) {
                    zzaoVar = zze(1953329263, "TBPM", zzeuVar, true, false);
                } else if (zzB2 == 1668311404) {
                    zzaoVar = zze(1668311404, "TCMP", zzeuVar, true, true);
                } else if (zzB2 == 1668249202) {
                    int zzB4 = zzeuVar.zzB();
                    if (zzeuVar.zzB() == 1684108385) {
                        int zzB5 = zzeuVar.zzB();
                        int i5 = zzalv.zza;
                        int i6 = zzB5 & 16777215;
                        if (i6 == 13) {
                            str = "image/jpeg";
                        } else if (i6 == 14) {
                            str = "image/png";
                            i6 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 30);
                            sb3.append("Unrecognized cover art flags: ");
                            sb3.append(i6);
                            zzeh.zzc("MetadataUtil", sb3.toString());
                        } else {
                            zzeuVar.zzk(4);
                            int i7 = zzB4 - 16;
                            byte[] bArr = new byte[i7];
                            zzeuVar.zzm(bArr, 0, i7);
                            zzajpVar = new zzajp(str, null, 3, bArr);
                            zzaoVar = zzajpVar;
                        }
                    } else {
                        zzeh.zzc("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (zzB2 == 1631670868) {
                    zzaoVar = zzd(1631670868, "TPE2", zzeuVar);
                } else if (zzB2 == 1936682605) {
                    zzaoVar = zzd(1936682605, "TSOT", zzeuVar);
                } else if (zzB2 == 1936679276) {
                    zzaoVar = zzd(1936679276, "TSOA", zzeuVar);
                } else if (zzB2 == 1936679282) {
                    zzaoVar = zzd(1936679282, "TSOP", zzeuVar);
                } else if (zzB2 == 1936679265) {
                    zzaoVar = zzd(1936679265, "TSO2", zzeuVar);
                } else if (zzB2 == 1936679791) {
                    zzaoVar = zzd(1936679791, "TSOC", zzeuVar);
                } else if (zzB2 == 1920233063) {
                    zzaoVar = zze(1920233063, "ITUNESADVISORY", zzeuVar, false, false);
                } else if (zzB2 == 1885823344) {
                    zzaoVar = zze(1885823344, "ITUNESGAPLESS", zzeuVar, false, true);
                } else if (zzB2 == 1936683886) {
                    zzaoVar = zzd(1936683886, "TVSHOWSORT", zzeuVar);
                } else if (zzB2 == 1953919848) {
                    zzaoVar = zzd(1953919848, "TVSHOW", zzeuVar);
                } else {
                    if (zzB2 == 757935405) {
                        String str2 = null;
                        String str3 = null;
                        int i8 = -1;
                        int i9 = -1;
                        while (zzeuVar.zzg() < i) {
                            int zzg2 = zzeuVar.zzg();
                            int zzB6 = zzeuVar.zzB();
                            int zzB7 = zzeuVar.zzB();
                            zzeuVar.zzk(4);
                            if (zzB7 == 1835360622) {
                                str2 = zzeuVar.zzL(zzB6 - 12);
                            } else {
                                int i10 = zzB6 - 12;
                                if (zzB7 == 1851878757) {
                                    str3 = zzeuVar.zzL(i10);
                                } else {
                                    if (zzB7 == 1684108385) {
                                        i9 = zzB6;
                                    }
                                    if (zzB7 == 1684108385) {
                                        i8 = zzg2;
                                    }
                                    zzeuVar.zzk(i10);
                                }
                            }
                        }
                        if (str2 != null && str3 != null && i8 != -1) {
                            zzeuVar.zzh(i8);
                            zzeuVar.zzk(16);
                            zzaoVar = new zzakb(str2, str3, zzeuVar.zzL(i9 - 16));
                        }
                    }
                    String zze22 = zzgb.zze(zzB2);
                    StringBuilder sb22 = new StringBuilder(zze22.length() + 32);
                    sb22.append("Skipped unknown metadata entry: ");
                    sb22.append(zze22);
                    zzeh.zza("MetadataUtil", sb22.toString());
                }
            }
            return zzaoVar;
        } finally {
            zzeuVar.zzh(i);
        }
    }

    @Nullable
    private static zzake zzd(int i, String str, zzeu zzeuVar) {
        int zzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            return new zzake(str, null, zzgxm.zzj(zzeuVar.zzL(zzB - 16)));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzgb.zze(i)));
        return null;
    }

    @Nullable
    private static zzajz zze(int i, String str, zzeu zzeuVar, boolean z, boolean z2) {
        int zzf = zzf(zzeuVar);
        if (z2) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new zzake(str, null, zzgxm.zzj(Integer.toString(zzf))) : new zzajt("und", str, Integer.toString(zzf));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzgb.zze(i)));
        return null;
    }

    private static int zzf(zzeu zzeuVar) {
        int zzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzeuVar.zzs();
            }
            if (i == 2) {
                return zzeuVar.zzt();
            }
            if (i == 3) {
                return zzeuVar.zzx();
            }
            if (i == 4 && (zzeuVar.zzn() & 128) == 0) {
                return zzeuVar.zzH();
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzake zzg(int i, String str, zzeu zzeuVar) {
        int zzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385 && zzB >= 22) {
            zzeuVar.zzk(10);
            int zzt = zzeuVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzeuVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzake(str, null, zzgxm.zzj(sb2));
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzgb.zze(i)));
        return null;
    }
}
