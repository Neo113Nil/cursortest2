package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerPageTransformer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPager2Wrapper.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R.\u00101\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "", "block", "withRecyclerView", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroid/view/View;", "decoratedDimensionGetter", "findMaxChildDimension", "(Lkotlin/jvm/functions/Function2;)I", "child", "addView", "(Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "viewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "isWrapContentAlongCrossAxis$div_release", "()Z", "isWrapContentAlongCrossAxis", "", "getAccessibilityClassName", "()Ljava/lang/String;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageTransformer;", "value", "pageTransformer", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageTransformer;", "getPageTransformer$div_release", "()Lcom/yandex/div/core/view2/divs/pager/DivPagerPageTransformer;", "setPageTransformer$div_release", "(Lcom/yandex/div/core/view2/divs/pager/DivPagerPageTransformer;)V", "getOrientation", "()I", "setOrientation", "(I)V", X3.i.n, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public class ViewPager2Wrapper extends FrameLayout {

    @Nullable
    private DivPagerPageTransformer pageTransformer;

    @NotNull
    private final ViewPager2 viewPager;

    public ViewPager2Wrapper(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public /* synthetic */ ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    @NotNull
    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    @Nullable
    /* renamed from: getPageTransformer$div_release, reason: from getter */
    public final DivPagerPageTransformer getPageTransformer() {
        return this.pageTransformer;
    }

    public final void setPageTransformer$div_release(@Nullable DivPagerPageTransformer divPagerPageTransformer) {
        this.pageTransformer = divPagerPageTransformer;
        getViewPager().setPageTransformer(divPagerPageTransformer);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View child) {
        super.addView(child);
    }

    public final void setRecycledViewPool(@NotNull final RecyclerView.RecycledViewPool viewPool) {
        withRecyclerView(new Function1() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$setRecycledViewPool$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RecyclerView) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull RecyclerView recyclerView) {
                recyclerView.setRecycledViewPool(RecyclerView.RecycledViewPool.this);
            }
        });
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    private final void withRecyclerView(Function1 block) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        block.invoke(recyclerView);
    }

    public final void setOrientation(int i) {
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i && divPagerAdapter != null && divPagerAdapter.getOrientation() == i) {
            return;
        }
        getViewPager().setOrientation(i);
        if (divPagerAdapter != null) {
            divPagerAdapter.setOrientation(i);
        }
        withRecyclerView(new Function1() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$orientation$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RecyclerView) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull RecyclerView recyclerView) {
                recyclerView.getRecycledViewPool().clear();
                for (View view : ViewGroupKt.getChildren(recyclerView)) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                }
            }
        });
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        measureChild(getViewPager(), widthMeasureSpec, heightMeasureSpec);
        int orientation = getOrientation();
        if (orientation == 0) {
            super.onMeasure(widthMeasureSpec, ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.INSTANCE)));
        } else {
            if (orientation != 1) {
                return;
            }
            super.onMeasure(ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.INSTANCE)), heightMeasureSpec);
        }
    }

    public final boolean isWrapContentAlongCrossAxis$div_release() {
        if (getOrientation() == 0 && getLayoutParams().height == -2) {
            return true;
        }
        return getOrientation() == 1 && getLayoutParams().width == -2;
    }

    private final int findMaxChildDimension(final Function2 decoratedDimensionGetter) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        withRecyclerView(new Function1() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$findMaxChildDimension$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RecyclerView) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull RecyclerView recyclerView) {
                Sequence<View> children = ViewGroupKt.getChildren(recyclerView);
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                Function2 function2 = decoratedDimensionGetter;
                for (View view : children) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, ((Number) function2.invoke(layoutManager, view)).intValue());
                    }
                }
            }
        });
        return ref$IntRef.element;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }
}
