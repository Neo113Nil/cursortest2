package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.div.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class s33 {
    public static final Set a = SetsKt.setOf((Object[]) new String[]{com.safedk.android.utils.h.y, "yads", "com.monetization.ads", BuildConfig.LIBRARY_PACKAGE_NAME});

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((dn0) obj).a == en0.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (StringsKt.contains$default((CharSequence) stackTraceElement.toString(), (CharSequence) ((dn0) it.next()).b, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cb, code lost:
    
        r5 = (java.lang.StackTraceElement) kotlin.collections.ArraysKt.getOrNull(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        if (r5 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d3, code lost:
    
        r5 = r5.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r5 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0081, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(StackTraceElement[] stackTraceElementArr, Set set) {
        String className;
        StackTraceElement stackTraceElement;
        String className2;
        String className3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((dn0) obj).a == en0.c) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dn0 dn0Var = (dn0) it.next();
                String arrays = Arrays.toString(stackTraceElementArr);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                if (StringsKt.contains$default((CharSequence) arrays, (CharSequence) dn0Var.b, false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            String className4 = stackTraceElement2.getClassName();
            Set set2 = a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (StringsKt.startsWith$default(className4, (String) it2.next(), false, 2, (Object) null)) {
                        if (!a(stackTraceElement2, set)) {
                            break;
                        }
                    }
                }
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        loop4: do {
            i++;
            StackTraceElement stackTraceElement3 = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i);
            if (stackTraceElement3 != null && !a(stackTraceElement3, set) && (stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i)) != null && (className2 = stackTraceElement.getClassName()) != null) {
                Set set3 = a;
                if ((set3 instanceof Collection) && set3.isEmpty()) {
                    break;
                }
                Iterator it3 = set3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break loop4;
                    }
                    if (StringsKt.startsWith$default(className2, (String) it3.next(), false, 2, (Object) null)) {
                        break;
                    }
                }
            } else {
                break;
            }
        } while (!Intrinsics.areEqual(className3, CallbackStackTraceMarker.class.getName()));
        StackTraceElement stackTraceElement4 = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i);
        if (stackTraceElement4 != null && (className = stackTraceElement4.getClassName()) != null && Intrinsics.areEqual(className, CallbackStackTraceMarker.class.getName())) {
            z = true;
        }
        return !z;
    }
}
