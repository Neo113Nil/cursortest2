package com.mobilefuse.sdk.assetsmanager;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.ironsource.V5;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.common.BuildConfig;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpGetRequest;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.utils.TestableLazy;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseAssetManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001e\u0010 \u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\u0017\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0001¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0014H\u0016J\u0016\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\fJ\u0015\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00063"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManager;", "Lcom/mobilefuse/sdk/assetsmanager/AssetManager;", "()V", "<set-?>", "Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManagerService;", "assetService", "getAssetService", "()Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManagerService;", "setAssetService", "(Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManagerService;)V", "assetService$delegate", "Lcom/mobilefuse/sdk/utils/TestableLazy;", "Lcom/mobilefuse/sdk/assetsmanager/AssetSharedPrefsResolver;", "sharedPrefsResolver", "getSharedPrefsResolver", "()Lcom/mobilefuse/sdk/assetsmanager/AssetSharedPrefsResolver;", "setSharedPrefsResolver", "(Lcom/mobilefuse/sdk/assetsmanager/AssetSharedPrefsResolver;)V", "sharedPrefsResolver$delegate", "deleteAllCacheFiles", "", "getSpecificAssetAbsolutePath", V5.c.b, "", "callback", "Lcom/mobilefuse/sdk/assetsmanager/ResultCallback;", "getSpecificAssetAbsolutePathFlow", "Lcom/mobilefuse/sdk/rx/Flow;", "getSpecificAssetBytes", "", "context", "Landroid/content/Context;", "getSpecificAssetContent", "getSpecificAssetContentFlow", "getSpecificAssetContentSync", "getSpecificAssetFile", "Ljava/io/File;", "getSpecificAssetFile$mobilefuse_sdk_common_release", "removeAssetFile", "requestAndSaveSpecificAsset", "key", "value", "requestAndSaveSpecificAsset$mobilefuse_sdk_common_release", "requestAssetsManifest", "updateDependencies", NotificationCompat.CATEGORY_SERVICE, "sharedPrefs", "validateUnixTimeAndSave", "response", "Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManifestResponse;", "validateUnixTimeAndSave$mobilefuse_sdk_common_release", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class MobileFuseAssetManager implements AssetManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MobileFuseAssetManager.class, "assetService", "getAssetService()Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManagerService;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MobileFuseAssetManager.class, "sharedPrefsResolver", "getSharedPrefsResolver()Lcom/mobilefuse/sdk/assetsmanager/AssetSharedPrefsResolver;", 0))};

    @NotNull
    public static final MobileFuseAssetManager INSTANCE = new MobileFuseAssetManager();

    /* renamed from: assetService$delegate, reason: from kotlin metadata */
    private static final TestableLazy assetService = new TestableLazy(new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$assetService$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final MobileFuseAssetManagerService mo4828invoke() {
            return new MobileFuseAssetManagerService();
        }
    });

    /* renamed from: sharedPrefsResolver$delegate, reason: from kotlin metadata */
    private static final TestableLazy sharedPrefsResolver = new TestableLazy(new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$sharedPrefsResolver$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final AssetSharedPrefsResolver mo4828invoke() {
            return new AssetSharedPrefsResolver();
        }
    });

    private final MobileFuseAssetManagerService getAssetService() {
        return (MobileFuseAssetManagerService) assetService.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetSharedPrefsResolver getSharedPrefsResolver() {
        return (AssetSharedPrefsResolver) sharedPrefsResolver.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAssetService(MobileFuseAssetManagerService mobileFuseAssetManagerService) {
        assetService.setValue(this, $$delegatedProperties[0], mobileFuseAssetManagerService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSharedPrefsResolver(AssetSharedPrefsResolver assetSharedPrefsResolver) {
        sharedPrefsResolver.setValue(this, $$delegatedProperties[1], assetSharedPrefsResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteAllCacheFiles() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File filesDir = AppLifecycleHelper.getGlobalContext().getFilesDir();
            MobileFuseAssetManager mobileFuseAssetManager = INSTANCE;
            File file = new File(filesDir, mobileFuseAssetManager.getAssetService().getASSET_FOLDER_NAME());
            if (file.exists()) {
                FilesKt.deleteRecursively(file);
            }
            mobileFuseAssetManager.getSharedPrefsResolver().removeAssetPreference();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @VisibleForTesting
    public final void requestAndSaveSpecificAsset$mobilefuse_sdk_common_release(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            INSTANCE.getAssetService().resolveAssetPath(BuildConfig.BASE_ASSET_URL + key, key).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$requestAndSaveSpecificAsset$$inlined$handleExceptions$lambda$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    AssetSharedPrefsResolver sharedPrefsResolver2;
                    Intrinsics.checkNotNullParameter(result, "result");
                    if ((result instanceof SuccessResult) && ((Boolean) ((SuccessResult) result).getValue()).booleanValue()) {
                        MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
                        sharedPrefsResolver2 = mobileFuseAssetManager.getSharedPrefsResolver();
                        sharedPrefsResolver2.saveAssetsPreferences(key, value);
                        DebuggingKt.logDebug$default(mobileFuseAssetManager, "Save preference for specific asset file: " + key, null, 2, null);
                    }
                }
            });
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private MobileFuseAssetManager() {
    }

    @Override // com.mobilefuse.sdk.assetsmanager.AssetManager
    public void requestAssetsManifest() {
        final Flow<Either<BaseError, MobileFuseAssetManifestResponse>> assetManifestJson = getAssetService().getAssetManifestJson(new HttpGetRequest("https://cdn.mobilefuse.com/sdk/assets/android/1.11.0/manifest.json", null, false, false, 0L, 26, null));
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$runOn$$inlined$transformForConcurrency$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$runOn$$inlined$transformForConcurrency$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow2;
                        SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$runOn$$inlined$transformForConcurrency$1$1$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                FlowCollector.this.emit(value);
                            }
                        });
                    }
                });
            }
        });
        FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$requestAssetsManifest$$inlined$map$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends MobileFuseAssetManifestResponse>> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$requestAssetsManifest$$inlined$map$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow2.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow2;
                        try {
                            Either either = (Either) ((SuccessResult) value).getValue();
                            if (either instanceof SuccessResult) {
                                MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
                                DebuggingKt.logDebug$default(mobileFuseAssetManager, "Successfully fetched assets manifest JSON. Response: " + ((MobileFuseAssetManifestResponse) ((SuccessResult) either).getValue()), null, 2, null);
                                mobileFuseAssetManager.validateUnixTimeAndSave$mobilefuse_sdk_common_release((MobileFuseAssetManifestResponse) ((SuccessResult) either).getValue());
                            } else if (either instanceof ErrorResult) {
                                MobileFuseAssetManager mobileFuseAssetManager2 = MobileFuseAssetManager.INSTANCE;
                                DebuggingKt.logError$default(mobileFuseAssetManager2, "Error requesting the assets manifest json", null, null, 6, null);
                                mobileFuseAssetManager2.deleteAllCacheFiles();
                            }
                            flowCollector.emit(new SuccessResult(either));
                        } catch (Throwable th) {
                            flowCollector.emit(new ErrorResult(th));
                        }
                    }
                });
            }
        }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$requestAssetsManifest$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                }
            }
        });
    }

    @VisibleForTesting
    public final void validateUnixTimeAndSave$mobilefuse_sdk_common_release(@NotNull MobileFuseAssetManifestResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Map<String, String> paths = response.getPaths();
            for (String str : getAssetService().getDEFAULT_ASSETS_LIST()) {
                if (paths.containsKey(str)) {
                    String str2 = paths.get(str);
                    long parseLong = str2 != null ? Long.parseLong(str2) : 0L;
                    MobileFuseAssetManager mobileFuseAssetManager = INSTANCE;
                    String resolveAssetsPreferences = mobileFuseAssetManager.getSharedPrefsResolver().resolveAssetsPreferences(str);
                    if (resolveAssetsPreferences == null) {
                        resolveAssetsPreferences = null;
                    }
                    if (resolveAssetsPreferences != null && !StringsKt.isBlank(resolveAssetsPreferences) && parseLong <= Long.parseLong(resolveAssetsPreferences)) {
                    }
                    mobileFuseAssetManager.requestAndSaveSpecificAsset$mobilefuse_sdk_common_release(str, String.valueOf(parseLong));
                } else {
                    INSTANCE.removeAssetFile(str);
                }
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // com.mobilefuse.sdk.assetsmanager.AssetManager
    public void getSpecificAssetAbsolutePath(@NotNull String fileName, @NotNull final ResultCallback callback) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getSpecificAssetAbsolutePathFlow(fileName).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetAbsolutePath$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    ResultCallback.this.onResult((String) ((SuccessResult) result).getValue());
                }
            }
        });
    }

    @NotNull
    public final Flow<String> getSpecificAssetAbsolutePathFlow(@NotNull final String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetAbsolutePathFlow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FlowCollector<? super String> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                String str = "file:///android_asset/mobilefuse/" + fileName;
                try {
                    File specificAssetFile$mobilefuse_sdk_common_release = MobileFuseAssetManager.INSTANCE.getSpecificAssetFile$mobilefuse_sdk_common_release(fileName);
                    if (specificAssetFile$mobilefuse_sdk_common_release != null) {
                        receiver.emitSuccess("file:///" + specificAssetFile$mobilefuse_sdk_common_release.getAbsolutePath());
                    } else {
                        receiver.emitSuccess(str);
                    }
                } catch (Throwable th) {
                    StabilityHelper.logException(receiver, th);
                    receiver.emitSuccess(str);
                }
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$$inlined$transformOnThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$$inlined$transformOnThread$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$.inlined.transformOnThread.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitError(@NotNull Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                FlowCollector.DefaultImpls.emitError(this, error);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitSuccess(T t) {
                                FlowCollector.DefaultImpls.emitSuccess(this, t);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow3.emit(value);
                            }
                        });
                    }
                });
            }
        });
        return FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetAbsolutePathFlow$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetAbsolutePathFlow$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow3;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(null));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
                        }
                    }
                });
            }
        });
    }

    @Override // com.mobilefuse.sdk.assetsmanager.AssetManager
    @Nullable
    public byte[] getSpecificAssetBytes(@NotNull String fileName, @NotNull Context context) {
        byte[] readBytes;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File specificAssetFile$mobilefuse_sdk_common_release = getSpecificAssetFile$mobilefuse_sdk_common_release(fileName);
            if (specificAssetFile$mobilefuse_sdk_common_release != null && (readBytes = FilesKt.readBytes(specificAssetFile$mobilefuse_sdk_common_release)) != null) {
                return readBytes;
            }
            String assetContent = Utils.getAssetContent(context, "mobilefuse/" + fileName);
            Intrinsics.checkNotNullExpressionValue(assetContent, "Utils.getAssetContent(co…\"mobilefuse/${fileName}\")");
            byte[] bytes = assetContent.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return null;
        }
    }

    @NotNull
    public final Flow<String> getSpecificAssetContentFlow(@NotNull final String fileName, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetContentFlow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FlowCollector<? super String> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                try {
                    receiver.emitSuccess(MobileFuseAssetManager.INSTANCE.getSpecificAssetContentSync(fileName, context));
                } catch (Throwable th) {
                    StabilityHelper.logException(receiver, th);
                    receiver.emitSuccess(null);
                }
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$$inlined$transformOnThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$$inlined$transformOnThread$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$emitOn$.inlined.transformOnThread.2.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitError(@NotNull Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                FlowCollector.DefaultImpls.emitError(this, error);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitSuccess(T t) {
                                FlowCollector.DefaultImpls.emitSuccess(this, t);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow3.emit(value);
                            }
                        });
                    }
                });
            }
        });
        return FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetContentFlow$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetContentFlow$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow3;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(null));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
                        }
                    }
                });
            }
        });
    }

    public final void getSpecificAssetContent(@NotNull String fileName, @NotNull Context context, @NotNull final ResultCallback callback) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getSpecificAssetContentFlow(fileName, context).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$getSpecificAssetContent$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    ResultCallback.this.onResult((String) ((SuccessResult) result).getValue());
                }
            }
        });
    }

    @Nullable
    public final String getSpecificAssetContentSync(@NotNull String fileName, @NotNull Context context) {
        String readText;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        File specificAssetFile$mobilefuse_sdk_common_release = getSpecificAssetFile$mobilefuse_sdk_common_release(fileName);
        if (specificAssetFile$mobilefuse_sdk_common_release != null && (readText = FilesKt.readText(specificAssetFile$mobilefuse_sdk_common_release, Charsets.UTF_8)) != null) {
            return readText;
        }
        return Utils.getAssetContent(context, "mobilefuse/" + fileName);
    }

    @VisibleForTesting
    @Nullable
    public final File getSpecificAssetFile$mobilefuse_sdk_common_release(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File file = new File(new File(AppLifecycleHelper.getGlobalContext().getFilesDir(), getAssetService().getASSET_FOLDER_NAME()), fileName);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return null;
        }
    }

    private final void removeAssetFile(final String fileName) {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager$removeAssetFile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                AssetSharedPrefsResolver sharedPrefsResolver2;
                MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
                File specificAssetFile$mobilefuse_sdk_common_release = mobileFuseAssetManager.getSpecificAssetFile$mobilefuse_sdk_common_release(fileName);
                if (specificAssetFile$mobilefuse_sdk_common_release != null) {
                    specificAssetFile$mobilefuse_sdk_common_release.delete();
                }
                sharedPrefsResolver2 = mobileFuseAssetManager.getSharedPrefsResolver();
                sharedPrefsResolver2.removeSpecificAsset(fileName);
            }
        }, 1, null);
    }

    public final void updateDependencies(@NotNull MobileFuseAssetManagerService service, @NotNull AssetSharedPrefsResolver sharedPrefs) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        setAssetService(service);
        setSharedPrefsResolver(sharedPrefs);
    }
}
