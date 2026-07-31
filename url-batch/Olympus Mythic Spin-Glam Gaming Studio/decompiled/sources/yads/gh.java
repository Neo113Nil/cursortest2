package yads;

import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class gh {
    public final mt1 a;
    public final boolean b;

    public gh(mt1 mt1Var, boolean z) {
        this.a = mt1Var;
        this.b = z;
    }

    public final void a(ArrayList arrayList) {
        Iterator it;
        Map map;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bc2 bc2Var = (bc2) it2.next();
            if (this.b) {
                Lazy lazy = ge.a;
                de deVar = bc2Var.a;
                it = it2;
                Pair pair = TuplesKt.to(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) ge.a.getValue()).format(new Date(deVar.a)), 0), new StackTraceElement("ExitInfo", "description", deVar.b, 0), new StackTraceElement("Memory", "pss", ge.a(deVar.f), 0), new StackTraceElement("Memory", "rss", ge.a(deVar.g), 0), new StackTraceElement("Process", "name", deVar.h, 0), new StackTraceElement("Process", "pid", String.valueOf(deVar.e), 0), new StackTraceElement("Process", NotificationCategory.IMPORTANCE_KEY, String.valueOf(deVar.d), 0), new StackTraceElement("Process", "uid", String.valueOf(deVar.j), 0), new StackTraceElement("Process", "status", String.valueOf(deVar.i), 0)});
                map = MapsKt.plus(bc2Var.b, TuplesKt.to((Thread) pair.component1(), (StackTraceElement[]) pair.component2()));
            } else {
                it = it2;
                map = bc2Var.b;
            }
            this.a.b(map);
            it2 = it;
        }
    }
}
