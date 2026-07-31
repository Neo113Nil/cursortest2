package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaks {
    public byte[] zzO;
    public zzahu zzV;
    public boolean zzX;
    public zzaht zzZ;
    public boolean zza;
    public zzv zzaa;
    public int zzab;
    private int zzac;
    public String zzb;
    public String zzc;
    public int zzd;
    public long zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public boolean zzi;
    public byte[] zzj;
    public zzahs zzk;
    public byte[] zzl;
    public zzq zzm;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = -1;
    public int zzs = 0;
    public int zzt = -1;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public float zzw = 0.0f;
    public byte[] zzx = null;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = -1;
    public int zzS = 8000;
    public long zzT = 0;
    public long zzU = 0;
    public boolean zzW = false;
    public boolean zzY = true;
    private String zzad = "eng";

    protected zzaks() {
    }

    private static Pair zzf(zzeu zzeuVar) throws zzat {
        try {
            zzeuVar.zzk(16);
            long zzA = zzeuVar.zzA();
            if (zzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzA != 826496599) {
                zzeh.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzg = zzeuVar.zzg() + 20;
            byte[] zzi = zzeuVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final boolean zzh(zzeu zzeuVar) throws zzat {
        UUID uuid;
        UUID uuid2;
        try {
            int zzu = zzeuVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzeuVar.zzh(20);
                int zzI = zzeuVar.zzI();
                if (zzft.zza(zzI, this.zzP)) {
                    this.zzR = zzft.zzb(zzI);
                }
                long zzD = zzeuVar.zzD();
                uuid = zzakt.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzeuVar.zzD();
                    uuid2 = zzakt.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzl;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x04d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i) throws zzat {
        char c;
        String str;
        String str2;
        List zzj;
        int i2;
        int i3;
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        List zzg;
        String str4;
        String str5;
        String str6;
        List singletonList;
        byte[] bArr;
        String str7;
        String str8;
        String str9;
        int i9;
        int i10;
        byte[] bArr2;
        int i11;
        int i12;
        Map map;
        Map map2;
        int i13;
        String str10;
        Map map3;
        String str11 = this.zzc;
        switch (str11.hashCode()) {
            case -2095576542:
                if (str11.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str11.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str11.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str11.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str11.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str11.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str11.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str11.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str11.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str11.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str11.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str11.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str11.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str11.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str11.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str11.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str11.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str11.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str11.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str11.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str11.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str11.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str11.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str11.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str11.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str11.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str11.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str11.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str11.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str11.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str11.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str11.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str11.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str11.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str12 = "audio/x-unknown";
        List list = null;
        switch (c) {
            case 0:
                str = "application/x-subrip";
                str2 = "video/x-vnd.on2.vp8";
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                list = null;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                    str7 = str3;
                    zzfw zza = zzfw.zza(new zzeu(this.zzO));
                    if (zza != null) {
                        str8 = "video/dolby-vision";
                        str9 = zza.zza;
                        List list2 = list;
                        int i14 = i8;
                        int i15 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                        zzt zztVar = new zzt();
                        if (!zzas.zza(str8)) {
                            zztVar.zzH(this.zzP);
                            zztVar.zzI(this.zzR);
                            zztVar.zzJ(this.zzS);
                            zztVar.zzK(i7);
                        } else if (zzas.zzb(str8)) {
                            if (this.zzs == 0) {
                                int i16 = this.zzq;
                                i9 = -1;
                                if (i16 == -1) {
                                    i16 = this.zzn;
                                }
                                this.zzq = i16;
                                int i17 = this.zzr;
                                if (i17 == -1) {
                                    i17 = this.zzo;
                                }
                                this.zzr = i17;
                            } else {
                                i9 = -1;
                            }
                            float f = (this.zzq == i9 || (i13 = this.zzr) == i9) ? -1.0f : (this.zzo * r1) / (this.zzn * i13);
                            int i18 = i5;
                            if (i4 == i9) {
                                if (i18 != i9) {
                                    i4 = i9;
                                } else if (i3 == i9 || this.zzB != i9) {
                                    i4 = this.zzz;
                                    i18 = this.zzA;
                                    i3 = this.zzB;
                                } else {
                                    i4 = this.zzz;
                                    i18 = this.zzA;
                                }
                            }
                            if (i6 == i9 && (i6 = this.zzp) == i9) {
                                i6 = 8;
                            }
                            if (i2 == i9) {
                                int i19 = this.zzp;
                                i2 = i19 == i9 ? 8 : i19;
                            }
                            if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                                i10 = 0;
                                bArr2 = null;
                            } else {
                                bArr2 = new byte[25];
                                ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                i10 = 0;
                                order.put((byte) 0);
                                order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                order.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                                order.putShort((short) (this.zzM + 0.5f));
                                order.putShort((short) (this.zzN + 0.5f));
                                order.putShort((short) this.zzC);
                                order.putShort((short) this.zzD);
                            }
                            zzh zzhVar = new zzh();
                            zzhVar.zza(i4);
                            zzhVar.zzb(i3);
                            zzhVar.zzc(i18);
                            zzhVar.zzd(bArr2);
                            zzhVar.zze(i6);
                            zzhVar.zzf(i2);
                            zzi zzg2 = zzhVar.zzg();
                            String str13 = this.zzb;
                            if (str13 != null) {
                                map = zzakt.zzg;
                                if (map.containsKey(str13)) {
                                    String str14 = this.zzb;
                                    map2 = zzakt.zzg;
                                    i11 = ((Integer) map2.get(str14)).intValue();
                                    if (this.zzt == 0 && Float.compare(this.zzu, 0.0f) == 0 && Float.compare(this.zzv, 0.0f) == 0) {
                                        if (Float.compare(this.zzw, 0.0f) != 0) {
                                            i12 = i10;
                                        } else if (Float.compare(this.zzw, 90.0f) == 0) {
                                            i12 = 90;
                                        } else if (Float.compare(this.zzw, -180.0f) == 0 || Float.compare(this.zzw, 180.0f) == 0) {
                                            i12 = 180;
                                        } else if (Float.compare(this.zzw, -90.0f) == 0) {
                                            i12 = 270;
                                        }
                                        zztVar.zzv(this.zzn);
                                        zztVar.zzw(this.zzo);
                                        zztVar.zzC(f);
                                        zztVar.zzA(i12);
                                        zztVar.zzD(this.zzx);
                                        zztVar.zzE(this.zzy);
                                        zztVar.zzF(zzg2);
                                    }
                                    i12 = i11;
                                    zztVar.zzv(this.zzn);
                                    zztVar.zzw(this.zzo);
                                    zztVar.zzC(f);
                                    zztVar.zzA(i12);
                                    zztVar.zzD(this.zzx);
                                    zztVar.zzE(this.zzy);
                                    zztVar.zzF(zzg2);
                                }
                            }
                            i11 = i9;
                            if (this.zzt == 0) {
                                if (Float.compare(this.zzw, 0.0f) != 0) {
                                }
                                zztVar.zzv(this.zzn);
                                zztVar.zzw(this.zzo);
                                zztVar.zzC(f);
                                zztVar.zzA(i12);
                                zztVar.zzD(this.zzx);
                                zztVar.zzE(this.zzy);
                                zztVar.zzF(zzg2);
                            }
                            i12 = i11;
                            zztVar.zzv(this.zzn);
                            zztVar.zzw(this.zzo);
                            zztVar.zzC(f);
                            zztVar.zzA(i12);
                            zztVar.zzD(this.zzx);
                            zztVar.zzE(this.zzy);
                            zztVar.zzF(zzg2);
                        } else if (!str.equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                            throw zzat.zzb("Unexpected MIME type.", null);
                        }
                        str10 = this.zzb;
                        if (str10 != null) {
                            map3 = zzakt.zzg;
                            if (!map3.containsKey(str10)) {
                                zztVar.zzc(this.zzb);
                            }
                        }
                        zztVar.zzb(i);
                        zztVar.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                        zztVar.zzo(str8);
                        zztVar.zzp(i14);
                        zztVar.zze(this.zzad);
                        zztVar.zzf(i15);
                        zztVar.zzr(list2);
                        zztVar.zzk(str9);
                        zztVar.zzs(this.zzm);
                        this.zzaa = zztVar.zzQ();
                        return;
                    }
                } else {
                    str7 = str3;
                }
                str8 = str12;
                str9 = str7;
                List list22 = list;
                int i142 = i8;
                int i152 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2.zzb(i);
                zztVar2.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2.zzo(str8);
                zztVar2.zzp(i142);
                zztVar2.zze(this.zzad);
                zztVar2.zzf(i152);
                zztVar2.zzr(list22);
                zztVar2.zzk(str9);
                zztVar2.zzs(this.zzm);
                this.zzaa = zztVar2.zzQ();
                return;
            case 1:
                str = "application/x-subrip";
                byte[] bArr3 = this.zzl;
                zzj = bArr3 == null ? null : zzgxm.zzj(bArr3);
                str2 = "video/x-vnd.on2.vp9";
                list = zzj;
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222 = list;
                int i1422 = i8;
                int i1522 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22.zzb(i);
                zztVar22.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22.zzo(str8);
                zztVar22.zzp(i1422);
                zztVar22.zze(this.zzad);
                zztVar22.zzf(i1522);
                zztVar22.zzr(list222);
                zztVar22.zzk(str9);
                zztVar22.zzs(this.zzm);
                this.zzaa = zztVar22.zzQ();
                return;
            case 2:
                str = "application/x-subrip";
                byte[] bArr4 = this.zzl;
                str2 = "video/av01";
                if (bArr4 != null) {
                    zzj = zzgxm.zzj(bArr4);
                    zzafl zza2 = zzafl.zza(this.zzl);
                    if (zza2 != null) {
                        String str15 = zza2.zze;
                        i2 = zza2.zza;
                        int i20 = zza2.zzc;
                        int i21 = zza2.zzd;
                        int i22 = zza2.zzb;
                        i3 = i20;
                        i4 = i22;
                        i5 = i21;
                        str12 = "video/av01";
                        list = zzj;
                        str3 = str15;
                        i6 = i2;
                        i7 = -1;
                        i8 = -1;
                        if (this.zzO != null) {
                        }
                        str8 = str12;
                        str9 = str7;
                        List list2222 = list;
                        int i14222 = i8;
                        int i15222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                        zzt zztVar222 = new zzt();
                        if (!zzas.zza(str8)) {
                        }
                        str10 = this.zzb;
                        if (str10 != null) {
                        }
                        zztVar222.zzb(i);
                        zztVar222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                        zztVar222.zzo(str8);
                        zztVar222.zzp(i14222);
                        zztVar222.zze(this.zzad);
                        zztVar222.zzf(i15222);
                        zztVar222.zzr(list2222);
                        zztVar222.zzk(str9);
                        zztVar222.zzs(this.zzm);
                        this.zzaa = zztVar222.zzQ();
                        return;
                    }
                    list = zzj;
                    str12 = str2;
                    i7 = -1;
                    i3 = -1;
                    i8 = -1;
                    str3 = null;
                    i2 = -1;
                    i4 = -1;
                    i6 = -1;
                    i5 = -1;
                    if (this.zzO != null) {
                    }
                    str8 = str12;
                    str9 = str7;
                    List list22222 = list;
                    int i142222 = i8;
                    int i152222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar2222 = new zzt();
                    if (!zzas.zza(str8)) {
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                    }
                    zztVar2222.zzb(i);
                    zztVar2222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar2222.zzo(str8);
                    zztVar2222.zzp(i142222);
                    zztVar2222.zze(this.zzad);
                    zztVar2222.zzf(i152222);
                    zztVar2222.zzr(list22222);
                    zztVar2222.zzk(str9);
                    zztVar2222.zzs(this.zzm);
                    this.zzaa = zztVar2222.zzQ();
                    return;
                }
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                list = null;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222 = list;
                int i1422222 = i8;
                int i1522222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222.zzb(i);
                zztVar22222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222.zzo(str8);
                zztVar22222.zzp(i1422222);
                zztVar22222.zze(this.zzad);
                zztVar22222.zzf(i1522222);
                zztVar22222.zzr(list222222);
                zztVar22222.zzk(str9);
                zztVar22222.zzs(this.zzm);
                this.zzaa = zztVar22222.zzQ();
                return;
            case 3:
                str = "application/x-subrip";
                str2 = "video/mpeg2";
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                list = null;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222 = list;
                int i14222222 = i8;
                int i15222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222.zzb(i);
                zztVar222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222.zzo(str8);
                zztVar222222.zzp(i14222222);
                zztVar222222.zze(this.zzad);
                zztVar222222.zzf(i15222222);
                zztVar222222.zzr(list2222222);
                zztVar222222.zzk(str9);
                zztVar222222.zzs(this.zzm);
                this.zzaa = zztVar222222.zzQ();
                return;
            case 4:
            case 5:
            case 6:
                str = "application/x-subrip";
                byte[] bArr5 = this.zzl;
                zzj = bArr5 == null ? null : Collections.singletonList(bArr5);
                str2 = "video/mp4v-es";
                list = zzj;
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222 = list;
                int i142222222 = i8;
                int i152222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222.zzb(i);
                zztVar2222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222.zzo(str8);
                zztVar2222222.zzp(i142222222);
                zztVar2222222.zze(this.zzad);
                zztVar2222222.zzf(i152222222);
                zztVar2222222.zzr(list22222222);
                zztVar2222222.zzk(str9);
                zztVar2222222.zzs(this.zzm);
                this.zzaa = zztVar2222222.zzQ();
                return;
            case 7:
                str = "application/x-subrip";
                zzafm zza3 = zzafm.zza(new zzeu(zzi(this.zzc)));
                List list3 = zza3.zza;
                this.zzab = zza3.zzb;
                String str16 = zza3.zzl;
                i4 = zza3.zzg;
                i5 = zza3.zzi;
                str12 = "video/avc";
                list = list3;
                i3 = zza3.zzh;
                i6 = zza3.zze;
                i2 = zza3.zzf;
                str3 = str16;
                i7 = -1;
                i8 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222 = list;
                int i1422222222 = i8;
                int i1522222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222.zzb(i);
                zztVar22222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222.zzo(str8);
                zztVar22222222.zzp(i1422222222);
                zztVar22222222.zze(this.zzad);
                zztVar22222222.zzf(i1522222222);
                zztVar22222222.zzr(list222222222);
                zztVar22222222.zzk(str9);
                zztVar22222222.zzs(this.zzm);
                this.zzaa = zztVar22222222.zzQ();
                return;
            case '\b':
                str = "application/x-subrip";
                zzahb zza4 = zzahb.zza(new zzeu(zzi(this.zzc)));
                List list4 = zza4.zza;
                this.zzab = zza4.zzb;
                str3 = zza4.zzn;
                int i23 = zza4.zzh;
                int i24 = zza4.zzj;
                i3 = zza4.zzi;
                i4 = i23;
                i5 = i24;
                str12 = "video/hevc";
                list = list4;
                i6 = zza4.zzf;
                i8 = -1;
                i2 = zza4.zzg;
                i7 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222 = list;
                int i14222222222 = i8;
                int i15222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222.zzb(i);
                zztVar222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222.zzo(str8);
                zztVar222222222.zzp(i14222222222);
                zztVar222222222.zze(this.zzad);
                zztVar222222222.zzf(i15222222222);
                zztVar222222222.zzr(list2222222222);
                zztVar222222222.zzk(str9);
                zztVar222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222.zzQ();
                return;
            case '\t':
                str = "application/x-subrip";
                Pair zzf = zzf(new zzeu(zzi(this.zzc)));
                str2 = (String) zzf.first;
                zzj = (List) zzf.second;
                list = zzj;
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222 = list;
                int i142222222222 = i8;
                int i152222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222.zzb(i);
                zztVar2222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222.zzo(str8);
                zztVar2222222222.zzp(i142222222222);
                zztVar2222222222.zze(this.zzad);
                zztVar2222222222.zzf(i152222222222);
                zztVar2222222222.zzr(list22222222222);
                zztVar2222222222.zzk(str9);
                zztVar2222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222.zzQ();
                return;
            case '\n':
                str = "application/x-subrip";
                str2 = "video/x-unknown";
                str12 = str2;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                list = null;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222 = list;
                int i1422222222222 = i8;
                int i1522222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222.zzb(i);
                zztVar22222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222.zzo(str8);
                zztVar22222222222.zzp(i1422222222222);
                zztVar22222222222.zze(this.zzad);
                zztVar22222222222.zzf(i1522222222222);
                zztVar22222222222.zzr(list222222222222);
                zztVar22222222222.zzk(str9);
                zztVar22222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222.zzQ();
                return;
            case 11:
                str = "application/x-subrip";
                zzg = zzg(zzi(str11));
                i8 = 8192;
                str4 = "audio/vorbis";
                list = zzg;
                str12 = str4;
                i7 = -1;
                i3 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222 = list;
                int i14222222222222 = i8;
                int i15222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222.zzb(i);
                zztVar222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222.zzo(str8);
                zztVar222222222222.zzp(i14222222222222);
                zztVar222222222222.zze(this.zzad);
                zztVar222222222222.zzf(i15222222222222);
                zztVar222222222222.zzr(list2222222222222);
                zztVar222222222222.zzk(str9);
                zztVar222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222.zzQ();
                return;
            case '\f':
                zzg = new ArrayList(3);
                zzg.add(zzi(this.zzc));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                str = "application/x-subrip";
                zzg.add(allocate.order(byteOrder).putLong(this.zzT).array());
                zzg.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzU).array());
                i8 = 5760;
                str4 = "audio/opus";
                list = zzg;
                str12 = str4;
                i7 = -1;
                i3 = -1;
                str3 = null;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222 = list;
                int i142222222222222 = i8;
                int i152222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222.zzb(i);
                zztVar2222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222.zzo(str8);
                zztVar2222222222222.zzp(i142222222222222);
                zztVar2222222222222.zze(this.zzad);
                zztVar2222222222222.zzf(i152222222222222);
                zztVar2222222222222.zzr(list22222222222222);
                zztVar2222222222222.zzk(str9);
                zztVar2222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222.zzQ();
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str11));
                zzafe zza5 = zzaff.zza(this.zzl);
                this.zzS = zza5.zza;
                this.zzP = zza5.zzb;
                str5 = "audio/mp4a-latm";
                list = singletonList2;
                str3 = zza5.zzc;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222 = list;
                int i1422222222222222 = i8;
                int i1522222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222.zzb(i);
                zztVar22222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222.zzo(str8);
                zztVar22222222222222.zzp(i1422222222222222);
                zztVar22222222222222.zze(this.zzad);
                zztVar22222222222222.zzf(i1522222222222222);
                zztVar22222222222222.zzr(list222222222222222);
                zztVar22222222222222.zzk(str9);
                zztVar22222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222.zzQ();
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                str3 = null;
                str = "application/x-subrip";
                str12 = str6;
                i7 = -1;
                i3 = -1;
                i8 = 4096;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222 = list;
                int i14222222222222222 = i8;
                int i15222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222.zzb(i);
                zztVar222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222.zzo(str8);
                zztVar222222222222222.zzp(i14222222222222222);
                zztVar222222222222222.zze(this.zzad);
                zztVar222222222222222.zzf(i15222222222222222);
                zztVar222222222222222.zzr(list2222222222222222);
                zztVar222222222222222.zzk(str9);
                zztVar222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222.zzQ();
                return;
            case 15:
                str6 = "audio/mpeg";
                str3 = null;
                str = "application/x-subrip";
                str12 = str6;
                i7 = -1;
                i3 = -1;
                i8 = 4096;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222 = list;
                int i142222222222222222 = i8;
                int i152222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222.zzb(i);
                zztVar2222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222.zzo(str8);
                zztVar2222222222222222.zzp(i142222222222222222);
                zztVar2222222222222222.zze(this.zzad);
                zztVar2222222222222222.zzf(i152222222222222222);
                zztVar2222222222222222.zzr(list22222222222222222);
                zztVar2222222222222222.zzk(str9);
                zztVar2222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222.zzQ();
                return;
            case 16:
                str5 = "audio/ac3";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222 = list;
                int i1422222222222222222 = i8;
                int i1522222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222.zzb(i);
                zztVar22222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222.zzo(str8);
                zztVar22222222222222222.zzp(i1422222222222222222);
                zztVar22222222222222222.zze(this.zzad);
                zztVar22222222222222222.zzf(i1522222222222222222);
                zztVar22222222222222222.zzr(list222222222222222222);
                zztVar22222222222222222.zzk(str9);
                zztVar22222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222.zzQ();
                return;
            case 17:
                str5 = "audio/eac3";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222222 = list;
                int i14222222222222222222 = i8;
                int i15222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222222.zzb(i);
                zztVar222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222.zzo(str8);
                zztVar222222222222222222.zzp(i14222222222222222222);
                zztVar222222222222222222.zze(this.zzad);
                zztVar222222222222222222.zzf(i15222222222222222222);
                zztVar222222222222222222.zzr(list2222222222222222222);
                zztVar222222222222222222.zzk(str9);
                zztVar222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222.zzQ();
                return;
            case 18:
                this.zzV = new zzahu();
                str5 = "audio/true-hd";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222 = list;
                int i142222222222222222222 = i8;
                int i152222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222.zzb(i);
                zztVar2222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222.zzo(str8);
                zztVar2222222222222222222.zzp(i142222222222222222222);
                zztVar2222222222222222222.zze(this.zzad);
                zztVar2222222222222222222.zzf(i152222222222222222222);
                zztVar2222222222222222222.zzr(list22222222222222222222);
                zztVar2222222222222222222.zzk(str9);
                zztVar2222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222.zzQ();
                return;
            case 19:
                this.zzW = true;
                str5 = "audio/vnd.dts";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222222 = list;
                int i1422222222222222222222 = i8;
                int i1522222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222222.zzb(i);
                zztVar22222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222.zzo(str8);
                zztVar22222222222222222222.zzp(i1422222222222222222222);
                zztVar22222222222222222222.zze(this.zzad);
                zztVar22222222222222222222.zzf(i1522222222222222222222);
                zztVar22222222222222222222.zzr(list222222222222222222222);
                zztVar22222222222222222222.zzk(str9);
                zztVar22222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222.zzQ();
                return;
            case 20:
                str5 = "audio/vnd.dts.hd;profile=lbr";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222222222 = list;
                int i14222222222222222222222 = i8;
                int i15222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222222222.zzb(i);
                zztVar222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222.zzo(str8);
                zztVar222222222222222222222.zzp(i14222222222222222222222);
                zztVar222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222.zzf(i15222222222222222222222);
                zztVar222222222222222222222.zzr(list2222222222222222222222);
                zztVar222222222222222222222.zzk(str9);
                zztVar222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222.zzQ();
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                str3 = null;
                str = "application/x-subrip";
                str12 = str5;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222222 = list;
                int i142222222222222222222222 = i8;
                int i152222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222222.zzb(i);
                zztVar2222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222.zzo(str8);
                zztVar2222222222222222222222.zzp(i142222222222222222222222);
                zztVar2222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222.zzf(i152222222222222222222222);
                zztVar2222222222222222222222.zzr(list22222222222222222222222);
                zztVar2222222222222222222222.zzk(str9);
                zztVar2222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222.zzQ();
                return;
            case 22:
                singletonList = Collections.singletonList(zzi(str11));
                str3 = null;
                str = "application/x-subrip";
                str12 = "audio/flac";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                list = singletonList;
                i7 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222222222 = list;
                int i1422222222222222222222222 = i8;
                int i1522222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222222222.zzb(i);
                zztVar22222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222.zzo(str8);
                zztVar22222222222222222222222.zzp(i1422222222222222222222222);
                zztVar22222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222.zzf(i1522222222222222222222222);
                zztVar22222222222222222222222.zzr(list222222222222222222222222);
                zztVar22222222222222222222222.zzk(str9);
                zztVar22222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222.zzQ();
                return;
            case 23:
                if (zzh(new zzeu(zzi(this.zzc)))) {
                    i7 = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (i7 == 0) {
                        int i25 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i25).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i25);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzeh.zzc("MatroskaExtractor", sb.toString());
                    }
                    str3 = null;
                    str = "application/x-subrip";
                    str12 = "audio/raw";
                    i3 = -1;
                    i8 = -1;
                    i2 = -1;
                    i4 = -1;
                    i6 = -1;
                    i5 = -1;
                    if (this.zzO != null) {
                    }
                    str8 = str12;
                    str9 = str7;
                    List list2222222222222222222222222 = list;
                    int i14222222222222222222222222 = i8;
                    int i15222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar222222222222222222222222 = new zzt();
                    if (!zzas.zza(str8)) {
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                    }
                    zztVar222222222222222222222222.zzb(i);
                    zztVar222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222222222222222222222222.zzo(str8);
                    zztVar222222222222222222222222.zzp(i14222222222222222222222222);
                    zztVar222222222222222222222222.zze(this.zzad);
                    zztVar222222222222222222222222.zzf(i15222222222222222222222222);
                    zztVar222222222222222222222222.zzr(list2222222222222222222222222);
                    zztVar222222222222222222222222.zzk(str9);
                    zztVar222222222222222222222222.zzs(this.zzm);
                    this.zzaa = zztVar222222222222222222222222.zzQ();
                    return;
                }
                zzeh.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str3 = null;
                str = "application/x-subrip";
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222222222 = list;
                int i142222222222222222222222222 = i8;
                int i152222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222.zzo(str8);
                zztVar2222222222222222222222222.zzp(i142222222222222222222222222);
                zztVar2222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222.zzf(i152222222222222222222222222);
                zztVar2222222222222222222222222.zzr(list22222222222222222222222222);
                zztVar2222222222222222222222222.zzk(str9);
                zztVar2222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222.zzQ();
                return;
            case 24:
                i7 = zzfm.zzC(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    int i26 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i26).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i26);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb2.toString());
                    str3 = null;
                    str = "application/x-subrip";
                    i7 = -1;
                    i3 = -1;
                    i8 = -1;
                    i2 = -1;
                    i4 = -1;
                    i6 = -1;
                    i5 = -1;
                    if (this.zzO != null) {
                    }
                    str8 = str12;
                    str9 = str7;
                    List list222222222222222222222222222 = list;
                    int i1422222222222222222222222222 = i8;
                    int i1522222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar22222222222222222222222222 = new zzt();
                    if (!zzas.zza(str8)) {
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                    }
                    zztVar22222222222222222222222222.zzb(i);
                    zztVar22222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar22222222222222222222222222.zzo(str8);
                    zztVar22222222222222222222222222.zzp(i1422222222222222222222222222);
                    zztVar22222222222222222222222222.zze(this.zzad);
                    zztVar22222222222222222222222222.zzf(i1522222222222222222222222222);
                    zztVar22222222222222222222222222.zzr(list222222222222222222222222222);
                    zztVar22222222222222222222222222.zzk(str9);
                    zztVar22222222222222222222222222.zzs(this.zzm);
                    this.zzaa = zztVar22222222222222222222222222.zzQ();
                    return;
                }
                str3 = null;
                str = "application/x-subrip";
                str12 = "audio/raw";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222222222222222 = list;
                int i14222222222222222222222222222 = i8;
                int i15222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222.zzo(str8);
                zztVar222222222222222222222222222.zzp(i14222222222222222222222222222);
                zztVar222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222.zzf(i15222222222222222222222222222);
                zztVar222222222222222222222222222.zzr(list2222222222222222222222222222);
                zztVar222222222222222222222222222.zzk(str9);
                zztVar222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222.zzQ();
                return;
            case 25:
                i7 = zzfm.zzC(this.zzQ, ByteOrder.BIG_ENDIAN);
                if (i7 == 0) {
                    int i27 = this.zzQ;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i27).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i27);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb3.toString());
                    str3 = null;
                    str = "application/x-subrip";
                    i7 = -1;
                    i3 = -1;
                    i8 = -1;
                    i2 = -1;
                    i4 = -1;
                    i6 = -1;
                    i5 = -1;
                    if (this.zzO != null) {
                    }
                    str8 = str12;
                    str9 = str7;
                    List list22222222222222222222222222222 = list;
                    int i142222222222222222222222222222 = i8;
                    int i152222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar2222222222222222222222222222 = new zzt();
                    if (!zzas.zza(str8)) {
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                    }
                    zztVar2222222222222222222222222222.zzb(i);
                    zztVar2222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar2222222222222222222222222222.zzo(str8);
                    zztVar2222222222222222222222222222.zzp(i142222222222222222222222222222);
                    zztVar2222222222222222222222222222.zze(this.zzad);
                    zztVar2222222222222222222222222222.zzf(i152222222222222222222222222222);
                    zztVar2222222222222222222222222222.zzr(list22222222222222222222222222222);
                    zztVar2222222222222222222222222222.zzk(str9);
                    zztVar2222222222222222222222222222.zzs(this.zzm);
                    this.zzaa = zztVar2222222222222222222222222222.zzQ();
                    return;
                }
                str3 = null;
                str = "application/x-subrip";
                str12 = "audio/raw";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222222222222222 = list;
                int i1422222222222222222222222222222 = i8;
                int i1522222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222.zzo(str8);
                zztVar22222222222222222222222222222.zzp(i1422222222222222222222222222222);
                zztVar22222222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222222.zzf(i1522222222222222222222222222222);
                zztVar22222222222222222222222222222.zzr(list222222222222222222222222222222);
                zztVar22222222222222222222222222222.zzk(str9);
                zztVar22222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222222.zzQ();
                return;
            case 26:
                i7 = zzfm.zzD(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    int i28 = this.zzQ;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i28).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i28);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeh.zzc("MatroskaExtractor", sb4.toString());
                    str3 = null;
                    str = "application/x-subrip";
                    i7 = -1;
                    i3 = -1;
                    i8 = -1;
                    i2 = -1;
                    i4 = -1;
                    i6 = -1;
                    i5 = -1;
                    if (this.zzO != null) {
                    }
                    str8 = str12;
                    str9 = str7;
                    List list2222222222222222222222222222222 = list;
                    int i14222222222222222222222222222222 = i8;
                    int i15222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                    zzt zztVar222222222222222222222222222222 = new zzt();
                    if (!zzas.zza(str8)) {
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                    }
                    zztVar222222222222222222222222222222.zzb(i);
                    zztVar222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                    zztVar222222222222222222222222222222.zzo(str8);
                    zztVar222222222222222222222222222222.zzp(i14222222222222222222222222222222);
                    zztVar222222222222222222222222222222.zze(this.zzad);
                    zztVar222222222222222222222222222222.zzf(i15222222222222222222222222222222);
                    zztVar222222222222222222222222222222.zzr(list2222222222222222222222222222222);
                    zztVar222222222222222222222222222222.zzk(str9);
                    zztVar222222222222222222222222222222.zzs(this.zzm);
                    this.zzaa = zztVar222222222222222222222222222222.zzQ();
                    return;
                }
                str3 = null;
                str = "application/x-subrip";
                str12 = "audio/raw";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222222222222222 = list;
                int i142222222222222222222222222222222 = i8;
                int i152222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222.zzo(str8);
                zztVar2222222222222222222222222222222.zzp(i142222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222222222.zzf(i152222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzr(list22222222222222222222222222222222);
                zztVar2222222222222222222222222222222.zzk(str9);
                zztVar2222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222222222.zzQ();
                return;
            case 27:
                str3 = null;
                str = "application/x-subrip";
                str12 = str;
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222222222222222222 = list;
                int i1422222222222222222222222222222222 = i8;
                int i1522222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222222.zzo(str8);
                zztVar22222222222222222222222222222222.zzp(i1422222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222222222.zzf(i1522222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zzr(list222222222222222222222222222222222);
                zztVar22222222222222222222222222222222.zzk(str9);
                zztVar22222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222222222.zzQ();
                return;
            case 28:
            case 29:
                int i29 = zzakt.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = zzakt.zzc;
                singletonList = zzgxm.zzk(bArr, zzi);
                str3 = null;
                str = "application/x-subrip";
                str12 = "text/x-ssa";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                list = singletonList;
                i7 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222222222222222222222 = list;
                int i14222222222222222222222222222222222 = i8;
                int i15222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222222.zzo(str8);
                zztVar222222222222222222222222222222222.zzp(i14222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222222222.zzf(i15222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zzr(list2222222222222222222222222222222222);
                zztVar222222222222222222222222222222222.zzk(str9);
                zztVar222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222222222.zzQ();
                return;
            case 30:
                str3 = null;
                str = "application/x-subrip";
                str12 = "text/vtt";
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222222222222222222 = list;
                int i142222222222222222222222222222222222 = i8;
                int i152222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222222.zzo(str8);
                zztVar2222222222222222222222222222222222.zzp(i142222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222222222222.zzf(i152222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222.zzr(list22222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222.zzk(str9);
                zztVar2222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222222222222.zzQ();
                return;
            case 31:
                singletonList = zzgxm.zzj(zzi(str11));
                str12 = "application/vobsub";
                str3 = null;
                str = "application/x-subrip";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                list = singletonList;
                i7 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list222222222222222222222222222222222222 = list;
                int i1422222222222222222222222222222222222 = i8;
                int i1522222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar22222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar22222222222222222222222222222222222.zzb(i);
                zztVar22222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar22222222222222222222222222222222222.zzo(str8);
                zztVar22222222222222222222222222222222222.zzp(i1422222222222222222222222222222222222);
                zztVar22222222222222222222222222222222222.zze(this.zzad);
                zztVar22222222222222222222222222222222222.zzf(i1522222222222222222222222222222222222);
                zztVar22222222222222222222222222222222222.zzr(list222222222222222222222222222222222222);
                zztVar22222222222222222222222222222222222.zzk(str9);
                zztVar22222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar22222222222222222222222222222222222.zzQ();
                return;
            case ' ':
                str12 = "application/pgs";
                str3 = null;
                str = "application/x-subrip";
                i7 = -1;
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list2222222222222222222222222222222222222 = list;
                int i14222222222222222222222222222222222222 = i8;
                int i15222222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar222222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar222222222222222222222222222222222222.zzb(i);
                zztVar222222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar222222222222222222222222222222222222.zzo(str8);
                zztVar222222222222222222222222222222222222.zzp(i14222222222222222222222222222222222222);
                zztVar222222222222222222222222222222222222.zze(this.zzad);
                zztVar222222222222222222222222222222222222.zzf(i15222222222222222222222222222222222222);
                zztVar222222222222222222222222222222222222.zzr(list2222222222222222222222222222222222222);
                zztVar222222222222222222222222222222222222.zzk(str9);
                zztVar222222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar222222222222222222222222222222222222.zzQ();
                return;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str11), 0, bArr6, 0, 4);
                singletonList = zzgxm.zzj(bArr6);
                str12 = "application/dvbsubs";
                str3 = null;
                str = "application/x-subrip";
                i3 = -1;
                i8 = -1;
                i2 = -1;
                i4 = -1;
                i6 = -1;
                i5 = -1;
                list = singletonList;
                i7 = -1;
                if (this.zzO != null) {
                }
                str8 = str12;
                str9 = str7;
                List list22222222222222222222222222222222222222 = list;
                int i142222222222222222222222222222222222222 = i8;
                int i152222222222222222222222222222222222222 = (this.zzY ? 1 : 0) | (true == this.zzX ? 0 : 2);
                zzt zztVar2222222222222222222222222222222222222 = new zzt();
                if (!zzas.zza(str8)) {
                }
                str10 = this.zzb;
                if (str10 != null) {
                }
                zztVar2222222222222222222222222222222222222.zzb(i);
                zztVar2222222222222222222222222222222222222.zzn(true == this.zza ? "video/x-matroska" : "video/webm");
                zztVar2222222222222222222222222222222222222.zzo(str8);
                zztVar2222222222222222222222222222222222222.zzp(i142222222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222222.zze(this.zzad);
                zztVar2222222222222222222222222222222222222.zzf(i152222222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222222.zzr(list22222222222222222222222222222222222222);
                zztVar2222222222222222222222222222222222222.zzk(str9);
                zztVar2222222222222222222222222222222222222.zzs(this.zzm);
                this.zzaa = zztVar2222222222222222222222222222222222222.zzQ();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzZ.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzac;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzac = i;
    }

    final /* synthetic */ void zze(String str) {
        this.zzad = str;
    }
}
