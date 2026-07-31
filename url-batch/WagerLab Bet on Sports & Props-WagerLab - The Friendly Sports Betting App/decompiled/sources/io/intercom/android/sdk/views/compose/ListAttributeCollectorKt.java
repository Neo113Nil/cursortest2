package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListAttributeCollector.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"ListAttributeCollector", "", "modifier", "Landroidx/compose/ui/Modifier;", "attributeData", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "hasErrors", "", "loading", "onSubmitAttribute", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ListAttributePreview", "(Landroidx/compose/runtime/Composer;I)V", "SubmittedListAttributePreview", "DisabledListAttributePreview", "SubmittedAndDisabledListAttributePreview", "intercom-sdk-base_release", "expanded", "value", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListAttributeCollectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledListAttributePreview$lambda$12(int i, Composer composer, int i2) {
        DisabledListAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$9(Modifier modifier, AttributeData attributeData, boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        ListAttributeCollector(modifier, attributeData, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributePreview$lambda$10(int i, Composer composer, int i2) {
        ListAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedAndDisabledListAttributePreview$lambda$13(int i, Composer composer, int i2) {
        SubmittedAndDisabledListAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedListAttributePreview$lambda$11(int i, Composer composer, int i2) {
        SubmittedListAttributePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ListAttributeCollector(Modifier modifier, final AttributeData attributeData, boolean z, boolean z2, Function1<? super AttributeData, Unit> function1, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(attributeData, "attributeData");
        Composer startRestartGroup = composer.startRestartGroup(1993212876);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z3 = false;
        boolean z4 = (i2 & 4) != 0 ? false : z;
        boolean z5 = (i2 & 8) != 0 ? false : z2;
        Function1<? super AttributeData, Unit> function12 = (i2 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ListAttributeCollector$lambda$0;
                ListAttributeCollector$lambda$0 = ListAttributeCollectorKt.ListAttributeCollector$lambda$0((AttributeData) obj);
                return ListAttributeCollector$lambda$0;
            }
        } : function1;
        boolean isFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        startRestartGroup.startReplaceGroup(497283745);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState ListAttributeCollector$lambda$4;
                ListAttributeCollector$lambda$4 = ListAttributeCollectorKt.ListAttributeCollector$lambda$4(AttributeData.this);
                return ListAttributeCollector$lambda$4;
            }
        }, startRestartGroup, 8);
        if (z4 || (!isFormDisabled && !submitted)) {
            z3 = true;
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        boolean ListAttributeCollector$lambda$2 = ListAttributeCollector$lambda$2(mutableState);
        startRestartGroup.startReplaceGroup(497294500);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ListAttributeCollector$lambda$8$lambda$7;
                    ListAttributeCollector$lambda$8$lambda$7 = ListAttributeCollectorKt.ListAttributeCollector$lambda$8$lambda$7(MutableState.this, ((Boolean) obj).booleanValue());
                    return ListAttributeCollector$lambda$8$lambda$7;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceGroup();
        final boolean z6 = z5;
        final Function1<? super AttributeData, Unit> function13 = function12;
        ExposedDropdownMenuKt.ExposedDropdownMenuBox(ListAttributeCollector$lambda$2, (Function1) rememberedValue2, fillMaxWidth$default, ComposableLambdaKt.rememberComposableLambda(1992435426, true, new ListAttributeCollectorKt$ListAttributeCollector$3(isFormDisabled, z3, attributeData, mutableState2, submitted, z6, mutableState, function12), startRestartGroup, 54), startRestartGroup, 3120, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final boolean z7 = z4;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ListAttributeCollector$lambda$9;
                    ListAttributeCollector$lambda$9 = ListAttributeCollectorKt.ListAttributeCollector$lambda$9(Modifier.this, attributeData, z7, z6, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ListAttributeCollector$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ListAttributeCollector$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState ListAttributeCollector$lambda$4(AttributeData attributeData) {
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ListAttributeCollector$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCollector$lambda$8$lambda$7(MutableState expanded$delegate, boolean z) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        ListAttributeCollector$lambda$3(expanded$delegate, z);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void ListAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1324269915);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12272getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ListAttributePreview$lambda$10;
                    ListAttributePreview$lambda$10 = ListAttributeCollectorKt.ListAttributePreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ListAttributePreview$lambda$10;
                }
            });
        }
    }

    public static final void SubmittedListAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-899805828);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12274getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedListAttributePreview$lambda$11;
                    SubmittedListAttributePreview$lambda$11 = ListAttributeCollectorKt.SubmittedListAttributePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedListAttributePreview$lambda$11;
                }
            });
        }
    }

    public static final void DisabledListAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(865192767);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12276getLambda7$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DisabledListAttributePreview$lambda$12;
                    DisabledListAttributePreview$lambda$12 = ListAttributeCollectorKt.DisabledListAttributePreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DisabledListAttributePreview$lambda$12;
                }
            });
        }
    }

    public static final void SubmittedAndDisabledListAttributePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1340154819);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12278getLambda9$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedAndDisabledListAttributePreview$lambda$13;
                    SubmittedAndDisabledListAttributePreview$lambda$13 = ListAttributeCollectorKt.SubmittedAndDisabledListAttributePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedAndDisabledListAttributePreview$lambda$13;
                }
            });
        }
    }
}
