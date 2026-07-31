package com.yandex.div.core.dagger;

import android.content.Context;
import com.safedk.android.utils.j;
import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.android.beacon.SendBeaconManager;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivKitModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitModule;", "", "()V", "provideSendBeaconManager", "Lcom/yandex/android/beacon/SendBeaconManager;", "context", "Landroid/content/Context;", j.c, "Lcom/yandex/android/beacon/SendBeaconConfiguration;", "provideViewCreator", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "cpuUsageHistogramReporter", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivKitModule {

    @NotNull
    public static final DivKitModule INSTANCE = new DivKitModule();

    @Nullable
    public static final SendBeaconManager provideSendBeaconManager(@NotNull Context context, @Nullable SendBeaconConfiguration configuration) {
        return null;
    }

    private DivKitModule() {
    }

    @NotNull
    public static final ViewCreator provideViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
