package com.yandex.div.core;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.core.app.NotificationCompat;
import com.safedk.android.utils.j;
import com.yandex.android.beacon.SendBeaconConfiguration;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramBridge;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivKitConfiguration.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BK\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/DivKitConfiguration;", "", "sendBeaconConfiguration", "Ljavax/inject/Provider;", "Lcom/yandex/android/beacon/SendBeaconConfiguration;", "executorService", "Ljava/util/concurrent/ExecutorService;", "histogramConfiguration", "Lcom/yandex/div/histogram/HistogramConfiguration;", "divStorageComponent", "Lcom/yandex/div/storage/DivStorageComponent;", "divRequestExecutor", "Lcom/yandex/div/core/DivRequestExecutor;", "(Ljavax/inject/Provider;Ljava/util/concurrent/ExecutorService;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "cpuUsageHistogramReporter", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "externalDivStorageComponent", "Lcom/yandex/div/core/dagger/ExternalOptional;", "histogramRecordConfiguration", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "histogramRecorder", "Lcom/yandex/div/histogram/HistogramRecorder;", "Builder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivKitConfiguration {

    @NotNull
    private final Provider divRequestExecutor;

    @Nullable
    private final Provider divStorageComponent;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final Provider histogramConfiguration;

    @Nullable
    private final Provider sendBeaconConfiguration;

    public /* synthetic */ DivKitConfiguration(Provider provider, ExecutorService executorService, Provider provider2, Provider provider3, Provider provider4, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, executorService, provider2, provider3, provider4);
    }

    private DivKitConfiguration(Provider provider, ExecutorService executorService, Provider provider2, Provider provider3, Provider provider4) {
        this.sendBeaconConfiguration = provider;
        this.executorService = executorService;
        this.histogramConfiguration = provider2;
        this.divStorageComponent = provider3;
        this.divRequestExecutor = provider4;
    }

    @Nullable
    public final SendBeaconConfiguration sendBeaconConfiguration() {
        Provider provider = this.sendBeaconConfiguration;
        if (provider == null) {
            return null;
        }
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(provider.get());
        return null;
    }

    @NotNull
    /* renamed from: executorService, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        return (HistogramRecordConfiguration) this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramConfiguration histogramConfiguration() {
        return (HistogramConfiguration) this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder((HistogramBridge) ((HistogramConfiguration) this.histogramConfiguration.get()).getHistogramBridge().get());
    }

    @NotNull
    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        return (CpuUsageHistogramReporter) ((HistogramConfiguration) this.histogramConfiguration.get()).getCpuUsageHistogramReporter().get();
    }

    @NotNull
    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.INSTANCE;
        Provider provider = this.divStorageComponent;
        return companion.ofNullable(provider != null ? (DivStorageComponent) provider.get() : null);
    }

    @NotNull
    public final DivRequestExecutor divRequestExecutor() {
        return (DivRequestExecutor) this.divRequestExecutor.get();
    }

    /* compiled from: DivKitConfiguration.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0003\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000eJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/DivKitConfiguration$Builder;", "", "()V", "divRequestExecutor", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/DivRequestExecutor;", "kotlin.jvm.PlatformType", "divStorageComponent", "Lcom/yandex/div/storage/DivStorageComponent;", "executorService", "Ljava/util/concurrent/ExecutorService;", "histogramConfiguration", "Lcom/yandex/div/histogram/HistogramConfiguration;", "sendBeaconConfiguration", "Lcom/yandex/android/beacon/SendBeaconConfiguration;", "build", "Lcom/yandex/div/core/DivKitConfiguration;", "requestExecutor", "component", NotificationCompat.CATEGORY_SERVICE, j.c, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private Provider divStorageComponent;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private Provider sendBeaconConfiguration;

        @NotNull
        private Provider histogramConfiguration = new Provider() { // from class: com.yandex.div.core.DivKitConfiguration$Builder$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                HistogramConfiguration histogramConfiguration;
                histogramConfiguration = HistogramConfiguration.DEFAULT;
                return histogramConfiguration;
            }
        };

        @NotNull
        private Provider divRequestExecutor = new Provider() { // from class: com.yandex.div.core.DivKitConfiguration$Builder$$ExternalSyntheticLambda2
            @Override // javax.inject.Provider
            public final Object get() {
                DivRequestExecutor divRequestExecutor;
                divRequestExecutor = DivRequestExecutor.STUB;
                return divRequestExecutor;
            }
        };

        public static /* synthetic */ SendBeaconConfiguration $r8$lambda$OQEh6ZczNYmPAFG_P0zo71mv2MQ(SendBeaconConfiguration sendBeaconConfiguration) {
            sendBeaconConfiguration$lambda$2(sendBeaconConfiguration);
            return null;
        }

        private static final SendBeaconConfiguration sendBeaconConfiguration$lambda$2(SendBeaconConfiguration sendBeaconConfiguration) {
            return sendBeaconConfiguration;
        }

        @NotNull
        public final Builder sendBeaconConfiguration(@NotNull final SendBeaconConfiguration configuration) {
            this.sendBeaconConfiguration = new Provider(configuration) { // from class: com.yandex.div.core.DivKitConfiguration$Builder$$ExternalSyntheticLambda0
                @Override // javax.inject.Provider
                public final Object get() {
                    DivKitConfiguration.Builder.$r8$lambda$OQEh6ZczNYmPAFG_P0zo71mv2MQ(null);
                    return null;
                }
            };
            return this;
        }

        @NotNull
        public final Builder sendBeaconConfiguration(@NotNull Provider configuration) {
            this.sendBeaconConfiguration = configuration;
            return this;
        }

        @NotNull
        public final Builder executorService(@NotNull ExecutorService service) {
            this.executorService = service;
            return this;
        }

        @NotNull
        public final Builder histogramConfiguration(@NotNull Provider configuration) {
            this.histogramConfiguration = configuration;
            return this;
        }

        @NotNull
        public final Builder divStorageComponent(@NotNull Provider component) {
            this.divStorageComponent = component;
            return this;
        }

        @NotNull
        public final Builder divRequestExecutor(@NotNull Provider requestExecutor) {
            this.divRequestExecutor = requestExecutor;
            return this;
        }

        @NotNull
        public final DivKitConfiguration build() {
            Provider provider = this.sendBeaconConfiguration;
            ExecutorService executorService = this.executorService;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(provider, executorService, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }
}
