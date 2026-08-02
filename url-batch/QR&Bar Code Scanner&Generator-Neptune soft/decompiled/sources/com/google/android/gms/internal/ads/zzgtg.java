package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgtg extends zzgpw {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgpw zzd;
    private final zzgpw zze;
    private final int zzf;
    private final int zzg;

    private zzgtg(zzgpw zzgpwVar, zzgpw zzgpwVar2) {
        this.zzd = zzgpwVar;
        this.zze = zzgpwVar2;
        int zzd = zzgpwVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgpwVar2.zzd();
        this.zzg = Math.max(zzgpwVar.zzf(), zzgpwVar2.zzf()) + 1;
    }

    static zzgpw zzG(zzgpw zzgpwVar, zzgpw zzgpwVar2) {
        if (zzgpwVar2.zzd() == 0) {
            return zzgpwVar;
        }
        if (zzgpwVar.zzd() == 0) {
            return zzgpwVar2;
        }
        int zzd = zzgpwVar.zzd() + zzgpwVar2.zzd();
        if (zzd < 128) {
            return zzH(zzgpwVar, zzgpwVar2);
        }
        if (zzgpwVar instanceof zzgtg) {
            zzgtg zzgtgVar = (zzgtg) zzgpwVar;
            if (zzgtgVar.zze.zzd() + zzgpwVar2.zzd() < 128) {
                return new zzgtg(zzgtgVar.zzd, zzH(zzgtgVar.zze, zzgpwVar2));
            }
            if (zzgtgVar.zzd.zzf() > zzgtgVar.zze.zzf() && zzgtgVar.zzg > zzgpwVar2.zzf()) {
                return new zzgtg(zzgtgVar.zzd, new zzgtg(zzgtgVar.zze, zzgpwVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgpwVar.zzf(), zzgpwVar2.zzf()) + 1) ? new zzgtg(zzgpwVar, zzgpwVar2) : zzgtc.zza(new zzgtc(null), zzgpwVar, zzgpwVar2);
    }

    private static zzgpw zzH(zzgpw zzgpwVar, zzgpw zzgpwVar2) {
        int zzd = zzgpwVar.zzd();
        int zzd2 = zzgpwVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgpwVar.zzC(bArr, 0, 0, zzd);
        zzgpwVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgps(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpw)) {
            return false;
        }
        zzgpw zzgpwVar = (zzgpw) obj;
        if (this.zzc != zzgpwVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgpwVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgtd zzgtdVar = null;
        zzgte zzgteVar = new zzgte(this, zzgtdVar);
        zzgpr next = zzgteVar.next();
        zzgte zzgteVar2 = new zzgte(zzgpwVar, zzgtdVar);
        zzgpr next2 = zzgteVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (!(i == 0 ? next.zzg(next2, i2, min) : next2.zzg(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgteVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgteVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpw, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgta(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final byte zza(int i) {
        zzB(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.zze.zze(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final int zzi(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzi(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final int zzj(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzj(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final zzgpw zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgpw.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgpw zzgpwVar = this.zzd;
        return new zzgtg(zzgpwVar.zzk(i, zzgpwVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgpw
    public final zzgqe zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgte zzgteVar = new zzgte(this, null);
        while (zzgteVar.hasNext()) {
            arrayList.add(zzgteVar.next().zzn());
        }
        int i = zzgqe.zzd;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgqa(arrayList, i3, true, objArr == true ? 1 : 0) : zzgqe.zzH(new zzgrr(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    final void zzo(zzgpl zzgplVar) throws IOException {
        this.zzd.zzo(zzgplVar);
        this.zze.zzo(zzgplVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgpw zzgpwVar = this.zze;
        return zzgpwVar.zzj(zzj, 0, zzgpwVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    /* renamed from: zzs */
    public final zzgpq iterator() {
        return new zzgta(this);
    }
}
