package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import java.util.List;

/* compiled from: DivAnimatorBase.kt */
/* loaded from: classes15.dex */
public interface DivAnimatorBase {
    List getCancelActions();

    Expression getDirection();

    Expression getDuration();

    List getEndActions();

    String getId();

    Expression getInterpolator();

    DivCount getRepeatCount();

    Expression getStartDelay();
}
