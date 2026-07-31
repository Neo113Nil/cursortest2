package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a6\u0010\f\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0002\u001a8\u0010\f\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0002\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\tH\u0002\u001a\f\u0010\u0015\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\u001d\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"captureFocusIfNeeded", "", "Landroid/view/View;", "captureFocusOnAction", "Lcom/yandex/div/json/expressions/Expression;", "", "inputFocusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "clearFocusIfNeeded", "isPenetratingLongClickable", "observe", "resolver", "callback", "Lkotlin/Function1;", "", "actions", "", "Lcom/yandex/div2/DivAction;", "onlyEnabled", "parentIsLongClickable", "setPenetratingLongClickable", "longClickable", "(Landroid/view/View;Ljava/lang/Boolean;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivActionBinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, List<DivAction> list, ExpressionResolver expressionResolver, Function1 function1) {
        if ((view instanceof ExpressionSubscriber) && list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ExpressionSubscriber) view).addSubscription(((DivAction) it.next()).isEnabled.observe(expressionResolver, function1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, Expression<Boolean> expression, ExpressionResolver expressionResolver, Function1 function1) {
        if (view instanceof ExpressionSubscriber) {
            ((ExpressionSubscriber) view).addSubscription(expression.observe(expressionResolver, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivAction> onlyEnabled(List<DivAction> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((DivAction) obj).isEnabled.evaluate(expressionResolver)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parentIsLongClickable(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return isPenetratingLongClickable(viewGroup) || parentIsLongClickable(viewGroup);
    }

    private static final boolean isPenetratingLongClickable(View view) {
        Object tag = view.getTag(R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    static /* synthetic */ void setPenetratingLongClickable$default(View view, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        setPenetratingLongClickable(view, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPenetratingLongClickable(View view, Boolean bool) {
        SpecialsBridge.yandexViewSetTag(view, R.id.div_penetrating_longtap_tag, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
            view.requestFocus();
        }
    }
}
