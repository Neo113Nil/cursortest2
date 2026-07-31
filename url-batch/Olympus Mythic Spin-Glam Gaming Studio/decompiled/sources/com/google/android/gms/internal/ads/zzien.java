package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzien implements zzihj {
    private final zziem zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzien(zziem zziemVar) {
        zziemVar.getClass();
        this.zza = zziemVar;
        zziemVar.zzd = this;
    }

    private final void zzQ(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zziem zziemVar = this.zza;
        int zzo = zziemVar.zzo();
        zziemVar.zzJ();
        int zzB = zziemVar.zzB(zzo);
        zziemVar.zza++;
        zzihoVar.zzg(obj, this, zziewVar);
        zziemVar.zzb(0);
        zziemVar.zza--;
        zziemVar.zzC(zzB);
    }

    private final Object zzS(zziho zzihoVar, zziew zziewVar) throws IOException {
        Object zza = zzihoVar.zza();
        zzR(zza, zzihoVar, zziewVar);
        zzihoVar.zzk(zza);
        return zza;
    }

    private final void zzT(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzihoVar.zzg(obj, this, zziewVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzige("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final Object zzU(zziin zziinVar, Class cls, zziew zziewVar) throws IOException {
        zziin zziinVar2 = zziin.zza;
        switch (zziinVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzihg.zza().zzb(cls), zziewVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzE() != i) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzige("Failed to parse the message.");
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzige("Failed to parse the message.");
        }
    }

    public static zzien zza(zziem zziemVar) {
        Object obj = zziemVar.zzd;
        return obj != null ? (zzien) obj : new zzien(zziemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzA(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzg());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzg());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzg()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzg()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzB(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzh());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzh());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzh()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzh()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzC(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzX(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzigkVar.zzd(zziemVar.zzi());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzi());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzX(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Long.valueOf(zziemVar3.zzi()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzi()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzD(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzW(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzifnVar.zzi(zziemVar.zzj());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzj());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzW(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Integer.valueOf(zziemVar3.zzj()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzj()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzE(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzidy) {
            zzidy zzidyVar = (zzidy) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzidyVar.zzg(zziemVar.zzk());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzidyVar.zzg(zziemVar2.zzk());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zziemVar3.zzk()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Boolean.valueOf(zziemVar4.zzk()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzF(List list, boolean z) throws IOException {
        int zza;
        int i;
        if ((this.zzb & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzigh) && !z) {
            zzigh zzighVar = (zzigh) list;
            do {
                zzq();
                zzighVar.zzb();
                zziem zziemVar = this.zza;
                if (zziemVar.zzD()) {
                    return;
                } else {
                    i = zziemVar.zza();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzn() : zzm());
                zziem zziemVar2 = this.zza;
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    zza = zziemVar2.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzG(List list, zziho zzihoVar, zziew zziewVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzihoVar, zziewVar));
            zziem zziemVar = this.zza;
            if (zziemVar.zzD() || this.zzd != 0) {
                return;
            } else {
                zza = zziemVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    @Deprecated
    public final void zzH(List list, zziho zzihoVar, zziew zziewVar) throws IOException {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            Object zza2 = zzihoVar.zza();
            zzT(zza2, zzihoVar, zziewVar);
            zzihoVar.zzk(zza2);
            list.add(zza2);
            zziem zziemVar = this.zza;
            if (zziemVar.zzD() || this.zzd != 0) {
                return;
            } else {
                zza = zziemVar.zza();
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzJ(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzo());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzo());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzo()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzo()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzK(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzp());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzp());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzp()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzp()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzL(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzW(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzifnVar.zzi(zziemVar.zzq());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzq());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzW(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Integer.valueOf(zziemVar3.zzq()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzq()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzM(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzX(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzigkVar.zzd(zziemVar.zzr());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzr());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzX(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Long.valueOf(zziemVar3.zzr()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzr()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzN(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzifnVar.zzi(zziemVar.zzs());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifnVar.zzi(zziemVar2.zzs());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziemVar3.zzs()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Integer.valueOf(zziemVar4.zzs()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzO(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzt());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzt());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzt()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzt()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        r9.zza.zzC(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzihj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzP(Map map, zzigo zzigoVar, zziew zziewVar) throws IOException {
        zzQ(2);
        zziem zziemVar = this.zza;
        int zzB = zziemVar.zzB(zziemVar.zzo());
        Object obj = zzigoVar.zzd;
        Object obj2 = zzigoVar.zzb;
        Object obj3 = obj;
        while (true) {
            try {
                int zzb = zzb();
                if (zzb == Integer.MAX_VALUE || zziemVar.zzD()) {
                    break;
                }
                if (zzb == 1) {
                    obj2 = zzU(zzigoVar.zza, null, null);
                } else if (zzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new zzige("Unable to parse map entry.");
                        }
                    } catch (zzigd e) {
                        if (!zzd()) {
                            throw new zzige("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    obj3 = zzU(zzigoVar.zzc, obj.getClass(), zziewVar);
                }
            } catch (Throwable th) {
                this.zza.zzC(zzB);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzb() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zza();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i;
        zziem zziemVar = this.zza;
        if (zziemVar.zzD() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zziemVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzo(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zzQ(2);
        zzR(obj, zzihoVar, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzp(Object obj, zziho zzihoVar, zziew zziewVar) throws IOException {
        zzQ(3);
        zzT(obj, zzihoVar, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final zziei zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzx(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zziet) {
            zziet zzietVar = (zziet) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzX(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzietVar.zzg(zziemVar.zzd());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzietVar.zzg(zziemVar2.zzd());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzX(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Double.valueOf(zziemVar3.zzd()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Double.valueOf(zziemVar4.zzd()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzy(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzifd) {
            zzifd zzifdVar = (zzifd) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zziem zziemVar = this.zza;
                int zzo = zziemVar.zzo();
                zzW(zzo);
                int zzE = zziemVar.zzE() + zzo;
                do {
                    zzifdVar.zzg(zziemVar.zze());
                } while (zziemVar.zzE() < zzE);
                return;
            }
            if (i2 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar2 = this.zza;
                zzifdVar.zzg(zziemVar2.zze());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                zziem zziemVar3 = this.zza;
                int zzo2 = zziemVar3.zzo();
                zzW(zzo2);
                int zzE2 = zziemVar3.zzE() + zzo2;
                do {
                    list.add(Float.valueOf(zziemVar3.zze()));
                } while (zziemVar3.zzE() < zzE2);
                return;
            }
            if (i3 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Float.valueOf(zziemVar4.zze()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzz(List list) throws IOException {
        int zza;
        int i;
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar = this.zza;
                int zzE = zziemVar.zzE() + zziemVar.zzo();
                do {
                    zzigkVar.zzd(zziemVar.zzf());
                } while (zziemVar.zzE() < zzE);
                zzV(zzE);
                return;
            }
            do {
                zziem zziemVar2 = this.zza;
                zzigkVar.zzd(zziemVar2.zzf());
                if (zziemVar2.zzD()) {
                    return;
                } else {
                    i = zziemVar2.zza();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzigd("Protocol message tag had invalid wire type.");
                }
                zziem zziemVar3 = this.zza;
                int zzE2 = zziemVar3.zzE() + zziemVar3.zzo();
                do {
                    list.add(Long.valueOf(zziemVar3.zzf()));
                } while (zziemVar3.zzE() < zzE2);
                zzV(zzE2);
                return;
            }
            do {
                zziem zziemVar4 = this.zza;
                list.add(Long.valueOf(zziemVar4.zzf()));
                if (zziemVar4.zzD()) {
                    return;
                } else {
                    zza = zziemVar4.zza();
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzI(List list) throws IOException {
        int zza;
        if ((this.zzb & 7) != 2) {
            throw new zzigd("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zziem zziemVar = this.zza;
            if (zziemVar.zzD()) {
                return;
            } else {
                zza = zziemVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }
}
