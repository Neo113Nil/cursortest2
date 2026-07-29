package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmq extends zzgjg {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgjg zzd;
    private final zzgjg zze;
    private final int zzf;
    private final int zzg;

    private zzgmq(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        this.zzd = zzgjgVar;
        this.zze = zzgjgVar2;
        int zzd = zzgjgVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgjgVar2.zzd();
        this.zzg = Math.max(zzgjgVar.zzf(), zzgjgVar2.zzf()) + 1;
    }

    static zzgjg zzG(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        if (zzgjgVar2.zzd() == 0) {
            return zzgjgVar;
        }
        if (zzgjgVar.zzd() == 0) {
            return zzgjgVar2;
        }
        int zzd = zzgjgVar.zzd() + zzgjgVar2.zzd();
        if (zzd < 128) {
            return zzH(zzgjgVar, zzgjgVar2);
        }
        if (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            if (zzgmqVar.zze.zzd() + zzgjgVar2.zzd() < 128) {
                return new zzgmq(zzgmqVar.zzd, zzH(zzgmqVar.zze, zzgjgVar2));
            }
            if (zzgmqVar.zzd.zzf() > zzgmqVar.zze.zzf() && zzgmqVar.zzg > zzgjgVar2.zzf()) {
                return new zzgmq(zzgmqVar.zzd, new zzgmq(zzgmqVar.zze, zzgjgVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgjgVar.zzf(), zzgjgVar2.zzf()) + 1) ? new zzgmq(zzgjgVar, zzgjgVar2) : zzgmm.zza(new zzgmm(null), zzgjgVar, zzgjgVar2);
    }

    private static zzgjg zzH(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        int zzd = zzgjgVar.zzd();
        int zzd2 = zzgjgVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgjgVar.zzC(bArr, 0, 0, zzd);
        zzgjgVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgjc(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgjg)) {
            return false;
        }
        zzgjg zzgjgVar = (zzgjg) obj;
        if (this.zzc != zzgjgVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgjgVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgmn zzgmnVar = null;
        zzgmo zzgmoVar = new zzgmo(this, zzgmnVar);
        zzgjb next = zzgmoVar.next();
        zzgmo zzgmoVar2 = new zzgmo(zzgjgVar, zzgmnVar);
        zzgjb next2 = zzgmoVar2.next();
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
                next = zzgmoVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgmoVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjg, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgmk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final byte zza(int i) {
        zzB(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
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

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
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

    @Override // com.google.android.gms.internal.ads.zzgjg
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

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjg zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgjg.zzb;
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
        zzgjg zzgjgVar = this.zzd;
        return new zzgmq(zzgjgVar.zzk(i, zzgjgVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjo zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgmo zzgmoVar = new zzgmo(this, null);
        while (zzgmoVar.hasNext()) {
            arrayList.add(zzgmoVar.next().zzn());
        }
        int i = zzgjo.zzd;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgjk(arrayList, i3, true, objArr == true ? 1 : 0) : zzgjo.zzH(new zzglb(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    final void zzo(zzgiv zzgivVar) throws IOException {
        this.zzd.zzo(zzgivVar);
        this.zze.zzo(zzgivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgjg zzgjgVar = this.zze;
        return zzgjgVar.zzj(zzj, 0, zzgjgVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    /* renamed from: zzs */
    public final zzgja iterator() {
        return new zzgmk(this);
    }
}
