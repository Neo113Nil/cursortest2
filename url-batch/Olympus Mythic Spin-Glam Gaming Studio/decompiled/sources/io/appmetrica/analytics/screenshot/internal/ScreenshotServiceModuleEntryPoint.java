package io.appmetrica.analytics.screenshot.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.O6;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.screenshot.impl.H;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.g0;
import io.appmetrica.analytics.screenshot.impl.j0;
import io.appmetrica.analytics.screenshot.internal.config.ParcelableRemoteScreenshotConfig;
import io.appmetrica.analytics.screenshot.internal.config.RemoteScreenshotConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/screenshot/internal/config/RemoteScreenshotConfig;", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "", "initServiceSide", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "g", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "h", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "getClientConfigProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "clientConfigProvider", "<init>", "()V", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScreenshotServiceModuleEntryPoint extends ModuleServiceEntryPoint<RemoteScreenshotConfig> {
    private g0 a;
    private final j0 b = new j0();
    private final I c = new I(null, null, 3, null);
    private final H d = new H(null, 1, null);
    private final ScreenshotServiceModuleEntryPoint$configUpdateListener$1 e = new RemoteConfigUpdateListener<RemoteScreenshotConfig>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(@NotNull ModuleRemoteConfig<RemoteScreenshotConfig> config) {
            ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = ScreenshotServiceModuleEntryPoint.this;
            RemoteScreenshotConfig featuresConfig = config.getFeaturesConfig();
            screenshotServiceModuleEntryPoint.a = featuresConfig != null ? new g0(featuresConfig) : null;
        }
    };

    /* renamed from: f, reason: from kotlin metadata */
    private final String identifier = "screenshot";
    private final ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 g = new RemoteConfigExtensionConfiguration<RemoteScreenshotConfig>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public Map<String, Integer> getBlocks() {
            return MapsKt.mapOf(TuplesKt.to(O6.A0, 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public List<String> getFeatures() {
            return CollectionsKt.listOf(O6.A0);
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public JsonParser<RemoteScreenshotConfig> getJsonParser() {
            I i;
            i = ScreenshotServiceModuleEntryPoint.this.c;
            return i;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public Converter<RemoteScreenshotConfig, byte[]> getProtobufConverter() {
            H h;
            h = ScreenshotServiceModuleEntryPoint.this.d;
            return h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public RemoteConfigUpdateListener<RemoteScreenshotConfig> getRemoteConfigUpdateListener() {
            ScreenshotServiceModuleEntryPoint$configUpdateListener$1 screenshotServiceModuleEntryPoint$configUpdateListener$1;
            screenshotServiceModuleEntryPoint$configUpdateListener$1 = ScreenshotServiceModuleEntryPoint.this.e;
            return screenshotServiceModuleEntryPoint$configUpdateListener$1;
        }
    };
    private final ScreenshotServiceModuleEntryPoint$clientConfigProvider$1 h = new ClientConfigProvider() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        @Nullable
        public Bundle getConfigBundleForClient() {
            j0 j0Var;
            g0 g0Var;
            j0Var = ScreenshotServiceModuleEntryPoint.this.b;
            g0Var = ScreenshotServiceModuleEntryPoint.this.a;
            j0Var.getClass();
            if (g0Var == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("config", new ParcelableRemoteScreenshotConfig(g0Var));
            return bundle;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    @NotNull
    public ClientConfigProvider getClientConfigProvider() {
        return this.h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    @NotNull
    public RemoteConfigExtensionConfiguration<RemoteScreenshotConfig> getRemoteConfigExtensionConfiguration() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(@NotNull ServiceContext serviceContext, @NotNull ModuleRemoteConfig<RemoteScreenshotConfig> initialConfig) {
        RemoteScreenshotConfig featuresConfig = initialConfig.getFeaturesConfig();
        this.a = featuresConfig != null ? new g0(featuresConfig) : null;
    }
}
