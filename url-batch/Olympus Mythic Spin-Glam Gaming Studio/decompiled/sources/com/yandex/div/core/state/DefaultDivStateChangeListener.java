package com.yandex.div.core.state;

import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateChangeListener.kt */
@PublicApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\b\u0007\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/state/DefaultDivStateChangeListener;", "Lcom/yandex/div/core/state/DivStateChangeListener;", "rootView", "Landroid/view/ViewGroup;", "interpolator", "Landroid/view/animation/Interpolator;", "(Landroid/view/ViewGroup;Landroid/view/animation/Interpolator;)V", "rootViewProvider", "Ljavax/inject/Provider;", "(Ljavax/inject/Provider;Landroid/view/animation/Interpolator;)V", "onDivAnimatedStateChanged", "", "divView", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultDivStateChangeListener implements DivStateChangeListener {

    @NotNull
    private final Interpolator interpolator;

    @NotNull
    private final Provider rootViewProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDivStateChangeListener(@NotNull ViewGroup viewGroup) {
        this(viewGroup, (Interpolator) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDivStateChangeListener(@NotNull Provider provider) {
        this(provider, (Interpolator) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup _init_$lambda$0(ViewGroup viewGroup) {
        return viewGroup;
    }

    public DefaultDivStateChangeListener(@NotNull Provider provider, @NotNull Interpolator interpolator) {
        this.rootViewProvider = provider;
        this.interpolator = interpolator;
    }

    public /* synthetic */ DefaultDivStateChangeListener(Provider provider, Interpolator interpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, (i & 2) != 0 ? new SpringInterpolator() : interpolator);
    }

    public /* synthetic */ DefaultDivStateChangeListener(ViewGroup viewGroup, Interpolator interpolator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? new SpringInterpolator() : interpolator);
    }

    public DefaultDivStateChangeListener(@NotNull final ViewGroup viewGroup, @NotNull Interpolator interpolator) {
        this(new Provider() { // from class: com.yandex.div.core.state.DefaultDivStateChangeListener$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                ViewGroup _init_$lambda$0;
                _init_$lambda$0 = DefaultDivStateChangeListener._init_$lambda$0(viewGroup);
                return _init_$lambda$0;
            }
        }, interpolator);
    }

    @Override // com.yandex.div.core.state.DivStateChangeListener
    public void onDivAnimatedStateChanged(@NotNull Div2View divView) {
        ViewGroup viewGroup = (ViewGroup) this.rootViewProvider.get();
        if (viewGroup == null) {
            return;
        }
        Transition interpolator = new DivStateTransition(divView, false, 2, null).setInterpolator(this.interpolator);
        TransitionManager.endTransitions(viewGroup);
        SceneRootWatcher.INSTANCE.watchFor(viewGroup, interpolator);
        TransitionManager.beginDelayedTransition(viewGroup, interpolator);
    }
}
