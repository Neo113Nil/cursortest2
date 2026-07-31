package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ee {
    public final Set a;

    public ee(Set set) {
        this.a = set;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = SequencesKt.take(StringsKt.lineSequence(((de) obj).c), 50).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (StringsKt.startsWith$default(StringsKt.trim(str).toString(), "at ", false, 2, (Object) null)) {
                        Set set = s33.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) it2.next(), false, 2, (Object) null)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x0015, B:11:0x003e, B:19:0x002a, B:21:0x0034), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(ArrayList arrayList) {
        bc2 bc2Var;
        LinkedHashMap a;
        Thread thread;
        StackTraceElement[] stackTraceElementArr;
        boolean a2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            de deVar = (de) it.next();
            try {
                Lazy lazy = ke.a;
                a = ke.a(deVar.c);
                thread = (Thread) CollectionsKt.firstOrNull(a.keySet());
            } catch (Throwable unused) {
            }
            if (thread != null && (stackTraceElementArr = (StackTraceElement[]) a.get(thread)) != null) {
                Set set = s33.a;
                a2 = s33.a(stackTraceElementArr, this.a);
                if (a2) {
                    bc2Var = new bc2(deVar, a);
                    if (bc2Var != null) {
                        arrayList2.add(bc2Var);
                    }
                }
                bc2Var = null;
                if (bc2Var != null) {
                }
            }
            a2 = false;
            if (a2) {
            }
            bc2Var = null;
            if (bc2Var != null) {
            }
        }
        return arrayList2;
    }
}
