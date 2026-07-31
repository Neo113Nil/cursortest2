package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import java.util.List;

/* loaded from: classes10.dex */
public class TabTitlesLayoutView<ACTION> extends BaseIndicatorTabLayout implements BaseDivTabbedCardUi.AbstractTabBar<ACTION> {
    private static final String FACTORY_TAG_TAB_HEADER = "TabTitlesLayoutView.TAB_HEADER";

    @Nullable
    private List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> mDataList;

    @NonNull
    private final PseudoViewPool mDefaultViewPool;

    @Nullable
    private BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> mHost;

    @Nullable
    private OnScrollChangedListener mOnScrollChangedListener;
    private boolean mShouldDispatchScroll;

    @NonNull
    private String mTabHeaderTag;

    @Nullable
    private DivTabs.TabTitleStyle mTabTitleStyle;

    @NonNull
    private ViewPool mViewPool;

    public interface OnScrollChangedListener {
        void onScrolled();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Yandex|SafeDK: Execution> Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.y, this, motionEvent);
        return safedk_TabTitlesLayoutView_dispatchTouchEvent_fb02576731bd7758b43f8e3fc02946a6(motionEvent);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setIntermediateState(int i, float f) {
    }

    public TabTitlesLayoutView(Context context) {
        this(context, null, 0);
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldDispatchScroll = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new BaseIndicatorTabLayout.OnTabSelectedListener() { // from class: com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.1
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabUnselected(BaseIndicatorTabLayout.Tab tab) {
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabSelected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                TabTitlesLayoutView.this.mHost.setCurrentPage(tab.getPosition(), false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabReselected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                int position = tab.getPosition();
                if (TabTitlesLayoutView.this.mDataList != null) {
                    BaseDivTabbedCardUi.Input.TabBase tabBase = (BaseDivTabbedCardUi.Input.TabBase) TabTitlesLayoutView.this.mDataList.get(position);
                    Object actionable = tabBase == null ? null : tabBase.getActionable();
                    if (actionable != null) {
                        TabTitlesLayoutView.this.mHost.onActiveTabClicked(actionable, position);
                    }
                }
            }
        });
        PseudoViewPool pseudoViewPool = new PseudoViewPool();
        this.mDefaultViewPool = pseudoViewPool;
        pseudoViewPool.register(FACTORY_TAG_TAB_HEADER, new TabViewFactory(getContext()), 0);
        this.mViewPool = pseudoViewPool;
        this.mTabHeaderTag = FACTORY_TAG_TAB_HEADER;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setViewPool(@NonNull ViewPool viewPool, @NonNull String str) {
        this.mViewPool = viewPool;
        this.mTabHeaderTag = str;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    protected TabView createTabView(@NonNull Context context) {
        return (TabView) this.mViewPool.obtain(this.mTabHeaderTag);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setHost(@NonNull BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> host) {
        this.mHost = host;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setData(@NonNull List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> list, int i, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        this.mDataList = list;
        removeAllTabs();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i2 = 0;
        while (i2 < size) {
            BaseIndicatorTabLayout.Tab text = newTab().setText(list.get(i2).getTitle());
            observeTabTitleStyle(text.getTabView(), expressionResolver, expressionSubscriber);
            addTab(text, i2 == i);
            i2++;
        }
    }

    private void observeTabTitleStyle(TabView tabView, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivTabs.TabTitleStyle tabTitleStyle = this.mTabTitleStyle;
        if (tabTitleStyle == null) {
            return;
        }
        DivTabsBinderKt.observeStyle(tabView, tabTitleStyle, expressionResolver, expressionSubscriber);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void manuallyScroll(int i) {
        selectTab(i);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void fixScrollPosition(int i) {
        selectTab(i);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setTabColors(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        setTabTextColors(i3, i);
        setSelectedTabIndicatorColor(i2);
        setTabBackgroundColor(i4);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    @Nullable
    public ViewPager.OnPageChangeListener getCustomPageChangeListener() {
        BaseIndicatorTabLayout.TabLayoutOnPageChangeListener pageChangeListener = getPageChangeListener();
        pageChangeListener.reset();
        return pageChangeListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void resetScroll() {
        scrollTo(0, 0);
        manuallyScroll(0);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangedListener onScrollChangedListener = this.mOnScrollChangedListener;
        if (onScrollChangedListener == null || !this.mShouldDispatchScroll) {
            return;
        }
        onScrollChangedListener.onScrolled();
        this.mShouldDispatchScroll = false;
    }

    public boolean safedk_TabTitlesLayoutView_dispatchTouchEvent_fb02576731bd7758b43f8e3fc02946a6(MotionEvent p0) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(p0);
        if (p0.getAction() == 0) {
            this.mShouldDispatchScroll = true;
        }
        return dispatchTouchEvent;
    }

    public void setOnScrollChangedListener(@Nullable OnScrollChangedListener onScrollChangedListener) {
        this.mOnScrollChangedListener = onScrollChangedListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        bindTypefaceProvider(divTypefaceProvider);
    }

    public void setTabTitleStyle(@Nullable DivTabs.TabTitleStyle tabTitleStyle) {
        this.mTabTitleStyle = tabTitleStyle;
    }

    public static class TabViewFactory implements ViewFactory<TabView> {

        @NonNull
        private final Context mContext;

        public TabViewFactory(@NonNull Context context) {
            this.mContext = context;
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NonNull
        public TabView createView() {
            return new TabView(this.mContext);
        }
    }
}
