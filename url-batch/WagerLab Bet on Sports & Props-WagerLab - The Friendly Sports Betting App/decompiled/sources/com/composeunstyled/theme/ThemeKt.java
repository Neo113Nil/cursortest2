package com.composeunstyled.theme;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.graphics.Color;
import com.composeunstyled.UtilsKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\b¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\f\u001a,\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0086\u0004¢\u0006\u0002\u0010\u0017\u001a<\u0010\u0018\u001a\u00020\u00032\u001a\u0010\u0019\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u001a\"\u0006\u0012\u0002\b\u00030\u00132\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u001c\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011*B\u0010\u0000\"\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004*O\u0010\u0005\"'\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00042\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006¢\u0006\u0002\b\u0004¨\u0006\u001d"}, d2 = {"ComposableWithContent", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "ThemeComposable", "Lcom/composeunstyled/theme/ComposableWithContent;", "buildTheme", "Lcom/composeunstyled/theme/ThemeComposable;", "themeAction", "Lcom/composeunstyled/theme/ThemeBuilder;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function3;", "LocalTheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/composeunstyled/theme/ResolvedTheme;", "getLocalTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "provides", "Lcom/composeunstyled/theme/OverriddenValue;", "T", "Lcom/composeunstyled/theme/ThemeToken;", "value", "(Lcom/composeunstyled/theme/ThemeToken;Ljava/lang/Object;)Lcom/composeunstyled/theme/OverriddenValue;", "ThemeOverride", "overriddenValues", "", "content", "([Lcom/composeunstyled/theme/OverriddenValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeKt {
    private static final ProvidableCompositionLocal<ResolvedTheme> LocalTheme = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.composeunstyled.theme.ThemeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ResolvedTheme LocalTheme$lambda$0;
            LocalTheme$lambda$0 = ThemeKt.LocalTheme$lambda$0();
            return LocalTheme$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThemeOverride$lambda$3(OverriddenValue[] overriddenValueArr, Function2 function2, int i, Composer composer, int i2) {
        ThemeOverride(overriddenValueArr, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function3 buildTheme$default(Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            function3 = ComposableSingletons$ThemeKt.INSTANCE.m9563getLambda$463669463$core_release();
        }
        return buildTheme(function3);
    }

    public static final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> buildTheme(final Function3<? super ThemeBuilder, ? super Composer, ? super Integer, Unit> themeAction) {
        Intrinsics.checkNotNullParameter(themeAction, "themeAction");
        return ComposableLambdaKt.composableLambdaInstance(-1812709202, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.composeunstyled.theme.ThemeKt$buildTheme$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(content, "content");
                if ((i & 6) == 0) {
                    i |= composer.changedInstance(content) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1812709202, i, -1, "com.composeunstyled.theme.buildTheme.<anonymous> (Theme.kt:54)");
                }
                composer.startReplaceGroup(1743180697);
                ThemeBuilder themeBuilder = new ThemeBuilder();
                themeAction.invoke(themeBuilder, composer, 0);
                composer.endReplaceGroup();
                SnapshotStateMap<ThemeProperty<?>, ThemeValues<?>> entries$core_release = themeBuilder.getProperties().getEntries$core_release();
                Indication defaultIndication = themeBuilder.getDefaultIndication();
                composer.startReplaceGroup(1743184738);
                if (defaultIndication == null) {
                    ProvidableCompositionLocal<Indication> localIndication = androidx.compose.foundation.IndicationKt.getLocalIndication();
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer.consume(localIndication);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    defaultIndication = (Indication) consume;
                }
                composer.endReplaceGroup();
                TextSelectionColors defaultTextSelectionColors = themeBuilder.getDefaultTextSelectionColors();
                composer.startReplaceGroup(1743187540);
                if (defaultTextSelectionColors == null) {
                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = composer.consume(localTextSelectionColors);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    defaultTextSelectionColors = (TextSelectionColors) consume2;
                }
                composer.endReplaceGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ThemeKt.getLocalTheme().provides(new ResolvedTheme(themeBuilder.getName(), entries$core_release)), androidx.compose.foundation.IndicationKt.getLocalIndication().provides(defaultIndication), UtilsKt.getLocalTextStyle().provides(themeBuilder.getDefaultTextStyle()), UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(themeBuilder.m9565getDefaultContentColor0d7_KjU())), TextSelectionColorsKt.getLocalTextSelectionColors().provides(defaultTextSelectionColors)}, ComposableLambdaKt.rememberComposableLambda(1780057454, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.theme.ThemeKt$buildTheme$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1780057454, i2, -1, "com.composeunstyled.theme.buildTheme.<anonymous>.<anonymous> (Theme.kt:72)");
                        }
                        content.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final ProvidableCompositionLocal<ResolvedTheme> getLocalTheme() {
        return LocalTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTheme LocalTheme$lambda$0() {
        throw new IllegalStateException("No theme was set. In order to use the Theme object you need to wrap your content with a theme @Composable returned by the buildTheme {} function.".toString());
    }

    public static final <T> OverriddenValue<T> provides(ThemeToken<T> themeToken, T t) {
        Intrinsics.checkNotNullParameter(themeToken, "<this>");
        return new OverriddenValue<>(themeToken, t);
    }

    public static final void ThemeOverride(final OverriddenValue<?>[] overriddenValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(overriddenValues, "overriddenValues");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2014969822);
        int i2 = (i & 48) == 0 ? (startRestartGroup.changedInstance(content) ? 32 : 16) | i : i;
        startRestartGroup.startMovableGroup(644252717, Integer.valueOf(overriddenValues.length));
        int i3 = i2 | (startRestartGroup.changed(overriddenValues.length) ? 4 : 0);
        for (OverriddenValue<?> overriddenValue : overriddenValues) {
            i3 |= startRestartGroup.changedInstance(overriddenValue) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2014969822, i3, -1, "com.composeunstyled.theme.ThemeOverride (Theme.kt:121)");
            }
            ProvidableCompositionLocal<ResolvedTheme> providableCompositionLocal = LocalTheme;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ResolvedTheme resolvedTheme = (ResolvedTheme) consume;
            Map mutableMap = MapsKt.toMutableMap(resolvedTheme.getProperties$core_release());
            for (OverriddenValue<?> overriddenValue2 : overriddenValues) {
                Iterator it = mutableMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ThemeValues) ((Map.Entry) obj).getValue()).getValues$core_release().containsKey(overriddenValue2.getToken())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    ThemeProperty themeProperty = (ThemeProperty) entry.getKey();
                    ThemeValues themeValues = (ThemeValues) entry.getValue();
                    Intrinsics.checkNotNull(themeValues, "null cannot be cast to non-null type com.composeunstyled.theme.ThemeValues<kotlin.Any>");
                    ThemeToken<?> token = overriddenValue2.getToken();
                    Intrinsics.checkNotNull(token, "null cannot be cast to non-null type com.composeunstyled.theme.ThemeToken<kotlin.Any>");
                    Object value = overriddenValue2.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                    mutableMap.put(themeProperty, themeValues.copyWithUpdatedValue$core_release(token, value));
                }
            }
            CompositionLocalKt.CompositionLocalProvider(LocalTheme.provides(new ResolvedTheme(resolvedTheme.getName(), mutableMap)), ComposableLambdaKt.rememberComposableLambda(2115294050, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.theme.ThemeKt$ThemeOverride$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2115294050, i4, -1, "com.composeunstyled.theme.ThemeOverride.<anonymous> (Theme.kt:143)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit ThemeOverride$lambda$3;
                    ThemeOverride$lambda$3 = ThemeKt.ThemeOverride$lambda$3(overriddenValues, content, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return ThemeOverride$lambda$3;
                }
            });
        }
    }
}
