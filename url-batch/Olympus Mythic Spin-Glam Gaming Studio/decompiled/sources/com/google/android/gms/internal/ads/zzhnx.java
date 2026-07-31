package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhnx {
    public static final zzich zza = zzich.zza(new byte[0]);

    public static final zzich zza(int i) {
        return zzich.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzich zzb(int i) {
        return zzich.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
