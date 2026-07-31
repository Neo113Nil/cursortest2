package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListAttributeCollector.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ListAttributeCollectorKt$ListAttributeCollector$3 implements Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> {
    final /* synthetic */ AttributeData $attributeData;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
    final /* synthetic */ boolean $showDropdownMenu;
    final /* synthetic */ boolean $submitted;
    final /* synthetic */ MutableState<String> $value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    ListAttributeCollectorKt$ListAttributeCollector$3(boolean z, boolean z2, AttributeData attributeData, MutableState<String> mutableState, boolean z3, boolean z4, MutableState<Boolean> mutableState2, Function1<? super AttributeData, Unit> function1) {
        this.$disabled = z;
        this.$showDropdownMenu = z2;
        this.$attributeData = attributeData;
        this.$value$delegate = mutableState;
        this.$submitted = z3;
        this.$loading = z4;
        this.$expanded$delegate = mutableState2;
        this.$onSubmitAttribute = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer, Integer num) {
        invoke(exposedDropdownMenuBoxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, Composer composer, int i) {
        int i2;
        String ListAttributeCollector$lambda$5;
        boolean z;
        Object rememberedValue;
        boolean ListAttributeCollector$lambda$2;
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(ExposedDropdownMenuBox) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            Modifier m2762menuAnchor2Hz36ac$default = ExposedDropdownMenuBoxScope.m2762menuAnchor2Hz36ac$default(ExposedDropdownMenuBox, SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(40)), ExposedDropdownMenuAnchorType.INSTANCE.m2758getPrimaryNotEditableoYjWRB4(), false, 2, null);
            ListAttributeCollector$lambda$5 = ListAttributeCollectorKt.ListAttributeCollector$lambda$5(this.$value$delegate);
            boolean z2 = !this.$disabled;
            Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ListAttributeCollectorKt$ListAttributeCollector$3.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            };
            Function2<Composer, Integer, Unit> m12270getLambda1$intercom_sdk_base_release = ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12270getLambda1$intercom_sdk_base_release();
            final boolean z3 = this.$submitted;
            final boolean z4 = this.$loading;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(ListAttributeCollector$lambda$5, function1, m2762menuAnchor2Hz36ac$default, z2, true, null, null, m12270getLambda1$intercom_sdk_base_release, null, ComposableLambdaKt.rememberComposableLambda(-1903726860, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(PaddingKt.m841paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8401constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m8401constructorimpl(40));
                        Alignment center = Alignment.INSTANCE.getCenter();
                        boolean z5 = z3;
                        boolean z6 = z4;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m889size3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z5) {
                            composer2.startReplaceGroup(-1795451461);
                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer2, 0), (String) null, (Modifier) null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer2, 56, 4);
                            composer2.endReplaceGroup();
                        } else if (z6) {
                            composer2.startReplaceGroup(175868479);
                            ProgressIndicatorKt.m3156CircularProgressIndicator4lLiAd8(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(20)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), Dp.m8401constructorimpl(3), 0L, 0, 0.0f, composer2, 390, 56);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1795433709);
                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_list_arrow_down, composer2, 0), (String) null, (Modifier) null, 0L, composer2, 56, 12);
                            composer2.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), false, null, null, null, true, 0, 0, null, null, null, null, composer, 817913904, 24576, 0, 2080096);
            if (this.$showDropdownMenu) {
                if (!this.$attributeData.isFormDisabled()) {
                    ListAttributeCollector$lambda$2 = ListAttributeCollectorKt.ListAttributeCollector$lambda$2(this.$expanded$delegate);
                    if (ListAttributeCollector$lambda$2) {
                        z = true;
                        long m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                        CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(composer, IntercomTheme.$stable).getSmall();
                        float m8401constructorimpl = Dp.m8401constructorimpl(8);
                        composer.startReplaceGroup(-742015086);
                        final MutableState<Boolean> mutableState = this.$expanded$delegate;
                        rememberedValue = composer.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$2$lambda$1;
                                    invoke$lambda$2$lambda$1 = ListAttributeCollectorKt$ListAttributeCollector$3.invoke$lambda$2$lambda$1(MutableState.this);
                                    return invoke$lambda$2$lambda$1;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        ExposedDropdownMenuBox.m2764ExposedDropdownMenuvNxi1II(z, (Function0) rememberedValue, null, null, false, small, m12152getBackground0d7_KjU, 0.0f, m8401constructorimpl, null, ComposableLambdaKt.rememberComposableLambda(-1185294213, true, new AnonymousClass4(this.$attributeData, this.$onSubmitAttribute, this.$value$delegate, this.$expanded$delegate), composer, 54), composer, 100663344, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | ((i2 << 3) & 112), 668);
                        return;
                    }
                }
                z = false;
                long m12152getBackground0d7_KjU2 = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                CornerBasedShape small2 = IntercomTheme.INSTANCE.getShapes(composer, IntercomTheme.$stable).getSmall();
                float m8401constructorimpl2 = Dp.m8401constructorimpl(8);
                composer.startReplaceGroup(-742015086);
                final MutableState mutableState2 = this.$expanded$delegate;
                rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                ExposedDropdownMenuBox.m2764ExposedDropdownMenuvNxi1II(z, (Function0) rememberedValue, null, null, false, small2, m12152getBackground0d7_KjU2, 0.0f, m8401constructorimpl2, null, ComposableLambdaKt.rememberComposableLambda(-1185294213, true, new AnonymousClass4(this.$attributeData, this.$onSubmitAttribute, this.$value$delegate, this.$expanded$delegate), composer, 54), composer, 100663344, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | ((i2 << 3) & 112), 668);
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* compiled from: ListAttributeCollector.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4, reason: invalid class name */
    static final class AnonymousClass4 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ MutableState<Boolean> $expanded$delegate;
        final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
        final /* synthetic */ MutableState<String> $value$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AttributeData attributeData, Function1<? super AttributeData, Unit> function1, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
            this.$attributeData = attributeData;
            this.$onSubmitAttribute = function1;
            this.$value$delegate = mutableState;
            this.$expanded$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ExposedDropdownMenu, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                List<String> options = this.$attributeData.getAttribute().getOptions();
                if (options == null) {
                    return;
                }
                final Function1<AttributeData, Unit> function1 = this.$onSubmitAttribute;
                final AttributeData attributeData = this.$attributeData;
                final MutableState<String> mutableState = this.$value$delegate;
                final MutableState<Boolean> mutableState2 = this.$expanded$delegate;
                for (final String str : options) {
                    AndroidMenu_androidKt.DropdownMenuItem(ComposableLambdaKt.rememberComposableLambda(1941734396, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                TextKt.m3581TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, composer, 54), new Function0() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = ListAttributeCollectorKt$ListAttributeCollector$3.AnonymousClass4.invoke$lambda$1$lambda$0(str, function1, attributeData, mutableState, mutableState2);
                            return invoke$lambda$1$lambda$0;
                        }
                    }, null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String option, Function1 function1, AttributeData attributeData, MutableState value$delegate, MutableState expanded$delegate) {
            Intrinsics.checkNotNullParameter(option, "$option");
            Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
            Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
            Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
            value$delegate.setValue(option);
            ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
            function1.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, option, 127, null), null, false, 6, null));
            return Unit.INSTANCE;
        }
    }
}
