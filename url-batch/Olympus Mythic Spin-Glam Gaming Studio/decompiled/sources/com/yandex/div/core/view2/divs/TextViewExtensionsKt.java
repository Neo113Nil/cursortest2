package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TextViewExtensions.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\u001aB\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a-\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a0\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aD\u0010\u001c\u001a\u00020\u0017*\u00020\u00182\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003\u001a0\u0010\u001d\u001a\u00020\u0017*\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aE\u0010 \u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020\"*\u0002H!2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010%\u001a\\\u0010&\u001a\u00020\u0017*\u00020\u00182\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aÕ\u0002\u0010*\u001a\u00020\u0017\"\u0010\b\u0000\u0010!*\u00020\u0018*\u00020\"*\u00020+*\u0002H!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010@\u001aX\u0010A\u001a\u00020\u0017*\u00020\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020+H\u0000\u001aW\u0010C\u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020+*\u0002H!2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010D\u001aX\u0010E\u001a\u00020\u0017*\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020+H\u0000\u001am\u0010F\u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020\"*\u0002H!2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020+H\u0000¢\u0006\u0002\u0010G\u001aE\u0010H\u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020+*\u0002H!2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010%\u001ao\u0010I\u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020+*\u0002H!2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010J\u001a¹\u0001\u0010I\u001a\u00020\u0017\"\f\b\u0000\u0010!*\u00020\u0018*\u00020+*\u0002H!2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006L"}, d2 = {"WEIGHT_AXIS", "", "supportFontVariations", "", "getSupportFontVariations", "()Z", "getFontVariations", "fontWeight", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivFontWeight;", "fontWeightValue", "", "fontVariations", "Lorg/json/JSONObject;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "", "(Lcom/yandex/div2/DivFontWeight;Ljava/lang/Integer;Lorg/json/JSONObject;)Ljava/lang/String;", "getVariation", "axis", "value", "", "applyFontSize", "", "Landroid/widget/TextView;", "fontSizeExpr", "fontSizeUnitExpr", "Lcom/yandex/div2/DivSizeUnit;", "applyFontVariationSettings", "applyLetterSpacing", "letterSpacingExpr", "", "applyLineHeight", "T", "Lcom/yandex/div/core/widget/FixedLineHeightView;", "lineHeightExpr", "unitExpr", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyTypeface", "fontFamily", "typefaceResolver", "Lcom/yandex/div/core/view2/DivTypefaceResolver;", "observeBaseTextProperties", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "newFontSize", "newFontSizeUnit", "newLetterSpacing", "newTextColor", "newLineHeight", "newFontFamily", "newFontWeight", "newFontWeightValue", "newFontVariationSettings", "oldFontSize", "oldFontSizeUnit", "oldLetterSpacing", "oldTextColor", "oldLineHeight", "oldFontFamily", "oldFontWeight", "oldFontWeightValue", "oldFontVariationSettings", "oldDiv", "Lcom/yandex/div2/DivBase;", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div2/DivBase;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeFontSize", "subscriber", "observeFontVariationSettings", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeLetterSpacing", "observeLineHeight", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "observeTextColor", "observeTypeface", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "(Landroid/widget/TextView;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div2/DivBase;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TextViewExtensionsKt {

    @NotNull
    private static final String WEIGHT_AXIS = "wght";

    public static final <T extends TextView & FixedLineHeightView & ExpressionSubscriber> void observeBaseTextProperties(@NotNull T t, @NotNull Expression<Long> expression, @NotNull Expression<DivSizeUnit> expression2, @NotNull Expression<Double> expression3, @NotNull Expression<Integer> expression4, @Nullable Expression<Long> expression5, @Nullable Expression<String> expression6, @Nullable Expression<DivFontWeight> expression7, @Nullable Expression<Long> expression8, @Nullable Expression<JSONObject> expression9, @Nullable Expression<Long> expression10, @Nullable Expression<DivSizeUnit> expression11, @Nullable Expression<Double> expression12, @Nullable Expression<Integer> expression13, @Nullable Expression<Long> expression14, @Nullable Expression<String> expression15, @Nullable Expression<DivFontWeight> expression16, @Nullable Expression<Long> expression17, @Nullable Expression<JSONObject> expression18, @Nullable DivBase divBase, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
        T t2 = t;
        observeFontSize(t, expression, expression2, expression10, expression11, expressionResolver, t2);
        observeLetterSpacing(t, expression3, expression, expression12, expression10, expressionResolver, t2);
        observeTextColor(t, expression4, expression13, expressionResolver);
        observeLineHeight(t, expression5, expression2, expression14, expression11, expressionResolver, t2);
        observeTypeface(t, expression6, expression7, expression8, expression9, expression15, expression16, expression17, expression18, divBase, divTypefaceResolver, expressionResolver);
    }

    public static final void observeFontSize(@NotNull final TextView textView, @NotNull final Expression<Long> expression, @NotNull final Expression<DivSizeUnit> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<DivSizeUnit> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyFontSize(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontSize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7235invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7235invoke(@NotNull Object obj) {
                TextViewExtensionsKt.applyFontSize(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontSize(TextView textView, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        textView.setTextSize(BaseDivViewExtensionsKt.toAndroidUnit(expression2.evaluate(expressionResolver)), expression.evaluate(expressionResolver).longValue());
    }

    public static final void observeLetterSpacing(@NotNull final TextView textView, @NotNull final Expression<Double> expression, @NotNull final Expression<Long> expression2, @Nullable Expression<Double> expression3, @Nullable Expression<Long> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLetterSpacing(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLetterSpacing$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7236invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7236invoke(@NotNull Object obj) {
                TextViewExtensionsKt.applyLetterSpacing(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyLetterSpacing(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        textView.setLetterSpacing(((float) expression.evaluate(expressionResolver).doubleValue()) / expression2.evaluate(expressionResolver).floatValue());
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTextColor(@NotNull final T t, @NotNull Expression<Integer> expression, @Nullable Expression<Integer> expression2, @NotNull ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        t.setTextColor(expression.evaluate(expressionResolver).intValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        t.addSubscription(expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTextColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                t.setTextColor(i);
            }
        }));
    }

    public static final <T extends TextView & FixedLineHeightView> void observeLineHeight(@NotNull final T t, @Nullable final Expression<Long> expression, @NotNull final Expression<DivSizeUnit> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<DivSizeUnit> expression4, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLineHeight(t, expression, expression2, expressionResolver);
        if (expression != null) {
            if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
                return;
            }
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivSizeUnit;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7237invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7237invoke(@NotNull Object obj) {
                    TextViewExtensionsKt.applyLineHeight(t, expression, expression2, expressionResolver);
                }
            };
            expressionSubscriber.addSubscription(expression.observe(expressionResolver, function1));
            expressionSubscriber.addSubscription(expression2.observe(expressionResolver, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & FixedLineHeightView> void applyLineHeight(T t, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        t.setFixedLineHeight(expression != null ? BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(expressionResolver).longValue()), t.getResources().getDisplayMetrics(), expression2.evaluate(expressionResolver)) : -1);
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTypeface(@NotNull T t, @Nullable Expression<String> expression, @Nullable Expression<DivFontWeight> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<JSONObject> expression4, @Nullable Expression<String> expression5, @Nullable Expression<DivFontWeight> expression6, @Nullable Expression<Long> expression7, @Nullable Expression<JSONObject> expression8, @Nullable DivBase divBase, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
        if (divBase != null && ExpressionsKt.equalsToConstant(expression, expression5) && ExpressionsKt.equalsToConstant(expression2, expression6) && ExpressionsKt.equalsToConstant(expression3, expression7) && (!getSupportFontVariations() || ExpressionsKt.equalsToConstant(expression4, expression8))) {
            return;
        }
        applyTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeFontVariationSettings(t, expression2, expression3, expression4, expressionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTypeface(TextView textView, Expression<String> expression, Expression<DivFontWeight> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        Integer num;
        int i;
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? expression.evaluate(expressionResolver) : null);
        DivFontWeight evaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
        if (expression3 != null) {
            long longValue = expression3.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        textView.setTypeface(DivTypefaceResolverKt.getTypeface(evaluate, num, typefaceProvider));
        if (getSupportFontVariations() && typefaceProvider.isVariable()) {
            textView.setFontVariationSettings(null);
            applyFontVariationSettings(textView, expression2, expression3, expression4, expressionResolver);
        }
    }

    private static final <T extends TextView & ExpressionSubscriber> void observeTypeface(final T t, final Expression<String> expression, final Expression<DivFontWeight> expression2, final Expression<Long> expression3, final Expression<JSONObject> expression4, final DivTypefaceResolver divTypefaceResolver, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/String;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7238invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7238invoke(@NotNull Object obj) {
                TextViewExtensionsKt.applyTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
            }
        };
        if (expression != null) {
            t.addSubscription(expression.observe(expressionResolver, function1));
        }
        if (expression2 != null) {
            t.addSubscription(expression2.observe(expressionResolver, function1));
        }
        if (expression3 != null) {
            t.addSubscription(expression3.observe(expressionResolver, function1));
        }
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeFontVariationSettings(@NotNull final T t, @Nullable final Expression<DivFontWeight> expression, @Nullable final Expression<Long> expression2, @Nullable final Expression<JSONObject> expression3, @NotNull final ExpressionResolver expressionResolver) {
        if (!getSupportFontVariations() || ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        t.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontVariationSettings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull JSONObject jSONObject) {
                TextViewExtensionsKt.applyFontVariationSettings(t, expression, expression2, expression3, expressionResolver);
            }
        }) : null);
    }

    public static final boolean getSupportFontVariations() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    public static final void applyFontVariationSettings(TextView textView, Expression<DivFontWeight> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        textView.setFontVariationSettings(getFontVariations(expression, expression2, expression3, expressionResolver));
    }

    @Nullable
    public static final String getFontVariations(@Nullable Expression<DivFontWeight> expression, @Nullable Expression<Long> expression2, @Nullable Expression<JSONObject> expression3, @NotNull ExpressionResolver expressionResolver) {
        Integer num;
        int i;
        DivFontWeight evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (expression2 != null) {
            long longValue = expression2.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return getFontVariations(evaluate, num, expression3 != null ? expression3.evaluate(expressionResolver) : null);
    }

    @Nullable
    public static final String getFontVariations(@Nullable DivFontWeight divFontWeight, @Nullable Integer num, @Nullable JSONObject jSONObject) {
        boolean z = (divFontWeight == null && num == null) ? false : true;
        int typefaceValue = DivTypefaceResolverKt.getTypefaceValue(divFontWeight, num);
        if (jSONObject == null || JsonUtilsKt.isEmpty(jSONObject)) {
            if (z) {
                return getVariation(WEIGHT_AXIS, Integer.valueOf(typefaceValue));
            }
            return null;
        }
        if (z && !jSONObject.has(WEIGHT_AXIS)) {
            jSONObject.put(WEIGHT_AXIS, typefaceValue);
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                createListBuilder.add(getVariation(next, (Number) obj));
            }
        }
        return CollectionsKt.joinToString$default(CollectionsKt.build(createListBuilder), ", ", null, null, 0, null, null, 62, null);
    }

    private static final String getVariation(String str, Number number) {
        return '\'' + str + "' " + number;
    }
}
