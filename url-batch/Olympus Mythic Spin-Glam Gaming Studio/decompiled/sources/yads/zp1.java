package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class zp1 {
    public final List a = CollectionsKt.listOf((Object[]) new String[]{"AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"});

    public final e00 a(er1 er1Var) {
        Object obj;
        String removeSuffix = StringsKt.removeSuffix(StringsKt.substringAfterLast$default(er1Var.b, '.', (String) null, 2, (Object) null), "Adapter");
        if (removeSuffix.length() <= 0) {
            removeSuffix = null;
        }
        if (removeSuffix == null) {
            return null;
        }
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.endsWith$default(removeSuffix, (String) obj, false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        d00 d00Var = e00.c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        d00Var.getClass();
        return d00.a(lowerCase);
    }

    public final String b(er1 er1Var) {
        Object obj;
        String removeSuffix = StringsKt.removeSuffix(StringsKt.substringAfterLast$default(er1Var.b, '.', (String) null, 2, (Object) null), "Adapter");
        if (removeSuffix.length() <= 0) {
            removeSuffix = null;
        }
        if (removeSuffix == null) {
            return null;
        }
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.endsWith$default(removeSuffix, (String) obj, false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        String removeSuffix2 = StringsKt.removeSuffix(removeSuffix, str);
        if (removeSuffix2.length() > 0) {
            return removeSuffix2;
        }
        return null;
    }
}
