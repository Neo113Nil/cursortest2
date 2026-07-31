package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class te3 extends Lambda implements Function0 {
    public static final te3 b = new te3();

    public te3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Lazy lazy = ue3.a;
        List split$default = StringsKt.split$default((CharSequence) "adsdk.yandex.ru,yandex.ru", new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        Lazy lazy2 = ue3.a;
        return CollectionsKt.plus(arrayList, "yandex.com/ads");
    }
}
