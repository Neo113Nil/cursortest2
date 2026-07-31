package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeCollectorCard.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001am\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"AttributeCollectorCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "attributes", "", "Lio/intercom/android/sdk/models/Attribute;", "failedAttributeIdentifiers", "", "loadingAttributeIdentifiers", "partId", "isFormDisabled", "", "onSubmitAttribute", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BooleanAttributeCard", "(Landroidx/compose/runtime/Composer;I)V", "ListAttributeCard", "TextAttributeCard", "MultipleAttributeCard", "intercom-sdk-base_release", "validationError"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AttributeCollectorCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributeCollectorCard$lambda$1(Modifier modifier, List attributes, List list, List list2, String partId, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(attributes, "$attributes");
        Intrinsics.checkNotNullParameter(partId, "$partId");
        AttributeCollectorCard(modifier, attributes, list, list2, partId, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BooleanAttributeCard$lambda$2(int i, Composer composer, int i2) {
        BooleanAttributeCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListAttributeCard$lambda$3(int i, Composer composer, int i2) {
        ListAttributeCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleAttributeCard$lambda$5(int i, Composer composer, int i2) {
        MultipleAttributeCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextAttributeCard$lambda$4(int i, Composer composer, int i2) {
        TextAttributeCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributeCollectorCard$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void AttributeCollectorCard(Modifier modifier, final List<Attribute> attributes, List<String> list, List<String> list2, final String partId, boolean z, Function1<? super AttributeData, Unit> function1, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(partId, "partId");
        Composer startRestartGroup = composer.startRestartGroup(-136461083);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        List<String> emptyList = (i2 & 4) != 0 ? CollectionsKt.emptyList() : list;
        List<String> emptyList2 = (i2 & 8) != 0 ? CollectionsKt.emptyList() : list2;
        boolean z2 = (i2 & 32) != 0 ? false : z;
        Function1<? super AttributeData, Unit> function12 = (i2 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AttributeCollectorCard$lambda$0;
                AttributeCollectorCard$lambda$0 = AttributeCollectorCardKt.AttributeCollectorCard$lambda$0((AttributeData) obj);
                return AttributeCollectorCard$lambda$0;
            }
        } : function1;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Resources resources = ((Context) consume).getResources();
        IntercomCardStyle.Style m11975conversationCardStylePEIptTM = IntercomCardStyle.INSTANCE.m11975conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31);
        final boolean z3 = z2;
        final Function1<? super AttributeData, Unit> function13 = function12;
        AttributeCollectorCardKt$AttributeCollectorCard$2 attributeCollectorCardKt$AttributeCollectorCard$2 = new AttributeCollectorCardKt$AttributeCollectorCard$2(attributes, emptyList, resources, emptyList2, partId, z3, function13);
        final List<String> list3 = emptyList2;
        final List<String> list4 = emptyList;
        final Modifier modifier2 = companion;
        IntercomCardKt.IntercomCard(modifier2, m11975conversationCardStylePEIptTM, ComposableLambdaKt.rememberComposableLambda(-1007698855, true, attributeCollectorCardKt$AttributeCollectorCard$2, startRestartGroup, 54), startRestartGroup, (i & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AttributeCollectorCard$lambda$1;
                    AttributeCollectorCard$lambda$1 = AttributeCollectorCardKt.AttributeCollectorCard$lambda$1(Modifier.this, attributes, list4, list3, partId, z3, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AttributeCollectorCard$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void BooleanAttributeCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-96019153);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m12255getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BooleanAttributeCard$lambda$2;
                    BooleanAttributeCard$lambda$2 = AttributeCollectorCardKt.BooleanAttributeCard$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BooleanAttributeCard$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ListAttributeCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-100505407);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m12257getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ListAttributeCard$lambda$3;
                    ListAttributeCard$lambda$3 = AttributeCollectorCardKt.ListAttributeCard$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ListAttributeCard$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextAttributeCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1807263952);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m12259getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextAttributeCard$lambda$4;
                    TextAttributeCard$lambda$4 = AttributeCollectorCardKt.TextAttributeCard$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextAttributeCard$lambda$4;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void MultipleAttributeCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(327354419);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m12261getLambda8$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MultipleAttributeCard$lambda$5;
                    MultipleAttributeCard$lambda$5 = AttributeCollectorCardKt.MultipleAttributeCard$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MultipleAttributeCard$lambda$5;
                }
            });
        }
    }
}
