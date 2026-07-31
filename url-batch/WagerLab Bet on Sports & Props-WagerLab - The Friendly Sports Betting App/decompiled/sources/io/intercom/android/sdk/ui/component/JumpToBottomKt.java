package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.branch.referral.BranchError;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JumpToBottom.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a[\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0017\u001a5\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001b"}, d2 = {"JumpBottomPadding", "Landroidx/compose/ui/unit/Dp;", "getJumpBottomPadding", "()F", "F", "JumpToBottom", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "badgeText", "", "badgeColor", "badgeContentColor", ViewProps.ON_CLICK, "Lkotlin/Function0;", "JumpToBottom-kNRdK3w", "(Landroidx/compose/ui/Modifier;JJLjava/lang/String;JJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getChevronColor", "(Landroidx/compose/runtime/Composer;I)J", "JumpToBottomPreview", "(Landroidx/compose/runtime/Composer;I)V", "UnreadBadge", "UnreadBadge-eaDK9VM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJLandroidx/compose/runtime/Composer;II)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JumpToBottomKt {
    private static final float JumpBottomPadding = Dp.m8401constructorimpl(12);

    /* compiled from: JumpToBottom.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JumpToBottomPreview$lambda$1(int i, Composer composer, int i2) {
        JumpToBottomPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JumpToBottom_kNRdK3w$lambda$0(Modifier modifier, long j, long j2, String str, long j3, long j4, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m11991JumpToBottomkNRdK3w(modifier, j, j2, str, j3, j4, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadBadge_eaDK9VM$lambda$2(Modifier modifier, String badgeText, long j, long j2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(badgeText, "$badgeText");
        m11992UnreadBadgeeaDK9VM(modifier, badgeText, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final float getJumpBottomPadding() {
        return JumpBottomPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b7  */
    /* renamed from: JumpToBottom-kNRdK3w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11991JumpToBottomkNRdK3w(Modifier modifier, long j, long j2, String str, long j3, long j4, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        long j5;
        long j6;
        String str2;
        long j7;
        int i4;
        long j8;
        Modifier.Companion companion;
        String str3;
        final long j9;
        final long j10;
        final String str4;
        final Modifier modifier2;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1700007899);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j5 = j;
                if (startRestartGroup.changed(j5)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                j5 = j;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            j5 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j6 = j2;
                if (startRestartGroup.changed(j6)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j6 = j2;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j6 = j2;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
            if ((57344 & i) != 0) {
                j7 = j3;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j7)) ? 16384 : 8192;
            } else {
                j7 = j3;
            }
            if ((458752 & i) != 0) {
                i4 = i8;
                j8 = j4;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j8)) ? 131072 : 65536;
            } else {
                i4 = i8;
                j8 = j4;
            }
            if ((i2 & 64) != 0) {
                i5 = (3670016 & i) == 0 ? startRestartGroup.changedInstance(onClick) ? 1048576 : 524288 : 1572864;
                if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i4 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            j5 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12152getBackground0d7_KjU();
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            j6 = getChevronColor(startRestartGroup, 0);
                            i3 &= -897;
                        }
                        str3 = i9 != 0 ? null : str2;
                        if ((i2 & 16) != 0) {
                            j7 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12147getAction0d7_KjU();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            j8 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12168getOnAction0d7_KjU();
                            i3 &= -458753;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        str3 = str2;
                    }
                    startRestartGroup.endDefaults();
                    final long j12 = j8;
                    final String str5 = str3;
                    final long j13 = j7;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1557616541, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                                String str6 = str5;
                                if (str6 == null) {
                                    return;
                                }
                                JumpToBottomKt.m11992UnreadBadgeeaDK9VM(OffsetKt.m791offsetVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(Dp.m8401constructorimpl(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str6, j13, j12, composer2, 6, 0);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54);
                    final long j14 = j5;
                    final long j15 = j6;
                    BadgeKt.BadgedBox(rememberComposableLambda, companion, ComposableLambdaKt.rememberComposableLambda(1814183329, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                            Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                            if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                                composer2.startReplaceGroup(-1483768023);
                                Object rememberedValue = composer2.rememberedValue();
                                Object obj = rememberedValue;
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    MutableTransitionState mutableTransitionState = new MutableTransitionState(false);
                                    mutableTransitionState.setTargetState$animation_core(true);
                                    composer2.updateRememberedValue(mutableTransitionState);
                                    obj = mutableTransitionState;
                                }
                                MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj;
                                composer2.endReplaceGroup();
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                EnterTransition floatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((Density) consume).mo424toPx0680j_4(JumpToBottomKt.getJumpBottomPadding()));
                                final Function0<Unit> function0 = onClick;
                                final long j16 = j14;
                                final long j17 = j15;
                                AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, floatingButtonEnterTransition, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(600504953, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        float f = 48;
                                        Modifier m274borderxT4_qwU = BorderKt.m274borderxT4_qwU(SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, JumpToBottomKt.getJumpBottomPadding()), Dp.m8401constructorimpl(f)), Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer3, 6).m12161getDivider0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50));
                                        Function0<Unit> function02 = function0;
                                        long j18 = j16;
                                        final long j19 = j17;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m274borderxT4_qwU);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                        }
                                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        FloatingActionButtonKt.m2817FloatingActionButtonXz6DiA(function02, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50), j18, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(2122957953, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i12) {
                                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                                    IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_chevron_down, composer4, 0), "Jump to bottom", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), j19, composer4, 440, 0);
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582960, 112);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                    }
                                }, composer2, 54), composer2, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390, 0);
                    j9 = j5;
                    j10 = j6;
                    str4 = str3;
                    modifier2 = companion;
                    j11 = j12;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    long j16 = j6;
                    str4 = str2;
                    j11 = j8;
                    j9 = j5;
                    j10 = j16;
                    modifier2 = modifier;
                }
                final long j17 = j7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit JumpToBottom_kNRdK3w$lambda$0;
                            JumpToBottom_kNRdK3w$lambda$0 = JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(Modifier.this, j9, j10, str4, j17, j11, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return JumpToBottom_kNRdK3w$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= i5;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            startRestartGroup.endDefaults();
            final long j122 = j8;
            final String str52 = str3;
            final long j132 = j7;
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1557616541, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                        String str6 = str52;
                        if (str6 == null) {
                            return;
                        }
                        JumpToBottomKt.m11992UnreadBadgeeaDK9VM(OffsetKt.m791offsetVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(Dp.m8401constructorimpl(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str6, j132, j122, composer2, 6, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54);
            final long j142 = j5;
            final long j152 = j6;
            BadgeKt.BadgedBox(rememberComposableLambda2, companion, ComposableLambdaKt.rememberComposableLambda(1814183329, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                    if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                        composer2.startReplaceGroup(-1483768023);
                        Object rememberedValue = composer2.rememberedValue();
                        Object obj = rememberedValue;
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            MutableTransitionState mutableTransitionState = new MutableTransitionState(false);
                            mutableTransitionState.setTargetState$animation_core(true);
                            composer2.updateRememberedValue(mutableTransitionState);
                            obj = mutableTransitionState;
                        }
                        MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj;
                        composer2.endReplaceGroup();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        EnterTransition floatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((Density) consume).mo424toPx0680j_4(JumpToBottomKt.getJumpBottomPadding()));
                        final Function0<Unit> function0 = onClick;
                        final long j162 = j142;
                        final long j172 = j152;
                        AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, floatingButtonEnterTransition, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(600504953, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                float f = 48;
                                Modifier m274borderxT4_qwU = BorderKt.m274borderxT4_qwU(SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, JumpToBottomKt.getJumpBottomPadding()), Dp.m8401constructorimpl(f)), Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer3, 6).m12161getDivider0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50));
                                Function0<Unit> function02 = function0;
                                long j18 = j162;
                                final long j19 = j172;
                                ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m274borderxT4_qwU);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                FloatingActionButtonKt.m2817FloatingActionButtonXz6DiA(function02, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50), j18, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(2122957953, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i12) {
                                        if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_chevron_down, composer4, 0), "Jump to bottom", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), j19, composer4, 440, 0);
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 12582960, 112);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                            }
                        }, composer2, 54), composer2, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390, 0);
            j9 = j5;
            j10 = j6;
            str4 = str3;
            modifier2 = companion;
            j11 = j122;
            final long j172 = j7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str2 = str;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i3 |= i5;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        startRestartGroup.endDefaults();
        final long j1222 = j8;
        final String str522 = str3;
        final long j1322 = j7;
        ComposableLambda rememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(-1557616541, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                    String str6 = str522;
                    if (str6 == null) {
                        return;
                    }
                    JumpToBottomKt.m11992UnreadBadgeeaDK9VM(OffsetKt.m791offsetVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(Dp.m8401constructorimpl(-5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str6, j1322, j1222, composer2, 6, 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54);
        final long j1422 = j5;
        final long j1522 = j6;
        BadgeKt.BadgedBox(rememberComposableLambda22, companion, ComposableLambdaKt.rememberComposableLambda(1814183329, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope BadgedBox, Composer composer2, int i10) {
                Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                if ((i10 & 81) != 16 || !composer2.getSkipping()) {
                    composer2.startReplaceGroup(-1483768023);
                    Object rememberedValue = composer2.rememberedValue();
                    Object obj = rememberedValue;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        MutableTransitionState mutableTransitionState = new MutableTransitionState(false);
                        mutableTransitionState.setTargetState$animation_core(true);
                        composer2.updateRememberedValue(mutableTransitionState);
                        obj = mutableTransitionState;
                    }
                    MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj;
                    composer2.endReplaceGroup();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    EnterTransition floatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((Density) consume).mo424toPx0680j_4(JumpToBottomKt.getJumpBottomPadding()));
                    final Function0<Unit> function0 = onClick;
                    final long j162 = j1422;
                    final long j1722 = j1522;
                    AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, floatingButtonEnterTransition, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(600504953, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i11) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            float f = 48;
                            Modifier m274borderxT4_qwU = BorderKt.m274borderxT4_qwU(SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, JumpToBottomKt.getJumpBottomPadding()), Dp.m8401constructorimpl(f)), Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer3, 6).m12161getDivider0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50));
                            Function0<Unit> function02 = function0;
                            long j18 = j162;
                            final long j19 = j1722;
                            ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m274borderxT4_qwU);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            FloatingActionButtonKt.m2817FloatingActionButtonXz6DiA(function02, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50), j18, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(2122957953, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i12) {
                                    if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_chevron_down, composer4, 0), "Jump to bottom", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), j19, composer4, 440, 0);
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 12582960, 112);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                        }
                    }, composer2, 54), composer2, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i3 << 3) & 112) | 390, 0);
        j9 = j5;
        j10 = j6;
        str4 = str3;
        modifier2 = companion;
        j11 = j1222;
        final long j1722 = j7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final long getChevronColor(Composer composer, int i) {
        long m5694getWhite0d7_KjU;
        composer.startReplaceGroup(179733836);
        int i2 = WhenMappings.$EnumSwitchMapping$0[IntercomColorsKt.getCurrentThemeMode().getValue().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-131337428);
            composer.endReplaceGroup();
            m5694getWhite0d7_KjU = Color.INSTANCE.m5694getWhite0d7_KjU();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-131335814);
            m5694getWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, 6).m12148getActionContrastWhite0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-131339113);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(223602727);
            m5694getWhite0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? Color.INSTANCE.m5694getWhite0d7_KjU() : IntercomTheme.INSTANCE.getColors(composer, 6).m12148getActionContrastWhite0d7_KjU();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return m5694getWhite0d7_KjU;
    }

    @IntercomPreviews
    private static final void JumpToBottomPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1260816059);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$JumpToBottomKt.INSTANCE.m11956getLambda1$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit JumpToBottomPreview$lambda$1;
                    JumpToBottomPreview$lambda$1 = JumpToBottomKt.JumpToBottomPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return JumpToBottomPreview$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnreadBadge-eaDK9VM, reason: not valid java name */
    public static final void m11992UnreadBadgeeaDK9VM(Modifier modifier, final String str, long j, long j2, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        long j3;
        long j4;
        long j5;
        Modifier modifier3;
        final long j6;
        final long j7;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(885989429);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j3 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            j4 = j2;
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 4) != 0) {
                    j3 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12147getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j4 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12168getOnAction0d7_KjU();
                    i3 &= -7169;
                }
                j5 = j4;
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                j5 = j4;
                modifier3 = modifier2;
            }
            final long j8 = j5;
            long j9 = j3;
            startRestartGroup.endDefaults();
            BadgeKt.m2361BadgeeopBjH0(modifier3, j9, 0L, ComposableLambdaKt.rememberComposableLambda(-480925784, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$UnreadBadge$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Badge, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
                    if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        TextStyle type05 = IntercomTheme.INSTANCE.getTypography(composer2, 6).getType05();
                        int m8257getCentere0LSkKk = TextAlign.INSTANCE.m8257getCentere0LSkKk();
                        TextKt.m3581TextNvy7gAk(str, companion2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(type05, j8, TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, m8257getCentere0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744440, null), composer2, 48, 0, 131068);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112), 4);
            j6 = j8;
            modifier2 = modifier3;
            j7 = j9;
        } else {
            startRestartGroup.skipToGroupEnd();
            j7 = j3;
            j6 = j4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadBadge_eaDK9VM$lambda$2;
                    UnreadBadge_eaDK9VM$lambda$2 = JumpToBottomKt.UnreadBadge_eaDK9VM$lambda$2(Modifier.this, str, j7, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadBadge_eaDK9VM$lambda$2;
                }
            });
        }
    }
}
