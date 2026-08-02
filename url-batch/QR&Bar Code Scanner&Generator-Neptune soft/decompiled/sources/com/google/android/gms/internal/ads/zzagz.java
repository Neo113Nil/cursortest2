package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagz implements zzain {
    private final List zza;

    public zzagz() {
        this(0);
    }

    private final zzaid zzb(zzaim zzaimVar) {
        return new zzaid(zzd(zzaimVar));
    }

    private final zzair zzc(zzaim zzaimVar) {
        return new zzair(zzd(zzaimVar));
    }

    private final List zzd(zzaim zzaimVar) {
        String str;
        int i;
        List list;
        zzef zzefVar = new zzef(zzaimVar.zzd);
        List list2 = this.zza;
        while (zzefVar.zza() > 0) {
            int zzk = zzefVar.zzk();
            int zzc = zzefVar.zzc() + zzefVar.zzk();
            if (zzk == 134) {
                list2 = new ArrayList();
                int zzk2 = zzefVar.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzefVar.zzx(3, zzfsk.zzc);
                    int zzk3 = zzefVar.zzk();
                    int i3 = zzk3 & 128;
                    if (i3 != 0) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzefVar.zzk();
                    zzefVar.zzG(1);
                    if (i3 != 0) {
                        int i4 = zzdf.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzadVar = new zzad();
                    zzadVar.zzS(str);
                    zzadVar.zzK(zzx);
                    zzadVar.zzu(i);
                    zzadVar.zzI(list);
                    list2.add(zzadVar.zzY());
                }
            }
            zzefVar.zzF(zzc);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final zzaip zza(int i, zzaim zzaimVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaht(new zzahq(zzaimVar.zzb));
            }
            if (i == 21) {
                return new zzaht(new zzaho());
            }
            if (i == 27) {
                return new zzaht(new zzahl(zzb(zzaimVar), false, false));
            }
            if (i == 36) {
                return new zzaht(new zzahn(zzb(zzaimVar)));
            }
            if (i == 89) {
                return new zzaht(new zzahb(zzaimVar.zzc));
            }
            if (i == 138) {
                return new zzaht(new zzaha(zzaimVar.zzb));
            }
            if (i == 172) {
                return new zzaht(new zzagv(zzaimVar.zzb));
            }
            if (i == 257) {
                return new zzaic(new zzahs("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaic(new zzahs("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzaht(new zzagy(false, zzaimVar.zzb));
                            case 16:
                                return new zzaht(new zzahh(zzc(zzaimVar)));
                            case 17:
                                return new zzaht(new zzahp(zzaimVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaht(new zzags(zzaimVar.zzb));
            }
        }
        return new zzaht(new zzahe(zzc(zzaimVar)));
    }

    public zzagz(int i) {
        this.zza = zzfvn.zzo();
    }
}
