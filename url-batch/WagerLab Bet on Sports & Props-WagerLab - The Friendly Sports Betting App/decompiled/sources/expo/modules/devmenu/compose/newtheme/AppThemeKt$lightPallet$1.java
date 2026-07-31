package expo.modules.devmenu.compose.newtheme;

import androidx.compose.ui.graphics.Color;
import io.github.lukmccall.colors.RawColor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppTheme.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class AppThemeKt$lightPallet$1 extends FunctionReferenceImpl implements Function1<RawColor, Color> {
    public static final AppThemeKt$lightPallet$1 INSTANCE = new AppThemeKt$lightPallet$1();

    AppThemeKt$lightPallet$1() {
        super(1, AppThemeKt.class, "defaultColorConverter", "defaultColorConverter(Lio/github/lukmccall/colors/RawColor;)J", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Color invoke(RawColor rawColor) {
        return Color.m5647boximpl(m10765invokevNxB06k(rawColor));
    }

    /* renamed from: invoke-vNxB06k, reason: not valid java name */
    public final long m10765invokevNxB06k(RawColor p0) {
        long defaultColorConverter;
        Intrinsics.checkNotNullParameter(p0, "p0");
        defaultColorConverter = AppThemeKt.defaultColorConverter(p0);
        return defaultColorConverter;
    }
}
