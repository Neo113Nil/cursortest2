package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zztl extends zzcq {

    @Nullable
    private zzhbf zzd;

    @Nullable
    private zzhbf zze;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        zzhbf zzhbfVar = this.zze;
        zzhbfVar.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzk = zzk(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i = 0; i < zzhbfVar.zzh(); i++) {
                int zzI = (zzfm.zzI(this.zzb.zzd) * zzhbfVar.zzi(i)) + position;
                int i2 = this.zzb.zzd;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                if (i2 != 1879048192) {
                                                    if (i2 != 1895825408) {
                                                        if (i2 != 1912602624) {
                                                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
                                                            sb.append("Unexpected encoding: ");
                                                            sb.append(i2);
                                                            throw new IllegalStateException(sb.toString());
                                                        }
                                                    }
                                                }
                                                zzk.putDouble(byteBuffer.getDouble(zzI));
                                            }
                                        }
                                    }
                                }
                                zzk.putInt(byteBuffer.getInt(zzI));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b = byteBuffer.get(order == byteOrder ? zzI : zzI + 2);
                            byte b2 = byteBuffer.get(zzI + 1);
                            if (byteBuffer.order() == byteOrder) {
                                zzI += 2;
                            }
                            int i3 = ((b << 24) & (-16777216)) | ((b2 << 16) & 16711680) | ((byteBuffer.get(zzI) << 8) & 65280);
                            int i4 = i3 >> 8;
                            zzguk.zzf((i4 & (-16777216)) == 0 || (i4 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i4));
                            zzguk.zza(zzk.remaining() >= 3);
                            zzk.put((byte) (zzk.order() == byteOrder ? (i3 >> 24) & 255 : i4 & 255)).put((byte) ((i3 >> 16) & 255)).put((byte) (zzk.order() == byteOrder ? i4 & 255 : (i3 >> 24) & 255));
                        }
                        zzk.putFloat(byteBuffer.getFloat(zzI));
                    } else {
                        zzk.put(byteBuffer.get(zzI));
                    }
                }
                zzk.putShort(byteBuffer.getShort(zzI));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        zzhbf zzhbfVar = this.zzd;
        if (zzhbfVar == null) {
            return zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!zzfm.zzE(i)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int zzh = zzhbfVar.zzh();
        int i2 = zzclVar.zzc;
        boolean z = i2 != zzh;
        int i3 = 0;
        while (i3 < zzh) {
            int zzi = zzhbfVar.zzi(i3);
            if (zzi >= i2) {
                String obj = zzhbfVar.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 59);
                sb.append("Channel map (");
                sb.append(obj);
                sb.append(") trying to access non-existent input channel.");
                throw new zzco(sb.toString(), zzclVar);
            }
            z |= zzi != i3;
            i3++;
        }
        return z ? new zzcl(zzclVar.zzb, zzh, i) : zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    protected final void zzo(zzcn zzcnVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable zzhbf zzhbfVar) {
        this.zzd = zzhbfVar;
    }
}
