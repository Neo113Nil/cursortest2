package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzqh extends zzcg {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzk = zzk(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr2) {
                int zzE = (zzeo.zzE(this.zzb.zzd) * i) + position;
                int i2 = this.zzb.zzd;
                if (i2 != 2) {
                    if (i2 == 3) {
                        zzk.put(byteBuffer.get(zzE));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
                                            sb.append("Unexpected encoding: ");
                                            sb.append(i2);
                                            throw new IllegalStateException(sb.toString());
                                        }
                                    }
                                }
                            }
                            zzk.putInt(byteBuffer.getInt(zzE));
                        }
                        byte b = byteBuffer.get(byteBuffer.order() == ByteOrder.BIG_ENDIAN ? zzE : zzE + 2);
                        byte b2 = byteBuffer.get(zzE + 1);
                        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                            zzE += 2;
                        }
                        int i3 = ((b << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((b2 << Ascii.DLE) & 16711680) | ((byteBuffer.get(zzE) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        int i4 = i3 >> 8;
                        zzghc.zzf((i4 & ViewCompat.MEASURED_STATE_MASK) == 0 || (i4 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i4));
                        zzghc.zza(zzk.remaining() >= 3);
                        zzk.put((byte) (zzk.order() == ByteOrder.BIG_ENDIAN ? (i3 >> 24) & 255 : i4 & 255)).put((byte) ((i3 >> 16) & 255)).put((byte) (zzk.order() == ByteOrder.BIG_ENDIAN ? i4 & 255 : (i3 >> 24) & 255));
                    } else {
                        zzk.putFloat(byteBuffer.getFloat(zzE));
                    }
                }
                zzk.putShort(byteBuffer.getShort(zzE));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcc.zza;
        }
        int i = zzccVar.zzd;
        if (!zzeo.zzA(i)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i2 = zzccVar.zzc;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new zzcc(zzccVar.zzb, length, i) : zzcc.zza;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String arrays = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 59);
                sb.append("Channel map (");
                sb.append(arrays);
                sb.append(") trying to access non-existent input channel.");
                throw new zzce(sb.toString(), zzccVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
