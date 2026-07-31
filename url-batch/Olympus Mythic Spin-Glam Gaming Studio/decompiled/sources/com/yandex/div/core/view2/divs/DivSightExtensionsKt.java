package com.yandex.div.core.view2.divs;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivSightAction;
import com.yandex.div2.DivVisibilityAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivSightExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {IronSourceConstants.EVENTS_DURATION, "Lcom/yandex/div/json/expressions/Expression;", "", "Lcom/yandex/div2/DivSightAction;", "getDuration", "(Lcom/yandex/div2/DivSightAction;)Lcom/yandex/div/json/expressions/Expression;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivSightExtensionsKt {
    @NotNull
    public static final Expression<Long> getDuration(@NotNull DivSightAction divSightAction) {
        if (divSightAction instanceof DivVisibilityAction) {
            return ((DivVisibilityAction) divSightAction).visibilityDuration;
        }
        if (divSightAction instanceof DivDisappearAction) {
            return ((DivDisappearAction) divSightAction).disappearDuration;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Trying to get duration field for unsupported DivSightAction class");
        }
        return Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    }
}
