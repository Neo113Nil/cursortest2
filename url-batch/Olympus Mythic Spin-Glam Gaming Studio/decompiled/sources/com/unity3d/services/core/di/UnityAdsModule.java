package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnityAdsModule.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J*\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020 0(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020-J\u0006\u0010/\u001a\u00020-J\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u0010#\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u00105\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u00106\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u0010$\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u0010%\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u0010&\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u0010)\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0002J\u0016\u0010:\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J&\u0010;\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020EH\u0002¨\u0006F"}, d2 = {"Lcom/unity3d/services/core/di/UnityAdsModule;", "", "<init>", "()V", "androidContext", "Landroid/content/Context;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "ioDispatcher", "sdkDispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "initCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "parentJob", "Lkotlinx/coroutines/Job;", "loadCoroutineScope", "showCoroutineScope", "transactionCoroutineScope", "ilrdCoroutineScope", "lifecycleCoroutineScope", "getTokenCoroutineScope", "offerwallSignalsCoroutineScope", "omidCoroutineScope", "publicApiJob", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "gatewayDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "context", "dispatcher", "privacyDataStore", "privacyFsmDataStore", "nativeConfigurationDataStore", "glInfoDataStore", "fetchGLInfo", "Landroidx/datastore/core/DataMigration;", "iapTransactionDataStore", "webViewConfigurationDataStore", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "publicJsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "privateJsonStorage", "memoryJsonStorage", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "gatewayCacheDataStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "dataStore", "idfiDataStore", "auidDataStore", "provideJsonStorage", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "provideByteStringDataSource", "provideByteStringDataStore", "dataStoreFile", "", "getDefaultAdOperations", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultRequestPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestRetryPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestTimeoutPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(10000);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(120000);
        _create.setRetryWaitBase(500);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(2500);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    @NotNull
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder3, "newBuilder(...)");
        FeatureFlagsKt.Dsl _create3 = companion3._create(newBuilder3);
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        _create.setMaxExtrasSizeKb(4);
        return _create._build();
    }

    @NotNull
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @NotNull
    public final CoroutineDispatcher mainDispatcher() {
        return Dispatchers.getMain();
    }

    @NotNull
    public final CoroutineDispatcher defaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @NotNull
    public final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }

    @NotNull
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @NotNull
    public final CoroutineScope initCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope loadCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope showCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope transactionCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope ilrdCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_ILRD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope lifecycleCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_LIFECYCLE_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope getTokenCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope offerwallSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final CoroutineScope omidCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull CoroutineExceptionHandler errorHandler, @NotNull Job parentJob) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        return CoroutineScopeKt.CoroutineScope(parentJob.plus(dispatchers.getDefault()).plus(new CoroutineName(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final Job publicApiJob(@NotNull final DiagnosticEventRepository diagnosticEventRepository) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        Job$default.invokeOnCompletion(new Function1() { // from class: com.unity3d.services.core.di.UnityAdsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit publicApiJob$lambda$1$lambda$0;
                publicApiJob$lambda$1$lambda$0 = UnityAdsModule.publicApiJob$lambda$1$lambda$0(DiagnosticEventRepository.this, (Throwable) obj);
                return publicApiJob$lambda$1$lambda$0;
            }
        });
        return Job$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit publicApiJob$lambda$1$lambda$0(DiagnosticEventRepository diagnosticEventRepository, Throwable th) {
        try {
            diagnosticEventRepository.flush();
        } catch (Throwable th2) {
            DeviceLog.error("Failed to flush diagnostic events", th2);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(@NotNull final Context context, @NotNull CoroutineDispatcher dispatcher, @NotNull DataMigration<ByteStringStoreOuterClass.ByteStringStore> fetchGLInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(fetchGLInfo, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, CollectionsKt.listOf(fetchGLInfo), CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default(null, 1, null))), new Function0() { // from class: com.unity3d.services.core.di.UnityAdsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                File glInfoDataStore$lambda$2;
                glInfoDataStore$lambda$2 = UnityAdsModule.glInfoDataStore$lambda$2(context);
                return glInfoDataStore$lambda$2;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File glInfoDataStore$lambda$2(Context context) {
        return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(@NotNull Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @NotNull
    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(@NotNull final Context context, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default(null, 1, null))), new Function0() { // from class: com.unity3d.services.core.di.UnityAdsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                File webViewConfigurationDataStore$lambda$3;
                webViewConfigurationDataStore$lambda$3 = UnityAdsModule.webViewConfigurationDataStore$lambda$3(context);
                return webViewConfigurationDataStore$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webViewConfigurationDataStore$lambda$3(Context context) {
        return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
    }

    @NotNull
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @NotNull
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @NotNull
    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    @NotNull
    public final ByteStringDataSource gatewayCacheDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource idfiDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource auidDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyFsmDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource nativeConfigurationDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource glInfoDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource iapTransactionDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        Storage storage = StorageManager.getStorage(storageType);
        Intrinsics.checkNotNullExpressionValue(storage, "getStorage(...)");
        return storage;
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(final Context context, CoroutineDispatcher dispatcher, final String dataStoreFile) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default(null, 1, null))), new Function0() { // from class: com.unity3d.services.core.di.UnityAdsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                File unityAdsDataStoreFile;
                unityAdsDataStoreFile = ContextExtensionsKt.unityAdsDataStoreFile(context, dataStoreFile);
                return unityAdsDataStoreFile;
            }
        }, 4, null);
    }
}
