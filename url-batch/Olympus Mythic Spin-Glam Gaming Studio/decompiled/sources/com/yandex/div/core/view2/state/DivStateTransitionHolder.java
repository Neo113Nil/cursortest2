package com.yandex.div.core.view2.state;

import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.Transition;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.TransitionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateTransitionHolder.kt */
@DivViewScope
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;", "", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "(Lcom/yandex/div/core/view2/Div2View;)V", "cleanScheduled", "", "transitions", "", "Landroidx/transition/Transition;", "append", "", "transition", "clear", "enumerateTargetIds", "", "", "scheduleClean", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class DivStateTransitionHolder {
    private boolean cleanScheduled;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final List<Transition> transitions = new ArrayList();

    public DivStateTransitionHolder(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    public void append(@NotNull Transition transition) {
        this.transitions.add(transition);
        scheduleClean();
    }

    public void clear() {
        this.transitions.clear();
    }

    private void scheduleClean() {
        if (this.cleanScheduled) {
            return;
        }
        final Div2View div2View = this.div2View;
        OneShotPreDrawListener.add(div2View, new Runnable() { // from class: com.yandex.div.core.view2.state.DivStateTransitionHolder$scheduleClean$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.clear();
            }
        });
        this.cleanScheduled = true;
    }

    @NotNull
    public List<Integer> enumerateTargetIds() {
        List<Transition> list = this.transitions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, TransitionsKt.enumerateTargetIds((Transition) it.next()));
        }
        return arrayList;
    }
}
