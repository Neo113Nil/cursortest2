package com.yandex.div.core.view2.state;

import android.view.View;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivMultipleStateSwitcher.kt */
@DivViewScope
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/state/DivMultipleStateSwitcher;", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;)V", "switchStates", "", "state", "Lcom/yandex/div2/DivData$State;", "paths", "", "Lcom/yandex/div/core/state/DivStatePath;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivMultipleStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivMultipleStateSwitcher(@NotNull Div2View div2View, @NotNull DivBinder divBinder) {
        this.divView = div2View;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull DivData.State state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) {
        View childAt = this.divView.getChildAt(0);
        Div div = state.div;
        List<DivStatePath> compactPathList$div_release = DivPathUtils.INSTANCE.compactPathList$div_release(paths);
        ArrayList<DivStatePath> arrayList = new ArrayList();
        for (Object obj : compactPathList$div_release) {
            if (!((DivStatePath) obj).isRootPath()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (DivStatePath divStatePath : arrayList) {
            Pair<DivStateLayout, Div.State> tryFindStateDivAndLayout$div_release = DivPathUtils.INSTANCE.tryFindStateDivAndLayout$div_release(childAt, state, divStatePath, resolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout component1 = tryFindStateDivAndLayout$div_release.component1();
            Div.State component2 = tryFindStateDivAndLayout$div_release.component2();
            if (component1 != null && !linkedHashSet.contains(component1)) {
                DivStatePath path = component1.getPath();
                if (path != null) {
                    divStatePath = path;
                }
                BindingContext bindingContext = component1.getBindingContext();
                if (bindingContext == null) {
                    bindingContext = this.divView.getBindingContext();
                }
                this.divBinder.bind(bindingContext, component1, component2, divStatePath.parentState());
                linkedHashSet.add(component1);
            }
        }
        if (linkedHashSet.isEmpty()) {
            this.divBinder.bind(this.divView.getBindingContext(), childAt, div, DivStatePath.INSTANCE.fromState$div_release(state));
        }
        this.divBinder.attachIndicators$div_release();
    }
}
