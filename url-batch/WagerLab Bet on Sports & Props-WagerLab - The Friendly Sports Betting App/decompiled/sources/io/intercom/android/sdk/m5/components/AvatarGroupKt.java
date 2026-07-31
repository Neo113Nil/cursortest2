package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarGroup.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"AvatarGroup", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "modifier", "Landroidx/compose/ui/Modifier;", "avatarSize", "Landroidx/compose/ui/unit/Dp;", "placeHolderTextSize", "Landroidx/compose/ui/unit/TextUnit;", "AvatarGroup--J8mCjc", "(Ljava/util/List;Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "AvatarGroupPreview", "(Landroidx/compose/runtime/Composer;I)V", "AvatarGroupWithMixedShapesPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AvatarGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroupPreview$lambda$3(int i, Composer composer, int i2) {
        AvatarGroupPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroupWithMixedShapesPreview$lambda$4(int i, Composer composer, int i2) {
        AvatarGroupWithMixedShapesPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarGroup__J8mCjc$lambda$2(List avatars, Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        m11082AvatarGroupJ8mCjc(avatars, modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: AvatarGroup--J8mCjc, reason: not valid java name */
    public static final void m11082AvatarGroupJ8mCjc(final List<AvatarWrapper> avatars, Modifier modifier, float f, long j, Composer composer, int i, final int i2) {
        int i3;
        long j2;
        int i4;
        Object obj;
        OverlappedAvatarShape overlappedAvatarShape;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Composer startRestartGroup = composer.startRestartGroup(-258460642);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        float m8401constructorimpl = (i2 & 4) != 0 ? Dp.m8401constructorimpl(38) : f;
        if ((i2 & 8) != 0) {
            i3 = i;
            i4 = i3 & (-7169);
            j2 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5().m7866getFontSizeXSAIIZE();
        } else {
            i3 = i;
            j2 = j;
            i4 = i3;
        }
        float f2 = 2;
        float m8401constructorimpl2 = Dp.m8401constructorimpl(f2);
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(-m8401constructorimpl2));
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        final Modifier modifier2 = companion;
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
        startRestartGroup.startReplaceGroup(700807476);
        int i5 = 0;
        for (Object obj2 : avatars) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AvatarWrapper avatarWrapper = (AvatarWrapper) obj2;
            if (i5 == 0) {
                AvatarShape shape = avatarWrapper.getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape, "getShape(...)");
                overlappedAvatarShape = AvatarIconKt.getComposeShape(shape);
                obj = null;
            } else {
                AvatarShape shape2 = avatars.get(i5 - 1).getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape2, "getShape(...)");
                RoundedCornerShape composeShape = AvatarIconKt.getComposeShape(shape2);
                float m8401constructorimpl3 = Dp.m8401constructorimpl(m8401constructorimpl2 * f2);
                AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
                Intrinsics.checkNotNullExpressionValue(shape3, "getShape(...)");
                obj = null;
                overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape3), composeShape, m8401constructorimpl3, null);
            }
            long j3 = j2;
            AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), avatarWrapper, overlappedAvatarShape, false, j3, null, startRestartGroup, (57344 & (i4 << 3)) | 64, 40);
            j2 = j3;
            i5 = i6;
            m8401constructorimpl2 = m8401constructorimpl2;
        }
        final long j4 = j2;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f3 = m8401constructorimpl;
            final int i7 = i3;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit AvatarGroup__J8mCjc$lambda$2;
                    AvatarGroup__J8mCjc$lambda$2 = AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(avatars, modifier2, f3, j4, i7, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    return AvatarGroup__J8mCjc$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AvatarGroupPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2091006176);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m11087getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarGroupKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarGroupPreview$lambda$3;
                    AvatarGroupPreview$lambda$3 = AvatarGroupKt.AvatarGroupPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarGroupPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AvatarGroupWithMixedShapesPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1253949399);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m11088getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.AvatarGroupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarGroupWithMixedShapesPreview$lambda$4;
                    AvatarGroupWithMixedShapesPreview$lambda$4 = AvatarGroupKt.AvatarGroupWithMixedShapesPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarGroupWithMixedShapesPreview$lambda$4;
                }
            });
        }
    }
}
