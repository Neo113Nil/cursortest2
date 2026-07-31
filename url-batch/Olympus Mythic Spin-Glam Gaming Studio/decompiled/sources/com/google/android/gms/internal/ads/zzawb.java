package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final /* synthetic */ class zzawb implements zzaws {
    public static final /* synthetic */ zzawb zza;
    public static final /* synthetic */ zzawb zzb;
    public static final /* synthetic */ zzawb zzc;
    public static final /* synthetic */ zzawb zzd;
    public static final /* synthetic */ zzawb zze;
    public static final /* synthetic */ zzawb zzf;
    public static final /* synthetic */ zzawb zzg;
    public static final /* synthetic */ zzawb zzh;
    public static final /* synthetic */ zzawb zzi;
    public static final /* synthetic */ zzawb zzj;
    public static final /* synthetic */ zzawb zzk;
    public static final /* synthetic */ zzawb zzl;
    public static final /* synthetic */ zzawb zzm;
    public static final /* synthetic */ zzawb zzn;
    public static final /* synthetic */ zzawb zzo;
    public static final /* synthetic */ zzawb zzp;
    private final /* synthetic */ int zzq;

    static {
        int i = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i2 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i3 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i4 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i5 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i6 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i7 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i8 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i9 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i10 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i11 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i12 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzawb((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzawb((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzawb(i12);
        zzm = new zzawb(i3);
        zzl = new zzawb(i4);
        zzk = new zzawb(i5);
        zzj = new zzawb(i2);
        zzi = new zzawb(i6);
        zzh = new zzawb(i7);
        zzg = new zzawb(i8);
        zzf = new zzawb(i);
        zze = new zzawb(i9);
        zzd = new zzawb(i10);
        zzc = new zzawb(i11);
        zzb = new zzawb(1);
        zza = new zzawb(0);
    }

    private /* synthetic */ zzawb(int i) {
        this.zzq = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzavk zzavkVar;
        zzawr zzawrVar;
        zzaxa zzd2;
        zzawr zzawrVar2;
        zzaxa zzb2;
        zzawr zzawrVar3;
        zzaxa zzd3;
        zzaxa zzaxaVar;
        int i = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i2 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzawv) obj).zza();
                                case 1:
                                    try {
                                        zzawr zzawrVar4 = ((zzawv) obj).zzb;
                                        long zzm2 = zzawrVar4.zzc().zzm();
                                        zzaxa zzc2 = zzawrVar4.zzc();
                                        List zzo2 = zzc2.zzo();
                                        if (zzm2 < 0) {
                                            zzm2 += zzo2.size();
                                        }
                                        if (zzm2 < 0 || zzm2 >= zzo2.size()) {
                                            throw new zzawy();
                                        }
                                        zzo2.remove((int) zzm2);
                                        zzawrVar4.zzb(zzc2);
                                        return Optional.empty();
                                    } catch (zzawy unused) {
                                        zzavkVar = zzavk.zzI;
                                        return Optional.of(zzavkVar);
                                    }
                                case 2:
                                    zzawv zzawvVar = (zzawv) obj;
                                    zzawr zzawrVar5 = zzawvVar.zzb;
                                    zzaxa zzc3 = zzawrVar5.zzc();
                                    zzawe zzn2 = zzawrVar5.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzc3.zzk(byteArrayOutputStream);
                                    zzawe zzd4 = zzn2.zzd(zzawe.zze(byteArrayOutputStream.toByteArray()));
                                    zzawrVar = zzawvVar.zzb;
                                    zzd2 = zzaxa.zzd(zzd4);
                                    zzawrVar.zzb(zzd2);
                                    return Optional.empty();
                                case 3:
                                    zzawv zzawvVar2 = (zzawv) obj;
                                    zzawr zzawrVar6 = zzawvVar2.zzb;
                                    zzaxa zzc4 = zzawrVar6.zzc();
                                    zzawe zzn3 = zzawrVar6.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzawa.zzb(zzc4.zzm(), new zzawz(byteArrayOutputStream2, i ^ i2), false);
                                    zzawe zzd5 = zzn3.zzd(zzawe.zze(byteArrayOutputStream2.toByteArray()));
                                    zzawrVar = zzawvVar2.zzb;
                                    zzd2 = zzaxa.zzd(zzd5);
                                    zzawrVar.zzb(zzd2);
                                    return Optional.empty();
                                case 4:
                                    zzawv zzawvVar3 = (zzawv) obj;
                                    zzawvVar3.zzb.zze(-(zzawvVar3.zzc.zzb().zzb + zzawvVar3.zzd.zze()), zzawvVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzawrVar2 = ((zzawv) obj).zzb;
                                    zzb2 = zzaxa.zzb(zzawrVar2.zzc().zzm() << ((int) zzawrVar2.zzc().zzm()));
                                    zzawrVar2.zzb(zzb2);
                                    return Optional.empty();
                                case 6:
                                    zzawrVar2 = ((zzawv) obj).zzb;
                                    zzb2 = zzaxa.zzb(zzawrVar2.zzc().zzm() >>> ((int) zzawrVar2.zzc().zzm()));
                                    zzawrVar2.zzb(zzb2);
                                    return Optional.empty();
                                case 7:
                                    zzawrVar2 = ((zzawv) obj).zzb;
                                    zzb2 = zzaxa.zzc(zzawrVar2.zzc().zzq() - zzawrVar2.zzc().zzq());
                                    zzawrVar2.zzb(zzb2);
                                    return Optional.empty();
                                case 8:
                                    zzawrVar2 = ((zzawv) obj).zzb;
                                    zzb2 = zzaxa.zzb(zzawrVar2.zzc().zzm() - zzawrVar2.zzc().zzm());
                                    zzawrVar2.zzb(zzb2);
                                    return Optional.empty();
                                case 9:
                                    zzawv zzawvVar4 = (zzawv) obj;
                                    zzawr zzawrVar7 = zzawvVar4.zzb;
                                    long zzm3 = zzawrVar7.zzc().zzm();
                                    zzaxa zzc5 = zzawrVar7.zzc();
                                    zzawrVar3 = zzawvVar4.zzb;
                                    zzd3 = zzawrVar3.zzd(zzm3);
                                    zzawrVar3.zze(zzm3, zzc5);
                                    zzawrVar3.zzb(zzd3);
                                    return Optional.empty();
                                case 10:
                                    zzawv zzawvVar5 = (zzawv) obj;
                                    zzawr zzawrVar8 = zzawvVar5.zzb;
                                    long zzm4 = zzawvVar5.zzc.zzb().zzb + zzawrVar8.zzc().zzm();
                                    zzaxa zzc6 = zzawrVar8.zzc();
                                    zzawrVar3 = zzawvVar5.zzb;
                                    long j = -zzm4;
                                    zzd3 = zzawrVar3.zzd(j);
                                    zzawrVar3.zze(j, zzc6);
                                    zzawrVar3.zzb(zzd3);
                                    return Optional.empty();
                                case 11:
                                    zzawv zzawvVar6 = (zzawv) obj;
                                    long zze2 = zzawvVar6.zzc.zzb().zzb + zzawvVar6.zzd.zze();
                                    zzaxa zzc7 = zzawvVar6.zzb.zzc();
                                    zzawrVar3 = zzawvVar6.zzb;
                                    long j2 = -zze2;
                                    zzd3 = zzawrVar3.zzd(j2);
                                    zzawrVar3.zze(j2, zzc7);
                                    zzawrVar3.zzb(zzd3);
                                    return Optional.empty();
                                case 12:
                                    zzawv zzawvVar7 = (zzawv) obj;
                                    long zzm5 = zzawvVar7.zzb.zzc().zzm();
                                    try {
                                        zzawr zzawrVar9 = zzawvVar7.zzb;
                                        int i3 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i4 = 1478326644 % 593443203;
                                        if (zzm5 == 0) {
                                            zzaxaVar = zzawrVar9.zzc();
                                        } else {
                                            int zza2 = zzawrVar9.zza(zzm5);
                                            zzawrVar9.zzb += i3 ^ i4;
                                            zzaxaVar = (zzaxa) zzawrVar9.zza.remove(zza2);
                                        }
                                        zzawrVar9.zzb(zzaxaVar);
                                        return Optional.empty();
                                    } catch (zzawp unused2) {
                                        zzavkVar = zzavk.zzg;
                                        return Optional.of(zzavkVar);
                                    }
                                case 13:
                                    zzawv zzawvVar8 = (zzawv) obj;
                                    try {
                                        zzawr zzawrVar10 = zzawvVar8.zzb;
                                        long zzm6 = zzawrVar10.zzc().zzm();
                                        long zzm7 = zzawrVar10.zzc().zzm();
                                        zzawo zzawoVar = zzawvVar8.zzc;
                                        zzawj zzawjVar = zzawvVar8.zzd;
                                        zzawoVar.zza(zzawjVar.zzb(), zzm7, zzawoVar.zzb().zzb);
                                        zzawjVar.zza(zzm6);
                                        return Optional.empty();
                                    } catch (zzawh | zzawi unused3) {
                                        zzavkVar = zzavk.zzr;
                                        return Optional.of(zzavkVar);
                                    } catch (zzawm unused4) {
                                        zzavkVar = zzavk.zzB;
                                        return Optional.of(zzavkVar);
                                    } catch (zzawn unused5) {
                                        zzavkVar = zzavk.zzw;
                                        return Optional.of(zzavkVar);
                                    }
                                case 14:
                                    zzawv zzawvVar9 = (zzawv) obj;
                                    try {
                                        zzawvVar9.zzb.zzb(zzaxa.zzg(zzawvVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzawx unused6) {
                                        zzavkVar = zzavk.zzp;
                                        return Optional.of(zzavkVar);
                                    }
                                default:
                                    try {
                                        zzawr zzawrVar11 = ((zzawv) obj).zzb;
                                        Iterator it = zzawrVar11.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzawrVar11.zzb((zzaxa) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzawq unused7) {
                                        zzavkVar = zzavk.zza;
                                        return Optional.of(zzavkVar);
                                    }
                            }
                        } catch (zzawp unused8) {
                            zzavkVar = zzavk.zzh;
                        }
                    } catch (zzawq e) {
                        e = e;
                        throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzawn | zzawp unused9) {
                    zzavkVar = zzavk.zzx;
                }
            } catch (zzawg | zzawi | zzawx unused10) {
                zzavkVar = zzavk.zzy;
            }
        } catch (zzawx unused11) {
            zzavkVar = zzavk.zzk;
        } catch (IOException e2) {
            e = e2;
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
