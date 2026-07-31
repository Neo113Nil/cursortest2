package com.ironsource;

import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4719jd implements K7, K7.a {

    @NotNull
    private final E3 a;

    @NotNull
    private final N4 b;

    /* renamed from: com.ironsource.jd$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4719jd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.K7
    @NotNull
    public synchronized G3 a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a2 = new C4827pd(placementName, adFormat).a();
        G3 a3 = this.b.a(a2);
        if (a3.d()) {
            return a3;
        }
        return this.a.a(a2);
    }

    @Override // com.ironsource.K7.a
    public synchronized void b(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a2 = new C4827pd(placementName, adFormat).a();
        if (!this.b.a(a2).d()) {
            this.a.b(a2);
        }
    }

    public C4719jd(@NotNull E3 cappingService, @NotNull N4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.a = cappingService;
        this.b = deliveryHandler;
    }

    public /* synthetic */ C4719jd(E3 e3, N4 n4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new E3(null, null, null, 7, null) : e3, (i & 2) != 0 ? new N4() : n4);
    }

    @Override // com.ironsource.K7.a
    @NotNull
    public synchronized Object a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, @NotNull I3 cappingType, @NotNull InterfaceC4803o7 cappingConfig) {
        Object a2;
        try {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            String a3 = new C4827pd(placementName, adFormat).a();
            int i = a.a[cappingType.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = this.a.a(a3, cappingType, cappingConfig);
            } else {
                a2 = this.b.a(a3, cappingType, cappingConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }
}
