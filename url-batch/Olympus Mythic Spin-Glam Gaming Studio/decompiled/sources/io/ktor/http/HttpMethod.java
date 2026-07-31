package io.ktor.http;

import com.android.volley.toolbox.HttpClientStack;
import com.ironsource.C4701ic;
import com.safedk.android.a.g;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpMethod.kt */
/* loaded from: classes9.dex */
public final class HttpMethod {
    public static final Companion Companion = new Companion(null);
    private static final List DefaultMethods;
    private static final HttpMethod Delete;
    private static final HttpMethod Get;
    private static final HttpMethod Head;
    private static final HttpMethod Options;
    private static final HttpMethod Patch;
    private static final HttpMethod Post;
    private static final HttpMethod Put;
    private final String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HttpMethod) && Intrinsics.areEqual(this.value, ((HttpMethod) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public HttpMethod(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }

    /* compiled from: HttpMethod.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HttpMethod getGet() {
            return HttpMethod.Get;
        }

        public final HttpMethod getPost() {
            return HttpMethod.Post;
        }

        public final HttpMethod getHead() {
            return HttpMethod.Head;
        }

        public final HttpMethod getOptions() {
            return HttpMethod.Options;
        }

        public final List getDefaultMethods() {
            return HttpMethod.DefaultMethods;
        }
    }

    static {
        HttpMethod httpMethod = new HttpMethod(C4701ic.a);
        Get = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST");
        Post = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod(g.f);
        Put = httpMethod3;
        HttpMethod httpMethod4 = new HttpMethod(HttpClientStack.HttpPatch.METHOD_NAME);
        Patch = httpMethod4;
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        Delete = httpMethod5;
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        Head = httpMethod6;
        HttpMethod httpMethod7 = new HttpMethod("OPTIONS");
        Options = httpMethod7;
        DefaultMethods = CollectionsKt.listOf((Object[]) new HttpMethod[]{httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7});
    }
}
