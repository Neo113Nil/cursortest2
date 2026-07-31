package expo.modules.devlauncher.koin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DevLauncherKoinComponent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class DevLauncherKoinComponentKt$optInject$1<T> implements Function0<T> {
    final /* synthetic */ Function0<ParametersHolder> $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ DevLauncherKoinComponent $this_optInject;

    /* JADX WARN: Multi-variable type inference failed */
    public DevLauncherKoinComponentKt$optInject$1(DevLauncherKoinComponent devLauncherKoinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        this.$this_optInject = devLauncherKoinComponent;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        Scope rootScope;
        Class<Object> cls;
        try {
            DevLauncherKoinComponent devLauncherKoinComponent = this.$this_optInject;
            Qualifier qualifier = this.$qualifier;
            Function0<ParametersHolder> function0 = this.$parameters;
            if (devLauncherKoinComponent instanceof KoinScopeComponent) {
                rootScope = ((KoinScopeComponent) devLauncherKoinComponent).getScope();
                Intrinsics.reifiedOperationMarker(4, "T");
                cls = Object.class;
            } else {
                rootScope = devLauncherKoinComponent.getKoin().getScopeRegistry().getRootScope();
                Intrinsics.reifiedOperationMarker(4, "T");
                cls = Object.class;
            }
            return (T) rootScope.get(Reflection.getOrCreateKotlinClass(cls), qualifier, function0);
        } catch (Exception unused) {
            return null;
        }
    }
}
