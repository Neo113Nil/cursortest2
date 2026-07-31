package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzauy extends ThreadLocal {
    zzauy(zzauz zzauzVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
