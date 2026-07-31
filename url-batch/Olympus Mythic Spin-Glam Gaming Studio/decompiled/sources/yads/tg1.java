package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class tg1 {
    public static final List a(og1 og1Var, String str) {
        List split$default;
        String c = ((qg1) og1Var).c(str);
        if (c == null || (split$default = StringsKt.split$default((CharSequence) c, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return split$default;
    }

    public static final void a(og1 og1Var, String str, List list) {
        String str2 = null;
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                str2 = CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            }
        }
        ((qg1) og1Var).a(str, str2);
    }
}
