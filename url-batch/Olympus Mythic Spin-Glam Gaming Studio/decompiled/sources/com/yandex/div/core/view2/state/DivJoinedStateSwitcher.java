package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivJoinedStateSwitcher.kt */
@DivViewScope
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/state/DivJoinedStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;)V", "findCommonPath", "Lcom/yandex/div/core/state/DivStatePath;", "pathList", "", "rootPath", "switchStates", "", "state", "Lcom/yandex/div2/DivData$State;", "paths", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivJoinedStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivJoinedStateSwitcher(@NotNull Div2View div2View, @NotNull DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull DivData.State state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) {
        View childAt = this.divView.getChildAt(0);
        Div div = state.div;
        DivStatePath fromState$div_release = DivStatePath.INSTANCE.fromState$div_release(state);
        DivStatePath findCommonPath = findCommonPath(paths, fromState$div_release);
        if (!findCommonPath.isRootPath()) {
            Pair<DivStateLayout, Div.State> tryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, findCommonPath, resolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout component1 = tryFindStateDivAndLayout$div_release.component1();
            Div.State component2 = tryFindStateDivAndLayout$div_release.component2();
            if (component1 != null) {
                DivStatePath path = component1.getPath();
                fromState$div_release = path == null ? findCommonPath : path;
                div = component2;
                childAt = component1;
            }
        }
        BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(childAt);
        if (bindingContext == null) {
            bindingContext = this.divView.getBindingContext();
        }
        this.divBinder.bind(bindingContext, childAt, div, fromState$div_release.parentState());
        this.divBinder.attachIndicators$div_release();
    }

    private final DivStatePath findCommonPath(List<DivStatePath> pathList, DivStatePath rootPath) {
        int size = pathList.size();
        if (size == 0) {
            return rootPath;
        }
        if (size == 1) {
            return (DivStatePath) CollectionsKt.first((List) pathList);
        }
        Iterator<T> it = pathList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            DivStatePath divStatePath = (DivStatePath) it.next();
            next = DivStatePath.INSTANCE.lowestCommonAncestor$div_release((DivStatePath) next, divStatePath);
            if (next == null) {
                next = rootPath;
            }
        }
        return (DivStatePath) next;
    }
}
