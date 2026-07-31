package com.yandex.div.core;

import android.content.res.Configuration;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;

@PublicApi
/* loaded from: classes13.dex */
public interface DivViewFacade {
    void addLoadReference(@NonNull LoadReference loadReference, @NonNull View view);

    default void cancelTooltips() {
    }

    void cleanup();

    void clearSubscriptions();

    void dismissPendingOverflowMenus();

    @NonNull
    DivViewConfig getConfig();

    @Nullable
    DivViewState getCurrentState();

    long getCurrentStateId();

    @NonNull
    DivDataTag getDivTag();

    @NonNull
    View getView();

    void handleUri(@NonNull Uri uri);

    boolean hasScrollableViewUnder(@NonNull MotionEvent motionEvent);

    default void hideTooltip(@NonNull String str) {
    }

    void onConfigurationChangedOutside(@NonNull Configuration configuration);

    void resetToInitialState();

    void setConfig(@NonNull DivViewConfig divViewConfig);

    default void showTooltip(@NonNull String str) {
    }

    void subscribe(@NonNull OverflowMenuSubscriber.Listener listener);

    void switchToInitialState();

    void switchToState(@IntRange long j, boolean z);

    default void switchToState(@IntRange long j) {
        switchToState(j, true);
    }

    default void switchToState(@NonNull DivStatePath divStatePath, boolean z) {
        switchToState(divStatePath.getTopLevelStateId(), z);
    }

    @NonNull
    default ExpressionResolver getExpressionResolver() {
        return ExpressionResolver.EMPTY;
    }

    default void showTooltip(@NonNull String str, boolean z) {
        showTooltip(str);
    }
}
