package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class u implements j<t> {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "NISignalProvider";

    @NotNull
    public final B b;

    @NotNull
    public t c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public u(@NotNull B networkInfoService) {
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        this.b = networkInfoService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        t e2 = e();
        boolean z = !Intrinsics.areEqual(e2, this.c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] NIS needsRefresh: " + z + ", with nis: " + e2 + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return f;
    }

    public final t e() {
        try {
            t tVar = new t(this.b.d(), this.b.b(), Boolean.valueOf(this.b.a()), this.b.c());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] NIS providing " + tVar, false, 4, null);
            return tVar;
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f, "[CBT] NIS Error", e2, false, 8, null);
            return new t(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t d() {
        return this.c;
    }
}
