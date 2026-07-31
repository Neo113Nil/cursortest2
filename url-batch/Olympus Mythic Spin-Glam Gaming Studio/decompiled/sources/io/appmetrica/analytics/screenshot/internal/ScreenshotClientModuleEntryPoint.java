package io.appmetrica.analytics.screenshot.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C5871h;
import io.appmetrica.analytics.screenshot.impl.C5875l;
import io.appmetrica.analytics.screenshot.impl.C5876m;
import io.appmetrica.analytics.screenshot.impl.C5885w;
import io.appmetrica.analytics.screenshot.impl.C5886x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.internal.config.ParcelableRemoteScreenshotConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/internal/config/ParcelableRemoteScreenshotConfig;", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "", "initClientSide", "onActivated", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "<init>", "()V", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<ParcelableRemoteScreenshotConfig> {
    private C5875l a;
    private S d;
    private final C5871h b = new C5871h();
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 c = new ServiceConfigUpdateListener<ParcelableRemoteScreenshotConfig>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(@NotNull ModuleServiceConfig<ParcelableRemoteScreenshotConfig> config) {
            C5875l c5875l;
            S s;
            S s2;
            C5875l c5875l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    ParcelableRemoteScreenshotConfig featuresConfig = config.getFeaturesConfig();
                    S s3 = null;
                    if (featuresConfig != null) {
                        boolean enabled = featuresConfig.getEnabled();
                        D config2 = featuresConfig.getConfig();
                        c5875l = new C5875l(enabled, config2 != null ? new C5876m(config2) : null);
                    } else {
                        c5875l = null;
                    }
                    screenshotClientModuleEntryPoint.a = c5875l;
                    s = screenshotClientModuleEntryPoint.d;
                    if (s != null) {
                        s2 = screenshotClientModuleEntryPoint.d;
                        if (s2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("screenshotCaptorsController");
                        } else {
                            s3 = s2;
                        }
                        c5875l2 = screenshotClientModuleEntryPoint.a;
                        s3.a(c5875l2);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: from kotlin metadata */
    private final String identifier = "screenshot";
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f = new ServiceConfigExtensionConfiguration<ParcelableRemoteScreenshotConfig>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public BundleToServiceConfigConverter<ParcelableRemoteScreenshotConfig> getBundleConverter() {
            C5871h c5871h;
            c5871h = ScreenshotClientModuleEntryPoint.this.b;
            return c5871h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public ServiceConfigUpdateListener<ParcelableRemoteScreenshotConfig> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public ServiceConfigExtensionConfiguration<ParcelableRemoteScreenshotConfig> getServiceConfigExtensionConfiguration() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull ClientContext clientContext) {
        synchronized (this) {
            try {
                C5886x c5886x = new C5886x(clientContext);
                this.d = new S(AndroidUtils.isApiAchieved(34) ? new C5885w(clientContext, c5886x) : new G(clientContext, c5886x));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                S s = this.d;
                if (s != null) {
                    C5875l c5875l = this.a;
                    Iterator it = s.a.iterator();
                    while (it.hasNext()) {
                        ((P) it.next()).a();
                    }
                    s.a(c5875l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
