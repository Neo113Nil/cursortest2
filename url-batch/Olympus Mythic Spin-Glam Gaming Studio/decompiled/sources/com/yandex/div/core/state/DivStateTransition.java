package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivStateTransition.kt */
@PublicApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/state/DivStateTransition;", "Landroidx/transition/ChangeBounds;", "view", "Landroid/view/View;", "excludeDivView", "", "(Landroid/view/View;Z)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DivStateTransition extends ChangeBounds {
    public DivStateTransition(@NotNull View view) {
        this(view, false, 2, null);
    }

    public /* synthetic */ DivStateTransition(View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? true : z);
    }

    public DivStateTransition(@NotNull View view, final boolean z) {
        DivStateTransitionKt.visit(view, new Function1() { // from class: com.yandex.div.core.state.DivStateTransition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view2) {
                if (view2 instanceof RecyclerView) {
                    DivStateTransition.this.excludeChildren(view2, true);
                } else if (z && (view2 instanceof Div2View)) {
                    DivStateTransition.this.excludeTarget(view2, true);
                }
            }
        });
    }
}
