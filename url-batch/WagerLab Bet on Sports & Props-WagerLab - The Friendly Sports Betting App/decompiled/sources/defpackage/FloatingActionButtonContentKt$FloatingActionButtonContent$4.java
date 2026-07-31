package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.composeunstyled.IconKt;
import com.google.common.net.HttpHeaders;
import expo.modules.devmenu.R;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingActionButtonContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FloatingActionButtonContentKt$FloatingActionButtonContent$4 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedRotation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedScale;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onEllipsisPress;
    final /* synthetic */ Function0<Unit> $onRefreshPress;
    final /* synthetic */ RoundedCornerShape $pillShape;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ float $verticalPadding;

    FloatingActionButtonContentKt$FloatingActionButtonContent$4(float f, Modifier modifier, RoundedCornerShape roundedCornerShape, float f2, Animatable<Float, AnimationVector1D> animatable, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, CoroutineScope coroutineScope, Animatable<Float, AnimationVector1D> animatable2, Function0<Unit> function02) {
        this.$horizontalPadding = f;
        this.$modifier = modifier;
        this.$pillShape = roundedCornerShape;
        this.$verticalPadding = f2;
        this.$animatedRotation = animatable;
        this.$interactionSource = mutableInteractionSource;
        this.$onRefreshPress = function0;
        this.$scope = coroutineScope;
        this.$animatedScale = animatable2;
        this.$onEllipsisPress = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function0 function0, CoroutineScope coroutineScope, Animatable animatable) {
        function0.invoke();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingActionButtonContentKt$FloatingActionButtonContent$4$1$1$1$1(animatable, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0, CoroutineScope coroutineScope, Animatable animatable) {
        function0.invoke();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingActionButtonContentKt$FloatingActionButtonContent$4$1$2$1$1(animatable, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C69@2568L6,63@2351L2228:FloatingActionButtonContent.kt");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-883714864, i2, -1, "FloatingActionButtonContent.<anonymous> (FloatingActionButtonContent.kt:61)");
        }
        float m8401constructorimpl = Dp.m8401constructorimpl(BoxWithConstraints.mo725getMaxWidthD9Ej5fM() - Dp.m8401constructorimpl(this.$horizontalPadding * 2));
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(SizeKt.fillMaxSize$default(BorderKt.m274borderxT4_qwU(this.$modifier, Dp.m8401constructorimpl(1), NewAppTheme.INSTANCE.getColors(composer, 6).getBorder().getDefault(), this.$pillShape), 0.0f, 1, null), this.$horizontalPadding, this.$verticalPadding);
        final Animatable<Float, AnimationVector1D> animatable = this.$animatedRotation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        final Function0<Unit> function0 = this.$onRefreshPress;
        final CoroutineScope coroutineScope = this.$scope;
        final Animatable<Float, AnimationVector1D> animatable2 = this.$animatedScale;
        final Function0<Unit> function02 = this.$onEllipsisPress;
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m838paddingVpY3zN4);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 793593239, "C76@2767L46,78@2882L6,85@3126L464,75@2743L867,103@3642L47,105@3764L6,113@4141L412,102@3618L955:FloatingActionButtonContent.kt");
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.refresh_round_icon, composer, 0);
        long tertiary = NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary();
        Modifier rotate = RotateKt.rotate(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), animatable.getValue().floatValue());
        composer.startReplaceGroup(-1746271574);
        ComposerKt.sourceInformation(composer, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
        boolean changed = composer.changed(function0) | composer.changedInstance(coroutineScope) | composer.changedInstance(animatable);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: FloatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$1$lambda$0;
                    invoke$lambda$4$lambda$1$lambda$0 = FloatingActionButtonContentKt$FloatingActionButtonContent$4.invoke$lambda$4$lambda$1$lambda$0(Function0.this, coroutineScope, animatable);
                    return invoke$lambda$4$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        IconKt.m9519Iconww6aTOc(painterResource, HttpHeaders.REFRESH, ClickableKt.m299clickableO2vRcR0$default(rotate, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue, 28, null), tertiary, composer, 48, 0);
        Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.ellipsis_horizontal, composer, 0);
        long tertiary2 = NewAppTheme.INSTANCE.getColors(composer, 6).getIcon().getTertiary();
        Modifier scale = ScaleKt.scale(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), animatable2.getValue().floatValue());
        composer.startReplaceGroup(-1746271574);
        ComposerKt.sourceInformation(composer, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
        boolean changed2 = composer.changed(function02) | composer.changedInstance(coroutineScope) | composer.changedInstance(animatable2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: FloatingActionButtonContentKt$FloatingActionButtonContent$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3$lambda$2;
                    invoke$lambda$4$lambda$3$lambda$2 = FloatingActionButtonContentKt$FloatingActionButtonContent$4.invoke$lambda$4$lambda$3$lambda$2(Function0.this, coroutineScope, animatable2);
                    return invoke$lambda$4$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        IconKt.m9519Iconww6aTOc(painterResource2, "Open Dev Menu", ClickableKt.m299clickableO2vRcR0$default(scale, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue2, 28, null), tertiary2, composer, 48, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
