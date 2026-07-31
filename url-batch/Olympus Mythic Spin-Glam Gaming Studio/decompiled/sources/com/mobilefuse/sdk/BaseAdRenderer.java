package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Zf;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseAdRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001xB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010I\u001a\u00020JH\u0004J\b\u0010K\u001a\u00020JH\u0014J\b\u0010L\u001a\u00020%H\u0002J\b\u0010M\u001a\u00020JH\u0016J\b\u0010N\u001a\u00020JH\u0004J\b\u0010O\u001a\u00020JH\u0004J\n\u0010P\u001a\u0004\u0018\u00010\u001dH&J\u0014\u0010Q\u001a\u0004\u0018\u00010;2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H$J\u0006\u0010R\u001a\u000203J\u0006\u0010S\u001a\u000203J\b\u0010T\u001a\u000203H\u0004J\u0006\u0010U\u001a\u000203J\u0006\u00108\u001a\u000203J\b\u0010V\u001a\u00020JH\u0016J\u0006\u0010W\u001a\u00020JJ\b\u0010X\u001a\u00020JH\u0016J\u0006\u0010Y\u001a\u00020JJ\b\u0010Z\u001a\u00020JH\u0016J\u0006\u0010[\u001a\u00020JJ\u0006\u0010\\\u001a\u00020JJ\b\u0010]\u001a\u000203H\u0014J\b\u0010^\u001a\u00020JH\u0004J\u000e\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020aJ*\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020a2\u0018\u0010b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010cH\u0004J\b\u0010d\u001a\u00020JH\u0004J\u0012\u0010e\u001a\u00020J2\b\u0010f\u001a\u0004\u0018\u00010gH\u0004J\u001c\u0010h\u001a\u00020J2\b\u0010i\u001a\u0004\u0018\u00010j2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010k\u001a\u00020J2\b\u0010 \u001a\u0004\u0018\u00010!J\u0012\u0010l\u001a\u00020J2\b\u0010 \u001a\u0004\u0018\u00010!H$J\u0010\u0010m\u001a\u00020J2\b\u0010n\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010o\u001a\u00020JJ\b\u0010p\u001a\u00020JH$J\b\u0010q\u001a\u00020JH\u0004J\u0006\u0010r\u001a\u00020JJ\b\u0010s\u001a\u00020JH\u0004J\b\u0010t\u001a\u00020JH\u0004J\b\u0010u\u001a\u00020JH\u0002J\b\u0010v\u001a\u00020JH\u0004J\u0010\u0010w\u001a\u00020J2\b\u0010n\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0014@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u0004\u0018\u00010+8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d018\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000203X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u00108\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b9\u00105R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0004\u0018\u00010>8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0016\u0010?\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010@R\u0014\u0010A\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u00020DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006y"}, d2 = {"Lcom/mobilefuse/sdk/BaseAdRenderer;", "T", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "", "context", "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;)V", "activityLifecycleObserver", "Lcom/mobilefuse/sdk/AppLifecycleHelper$ActivityLifecycleObserver;", "value", "", "adBackgroundColor", "getAdBackgroundColor", "()I", "setAdBackgroundColor", "(I)V", "Lcom/mobilefuse/sdk/AdLifecycleEventListener;", "adLifecycleEventListener", "getAdLifecycleEventListener", "()Lcom/mobilefuse/sdk/AdLifecycleEventListener;", "setAdLifecycleEventListener", "(Lcom/mobilefuse/sdk/AdLifecycleEventListener;)V", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "adView", "Landroid/view/View;", "getAdViewProperty", "()Landroid/view/View;", "adm", "", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "configObserver", "Lcom/mobilefuse/sdk/config/Observer;", "getConfigObserver", "()Lcom/mobilefuse/sdk/config/Observer;", "setConfigObserver", "(Lcom/mobilefuse/sdk/config/Observer;)V", "contentContainer", "Lcom/mobilefuse/sdk/AdRendererContainer;", "extendedAdType", "Lcom/mobilefuse/sdk/ExtendedAdType;", "extendedController", "Lcom/mobilefuse/sdk/ad/rendering/ExtendedController;", "externalFriendlyObstructions", "", "impressionCallbackCalled", "", "getImpressionCallbackCalled", "()Z", "setImpressionCallbackCalled", "(Z)V", "isVisibleOnScreen", "_isVisibleOnScreen", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListenerOwner", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "omidBridge", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "renderingActivity", "Landroid/app/Activity;", "state", "Lcom/mobilefuse/sdk/BaseAdRenderer$State;", "getState", "()Lcom/mobilefuse/sdk/BaseAdRenderer$State;", "setState", "(Lcom/mobilefuse/sdk/BaseAdRenderer$State;)V", "addRegisteredExternalFriendlyObstructions", "", "applyCurrentBackgroundColor", "createConfigObserver", "destroy", "destroyOmidBridge", "dispatchSkipAdAvailability", "getAdView", "getOnLayoutChangeListener", "hasOmidBridge", "isAdPreloaded", "isOmidBridgeAvailable", "isTransparentBackground", "onActivityDestroy", "onActivityPause", "onActivityPauseImpl", "onActivityResume", "onActivityResumeImpl", "onActivityStart", "onActivityStop", "onAdCloseRequested", Zf.g, "onAdLifecycleEvent", "event", "Lcom/mobilefuse/sdk/AdLifecycleEvent;", "extraParams", "", "onAdPreloaded", "onAdRuntimeError", "error", "Lcom/mobilefuse/sdk/internal/RtbLossReason;", "onConfigPropertyChanged", "key", "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "preloadAd", "preloadAdmImpl", "registerExternalFriendlyObstruction", "obstruction", "renderAd", "renderAdmImpl", "reportAdImpression", "requestAdClose", "startActivityLifecycleChecking", "startListeningLayoutChange", "stopActivityLifecycleChecking", "stopListeningLayoutChange", "unregisterExternalFriendlyObstruction", "State", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public abstract class BaseAdRenderer<T extends OmidBridge> {
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private int adBackgroundColor;

    @Nullable
    private AdLifecycleEventListener adLifecycleEventListener;

    @Nullable
    protected AdMuteStateManager adMuteStateManager;

    @Nullable
    protected String adm;

    @Nullable
    public AdmClickInfoProvider admClickInfoProvider;

    @NotNull
    protected final AdRendererConfig config;

    @Nullable
    private Observer configObserver;

    @Nullable
    protected AdRendererContainer contentContainer;

    @NotNull
    protected final Context context;

    @NotNull
    public ExtendedAdType extendedAdType;

    @Nullable
    protected ExtendedController extendedController;

    @NotNull
    protected List<View> externalFriendlyObstructions;
    private boolean impressionCallbackCalled;
    private View.OnLayoutChangeListener layoutChangeListener;
    private View layoutChangeListenerOwner;

    @NotNull
    protected final AdRendererListener listener;

    @Nullable
    protected ObservableConfig observableConfig;

    @Nullable
    public T omidBridge;

    @Nullable
    public Activity renderingActivity;

    @NotNull
    private State state;

    /* compiled from: BaseAdRenderer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/BaseAdRenderer$State;", "", "(Ljava/lang/String;I)V", "IDLE", "PRELOADED", "RENDERING", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public enum State {
        IDLE,
        PRELOADED,
        RENDERING
    }

    protected void applyCurrentBackgroundColor() throws Throwable {
    }

    @Nullable
    public abstract View getAdView() throws Throwable;

    @Nullable
    protected abstract View.OnLayoutChangeListener getOnLayoutChangeListener(@Nullable Context context) throws Throwable;

    public void onActivityDestroy() throws Throwable {
    }

    public final void onActivityPause() throws Throwable {
    }

    public void onActivityPauseImpl() throws Throwable {
    }

    public final void onActivityResume() throws Throwable {
    }

    public void onActivityResumeImpl() throws Throwable {
    }

    public final void onActivityStart() throws Throwable {
    }

    public final void onActivityStop() throws Throwable {
    }

    protected boolean onAdCloseRequested() {
        return true;
    }

    protected void onConfigPropertyChanged(@Nullable ObservableConfigKey key, @Nullable Object value) throws Throwable {
    }

    protected abstract void preloadAdmImpl(@Nullable String adm) throws Throwable;

    protected abstract void renderAdmImpl() throws Throwable;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addRegisteredExternalFriendlyObstructions() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            T t = this.omidBridge;
            if (t == null) {
                return;
            }
            Iterator<View> it = this.externalFriendlyObstructions.iterator();
            while (it.hasNext()) {
                t.addFriendlyObstruction(it.next(), OmidFriendlyObstructionPurpose.OTHER, null);
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dispatchSkipAdAvailability() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig != null) {
                ObservableConfigKey observableConfigKey = ObservableConfigKey.SKIP_AD_AVAILABLE;
                if (ObservableConfig.getBooleanValue$default(observableConfig, observableConfigKey, false, 2, null)) {
                    observableConfig = null;
                }
                if (observableConfig != null) {
                    observableConfig.setValue(observableConfigKey, Boolean.TRUE);
                }
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void registerExternalFriendlyObstruction(@Nullable View obstruction) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.externalFriendlyObstructions.add(obstruction);
            T t = this.omidBridge;
            if (t != null) {
                t.addFriendlyObstruction(obstruction, OmidFriendlyObstructionPurpose.OTHER, null);
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void reportAdImpression() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.impressionCallbackCalled) {
                return;
            }
            this.impressionCallbackCalled = true;
            this.listener.onAdImpression();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    protected final void startListeningLayoutChange() throws Throwable {
        View rootView;
        Window window;
        View decorView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer == null) {
                return;
            }
            Activity activity = this.renderingActivity;
            if (activity != null) {
                rootView = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
            } else {
                rootView = adRendererContainer.getRootView();
            }
            if (rootView == null || this.layoutChangeListenerOwner == rootView) {
                return;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = getOnLayoutChangeListener(this.context);
            this.layoutChangeListener = onLayoutChangeListener;
            this.layoutChangeListenerOwner = rootView;
            rootView.addOnLayoutChangeListener(onLayoutChangeListener);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    protected final void stopListeningLayoutChange() throws Throwable {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            View view = this.layoutChangeListenerOwner;
            if (view != null) {
                view.removeOnLayoutChangeListener(this.layoutChangeListener);
                this.layoutChangeListener = null;
            }
            this.layoutChangeListenerOwner = null;
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void unregisterExternalFriendlyObstruction(@Nullable View obstruction) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.externalFriendlyObstructions.remove(obstruction);
            T t = this.omidBridge;
            if (t != null) {
                t.removeFriendlyObstruction(obstruction);
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public BaseAdRenderer(@NotNull Context context, @NotNull AdRendererConfig config, @NotNull AdRendererListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.config = config;
        this.listener = listener;
        this.state = State.IDLE;
        this.adBackgroundColor = -16777216;
        this.extendedAdType = BaseExtendedAdType.NORMAL;
        this.externalFriendlyObstructions = new ArrayList();
        ExtendedAdType extendedAdType = config.getExtendedAdType();
        if (extendedAdType != null) {
            this.extendedAdType = extendedAdType;
        }
        ObservableConfig observableConfig = config.getObservableConfig();
        this.observableConfig = observableConfig;
        if (observableConfig != null) {
            observableConfig.setValue(ObservableConfigKey.SKIP_AD_AVAILABLE, Boolean.FALSE);
            Observer createConfigObserver = createConfigObserver();
            this.configObserver = createConfigObserver;
            if (createConfigObserver != null) {
                observableConfig.registerObserver(createConfigObserver);
            }
        }
        this.adMuteStateManager = config.getAdMuteStateManager();
    }

    /* renamed from: isVisibleOnScreen, reason: merged with bridge method [inline-methods] */
    public final boolean _isVisibleOnScreen() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            View adViewProperty = getAdViewProperty();
            if (adViewProperty == null) {
                return false;
            }
            return Utils.isAttachedToWindow(adViewProperty);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return false;
        }
    }

    @NotNull
    protected final State getState() {
        return this.state;
    }

    protected final void setState(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.state = state;
    }

    protected final boolean getImpressionCallbackCalled() {
        return this.impressionCallbackCalled;
    }

    protected final void setImpressionCallbackCalled(boolean z) {
        this.impressionCallbackCalled = z;
    }

    public final int getAdBackgroundColor() {
        return this.adBackgroundColor;
    }

    public final void setAdBackgroundColor(int i) {
        if (i == -1 || this.adBackgroundColor == i) {
            return;
        }
        this.adBackgroundColor = i;
        applyCurrentBackgroundColor();
    }

    @Nullable
    public AdLifecycleEventListener getAdLifecycleEventListener() {
        return this.adLifecycleEventListener;
    }

    public void setAdLifecycleEventListener(@Nullable AdLifecycleEventListener adLifecycleEventListener) {
        this.adLifecycleEventListener = adLifecycleEventListener;
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.setAdLifecycleEventListener(adLifecycleEventListener);
        }
    }

    @Nullable
    protected final Observer getConfigObserver() {
        return this.configObserver;
    }

    protected final void setConfigObserver(@Nullable Observer observer) {
        this.configObserver = observer;
    }

    private final Observer createConfigObserver() {
        return new Observer() { // from class: com.mobilefuse.sdk.BaseAdRenderer$createConfigObserver$1
            @Override // com.mobilefuse.sdk.config.Observer
            public final void onChanged(@NotNull ObservableConfigKey observableConfigKey, @NotNull Object arg) {
                Object m8023constructorimpl;
                Intrinsics.checkNotNullParameter(observableConfigKey, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(arg, "arg");
                BaseAdRenderer baseAdRenderer = BaseAdRenderer.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (arg instanceof Pair) {
                        Object first = ((Pair) arg).getFirst();
                        if (first == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.config.ObservableConfigKey");
                        }
                        baseAdRenderer.onConfigPropertyChanged((ObservableConfigKey) first, ((Pair) arg).getSecond());
                    }
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    m8026exceptionOrNullimpl.printStackTrace();
                }
            }
        };
    }

    public final void preloadAd(@Nullable String adm) throws Throwable {
        this.adm = adm;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_PRELOAD_STARTED);
        preloadAdmImpl(adm);
    }

    public final void renderAd() throws Throwable {
        this.state = State.RENDERING;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_RENDERED);
        renderAdmImpl();
        stopListeningLayoutChange();
        startListeningLayoutChange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onAdPreloaded() throws Throwable {
        this.state = State.PRELOADED;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_PRELOAD_COMPLETE);
        this.listener.onPreloadStatusChange(true);
    }

    public final void onAdLifecycleEvent(@NotNull AdLifecycleEvent event) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        onAdLifecycleEvent(event, null);
    }

    protected final void onAdLifecycleEvent(@NotNull AdLifecycleEvent event, @Nullable Map<String, String> extraParams) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        ExtendedAdType extendedAdType = this.extendedAdType;
        AdLifecycleEventListener adLifecycleEventListener = getAdLifecycleEventListener();
        if (adLifecycleEventListener != null) {
            adLifecycleEventListener.onAdLifecycleEvent(event, extendedAdType, extraParams);
        }
    }

    protected final void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver == null) {
            this.activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.BaseAdRenderer$startActivityLifecycleChecking$1
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityPaused(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        BaseAdRenderer baseAdRenderer = BaseAdRenderer.this;
                        Activity activity2 = baseAdRenderer.renderingActivity;
                        if (activity2 != null && activity2 == activity) {
                            baseAdRenderer.onActivityPauseImpl();
                        }
                    } catch (Throwable th) {
                        int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityResumed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        BaseAdRenderer baseAdRenderer = BaseAdRenderer.this;
                        Activity activity2 = baseAdRenderer.renderingActivity;
                        if (activity2 != null && activity2 == activity) {
                            baseAdRenderer.onActivityResumeImpl();
                        }
                    } catch (Throwable th) {
                        int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            };
        }
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver != null) {
            AppLifecycleHelper.addActivityLifecycleObserver(activityLifecycleObserver);
        }
    }

    private final void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver != null) {
            AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
            this.activityLifecycleObserver = null;
        }
    }

    public final boolean isTransparentBackground() throws Throwable {
        return this.config.isTransparentBackground();
    }

    public final boolean hasOmidBridge() {
        return this.omidBridge != null;
    }

    protected final boolean isOmidBridgeAvailable() {
        return this.omidBridge != null;
    }

    @Nullable
    public final View getAdViewProperty() {
        return getAdView();
    }

    protected final void destroyOmidBridge() throws Throwable {
        if (hasOmidBridge()) {
            T t = this.omidBridge;
            if (t != null) {
                t.finishAdSession();
            }
            this.omidBridge = null;
        }
    }

    public void destroy() throws Throwable {
        stopActivityLifecycleChecking();
        stopListeningLayoutChange();
        Observer observer = this.configObserver;
        if (observer != null) {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig != null) {
                observableConfig.unregisterObserver(observer);
            }
            ObservableConfig observableConfig2 = this.observableConfig;
            if (observableConfig2 != null) {
                observableConfig2.unregisterAll();
            }
            this.observableConfig = null;
        }
        destroyOmidBridge();
        this.renderingActivity = null;
        this.admClickInfoProvider = null;
        this.adMuteStateManager = null;
    }

    public final boolean isAdPreloaded() {
        return this.state == State.PRELOADED;
    }

    public final void requestAdClose() throws Throwable {
        if (onAdCloseRequested()) {
            onAdClosed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onAdClosed() throws Throwable {
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_CLOSED);
        this.listener.onAdClosed();
        this.state = State.IDLE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onAdRuntimeError(@Nullable RtbLossReason error) throws Throwable {
        this.listener.onAdRuntimeError(error);
    }
}
