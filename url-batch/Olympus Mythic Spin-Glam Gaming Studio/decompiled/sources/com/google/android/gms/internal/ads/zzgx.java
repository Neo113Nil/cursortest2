package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzgx {
    public static List zza(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            try {
                byte b = asReadOnlyBuffer.get();
                int i = b >> 3;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                int zzd = ((b >> 1) & 1) != 0 ? zzd(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
                if (asReadOnlyBuffer.position() + zzd > asReadOnlyBuffer.limit()) {
                    break;
                }
                duplicate.limit(asReadOnlyBuffer.position());
                ByteBuffer duplicate2 = asReadOnlyBuffer.duplicate();
                duplicate2.limit(asReadOnlyBuffer.position() + zzd);
                arrayList.add(new zzgv(i & 15, duplicate, duplicate2, null));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + zzd);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    static /* synthetic */ void zzc(boolean z) {
        if (z) {
            throw new zzgu(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b = byteBuffer.get();
            i |= (b & Byte.MAX_VALUE) << (i2 * 7);
            if ((b & 128) == 0) {
                break;
            }
        }
        return i;
    }
}
