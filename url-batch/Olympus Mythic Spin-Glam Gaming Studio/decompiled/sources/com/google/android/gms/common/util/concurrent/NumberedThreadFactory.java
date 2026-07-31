package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.X3;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb = new AtomicInteger();
    private final ThreadFactory zzc = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.zzc.newThread(new zza(runnable, 0));
        int andIncrement = this.zzb.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append(X3.j.d);
        sb.append(andIncrement);
        sb.append(X3.j.e);
        newThread.setName(sb.toString());
        return newThread;
    }
}
