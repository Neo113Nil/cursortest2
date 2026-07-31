package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: InlineSourcesSheetContent.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b*\u00020\u000bH\u0002¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"InlineSourcesSheetContent", "", "selectedSources", "", "Lio/intercom/android/sdk/models/InlineSource;", "sources", "Lio/intercom/android/sdk/models/Source;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getHost", "", "kotlin.jvm.PlatformType", "(Ljava/lang/String;)Ljava/lang/String;", "InlineSourcesSheetContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InlineSourcesSheetContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContent$lambda$13(List selectedSources, List sources, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedSources, "$selectedSources");
        Intrinsics.checkNotNullParameter(sources, "$sources");
        InlineSourcesSheetContent(selectedSources, sources, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContentPreview$lambda$14(int i, Composer composer, int i2) {
        InlineSourcesSheetContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InlineSourcesSheetContent(final List<InlineSource> selectedSources, final List<Source> sources, Modifier modifier, Composer composer, final int i, final int i2) {
        String stringResource;
        Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Composer startRestartGroup = composer.startRestartGroup(-2127469664);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m877heightInVpY3zN4$default = SizeKt.m877heightInVpY3zN4$default(fillMaxWidth$default, 0.0f, Dp.m8401constructorimpl(Dp.m8401constructorimpl(((Configuration) consume).screenHeightDp) * 0.5f), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m877heightInVpY3zN4$default);
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
        Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(40), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m8401constructorimpl(16), 7, null);
        if (sources.size() == 1) {
            startRestartGroup.startReplaceGroup(504735737);
            stringResource = StringResources_androidKt.stringResource(R.string.intercom_source, startRestartGroup, 0);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(504813144);
            stringResource = StringResources_androidKt.stringResource(R.string.intercom_sources, startRestartGroup, 0);
            startRestartGroup.endReplaceGroup();
        }
        TextKt.m3581TextNvy7gAk(stringResource, m841paddingqDBjuR0$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 48, 0, 131068);
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit InlineSourcesSheetContent$lambda$12$lambda$11;
                InlineSourcesSheetContent$lambda$12$lambda$11 = InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$12$lambda$11(sources, selectedSources, (LazyListScope) obj);
                return InlineSourcesSheetContent$lambda$12$lambda$11;
            }
        }, startRestartGroup, 0, 511);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InlineSourcesSheetContent$lambda$13;
                    InlineSourcesSheetContent$lambda$13 = InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$13(selectedSources, sources, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return InlineSourcesSheetContent$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesSheetContent$lambda$12$lambda$11(final List sources, final List selectedSources, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(sources, "$sources");
        Intrinsics.checkNotNullParameter(selectedSources, "$selectedSources");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function2 = new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object InlineSourcesSheetContent$lambda$12$lambda$11$lambda$1;
                InlineSourcesSheetContent$lambda$12$lambda$11$lambda$1 = InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$12$lambda$11$lambda$1(((Integer) obj).intValue(), (Source) obj2);
                return InlineSourcesSheetContent$lambda$12$lambda$11$lambda$1;
            }
        };
        LazyColumn.items(sources.size(), new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$12$lambda$11$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), sources.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$12$lambda$11$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                sources.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$12$lambda$11$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                boolean z;
                long m12152getBackground0d7_KjU;
                final long m12150getAdminBackground0d7_KjU;
                int i4;
                String host;
                ComposerKt.sourceInformation(composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final Source source = (Source) sources.get(i);
                composer.startReplaceGroup(-1170545904);
                List list = selectedSources;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((InlineSource) it.next()).getHref(), source.getUrl())) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                final boolean areEqual = Intrinsics.areEqual(source.getType(), "article");
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                final Context context = (Context) consume;
                ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (z) {
                    composer.startReplaceGroup(328640344);
                    m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12150getAdminBackground0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(328753277);
                    m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                    composer.endReplaceGroup();
                }
                Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(BackgroundKt.m262backgroundbw27NRU$default(companion2, m12152getBackground0d7_KjU, null, 2, null), false, null, null, null, new Function0<Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LinkOpener.handleUrl(source.getUrl(), context, Injector.get().getApi(), areEqual);
                    }
                }, 15, null);
                float f = 24;
                Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(PaddingKt.m839paddingVpY3zN4$default(m303clickableoSLSa3U$default, 0.0f, Dp.m8401constructorimpl(f), 1, null), 0.0f, 0.0f, Dp.m8401constructorimpl(f), 0.0f, 11, null);
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m841paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m894width3ABfNKs = SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(40));
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m894width3ABfNKs);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                TextKt.m3581TextNvy7gAk(String.valueOf(i + 1), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType05(), composer, 1572864, 0, 131004);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f2 = 8;
                Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f2));
                ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl4 = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                    m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                    m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                }
                Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, companion3);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl5 = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl5.getInserting() || !Intrinsics.areEqual(m4976constructorimpl5.rememberedValue(), Integer.valueOf(hashCode5))) {
                    m4976constructorimpl5.updateRememberedValue(Integer.valueOf(hashCode5));
                    m4976constructorimpl5.apply(Integer.valueOf(hashCode5), setCompositeKeyHash5);
                }
                Updater.m4983setimpl(m4976constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (z) {
                    composer.startReplaceGroup(1230810970);
                    m12150getAdminBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12178getSourceBackground0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1230925019);
                    m12150getAdminBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12150getAdminBackground0d7_KjU();
                    composer.endReplaceGroup();
                }
                Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f));
                composer.startReplaceGroup(455359193);
                boolean changed = composer.changed(m12150getAdminBackground0d7_KjU);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$2$2$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawBehind) {
                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                            DrawScope.m6217drawCircleVaOC9Bg$default(drawBehind, m12150getAdminBackground0d7_KjU, 0.0f, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier drawBehind = DrawModifierKt.drawBehind(m889size3ABfNKs, (Function1) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, drawBehind);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl6 = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl6.getInserting() || !Intrinsics.areEqual(m4976constructorimpl6.rememberedValue(), Integer.valueOf(hashCode6))) {
                    m4976constructorimpl6.updateRememberedValue(Integer.valueOf(hashCode6));
                    m4976constructorimpl6.apply(Integer.valueOf(hashCode6), setCompositeKeyHash6);
                }
                Updater.m4983setimpl(m4976constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (areEqual) {
                    i4 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_public_article;
                } else {
                    i4 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_link;
                }
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i4, composer, 0), (String) null, boxScopeInstance.align(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(12)), Alignment.INSTANCE.getCenter()), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), composer, 56, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), composer, 6);
                composer.startReplaceGroup(455401337);
                if (!areEqual) {
                    host = InlineSourcesSheetContentKt.getHost(source.getUrl());
                } else {
                    host = StringResources_androidKt.stringResource(R.string.intercom_help_center_article, composer, 0);
                }
                String str = host;
                composer.endReplaceGroup();
                Intrinsics.checkNotNull(str);
                TextKt.m3581TextNvy7gAk(str, null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04Point5(), composer, 0, 0, 131066);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m3581TextNvy7gAk(source.getTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04Point5(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                IntercomDividerKt.IntercomDivider(null, composer, 0, 1);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object InlineSourcesSheetContent$lambda$12$lambda$11$lambda$1(int i, Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String id = source.getId();
        return id.length() == 0 ? "source_" + i + '_' + source.getUrl().hashCode() : id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHost(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return str;
        }
    }

    @IntercomPreviews
    public static final void InlineSourcesSheetContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1197768873);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m11249getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InlineSourcesSheetContentPreview$lambda$14;
                    InlineSourcesSheetContentPreview$lambda$14 = InlineSourcesSheetContentKt.InlineSourcesSheetContentPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InlineSourcesSheetContentPreview$lambda$14;
                }
            });
        }
    }
}
