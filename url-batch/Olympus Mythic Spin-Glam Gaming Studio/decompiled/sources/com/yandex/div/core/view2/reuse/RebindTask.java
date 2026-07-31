package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RebindTask.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 82\u00020\u0001:\u000289B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ \u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0013H\u0002J\u0018\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0013H\u0002J&\u0010/\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020\u00182\u0006\u00100\u001a\u000201H\u0003J\u0018\u00103\u001a\u00020(2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006:"}, d2 = {"Lcom/yandex/div/core/view2/reuse/RebindTask;", "", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "oldResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "newResolver", "reporter", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;)V", "aloneExisting", "", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "aloneIds", "", "", "aloneNew", "Lcom/yandex/div/core/view2/reuse/NewToken;", "bindingPoints", "", "idsToBind", "rebindInProgress", "", "getRebindInProgress", "()Z", "setRebindInProgress", "(Z)V", "reusableList", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "getReusableList", "()Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "calculateDiff", "oldDivData", "Lcom/yandex/div2/DivData;", "newDivData", "rootView", "Landroid/view/ViewGroup;", "clear", "", "doNodeInExistingMode", "token", "doNodeInNewMode", "newToken", "doNodeInSameMode", "existingToken", "prepareAndRebind", "path", "Lcom/yandex/div/core/state/DivStatePath;", "rebind", "releaseIfNecessary", "div", "Lcom/yandex/div2/Div;", "view", "Landroid/view/View;", "Companion", "UnsupportedElementException", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RebindTask {

    @NotNull
    public static final String TAG = "RebindTask";

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final ExpressionResolver newResolver;

    @NotNull
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;

    @NotNull
    private final ComplexRebindReporter reporter;

    @NotNull
    private final Set<ExistingToken> bindingPoints = new LinkedHashSet();

    @NotNull
    private final List<ExistingToken> idsToBind = new ArrayList();

    @NotNull
    private final List<ExistingToken> aloneExisting = new ArrayList();

    @NotNull
    private final List<NewToken> aloneNew = new ArrayList();

    @NotNull
    private final Map<String, ExistingToken> aloneIds = new LinkedHashMap();

    @NotNull
    private final ReusableTokenList reusableList = new ReusableTokenList();

    public RebindTask(@NotNull Div2View div2View, @NotNull DivBinder divBinder, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2, @NotNull ComplexRebindReporter complexRebindReporter) {
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = expressionResolver;
        this.newResolver = expressionResolver2;
        this.reporter = complexRebindReporter;
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    public final void setRebindInProgress(boolean z) {
        this.rebindInProgress = z;
    }

    @NotNull
    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public final boolean prepareAndRebind(@NotNull DivData oldDivData, @NotNull DivData newDivData, @NotNull ViewGroup rootView, @NotNull DivStatePath path) {
        boolean z;
        clear();
        this.rebindInProgress = true;
        try {
            z = calculateDiff(oldDivData, newDivData, rootView);
        } catch (UnsupportedElementException e) {
            this.reporter.onComplexRebindUnsupportedElementException(e);
            z = false;
        }
        if (z) {
            return rebind(path);
        }
        return false;
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    private final boolean calculateDiff(DivData oldDivData, DivData newDivData, ViewGroup rootView) {
        Div div;
        Div div2;
        DivData.State stateToBind = this.div2View.stateToBind(oldDivData);
        if (stateToBind == null || (div = stateToBind.div) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(div, this.oldResolver), 0, rootView, null);
        DivData.State stateToBind2 = this.div2View.stateToBind(newDivData);
        if (stateToBind2 == null || (div2 = stateToBind2.div) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(div2, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object obj;
        ExistingToken combineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(combineTokens);
        List mutableList = CollectionsKt.toMutableList((Collection) newToken.getChildrenTokens());
        ArrayList arrayList = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(combineTokens)) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((NewToken) obj).isCombinable(existingToken2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NewToken newToken2 = (NewToken) obj;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                mutableList.remove(newToken2);
            } else {
                arrayList.add(existingToken2);
            }
        }
        if (mutableList.size() != arrayList.size()) {
            this.bindingPoints.add(combineTokens);
        } else {
            this.reusableList.add(combineTokens);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            doNodeInExistingMode((ExistingToken) it2.next());
        }
        Iterator it3 = mutableList.iterator();
        while (it3.hasNext()) {
            doNodeInNewMode((NewToken) it3.next());
        }
    }

    private final void doNodeInExistingMode(ExistingToken token) {
        String id = token.getDiv().value().getId();
        if (id != null) {
            this.aloneIds.put(id, token);
        } else {
            this.aloneExisting.add(token);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(token, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object obj;
        Iterator<T> it = this.aloneExisting.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ExistingToken) obj).isCombinable(newToken)) {
                    break;
                }
            }
        }
        ExistingToken existingToken = (ExistingToken) obj;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id = newToken.getDiv().value().getId();
        ExistingToken existingToken2 = id != null ? this.aloneIds.get(id) : null;
        if (id != null && existingToken2 != null && Intrinsics.areEqual(existingToken2.getDiv().getClass(), newToken.getDiv().getClass()) && DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().value(), newToken.getDiv().value(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneIds.remove(id);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        } else {
            this.aloneNew.add(newToken);
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    @MainThread
    private final boolean rebind(DivStatePath path) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), path);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!CollectionsKt.contains(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), path);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(Div div, View view) {
        if (div instanceof Div.Custom ? true : div instanceof Div.Video) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    /* compiled from: RebindTask.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/reuse/RebindTask$UnsupportedElementException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "message", "", "getMessage", "()Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsupportedElementException extends IllegalArgumentException {

        @NotNull
        private final String message;

        public UnsupportedElementException(@NotNull Class<?> cls) {
            this.message = cls + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }
    }
}
