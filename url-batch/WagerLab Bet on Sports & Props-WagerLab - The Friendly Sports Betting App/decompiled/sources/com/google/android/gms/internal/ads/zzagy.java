package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import com.facebook.imagepipeline.common.RotationOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzagy {
    public byte[] zzO;
    public zzaec zzU;
    public boolean zzW;
    public zzaeb zzY;
    public zzu zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzaea zzj;
    public byte[] zzk;
    public zzp zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
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
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    protected zzagy() {
    }

    private static Pair zzf(zzef zzefVar) throws zzas {
        try {
            zzefVar.zzk(16);
            long zzA = zzefVar.zzA();
            if (zzA == 1482049860) {
                return new Pair(MimeTypes.VIDEO_DIVX, null);
            }
            if (zzA == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (zzA != 826496599) {
                zzds.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int zzg = zzefVar.zzg() + 20;
            byte[] zzi = zzefVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzas.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzg + 1;
                if (zzi[zzg] == 0 && zzi[i] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzas {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
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
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzas.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzef zzefVar) throws zzas {
        UUID uuid;
        UUID uuid2;
        try {
            int zzu = zzefVar.zzu();
            if (zzu == 1) {
                return true;
            }
            if (zzu == 65534) {
                zzefVar.zzh(24);
                long zzD = zzefVar.zzD();
                uuid = zzagz.zzf;
                if (zzD == uuid.getMostSignificantBits()) {
                    long zzD2 = zzefVar.zzD();
                    uuid2 = zzagz.zzf;
                    if (zzD2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzas.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzas {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        String.valueOf(str);
        throw zzas.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0440  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzacx zzacxVar, int i) throws zzas {
        char c;
        List zzj;
        List list;
        String str;
        String str2;
        int i2;
        List zzg;
        int i3;
        byte[] bArr;
        String str3;
        int i4;
        zzh zzhVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i5;
        Map map3;
        zzeq zza;
        String str4 = this.zzc;
        int i6 = 4;
        int i7 = 0;
        int i8 = -1;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str4.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str5 = MimeTypes.AUDIO_RAW;
        switch (c) {
            case 0:
                str5 = MimeTypes.VIDEO_VP8;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null && (zza = zzeq.zza(new zzef(this.zzO))) != null) {
                    str2 = zza.zza;
                    str5 = MimeTypes.VIDEO_DOLBY_VISION;
                }
                str3 = str5;
                int i9 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar = new zzs();
                if (!zzar.zza(str3)) {
                    zzsVar.zzE(this.zzP);
                    zzsVar.zzF(this.zzR);
                    zzsVar.zzG(i6);
                    i4 = 1;
                } else if (zzar.zzb(str3)) {
                    if (this.zzr == 0) {
                        int i10 = this.zzp;
                        if (i10 == -1) {
                            i10 = this.zzm;
                        }
                        this.zzp = i10;
                        int i11 = this.zzq;
                        if (i11 == -1) {
                            i11 = this.zzn;
                        }
                        this.zzq = i11;
                    }
                    float f = (this.zzp == -1 || (i5 = this.zzq) == -1) ? -1.0f : (this.zzn * r7) / (this.zzm * i5);
                    if (this.zzy) {
                        if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr2 = null;
                        } else {
                            bArr2 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
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
                        zzg zzgVar = new zzg();
                        zzgVar.zza(this.zzz);
                        zzgVar.zzb(this.zzB);
                        zzgVar.zzc(this.zzA);
                        zzgVar.zzd(bArr2);
                        zzgVar.zze(this.zzo);
                        zzgVar.zzf(this.zzo);
                        zzhVar = zzgVar.zzg();
                    } else {
                        zzhVar = null;
                    }
                    if (this.zzb != null) {
                        int i12 = zzagz.zza;
                        String str6 = this.zzb;
                        map = zzagz.zzg;
                        if (map.containsKey(str6)) {
                            String str7 = this.zzb;
                            map2 = zzagz.zzg;
                            i8 = ((Integer) map2.get(str7)).intValue();
                        }
                    }
                    if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                        if (Float.compare(this.zzv, 0.0f) != 0) {
                            if (Float.compare(this.zzv, 90.0f) == 0) {
                                i7 = 90;
                            } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                                i7 = RotationOptions.ROTATE_180;
                            } else if (Float.compare(this.zzv, -90.0f) == 0) {
                                i7 = RotationOptions.ROTATE_270;
                            }
                        }
                        zzsVar.zzt(this.zzm);
                        zzsVar.zzu(this.zzn);
                        zzsVar.zzz(f);
                        zzsVar.zzy(i7);
                        zzsVar.zzA(this.zzw);
                        zzsVar.zzB(this.zzx);
                        zzsVar.zzC(zzhVar);
                        i4 = 2;
                    }
                    i7 = i8;
                    zzsVar.zzt(this.zzm);
                    zzsVar.zzu(this.zzn);
                    zzsVar.zzz(f);
                    zzsVar.zzy(i7);
                    zzsVar.zzA(this.zzw);
                    zzsVar.zzB(this.zzx);
                    zzsVar.zzC(zzhVar);
                    i4 = 2;
                } else {
                    if (!MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                        throw zzas.zzb("Unexpected MIME type.", null);
                    }
                    i4 = 3;
                }
                if (this.zzb != null) {
                    int i13 = zzagz.zza;
                    String str8 = this.zzb;
                    map3 = zzagz.zzg;
                    if (!map3.containsKey(str8)) {
                        zzsVar.zzc(this.zzb);
                    }
                }
                zzsVar.zzb(i);
                zzsVar.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar.zzm(str3);
                zzsVar.zzn(i2);
                zzsVar.zze(this.zzac);
                zzsVar.zzf(i9);
                zzsVar.zzp(list);
                zzsVar.zzj(str2);
                zzsVar.zzq(this.zzl);
                this.zzZ = zzsVar.zzM();
                zzaeb zzu = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu;
                if (this.zzV) {
                    zzu.zzu(this.zzZ);
                    return;
                }
                return;
            case 1:
                byte[] bArr3 = this.zzk;
                zzj = bArr3 == null ? null : zzgjz.zzj(bArr3);
                str5 = MimeTypes.VIDEO_VP9;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                    str2 = zza.zza;
                    str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    break;
                }
                str3 = str5;
                int i92 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2.zzb(i);
                zzsVar2.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2.zzm(str3);
                zzsVar2.zzn(i2);
                zzsVar2.zze(this.zzac);
                zzsVar2.zzf(i92);
                zzsVar2.zzp(list);
                zzsVar2.zzj(str2);
                zzsVar2.zzq(this.zzl);
                this.zzZ = zzsVar2.zzM();
                zzaeb zzu2 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2;
                if (this.zzV) {
                }
                break;
            case 2:
                byte[] bArr4 = this.zzk;
                zzj = bArr4 == null ? null : zzgjz.zzj(bArr4);
                str5 = MimeTypes.VIDEO_AV1;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22.zzb(i);
                zzsVar22.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22.zzm(str3);
                zzsVar22.zzn(i2);
                zzsVar22.zze(this.zzac);
                zzsVar22.zzf(i922);
                zzsVar22.zzp(list);
                zzsVar22.zzj(str2);
                zzsVar22.zzq(this.zzl);
                this.zzZ = zzsVar22.zzM();
                zzaeb zzu22 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22;
                if (this.zzV) {
                }
                break;
            case 3:
                str5 = MimeTypes.VIDEO_MPEG2;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222.zzb(i);
                zzsVar222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222.zzm(str3);
                zzsVar222.zzn(i2);
                zzsVar222.zze(this.zzac);
                zzsVar222.zzf(i9222);
                zzsVar222.zzp(list);
                zzsVar222.zzj(str2);
                zzsVar222.zzq(this.zzl);
                this.zzZ = zzsVar222.zzM();
                zzaeb zzu222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222;
                if (this.zzV) {
                }
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzk;
                zzj = bArr5 == null ? null : Collections.singletonList(bArr5);
                str5 = MimeTypes.VIDEO_MP4V;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222.zzb(i);
                zzsVar2222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222.zzm(str3);
                zzsVar2222.zzn(i2);
                zzsVar2222.zze(this.zzac);
                zzsVar2222.zzf(i92222);
                zzsVar2222.zzp(list);
                zzsVar2222.zzj(str2);
                zzsVar2222.zzq(this.zzl);
                this.zzZ = zzsVar2222.zzM();
                zzaeb zzu2222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222;
                if (this.zzV) {
                }
                break;
            case 7:
                zzabz zza2 = zzabz.zza(new zzef(zzi(this.zzc)));
                list = zza2.zza;
                this.zzaa = zza2.zzb;
                str = zza2.zzl;
                str5 = MimeTypes.VIDEO_H264;
                str2 = str;
                i2 = -1;
                i6 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222.zzb(i);
                zzsVar22222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222.zzm(str3);
                zzsVar22222.zzn(i2);
                zzsVar22222.zze(this.zzac);
                zzsVar22222.zzf(i922222);
                zzsVar22222.zzp(list);
                zzsVar22222.zzj(str2);
                zzsVar22222.zzq(this.zzl);
                this.zzZ = zzsVar22222.zzM();
                zzaeb zzu22222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222;
                if (this.zzV) {
                }
                break;
            case '\b':
                zzadl zza3 = zzadl.zza(new zzef(zzi(this.zzc)));
                list = zza3.zza;
                this.zzaa = zza3.zzb;
                str = zza3.zzn;
                str5 = MimeTypes.VIDEO_H265;
                str2 = str;
                i2 = -1;
                i6 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222.zzb(i);
                zzsVar222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222.zzm(str3);
                zzsVar222222.zzn(i2);
                zzsVar222222.zze(this.zzac);
                zzsVar222222.zzf(i9222222);
                zzsVar222222.zzp(list);
                zzsVar222222.zzj(str2);
                zzsVar222222.zzq(this.zzl);
                this.zzZ = zzsVar222222.zzM();
                zzaeb zzu222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222;
                if (this.zzV) {
                }
                break;
            case '\t':
                Pair zzf = zzf(new zzef(zzi(this.zzc)));
                str5 = (String) zzf.first;
                zzj = (List) zzf.second;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222.zzb(i);
                zzsVar2222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222.zzm(str3);
                zzsVar2222222.zzn(i2);
                zzsVar2222222.zze(this.zzac);
                zzsVar2222222.zzf(i92222222);
                zzsVar2222222.zzp(list);
                zzsVar2222222.zzj(str2);
                zzsVar2222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222.zzM();
                zzaeb zzu2222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222;
                if (this.zzV) {
                }
                break;
            case '\n':
                str5 = MimeTypes.VIDEO_UNKNOWN;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222.zzb(i);
                zzsVar22222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222.zzm(str3);
                zzsVar22222222.zzn(i2);
                zzsVar22222222.zze(this.zzac);
                zzsVar22222222.zzf(i922222222);
                zzsVar22222222.zzp(list);
                zzsVar22222222.zzj(str2);
                zzsVar22222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222.zzM();
                zzaeb zzu22222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222;
                if (this.zzV) {
                }
                break;
            case 11:
                zzg = zzg(zzi(str4));
                i3 = 8192;
                str5 = MimeTypes.AUDIO_VORBIS;
                list = zzg;
                i6 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222.zzb(i);
                zzsVar222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222.zzm(str3);
                zzsVar222222222.zzn(i2);
                zzsVar222222222.zze(this.zzac);
                zzsVar222222222.zzf(i9222222222);
                zzsVar222222222.zzp(list);
                zzsVar222222222.zzj(str2);
                zzsVar222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222.zzM();
                zzaeb zzu222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222;
                if (this.zzV) {
                }
                break;
            case '\f':
                zzg = new ArrayList(3);
                zzg.add(zzi(this.zzc));
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzT).array());
                i3 = 5760;
                str5 = MimeTypes.AUDIO_OPUS;
                list = zzg;
                i6 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222.zzb(i);
                zzsVar2222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222.zzm(str3);
                zzsVar2222222222.zzn(i2);
                zzsVar2222222222.zze(this.zzac);
                zzsVar2222222222.zzf(i92222222222);
                zzsVar2222222222.zzp(list);
                zzsVar2222222222.zzj(str2);
                zzsVar2222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222.zzM();
                zzaeb zzu2222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222;
                if (this.zzV) {
                }
                break;
            case '\r':
                List singletonList = Collections.singletonList(zzi(str4));
                zzabs zza4 = zzabt.zza(this.zzk);
                this.zzR = zza4.zza;
                this.zzP = zza4.zzb;
                String str9 = zza4.zzc;
                str5 = MimeTypes.AUDIO_AAC;
                str2 = str9;
                i6 = -1;
                list = singletonList;
                i2 = -1;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222.zzb(i);
                zzsVar22222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222.zzm(str3);
                zzsVar22222222222.zzn(i2);
                zzsVar22222222222.zze(this.zzac);
                zzsVar22222222222.zzf(i922222222222);
                zzsVar22222222222.zzp(list);
                zzsVar22222222222.zzj(str2);
                zzsVar22222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222.zzM();
                zzaeb zzu22222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222;
                if (this.zzV) {
                }
                break;
            case 14:
                str5 = MimeTypes.AUDIO_MPEG_L2;
                i6 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222.zzb(i);
                zzsVar222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222.zzm(str3);
                zzsVar222222222222.zzn(i2);
                zzsVar222222222222.zze(this.zzac);
                zzsVar222222222222.zzf(i9222222222222);
                zzsVar222222222222.zzp(list);
                zzsVar222222222222.zzj(str2);
                zzsVar222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222.zzM();
                zzaeb zzu222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222;
                if (this.zzV) {
                }
                break;
            case 15:
                str5 = MimeTypes.AUDIO_MPEG;
                i6 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222.zzb(i);
                zzsVar2222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222.zzm(str3);
                zzsVar2222222222222.zzn(i2);
                zzsVar2222222222222.zze(this.zzac);
                zzsVar2222222222222.zzf(i92222222222222);
                zzsVar2222222222222.zzp(list);
                zzsVar2222222222222.zzj(str2);
                zzsVar2222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222.zzM();
                zzaeb zzu2222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222;
                if (this.zzV) {
                }
                break;
            case 16:
                str5 = MimeTypes.AUDIO_AC3;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222222.zzb(i);
                zzsVar22222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222222.zzm(str3);
                zzsVar22222222222222.zzn(i2);
                zzsVar22222222222222.zze(this.zzac);
                zzsVar22222222222222.zzf(i922222222222222);
                zzsVar22222222222222.zzp(list);
                zzsVar22222222222222.zzj(str2);
                zzsVar22222222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222222.zzM();
                zzaeb zzu22222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222222;
                if (this.zzV) {
                }
                break;
            case 17:
                str5 = MimeTypes.AUDIO_E_AC3;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222.zzb(i);
                zzsVar222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222.zzm(str3);
                zzsVar222222222222222.zzn(i2);
                zzsVar222222222222222.zze(this.zzac);
                zzsVar222222222222222.zzf(i9222222222222222);
                zzsVar222222222222222.zzp(list);
                zzsVar222222222222222.zzj(str2);
                zzsVar222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222.zzM();
                zzaeb zzu222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222;
                if (this.zzV) {
                }
                break;
            case 18:
                this.zzU = new zzaec();
                str5 = MimeTypes.AUDIO_TRUEHD;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222222.zzb(i);
                zzsVar2222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222222.zzm(str3);
                zzsVar2222222222222222.zzn(i2);
                zzsVar2222222222222222.zze(this.zzac);
                zzsVar2222222222222222.zzf(i92222222222222222);
                zzsVar2222222222222222.zzp(list);
                zzsVar2222222222222222.zzj(str2);
                zzsVar2222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222222.zzM();
                zzaeb zzu2222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222222;
                if (this.zzV) {
                }
                break;
            case 19:
            case 20:
                this.zzV = true;
                str5 = MimeTypes.AUDIO_DTS;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222222222.zzb(i);
                zzsVar22222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222222222.zzm(str3);
                zzsVar22222222222222222.zzn(i2);
                zzsVar22222222222222222.zze(this.zzac);
                zzsVar22222222222222222.zzf(i922222222222222222);
                zzsVar22222222222222222.zzp(list);
                zzsVar22222222222222222.zzj(str2);
                zzsVar22222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222222222.zzM();
                zzaeb zzu22222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222222222;
                if (this.zzV) {
                }
                break;
            case 21:
                str5 = MimeTypes.AUDIO_DTS_HD;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222222.zzb(i);
                zzsVar222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222222.zzm(str3);
                zzsVar222222222222222222.zzn(i2);
                zzsVar222222222222222222.zze(this.zzac);
                zzsVar222222222222222222.zzf(i9222222222222222222);
                zzsVar222222222222222222.zzp(list);
                zzsVar222222222222222222.zzj(str2);
                zzsVar222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222222.zzM();
                zzaeb zzu222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222222;
                if (this.zzV) {
                }
                break;
            case 22:
                zzj = Collections.singletonList(zzi(str4));
                str5 = MimeTypes.AUDIO_FLAC;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222222222.zzb(i);
                zzsVar2222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222222222.zzm(str3);
                zzsVar2222222222222222222.zzn(i2);
                zzsVar2222222222222222222.zze(this.zzac);
                zzsVar2222222222222222222.zzf(i92222222222222222222);
                zzsVar2222222222222222222.zzp(list);
                zzsVar2222222222222222222.zzj(str2);
                zzsVar2222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222222222.zzM();
                zzaeb zzu2222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222222222;
                if (this.zzV) {
                }
                break;
            case 23:
                if (zzh(new zzef(zzi(this.zzc)))) {
                    i6 = zzeo.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (i6 == 0) {
                        int i14 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i14);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzds.zzc("MatroskaExtractor", sb.toString());
                    }
                    i2 = -1;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzs zzsVar22222222222222222222 = new zzs();
                    if (!zzar.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzsVar22222222222222222222.zzb(i);
                    zzsVar22222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                    zzsVar22222222222222222222.zzm(str3);
                    zzsVar22222222222222222222.zzn(i2);
                    zzsVar22222222222222222222.zze(this.zzac);
                    zzsVar22222222222222222222.zzf(i922222222222222222222);
                    zzsVar22222222222222222222.zzp(list);
                    zzsVar22222222222222222222.zzj(str2);
                    zzsVar22222222222222222222.zzq(this.zzl);
                    this.zzZ = zzsVar22222222222222222222.zzM();
                    zzaeb zzu22222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                    this.zzY = zzu22222222222222222222;
                    if (this.zzV) {
                    }
                } else {
                    zzds.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                i2 = -1;
                i6 = -1;
                str5 = MimeTypes.AUDIO_UNKNOWN;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222222222.zzb(i);
                zzsVar222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222222222.zzm(str3);
                zzsVar222222222222222222222.zzn(i2);
                zzsVar222222222222222222222.zze(this.zzac);
                zzsVar222222222222222222222.zzf(i9222222222222222222222);
                zzsVar222222222222222222222.zzp(list);
                zzsVar222222222222222222222.zzj(str2);
                zzsVar222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222222222.zzM();
                zzaeb zzu222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 24:
                i6 = zzeo.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i6 == 0) {
                    int i15 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i15);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzds.zzc("MatroskaExtractor", sb2.toString());
                    i2 = -1;
                    i6 = -1;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzs zzsVar2222222222222222222222 = new zzs();
                    if (!zzar.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzsVar2222222222222222222222.zzb(i);
                    zzsVar2222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                    zzsVar2222222222222222222222.zzm(str3);
                    zzsVar2222222222222222222222.zzn(i2);
                    zzsVar2222222222222222222222.zze(this.zzac);
                    zzsVar2222222222222222222222.zzf(i92222222222222222222222);
                    zzsVar2222222222222222222222.zzp(list);
                    zzsVar2222222222222222222222.zzj(str2);
                    zzsVar2222222222222222222222.zzq(this.zzl);
                    this.zzZ = zzsVar2222222222222222222222.zzM();
                    zzaeb zzu2222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                    this.zzY = zzu2222222222222222222222;
                    if (this.zzV) {
                    }
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222222222222222.zzb(i);
                zzsVar22222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222222222222222.zzm(str3);
                zzsVar22222222222222222222222.zzn(i2);
                zzsVar22222222222222222222222.zze(this.zzac);
                zzsVar22222222222222222222222.zzf(i922222222222222222222222);
                zzsVar22222222222222222222222.zzp(list);
                zzsVar22222222222222222222222.zzj(str2);
                zzsVar22222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222222222222222.zzM();
                zzaeb zzu22222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 25:
                int i16 = this.zzQ;
                if (i16 == 8) {
                    i6 = 3;
                } else if (i16 == 16) {
                    i6 = 268435456;
                } else if (i16 == 24) {
                    i6 = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                } else if (i16 == 32) {
                    i6 = C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i16).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i16);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzds.zzc("MatroskaExtractor", sb3.toString());
                    i2 = -1;
                    i6 = -1;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzs zzsVar222222222222222222222222 = new zzs();
                    if (!zzar.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzsVar222222222222222222222222.zzb(i);
                    zzsVar222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                    zzsVar222222222222222222222222.zzm(str3);
                    zzsVar222222222222222222222222.zzn(i2);
                    zzsVar222222222222222222222222.zze(this.zzac);
                    zzsVar222222222222222222222222.zzf(i9222222222222222222222222);
                    zzsVar222222222222222222222222.zzp(list);
                    zzsVar222222222222222222222222.zzj(str2);
                    zzsVar222222222222222222222222.zzq(this.zzl);
                    this.zzZ = zzsVar222222222222222222222222.zzM();
                    zzaeb zzu222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                    this.zzY = zzu222222222222222222222222;
                    if (this.zzV) {
                    }
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222222222222222.zzb(i);
                zzsVar2222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222222222222222.zzm(str3);
                zzsVar2222222222222222222222222.zzn(i2);
                zzsVar2222222222222222222222222.zze(this.zzac);
                zzsVar2222222222222222222222222.zzf(i92222222222222222222222222);
                zzsVar2222222222222222222222222.zzp(list);
                zzsVar2222222222222222222222222.zzj(str2);
                zzsVar2222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222222222222222.zzM();
                zzaeb zzu2222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 26:
                int i17 = this.zzQ;
                if (i17 != 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i17).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i17);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzds.zzc("MatroskaExtractor", sb4.toString());
                    i2 = -1;
                    i6 = -1;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    list = null;
                    str2 = null;
                    if (this.zzO != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                    zzs zzsVar22222222222222222222222222 = new zzs();
                    if (!zzar.zza(str3)) {
                    }
                    if (this.zzb != null) {
                    }
                    zzsVar22222222222222222222222222.zzb(i);
                    zzsVar22222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                    zzsVar22222222222222222222222222.zzm(str3);
                    zzsVar22222222222222222222222222.zzn(i2);
                    zzsVar22222222222222222222222222.zze(this.zzac);
                    zzsVar22222222222222222222222222.zzf(i922222222222222222222222222);
                    zzsVar22222222222222222222222222.zzp(list);
                    zzsVar22222222222222222222222222.zzj(str2);
                    zzsVar22222222222222222222222222.zzq(this.zzl);
                    this.zzZ = zzsVar22222222222222222222222222.zzM();
                    zzaeb zzu22222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                    this.zzY = zzu22222222222222222222222222;
                    if (this.zzV) {
                    }
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222222222222222.zzb(i);
                zzsVar222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222222222222222.zzm(str3);
                zzsVar222222222222222222222222222.zzn(i2);
                zzsVar222222222222222222222222222.zze(this.zzac);
                zzsVar222222222222222222222222222.zzf(i9222222222222222222222222222);
                zzsVar222222222222222222222222222.zzp(list);
                zzsVar222222222222222222222222222.zzj(str2);
                zzsVar222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222222222222222.zzM();
                zzaeb zzu222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 27:
                i2 = -1;
                i6 = -1;
                str5 = MimeTypes.APPLICATION_SUBRIP;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222222222222222222.zzb(i);
                zzsVar2222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222222222222222222.zzm(str3);
                zzsVar2222222222222222222222222222.zzn(i2);
                zzsVar2222222222222222222222222222.zze(this.zzac);
                zzsVar2222222222222222222222222222.zzf(i92222222222222222222222222222);
                zzsVar2222222222222222222222222222.zzp(list);
                zzsVar2222222222222222222222222222.zzj(str2);
                zzsVar2222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222222222222222222.zzM();
                zzaeb zzu2222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 28:
            case 29:
                int i18 = zzagz.zza;
                byte[] zzi = zzi(this.zzc);
                bArr = zzagz.zzc;
                list = zzgjz.zzk(bArr, zzi);
                i2 = -1;
                i6 = -1;
                str5 = MimeTypes.TEXT_SSA;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222222222222222222222.zzb(i);
                zzsVar22222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222222222222222222222.zzm(str3);
                zzsVar22222222222222222222222222222.zzn(i2);
                zzsVar22222222222222222222222222222.zze(this.zzac);
                zzsVar22222222222222222222222222222.zzf(i922222222222222222222222222222);
                zzsVar22222222222222222222222222222.zzp(list);
                zzsVar22222222222222222222222222222.zzj(str2);
                zzsVar22222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222222222222222222222.zzM();
                zzaeb zzu22222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 30:
                str5 = MimeTypes.TEXT_VTT;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222222222222222222.zzb(i);
                zzsVar222222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222222222222222222.zzm(str3);
                zzsVar222222222222222222222222222222.zzn(i2);
                zzsVar222222222222222222222222222222.zze(this.zzac);
                zzsVar222222222222222222222222222222.zzf(i9222222222222222222222222222222);
                zzsVar222222222222222222222222222222.zzp(list);
                zzsVar222222222222222222222222222222.zzj(str2);
                zzsVar222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222222222222222222.zzM();
                zzaeb zzu222222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case 31:
                zzj = zzgjz.zzj(zzi(str4));
                str5 = MimeTypes.APPLICATION_VOBSUB;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar2222222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar2222222222222222222222222222222.zzb(i);
                zzsVar2222222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar2222222222222222222222222222222.zzm(str3);
                zzsVar2222222222222222222222222222222.zzn(i2);
                zzsVar2222222222222222222222222222222.zze(this.zzac);
                zzsVar2222222222222222222222222222222.zzf(i92222222222222222222222222222222);
                zzsVar2222222222222222222222222222222.zzp(list);
                zzsVar2222222222222222222222222222222.zzj(str2);
                zzsVar2222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar2222222222222222222222222222222.zzM();
                zzaeb zzu2222222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu2222222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case ' ':
                str5 = MimeTypes.APPLICATION_PGS;
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar22222222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar22222222222222222222222222222222.zzb(i);
                zzsVar22222222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar22222222222222222222222222222222.zzm(str3);
                zzsVar22222222222222222222222222222222.zzn(i2);
                zzsVar22222222222222222222222222222222.zze(this.zzac);
                zzsVar22222222222222222222222222222222.zzf(i922222222222222222222222222222222);
                zzsVar22222222222222222222222222222222.zzp(list);
                zzsVar22222222222222222222222222222222.zzj(str2);
                zzsVar22222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar22222222222222222222222222222222.zzM();
                zzaeb zzu22222222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu22222222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr6, 0, 4);
                zzj = zzgjz.zzj(bArr6);
                str5 = MimeTypes.APPLICATION_DVBSUBS;
                list = zzj;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzO != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true == this.zzW ? 0 : 2);
                zzs zzsVar222222222222222222222222222222222 = new zzs();
                if (!zzar.zza(str3)) {
                }
                if (this.zzb != null) {
                }
                zzsVar222222222222222222222222222222222.zzb(i);
                zzsVar222222222222222222222222222222222.zzl(true == this.zza ? MimeTypes.VIDEO_MATROSKA : MimeTypes.VIDEO_WEBM);
                zzsVar222222222222222222222222222222222.zzm(str3);
                zzsVar222222222222222222222222222222222.zzn(i2);
                zzsVar222222222222222222222222222222222.zze(this.zzac);
                zzsVar222222222222222222222222222222222.zzf(i9222222222222222222222222222222222);
                zzsVar222222222222222222222222222222222.zzp(list);
                zzsVar222222222222222222222222222222222.zzj(str2);
                zzsVar222222222222222222222222222222222.zzq(this.zzl);
                this.zzZ = zzsVar222222222222222222222222222222222.zzM();
                zzaeb zzu222222222222222222222222222222222 = zzacxVar.zzu(this.zzd, i4);
                this.zzY = zzu222222222222222222222222222222222;
                if (this.zzV) {
                }
                break;
            default:
                throw zzas.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzab;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzab = i;
    }

    final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
