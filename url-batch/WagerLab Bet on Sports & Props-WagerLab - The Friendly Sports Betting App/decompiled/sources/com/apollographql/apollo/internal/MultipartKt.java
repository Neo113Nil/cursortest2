package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.http.HttpHeaders;
import com.apollographql.apollo.api.http.HttpResponse;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.BufferedSource;

/* compiled from: multipart.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"multipartBodyFlow", "Lkotlinx/coroutines/flow/Flow;", "Lokio/BufferedSource;", "response", "Lcom/apollographql/apollo/api/http/HttpResponse;", "getBoundaryParameter", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_CONTENT_TYPE_KEY, "isMultipart", "", "(Lcom/apollographql/apollo/api/http/HttpResponse;)Z", "isGraphQLResponse", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartKt {
    public static final Flow<BufferedSource> multipartBodyFlow(HttpResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return FlowKt.onCompletion(FlowKt.flow(new MultipartKt$multipartBodyFlow$1(objectRef, response, null)), new MultipartKt$multipartBodyFlow$2(objectRef, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBoundaryParameter(String str) {
        Object obj;
        List split$default;
        String str2;
        if (str == null) {
            return null;
        }
        List split$default2 = StringsKt.split$default((CharSequence) str, new char[]{';'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default2, 10));
        Iterator it = split$default2.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (StringsKt.startsWith$default((String) obj, "boundary=", false, 2, (Object) null)) {
                break;
            }
        }
        String str3 = (String) obj;
        if (str3 == null || (split$default = StringsKt.split$default((CharSequence) str3, new char[]{'='}, false, 0, 6, (Object) null)) == null || (str2 = (String) CollectionsKt.getOrNull(split$default, 1)) == null) {
            return null;
        }
        return StringsKt.trim(str2, '\"', '\'');
    }

    public static final boolean isMultipart(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        String valueOf = HttpHeaders.valueOf(httpResponse.getHeaders(), "Content-Type");
        return valueOf != null && StringsKt.startsWith(valueOf, "multipart/", true);
    }

    public static final boolean isGraphQLResponse(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        String valueOf = HttpHeaders.valueOf(httpResponse.getHeaders(), "Content-Type");
        return valueOf != null && StringsKt.startsWith(valueOf, "application/graphql-response+json", true);
    }
}
