package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationKebab.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aU\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0004H\u0002\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0004H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0004H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¨\u0006\u0015"}, d2 = {"ConversationKebab", "", "headerMenuItems", "", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "onMenuClicked", "Lkotlin/Function1;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "trackMetric", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "ConversationKebab-cf5BqRc", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "shouldShowUnreadDot", "", "badgeText", "", "icon", "", "metricData", "isMoreMenuContext", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationKebabKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$4(List list, Function1 function1, long j, Function1 function12, int i, int i2, Composer composer, int i3) {
        m11272ConversationKebabcf5BqRc(list, function1, j, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$14(List list, Function1 function1, long j, Function1 function12, int i, int i2, Composer composer, int i3) {
        m11272ConversationKebabcf5BqRc(list, function1, j, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$0(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$1(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* renamed from: ConversationKebab-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11272ConversationKebabcf5BqRc(List<? extends HeaderMenuItem> list, Function1<? super HeaderMenuItem, Unit> function1, long j, Function1<? super MetricData, Unit> function12, Composer composer, final int i, final int i2) {
        Function1<? super HeaderMenuItem, Unit> function13;
        int i3;
        long j2;
        int i4;
        Function1<? super MetricData, Unit> function14;
        final List<? extends HeaderMenuItem> emptyList;
        int hashCode;
        Composer m4976constructorimpl;
        Iterator<T> it;
        Object obj;
        HeaderMenuItem headerMenuItem;
        HeaderMenuItem.TotalCountIndicator totalCountIndicator;
        final MutableState mutableState;
        List<? extends HeaderMenuItem> list2;
        Function1<? super MetricData, Unit> function15;
        Function1<? super HeaderMenuItem, Unit> function16;
        final List<? extends HeaderMenuItem> list3;
        final Function1<? super HeaderMenuItem, Unit> function17;
        final long j3;
        final Function1<? super MetricData, Unit> function18;
        Composer startRestartGroup = composer.startRestartGroup(1084184456);
        int currentMarker = startRestartGroup.getCurrentMarker();
        int i5 = i2 & 1;
        int i6 = i5 != 0 ? i | 2 : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 112) == 0) {
            function13 = function1;
            i6 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 896) == 0) {
                j2 = j;
                i6 |= startRestartGroup.changed(j2) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i6 |= 3072;
                } else if ((i & 7168) == 0) {
                    function14 = function12;
                    i6 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    if (i5 == 1 || (i6 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                        emptyList = i5 == 0 ? CollectionsKt.emptyList() : list;
                        Function1<? super HeaderMenuItem, Unit> function19 = i7 == 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit ConversationKebab_cf5BqRc$lambda$0;
                                ConversationKebab_cf5BqRc$lambda$0 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj2);
                                return ConversationKebab_cf5BqRc$lambda$0;
                            }
                        } : function13;
                        long m5683getBlack0d7_KjU = i3 == 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j2;
                        Function1<? super MetricData, Unit> function110 = i4 == 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit ConversationKebab_cf5BqRc$lambda$1;
                                ConversationKebab_cf5BqRc$lambda$1 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1((MetricData) obj2);
                                return ConversationKebab_cf5BqRc$lambda$1;
                            }
                        } : function14;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
                        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(2047867882);
                        it = emptyList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (((HeaderMenuItem) obj) instanceof HeaderMenuItem.Messages) {
                                    break;
                                }
                            }
                        }
                        headerMenuItem = (HeaderMenuItem) obj;
                        if (headerMenuItem == null) {
                            Intrinsics.checkNotNull(headerMenuItem, "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages");
                            totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                        } else {
                            totalCountIndicator = null;
                        }
                        String unreadMessagesCount = !(totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) ? ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount() : null;
                        boolean z = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                        if (!emptyList.isEmpty()) {
                            startRestartGroup.startReplaceGroup(2048373646);
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endToMarker(currentMarker);
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final Function1<? super HeaderMenuItem, Unit> function111 = function19;
                                final Function1<? super MetricData, Unit> function112 = function110;
                                final long j4 = m5683getBlack0d7_KjU;
                                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        Unit ConversationKebab_cf5BqRc$lambda$13$lambda$4;
                                        ConversationKebab_cf5BqRc$lambda$13$lambda$4 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(emptyList, function111, j4, function112, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                        return ConversationKebab_cf5BqRc$lambda$13$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        List<? extends HeaderMenuItem> list4 = emptyList;
                        final Function1<? super HeaderMenuItem, Unit> function113 = function19;
                        final Function1<? super MetricData, Unit> function114 = function110;
                        if (list4.size() == 1) {
                            startRestartGroup.startReplaceGroup(2048472753);
                            final HeaderMenuItem headerMenuItem2 = (HeaderMenuItem) CollectionsKt.first((List) list4);
                            String text = headerMenuItem2.getLabel().getText(startRestartGroup, StringProvider.$stable);
                            int icon = icon(headerMenuItem2);
                            boolean enabled = headerMenuItem2.getEnabled();
                            startRestartGroup.startReplaceGroup(-1180838359);
                            boolean changed = ((i6 & 112) == 32) | startRestartGroup.changed(headerMenuItem2) | ((i6 & 7168) == 2048);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5;
                                        ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(Function1.this, headerMenuItem2, function114);
                                        return ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            HeaderMenuItemRowKt.m11281HeaderMenuItemRow6RhP_wg(null, text, icon, unreadMessagesCount, false, z, false, (Function0) rememberedValue, enabled, m5683getBlack0d7_KjU, startRestartGroup, ((i6 << 21) & 1879048192) | 1572864, 17);
                            startRestartGroup.endReplaceGroup();
                            function15 = function114;
                            function16 = function113;
                            list2 = list4;
                        } else {
                            String str = unreadMessagesCount;
                            startRestartGroup.startReplaceGroup(2049182219);
                            startRestartGroup.startReplaceGroup(-1180824432);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final MutableState mutableState2 = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
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
                            Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            int i8 = R.drawable.intercom_kebab;
                            boolean z2 = !((Boolean) mutableState2.getValue()).booleanValue();
                            startRestartGroup.startReplaceGroup(-1935443118);
                            boolean z3 = (i6 & 7168) == 2048;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8;
                                        ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(MutableState.this, function114);
                                        return ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            HeaderMenuItemRowKt.m11281HeaderMenuItemRow6RhP_wg(null, "More Menu", i8, str, z2, z, false, (Function0) rememberedValue3, true, m5683getBlack0d7_KjU, startRestartGroup, ((i6 << 21) & 1879048192) | 102236208, 1);
                            Modifier m894width3ABfNKs = SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(220));
                            boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                            long m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                            CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                            float m8401constructorimpl = Dp.m8401constructorimpl(8);
                            startRestartGroup.startReplaceGroup(-1935428387);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                mutableState = mutableState2;
                                rememberedValue4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10;
                                        ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(MutableState.this);
                                        return ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                mutableState = mutableState2;
                            }
                            startRestartGroup.endReplaceGroup();
                            ConversationKebabKt$ConversationKebab$3$3$3 conversationKebabKt$ConversationKebab$3$3$3 = new ConversationKebabKt$ConversationKebab$3$3$3(list4, function113, function114, m5683getBlack0d7_KjU, mutableState);
                            list2 = list4;
                            function15 = function114;
                            function16 = function113;
                            AndroidMenu_androidKt.m2305DropdownMenuIlH_yew(booleanValue, (Function0) rememberedValue4, m894width3ABfNKs, 0L, null, null, small, m12152getBackground0d7_KjU, 0.0f, m8401constructorimpl, null, ComposableLambdaKt.rememberComposableLambda(1309645384, true, conversationKebabKt$ConversationKebab$3$3$3, startRestartGroup, 54), startRestartGroup, 805306800, 48, 1336);
                            startRestartGroup = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        list3 = list2;
                        function17 = function16;
                        j3 = m5683getBlack0d7_KjU;
                        function18 = function15;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        list3 = list;
                        function17 = function13;
                        j3 = j2;
                        function18 = function14;
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit ConversationKebab_cf5BqRc$lambda$14;
                                ConversationKebab_cf5BqRc$lambda$14 = ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, function17, j3, function18, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return ConversationKebab_cf5BqRc$lambda$14;
                            }
                        });
                        return;
                    }
                    return;
                }
                function14 = function12;
                if (i5 == 1) {
                }
                if (i5 == 0) {
                }
                if (i7 == 0) {
                }
                if (i3 == 0) {
                }
                if (i4 == 0) {
                }
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash3);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(2047867882);
                it = emptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                headerMenuItem = (HeaderMenuItem) obj;
                if (headerMenuItem == null) {
                }
                if (!(totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator)) {
                }
                boolean z4 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (!emptyList.isEmpty()) {
                }
            }
            j2 = j;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function14 = function12;
            if (i5 == 1) {
            }
            if (i5 == 0) {
            }
            if (i7 == 0) {
            }
            if (i3 == 0) {
            }
            if (i4 == 0) {
            }
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash32);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(2047867882);
            it = emptyList.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            headerMenuItem = (HeaderMenuItem) obj;
            if (headerMenuItem == null) {
            }
            if (!(totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator)) {
            }
            boolean z42 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (!emptyList.isEmpty()) {
            }
        }
        function13 = function1;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        j2 = j;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function14 = function12;
        if (i5 == 1) {
        }
        if (i5 == 0) {
        }
        if (i7 == 0) {
        }
        if (i3 == 0) {
        }
        if (i4 == 0) {
        }
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash322);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(2047867882);
        it = emptyList.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        headerMenuItem = (HeaderMenuItem) obj;
        if (headerMenuItem == null) {
        }
        if (!(totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator)) {
        }
        boolean z422 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
        if (!emptyList.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(Function1 function1, HeaderMenuItem menuItem, Function1 function12) {
        Intrinsics.checkNotNullParameter(menuItem, "$menuItem");
        function1.invoke(menuItem);
        function12.invoke(metricData(menuItem, false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(MutableState isExpanded, Function1 function1) {
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        isExpanded.setValue(Boolean.valueOf(!((Boolean) isExpanded.getValue()).booleanValue()));
        function1.invoke(MetricData.MoreMenuClicked.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(MutableState isExpanded) {
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        isExpanded.setValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowUnreadDot(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return ((HeaderMenuItem.Tickets) headerMenuItem).getHasUnreadTickets();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String badgeText(HeaderMenuItem headerMenuItem) {
        if (!(headerMenuItem instanceof HeaderMenuItem.Messages)) {
            return null;
        }
        String unreadMessagesCount = ((HeaderMenuItem.Messages) headerMenuItem).getUnreadMessagesCount();
        return unreadMessagesCount.length() != 0 ? unreadMessagesCount : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int icon(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return R.drawable.intercom_inbox;
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return R.drawable.intercom_send_message_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return R.drawable.intercom_ticket_detail_icon;
        }
        if (!(headerMenuItem instanceof HeaderMenuItem.Help)) {
            throw new NoWhenBranchMatchedException();
        }
        return R.drawable.intercom_help_centre_icon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MetricData metricData(HeaderMenuItem headerMenuItem, boolean z) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return new MetricData.ConversationsInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return new MetricData.TicketsInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return new MetricData.NewConversationInMoreMenuClicked(z);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return MetricData.HelpInMoreMenuClicked.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
