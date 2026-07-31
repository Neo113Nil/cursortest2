package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.core.text.HtmlCompat;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBlock.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"CodeBlock", "", "block", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "modifier", "Landroidx/compose/ui/Modifier;", "onLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CodeBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlock$lambda$1(Block block, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(block, "$block");
        CodeBlock(block, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlockPreview$lambda$2(int i, Composer composer, int i2) {
        CodeBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeBlock$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void CodeBlock(final Block block, Modifier modifier, Function1<? super TextLayoutResult, Unit> function1, Composer composer, final int i, final int i2) {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(-1370899294);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super TextLayoutResult, Unit> function12 = (i2 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.CodeBlockKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit CodeBlock$lambda$0;
                CodeBlock$lambda$0 = CodeBlockKt.CodeBlock$lambda$0((TextLayoutResult) obj);
                return CodeBlock$lambda$0;
            }
        } : function1;
        Spanned fromHtml = HtmlCompat.fromHtml(block.getText(), 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        annotatedString = BlockExtensionsKt.toAnnotatedString(fromHtml, (Context) consume, (r27 & 2) != 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : null);
        final Function1<? super TextLayoutResult, Unit> function13 = function12;
        TextKt.m3582TextZ58ophY(annotatedString, BackgroundKt.m262backgroundbw27NRU$default(PaddingKt.m838paddingVpY3zN4(companion, Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(12)), ColorKt.Color(4285098354L), null, 2, null), Color.INSTANCE.m5694getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, function13, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, null, FontFamily.INSTANCE.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), startRestartGroup, 384, (i << 15) & 29360128, 131064);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.CodeBlockKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CodeBlock$lambda$1;
                    CodeBlock$lambda$1 = CodeBlockKt.CodeBlock$lambda$1(Block.this, modifier2, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CodeBlock$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void CodeBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1610207419);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CodeBlockKt.INSTANCE.m11720getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.CodeBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CodeBlockPreview$lambda$2;
                    CodeBlockPreview$lambda$2 = CodeBlockKt.CodeBlockPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CodeBlockPreview$lambda$2;
                }
            });
        }
    }
}
