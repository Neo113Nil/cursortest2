package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import java.util.List;

/* compiled from: DivBase.kt */
/* loaded from: classes5.dex */
public interface DivBase {
    DivAccessibility getAccessibility();

    Expression getAlignmentHorizontal();

    Expression getAlignmentVertical();

    Expression getAlpha();

    List getAnimators();

    List getBackground();

    DivBorder getBorder();

    Expression getColumnSpan();

    List getDisappearActions();

    List getExtensions();

    DivFocus getFocus();

    List getFunctions();

    DivSize getHeight();

    String getId();

    DivLayoutProvider getLayoutProvider();

    DivEdgeInsets getMargins();

    DivEdgeInsets getPaddings();

    Expression getReuseId();

    Expression getRowSpan();

    List getSelectedActions();

    List getTooltips();

    DivTransform getTransform();

    DivChangeTransition getTransitionChange();

    DivAppearanceTransition getTransitionIn();

    DivAppearanceTransition getTransitionOut();

    List getTransitionTriggers();

    List getVariableTriggers();

    List getVariables();

    Expression getVisibility();

    DivVisibilityAction getVisibilityAction();

    List getVisibilityActions();

    DivSize getWidth();
}
