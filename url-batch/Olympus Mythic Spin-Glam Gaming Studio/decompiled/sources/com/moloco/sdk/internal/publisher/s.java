package com.moloco.sdk.internal.publisher;

import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface s {

    public static final class a {
        public static void a(@NotNull s sVar, long j, long j2) {
            sVar.mo6144setCreateAdObjectDurationLRDsOJo(DurationKt.toDuration(j2 - j, DurationUnit.MILLISECONDS));
        }
    }

    void a(long j, long j2);

    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    long mo6143getCreateAdObjectDurationUwyO8pc();

    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    void mo6144setCreateAdObjectDurationLRDsOJo(long j);
}
