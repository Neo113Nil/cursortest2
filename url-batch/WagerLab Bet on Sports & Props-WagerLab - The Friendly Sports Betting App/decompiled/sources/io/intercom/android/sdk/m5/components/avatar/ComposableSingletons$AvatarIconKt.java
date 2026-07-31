package io.intercom.android.sdk.m5.components.avatar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarIcon.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$AvatarIconKt {
    public static final ComposableSingletons$AvatarIconKt INSTANCE = new ComposableSingletons$AvatarIconKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f168lambda1 = ComposableLambdaKt.composableLambdaInstance(478319767, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                float f = 36;
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create, false, 2, null), null, false, 0L, null, composer, 70, 60);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer, 6);
                Avatar create2 = Avatar.create("", "");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create2, false, 2, null), null, false, 0L, null, composer, 70, 60);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f169lambda2 = ComposableLambdaKt.composableLambdaInstance(1133377969, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                float f = 36;
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create, false, 2, null), null, true, 0L, null, composer, 3142, 52);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer, 6);
                Avatar create2 = Avatar.create("", "");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create2, false, 2, null), null, true, 0L, null, composer, 3142, 52);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f170lambda3 = ComposableLambdaKt.composableLambdaInstance(-613127653, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                float f = 36;
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create, false, 2, null), AvatarIconKt.getComposeShape(AvatarShape.SQUIRCLE), false, 0L, null, composer, 70, 56);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer, 6);
                Avatar create2 = Avatar.create("", "");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create2, false, 2, null), AvatarIconKt.getComposeShape(AvatarShape.SQUIRCLE), false, 0L, null, composer, 70, 56);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f171lambda4 = ComposableLambdaKt.composableLambdaInstance(1717030665, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                float f = 36;
                float f2 = 4;
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create, false, 2, null), new OverlappedAvatarShape(RoundedCornerShapeKt.getCircleShape(), null, Dp.m8401constructorimpl(f2), 2, null), false, 0L, null, composer, 70, 56);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer, 6);
                Avatar create2 = Avatar.create("", "");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create2, false, 2, null), new OverlappedAvatarShape(RoundedCornerShapeKt.getCircleShape(), null, Dp.m8401constructorimpl(f2), 2, null), false, 0L, null, composer, 70, 56);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f172lambda5 = ComposableLambdaKt.composableLambdaInstance(1497731705, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.ComposableSingletons$AvatarIconKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                float f = 36;
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create, true), null, false, 0L, null, composer, 70, 60);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer, 6);
                Avatar create2 = Avatar.create("", "");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), new AvatarWrapper(create2, true), null, false, 0L, null, composer, 70, 60);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11195getLambda1$intercom_sdk_base_release() {
        return f168lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11196getLambda2$intercom_sdk_base_release() {
        return f169lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11197getLambda3$intercom_sdk_base_release() {
        return f170lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11198getLambda4$intercom_sdk_base_release() {
        return f171lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11199getLambda5$intercom_sdk_base_release() {
        return f172lambda5;
    }
}
