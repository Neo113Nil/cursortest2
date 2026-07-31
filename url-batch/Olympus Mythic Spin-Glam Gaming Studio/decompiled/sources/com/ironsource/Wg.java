package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public abstract class Wg {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final Wc b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Wg a(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData, @NotNull Wc outcomeReporter, @NotNull Qg waterfallInstances, @NotNull H adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C5012zf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new J4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public Wg(@NotNull C4814p0 adTools, @NotNull Wc outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.a = adTools;
        this.b = outcomeReporter;
    }

    private final void b(B b, List<? extends B> list) {
        for (B b2 : list) {
            if (b2 == b) {
                b.a(true);
                return;
            }
            b2.a(false);
            IronLog.INTERNAL.verbose(C4814p0.a(this.a, b2.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(@NotNull B b);

    public final void a(@NotNull B instanceToShow, @NotNull List<? extends B> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(@NotNull B b);

    public abstract void c(@NotNull B b);

    public final void a(@NotNull B instance, @Nullable String str, @NotNull C4770ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance, str, publisherDataHolder);
    }
}
