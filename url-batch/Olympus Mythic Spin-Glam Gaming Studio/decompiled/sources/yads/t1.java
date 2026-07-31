package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 {
    public static final String a = com.safedk.android.utils.h.y + ".common.AdActivity has missed configuration attribute %s.";
    public static final Map b = MapsKt.mapOf(TuplesKt.to(16, "ActivityInfo.CONFIG_KEYBOARD"), TuplesKt.to(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), TuplesKt.to(128, "ActivityInfo.CONFIG_ORIENTATION"), TuplesKt.to(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), TuplesKt.to(512, "ActivityInfo.CONFIG_UI_MODE"), TuplesKt.to(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), TuplesKt.to(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ActivityInfo activityInfo) {
        String str;
        Map map = b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Number) entry.getKey()).intValue();
            String str2 = (String) entry.getValue();
            if ((intValue & activityInfo.configChanges) == 0) {
                str = str2;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next) != null) {
                str = next;
                break;
            }
        }
        String str3 = str;
        if (str3 == null) {
            return;
        }
        String format = String.format(a, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        throw new ja1(format);
    }
}
