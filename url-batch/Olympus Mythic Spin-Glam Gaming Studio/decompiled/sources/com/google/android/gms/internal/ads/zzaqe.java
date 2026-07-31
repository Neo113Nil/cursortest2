package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqe implements zzaru {
    private final List zza;

    public zzaqe() {
        this(0);
    }

    public zzaqe(int i, List list) {
        this.zza = list;
    }

    private final zzark zzc(zzart zzartVar) {
        return new zzark(zze(zzartVar), "video/mp2t");
    }

    private final zzarz zzd(zzart zzartVar) {
        return new zzarz(zze(zzartVar), "video/mp2t");
    }

    private final List zze(zzart zzartVar) {
        String str;
        int i;
        List list;
        zzeu zzeuVar = new zzeu(zzartVar.zze);
        List list2 = this.zza;
        while (zzeuVar.zzd() > 0) {
            int zzs = zzeuVar.zzs();
            int zzg = zzeuVar.zzg() + zzeuVar.zzs();
            if (zzs == 134) {
                list2 = new ArrayList();
                int zzs2 = zzeuVar.zzs() & 31;
                for (int i2 = 0; i2 < zzs2; i2++) {
                    String zzK = zzeuVar.zzK(3, StandardCharsets.UTF_8);
                    int zzs3 = zzeuVar.zzs();
                    boolean z = (zzs3 & 128) != 0;
                    if (z) {
                        i = zzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzs4 = (byte) zzeuVar.zzs();
                    zzeuVar.zzk(1);
                    if (z) {
                        int i3 = zzs4 & 64;
                        int i4 = zzdr.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(zzK);
                    zztVar.zzN(i);
                    zztVar.zzr(list);
                    list2.add(zztVar.zzQ());
                }
            }
            zzeuVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzaqe(int i) {
        this.zza = zzgxm.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    @Nullable
    public final zzarw zzb(int i, zzart zzartVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzara(new zzaqt(zzartVar.zzb, zzartVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzara(new zzaqr("video/mp2t"));
            }
            if (i == 27) {
                return new zzara(new zzaqo(zzc(zzartVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzara(new zzaqq(zzc(zzartVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzara(new zzaqu("video/mp2t"));
            }
            if (i == 89) {
                return new zzara(new zzaqg(zzartVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzara(new zzaqa(zzartVar.zzb, zzartVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzari(new zzaqz("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzara(new zzaqf(zzartVar.zzb, zzartVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzara(new zzaqd(false, zzartVar.zzb, zzartVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzara(new zzaqm(zzd(zzartVar), "video/mp2t"));
                            case 17:
                                return new zzara(new zzaqs(zzartVar.zzb, zzartVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzari(new zzaqz("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzara(new zzaqf(zzartVar.zzb, zzartVar.zza(), 4096, "video/mp2t"));
                }
                return new zzara(new zzapx(zzartVar.zzb, zzartVar.zza(), "video/mp2t"));
            }
        }
        return new zzara(new zzaqj(zzd(zzartVar), "video/mp2t"));
    }
}
