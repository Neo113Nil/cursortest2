package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Releasables.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\" \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"INDEX_EXPRESSION_SUBSCRIBER", "", "expressionSubscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Landroid/view/View;", "getExpressionSubscriber", "(Landroid/view/View;)Lcom/yandex/div/internal/core/ExpressionSubscriber;", "releasableList", "", "Lcom/yandex/div/core/view2/Releasable;", "getReleasableList", "(Landroid/view/View;)Ljava/lang/Iterable;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReleasablesKt {
    private static final int INDEX_EXPRESSION_SUBSCRIBER = 0;

    @Nullable
    public static final Iterable<Releasable> getReleasableList(@NotNull View view) {
        Object tag = view.getTag(R.id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat != null) {
            return SparseArraysKt.toIterable(sparseArrayCompat);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ExpressionSubscriber getExpressionSubscriber(@NotNull View view) {
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            SpecialsBridge.yandexViewSetTag(view, R.id.div_releasable_list, sparseArrayCompat);
        }
        Object obj = sparseArrayCompat.get(0);
        ExpressionSubscriber expressionSubscriber = obj instanceof ExpressionSubscriber ? (ExpressionSubscriber) obj : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        sparseArrayCompat.put(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }
}
