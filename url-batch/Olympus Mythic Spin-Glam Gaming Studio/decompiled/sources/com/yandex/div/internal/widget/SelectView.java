package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ListPopupWindow;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.O6;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0014J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0014J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0014J\u0014\u0010&\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/yandex/div/internal/widget/SelectView;", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "focusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getFocusTracker", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "setFocusTracker", "(Lcom/yandex/div/core/view2/reuse/InputFocusTracker;)V", "onItemSelectedListener", "Lkotlin/Function1;", "", "", "getOnItemSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "popupWindow", "Lcom/yandex/div/internal/widget/SelectView$PopupWindow;", "getAccessibilityClassName", "", "onDetachedFromWindow", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "onLayout", "changed", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onVisibilityChanged", "changedView", "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setItems", "items", "", "PopupWindow", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SelectView extends EllipsizedTextView {

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private Function1 onItemSelectedListener;

    @SuppressLint({"RestrictedApi"})
    @NotNull
    private final PopupWindow popupWindow;

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, com.yandex.div.internal.widget.SuperLineHeightTextView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public SelectView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.SelectView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectView._init_$lambda$1(SelectView.this, view);
            }
        });
        final PopupWindow popupWindow = new PopupWindow(context, null, 0, 6, null);
        popupWindow.setModal(true);
        popupWindow.setAnchorView(this);
        popupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.SelectView$$ExternalSyntheticLambda1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SelectView.popupWindow$lambda$3$lambda$2(SelectView.this, popupWindow, adapterView, view, i, j);
            }
        });
        popupWindow.setOverlapAnchor(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setAdapter(popupWindow.getAdapter());
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SelectView selectView, View view) {
        InputFocusTracker inputFocusTracker = selectView.focusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(selectView, inputFocusTracker);
        }
        selectView.popupWindow.resetPosition();
        selectView.popupWindow.show();
    }

    @Nullable
    public final Function1 getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    public final void setOnItemSelectedListener(@Nullable Function1 function1) {
        this.onItemSelectedListener = function1;
    }

    @Nullable
    public final InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    public final void setFocusTracker(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupWindow$lambda$3$lambda$2(SelectView selectView, PopupWindow popupWindow, AdapterView adapterView, View view, int i, long j) {
        selectView.sendAccessibilityEvent(4);
        Function1 function1 = selectView.onItemSelectedListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        popupWindow.dismiss();
    }

    public final void setItems(@NotNull List<String> items) {
        this.popupWindow.getAdapter().setItems(items);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed && this.popupWindow.isShowing()) {
            this.popupWindow.show();
        }
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.popupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0 || !this.popupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setCanOpenPopup(true);
        info.setText(getText());
    }

    @Override // android.widget.TextView, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "android.widget.Spinner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\t\u001a\u00060\nR\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/internal/widget/SelectView$PopupWindow;", "Landroidx/appcompat/widget/ListPopupWindow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", O6.G1, "Lcom/yandex/div/internal/widget/SelectView$PopupWindow$PopupAdapter;", "getAdapter", "()Lcom/yandex/div/internal/widget/SelectView$PopupWindow$PopupAdapter;", "getInputMethodMode", "resetPosition", "", "show", "PopupAdapter", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static class PopupWindow extends ListPopupWindow {

        @NotNull
        private final PopupAdapter adapter;

        @NotNull
        private final Context context;

        public PopupWindow(@NotNull Context context) {
            this(context, null, 0, 6, null);
        }

        public PopupWindow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
        }

        public int getInputMethodMode() {
            return 1;
        }

        public /* synthetic */ PopupWindow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.listPopupWindowStyle : i);
        }

        public PopupWindow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.context = context;
            this.adapter = new PopupAdapter();
        }

        @NotNull
        public PopupAdapter getAdapter() {
            return this.adapter;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.view.menu.ShowableListMenu
        public void show() {
            if (getListView() == null) {
                super.show();
                ListView listView = getListView();
                if (listView != null) {
                    listView.setChoiceMode(1);
                }
            }
            super.show();
        }

        public void resetPosition() {
            ListView listView = getListView();
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            }
        }

        /* compiled from: SelectView.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\tH\u0016J$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/widget/SelectView$PopupWindow$PopupAdapter;", "Landroid/widget/BaseAdapter;", "(Lcom/yandex/div/internal/widget/SelectView$PopupWindow;)V", "items", "", "", "createView", "Landroid/widget/TextView;", "getCount", "", "getItem", X3.i.L, "getItemId", "", "getView", "convertView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "setItems", "", "newItems", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class PopupAdapter extends BaseAdapter {

            @NotNull
            private List<String> items = CollectionsKt.emptyList();

            @Override // android.widget.Adapter
            public long getItemId(int position) {
                return position;
            }

            public PopupAdapter() {
            }

            public final void setItems(@NotNull List<String> newItems) {
                this.items = newItems;
                notifyDataSetChanged();
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.items.size();
            }

            @Override // android.widget.Adapter
            @NotNull
            public String getItem(int position) {
                return this.items.get(position);
            }

            @Override // android.widget.Adapter
            @NotNull
            public TextView getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                if (convertView == null) {
                    convertView = createView();
                }
                Intrinsics.checkNotNull(convertView, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) convertView;
                textView.setText(getItem(position));
                return textView;
            }

            private final TextView createView() {
                TextView textView = new TextView(PopupWindow.this.context, null, android.R.attr.spinnerDropDownItemStyle);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, BaseDivViewExtensionsKt.dpToPx(48, textView.getResources().getDisplayMetrics())));
                textView.setTextAlignment(5);
                return textView;
            }
        }
    }
}
