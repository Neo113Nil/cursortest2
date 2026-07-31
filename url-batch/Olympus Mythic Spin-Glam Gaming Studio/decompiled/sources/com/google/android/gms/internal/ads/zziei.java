package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zziei implements Iterable<Byte>, Serializable {
    public static final zziei zza = new zzieg(zzifz.zza);
    private int zzb = 0;

    static {
        int i = zzidv.zza;
    }

    zziei() {
    }

    public static zzieh zzC() {
        return new zzieh(128);
    }

    static /* synthetic */ boolean zzE(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzD(i, i4, bArr.length);
        zzD(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static zziei zzt(byte[] bArr, int i, int i2) {
        try {
            return zzu(bArr, i, i2, false);
        } catch (zzige e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static zziei zzu(byte[] bArr, int i, int i2, boolean z) throws zzige {
        if (i2 == 0) {
            return zza;
        }
        zzD(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzieg(bArr2);
    }

    static zziei zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zzige e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static zziei zzw(byte[] bArr, boolean z) throws zzige {
        return bArr.length == 0 ? zza : new zzieg(bArr);
    }

    public static zziei zzx(String str) {
        return str.isEmpty() ? zza : new zzieg(str.getBytes(StandardCharsets.UTF_8));
    }

    public static zziei zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziei)) {
            return false;
        }
        zziei zzieiVar = (zziei) obj;
        int zzb = zzb();
        if (zzb != zzieiVar.zzb()) {
            return false;
        }
        if (zzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzieiVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzj(zzieiVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzb = zzb();
            i = zzl(zzb, 0, zzb);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzihw.zza(zzA()) : zzihw.zza(zzd(0, 47).zzA()).concat("..."));
    }

    public final byte[] zzA() {
        int zzb = zzb();
        if (zzb == 0) {
            return zzifz.zza;
        }
        byte[] bArr = new byte[zzb];
        zze(bArr, 0, 0, zzb);
        return bArr;
    }

    public final String zzB(Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    abstract byte zza(int i);

    public abstract int zzb();

    public abstract zziei zzc(int i, int i2);

    public abstract zziei zzd(int i, int i2);

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer zzf();

    abstract void zzg(zzidz zzidzVar) throws IOException;

    protected abstract String zzh(Charset charset);

    public abstract boolean zzi();

    protected abstract boolean zzj(zziei zzieiVar);

    protected abstract int zzl(int i, int i2, int i3);

    public abstract zziem zzm();

    protected abstract int zzp();

    protected abstract boolean zzq();

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzied iterator() {
        return new zziea(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzD(0, i3, zzb());
        zzD(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    private static zziei zzk(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zziei) it.next();
        }
        int i2 = i >>> 1;
        zziei zzk = zzk(it, i2);
        zziei zzk2 = zzk(it, i - i2);
        if (Integer.MAX_VALUE - zzk.zzb() >= zzk2.zzb()) {
            return zzihn.zzk(zzk, zzk2);
        }
        int zzb = zzk.zzb();
        int zzb2 = zzk2.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 31 + String.valueOf(zzb2).length());
        sb.append("ByteString would be too long: ");
        sb.append(zzb);
        sb.append(Marker.ANY_NON_NULL_MARKER);
        sb.append(zzb2);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzD(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
