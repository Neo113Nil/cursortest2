package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzher implements zzhff {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzher(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzher zza(String str) {
        return new zzher(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzico zzicoVar) throws IOException {
        if (!(zzicoVar instanceof zzics)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzicoVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long zzc = zzhms.zzc(zzicoVar.zzg().zzh());
            if (zzc > 4294967295L || zzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) zzc;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzhff
    public final zzhuc zzb() throws IOException {
        char c;
        int i;
        char c2;
        int i2;
        char c3;
        int i3;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i4 = zzhfu.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    inputStream = inputStream2;
                }
                zzicq zze = zzhms.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zze.zzc("key")) {
                    throw new zzicr("invalid keyset: no key");
                }
                zzico zzh = zze.zzh("key");
                if (!(zzh instanceof zzicn)) {
                    throw new zzicr("invalid keyset: key must be an array");
                }
                zzicn zzf = zzh.zzf();
                if (zzf.zzb() == 0) {
                    throw new zzicr("invalid keyset: key is empty");
                }
                zzhtz zzh2 = zzhuc.zzh();
                if (zze.zzc("primaryKeyId")) {
                    zzh2.zza(zzc(zze.zzh("primaryKeyId")));
                }
                int i5 = 0;
                while (i5 < zzf.zzb()) {
                    zzicq zze2 = zzf.zzc(i5).zze();
                    if (!zze2.zzc(str2) || !zze2.zzc(str) || !zze2.zzc("keyId") || !zze2.zzc("outputPrefixType")) {
                        throw new zzicr("invalid key");
                    }
                    zzico zzh3 = zze2.zzh(str2);
                    if (!(zzh3 instanceof zzicq)) {
                        throw new zzicr("invalid key: keyData must be an object");
                    }
                    zzhua zzd = zzhub.zzd();
                    String zzd2 = zze2.zzh(str).zzd();
                    String str3 = str;
                    int hashCode = zzd2.hashCode();
                    String str4 = str2;
                    zzicn zzicnVar = zzf;
                    if (hashCode == -891611359) {
                        if (zzd2.equals("ENABLED")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && zzd2.equals("DISABLED")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (zzd2.equals("DESTROYED")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        i = 3;
                    } else if (c == 1) {
                        i = 4;
                    } else {
                        if (c != 2) {
                            throw new zzicr("unknown status: ".concat(zzd2));
                        }
                        i = 5;
                    }
                    zzd.zzd(i);
                    zzd.zzc(zzc(zze2.zzh("keyId")));
                    String zzd3 = zze2.zzh("outputPrefixType").zzd();
                    switch (zzd3.hashCode()) {
                        case -2053249079:
                            if (zzd3.equals("LEGACY")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80904:
                            if (zzd3.equals("RAW")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2575090:
                            if (zzd3.equals("TINK")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1761684556:
                            if (zzd3.equals("CRUNCHY")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        i2 = 3;
                    } else if (c2 == 1) {
                        i2 = 5;
                    } else if (c2 == 2) {
                        i2 = 4;
                    } else {
                        if (c2 != 3) {
                            throw new zzicr("unknown output prefix type: ".concat(zzd3));
                        }
                        i2 = 6;
                    }
                    zzd.zze(i2);
                    zzicq zze3 = zzh3.zze();
                    if (!zze3.zzc("typeUrl") || !zze3.zzc("value") || !zze3.zzc("keyMaterialType")) {
                        throw new zzicr("invalid keyData");
                    }
                    byte[] zza2 = zzias.zza(zze3.zzh("value").zzd(), 2);
                    zzhts zzc = zzhtt.zzc();
                    zzc.zza(zze3.zzh("typeUrl").zzd());
                    zziei zzieiVar = zziei.zza;
                    zzc.zzb(zziei.zzt(zza2, 0, zza2.length));
                    String zzd4 = zze3.zzh("keyMaterialType").zzd();
                    switch (zzd4.hashCode()) {
                        case -1881281466:
                            if (zzd4.equals("REMOTE")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1609477353:
                            if (zzd4.equals("SYMMETRIC")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 249237018:
                            if (zzd4.equals("ASYMMETRIC_PRIVATE")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1534613202:
                            if (zzd4.equals("ASYMMETRIC_PUBLIC")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        i3 = 3;
                    } else if (c3 == 1) {
                        i3 = 4;
                    } else if (c3 == 2) {
                        i3 = 5;
                    } else {
                        if (c3 != 3) {
                            throw new zzicr("unknown key material type: ".concat(zzd4));
                        }
                        i3 = 6;
                    }
                    zzc.zzc(i3);
                    zzd.zza((zzhtt) zzc.zzbu());
                    zzh2.zzb((zzhub) zzd.zzbu());
                    i5++;
                    str = str3;
                    str2 = str4;
                    zzf = zzicnVar;
                }
                zzhuc zzhucVar = (zzhuc) zzh2.zzbu();
                this.zzb.close();
                return zzhucVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zzicr e) {
            e = e;
            throw new IOException(e);
        } catch (IllegalStateException e2) {
            e = e2;
            throw new IOException(e);
        }
    }
}
