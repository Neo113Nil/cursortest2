package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzair {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadz zza(zzacv zzacvVar) throws IOException {
        return zzc(zzacvVar, true, false);
    }

    public static zzadz zzb(zzacv zzacvVar, boolean z) throws IOException {
        return zzc(zzacvVar, false, z);
    }

    private static zzadz zzc(zzacv zzacvVar, boolean z, boolean z2) throws IOException {
        zzadz zzadzVar;
        long j;
        zzef zzefVar;
        int i;
        long j2;
        int i2;
        int[] iArr;
        long zzo = zzacvVar.zzo();
        long j3 = -1;
        long j4 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (zzo != -1 && zzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j4 = zzo;
        }
        zzef zzefVar2 = new zzef(64);
        int i3 = (int) j4;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            zzefVar2.zza(8);
            boolean z4 = true;
            if (!zzacvVar.zzh(zzefVar2.zzi(), i4, 8, true)) {
                break;
            }
            long zzz = zzefVar2.zzz();
            int zzB = zzefVar2.zzB();
            if (zzz == 1) {
                j = j3;
                zzacvVar.zzi(zzefVar2.zzi(), 8, 8);
                i = 16;
                zzefVar2.zzf(16);
                zzz = zzefVar2.zzD();
                zzefVar = zzefVar2;
            } else {
                j = j3;
                if (zzz == 0) {
                    long zzo2 = zzacvVar.zzo();
                    if (zzo2 != j) {
                        zzz = (zzo2 - zzacvVar.zzm()) + 8;
                    }
                }
                zzefVar = zzefVar2;
                i = 8;
            }
            long j5 = zzz;
            zzadzVar = null;
            long j6 = i;
            if (j5 < j6) {
                return new zzahm(zzB, j5, i);
            }
            i5 += i;
            if (zzB == 1836019574) {
                i3 += (int) j5;
                if (zzo != -1 && i3 > zzo) {
                    i3 = (int) zzo;
                }
                zzefVar2 = zzefVar;
                j3 = j;
                i4 = 0;
            } else {
                if (zzB == 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                    j2 = zzo;
                    i2 = 0;
                } else {
                    if (zzB == 1836019558 || zzB == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z3 |= !(zzB != 1835295092);
                    if (zzB == 1937007212) {
                        if (j5 > 1000000) {
                            i4 = 0;
                            break;
                        }
                        zzB = 1937007212;
                    }
                    j2 = zzo;
                    if ((i5 + j5) - j6 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j5 - j6);
                    i5 += i6;
                    if (zzB != 1718909296) {
                        i2 = 0;
                        if (i6 != 0) {
                            zzacvVar.zzk(i6);
                        }
                    } else {
                        if (i6 < 8) {
                            return new zzahm(Mp4Box.TYPE_ftyp, i6, 8);
                        }
                        zzefVar.zza(i6);
                        i2 = 0;
                        zzacvVar.zzi(zzefVar.zzi(), 0, i6);
                        int zzB2 = zzefVar.zzB();
                        boolean zzd = zzd(zzB2, z2) | z3;
                        zzefVar.zzk(4);
                        int zzd2 = zzefVar.zzd() / 4;
                        if (!zzd && zzd2 > 0) {
                            iArr = new int[zzd2];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= zzd2) {
                                    z4 = zzd;
                                    break;
                                }
                                int zzB3 = zzefVar.zzB();
                                iArr[i7] = zzB3;
                                if (zzd(zzB3, z2)) {
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z4 = zzd;
                            iArr = null;
                        }
                        if (!z4) {
                            return new zzaiw(zzB2, iArr);
                        }
                        z3 = z4;
                    }
                }
                i4 = i2;
                zzefVar2 = zzefVar;
                j3 = j;
                zzo = j2;
            }
        }
        zzadzVar = null;
        return !z3 ? zzain.zza : z != i4 ? i4 != 0 ? zzaig.zza : zzaig.zzb : zzadzVar;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
