package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.AbstractC5040c;
import com.moloco.sdk.internal.services.InterfaceC5041d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class c implements j<AbstractC5040c> {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "AdvertisingSignalProvider";

    @NotNull
    public final InterfaceC5041d b;

    @NotNull
    public AbstractC5040c c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(@NotNull InterfaceC5041d advertisingService) {
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.b = advertisingService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z = !Intrinsics.areEqual(this.c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT][ASP]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return f;
    }

    public final AbstractC5040c e() {
        AbstractC5040c a2 = this.b.a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT][ASP]: adData: " + a2, false, 4, null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC5040c d() {
        return e();
    }
}
