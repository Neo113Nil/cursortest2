package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import coil.compose.AsyncImagePainterKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HomeHeader.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"HomeContentHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "header", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;Landroidx/compose/runtime/Composer;II)V", "HomeErrorHeader", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "onCloseClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HomeContentHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "HomeErrorHeaderPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HomeHeaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$12(Modifier modifier, HomeUiState.Content.ContentHeader header, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(header, "$header");
        HomeContentHeader(modifier, header, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeaderPreview$lambda$19(int i, Composer composer, int i2) {
        HomeContentHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeader$lambda$18(Modifier modifier, HomeUiState.Error.ErrorHeader header, Function0 onCloseClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(header, "$header");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        HomeErrorHeader(modifier, header, onCloseClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeaderPreview$lambda$20(int i, Composer composer, int i2) {
        HomeErrorHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeContentHeader(Modifier modifier, final HomeUiState.Content.ContentHeader header, Composer composer, final int i, final int i2) {
        MutableState mutableState;
        final MutableState mutableState2;
        Composer composer2;
        float f;
        int i3;
        String textColorLight;
        String textColorLight2;
        Intrinsics.checkNotNullParameter(header, "header");
        Composer startRestartGroup = composer.startRestartGroup(-1992208830);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        TextStyle type02 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType02();
        startRestartGroup.startReplaceGroup(-1302174101);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(type02, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1302171803);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState4 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        float f2 = 32;
        final Modifier modifier3 = modifier2;
        float f3 = 24;
        Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(PaddingKt.m841paddingqDBjuR0$default(modifier2, 0.0f, Dp.m8401constructorimpl(10), 0.0f, Dp.m8401constructorimpl(f2), 5, null), Dp.m8401constructorimpl(f2), 0.0f, Dp.m8401constructorimpl(f3), 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default);
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
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-827693262);
        if (header.getShowLogo()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            composer2 = startRestartGroup;
            mutableState = mutableState3;
            f = f3;
            mutableState2 = mutableState4;
            i3 = 0;
            ImageKt.Image(AsyncImagePainterKt.m9164rememberAsyncImagePainter0YpotYA(new ImageRequest.Builder(context).data(ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(header.getLogoUrl(), header.getLogoDarkUrl(), startRestartGroup, 384)).crossfade(true).build(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, null, composer2, 72, 124), (String) null, SizeKt.m875height3ABfNKs(PaddingKt.m841paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m8401constructorimpl(16), 0.0f, 11, null), Dp.m8401constructorimpl(f2)), Alignment.INSTANCE.getCenterStart(), ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 27696, 96);
        } else {
            mutableState = mutableState3;
            mutableState2 = mutableState4;
            composer2 = startRestartGroup;
            f = f3;
            i3 = 0;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-827663462);
        if (header.getShowAvatars()) {
            Composer composer3 = composer2;
            AvatarGroupKt.m11082AvatarGroupJ8mCjc(header.getAdminsAvatars(), null, 0.0f, 0L, composer3, 8, 14);
            composer2 = composer3;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-827660195);
        if (!header.getShowLogo()) {
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, i3);
        }
        composer2.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer2, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(48)), composer2, 6);
        composer2.startReplaceGroup(-2011771929);
        HomeUiState.Content.ContentHeader.ColoredText greeting = header.getGreeting();
        composer2.startReplaceGroup(-2011770823);
        if (!StringsKt.isBlank(greeting.getText())) {
            composer2.startReplaceGroup(-827645376);
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(composer2, 6) && greeting.getTextColorDark() != null) {
                textColorLight2 = greeting.getTextColorDark();
            } else {
                textColorLight2 = greeting.getTextColorLight();
            }
            Pair pair = new Pair(textColorLight2, Float.valueOf(greeting.getOpacity()));
            composer2.endReplaceGroup();
            String str = (String) pair.component1();
            float floatValue = ((Number) pair.component2()).floatValue();
            String text = greeting.getText();
            TextStyle textStyle = (TextStyle) mutableState.getValue();
            long composeColor = ColorExtensionsKt.toComposeColor(str, floatValue);
            composer2.startReplaceGroup(-827627186);
            Object rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4;
                        HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4 = HomeHeaderKt.HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(MutableState.this, ((Boolean) obj).booleanValue());
                        return HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            WrapReportingTextKt.m11562WrapReportingTextT042LqI(null, text, composeColor, textStyle, (Function1) rememberedValue3, composer4, 24576, 1);
            composer2 = composer4;
        }
        composer2.endReplaceGroup();
        Unit unit = Unit.INSTANCE;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-2011741756);
        HomeUiState.Content.ContentHeader.ColoredText intro = header.getIntro();
        composer2.startReplaceGroup(-2011740743);
        if (!StringsKt.isBlank(intro.getText())) {
            composer2.startReplaceGroup(-827615296);
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(composer2, 6) && intro.getTextColorDark() != null) {
                textColorLight = intro.getTextColorDark();
            } else {
                textColorLight = intro.getTextColorLight();
            }
            Pair pair2 = new Pair(textColorLight, Float.valueOf(intro.getOpacity()));
            composer2.endReplaceGroup();
            String str2 = (String) pair2.component1();
            float floatValue2 = ((Number) pair2.component2()).floatValue();
            String text2 = intro.getText();
            TextStyle textStyle2 = (TextStyle) mutableState.getValue();
            long composeColor2 = ColorExtensionsKt.toComposeColor(str2, floatValue2);
            composer2.startReplaceGroup(-827597106);
            Object rememberedValue4 = composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8;
                        HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8 = HomeHeaderKt.HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(MutableState.this, ((Boolean) obj).booleanValue());
                        return HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceGroup();
            Composer composer5 = composer2;
            WrapReportingTextKt.m11562WrapReportingTextT042LqI(null, text2, composeColor2, textStyle2, (Function1) rememberedValue4, composer5, 24576, 1);
            composer2 = composer5;
        }
        composer2.endReplaceGroup();
        Unit unit2 = Unit.INSTANCE;
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeContentHeader$lambda$12;
                    HomeContentHeader$lambda$12 = HomeHeaderKt.HomeContentHeader$lambda$12(Modifier.this, header, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeContentHeader$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(MutableState hasEitherTextWrapped, boolean z) {
        Intrinsics.checkNotNullParameter(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(MutableState hasEitherTextWrapped, boolean z) {
        Intrinsics.checkNotNullParameter(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    public static final void HomeErrorHeader(Modifier modifier, final HomeUiState.Error.ErrorHeader header, final Function0<Unit> onCloseClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer startRestartGroup = composer.startRestartGroup(964565742);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(header) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onCloseClick) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            Modifier m875height3ABfNKs = SizeKt.m875height3ABfNKs(PaddingKt.m839paddingVpY3zN4$default(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(header.getBackgroundColor(), 0.0f, 1, null), null, 2, null), Dp.m8401constructorimpl(16), 0.0f, 2, null), Dp.m8401constructorimpl(56));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m875height3ABfNKs);
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
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(941715051);
            String foregroundColor = header.getForegroundColor();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(1204041954);
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13;
                        HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13 = HomeHeaderKt.HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(Function0.this);
                        return HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) rememberedValue, 15, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_close, startRestartGroup, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_close, startRestartGroup, 0), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), startRestartGroup, 8, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier3 = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeErrorHeader$lambda$18;
                    HomeErrorHeader$lambda$18 = HomeHeaderKt.HomeErrorHeader$lambda$18(Modifier.this, header, onCloseClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeErrorHeader$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(Function0 onCloseClick) {
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void HomeContentHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1555491493);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m11573getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeContentHeaderPreview$lambda$19;
                    HomeContentHeaderPreview$lambda$19 = HomeHeaderKt.HomeContentHeaderPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeContentHeaderPreview$lambda$19;
                }
            });
        }
    }

    private static final void HomeErrorHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-484536790);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m11575getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeErrorHeaderPreview$lambda$20;
                    HomeErrorHeaderPreview$lambda$20 = HomeHeaderKt.HomeErrorHeaderPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeErrorHeaderPreview$lambda$20;
                }
            });
        }
    }
}
