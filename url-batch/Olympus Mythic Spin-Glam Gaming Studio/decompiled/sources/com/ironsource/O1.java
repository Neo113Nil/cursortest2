package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public class O1 implements InterfaceC4749l7 {

    @NotNull
    private final F7 a;

    @Nullable
    private P1 b;

    public static final class a {
        @NotNull
        public final P1 a(@Nullable M1 m1, @NotNull F7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (m1 != null ? Boolean.valueOf(m1.k()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                C4685he.i().a(new C4966x5(EnumC4984y5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((m1 != null ? m1.k() : false) && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C4962x1() : new T7();
        }
    }

    public O1(@NotNull F7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC4749l7
    public void a(@Nullable M1 m1) {
        if (this.b == null) {
            this.b = new a().a(m1, this.a);
        }
    }

    @Override // com.ironsource.P1
    public void b(@NotNull InterfaceC4716ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        P1 p1 = this.b;
        if (p1 != null) {
            p1.b(observer);
        }
    }

    @Override // com.ironsource.P1
    public void a(@NotNull InterfaceC4716ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        P1 p1 = this.b;
        if (p1 != null) {
            p1.a(observer);
        }
    }
}
