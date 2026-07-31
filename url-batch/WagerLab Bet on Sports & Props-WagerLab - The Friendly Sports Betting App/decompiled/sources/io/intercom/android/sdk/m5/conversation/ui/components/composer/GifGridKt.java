package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GifGrid.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"GifGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "gifs", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "onGifClick", "Lkotlin/Function1;", "onGifSearchQueryChange", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GifGridIcon", "iconId", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewGifGrid", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GifGridKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$12(Modifier modifier, List gifs, Function1 onGifClick, Function1 onGifSearchQueryChange, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(gifs, "$gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "$onGifClick");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        GifGrid(modifier, gifs, onGifClick, onGifSearchQueryChange, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGridIcon$lambda$15(int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        GifGridIcon(i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGifGrid$lambda$16(int i, Composer composer, int i2) {
        PreviewGifGrid(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GifGrid(Modifier modifier, final List<? extends Block> gifs, final Function1<? super Block, Unit> onGifClick, final Function1<? super String, Unit> onGifSearchQueryChange, Composer composer, final int i, final int i2) {
        MutableState mutableState;
        String str;
        MutableInteractionSource mutableInteractionSource;
        SoftwareKeyboardController softwareKeyboardController;
        Object obj;
        Composer composer2;
        String str2;
        final MutableState mutableState2;
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "onGifClick");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "onGifSearchQueryChange");
        Composer startRestartGroup = composer.startRestartGroup(2027814826);
        final Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        startRestartGroup.startReplaceGroup(-1549192846);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1549190918);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1834338565);
        if (Intrinsics.areEqual(mutableState3.getValue(), "intercom version")) {
            mutableState = mutableState3;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            mutableInteractionSource = mutableInteractionSource2;
            softwareKeyboardController = softwareKeyboardController2;
            obj = null;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            TextKt.m3581TextNvy7gAk(BuildConfig.VERSION_NAME, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 0, 0, 262142);
            composer2 = startRestartGroup;
        } else {
            mutableState = mutableState3;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            mutableInteractionSource = mutableInteractionSource2;
            softwareKeyboardController = softwareKeyboardController2;
            obj = null;
            composer2 = startRestartGroup;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
        }
        composer2.endReplaceGroup();
        float f = 8;
        Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(BackgroundKt.m261backgroundbw27NRU(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), Dp.m8401constructorimpl(f), 0.0f, 2, obj), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), IntercomTheme.INSTANCE.getShapes(composer2, IntercomTheme.$stable).getSmall()), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(12));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str2);
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m838paddingVpY3zN4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer2.useNode();
        }
        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer2);
        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String str3 = (String) mutableState.getValue();
        TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04();
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        KeyboardOptions m1268copyINvB4aQ$default = KeyboardOptions.m1268copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, (Boolean) null, 0, ImeAction.INSTANCE.m8023getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (Object) null);
        composer2.startReplaceGroup(-1582275237);
        final SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController;
        boolean changed = composer2.changed(softwareKeyboardController3);
        Object rememberedValue3 = composer2.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit GifGrid$lambda$11$lambda$8$lambda$3$lambda$2;
                    GifGrid$lambda$11$lambda$8$lambda$3$lambda$2 = GifGridKt.GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(SoftwareKeyboardController.this, (KeyboardActionScope) obj2);
                    return GifGrid$lambda$11$lambda$8$lambda$3$lambda$2;
                }
            };
            composer2.updateRememberedValue(rememberedValue3);
        }
        composer2.endReplaceGroup();
        KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) rememberedValue3, null, 47, null);
        composer2.startReplaceGroup(-1582287683);
        int i3 = (i & 7168) ^ 3072;
        boolean z = (i3 > 2048 && composer2.changed(onGifSearchQueryChange)) || (i & 3072) == 2048;
        Object rememberedValue4 = composer2.rememberedValue();
        if (z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            mutableState2 = mutableState;
            rememberedValue4 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit GifGrid$lambda$11$lambda$8$lambda$5$lambda$4;
                    GifGrid$lambda$11$lambda$8$lambda$5$lambda$4 = GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(MutableState.this, onGifSearchQueryChange, (String) obj2);
                    return GifGrid$lambda$11$lambda$8$lambda$5$lambda$4;
                }
            };
            composer2.updateRememberedValue(rememberedValue4);
        } else {
            mutableState2 = mutableState;
        }
        composer2.endReplaceGroup();
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        Composer composer3 = composer2;
        final MutableState mutableState4 = mutableState2;
        BasicTextFieldKt.BasicTextField(str3, (Function1<? super String, Unit>) rememberedValue4, weight$default, false, false, type04, m1268copyINvB4aQ$default, keyboardActions, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1827261249, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> it, Composer composer4, int i4) {
                Composer composer5;
                int i5;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i4 & 14) == 0) {
                    composer5 = composer4;
                    i5 = i4 | (composer5.changedInstance(it) ? 4 : 2);
                } else {
                    composer5 = composer4;
                    i5 = i4;
                }
                if ((i5 & 91) != 18 || !composer5.getSkipping()) {
                    TextFieldDefaults.INSTANCE.DecorationBox(mutableState2.getValue(), it, true, true, VisualTransformation.INSTANCE.getNone(), mutableInteractionSource3, false, null, ComposableSingletons$GifGridKt.INSTANCE.m11327getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, TextFieldDefaults.INSTANCE.m3552colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer4, 221184, 432, 0, 0, 3072, 2147477455, 4095), PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0)), null, composer4, ((i5 << 3) & 112) | 100887936, 102236160, 163520);
                    return;
                }
                composer5.skipToGroupEnd();
            }
        }, composer2, 54), composer3, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 32280);
        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer3, 6);
        if (((CharSequence) mutableState4.getValue()).length() > 0) {
            composer3.startReplaceGroup(-1804490114);
            int i4 = R.drawable.intercom_close;
            composer3.startReplaceGroup(-1582228259);
            boolean z2 = (i3 > 2048 && composer3.changed(onGifSearchQueryChange)) || (i & 3072) == 2048;
            Object rememberedValue5 = composer3.rememberedValue();
            if (z2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit GifGrid$lambda$11$lambda$8$lambda$7$lambda$6;
                        GifGrid$lambda$11$lambda$8$lambda$7$lambda$6 = GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(MutableState.this, onGifSearchQueryChange);
                        return GifGrid$lambda$11$lambda$8$lambda$7$lambda$6;
                    }
                };
                composer3.updateRememberedValue(rememberedValue5);
            }
            composer3.endReplaceGroup();
            GifGridIcon(i4, (Function0) rememberedValue5, composer3, 0, 0);
            composer3.endReplaceGroup();
        } else {
            composer3.startReplaceGroup(-1804309663);
            GifGridIcon(R.drawable.intercom_gif_search_icon, null, composer3, 0, 2);
            composer3.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4)), composer3, 6);
        LazyStaggeredGridDslKt.m1089LazyVerticalStaggeredGrid6qCrX9Q(new StaggeredGridCells.Fixed(3), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(f)), false, Dp.m8401constructorimpl(f), Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f)), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit GifGrid$lambda$11$lambda$10;
                GifGrid$lambda$11$lambda$10 = GifGridKt.GifGrid$lambda$11$lambda$10(gifs, onGifClick, (LazyStaggeredGridScope) obj2);
                return GifGrid$lambda$11$lambda$10;
            }
        }, composer3, 1772544, 0, 916);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit GifGrid$lambda$12;
                    GifGrid$lambda$12 = GifGridKt.GifGrid$lambda$12(Modifier.this, gifs, onGifClick, onGifSearchQueryChange, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return GifGrid$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(MutableState searchText, Function1 onGifSearchQueryChange, String it) {
        Intrinsics.checkNotNullParameter(searchText, "$searchText");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        Intrinsics.checkNotNullParameter(it, "it");
        searchText.setValue(it);
        onGifSearchQueryChange.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(SoftwareKeyboardController softwareKeyboardController, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(MutableState searchText, Function1 onGifSearchQueryChange) {
        Intrinsics.checkNotNullParameter(searchText, "$searchText");
        Intrinsics.checkNotNullParameter(onGifSearchQueryChange, "$onGifSearchQueryChange");
        searchText.setValue("");
        onGifSearchQueryChange.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GifGridIcon(final int i, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        boolean z;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1949834895);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if ((i4 & 91) == 18 || !startRestartGroup.getSkipping()) {
                function03 = i5 == 0 ? null : function02;
                Modifier testTag = TestTagKt.testTag(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), String.valueOf(i));
                boolean z2 = function03 == null;
                startRestartGroup.startReplaceGroup(-2076063811);
                z = (i4 & 112) == 32;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GifGridIcon$lambda$14$lambda$13;
                            GifGridIcon$lambda$14$lambda$13 = GifGridKt.GifGridIcon$lambda$14$lambda$13(Function0.this);
                            return GifGridIcon$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, i4 & 14), (String) null, ClickableKt.m303clickableoSLSa3U$default(testTag, z2, null, null, null, (Function0) rememberedValue, 14, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), startRestartGroup, 56, 0);
            } else {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit GifGridIcon$lambda$15;
                        GifGridIcon$lambda$15 = GifGridKt.GifGridIcon$lambda$15(i, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return GifGridIcon$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i4 & 91) == 18) {
        }
        if (i5 == 0) {
        }
        Modifier testTag2 = TestTagKt.testTag(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), String.valueOf(i));
        if (function03 == null) {
        }
        startRestartGroup.startReplaceGroup(-2076063811);
        if ((i4 & 112) == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit GifGridIcon$lambda$14$lambda$13;
                GifGridIcon$lambda$14$lambda$13 = GifGridKt.GifGridIcon$lambda$14$lambda$13(Function0.this);
                return GifGridIcon$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i, startRestartGroup, i4 & 14), (String) null, ClickableKt.m303clickableoSLSa3U$default(testTag2, z2, null, null, null, (Function0) rememberedValue, 14, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), startRestartGroup, 56, 0);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGridIcon$lambda$14$lambda$13(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void PreviewGifGrid(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1512591839);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GifGridKt.INSTANCE.m11329getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewGifGrid$lambda$16;
                    PreviewGifGrid$lambda$16 = GifGridKt.PreviewGifGrid$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewGifGrid$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GifGrid$lambda$11$lambda$10(final List gifs, final Function1 onGifClick, LazyStaggeredGridScope LazyVerticalStaggeredGrid) {
        Intrinsics.checkNotNullParameter(gifs, "$gifs");
        Intrinsics.checkNotNullParameter(onGifClick, "$onGifClick");
        Intrinsics.checkNotNullParameter(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
        LazyVerticalStaggeredGrid.items(gifs.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                gifs.get(i);
                return null;
            }
        }, null, ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(index)436@20481L32:LazyStaggeredGridDsl.kt#fzvcnm");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1466459515, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:436)");
                }
                Block block = (Block) gifs.get(i);
                composer.startReplaceGroup(-1572851321);
                ImageBlockKt.ImageBlock(block, null, onGifClick, true, null, composer, 3080, 18);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
