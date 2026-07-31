package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTransitionHandler.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\fH\u0002J\u001e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\fJ\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c*\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "", "divView", "Lcom/yandex/div/core/view2/Div2View;", "(Lcom/yandex/div/core/view2/Div2View;)V", "activeTransitions", "", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$TransitionData;", "pendingTransitions", "posted", "", "beginDelayedTransitions", "", "root", "Landroid/view/ViewGroup;", "endTransitions", "getLastChange", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "target", "Landroid/view/View;", "postTransitions", "putTransition", "transition", "Landroidx/transition/Transition;", "view", "changeType", "runTransitions", "getChange", "", "ChangeType", "TransitionData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivTransitionHandler {

    @NotNull
    private final Div2View divView;
    private boolean posted;

    @NotNull
    private List<TransitionData> pendingTransitions = new ArrayList();

    @NotNull
    private List<TransitionData> activeTransitions = new ArrayList();

    public DivTransitionHandler(@NotNull Div2View div2View) {
        this.divView = div2View;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new Runnable() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DivTransitionHandler.postTransitions$lambda$0(DivTransitionHandler.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler divTransitionHandler) {
        if (divTransitionHandler.posted) {
            beginDelayedTransitions$default(divTransitionHandler, null, false, 3, null);
        }
        divTransitionHandler.posted = false;
    }

    public final void runTransitions() {
        runTransitions(this.divView, true);
    }

    public final void runTransitions(@NotNull ViewGroup root, boolean endTransitions) {
        this.posted = false;
        beginDelayedTransitions(root, endTransitions);
    }

    public final void putTransition(@NotNull Transition transition, @NotNull View view, @NotNull ChangeType.Visibility changeType) {
        this.pendingTransitions.add(new TransitionData(transition, view, CollectionsKt.mutableListOf(changeType), new ArrayList()));
        postTransitions();
    }

    @Nullable
    public final ChangeType.Visibility getLastChange(@NotNull View target) {
        ChangeType.Visibility visibility = (ChangeType.Visibility) CollectionsKt.lastOrNull(getChange(this.pendingTransitions, target));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) CollectionsKt.lastOrNull(getChange(this.activeTransitions, target));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = Intrinsics.areEqual(transitionData.getTarget(), view) ? (ChangeType.Visibility) CollectionsKt.lastOrNull(transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z);
    }

    private final void beginDelayedTransitions(ViewGroup root, boolean endTransitions) {
        if (!root.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (endTransitions) {
            TransitionManager.endTransitions(root);
        }
        final TransitionSet transitionSet = new TransitionSet();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(((TransitionData) it.next()).getTransition());
        }
        transitionSet.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionEnd(@NonNull Transition transition, boolean z) {
                super.onTransitionEnd(transition, z);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionStart(@NonNull Transition transition, boolean z) {
                super.onTransitionStart(transition, z);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                List list;
                list = this.activeTransitions;
                list.clear();
                Transition.this.removeListener(this);
            }
        });
        TransitionManager.beginDelayedTransition(root, transitionSet);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivTransitionHandler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$TransitionData;", "", "transition", "Landroidx/transition/Transition;", "target", "Landroid/view/View;", "changes", "", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "savedChanges", "(Landroidx/transition/Transition;Landroid/view/View;Ljava/util/List;Ljava/util/List;)V", "getChanges", "()Ljava/util/List;", "getSavedChanges", "getTarget", "()Landroid/view/View;", "getTransition", "()Landroidx/transition/Transition;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionData {

        @NotNull
        private final List<ChangeType.Visibility> changes;

        @NotNull
        private final List<ChangeType.Visibility> savedChanges;

        @NotNull
        private final View target;

        @NotNull
        private final Transition transition;

        public TransitionData(@NotNull Transition transition, @NotNull View view, @NotNull List<ChangeType.Visibility> list, @NotNull List<ChangeType.Visibility> list2) {
            this.transition = transition;
            this.target = view;
            this.changes = list;
            this.savedChanges = list2;
        }

        @NotNull
        public final Transition getTransition() {
            return this.transition;
        }

        @NotNull
        public final View getTarget() {
            return this.target;
        }

        @NotNull
        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        @NotNull
        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }
    }

    /* compiled from: DivTransitionHandler.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "", "()V", "apply", "", "view", "Landroid/view/View;", "Visibility", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ChangeType {
        public /* synthetic */ ChangeType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void apply(@NotNull View view);

        private ChangeType() {
        }

        /* compiled from: DivTransitionHandler.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "new", "", "(I)V", "getNew", "()I", "apply", "", "view", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Visibility extends ChangeType {
            private final int new;

            public Visibility(int i) {
                super(null);
                this.new = i;
            }

            public final int getNew() {
                return this.new;
            }

            @Override // com.yandex.div.core.view2.animations.DivTransitionHandler.ChangeType
            public void apply(@NotNull View view) {
                view.setVisibility(this.new);
            }
        }
    }
}
