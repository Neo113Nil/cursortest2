package com.yandex.div.core.dagger;

import android.content.Context;
import android.os.Build;
import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.image.DivImageLoaderWrapper;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.HighApiBitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.LowApiBitmapEffectHelper;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;

/* loaded from: classes5.dex */
public abstract class Div2Module {
    @NonNull
    public abstract Context bindContext(@NonNull ContextThemeWrapper contextThemeWrapper);

    @NonNull
    @DivScope
    public static Context provideThemedContext(@NonNull ContextThemeWrapper contextThemeWrapper, @StyleRes int i, @ExperimentFlag(experiment = Experiment.RESOURCE_CACHE_ENABLED) boolean z) {
        if (z) {
            return new ContextThemeWrapperWithResourceCache(contextThemeWrapper, i);
        }
        return new ContextThemeWrapper(contextThemeWrapper, i);
    }

    @NonNull
    @DivScope
    public static ViewPool provideViewPool(@ExperimentFlag(experiment = Experiment.VIEW_POOL_ENABLED) boolean z, @NonNull ExternalOptional<ViewPoolProfiler> externalOptional, @NonNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NonNull ViewCreator viewCreator) {
        if (z) {
            return new AdvanceViewPool((ViewPoolProfiler) externalOptional.getOptional().orNull(), performanceDependentSessionProfiler, viewCreator);
        }
        return new PseudoViewPool();
    }

    @NonNull
    @DivScope
    public static TabTextStyleProvider provideTabTextStyleProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        return new TabTextStyleProvider(divTypefaceProvider);
    }

    @NonNull
    @DivScope
    public static ExternalOptional<ViewPoolProfiler> provideViewPoolProfiler(@ExperimentFlag(experiment = Experiment.VIEW_POOL_PROFILING_ENABLED) boolean z, @NonNull ViewPoolProfiler.Reporter reporter) {
        if (z) {
            return ExternalOptional.of(new ViewPoolProfiler(reporter));
        }
        return ExternalOptional.empty();
    }

    @NonNull
    @DivScope
    public static RenderScript provideRenderScript(@NonNull Context context) {
        return RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
    }

    @NonNull
    @DivScope
    public static DivImageLoader provideDivImageLoader(@NonNull DivImageLoader divImageLoader, @NonNull Context context) {
        return new DivImageLoaderWrapper(divImageLoader, context);
    }

    @NonNull
    @DivScope
    public static DivPreloader provideDivPreloader(@NonNull DivImagePreloader divImagePreloader, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivExtensionController divExtensionController) {
        return new DivPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    @NonNull
    @DivScope
    public static DivViewDataPreloader provideDivViewDataPreloader(@NonNull DivImagePreloader divImagePreloader, @NonNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NonNull DivPlayerPreloader divPlayerPreloader, @NonNull DivExtensionController divExtensionController) {
        return new DivViewDataPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    @NonNull
    @DivScope
    public static BitmapEffectHelper provideBitmapEffectHelper(@NonNull Context context, @ExperimentFlag(experiment = Experiment.RENDER_EFFECT_ENABLED) boolean z) {
        if (z && Build.VERSION.SDK_INT >= 31) {
            return new HighApiBitmapEffectHelper();
        }
        return new LowApiBitmapEffectHelper(context);
    }
}
