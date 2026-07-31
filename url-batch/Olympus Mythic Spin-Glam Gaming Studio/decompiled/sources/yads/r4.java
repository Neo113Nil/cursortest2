package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class r4 {
    public final rh1 a;
    public final ok b;

    public r4() {
        rh1 rh1Var = new rh1();
        ok okVar = new ok();
        this.a = rh1Var;
        this.b = okVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r11 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context) {
        List emptyList;
        String str;
        boolean z;
        String str2;
        List list;
        List split$default;
        this.a.getClass();
        String str3 = (String) rh1.a(context, sh1.f.b);
        if (str3 == null) {
            ok okVar = this.b;
            bu2 a = okVar.a.a.a(context);
            Object obj = null;
            if (a == null || (str2 = a.X) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                String str4 = (String) rh1.a(context, sh1.g.b);
                if (str4 != null && (split$default = StringsKt.split$default((CharSequence) str4, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : split$default) {
                        if (!StringsKt.isBlank((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    list = arrayList;
                }
                list = null;
                if (list == null) {
                    list = a.B0;
                }
                emptyList = CollectionsKt.plus((Collection) CollectionsKt.listOf(str2), (Iterable) list);
            }
            if (emptyList.size() > 1) {
                Iterator it = CollectionsKt.dropLast(emptyList, 1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String a2 = jb3.a((String) next);
                    if (a2 == null || !(!StringsKt.isBlank(a2))) {
                        z = false;
                    } else {
                        g01 g01Var = okVar.b;
                        ConcurrentHashMap concurrentHashMap = g01.b;
                        z = g01Var.a(1000, a2);
                    }
                    if (z) {
                        obj = next;
                        break;
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    str = (String) CollectionsKt.last(emptyList);
                } else {
                    str3 = str5;
                    if (str3 == null) {
                        str3 = "yandex.com/ads";
                    }
                }
            } else {
                str = (String) CollectionsKt.firstOrNull(emptyList);
            }
            str3 = str;
            if (str3 == null) {
            }
        }
        return a(str3);
    }

    public static String a(String str) {
        return com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + str;
    }
}
