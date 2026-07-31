package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.publisher.AdFormatType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.publisher.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5025a implements s {

    @NotNull
    public static final C1539a d = new C1539a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "AdCreateLoadTimeoutManager";

    @NotNull
    public final AdFormatType a;
    public final long b;
    public long c;

    /* renamed from: com.moloco.sdk.internal.publisher.a$a, reason: collision with other inner class name */
    public static final class C1539a {
        public /* synthetic */ C1539a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1539a() {
        }
    }

    public /* synthetic */ C5025a(AdFormatType adFormatType, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        s.a.a(this, j, j2);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo6143getCreateAdObjectDurationUwyO8pc() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo6144setCreateAdObjectDurationLRDsOJo(long j) {
        this.c = j;
    }

    public C5025a(AdFormatType adFormatType, long j) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.a = adFormatType;
        this.b = j;
        this.c = Duration.Companion.m8176getZEROUwyO8pc();
    }

    public final long a() {
        long m8163minusLRDsOJo = Duration.m8163minusLRDsOJo(this.b, mo6143getCreateAdObjectDurationUwyO8pc());
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f, this.a + " timeout: " + ((Object) Duration.m8170toStringimpl(this.b)) + ", create ad duration: " + ((Object) Duration.m8170toStringimpl(mo6143getCreateAdObjectDurationUwyO8pc())) + ". Return value: " + ((Object) Duration.m8170toStringimpl(m8163minusLRDsOJo)), false, 4, null);
        return m8163minusLRDsOJo;
    }
}
