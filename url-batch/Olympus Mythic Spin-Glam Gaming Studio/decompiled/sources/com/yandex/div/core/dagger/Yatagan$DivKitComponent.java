package com.yandex.div.core.dagger;

import android.content.Context;
import android.renderscript.RenderScript;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.ContextThemeWrapper;
import com.yandex.android.beacon.SendBeaconManager;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.actions.DivActionTypedHideTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedScrollHandler;
import com.yandex.div.core.actions.DivActionTypedSetStateHandler;
import com.yandex.div.core.actions.DivActionTypedSetStoredValueHandler;
import com.yandex.div.core.actions.DivActionTypedSetVariableHandler;
import com.yandex.div.core.actions.DivActionTypedShowTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedSubmitHandler;
import com.yandex.div.core.actions.DivActionTypedTimerHandler;
import com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler;
import com.yandex.div.core.actions.DivActionTypedVideoHandler;
import com.yandex.div.core.actions.DivAnimatorTypedActionHandler;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipViewBuilder;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ReportingSafeDrawingPassOverrideStrategy;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewVisibilityCalculator;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivLayoutParamsBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.yatagan.Lazy;
import com.yandex.yatagan.internal.Checks;
import com.yandex.yatagan.internal.ThreadAssertions;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    final Context mApplicationContext;
    private volatile Object mDivActionTypedHandlerCombinerInstance;
    final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;
    private volatile Object mViewCreatorInstance;

    Yatagan$DivKitComponent(Context context, DivKitConfiguration divKitConfiguration) {
        this.mDivActionTypedHandlerCombinerInstance = new UninitializedLock();
        this.mDivStorageComponentInstance = new UninitializedLock();
        this.mViewCreatorInstance = new UninitializedLock();
        this.mSendBeaconManagerInstance = new UninitializedLock();
        this.mHistogramRecorderInstance = new UninitializedLock();
        this.mDivParsingHistogramReporterInstance = new UninitializedLock();
        this.mHistogramColdTypeCheckerInstance = new UninitializedLock();
        this.mApplicationContext = (Context) Checks.checkInputNotNull(context);
        this.mDivKitConfiguration = (DivKitConfiguration) Checks.checkInputNotNull(divKitConfiguration);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public Div2Component.Builder div2Component() {
        return new Div2ComponentImpl.ComponentFactoryImpl(this);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public SendBeaconManager getSendBeaconManager() {
        return cacheSendBeaconManager();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public ExecutorService getExecutorService() {
        return (ExecutorService) Checks.checkProvisionNotNull(this.mDivKitConfiguration.getExecutorService());
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecorder getHistogramRecorder() {
        return cacheHistogramRecorder();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecordConfiguration getHistogramRecordConfiguration() {
        return (HistogramRecordConfiguration) Checks.checkProvisionNotNull(this.mDivKitConfiguration.histogramRecordConfiguration());
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public DivParsingHistogramReporter getParsingHistogramReporter() {
        return cacheDivParsingHistogramReporter();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramReporterDelegate getHistogramReporterDelegate() {
        return accessHistogramReporterDelegate();
    }

    Object switch$$access(int i) {
        if (i == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i == 1) {
            return cacheDivStorageComponent();
        }
        if (i == 2) {
            return Checks.checkProvisionNotNull(this.mDivKitConfiguration.getExecutorService());
        }
        if (i == 3) {
            return cacheSendBeaconManager();
        }
        if (i == 4) {
            return cacheHistogramRecorder();
        }
        if (i == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }

    DivActionTypedHandlerCombiner cacheDivActionTypedHandlerCombiner() {
        Object obj;
        Object obj2 = this.mDivActionTypedHandlerCombinerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivActionTypedHandlerCombinerInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = new DivActionTypedHandlerCombiner(manyOfSetDivActionTypedHandler());
                        this.mDivActionTypedHandlerCombinerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivActionTypedHandlerCombiner) obj2;
    }

    HistogramReporterDelegate accessHistogramReporterDelegate() {
        return (HistogramReporterDelegate) Checks.checkProvisionNotNull(DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate((HistogramConfiguration) Checks.checkProvisionNotNull(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 4), new ProviderImpl(this, 5)));
    }

    DivStorageComponent cacheDivStorageComponent() {
        Object obj;
        Object obj2 = this.mDivStorageComponentInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivStorageComponentInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = Checks.checkProvisionNotNull(DivStorageModule.INSTANCE.provideDivStorageComponent((ExternalOptional) Checks.checkProvisionNotNull(this.mDivKitConfiguration.externalDivStorageComponent()), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter()));
                        this.mDivStorageComponentInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivStorageComponent) obj2;
    }

    ViewCreator cacheViewCreator() {
        Object obj;
        Object obj2 = this.mViewCreatorInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mViewCreatorInstance;
                    if (obj instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        obj = Checks.checkProvisionNotNull(DivKitModule.provideViewCreator((CpuUsageHistogramReporter) Checks.checkProvisionNotNull(this.mDivKitConfiguration.cpuUsageHistogramReporter())));
                        this.mViewCreatorInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (ViewCreator) obj2;
    }

    SendBeaconManager cacheSendBeaconManager() {
        Object obj;
        Object obj2 = this.mSendBeaconManagerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mSendBeaconManagerInstance;
                    if (obj instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        Context context = this.mApplicationContext;
                        this.mDivKitConfiguration.sendBeaconConfiguration();
                        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(Checks.checkProvisionNotNull(null));
                        obj = Checks.checkProvisionNotNull(DivKitModule.provideSendBeaconManager(context, null));
                        this.mSendBeaconManagerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (SendBeaconManager) obj2;
    }

    HistogramRecorder cacheHistogramRecorder() {
        Object obj;
        Object obj2 = this.mHistogramRecorderInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mHistogramRecorderInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = Checks.checkProvisionNotNull(this.mDivKitConfiguration.histogramRecorder());
                        this.mHistogramRecorderInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (HistogramRecorder) obj2;
    }

    DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object obj;
        Object obj2 = this.mDivParsingHistogramReporterInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mDivParsingHistogramReporterInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = Checks.checkProvisionNotNull(DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter((HistogramConfiguration) Checks.checkProvisionNotNull(this.mDivKitConfiguration.histogramConfiguration()), new ProviderImpl(this, 0), new ProviderImpl(this, 2)));
                        this.mDivParsingHistogramReporterInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (DivParsingHistogramReporter) obj2;
    }

    HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object obj;
        Object obj2 = this.mHistogramColdTypeCheckerInstance;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.mHistogramColdTypeCheckerInstance;
                    if (obj instanceof UninitializedLock) {
                        obj = new HistogramColdTypeChecker();
                        this.mHistogramColdTypeCheckerInstance = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (HistogramColdTypeChecker) obj2;
    }

    Set<DivActionTypedHandler> manyOfSetDivActionTypedHandler() {
        HashSet hashSet = new HashSet(16);
        hashSet.add(new DivAnimatorTypedActionHandler());
        hashSet.add(new DivActionTypedArrayMutationHandler());
        hashSet.add(new DivActionTypedClearFocusHandler());
        hashSet.add(new DivActionTypedCopyToClipboardHandler());
        hashSet.add(new DivActionTypedDictSetValueHandler());
        hashSet.add(new DivActionTypedFocusElementHandler());
        hashSet.add(new DivActionTypedHideTooltipHandler());
        hashSet.add(new DivActionTypedScrollHandler());
        hashSet.add(new DivActionTypedSetStateHandler());
        hashSet.add(new DivActionTypedSetVariableHandler());
        hashSet.add(new DivActionTypedSetStoredValueHandler());
        hashSet.add(new DivActionTypedShowTooltipHandler());
        hashSet.add(new DivActionTypedSubmitHandler((DivRequestExecutor) Checks.checkProvisionNotNull(this.mDivKitConfiguration.divRequestExecutor())));
        hashSet.add(new DivActionTypedTimerHandler());
        hashSet.add(new DivActionTypedVideoHandler());
        hashSet.add(new DivActionTypedUpdateStructureHandler());
        return hashSet;
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    static final class Div2ComponentImpl implements Div2Component {
        private Object mAccessibilityStateProviderInstance;
        final ContextThemeWrapper mBaseContext;
        private Object mBitmapEffectHelperInstance;
        private Object mDiv2BuilderInstance;
        private Object mDivActionBeaconSenderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        final DivConfiguration mDivConfiguration;
        final DivCreationTracker mDivCreationTracker;
        private Object mDivExtensionControllerInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivImagePreloaderInstance;
        final Yatagan$DivKitComponent mDivKitComponent;
        private Object mDivPatchCacheInstance;
        private Object mDivPatchManagerInstance;
        private Object mDivPlaceholderLoaderInstance;
        private Object mDivPreloaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivStateManagerInstance;
        private Object mDivTimerEventDispatcherProviderInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        final DivVariableController mDivVariableController;
        private Object mDivVideoActionHandlerInstance;
        private Object mDivVideoViewMapperInstance;
        private Object mDivViewCreatorInstance;
        private Object mDivViewDataPreloaderInstance;
        private Object mDivViewIdProviderInstance;
        private Object mDivVisibilityActionDispatcherInstance;
        private Object mDivVisibilityActionTrackerInstance;
        private Object mErrorCollectorsInstance;
        private Object mHistogramReporterInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        private Object mPagerIndicatorConnectorInstance;
        private Object mPerformanceDependentSessionProfilerInstance;
        private Object mReleaseManagerInstance;
        private Object mRenderScriptInstance;
        private Object mRuntimeStoreProviderInstance;
        private Object mStoredValuesControllerInstance;
        private Object mTabsStateCacheInstance;
        private Object mTemporaryDivStateCacheInstance;
        final Integer mThemeId;
        private Object mTwoWayIntegerVariableBinderInstance;
        private Object mTwoWayStringVariableBinderInstance;
        private Object mViewPoolInstance;
        private Object mViewPreCreationProfileRepositoryInstance;

        Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, Integer num, DivCreationTracker divCreationTracker, DivVariableController divVariableController) {
            this.mDivKitComponent = yatagan$DivKitComponent;
            this.mBaseContext = (ContextThemeWrapper) Checks.checkInputNotNull(contextThemeWrapper);
            this.mDivConfiguration = (DivConfiguration) Checks.checkInputNotNull(divConfiguration);
            this.mThemeId = (Integer) Checks.checkInputNotNull(num);
            this.mDivCreationTracker = (DivCreationTracker) Checks.checkInputNotNull(divCreationTracker);
            this.mDivVariableController = (DivVariableController) Checks.checkInputNotNull(divVariableController);
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Builder getDiv2Builder() {
            return cacheDiv2Builder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivBinder getDivBinder() {
            return cacheDivBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewCreator getDivViewCreator() {
            return cacheDivViewCreator();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivImagePreloader getImagePreloader() {
            return cacheDivImagePreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivPreloader getPreloader() {
            return cacheDivPreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Logger getDiv2Logger() {
            return (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionTracker getVisibilityActionTracker() {
            return cacheDivVisibilityActionTracker();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionDispatcher getVisibilityActionDispatcher() {
            return cacheDivVisibilityActionDispatcher();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionBinder getActionBinder() {
            return cacheDivActionBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TemporaryDivStateCache getTemporaryDivStateCache() {
            return cacheTemporaryDivStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TabsStateCache getTabsStateCache() {
            return cacheTabsStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerChildFactory getDivCustomContainerChildFactory() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerViewAdapter getDivCustomContainerViewAdapter() {
            return (DivCustomContainerViewAdapter) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivCustomContainerViewAdapter());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivExtensionController getExtensionController() {
            return cacheDivExtensionController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDataChangeListener getDivDataChangeListener() {
            return (DivDataChangeListener) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivDataChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RuntimeStoreProvider getRuntimeStoreProvider() {
            return cacheRuntimeStoreProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTimerEventDispatcherProvider getDivTimersControllerProvider() {
            return cacheDivTimerEventDispatcherProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoActionHandler getDivVideoActionHandler() {
            return cacheDivVideoActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoViewMapper getDivVideoViewMapper() {
            return cacheDivVideoViewMapper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateManager getStateManager() {
            return cacheDivStateManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateChangeListener getDivStateChangeListener() {
            return (DivStateChangeListener) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivStateChangeListener());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionHandler getActionHandler() {
            return (DivActionHandler) Checks.checkProvisionNotNull(this.mDivConfiguration.getActionHandler());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTooltipController getTooltipController() {
            return cacheDivTooltipController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivPatchManager getPatchManager() {
            return cacheDivPatchManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2ViewComponent.Builder viewComponent() {
            return new Div2ViewComponentImpl.ComponentFactoryImpl(this);
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDownloader getDivDownloader() {
            return (DivDownloader) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivDownloader());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVariableController getDivVariableController() {
            return this.mDivVariableController;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public PerformanceDependentSessionProfiler getPerformanceDependentSessionProfiler() {
            return cachePerformanceDependentSessionProfiler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ViewPreCreationProfileRepository getViewPreCreationProfileRepository() {
            return cacheViewPreCreationProfileRepository();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public HistogramReporter getHistogramReporter() {
            return cacheHistogramReporter();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivPlayerFactory getDivVideoFactory() {
            return (DivPlayerFactory) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivPlayerFactory());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivPlayerPreloader getDivVideoPreloader() {
            return (DivPlayerPreloader) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivPlayerPreloader());
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCreationTracker getDivCreationTracker() {
            return this.mDivCreationTracker;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RenderScript getRenderScript() {
            return cacheRenderScript();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ReleaseManager getReleaseManager() {
            return cacheReleaseManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public StoredValuesController getStoredValuesController() {
            return cacheStoredValuesController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isBindOnAttachEnabled() {
            return ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isBindOnAttachEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isComplexRebindEnabled() {
            return ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isComplexRebindEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isPagerPageClipEnabled() {
            return ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isPagerPageClipEnabled()))).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionTypedHandlerCombiner getActionTypedHandlerCombiner() {
            return this.mDivKitComponent.cacheDivActionTypedHandlerCombiner();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ErrorCollectors getErrorCollectors() {
            return cacheErrorCollectors();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public BitmapEffectHelper getBitmapEffectHelper() {
            return cacheBitmapEffectHelper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewDataPreloader getDivViewDataPreloader() {
            return cacheDivViewDataPreloader();
        }

        Object switch$$access(int i) {
            if (i == 0) {
                return cacheDivBinder();
            }
            if (i == 1) {
                return cacheDiv2Builder();
            }
            if (i == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }

        DivViewIdProvider cacheDivViewIdProvider() {
            Object obj = this.mDivViewIdProviderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivViewIdProvider();
                this.mDivViewIdProviderInstance = obj;
            }
            return (DivViewIdProvider) obj;
        }

        ErrorCollectors cacheErrorCollectors() {
            Object obj = this.mErrorCollectorsInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new ErrorCollectors();
                this.mErrorCollectorsInstance = obj;
            }
            return (ErrorCollectors) obj;
        }

        DivTooltipController cacheDivTooltipController() {
            Object obj = this.mDivTooltipControllerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivTooltipController((DivTooltipRestrictor) Checks.checkProvisionNotNull(this.mDivConfiguration.getTooltipRestrictor()), cacheDivVisibilityActionTracker(), cacheDivPreloader(), new DivTooltipViewBuilder(new ProviderImpl(this, 1)), cacheAccessibilityStateProvider(), cacheErrorCollectors());
                this.mDivTooltipControllerInstance = obj;
            }
            return (DivTooltipController) obj;
        }

        DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object obj = this.mDivRuntimeVisitorInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivRuntimeVisitor((DivStateCache) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheTabsStateCache());
                this.mDivRuntimeVisitorInstance = obj;
            }
            return (DivRuntimeVisitor) obj;
        }

        DivExtensionController cacheDivExtensionController() {
            Object obj = this.mDivExtensionControllerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivExtensionController((List) Checks.checkProvisionNotNull(this.mDivConfiguration.getExtensionHandlers()));
                this.mDivExtensionControllerInstance = obj;
            }
            return (DivExtensionController) obj;
        }

        DivBinder cacheDivBinder() {
            Object obj = this.mDivBinderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivBinder(cacheDivValidator(), new DivTextBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), new SpannedTextBuilder(cacheDivTypefaceResolver(), cacheDivImageLoader()), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isHyphenationSupported()))).booleanValue()), new DivContainerBinder(cacheDivBaseBinder(), new ProviderImpl(this, 2), cacheDivPatchManager(), new ProviderImpl(this, 0), cacheErrorCollectors()), new DivSeparatorBinder(cacheDivBaseBinder()), new DivImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGifImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGridBinder(cacheDivBaseBinder(), cacheDivPatchManager(), new ProviderImpl(this, 0), new ProviderImpl(this, 2)), new DivGalleryBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), ((Float) Checks.checkProvisionNotNull(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue()), new DivPagerBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), cacheDivActionBinder(), cachePagerIndicatorConnector(), cacheAccessibilityStateProvider()), new DivTabsBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheViewPool(), (TabTextStyleProvider) Checks.checkProvisionNotNull(Div2Module.provideTabTextStyleProvider((DivTypefaceProvider) Checks.checkProvisionNotNull(this.mDivConfiguration.getTypefaceProvider()))), cacheDivActionBinder(), (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), cacheDivImageLoader(), cacheDivVisibilityActionTracker(), cacheDivPatchCache(), cacheJavaxInjectNamedValueThemedContextContext(), cacheDivRuntimeVisitor(), cacheTabsStateCache()), new DivStateBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), (DivStateCache) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache(), cacheDivActionBinder(), cacheDivActionBeaconSender(), cacheDivPatchManager(), cacheDivPatchCache(), (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), cacheDivVisibilityActionTracker(), cacheErrorCollectors(), cacheTwoWayStringVariableBinder(), cacheDivRuntimeVisitor()), new DivCustomBinder(cacheDivBaseBinder(), (DivCustomContainerViewAdapter) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivCustomContainerViewAdapter()), cacheDivExtensionController(), new ProviderImpl(this, 0)), new DivIndicatorBinder(cacheDivBaseBinder(), cachePagerIndicatorConnector()), new DivSliderBinder(cacheDivBaseBinder(), (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), cacheDivTypefaceResolver(), cacheTwoWayIntegerVariableBinder(), cacheErrorCollectors(), ((Float) Checks.checkProvisionNotNull(Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()))).floatValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue()), new DivInputBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheDivActionBinder(), cacheAccessibilityStateProvider(), cacheErrorCollectors()), new DivSelectBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheErrorCollectors()), new DivVideoBinder(cacheDivBaseBinder(), cacheTwoWayIntegerVariableBinder(), cacheDivActionBinder(), cacheDivVideoViewMapper(), (ExecutorService) Checks.checkProvisionNotNull(this.mDivKitComponent.mDivKitConfiguration.getExecutorService()), (DivPlayerFactory) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivPlayerFactory())), cacheDivExtensionController(), cachePagerIndicatorConnector(), new DivSwitchBinder(cacheDivBaseBinder(), new TwoWayBooleanVariableBinder(cacheErrorCollectors())));
                this.mDivBinderInstance = obj;
            }
            return (DivBinder) obj;
        }

        Div2Builder cacheDiv2Builder() {
            Object obj = this.mDiv2BuilderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = obj;
            }
            return (Div2Builder) obj;
        }

        DivViewCreator cacheDivViewCreator() {
            Object obj = this.mDivViewCreatorInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivViewCreator(cacheJavaxInjectNamedValueThemedContextContext(), cacheViewPool(), cacheDivValidator(), (ViewPreCreationProfile) Checks.checkProvisionNotNull(this.mDivConfiguration.getViewPreCreationProfile()), cacheViewPreCreationProfileRepository());
                this.mDivViewCreatorInstance = obj;
            }
            return (DivViewCreator) obj;
        }

        DivImagePreloader cacheDivImagePreloader() {
            Object obj = this.mDivImagePreloaderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivImagePreloader(cacheDivImageLoader());
                this.mDivImagePreloaderInstance = obj;
            }
            return (DivImagePreloader) obj;
        }

        DivPreloader cacheDivPreloader() {
            Object obj = this.mDivPreloaderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideDivPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivPreloaderInstance = obj;
            }
            return (DivPreloader) obj;
        }

        DivVisibilityActionTracker cacheDivVisibilityActionTracker() {
            Object obj = this.mDivVisibilityActionTrackerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivVisibilityActionTracker(new ViewVisibilityCalculator(), cacheDivVisibilityActionDispatcher());
                this.mDivVisibilityActionTrackerInstance = obj;
            }
            return (DivVisibilityActionTracker) obj;
        }

        DivVisibilityActionDispatcher cacheDivVisibilityActionDispatcher() {
            Object obj = this.mDivVisibilityActionDispatcherInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivVisibilityActionDispatcher((Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), (List) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivVisibilityChangeListeners()), (DivActionHandler) Checks.checkProvisionNotNull(this.mDivConfiguration.getActionHandler()), cacheDivActionBeaconSender());
                this.mDivVisibilityActionDispatcherInstance = obj;
            }
            return (DivVisibilityActionDispatcher) obj;
        }

        DivActionBinder cacheDivActionBinder() {
            Object obj = this.mDivActionBinderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivActionBinder((DivActionHandler) Checks.checkProvisionNotNull(this.mDivConfiguration.getActionHandler()), (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), cacheDivActionBeaconSender(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isLongtapActionsPassToChild()))).booleanValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isContextMenuHandlerOverridden()))).booleanValue());
                this.mDivActionBinderInstance = obj;
            }
            return (DivActionBinder) obj;
        }

        TemporaryDivStateCache cacheTemporaryDivStateCache() {
            Object obj = this.mTemporaryDivStateCacheInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new TemporaryDivStateCache();
                this.mTemporaryDivStateCacheInstance = obj;
            }
            return (TemporaryDivStateCache) obj;
        }

        TabsStateCache cacheTabsStateCache() {
            Object obj = this.mTabsStateCacheInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new TabsStateCache();
                this.mTabsStateCacheInstance = obj;
            }
            return (TabsStateCache) obj;
        }

        RuntimeStoreProvider cacheRuntimeStoreProvider() {
            Object obj = this.mRuntimeStoreProviderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new RuntimeStoreProvider(new ExpressionsRuntimeProvider(this.mDivVariableController, cacheDivActionBinder(), (Div2Logger) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2Logger()), cacheStoredValuesController()), cacheErrorCollectors());
                this.mRuntimeStoreProviderInstance = obj;
            }
            return (RuntimeStoreProvider) obj;
        }

        DivTimerEventDispatcherProvider cacheDivTimerEventDispatcherProvider() {
            Object obj = this.mDivTimerEventDispatcherProviderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivTimerEventDispatcherProvider(cacheDivActionBinder(), cacheErrorCollectors());
                this.mDivTimerEventDispatcherProviderInstance = obj;
            }
            return (DivTimerEventDispatcherProvider) obj;
        }

        DivVideoActionHandler cacheDivVideoActionHandler() {
            Object obj = this.mDivVideoActionHandlerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivVideoActionHandler(cacheDivVideoViewMapper());
                this.mDivVideoActionHandlerInstance = obj;
            }
            return (DivVideoActionHandler) obj;
        }

        DivVideoViewMapper cacheDivVideoViewMapper() {
            Object obj = this.mDivVideoViewMapperInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivVideoViewMapper();
                this.mDivVideoViewMapperInstance = obj;
            }
            return (DivVideoViewMapper) obj;
        }

        DivStateManager cacheDivStateManager() {
            Object obj = this.mDivStateManagerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivStateManager((DivStateCache) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivStateCache()), cacheTemporaryDivStateCache());
                this.mDivStateManagerInstance = obj;
            }
            return (DivStateManager) obj;
        }

        DivPatchManager cacheDivPatchManager() {
            Object obj = this.mDivPatchManagerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivPatchManager(cacheDivPatchCache(), new ProviderImpl(this, 1));
                this.mDivPatchManagerInstance = obj;
            }
            return (DivPatchManager) obj;
        }

        PerformanceDependentSessionProfiler cachePerformanceDependentSessionProfiler() {
            Object obj = this.mPerformanceDependentSessionProfilerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new PerformanceDependentSessionProfiler(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isDebuggingViewPoolOptimization()))).booleanValue());
                this.mPerformanceDependentSessionProfilerInstance = obj;
            }
            return (PerformanceDependentSessionProfiler) obj;
        }

        ViewPreCreationProfileRepository cacheViewPreCreationProfileRepository() {
            Object obj = this.mViewPreCreationProfileRepositoryInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new ViewPreCreationProfileRepository(this.mDivKitComponent.mApplicationContext, (ViewPreCreationProfile) Checks.checkProvisionNotNull(this.mDivConfiguration.getViewPreCreationProfile()));
                this.mViewPreCreationProfileRepositoryInstance = obj;
            }
            return (ViewPreCreationProfileRepository) obj;
        }

        HistogramReporter cacheHistogramReporter() {
            Object obj = this.mHistogramReporterInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(DivHistogramsModule.INSTANCE.provideHistogramReporter(this.mDivKitComponent.accessHistogramReporterDelegate()));
                this.mHistogramReporterInstance = obj;
            }
            return (HistogramReporter) obj;
        }

        RenderScript cacheRenderScript() {
            Object obj = this.mRenderScriptInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideRenderScript(this.mBaseContext));
                this.mRenderScriptInstance = obj;
            }
            return (RenderScript) obj;
        }

        ReleaseManager cacheReleaseManager() {
            Object obj = this.mReleaseManagerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new ReleaseManager(cacheRuntimeStoreProvider());
                this.mReleaseManagerInstance = obj;
            }
            return (ReleaseManager) obj;
        }

        StoredValuesController cacheStoredValuesController() {
            Object obj = this.mStoredValuesControllerInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new StoredValuesController(new ProviderImpl(this.mDivKitComponent, 1));
                this.mStoredValuesControllerInstance = obj;
            }
            return (StoredValuesController) obj;
        }

        BitmapEffectHelper cacheBitmapEffectHelper() {
            Object obj = this.mBitmapEffectHelperInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideBitmapEffectHelper(this.mBaseContext, ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isRenderEffectEnabled()))).booleanValue()));
                this.mBitmapEffectHelperInstance = obj;
            }
            return (BitmapEffectHelper) obj;
        }

        DivViewDataPreloader cacheDivViewDataPreloader() {
            Object obj = this.mDivViewDataPreloaderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideDivViewDataPreloader(cacheDivImagePreloader(), (DivCustomContainerViewAdapter) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivCustomContainerViewAdapter()), (DivPlayerPreloader) Checks.checkProvisionNotNull(this.mDivConfiguration.getDivPlayerPreloader()), cacheDivExtensionController()));
                this.mDivViewDataPreloaderInstance = obj;
            }
            return (DivViewDataPreloader) obj;
        }

        AccessibilityStateProvider cacheAccessibilityStateProvider() {
            Object obj = this.mAccessibilityStateProviderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new AccessibilityStateProvider(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue());
                this.mAccessibilityStateProviderInstance = obj;
            }
            return (AccessibilityStateProvider) obj;
        }

        DivValidator cacheDivValidator() {
            Object obj = this.mDivValidatorInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivValidator();
                this.mDivValidatorInstance = obj;
            }
            return (DivValidator) obj;
        }

        PagerIndicatorConnector cachePagerIndicatorConnector() {
            Object obj = this.mPagerIndicatorConnectorInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new PagerIndicatorConnector();
                this.mPagerIndicatorConnectorInstance = obj;
            }
            return (PagerIndicatorConnector) obj;
        }

        Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object obj = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideThemedContext(this.mBaseContext, this.mThemeId.intValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isResourceCacheEnabled()))).booleanValue()));
                this.mJavaxInjectNamedValueThemedContextContextInstance = obj;
            }
            return (Context) obj;
        }

        ViewPool cacheViewPool() {
            Object obj = this.mViewPoolInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideViewPool(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isViewPoolEnabled()))).booleanValue(), (ExternalOptional) Checks.checkProvisionNotNull(Div2Module.provideViewPoolProfiler(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isViewPoolProfilingEnabled()))).booleanValue(), (ViewPoolProfiler.Reporter) Checks.checkProvisionNotNull(this.mDivConfiguration.getViewPoolReporter()))), cachePerformanceDependentSessionProfiler(), this.mDivKitComponent.cacheViewCreator()));
                this.mViewPoolInstance = obj;
            }
            return (ViewPool) obj;
        }

        DivImageLoader cacheDivImageLoader() {
            Object obj = this.mDivImageLoaderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = Checks.checkProvisionNotNull(Div2Module.provideDivImageLoader((DivImageLoader) Checks.checkProvisionNotNull(this.mDivConfiguration.getImageLoader()), this.mBaseContext));
                this.mDivImageLoaderInstance = obj;
            }
            return (DivImageLoader) obj;
        }

        DivActionBeaconSender cacheDivActionBeaconSender() {
            Object obj = this.mDivActionBeaconSenderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivActionBeaconSender(new ProviderImpl(this.mDivKitComponent, 3), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isTapBeaconsEnabled()))).booleanValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isVisibilityBeaconsEnabled()))).booleanValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isSwipeOutBeaconsEnabled()))).booleanValue());
                this.mDivActionBeaconSenderInstance = obj;
            }
            return (DivActionBeaconSender) obj;
        }

        DivPatchCache cacheDivPatchCache() {
            Object obj = this.mDivPatchCacheInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivPatchCache();
                this.mDivPatchCacheInstance = obj;
            }
            return (DivPatchCache) obj;
        }

        DivBaseBinder cacheDivBaseBinder() {
            Object obj = this.mDivBaseBinderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivBaseBinder(new DivBackgroundBinder(cacheDivImageLoader()), cacheDivTooltipController(), new DivFocusBinder(cacheDivActionBinder()), new DivAccessibilityBinder(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()))).booleanValue(), cacheAccessibilityStateProvider()), new DivLayoutParamsBinder(cacheErrorCollectors()));
                this.mDivBaseBinderInstance = obj;
            }
            return (DivBaseBinder) obj;
        }

        DivTypefaceResolver cacheDivTypefaceResolver() {
            Object obj = this.mDivTypefaceResolverInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivTypefaceResolver((Map) Checks.checkProvisionNotNull(this.mDivConfiguration.getAdditionalTypefaceProviders()), (DivTypefaceProvider) Checks.checkProvisionNotNull(this.mDivConfiguration.getTypefaceProvider()));
                this.mDivTypefaceResolverInstance = obj;
            }
            return (DivTypefaceResolver) obj;
        }

        DivPlaceholderLoader cacheDivPlaceholderLoader() {
            Object obj = this.mDivPlaceholderLoaderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new DivPlaceholderLoader((Div2ImageStubProvider) Checks.checkProvisionNotNull(this.mDivConfiguration.getDiv2ImageStubProvider()), (ExecutorService) Checks.checkProvisionNotNull(this.mDivKitComponent.mDivKitConfiguration.getExecutorService()));
                this.mDivPlaceholderLoaderInstance = obj;
            }
            return (DivPlaceholderLoader) obj;
        }

        TwoWayStringVariableBinder cacheTwoWayStringVariableBinder() {
            Object obj = this.mTwoWayStringVariableBinderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new TwoWayStringVariableBinder(cacheErrorCollectors());
                this.mTwoWayStringVariableBinderInstance = obj;
            }
            return (TwoWayStringVariableBinder) obj;
        }

        TwoWayIntegerVariableBinder cacheTwoWayIntegerVariableBinder() {
            Object obj = this.mTwoWayIntegerVariableBinderInstance;
            if (obj == null) {
                ThreadAssertions.assertThreadAccess();
                obj = new TwoWayIntegerVariableBinder(cacheErrorCollectors());
                this.mTwoWayIntegerVariableBinderInstance = obj;
            }
            return (TwoWayIntegerVariableBinder) obj;
        }

        /* compiled from: Yatagan$DivKitComponent.java */
        static final class Div2ViewComponentImpl implements Div2ViewComponent {
            final Div2ComponentImpl mDiv2Component;
            private Object mDivAnimatorControllerInstance;
            private Object mDivStateSwitcherInstance;
            private Object mDivStateTransitionHolderInstance;
            private Object mDivTransitionBuilderInstance;
            final Div2View mDivView;
            private Object mErrorVisualMonitorInstance;
            private Object mInputFocusTrackerInstance;
            private Object mMediaReleaseViewVisitorInstance;
            private Object mReleaseViewVisitorInstance;
            private Object mReportingSafeDrawingPassOverrideStrategyInstance;
            private Object mViewBindingProviderInstance;

            Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Div2View div2View) {
                this.mDiv2Component = div2ComponentImpl;
                this.mDivView = (Div2View) Checks.checkInputNotNull(div2View);
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivViewIdProvider getViewIdProvider() {
                return this.mDiv2Component.cacheDivViewIdProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTransitionBuilder getTransitionBuilder() {
                return cacheDivTransitionBuilder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ReleaseViewVisitor getReleaseViewVisitor() {
                return cacheReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public MediaReleaseViewVisitor getMediaReleaseViewVisitor() {
                return cacheMediaReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateSwitcher getStateSwitcher() {
                return cacheDivStateSwitcher();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateTransitionHolder getStateTransitionHolder() {
                return cacheDivStateTransitionHolder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorVisualMonitor getErrorMonitor() {
                return cacheErrorVisualMonitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ViewBindingProvider getBindingProvider() {
                return cacheViewBindingProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorCollectors getErrorCollectors() {
                return this.mDiv2Component.cacheErrorCollectors();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public InputFocusTracker getInputFocusTracker() {
                return cacheInputFocusTracker();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivAnimatorController getAnimatorController() {
                return cacheDivAnimatorController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTooltipController getDivTooltipController() {
                return this.mDiv2Component.cacheDivTooltipController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivRuntimeVisitor getRuntimeVisitor() {
                return this.mDiv2Component.cacheDivRuntimeVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
                return cacheReportingSafeDrawingPassOverrideStrategy();
            }

            Object switch$$access(int i) {
                if (i == 0) {
                    return new DivJoinedStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                if (i == 1) {
                    return new DivMultipleStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }

            DivTransitionBuilder cacheDivTransitionBuilder() {
                Object obj = this.mDivTransitionBuilderInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    Div2ComponentImpl div2ComponentImpl = this.mDiv2Component;
                    obj = new DivTransitionBuilder(div2ComponentImpl.mBaseContext, div2ComponentImpl.cacheDivViewIdProvider());
                    this.mDivTransitionBuilderInstance = obj;
                }
                return (DivTransitionBuilder) obj;
            }

            ReleaseViewVisitor cacheReleaseViewVisitor() {
                Object obj = this.mReleaseViewVisitorInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new ReleaseViewVisitor(this.mDivView, (DivCustomContainerViewAdapter) Checks.checkProvisionNotNull(this.mDiv2Component.mDivConfiguration.getDivCustomContainerViewAdapter()), this.mDiv2Component.cacheDivExtensionController());
                    this.mReleaseViewVisitorInstance = obj;
                }
                return (ReleaseViewVisitor) obj;
            }

            MediaReleaseViewVisitor cacheMediaReleaseViewVisitor() {
                Object obj = this.mMediaReleaseViewVisitorInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new MediaReleaseViewVisitor();
                    this.mMediaReleaseViewVisitorInstance = obj;
                }
                return (MediaReleaseViewVisitor) obj;
            }

            DivStateSwitcher cacheDivStateSwitcher() {
                Object obj = this.mDivStateSwitcherInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = Checks.checkProvisionNotNull(Div2ViewModule.provideStateSwitcher(((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isMultipleStateChangeEnabled()))).booleanValue(), new CachingProviderImpl(this, 0), new CachingProviderImpl(this, 1)));
                    this.mDivStateSwitcherInstance = obj;
                }
                return (DivStateSwitcher) obj;
            }

            DivStateTransitionHolder cacheDivStateTransitionHolder() {
                Object obj = this.mDivStateTransitionHolderInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new DivStateTransitionHolder(this.mDivView);
                    this.mDivStateTransitionHolderInstance = obj;
                }
                return (DivStateTransitionHolder) obj;
            }

            ErrorVisualMonitor cacheErrorVisualMonitor() {
                Object obj = this.mErrorVisualMonitorInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new ErrorVisualMonitor(this.mDiv2Component.cacheErrorCollectors(), this.mDivView, ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.getAreVisualErrorsEnabled()))).booleanValue(), ((Boolean) Checks.checkProvisionNotNull(Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isPermanentDebugPanelEnabled()))).booleanValue(), cacheViewBindingProvider(), (DivTypefaceProvider) Checks.checkProvisionNotNull(this.mDiv2Component.mDivConfiguration.getTypefaceProvider()));
                    this.mErrorVisualMonitorInstance = obj;
                }
                return (ErrorVisualMonitor) obj;
            }

            ViewBindingProvider cacheViewBindingProvider() {
                Object obj = this.mViewBindingProviderInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new ViewBindingProvider();
                    this.mViewBindingProviderInstance = obj;
                }
                return (ViewBindingProvider) obj;
            }

            InputFocusTracker cacheInputFocusTracker() {
                Object obj = this.mInputFocusTrackerInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new InputFocusTracker(this.mDivView);
                    this.mInputFocusTrackerInstance = obj;
                }
                return (InputFocusTracker) obj;
            }

            DivAnimatorController cacheDivAnimatorController() {
                Object obj = this.mDivAnimatorControllerInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new DivAnimatorController(this.mDivView);
                    this.mDivAnimatorControllerInstance = obj;
                }
                return (DivAnimatorController) obj;
            }

            ReportingSafeDrawingPassOverrideStrategy cacheReportingSafeDrawingPassOverrideStrategy() {
                Object obj = this.mReportingSafeDrawingPassOverrideStrategyInstance;
                if (obj == null) {
                    ThreadAssertions.assertThreadAccess();
                    obj = new ReportingSafeDrawingPassOverrideStrategy(this.mDivView, (Div2Logger) Checks.checkProvisionNotNull(this.mDiv2Component.mDivConfiguration.getDiv2Logger()));
                    this.mReportingSafeDrawingPassOverrideStrategyInstance = obj;
                }
                return (ReportingSafeDrawingPassOverrideStrategy) obj;
            }

            /* compiled from: Yatagan$DivKitComponent.java */
            private static final class CachingProviderImpl implements Lazy {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i) {
                    this.mDelegate = div2ViewComponentImpl;
                    this.mIndex = i;
                }

                @Override // javax.inject.Provider
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    ThreadAssertions.assertThreadAccess();
                    Object switch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = switch$$access;
                    return switch$$access;
                }
            }

            /* compiled from: Yatagan$DivKitComponent.java */
            private static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                Div2ComponentImpl fDiv2Component;
                private Div2View mDivView;

                ComponentFactoryImpl(Div2ComponentImpl div2ComponentImpl) {
                    this.fDiv2Component = div2ComponentImpl;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent.Builder divView(Div2View div2View) {
                    this.mDivView = div2View;
                    return this;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.fDiv2Component, this.mDivView);
                }
            }
        }

        /* compiled from: Yatagan$DivKitComponent.java */
        static final class ProviderImpl implements Lazy {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i) {
                this.mDelegate = div2ComponentImpl;
                this.mIndex = i;
            }

            @Override // javax.inject.Provider
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }
        }

        /* compiled from: Yatagan$DivKitComponent.java */
        private static final class ComponentFactoryImpl implements Div2Component.Builder {
            Yatagan$DivKitComponent fDivKitComponent;
            private ContextThemeWrapper mBaseContext;
            private DivConfiguration mConfiguration;
            private DivCreationTracker mDivCreationTracker;
            private DivVariableController mDivVariableController;
            private Integer mThemeId;

            ComponentFactoryImpl(Yatagan$DivKitComponent yatagan$DivKitComponent) {
                this.fDivKitComponent = yatagan$DivKitComponent;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder baseContext(ContextThemeWrapper contextThemeWrapper) {
                this.mBaseContext = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder configuration(DivConfiguration divConfiguration) {
                this.mConfiguration = divConfiguration;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder themeId(int i) {
                this.mThemeId = Integer.valueOf(i);
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divCreationTracker(DivCreationTracker divCreationTracker) {
                this.mDivCreationTracker = divCreationTracker;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divVariableController(DivVariableController divVariableController) {
                this.mDivVariableController = divVariableController;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component build() {
                return new Div2ComponentImpl(this.fDivKitComponent, this.mBaseContext, this.mConfiguration, this.mThemeId, this.mDivCreationTracker, this.mDivVariableController);
            }
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    private static final class UninitializedLock {
        private UninitializedLock() {
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    static final class ProviderImpl implements Lazy {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i;
        }

        @Override // javax.inject.Provider
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    private static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private Context mApplicationContext;
        private DivKitConfiguration mConfiguration;

        private ComponentFactoryImpl() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder applicationContext(Context context) {
            this.mApplicationContext = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder configuration(DivKitConfiguration divKitConfiguration) {
            this.mConfiguration = divKitConfiguration;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.mApplicationContext, this.mConfiguration);
        }
    }
}
