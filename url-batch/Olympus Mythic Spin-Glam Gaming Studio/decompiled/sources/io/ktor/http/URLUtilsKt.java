package io.ktor.http;

import com.ironsource.B5;
import com.ironsource.X3;
import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.util.StringValuesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: URLUtils.kt */
/* loaded from: classes5.dex */
public abstract class URLUtilsKt {
    public static final Url Url(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    public static final URLBuilder URLBuilder(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return URLParserKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), urlString);
    }

    public static final URLBuilder URLBuilder(Url url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), url);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URLBuilder url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        StringValuesKt.appendAll(ParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, Url url) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        ParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(ParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final String getHostWithPort(Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    public static final String getHostWithPortIfSpecified(Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        int specifiedPort = url.getSpecifiedPort();
        if (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) {
            return url.getHost();
        }
        return getHostWithPort(url);
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, ParametersBuilder encodedQueryParameters, boolean z) {
        List list;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
        Intrinsics.checkNotNullParameter(encodedQueryParameters, "encodedQueryParameters");
        if (!StringsKt.isBlank(encodedPath) && !StringsKt.startsWith$default(encodedPath, "/", false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z) {
            appendable.append("?");
        }
        Set<Map.Entry> entries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entries) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = CollectionsKt.listOf(TuplesKt.to(str, null));
            } else {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(TuplesKt.to(str, (String) it.next()));
                }
                list = arrayList2;
            }
            CollectionsKt.addAll(arrayList, list);
        }
        CollectionsKt___CollectionsKt.joinTo(arrayList, appendable, (r14 & 2) != 0 ? ", " : X3.j.c, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new Function1() { // from class: io.ktor.http.URLUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence appendUrlFullPath$lambda$6;
                appendUrlFullPath$lambda$6 = URLUtilsKt.appendUrlFullPath$lambda$6((Pair) obj);
                return appendUrlFullPath$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendUrlFullPath$lambda$6(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = (String) it.getFirst();
        if (it.getSecond() == null) {
            return str;
        }
        return str + B5.U + String.valueOf(it.getSecond());
    }

    public static final void appendUserAndPassword(StringBuilder sb, String str, String str2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }
}
