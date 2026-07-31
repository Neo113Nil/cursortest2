package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImageKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeHeaderBackdrop.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\u0013"}, d2 = {"HomeHeaderBackdrop", "", "headerHeight", "Landroidx/compose/ui/unit/Dp;", "backdropStyle", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "backdropStyleDark", "onImageLoaded", "Lkotlin/Function0;", "HomeHeaderBackdrop-AjpBEmI", "(FLio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SolidHeaderBackdropPreview", "(Landroidx/compose/runtime/Composer;I)V", "GradientHeaderBackdropPreview", "SolidHeaderBackdropWithFadePreview", "GradientHeaderBackdropWithFadePreview", "CrossTypeSolidToGradientPreview", "CrossTypeGradientToSolidPreview", "ConsistentFadeBehaviorPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HomeHeaderBackdropKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConsistentFadeBehaviorPreview$lambda$10(int i, Composer composer, int i2) {
        ConsistentFadeBehaviorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CrossTypeGradientToSolidPreview$lambda$9(int i, Composer composer, int i2) {
        CrossTypeGradientToSolidPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CrossTypeSolidToGradientPreview$lambda$8(int i, Composer composer, int i2) {
        CrossTypeSolidToGradientPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientHeaderBackdropPreview$lambda$5(int i, Composer composer, int i2) {
        GradientHeaderBackdropPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GradientHeaderBackdropWithFadePreview$lambda$7(int i, Composer composer, int i2) {
        GradientHeaderBackdropWithFadePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeHeaderBackdrop_AjpBEmI$lambda$3(float f, HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, Function0 onImageLoaded, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(backdropStyle, "$backdropStyle");
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        m11581HomeHeaderBackdropAjpBEmI(f, backdropStyle, headerBackdropStyle, onImageLoaded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidHeaderBackdropPreview$lambda$4(int i, Composer composer, int i2) {
        SolidHeaderBackdropPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SolidHeaderBackdropWithFadePreview$lambda$6(int i, Composer composer, int i2) {
        SolidHeaderBackdropWithFadePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006c  */
    /* renamed from: HomeHeaderBackdrop-AjpBEmI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11581HomeHeaderBackdropAjpBEmI(final float f, final HomeUiState.Content.ContentHeader.HeaderBackdropStyle backdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, final Function0<Unit> onImageLoaded, Composer composer, final int i, final int i2) {
        int i3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle2;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle3;
        int hashCode;
        Composer m4976constructorimpl;
        Composer composer2;
        BoxScopeInstance boxScopeInstance;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle4;
        int i4;
        int i5;
        float m8401constructorimpl;
        float f2;
        Object obj;
        int i6;
        final HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(backdropStyle, "backdropStyle");
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        Composer startRestartGroup = composer.startRestartGroup(1754935872);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(backdropStyle) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            headerBackdropStyle2 = headerBackdropStyle;
            i3 |= startRestartGroup.changed(headerBackdropStyle2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onImageLoaded) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle6 = i7 == 0 ? null : headerBackdropStyle2;
                headerBackdropStyle3 = (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(startRestartGroup, 6) || headerBackdropStyle6 == null) ? backdropStyle : headerBackdropStyle6;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                char c = 0;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (!(headerBackdropStyle3 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient)) {
                    startRestartGroup.startReplaceGroup(1047420935);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle3;
                    BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m875height3ABfNKs(BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m5607linearGradientmHitzGk$default(Brush.INSTANCE, gradient.getColors(), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m8401constructorimpl(Dp.m8401constructorimpl(gradient.getFade() ? 160 : 80) + f)), 0.0f, 1, null), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    boxScopeInstance = boxScopeInstance2;
                    headerBackdropStyle4 = headerBackdropStyle3;
                    i4 = 160;
                    i5 = 80;
                    obj = null;
                    f2 = 0.0f;
                    i6 = 1;
                } else if (headerBackdropStyle3 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    startRestartGroup.startReplaceGroup(1047880603);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context = (Context) consume;
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle3;
                    ImageRequest build = new ImageRequest.Builder(context).data(image.getImageUrl()).crossfade(true).build();
                    ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader(context);
                    ContentScale crop = ContentScale.INSTANCE.getCrop();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m875height3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, image.m11532getFallbackColor0d7_KjU(), null, 2, null), Dp.m8401constructorimpl(Dp.m8401constructorimpl(80) + f)), 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1074554204);
                    boolean z = (i3 & 7168) == 2048;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0;
                                HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0 = HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(Function0.this, (AsyncImagePainter.State.Success) obj2);
                                return HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    headerBackdropStyle4 = headerBackdropStyle3;
                    boxScopeInstance = boxScopeInstance2;
                    i4 = 160;
                    SubcomposeAsyncImageKt.m9203SubcomposeAsyncImageTCQMD7g(build, null, imageLoader, fillMaxWidth$default, null, null, null, null, null, (Function1) rememberedValue, null, null, crop, 0.0f, null, 0, false, null, startRestartGroup, 568, 384, 257520);
                    composer2 = startRestartGroup;
                    composer2.endReplaceGroup();
                    i5 = 80;
                    f2 = 0.0f;
                    obj = null;
                    i6 = 1;
                    c = 0;
                } else {
                    composer2 = startRestartGroup;
                    boxScopeInstance = boxScopeInstance2;
                    headerBackdropStyle4 = headerBackdropStyle3;
                    i4 = 160;
                    if (!(headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        composer2.startReplaceGroup(-1074592113);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(1048705854);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle4;
                    Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, solid.m11536getColor0d7_KjU(), null, 2, null);
                    if (solid.getFade()) {
                        m8401constructorimpl = Dp.m8401constructorimpl(160);
                        i5 = 80;
                    } else {
                        i5 = 80;
                        m8401constructorimpl = Dp.m8401constructorimpl(80);
                    }
                    Modifier m875height3ABfNKs = SizeKt.m875height3ABfNKs(m262backgroundbw27NRU$default, Dp.m8401constructorimpl(f + m8401constructorimpl));
                    f2 = 0.0f;
                    obj = null;
                    i6 = 1;
                    c = 0;
                    BoxKt.Box(SizeKt.fillMaxWidth$default(m875height3ABfNKs, 0.0f, 1, null), composer2, 0);
                    composer2.endReplaceGroup();
                }
                composer2.startReplaceGroup(-1074538392);
                if (headerBackdropStyle4.getFade()) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Brush.Companion companion3 = Brush.INSTANCE;
                    Color[] colorArr = new Color[2];
                    colorArr[c] = Color.m5647boximpl(Color.INSTANCE.m5692getTransparent0d7_KjU());
                    colorArr[i6] = Color.m5647boximpl(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU());
                    BoxKt.Box(boxScopeInstance.align(SizeKt.fillMaxWidth$default(SizeKt.m875height3ABfNKs(BackgroundKt.background$default(companion2, Brush.Companion.m5613verticalGradient8A3gB4$default(companion3, CollectionsKt.listOf((Object[]) colorArr), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m8401constructorimpl(headerBackdropStyle4 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image ? i5 : i4)), f2, i6, obj), Alignment.INSTANCE.getBottomCenter()), composer2, 0);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                headerBackdropStyle5 = headerBackdropStyle6;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                headerBackdropStyle5 = headerBackdropStyle2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit HomeHeaderBackdrop_AjpBEmI$lambda$3;
                        HomeHeaderBackdrop_AjpBEmI$lambda$3 = HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f, backdropStyle, headerBackdropStyle5, onImageLoaded, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return HomeHeaderBackdrop_AjpBEmI$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        headerBackdropStyle2 = headerBackdropStyle;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i7 == 0) {
        }
        if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(startRestartGroup, 6)) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        Modifier.Companion companion4 = Modifier.INSTANCE;
        char c2 = 0;
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        if (!(headerBackdropStyle3 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient)) {
        }
        composer2.startReplaceGroup(-1074538392);
        if (headerBackdropStyle4.getFade()) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        headerBackdropStyle5 = headerBackdropStyle6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(Function0 onImageLoaded, AsyncImagePainter.State.Success it) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        Intrinsics.checkNotNullParameter(it, "it");
        onImageLoaded.invoke();
        return Unit.INSTANCE;
    }

    public static final void SolidHeaderBackdropPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(784552236);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11563getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SolidHeaderBackdropPreview$lambda$4;
                    SolidHeaderBackdropPreview$lambda$4 = HomeHeaderBackdropKt.SolidHeaderBackdropPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SolidHeaderBackdropPreview$lambda$4;
                }
            });
        }
    }

    public static final void GradientHeaderBackdropPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1564631091);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11564getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GradientHeaderBackdropPreview$lambda$5;
                    GradientHeaderBackdropPreview$lambda$5 = HomeHeaderBackdropKt.GradientHeaderBackdropPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return GradientHeaderBackdropPreview$lambda$5;
                }
            });
        }
    }

    public static final void SolidHeaderBackdropWithFadePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(14975022);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11565getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SolidHeaderBackdropWithFadePreview$lambda$6;
                    SolidHeaderBackdropWithFadePreview$lambda$6 = HomeHeaderBackdropKt.SolidHeaderBackdropWithFadePreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SolidHeaderBackdropWithFadePreview$lambda$6;
                }
            });
        }
    }

    public static final void GradientHeaderBackdropWithFadePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-205873713);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11566getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GradientHeaderBackdropWithFadePreview$lambda$7;
                    GradientHeaderBackdropWithFadePreview$lambda$7 = HomeHeaderBackdropKt.GradientHeaderBackdropWithFadePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return GradientHeaderBackdropWithFadePreview$lambda$7;
                }
            });
        }
    }

    public static final void CrossTypeSolidToGradientPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1289954070);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11567getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CrossTypeSolidToGradientPreview$lambda$8;
                    CrossTypeSolidToGradientPreview$lambda$8 = HomeHeaderBackdropKt.CrossTypeSolidToGradientPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CrossTypeSolidToGradientPreview$lambda$8;
                }
            });
        }
    }

    public static final void CrossTypeGradientToSolidPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(60882784);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11568getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CrossTypeGradientToSolidPreview$lambda$9;
                    CrossTypeGradientToSolidPreview$lambda$9 = HomeHeaderBackdropKt.CrossTypeGradientToSolidPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CrossTypeGradientToSolidPreview$lambda$9;
                }
            });
        }
    }

    public static final void ConsistentFadeBehaviorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-551060646);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m11569getLambda7$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConsistentFadeBehaviorPreview$lambda$10;
                    ConsistentFadeBehaviorPreview$lambda$10 = HomeHeaderBackdropKt.ConsistentFadeBehaviorPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConsistentFadeBehaviorPreview$lambda$10;
                }
            });
        }
    }
}
