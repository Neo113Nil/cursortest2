package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewPager2Wrapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class ViewPager2Wrapper$onMeasure$maxWidth$1 extends FunctionReferenceImpl implements Function2 {
    public static final ViewPager2Wrapper$onMeasure$maxWidth$1 INSTANCE = new ViewPager2Wrapper$onMeasure$maxWidth$1();

    ViewPager2Wrapper$onMeasure$maxWidth$1() {
        super(2, RecyclerView.LayoutManager.class, "getDecoratedMeasuredWidth", "getDecoratedMeasuredWidth(Landroid/view/View;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View view) {
        return Integer.valueOf(layoutManager.getDecoratedMeasuredWidth(view));
    }
}
