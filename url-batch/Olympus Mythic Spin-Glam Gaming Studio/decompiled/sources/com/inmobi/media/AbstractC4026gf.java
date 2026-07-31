package com.inmobi.media;

import com.ironsource.X3;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4026gf {
    public static final IntRange a = RangesKt.until(408, 600);
    public static final IntRange b = RangesKt.until(300, 500);

    public static final String a(String url, Map map) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(url, "url");
        if (map == null) {
            return url;
        }
        String joinToString$default = CollectionsKt.joinToString$default(map.entrySet(), X3.j.c, null, null, 0, null, new Function1() { // from class: com.inmobi.media.gf$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC4026gf.a((Map.Entry) obj);
            }
        }, 30, null);
        if (StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null)) {
            sb = new StringBuilder();
            sb.append(X3.j.c);
        } else {
            sb = new StringBuilder();
            sb.append("?");
        }
        sb.append(joinToString$default);
        return url + sb.toString();
    }

    public static final CharSequence a(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = Charsets.UTF_8;
        return URLEncoder.encode(str, charset.name()) + "=" + URLEncoder.encode(str2, charset.name());
    }
}
