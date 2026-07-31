package com.yandex.div.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.state.InMemoryDivStateCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@PublicApi
/* loaded from: classes15.dex */
public class DivConfiguration {
    private final boolean mAccessibilityEnabled;

    @NonNull
    private final DivActionHandler mActionHandler;
    private boolean mBindOnAttachEnabled;
    private boolean mComplexRebindEnabled;

    @NonNull
    private final Div2ImageStubProvider mDiv2ImageStubProvider;

    @NonNull
    private final Div2Logger mDiv2Logger;

    @NonNull
    private final DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;

    @NonNull
    private final DivDataChangeListener mDivDataChangeListener;

    @NonNull
    private final DivDownloader mDivDownloader;

    @NonNull
    private final DivPlayerFactory mDivPlayerFactory;

    @NonNull
    private final DivPlayerPreloader mDivPlayerPreloader;

    @NonNull
    private final DivStateCache mDivStateCache;

    @NonNull
    private final DivStateChangeListener mDivStateChangeListener;

    @NonNull
    private final DivVariableController mDivVariableController;

    @NonNull
    private final List<DivVisibilityChangeListener> mDivVisibilityChangeListeners;

    @NonNull
    private final List<DivExtensionHandler> mExtensionHandlers;

    @NonNull
    private final DivImageLoader mImageLoader;
    private final boolean mLongtapActionsPassToChild;
    private boolean mMultipleStateChangeEnabled;
    private boolean mPagerPageClipEnabled;
    private boolean mPermanentDebugPanelEnabled;
    private float mRecyclerScrollInterceptionAngle;
    private boolean mRenderEffectEnabled;
    private boolean mResourceCacheEnabled;
    private final boolean mShouldIgnoreMenuItemsInActions;
    private final boolean mSupportHyphenation;
    private final boolean mSwipeOutBeaconsEnabled;
    private final boolean mTapBeaconsEnabled;

    @NonNull
    private final DivTooltipRestrictor mTooltipRestrictor;

    @NonNull
    private final DivTypefaceProvider mTypefaceProvider;

    @NonNull
    private final Map<String, DivTypefaceProvider> mTypefaceProviders;
    private boolean mViewPoolEnabled;
    private boolean mViewPoolOptimizationDebug;
    private boolean mViewPoolProfilingEnabled;

    @NonNull
    private final ViewPoolProfiler.Reporter mViewPoolReporter;

    @NonNull
    private final ViewPreCreationProfile mViewPreCreationProfile;
    private final boolean mVisibilityBeaconsEnabled;
    private final boolean mVisualErrors;

    private DivConfiguration(@NonNull DivImageLoader divImageLoader, @NonNull DivActionHandler divActionHandler, @NonNull Div2Logger div2Logger, @NonNull DivDataChangeListener divDataChangeListener, @NonNull DivStateChangeListener divStateChangeListener, @NonNull DivStateCache divStateCache, @NonNull Div2ImageStubProvider div2ImageStubProvider, @NonNull List<DivVisibilityChangeListener> list, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerFactory divPlayerFactory, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivTooltipRestrictor divTooltipRestrictor, @NonNull List<DivExtensionHandler> list2, @NonNull DivDownloader divDownloader, @NonNull DivTypefaceProvider divTypefaceProvider, @NonNull Map<String, DivTypefaceProvider> map, @NonNull ViewPreCreationProfile viewPreCreationProfile, @NonNull ViewPoolProfiler.Reporter reporter, @NonNull DivVariableController divVariableController, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, float f, boolean z18) {
        this.mImageLoader = divImageLoader;
        this.mActionHandler = divActionHandler;
        this.mDiv2Logger = div2Logger;
        this.mDivDataChangeListener = divDataChangeListener;
        this.mDivStateChangeListener = divStateChangeListener;
        this.mDivStateCache = divStateCache;
        this.mDiv2ImageStubProvider = div2ImageStubProvider;
        this.mDivVisibilityChangeListeners = list;
        this.mDivCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.mDivPlayerFactory = divPlayerFactory;
        this.mDivPlayerPreloader = divPlayerPreloader;
        this.mTooltipRestrictor = divTooltipRestrictor;
        this.mExtensionHandlers = list2;
        this.mDivDownloader = divDownloader;
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTypefaceProviders = map;
        this.mViewPoolReporter = reporter;
        this.mTapBeaconsEnabled = z;
        this.mVisibilityBeaconsEnabled = z2;
        this.mSwipeOutBeaconsEnabled = z3;
        this.mLongtapActionsPassToChild = z4;
        this.mShouldIgnoreMenuItemsInActions = z5;
        this.mVisualErrors = z6;
        this.mSupportHyphenation = z7;
        this.mAccessibilityEnabled = z8;
        this.mViewPoolEnabled = z9;
        this.mViewPreCreationProfile = viewPreCreationProfile;
        this.mViewPoolProfilingEnabled = z10;
        this.mViewPoolOptimizationDebug = z11;
        this.mResourceCacheEnabled = z12;
        this.mMultipleStateChangeEnabled = z13;
        this.mBindOnAttachEnabled = z14;
        this.mComplexRebindEnabled = z15;
        this.mPermanentDebugPanelEnabled = z17;
        this.mDivVariableController = divVariableController;
        this.mRecyclerScrollInterceptionAngle = f;
        this.mPagerPageClipEnabled = z16;
        this.mRenderEffectEnabled = z18;
    }

    @NonNull
    public DivActionHandler getActionHandler() {
        return this.mActionHandler;
    }

    @NonNull
    public DivImageLoader getImageLoader() {
        return this.mImageLoader;
    }

    @NonNull
    public Div2Logger getDiv2Logger() {
        return this.mDiv2Logger;
    }

    @NonNull
    public DivDataChangeListener getDivDataChangeListener() {
        return this.mDivDataChangeListener;
    }

    @NonNull
    public DivStateChangeListener getDivStateChangeListener() {
        return this.mDivStateChangeListener;
    }

    @NonNull
    public DivStateCache getDivStateCache() {
        return this.mDivStateCache;
    }

    @NonNull
    public Div2ImageStubProvider getDiv2ImageStubProvider() {
        return this.mDiv2ImageStubProvider;
    }

    @NonNull
    public List<? extends DivVisibilityChangeListener> getDivVisibilityChangeListeners() {
        return this.mDivVisibilityChangeListeners;
    }

    @NonNull
    public DivCustomContainerViewAdapter getDivCustomContainerViewAdapter() {
        return this.mDivCustomContainerViewAdapter;
    }

    @NonNull
    public DivPlayerFactory getDivPlayerFactory() {
        return this.mDivPlayerFactory;
    }

    @NonNull
    public DivPlayerPreloader getDivPlayerPreloader() {
        return this.mDivPlayerPreloader;
    }

    @NonNull
    public DivTooltipRestrictor getTooltipRestrictor() {
        return this.mTooltipRestrictor;
    }

    @NonNull
    public List<? extends DivExtensionHandler> getExtensionHandlers() {
        return this.mExtensionHandlers;
    }

    @ExperimentFlag(experiment = Experiment.TAP_BEACONS_ENABLED)
    public boolean isTapBeaconsEnabled() {
        return this.mTapBeaconsEnabled;
    }

    @ExperimentFlag(experiment = Experiment.VISIBILITY_BEACONS_ENABLED)
    public boolean isVisibilityBeaconsEnabled() {
        return this.mVisibilityBeaconsEnabled;
    }

    @ExperimentFlag(experiment = Experiment.SWIPE_OUT_BEACONS_ENABLED)
    public boolean isSwipeOutBeaconsEnabled() {
        return this.mSwipeOutBeaconsEnabled;
    }

    @ExperimentFlag(experiment = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED)
    public boolean isLongtapActionsPassToChild() {
        return this.mLongtapActionsPassToChild;
    }

    @ExperimentFlag(experiment = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED)
    public boolean isContextMenuHandlerOverridden() {
        return this.mShouldIgnoreMenuItemsInActions;
    }

    @ExperimentFlag(experiment = Experiment.HYPHENATION_SUPPORT_ENABLED)
    public boolean isHyphenationSupported() {
        return this.mSupportHyphenation;
    }

    @ExperimentFlag(experiment = Experiment.VIEW_POOL_ENABLED)
    public boolean isViewPoolEnabled() {
        return this.mViewPoolEnabled;
    }

    @ExperimentFlag(experiment = Experiment.PAGER_PAGE_CLIP_ENABLED)
    public boolean isPagerPageClipEnabled() {
        return this.mPagerPageClipEnabled;
    }

    @ExperimentFlag(experiment = Experiment.VIEW_POOL_PROFILING_ENABLED)
    public boolean isViewPoolProfilingEnabled() {
        return this.mViewPoolProfilingEnabled;
    }

    @ExperimentFlag(experiment = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG)
    public boolean isDebuggingViewPoolOptimization() {
        return this.mViewPoolOptimizationDebug;
    }

    @ExperimentFlag(experiment = Experiment.RESOURCE_CACHE_ENABLED)
    public boolean isResourceCacheEnabled() {
        return this.mResourceCacheEnabled;
    }

    @ExperimentFlag(experiment = Experiment.MULTIPLE_STATE_CHANGE_ENABLED)
    public boolean isMultipleStateChangeEnabled() {
        return this.mMultipleStateChangeEnabled;
    }

    @ExperimentFlag(experiment = Experiment.RENDER_EFFECT_ENABLED)
    public boolean isRenderEffectEnabled() {
        return this.mRenderEffectEnabled;
    }

    @NonNull
    public DivDownloader getDivDownloader() {
        return this.mDivDownloader;
    }

    @NonNull
    public DivTypefaceProvider getTypefaceProvider() {
        return this.mTypefaceProvider;
    }

    @NonNull
    public Map<String, ? extends DivTypefaceProvider> getAdditionalTypefaceProviders() {
        return this.mTypefaceProviders;
    }

    @NonNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.mViewPreCreationProfile;
    }

    @NonNull
    public ViewPoolProfiler.Reporter getViewPoolReporter() {
        return this.mViewPoolReporter;
    }

    @ExperimentFlag(experiment = Experiment.VISUAL_ERRORS_ENABLED)
    public boolean getAreVisualErrorsEnabled() {
        return this.mVisualErrors;
    }

    @Deprecated
    @ExperimentFlag(experiment = Experiment.ACCESSIBILITY_ENABLED)
    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityEnabled;
    }

    @ExperimentFlag(experiment = Experiment.BIND_ON_ATTACH_ENABLED)
    public boolean isBindOnAttachEnabled() {
        return this.mBindOnAttachEnabled;
    }

    @ExperimentFlag(experiment = Experiment.COMPLEX_REBIND_ENABLED)
    public boolean isComplexRebindEnabled() {
        return this.mComplexRebindEnabled;
    }

    @ExperimentFlag(experiment = Experiment.PERMANENT_DEBUG_PANEL_ENABLED)
    public boolean isPermanentDebugPanelEnabled() {
        return this.mPermanentDebugPanelEnabled;
    }

    public float getRecyclerScrollInterceptionAngle() {
        return this.mRecyclerScrollInterceptionAngle;
    }

    @NonNull
    public DivVariableController getDivVariableController() {
        return this.mDivVariableController;
    }

    @InternalApi
    @Deprecated
    public GlobalVariableController getGlobalVariableController() {
        return new GlobalVariableController(this.mDivVariableController);
    }

    public static class Builder {

        @Nullable
        private DivActionHandler mActionHandler;

        @Nullable
        private Map<String, DivTypefaceProvider> mAdditionalTypefaceProviders;

        @Nullable
        private Div2ImageStubProvider mDiv2ImageStubProvider;

        @Nullable
        private Div2Logger mDiv2Logger;

        @Nullable
        private DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;

        @Nullable
        private DivDataChangeListener mDivDataChangeListener;

        @Nullable
        private DivDownloader mDivDownloader;

        @Nullable
        private DivPlayerFactory mDivPlayerFactory;

        @Nullable
        private DivPlayerPreloader mDivPlayerPreloader;

        @Nullable
        private DivStateCache mDivStateCache;

        @Nullable
        private DivStateChangeListener mDivStateChangeListener;

        @Nullable
        private DivVariableController mDivVariableController;

        @NonNull
        private final DivImageLoader mImageLoader;

        @Nullable
        private DivTooltipRestrictor mTooltipRestrictor;

        @Nullable
        private DivTypefaceProvider mTypefaceProvider;

        @Nullable
        private ViewPoolProfiler.Reporter mViewPoolReporter;

        @Nullable
        private ViewPreCreationProfile mViewPreCreationProfile;

        @NonNull
        private final List<DivVisibilityChangeListener> mDivVisibilityChangeListeners = new ArrayList();

        @NonNull
        private final List<DivExtensionHandler> mExtensionHandlers = new ArrayList();
        private boolean mTapBeaconsEnabled = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
        private boolean mVisibilityBeaconsEnabled = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        private boolean mSwipeOutBeaconsEnabled = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        private boolean mLongtapActionsPassToChild = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        private boolean mShouldIgnoreMenuItemsInActions = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        private boolean mSupportHyphenation = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        private boolean mVisualErrors = Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue();
        private boolean mAccessibilityEnabled = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
        private boolean mViewPoolEnabled = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
        private boolean mViewPoolProfilingEnabled = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        private boolean mViewPoolOptimizationDebug = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        private boolean mResourceCacheEnabled = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
        private boolean mMultipleStateChangeEnabled = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        private boolean mBindOnAttachEnabled = false;
        private boolean mComplexRebindEnabled = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
        private boolean mPagerPageClipEnabled = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        private boolean mPermanentDebugPanelEnabled = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        private float mRecyclerScrollInterceptionAngle = 0.0f;
        private boolean mRenderEffectEnabled = Experiment.RENDER_EFFECT_ENABLED.getDefaultValue();

        @NonNull
        @InternalApi
        @Deprecated
        public Builder globalVariableController(GlobalVariableController globalVariableController) {
            return this;
        }

        public Builder(@NonNull DivImageLoader divImageLoader) {
            this.mImageLoader = divImageLoader;
        }

        @NonNull
        public Builder actionHandler(@NonNull DivActionHandler divActionHandler) {
            this.mActionHandler = divActionHandler;
            return this;
        }

        @NonNull
        public Builder div2Logger(@NonNull Div2Logger div2Logger) {
            this.mDiv2Logger = div2Logger;
            return this;
        }

        @NonNull
        public Builder divDataChangeListener(@NonNull DivDataChangeListener divDataChangeListener) {
            this.mDivDataChangeListener = divDataChangeListener;
            return this;
        }

        @NonNull
        public Builder divStateChangeListener(@NonNull DivStateChangeListener divStateChangeListener) {
            this.mDivStateChangeListener = divStateChangeListener;
            return this;
        }

        @NonNull
        public Builder divStateCache(@NonNull DivStateCache divStateCache) {
            this.mDivStateCache = divStateCache;
            return this;
        }

        @NonNull
        public Builder div2ImageStubProvider(@NonNull Div2ImageStubProvider div2ImageStubProvider) {
            this.mDiv2ImageStubProvider = div2ImageStubProvider;
            return this;
        }

        @NonNull
        public Builder divVisibilityChangeListener(@NonNull DivVisibilityChangeListener divVisibilityChangeListener) {
            this.mDivVisibilityChangeListeners.add(divVisibilityChangeListener);
            return this;
        }

        @NonNull
        public Builder divCustomContainerViewAdapter(@NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter) {
            this.mDivCustomContainerViewAdapter = divCustomContainerViewAdapter;
            return this;
        }

        @NonNull
        public Builder divPlayerFactory(@NonNull DivPlayerFactory divPlayerFactory) {
            this.mDivPlayerFactory = divPlayerFactory;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder divPlayerPreloader(@NonNull DivPlayerPreloader divPlayerPreloader) {
            this.mDivPlayerPreloader = divPlayerPreloader;
            return this;
        }

        @NonNull
        public Builder tooltipRestrictor(@NonNull DivTooltipRestrictor divTooltipRestrictor) {
            this.mTooltipRestrictor = divTooltipRestrictor;
            return this;
        }

        @NonNull
        public Builder enableTapBeacons() {
            this.mTapBeaconsEnabled = true;
            return this;
        }

        @NonNull
        public Builder enableVisibilityBeacons() {
            this.mVisibilityBeaconsEnabled = true;
            return this;
        }

        @NonNull
        public Builder swipeOutBeacons(Boolean bool) {
            this.mSwipeOutBeaconsEnabled = bool.booleanValue();
            return this;
        }

        @NonNull
        public Builder enableLongtapActionsPassingToChild() {
            this.mLongtapActionsPassToChild = true;
            return this;
        }

        @NonNull
        public Builder extension(@NonNull DivExtensionHandler divExtensionHandler) {
            this.mExtensionHandlers.add(divExtensionHandler);
            return this;
        }

        @NonNull
        public Builder divDownloader(@NonNull DivDownloader divDownloader) {
            this.mDivDownloader = divDownloader;
            return this;
        }

        @NonNull
        public Builder additionalTypefaceProviders(@NonNull Map<String, DivTypefaceProvider> map) {
            this.mAdditionalTypefaceProviders = map;
            return this;
        }

        @NonNull
        public Builder typefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
            this.mTypefaceProvider = divTypefaceProvider;
            return this;
        }

        @NonNull
        public Builder viewPreCreationProfile(@NonNull ViewPreCreationProfile viewPreCreationProfile) {
            this.mViewPreCreationProfile = viewPreCreationProfile;
            return this;
        }

        @NonNull
        public Builder viewPoolReporter(@NonNull ViewPoolProfiler.Reporter reporter) {
            this.mViewPoolReporter = reporter;
            return this;
        }

        @NonNull
        public Builder overrideContextMenuHandler(boolean z) {
            this.mShouldIgnoreMenuItemsInActions = z;
            return this;
        }

        @NonNull
        public Builder visualErrorsEnabled(boolean z) {
            this.mVisualErrors = z;
            return this;
        }

        @NonNull
        public Builder supportHyphenation(boolean z) {
            this.mSupportHyphenation = z;
            return this;
        }

        @NonNull
        public Builder enableAccessibility(boolean z) {
            this.mAccessibilityEnabled = z;
            return this;
        }

        @NonNull
        public Builder enableViewPool(boolean z) {
            this.mViewPoolEnabled = z;
            return this;
        }

        @NonNull
        public Builder enableViewPoolProfiling(boolean z) {
            this.mViewPoolProfilingEnabled = z;
            return this;
        }

        @NonNull
        public Builder debugViewPoolOptimization(boolean z) {
            this.mViewPoolOptimizationDebug = z;
            return this;
        }

        @NonNull
        public Builder enableResourceCache(boolean z) {
            this.mResourceCacheEnabled = z;
            return this;
        }

        @NonNull
        public Builder enableMultipleStateChange(boolean z) {
            this.mMultipleStateChangeEnabled = z;
            return this;
        }

        @NonNull
        public Builder enableBindOnAttach(boolean z) {
            this.mBindOnAttachEnabled = z;
            return this;
        }

        @NonNull
        public Builder enableComplexRebind(boolean z) {
            this.mComplexRebindEnabled = z;
            return this;
        }

        @NonNull
        public Builder enablePagerPageClipping(boolean z) {
            this.mPagerPageClipEnabled = z;
            return this;
        }

        @NonNull
        public Builder enablePermanentDebugPanel(boolean z) {
            this.mPermanentDebugPanelEnabled = z;
            return this;
        }

        @NonNull
        public Builder divVariableController(DivVariableController divVariableController) {
            this.mDivVariableController = divVariableController;
            return this;
        }

        public Builder recyclerScrollInterceptionAngle(float f) {
            this.mRecyclerScrollInterceptionAngle = f;
            return this;
        }

        @NonNull
        public Builder setRenderEffectEnabled(boolean z) {
            this.mRenderEffectEnabled = z;
            return this;
        }

        @NonNull
        public DivConfiguration build() {
            DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
            if (divTypefaceProvider == null) {
                divTypefaceProvider = DivTypefaceProvider.DEFAULT;
            }
            DivTypefaceProvider divTypefaceProvider2 = divTypefaceProvider;
            DivPlayerFactory divPlayerFactory = this.mDivPlayerFactory;
            if (divPlayerFactory == null) {
                divPlayerFactory = DivPlayerFactory.STUB;
            }
            DivPlayerFactory divPlayerFactory2 = divPlayerFactory;
            DivPlayerPreloader divPlayerPreloader = this.mDivPlayerPreloader;
            if (divPlayerPreloader == null) {
                divPlayerPreloader = divPlayerFactory2.makePreloader();
            }
            DivPlayerPreloader divPlayerPreloader2 = divPlayerPreloader;
            DivImageLoader divImageLoader = this.mImageLoader;
            DivActionHandler divActionHandler = this.mActionHandler;
            if (divActionHandler == null) {
                divActionHandler = new DivActionHandler();
            }
            DivActionHandler divActionHandler2 = divActionHandler;
            Div2Logger div2Logger = this.mDiv2Logger;
            if (div2Logger == null) {
                div2Logger = Div2Logger.STUB;
            }
            Div2Logger div2Logger2 = div2Logger;
            DivDataChangeListener divDataChangeListener = this.mDivDataChangeListener;
            if (divDataChangeListener == null) {
                divDataChangeListener = DivDataChangeListener.STUB;
            }
            DivDataChangeListener divDataChangeListener2 = divDataChangeListener;
            DivStateChangeListener divStateChangeListener = this.mDivStateChangeListener;
            if (divStateChangeListener == null) {
                divStateChangeListener = DivStateChangeListener.STUB;
            }
            DivStateChangeListener divStateChangeListener2 = divStateChangeListener;
            DivStateCache divStateCache = this.mDivStateCache;
            if (divStateCache == null) {
                divStateCache = new InMemoryDivStateCache();
            }
            DivStateCache divStateCache2 = divStateCache;
            Div2ImageStubProvider div2ImageStubProvider = this.mDiv2ImageStubProvider;
            if (div2ImageStubProvider == null) {
                div2ImageStubProvider = Div2ImageStubProvider.STUB;
            }
            Div2ImageStubProvider div2ImageStubProvider2 = div2ImageStubProvider;
            List<DivVisibilityChangeListener> list = this.mDivVisibilityChangeListeners;
            DivCustomContainerViewAdapter divCustomContainerViewAdapter = this.mDivCustomContainerViewAdapter;
            if (divCustomContainerViewAdapter == null) {
                divCustomContainerViewAdapter = DivCustomContainerViewAdapter.STUB;
            }
            DivCustomContainerViewAdapter divCustomContainerViewAdapter2 = divCustomContainerViewAdapter;
            DivTooltipRestrictor divTooltipRestrictor = this.mTooltipRestrictor;
            if (divTooltipRestrictor == null) {
                divTooltipRestrictor = DivTooltipRestrictor.STUB;
            }
            DivTooltipRestrictor divTooltipRestrictor2 = divTooltipRestrictor;
            List<DivExtensionHandler> list2 = this.mExtensionHandlers;
            DivDownloader divDownloader = this.mDivDownloader;
            if (divDownloader == null) {
                divDownloader = DivDownloader.STUB;
            }
            DivDownloader divDownloader2 = divDownloader;
            Map map = this.mAdditionalTypefaceProviders;
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = map;
            ViewPreCreationProfile viewPreCreationProfile = this.mViewPreCreationProfile;
            if (viewPreCreationProfile == null) {
                viewPreCreationProfile = new ViewPreCreationProfile();
            }
            ViewPreCreationProfile viewPreCreationProfile2 = viewPreCreationProfile;
            ViewPoolProfiler.Reporter reporter = this.mViewPoolReporter;
            if (reporter == null) {
                reporter = ViewPoolProfiler.Reporter.NO_OP;
            }
            ViewPoolProfiler.Reporter reporter2 = reporter;
            DivVariableController divVariableController = this.mDivVariableController;
            if (divVariableController == null) {
                divVariableController = new DivVariableController();
            }
            return new DivConfiguration(divImageLoader, divActionHandler2, div2Logger2, divDataChangeListener2, divStateChangeListener2, divStateCache2, div2ImageStubProvider2, list, divCustomContainerViewAdapter2, divPlayerFactory2, divPlayerPreloader2, divTooltipRestrictor2, list2, divDownloader2, divTypefaceProvider2, map2, viewPreCreationProfile2, reporter2, divVariableController, this.mTapBeaconsEnabled, this.mVisibilityBeaconsEnabled, this.mSwipeOutBeaconsEnabled, this.mLongtapActionsPassToChild, this.mShouldIgnoreMenuItemsInActions, this.mVisualErrors, this.mSupportHyphenation, this.mAccessibilityEnabled, this.mViewPoolEnabled, this.mViewPoolProfilingEnabled, this.mViewPoolOptimizationDebug, this.mResourceCacheEnabled, this.mMultipleStateChangeEnabled, this.mBindOnAttachEnabled, this.mComplexRebindEnabled, this.mPagerPageClipEnabled, this.mPermanentDebugPanelEnabled, this.mRecyclerScrollInterceptionAngle, this.mRenderEffectEnabled);
        }
    }
}
