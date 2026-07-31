package com.yandex.div.core.dagger;

import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.extension.DivExtensionController;
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
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;

@DivScope
/* loaded from: classes15.dex */
public interface Div2Component {

    public interface Builder {
        @NonNull
        Builder baseContext(@NonNull ContextThemeWrapper contextThemeWrapper);

        @NonNull
        Div2Component build();

        @NonNull
        Builder configuration(@NonNull DivConfiguration divConfiguration);

        @NonNull
        Builder divCreationTracker(@NonNull DivCreationTracker divCreationTracker);

        @NonNull
        Builder divVariableController(@NonNull DivVariableController divVariableController);

        @NonNull
        Builder themeId(@StyleRes int i);
    }

    @NonNull
    DivActionBinder getActionBinder();

    @NonNull
    DivActionHandler getActionHandler();

    @NonNull
    DivActionTypedHandlerCombiner getActionTypedHandlerCombiner();

    @NonNull
    BitmapEffectHelper getBitmapEffectHelper();

    @NonNull
    Div2Builder getDiv2Builder();

    @NonNull
    Div2Logger getDiv2Logger();

    @NonNull
    DivBinder getDivBinder();

    @NonNull
    DivCreationTracker getDivCreationTracker();

    @NonNull
    DivCustomContainerChildFactory getDivCustomContainerChildFactory();

    @NonNull
    DivCustomContainerViewAdapter getDivCustomContainerViewAdapter();

    @NonNull
    DivDataChangeListener getDivDataChangeListener();

    @NonNull
    DivDownloader getDivDownloader();

    @NonNull
    DivStateChangeListener getDivStateChangeListener();

    @NonNull
    DivTimerEventDispatcherProvider getDivTimersControllerProvider();

    @NonNull
    DivVariableController getDivVariableController();

    @NonNull
    DivVideoActionHandler getDivVideoActionHandler();

    @NonNull
    @Deprecated
    DivPlayerFactory getDivVideoFactory();

    @NonNull
    DivPlayerPreloader getDivVideoPreloader();

    @NonNull
    DivVideoViewMapper getDivVideoViewMapper();

    @NonNull
    DivViewCreator getDivViewCreator();

    @NonNull
    DivViewDataPreloader getDivViewDataPreloader();

    @NonNull
    ErrorCollectors getErrorCollectors();

    @NonNull
    DivExtensionController getExtensionController();

    @NonNull
    HistogramReporter getHistogramReporter();

    @NonNull
    DivImagePreloader getImagePreloader();

    @NonNull
    DivPatchManager getPatchManager();

    @NonNull
    PerformanceDependentSessionProfiler getPerformanceDependentSessionProfiler();

    @NonNull
    DivPreloader getPreloader();

    @NonNull
    ReleaseManager getReleaseManager();

    @NonNull
    @Deprecated
    RenderScript getRenderScript();

    @NonNull
    RuntimeStoreProvider getRuntimeStoreProvider();

    @NonNull
    DivStateManager getStateManager();

    @NonNull
    StoredValuesController getStoredValuesController();

    @NonNull
    TabsStateCache getTabsStateCache();

    @NonNull
    TemporaryDivStateCache getTemporaryDivStateCache();

    @NonNull
    DivTooltipController getTooltipController();

    @NonNull
    ViewPreCreationProfileRepository getViewPreCreationProfileRepository();

    @NonNull
    DivVisibilityActionDispatcher getVisibilityActionDispatcher();

    @NonNull
    DivVisibilityActionTracker getVisibilityActionTracker();

    @NonNull
    @ExperimentFlag(experiment = Experiment.BIND_ON_ATTACH_ENABLED)
    boolean isBindOnAttachEnabled();

    @NonNull
    @ExperimentFlag(experiment = Experiment.COMPLEX_REBIND_ENABLED)
    boolean isComplexRebindEnabled();

    @NonNull
    @ExperimentFlag(experiment = Experiment.PAGER_PAGE_CLIP_ENABLED)
    boolean isPagerPageClipEnabled();

    @NonNull
    Div2ViewComponent.Builder viewComponent();
}
