package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqd implements zzaqh {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaht zzi;
    private zzaht zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaht zzw;
    private long zzx;
    private final zzet zzc = new zzet(new byte[7], 7);
    private final zzeu zzd = new zzeu(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaqd(boolean z, @Nullable String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zze(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzeu zzeuVar, byte[] bArr, int i) {
        int min = Math.min(zzeuVar.zzd(), i - this.zzl);
        zzeuVar.zzm(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaht zzahtVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzahtVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zze((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 65280);
    }

    private static final boolean zzm(zzeu zzeuVar, byte[] bArr, int i) {
        if (zzeuVar.zzd() < i) {
            return false;
        }
        zzeuVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzh = zzarvVar.zzc();
        zzaht zzs = zzagkVar.zzs(zzarvVar.zzb(), 1);
        this.zzi = zzs;
        this.zzw = zzs;
        if (!this.zzb) {
            this.zzj = new zzage();
            return;
        }
        zzarvVar.zza();
        zzaht zzs2 = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzj = zzs2;
        zzt zztVar = new zzt();
        zztVar.zza(zzarvVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo("application/id3");
        zzs2.zzA(zztVar.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i;
        byte b;
        char c;
        int i2;
        char c2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 2;
        this.zzi.getClass();
        String str = zzfm.zza;
        while (zzeuVar.zzd() > 0) {
            int i7 = this.zzk;
            char c3 = 7;
            if (i7 == 0) {
                byte[] zzi = zzeuVar.zzi();
                int zzg = zzeuVar.zzg();
                int zze = zzeuVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzeuVar.zzh(zzg);
                        break;
                    }
                    i = zzg + 1;
                    b = zzi[zzg];
                    int i8 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i8)) {
                        c = c3;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i9 = zzg - 1;
                        zzeuVar.zzh(zzg);
                        zzet zzetVar = this.zzc;
                        if (zzm(zzeuVar, zzetVar.zza, 1)) {
                            zzetVar.zzf(4);
                            int zzj = zzetVar.zzj(1);
                            int i10 = this.zzp;
                            if (i10 == -1 || zzj == i10) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzeuVar, zzetVar.zza, 1)) {
                                        break;
                                    }
                                    zzetVar.zzf(i6);
                                    if (zzetVar.zzj(4) == this.zzq) {
                                        zzeuVar.zzh(zzg + 1);
                                    }
                                }
                                if (!zzm(zzeuVar, zzetVar.zza, 4)) {
                                    break;
                                }
                                zzetVar.zzf(14);
                                int zzj2 = zzetVar.zzj(13);
                                c = 7;
                                if (zzj2 >= 7) {
                                    byte[] zzi2 = zzeuVar.zzi();
                                    int zze2 = zzeuVar.zze();
                                    int i11 = i9 + zzj2;
                                    if (i11 < zze2) {
                                        byte b2 = zzi2[i11];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i12 = i11 + 1;
                                                if (i12 == zze2) {
                                                    break;
                                                }
                                                if (zzi2[i12] == 68) {
                                                    int i13 = i11 + 2;
                                                    if (i13 == zze2) {
                                                        break;
                                                    } else if (zzi2[i13] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i14 = i11 + 1;
                                            if (i14 == zze2) {
                                                break;
                                            }
                                            byte b3 = zzi2[i14];
                                            if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c = 7;
                    }
                    int i15 = this.zzm;
                    int i16 = i15 | i8;
                    if (i16 == 329) {
                        i2 = 2;
                        c2 = 3;
                        i3 = 0;
                        i4 = 768;
                    } else if (i16 == 511) {
                        i2 = 2;
                        c2 = 3;
                        i3 = 0;
                        i4 = 512;
                    } else if (i16 == 836) {
                        i2 = 2;
                        c2 = 3;
                        i3 = 0;
                        i4 = 1024;
                    } else {
                        if (i16 == 1075) {
                            this.zzk = 2;
                            this.zzl = 3;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzeuVar.zzh(i);
                            i6 = 2;
                            i5 = 0;
                            break;
                        }
                        if (i15 != 256) {
                            this.zzm = 256;
                            c3 = c;
                            i5 = 0;
                            i6 = 2;
                        } else {
                            i2 = 2;
                            c2 = 3;
                            i3 = 0;
                            i5 = i3;
                            zzg = i;
                            c3 = c;
                            i6 = i2;
                        }
                    }
                    this.zzm = i4;
                    i5 = i3;
                    zzg = i;
                    c3 = c;
                    i6 = i2;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzeuVar.zzh(i);
                i5 = 0;
                i6 = 2;
            } else if (i7 != 1) {
                if (i7 == i6) {
                    zzeu zzeuVar2 = this.zzd;
                    if (zzh(zzeuVar, zzeuVar2.zzi(), 10)) {
                        this.zzj.zzc(zzeuVar2, 10);
                        zzeuVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzeuVar2.zzG() + 10);
                    }
                } else if (i7 != 3) {
                    int min = Math.min(zzeuVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzeuVar, min);
                    int i17 = this.zzl + min;
                    this.zzl = i17;
                    if (i17 == this.zzu) {
                        zzguk.zzi(this.zzv != -9223372036854775807L ? 1 : i5);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i18 = true != this.zzn ? 5 : 7;
                    zzet zzetVar2 = this.zzc;
                    if (zzh(zzeuVar, zzetVar2.zza, i18)) {
                        zzetVar2.zzf(i5);
                        if (this.zzs) {
                            zzetVar2.zzh(10);
                        } else {
                            int zzj3 = zzetVar2.zzj(i6) + 1;
                            if (zzj3 != i6) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                zzeh.zzc("AdtsReader", sb.toString());
                            }
                            zzetVar2.zzh(5);
                            int zzj4 = zzetVar2.zzj(3);
                            int i19 = this.zzq;
                            byte[] bArr = new byte[i6];
                            bArr[i5] = (byte) (((i19 >> 1) & 7) | 16);
                            bArr[1] = (byte) (((zzj4 << 3) & 120) | ((i19 << 7) & 128));
                            zzafe zza2 = zzaff.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzn(this.zzg);
                            zztVar.zzo("audio/mp4a-latm");
                            zztVar.zzk(zza2.zzc);
                            zztVar.zzH(zza2.zzb);
                            zztVar.zzJ(zza2.zza);
                            zztVar.zzr(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzQ = zztVar.zzQ();
                            this.zzt = 1024000000 / zzQ.zzK;
                            this.zzi.zzA(zzQ);
                            this.zzs = true;
                        }
                        zzetVar2.zzh(4);
                        int zzj5 = zzetVar2.zzj(13);
                        zzj(this.zzi, this.zzt, 0, this.zzn ? zzj5 - 9 : zzj5 - 7);
                    }
                }
            } else if (zzeuVar.zzd() != 0) {
                zzet zzetVar3 = this.zzc;
                zzetVar3.zza[i5] = zzeuVar.zzi()[zzeuVar.zzg()];
                zzetVar3.zzf(i6);
                int zzj6 = zzetVar3.zzj(4);
                int i20 = this.zzq;
                if (i20 == -1 || zzj6 == i20) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }
}
