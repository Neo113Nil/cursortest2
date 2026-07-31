package com.composeunstyled;

import android.view.KeyEvent;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0019\u001a\u00020\u001a2\u001d\u0010\u001b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0080\bø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"AppearInstantly", "Landroidx/compose/animation/EnterTransition;", "getAppearInstantly", "()Landroidx/compose/animation/EnterTransition;", "DisappearInstantly", "Landroidx/compose/animation/ExitTransition;", "getDisappearInstantly", "()Landroidx/compose/animation/ExitTransition;", "NoPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getNoPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "LocalContentColor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "getLocalContentColor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "isKeyDown", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isKeyDown-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "buildModifier", "Landroidx/compose/ui/Modifier;", "builder", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final EnterTransition AppearInstantly = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null);
    private static final ExitTransition DisappearInstantly = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null);
    private static final PaddingValues NoPadding = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Color>() { // from class: com.composeunstyled.UtilsKt$LocalContentColor$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m5647boximpl(m9562invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m9562invoke0d7_KjU() {
            return Color.INSTANCE.m5693getUnspecified0d7_KjU();
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.composeunstyled.UtilsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TextStyle LocalTextStyle$lambda$0;
            LocalTextStyle$lambda$0 = UtilsKt.LocalTextStyle$lambda$0();
            return LocalTextStyle$lambda$0;
        }
    }, 1, null);

    public static final EnterTransition getAppearInstantly() {
        return AppearInstantly;
    }

    public static final ExitTransition getDisappearInstantly() {
        return DisappearInstantly;
    }

    public static final PaddingValues getNoPadding() {
        return NoPadding;
    }

    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle LocalTextStyle$lambda$0() {
        return TextStyle.INSTANCE.getDefault();
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* renamed from: isKeyDown-ZmokQxo, reason: not valid java name */
    public static final boolean m9561isKeyDownZmokQxo(KeyEvent isKeyDown) {
        Intrinsics.checkNotNullParameter(isKeyDown, "$this$isKeyDown");
        return KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(isKeyDown), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY());
    }

    public static final Modifier buildModifier(Function1<? super List<Modifier>, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        List createListBuilder = CollectionsKt.createListBuilder();
        builder.invoke(createListBuilder);
        List build = CollectionsKt.build(createListBuilder);
        Modifier.Companion companion = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion2 = companion;
        Iterator it = build.iterator();
        while (it.hasNext()) {
            companion2 = companion2.then((Modifier) it.next());
        }
        return companion2;
    }
}
