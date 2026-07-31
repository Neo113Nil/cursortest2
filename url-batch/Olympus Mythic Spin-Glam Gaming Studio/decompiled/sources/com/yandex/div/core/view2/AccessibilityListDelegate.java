package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002,-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\f\u0010*\u001a\u00020\u001b*\u00020\u0014H\u0002J\f\u0010+\u001a\u00020\u001b*\u00020\u0013H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0013*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate;", "recyclerView", "Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "(Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;)V", "value", "", "isItemsFocusActive", "setItemsFocusActive", "(Z)V", "itemDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "list", "Ljava/util/ArrayList;", "Lcom/yandex/div/core/view2/AccessibilityListDelegate$ViewAccessibilityState;", "Lkotlin/collections/ArrayList;", "visibilityListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "firstChild", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getFirstChild", "(Landroid/view/ViewGroup;)Landroid/view/View;", "unwrap", "getUnwrap", "(Landroid/view/View;)Landroid/view/View;", "clearItemsFocus", "", "focusChildren", "focusContainer", "getItemDelegate", "onBackPressed", "onInitializeAccessibilityNodeInfo", "host", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "performAccessibilityAction", "action", "", "args", "Landroid/os/Bundle;", "restoreAccessibilityState", "makeInaccessibleAllOtherViews", "updateItemAccessibility", "ItemAccessibilityDelegate", "ViewAccessibilityState", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AccessibilityListDelegate extends RecyclerViewAccessibilityDelegate {
    private boolean isItemsFocusActive;

    @Nullable
    private AccessibilityDelegateCompat itemDelegate;

    @NotNull
    private final ArrayList<ViewAccessibilityState> list;

    @NotNull
    private final BackHandlingRecyclerView recyclerView;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener visibilityListener;

    public AccessibilityListDelegate(@NotNull BackHandlingRecyclerView backHandlingRecyclerView) {
        super(backHandlingRecyclerView);
        this.recyclerView = backHandlingRecyclerView;
        this.list = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AccessibilityListDelegate.visibilityListener$lambda$0(AccessibilityListDelegate.this);
            }
        };
        this.visibilityListener = onGlobalLayoutListener;
        if (backHandlingRecyclerView.isAttachedToWindow()) {
            backHandlingRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        backHandlingRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
                AccessibilityListDelegate.this.clearItemsFocus();
            }
        });
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
        this.recyclerView.setOnBackClickListener(new BackKeyPressedHelper.OnBackClickListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.3
            @Override // com.yandex.div.core.view2.backbutton.BackKeyPressedHelper.OnBackClickListener
            public boolean onBackClick() {
                return AccessibilityListDelegate.this.onBackPressed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void visibilityListener$lambda$0(AccessibilityListDelegate accessibilityListDelegate) {
        if (!accessibilityListDelegate.isItemsFocusActive || accessibilityListDelegate.recyclerView.getVisibility() == 0) {
            return;
        }
        accessibilityListDelegate.clearItemsFocus();
    }

    private final void setItemsFocusActive(boolean z) {
        if (this.isItemsFocusActive == z) {
            return;
        }
        this.isItemsFocusActive = z;
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    @NotNull
    public AccessibilityDelegateCompat getItemDelegate() {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.itemDelegate;
        if (accessibilityDelegateCompat != null) {
            return accessibilityDelegateCompat;
        }
        ItemAccessibilityDelegate itemAccessibilityDelegate = new ItemAccessibilityDelegate();
        this.itemDelegate = itemAccessibilityDelegate;
        return itemAccessibilityDelegate;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        String qualifiedName;
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (this.isItemsFocusActive) {
            qualifiedName = Reflection.getOrCreateKotlinClass(RecyclerView.class).getQualifiedName();
        } else {
            qualifiedName = Reflection.getOrCreateKotlinClass(Button.class).getQualifiedName();
        }
        info.setClassName(qualifiedName);
        info.addAction(16);
        info.setClickable(true);
        info.setImportantForAccessibility(true);
        info.setScreenReaderFocusable(true);
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(@NotNull View host, int action, @Nullable Bundle args) {
        boolean z;
        if (action == 16) {
            focusChildren();
            z = true;
        } else {
            z = false;
        }
        return super.performAccessibilityAction(host, action, args) || z;
    }

    private final void focusChildren() {
        setItemsFocusActive(true);
        makeInaccessibleAllOtherViews(this.recyclerView);
        View firstChild = getFirstChild(this.recyclerView);
        View unwrap = firstChild != null ? getUnwrap(firstChild) : null;
        if (unwrap != null) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(unwrap);
        }
    }

    private final void focusContainer() {
        BaseDivViewExtensionsKt.gainAccessibilityFocus(this.recyclerView);
        clearItemsFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearItemsFocus() {
        setItemsFocusActive(false);
        restoreAccessibilityState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onBackPressed() {
        if (!this.isItemsFocusActive) {
            return false;
        }
        focusContainer();
        return true;
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate$ItemAccessibilityDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate$ItemDelegate;", "(Lcom/yandex/div/core/view2/AccessibilityListDelegate;)V", "onInitializeAccessibilityNodeInfo", "", "host", "Landroid/view/View;", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ItemAccessibilityDelegate extends RecyclerViewAccessibilityDelegate.ItemDelegate {
        public ItemAccessibilityDelegate() {
            super(AccessibilityListDelegate.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.setClassName(Reflection.getOrCreateKotlinClass(Button.class).getQualifiedName());
            AccessibilityListDelegate.this.updateItemAccessibility(host);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemAccessibility(View view) {
        view.setImportantForAccessibility(this.isItemsFocusActive ? 1 : 4);
    }

    private final void makeInaccessibleAllOtherViews(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || Intrinsics.areEqual(viewGroup, viewGroup2.getRootView())) {
            return;
        }
        for (View view : ViewGroupKt.getChildren(viewGroup2)) {
            if (!Intrinsics.areEqual(view, viewGroup) && view.getImportantForAccessibility() != 4) {
                this.list.add(new ViewAccessibilityState(new WeakReference(view), view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
        makeInaccessibleAllOtherViews(viewGroup2);
    }

    private final void restoreAccessibilityState() {
        for (ViewAccessibilityState viewAccessibilityState : this.list) {
            View view = viewAccessibilityState.getView().get();
            if (view != null) {
                view.setImportantForAccessibility(viewAccessibilityState.getAccessibilityState());
            }
        }
        this.list.clear();
    }

    private final View getUnwrap(View view) {
        View child;
        return (!(view instanceof DivViewWrapper) || (child = ((DivViewWrapper) view).getChild()) == null) ? view : child;
    }

    private final View getFirstChild(ViewGroup viewGroup) {
        return (View) SequencesKt.minWithOrNull(ViewGroupKt.getChildren(viewGroup), ComparisonsKt.compareBy(AccessibilityListDelegate$firstChild$1.INSTANCE, AccessibilityListDelegate$firstChild$2.INSTANCE));
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate$ViewAccessibilityState;", "", "view", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "accessibilityState", "", "(Ljava/lang/ref/WeakReference;I)V", "getAccessibilityState", "()I", "getView", "()Ljava/lang/ref/WeakReference;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ViewAccessibilityState {
        private final int accessibilityState;

        @NotNull
        private final WeakReference<View> view;

        public ViewAccessibilityState(@NotNull WeakReference<View> weakReference, int i) {
            this.view = weakReference;
            this.accessibilityState = i;
        }

        public final int getAccessibilityState() {
            return this.accessibilityState;
        }

        @NotNull
        public final WeakReference<View> getView() {
            return this.view;
        }
    }
}
