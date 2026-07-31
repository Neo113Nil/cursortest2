package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class ke {
    public static final Lazy a = LazyKt.lazy(ie.b);
    public static final Lazy b = LazyKt.lazy(je.b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        List groupValues;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = StringsKt.lines(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String obj = StringsKt.trim((String) it.next()).toString();
            MatchResult find$default = Regex.find$default((Regex) b.getValue(), obj, 0, 2, null);
            String str2 = (find$default == null || (groupValues = find$default.getGroupValues()) == null) ? null : (String) CollectionsKt.getOrNull(groupValues, 1);
            if (str2 != null) {
                thread = new Thread("[ExitInfo] " + str2);
                linkedHashMap.put(thread, new ArrayList());
            } else if (StringsKt.startsWith$default(obj, "at ", false, 2, (Object) null) && thread != null) {
                MatchResult find$default2 = Regex.find$default((Regex) a.getValue(), obj, 0, 2, null);
                if (find$default2 != null) {
                    MatchResult.Destructured destructured = find$default2.getDestructured();
                    String str3 = (String) destructured.getMatch().getGroupValues().get(1);
                    String str4 = (String) destructured.getMatch().getGroupValues().get(2);
                    String str5 = (String) destructured.getMatch().getGroupValues().get(3);
                    String substringBeforeLast = StringsKt.substringBeforeLast(str3, '.', "");
                    String substringAfterLast$default = StringsKt.substringAfterLast$default(str3, '.', (String) null, 2, (Object) null);
                    try {
                        Integer intOrNull = StringsKt.toIntOrNull(str5);
                        stackTraceElement = new StackTraceElement(substringBeforeLast, substringAfterLast$default, str4, intOrNull != null ? intOrNull.intValue() : -1);
                    } catch (Throwable unused) {
                    }
                    if (stackTraceElement != null && (list = (List) linkedHashMap.get(thread)) != null) {
                        list.add(stackTraceElement);
                    }
                }
                stackTraceElement = null;
                if (stackTraceElement != null) {
                    list.add(stackTraceElement);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
