package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzjb {
    private final Map zza;

    public zzjb() {
        this.zza = new HashMap();
    }

    public final zzjb zza(String str, int i) {
        this.zza.put(str, Integer.valueOf(i));
        return this;
    }

    public final zzjb zzb(String str, long j) {
        this.zza.put(str, Long.valueOf(j));
        return this;
    }

    public final zzjb zzc(String str, float f) {
        this.zza.put(str, Float.valueOf(f));
        return this;
    }

    public final zzjb zzd(String str, @Nullable String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzjb zze(String str, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            allocate.put(byteBuffer.duplicate());
            allocate.flip();
            this.zza.put(str, allocate);
        }
        return this;
    }

    public final zzjb zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzjc zzg() {
        return new zzjc(this.zza, null);
    }
}
