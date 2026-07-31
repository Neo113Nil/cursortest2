package com.yandex.div.core.dagger;

import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivActionTypedModule.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001bH'J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001fH'J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!H'J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020#H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/DivActionTypedModule;", "", "provideAnimatorTypedActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "impl", "Lcom/yandex/div/core/actions/DivAnimatorTypedActionHandler;", "provideArrayMutationActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedArrayMutationHandler;", "provideClearFocusActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedClearFocusHandler;", "provideCopyToClipboardActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedCopyToClipboardHandler;", "provideDictSetValueActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedDictSetValueHandler;", "provideDivSubmitActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedSubmitHandler;", "provideFocusElementActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedFocusElementHandler;", "provideHideTooltipActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedHideTooltipHandler;", "provideScrollActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedScrollHandler;", "provideSetStateActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedSetStateHandler;", "provideSetStoredValueActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedSetStoredValueHandler;", "provideSetVariableActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedSetVariableHandler;", "provideShowTooltipActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedShowTooltipHandler;", "provideTimerActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedTimerHandler;", "provideUpdateStructureHandler", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler;", "provideVideoActionHandler", "Lcom/yandex/div/core/actions/DivActionTypedVideoHandler;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DivActionTypedModule {
    @NotNull
    DivActionTypedHandler provideAnimatorTypedActionHandler(@NotNull DivAnimatorTypedActionHandler impl);

    @NotNull
    DivActionTypedHandler provideArrayMutationActionHandler(@NotNull DivActionTypedArrayMutationHandler impl);

    @NotNull
    DivActionTypedHandler provideClearFocusActionHandler(@NotNull DivActionTypedClearFocusHandler impl);

    @NotNull
    DivActionTypedHandler provideCopyToClipboardActionHandler(@NotNull DivActionTypedCopyToClipboardHandler impl);

    @NotNull
    DivActionTypedHandler provideDictSetValueActionHandler(@NotNull DivActionTypedDictSetValueHandler impl);

    @NotNull
    DivActionTypedHandler provideDivSubmitActionHandler(@NotNull DivActionTypedSubmitHandler impl);

    @NotNull
    DivActionTypedHandler provideFocusElementActionHandler(@NotNull DivActionTypedFocusElementHandler impl);

    @NotNull
    DivActionTypedHandler provideHideTooltipActionHandler(@NotNull DivActionTypedHideTooltipHandler impl);

    @NotNull
    DivActionTypedHandler provideScrollActionHandler(@NotNull DivActionTypedScrollHandler impl);

    @NotNull
    DivActionTypedHandler provideSetStateActionHandler(@NotNull DivActionTypedSetStateHandler impl);

    @NotNull
    DivActionTypedHandler provideSetStoredValueActionHandler(@NotNull DivActionTypedSetStoredValueHandler impl);

    @NotNull
    DivActionTypedHandler provideSetVariableActionHandler(@NotNull DivActionTypedSetVariableHandler impl);

    @NotNull
    DivActionTypedHandler provideShowTooltipActionHandler(@NotNull DivActionTypedShowTooltipHandler impl);

    @NotNull
    DivActionTypedHandler provideTimerActionHandler(@NotNull DivActionTypedTimerHandler impl);

    @NotNull
    DivActionTypedHandler provideUpdateStructureHandler(@NotNull DivActionTypedUpdateStructureHandler impl);

    @NotNull
    DivActionTypedHandler provideVideoActionHandler(@NotNull DivActionTypedVideoHandler impl);
}
