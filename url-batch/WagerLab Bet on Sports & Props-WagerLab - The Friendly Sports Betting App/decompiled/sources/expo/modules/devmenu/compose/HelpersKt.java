package expo.modules.devmenu.compose;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: helpers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"fromHex", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Color$Companion;", "colorString", "", "(Landroidx/compose/ui/graphics/Color$Companion;Ljava/lang/String;)J", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HelpersKt {
    public static final long fromHex(Color.Companion companion, String colorString) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(colorString, "colorString");
        return ColorKt.Color(android.graphics.Color.parseColor(colorString));
    }
}
