package com.yandex.div.internal.widget;

import android.view.View;
import androidx.core.view.ViewKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransientView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/internal/widget/TransientViewMixin;", "Lcom/yandex/div/internal/widget/TransientView;", "()V", "isTransient", "", "()Z", "transitionCount", "", "invalidateView", "", "view", "Landroid/view/View;", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransientViewMixin implements TransientView {
    private int transitionCount;

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        int i = this.transitionCount + 1;
        this.transitionCount = i;
        if (i == 1) {
            invalidateView(view);
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        int i = this.transitionCount;
        if (i > 0) {
            int i2 = i - 1;
            this.transitionCount = i2;
            if (i2 == 0) {
                invalidateView(view);
            }
        }
    }

    private final void invalidateView(View view) {
        view.invalidate();
        Sequence filter = SequencesKt.filter(ViewKt.getAllViews(view), new Function1() { // from class: com.yandex.div.internal.widget.TransientViewMixin$invalidateView$$inlined$filterIsInstance$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                return Boolean.valueOf(obj instanceof DivBorderSupports);
            }
        });
        Intrinsics.checkNotNull(filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = filter.iterator();
        while (it.hasNext()) {
            ((DivBorderSupports) it.next()).invalidateBorder();
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.transitionCount != 0;
    }
}
