package expo.modules.devlauncher.koin;

import expo.modules.devlauncher.helpers.DevLauncherInstallationIDHelper;
import expo.modules.devlauncher.launcher.DevLauncherIntentRegistry;
import expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface;
import expo.modules.devlauncher.launcher.DevLauncherLifecycle;
import expo.modules.devlauncher.launcher.loaders.DevLauncherAppLoaderFactory;
import expo.modules.devlauncher.launcher.loaders.DevLauncherAppLoaderFactoryInterface;
import expo.modules.devlauncher.tests.DevLauncherDisabledTestInterceptor;
import expo.modules.devlauncher.tests.DevLauncherTestInterceptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.KoinApplicationKt;
import org.koin.dsl.ModuleDSLKt;

/* compiled from: DevLauncherKoinApp.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\t\u001a\u00020\n\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"DevLauncherTestModule", "Lorg/koin/core/module/Module;", "getDevLauncherTestModule", "()Lorg/koin/core/module/Module;", "DevLauncherBaseModule", "getDevLauncherBaseModule", "koinAppFactory", "Lkotlin/Function0;", "Lorg/koin/core/KoinApplication;", "devLauncherKoin", "Lorg/koin/core/Koin;", "expo-dev-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherKoinAppKt {
    private static final Module DevLauncherTestModule = ModuleDSLKt.module$default(false, new Function1() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit DevLauncherTestModule$lambda$1;
            DevLauncherTestModule$lambda$1 = DevLauncherKoinAppKt.DevLauncherTestModule$lambda$1((Module) obj);
            return DevLauncherTestModule$lambda$1;
        }
    }, 1, null);
    private static final Module DevLauncherBaseModule = ModuleDSLKt.module$default(false, new Function1() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit DevLauncherBaseModule$lambda$7;
            DevLauncherBaseModule$lambda$7 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7((Module) obj);
            return DevLauncherBaseModule$lambda$7;
        }
    }, 1, null);
    private static final Function0<KoinApplication> koinAppFactory = new Function0() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KoinApplication koinAppFactory$lambda$9;
            koinAppFactory$lambda$9 = DevLauncherKoinAppKt.koinAppFactory$lambda$9();
            return koinAppFactory$lambda$9;
        }
    };

    public static final Module getDevLauncherTestModule() {
        return DevLauncherTestModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevLauncherTestInterceptor DevLauncherTestModule$lambda$1$lambda$0(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DevLauncherDisabledTestInterceptor();
    }

    public static final Module getDevLauncherBaseModule() {
        return DevLauncherBaseModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevLauncherIntentRegistryInterface DevLauncherBaseModule$lambda$7$lambda$2(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DevLauncherIntentRegistry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient DevLauncherBaseModule$lambda$7$lambda$3(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new OkHttpClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevLauncherLifecycle DevLauncherBaseModule$lambda$7$lambda$4(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DevLauncherLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevLauncherInstallationIDHelper DevLauncherBaseModule$lambda$7$lambda$5(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DevLauncherInstallationIDHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevLauncherAppLoaderFactoryInterface DevLauncherBaseModule$lambda$7$lambda$6(Scope factory, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DevLauncherAppLoaderFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KoinApplication koinAppFactory$lambda$9() {
        return KoinApplicationKt.koinApplication((Function1<? super KoinApplication, Unit>) new Function1() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit koinAppFactory$lambda$9$lambda$8;
                koinAppFactory$lambda$9$lambda$8 = DevLauncherKoinAppKt.koinAppFactory$lambda$9$lambda$8((KoinApplication) obj);
                return koinAppFactory$lambda$9$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit koinAppFactory$lambda$9$lambda$8(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "$this$koinApplication");
        koinApplication.modules(DevLauncherBaseModule, DevLauncherTestModule);
        return Unit.INSTANCE;
    }

    public static final Koin devLauncherKoin() {
        return DevLauncherKoinContext.INSTANCE.getApp().getKoin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevLauncherTestModule$lambda$1(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DevLauncherTestInterceptor DevLauncherTestModule$lambda$1$lambda$0;
                DevLauncherTestModule$lambda$1$lambda$0 = DevLauncherKoinAppKt.DevLauncherTestModule$lambda$1$lambda$0((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherTestModule$lambda$1$lambda$0;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevLauncherTestInterceptor.class), null, function2, Kind.Singleton, CollectionsKt.emptyList()));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevLauncherBaseModule$lambda$7(Module module) {
        Intrinsics.checkNotNullParameter(module, "$this$module");
        Function2 function2 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DevLauncherIntentRegistryInterface DevLauncherBaseModule$lambda$7$lambda$2;
                DevLauncherBaseModule$lambda$7$lambda$2 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7$lambda$2((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherBaseModule$lambda$7$lambda$2;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevLauncherIntentRegistryInterface.class), null, function2, Kind.Singleton, CollectionsKt.emptyList()));
        SingleInstanceFactory<?> singleInstanceFactory2 = singleInstanceFactory;
        module.indexPrimaryType(singleInstanceFactory2);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory);
        }
        new KoinDefinition(module, singleInstanceFactory2);
        Function2 function22 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                OkHttpClient DevLauncherBaseModule$lambda$7$lambda$3;
                DevLauncherBaseModule$lambda$7$lambda$3 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7$lambda$3((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherBaseModule$lambda$7$lambda$3;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, function22, Kind.Singleton, CollectionsKt.emptyList()));
        SingleInstanceFactory<?> singleInstanceFactory4 = singleInstanceFactory3;
        module.indexPrimaryType(singleInstanceFactory4);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory3);
        }
        new KoinDefinition(module, singleInstanceFactory4);
        Function2 function23 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DevLauncherLifecycle DevLauncherBaseModule$lambda$7$lambda$4;
                DevLauncherBaseModule$lambda$7$lambda$4 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7$lambda$4((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherBaseModule$lambda$7$lambda$4;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevLauncherLifecycle.class), null, function23, Kind.Singleton, CollectionsKt.emptyList()));
        SingleInstanceFactory<?> singleInstanceFactory6 = singleInstanceFactory5;
        module.indexPrimaryType(singleInstanceFactory6);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory5);
        }
        new KoinDefinition(module, singleInstanceFactory6);
        Function2 function24 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DevLauncherInstallationIDHelper DevLauncherBaseModule$lambda$7$lambda$5;
                DevLauncherBaseModule$lambda$7$lambda$5 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7$lambda$5((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherBaseModule$lambda$7$lambda$5;
            }
        };
        SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevLauncherInstallationIDHelper.class), null, function24, Kind.Singleton, CollectionsKt.emptyList()));
        SingleInstanceFactory<?> singleInstanceFactory8 = singleInstanceFactory7;
        module.indexPrimaryType(singleInstanceFactory8);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactory7);
        }
        new KoinDefinition(module, singleInstanceFactory8);
        Function2 function25 = new Function2() { // from class: expo.modules.devlauncher.koin.DevLauncherKoinAppKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DevLauncherAppLoaderFactoryInterface DevLauncherBaseModule$lambda$7$lambda$6;
                DevLauncherBaseModule$lambda$7$lambda$6 = DevLauncherKoinAppKt.DevLauncherBaseModule$lambda$7$lambda$6((Scope) obj, (ParametersHolder) obj2);
                return DevLauncherBaseModule$lambda$7$lambda$6;
            }
        };
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DevLauncherAppLoaderFactoryInterface.class), null, function25, Kind.Factory, CollectionsKt.emptyList()));
        module.indexPrimaryType(factoryInstanceFactory);
        new KoinDefinition(module, factoryInstanceFactory);
        return Unit.INSTANCE;
    }
}
