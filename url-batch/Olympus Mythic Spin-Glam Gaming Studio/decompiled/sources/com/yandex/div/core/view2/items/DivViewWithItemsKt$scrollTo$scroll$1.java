package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivViewWithItems.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$1 extends FunctionReferenceImpl implements Function2 {
    DivViewWithItemsKt$scrollTo$scroll$1(Object obj) {
        super(2, obj, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ((RecyclerView) this.receiver).smoothScrollBy(i, i2);
    }
}
