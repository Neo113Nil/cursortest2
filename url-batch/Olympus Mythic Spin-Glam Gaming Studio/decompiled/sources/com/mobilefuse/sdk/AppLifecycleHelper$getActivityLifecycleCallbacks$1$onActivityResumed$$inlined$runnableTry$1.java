package com.mobilefuse.sdk;

import android.app.Activity;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Try.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/mobilefuse/sdk/exception/TryKt$runnableTry$1"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1 extends Lambda implements Function0 {
    final /* synthetic */ Activity $activity$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1(Activity activity) {
        super(0);
        this.$activity$inlined = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        m4825invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4825invoke() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AppLifecycleHelper appLifecycleHelper = AppLifecycleHelper.INSTANCE;
            appLifecycleHelper.callActivityObservers(new Function1() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1$lambda$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AppLifecycleHelper.ActivityLifecycleObserver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onActivityResumed(AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1.this.$activity$inlined);
                }
            });
            appLifecycleHelper.onApplicationTransitionToForeground();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
