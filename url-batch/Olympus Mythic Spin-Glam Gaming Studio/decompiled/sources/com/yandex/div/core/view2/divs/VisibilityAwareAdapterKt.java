package com.yandex.div.core.view2.divs;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4643f8;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivVisibility;
import kotlin.Metadata;

/* compiled from: VisibilityAwareAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {C4643f8.k, "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)Z", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "Lcom/yandex/div2/DivVisibility;", "getVisibility", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)Lcom/yandex/div2/DivVisibility;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VisibilityAwareAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVisibility getVisibility(DivItemBuilderResult divItemBuilderResult) {
        return (DivVisibility) divItemBuilderResult.getDiv().value().getVisibility().evaluate(divItemBuilderResult.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(DivItemBuilderResult divItemBuilderResult) {
        return getVisibility(divItemBuilderResult) == DivVisibility.VISIBLE;
    }
}
