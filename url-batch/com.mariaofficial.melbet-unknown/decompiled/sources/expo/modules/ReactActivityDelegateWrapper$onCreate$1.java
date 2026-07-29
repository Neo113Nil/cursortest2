package expo.modules;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactRootView;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.rncompatibility.ReactNativeFeatureFlags;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.ReactActivityDelegateWrapper$onCreate$1", f = "ReactActivityDelegateWrapper.kt", i = {}, l = {151, 185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ReactActivityDelegateWrapper$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactActivityDelegateWrapper$onCreate$1(ReactActivityDelegateWrapper reactActivityDelegateWrapper, Continuation<? super ReactActivityDelegateWrapper$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = reactActivityDelegateWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactActivityDelegateWrapper$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactActivityDelegateWrapper$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        if (r12 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler;
        Object awaitDelayLoadAppWhenReady;
        CompletableDeferred completableDeferred;
        ReactDelegate reactDelegate;
        Object loadAppImpl;
        ReactActivity reactActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = this.this$0;
            delayLoadAppHandler = reactActivityDelegateWrapper.getDelayLoadAppHandler();
            this.label = 1;
            awaitDelayLoadAppWhenReady = reactActivityDelegateWrapper.awaitDelayLoadAppWhenReady(delayLoadAppHandler, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        completableDeferred = this.this$0.loadAppReady;
        completableDeferred.complete(Unit.INSTANCE);
        if (Build.VERSION.SDK_INT >= 26 && this.this$0.isWideColorGamutEnabled()) {
            reactActivity = this.this$0.activity;
            reactActivity.getWindow().setColorMode(1);
        }
        Bundle composeLaunchOptions = this.this$0.composeLaunchOptions();
        if (ReactNativeFeatureFlags.INSTANCE.getEnableBridgelessArchitecture()) {
            reactDelegate = new ReactDelegate(this.this$0.getPlainActivity(), this.this$0.getReactHost(), this.this$0.getMainComponentName(), composeLaunchOptions);
        } else {
            Activity plainActivity = this.this$0.getPlainActivity();
            ReactNativeHost reactNativeHost = this.this$0.getReactNativeHost();
            String mainComponentName = this.this$0.getMainComponentName();
            boolean fabricEnabled = this.this$0.getFabricEnabled();
            final ReactActivityDelegateWrapper reactActivityDelegateWrapper2 = this.this$0;
            reactDelegate = new ReactDelegate(composeLaunchOptions, plainActivity, reactNativeHost, mainComponentName, fabricEnabled) { // from class: expo.modules.ReactActivityDelegateWrapper$onCreate$1.1
                @Override // com.facebook.react.ReactDelegate
                protected ReactRootView createRootView() {
                    ReactRootView createRootView = reactActivityDelegateWrapper2.createRootView();
                    return createRootView == null ? super.createRootView() : createRootView;
                }
            };
        }
        Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
        declaredField.setAccessible(true);
        declaredField.set(this.this$0.getDelegate(), reactDelegate);
        if (this.this$0.getMainComponentName() != null) {
            ReactActivityDelegateWrapper reactActivityDelegateWrapper3 = this.this$0;
            this.label = 2;
            loadAppImpl = reactActivityDelegateWrapper3.loadAppImpl(reactActivityDelegateWrapper3.getMainComponentName(), false, this);
        }
        return Unit.INSTANCE;
    }
}
