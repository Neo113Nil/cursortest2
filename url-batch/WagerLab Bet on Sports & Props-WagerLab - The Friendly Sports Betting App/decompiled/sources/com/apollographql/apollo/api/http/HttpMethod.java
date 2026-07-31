package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Http.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Get", "Post", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod Get = new HttpMethod("Get", 0);
    public static final HttpMethod Post = new HttpMethod("Post", 1);

    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{Get, Post};
    }

    public static EnumEntries<HttpMethod> getEntries() {
        return $ENTRIES;
    }

    private HttpMethod(String str, int i) {
    }

    static {
        HttpMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }
}
