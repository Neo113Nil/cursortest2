package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzaww implements Comparator {
    private final boolean zza;

    public zzaww(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparator;
        Object zzn;
        Object zzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 496612959;
        zzaxa zzaxaVar = (zzaxa) obj;
        zzaxa zzaxaVar2 = (zzaxa) obj2;
        int i11 = zzaxaVar.zza;
        if (i11 != zzaxaVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ i9;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzaxaVar.zzl() != zzaxaVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzaxaVar.zzm(), zzaxaVar2.zzm());
                case 3:
                    comparator = zzawe.zzc;
                    zzn = zzaxaVar.zzn();
                    zzn2 = zzaxaVar2.zzn();
                    return comparator.compare(zzn, zzn2);
                case 4:
                    zzn = zzaxaVar.zzo();
                    zzn2 = zzaxaVar2.zzo();
                    comparator = zzgww.zza(this);
                    return comparator.compare(zzn, zzn2);
                case 5:
                    if (!this.zza) {
                        throw new IllegalArgumentException();
                    }
                    if (zzaxaVar.zzp() == zzaxaVar2.zzp()) {
                        return 0;
                    }
                case 6:
                    return Double.compare(zzaxaVar.zzq(), zzaxaVar2.zzq());
                default:
                    return 0;
            }
        } catch (zzawx e) {
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
