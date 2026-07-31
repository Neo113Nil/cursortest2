package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes13.dex */
public final class o implements j<n> {

    @NotNull
    public static final a e = new a(null);
    public static final int f = 8;

    @NotNull
    public static final String g = "DSignalProvider";

    @NotNull
    public final com.moloco.sdk.internal.services.y b;

    @NotNull
    public final F c;

    @NotNull
    public n d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public o(@NotNull com.moloco.sdk.internal.services.y deviceInfoService, @NotNull F screenInfoService) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.b = deviceInfoService;
        this.c = screenInfoService;
        this.d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        n e2 = e();
        boolean z = !Intrinsics.areEqual(e2, this.d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, g, "[CBT] DSP needsRefresh: " + z + ", with current: " + e2 + ", cached: " + this.d, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return g;
    }

    public final n e() {
        try {
            return new n(this.c.b(), this.b.c(), this.b.d());
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, g, "[CBT] DSP Error", e2, false, 8, null);
            return new n(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n d() {
        return this.d;
    }
}
