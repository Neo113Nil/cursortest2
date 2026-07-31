package com.yandex.div.core.dagger;

import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.util.ReportingSafeDrawingPassOverrideStrategy;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import javax.inject.Provider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Div2ViewModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/Div2ViewModule;", "", "bindsDrawingPassOverrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "i", "Lcom/yandex/div/core/util/ReportingSafeDrawingPassOverrideStrategy;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Div2ViewModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @DivViewScope
    @NotNull
    static DivStateSwitcher provideStateSwitcher(@ExperimentFlag(experiment = Experiment.MULTIPLE_STATE_CHANGE_ENABLED) boolean z, @NotNull Provider provider, @NotNull Provider provider2) {
        return INSTANCE.provideStateSwitcher(z, provider, provider2);
    }

    @NotNull
    DrawingPassOverrideStrategy bindsDrawingPassOverrideStrategy(@NotNull ReportingSafeDrawingPassOverrideStrategy i);

    /* compiled from: Div2ViewModule.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/dagger/Div2ViewModule$Companion;", "", "()V", "provideStateSwitcher", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "multipleStateChangeEnabled", "", "joinedStateSwitcher", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/state/DivJoinedStateSwitcher;", "multipleStateSwitcher", "Lcom/yandex/div/core/view2/state/DivMultipleStateSwitcher;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @DivViewScope
        @NotNull
        public final DivStateSwitcher provideStateSwitcher(@ExperimentFlag(experiment = Experiment.MULTIPLE_STATE_CHANGE_ENABLED) boolean multipleStateChangeEnabled, @NotNull Provider joinedStateSwitcher, @NotNull Provider multipleStateSwitcher) {
            return (DivStateSwitcher) (multipleStateChangeEnabled ? multipleStateSwitcher.get() : joinedStateSwitcher.get());
        }
    }
}
