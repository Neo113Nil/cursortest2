package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqj implements zzaqh {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaht zzb;

    @Nullable
    private final zzarz zzd;
    private final String zze;

    @Nullable
    private final zzeu zzf;

    @Nullable
    private final zzaqy zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaqi zzi = new zzaqi(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzaqj(@Nullable zzarz zzarzVar, String str) {
        zzeu zzeuVar;
        this.zzd = zzarzVar;
        this.zze = str;
        if (zzarzVar != null) {
            this.zzg = new zzaqy(178, 128);
            zzeuVar = new zzeu();
        } else {
            zzeuVar = null;
            this.zzg = null;
        }
        this.zzf = zzeuVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        zzgr.zzj(this.zzh);
        this.zzi.zza();
        zzaqy zzaqyVar = this.zzg;
        if (zzaqyVar != null) {
            zzaqyVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zza = zzarvVar.zzc();
        this.zzb = zzagkVar.zzs(zzarvVar.zzb(), 2);
        zzarz zzarzVar = this.zzd;
        if (zzarzVar != null) {
            zzarzVar.zza(zzagkVar, zzarvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        zzaqy zzaqyVar;
        int i3;
        long j;
        boolean z;
        boolean z2;
        long j2;
        int i4;
        float f;
        int i5;
        int i6;
        char c = 4;
        this.zzb.getClass();
        int zzg = zzeuVar.zzg();
        int zze = zzeuVar.zze();
        byte[] zzi = zzeuVar.zzi();
        this.zzj += zzeuVar.zzd();
        this.zzb.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int zzi2 = zzgr.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i7 = zzi2 + 3;
            int i8 = zzeuVar.zzi()[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = zzi2 - zzg;
            if (!this.zzl) {
                if (i9 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                zzaqi zzaqiVar = this.zzi;
                if (zzaqiVar.zzb(i8, i10)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzaqiVar.zzc, zzaqiVar.zza);
                    int i11 = copyOf[c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    byte b = copyOf[5];
                    int i12 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i13 = copyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    i2 = i7;
                    i = zze;
                    int i14 = (i12 >> 4) | (i11 << 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = ((b & 15) << 8) | i13;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            i5 = i16 * 16;
                            i6 = i14 * 9;
                        } else if (i15 != 4) {
                            f = 1.0f;
                        } else {
                            i5 = i16 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i6 = i14 * 100;
                        }
                        f = i5 / i6;
                    } else {
                        f = (i16 * 4) / (i14 * 3);
                    }
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzn(str2);
                    zztVar.zzo("video/mpeg2");
                    zztVar.zzv(i14);
                    zztVar.zzw(i16);
                    zztVar.zzC(f);
                    zztVar.zzr(Collections.singletonList(copyOf));
                    zzv zzQ = zztVar.zzQ();
                    int i17 = (copyOf[7] & 15) - 1;
                    long j3 = 0;
                    if (i17 >= 0 && i17 < 8) {
                        double d = zzc[i17];
                        byte b2 = copyOf[zzaqiVar.zzb + 9];
                        int i18 = (b2 & 96) >> 5;
                        if (i18 != (b2 & 31)) {
                            d *= (i18 + 1.0d) / (r2 + 1);
                        }
                        j3 = (long) (1000000.0d / d);
                    }
                    Pair create = Pair.create(zzQ, Long.valueOf(j3));
                    this.zzb.zzA((zzv) create.first);
                    this.zzm = ((Long) create.second).longValue();
                    this.zzl = true;
                    zzaqyVar = this.zzg;
                    if (zzaqyVar != null) {
                        if (i9 > 0) {
                            zzaqyVar.zzd(zzi, zzg, zzi2);
                            i4 = 0;
                        } else {
                            i4 = -i9;
                        }
                        if (zzaqyVar.zze(i4)) {
                            int zza = zzgr.zza(zzaqyVar.zza, zzaqyVar.zzb);
                            zzeu zzeuVar2 = this.zzf;
                            String str3 = zzfm.zza;
                            zzeuVar2.zzb(zzaqyVar.zza, zza);
                            this.zzd.zzb(this.zzp, zzeuVar2);
                        }
                        if (i8 == 178) {
                            if (zzeuVar.zzi()[zzi2 + 2] == 1) {
                                zzaqyVar.zzc(178);
                            }
                            i8 = 178;
                            if (i8 != 0 || i8 == 179) {
                                i3 = i - zzi2;
                                if (this.zzr && this.zzl) {
                                    j2 = this.zzp;
                                    if (j2 != -9223372036854775807L) {
                                        this.zzb.zze(j2, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i3, i3, null);
                                    }
                                }
                                if (this.zzk || this.zzr) {
                                    this.zzo = this.zzj - i3;
                                    j = this.zzn;
                                    if (j == -9223372036854775807L) {
                                        long j4 = this.zzp;
                                        j = j4 != -9223372036854775807L ? j4 + this.zzm : -9223372036854775807L;
                                    }
                                    this.zzp = j;
                                    z = false;
                                    this.zzq = false;
                                    this.zzn = -9223372036854775807L;
                                    z2 = true;
                                    this.zzk = true;
                                } else {
                                    z = false;
                                    z2 = true;
                                }
                                this.zzr = i8 == 0 ? z2 : z;
                            } else if (i8 == 184) {
                                this.zzq = true;
                            }
                            zzg = i2;
                            zze = i;
                            c = 4;
                        }
                    }
                    if (i8 != 0) {
                    }
                    i3 = i - zzi2;
                    if (this.zzr) {
                        j2 = this.zzp;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i3;
                    j = this.zzn;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzp = j;
                    z = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z2 = true;
                    this.zzk = true;
                    this.zzr = i8 == 0 ? z2 : z;
                    zzg = i2;
                    zze = i;
                    c = 4;
                }
            }
            i = zze;
            i2 = i7;
            zzaqyVar = this.zzg;
            if (zzaqyVar != null) {
            }
            if (i8 != 0) {
            }
            i3 = i - zzi2;
            if (this.zzr) {
            }
            if (this.zzk) {
            }
            this.zzo = this.zzj - i3;
            j = this.zzn;
            if (j == -9223372036854775807L) {
            }
            this.zzp = j;
            z = false;
            this.zzq = false;
            this.zzn = -9223372036854775807L;
            z2 = true;
            this.zzk = true;
            this.zzr = i8 == 0 ? z2 : z;
            zzg = i2;
            zze = i;
            c = 4;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzaqy zzaqyVar2 = this.zzg;
        if (zzaqyVar2 != null) {
            zzaqyVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        zzaht zzahtVar = this.zzb;
        zzahtVar.getClass();
        long j = this.zzp;
        if (j != -9223372036854775807L) {
            boolean z = this.zzq;
            zzahtVar.zze(j, z ? 1 : 0, (int) (this.zzj - this.zzo), 0, null);
        }
    }
}
