package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: URLBuilder.kt */
/* loaded from: classes13.dex */
public final class URLBuilder {
    public static final Companion Companion;
    private static final Url originUrl;
    private String encodedFragment;
    private ParametersBuilder encodedParameters;
    private String encodedPassword;
    private List encodedPathSegments;
    private String encodedUser;
    private String host;
    private ParametersBuilder parameters;
    private int port;
    private URLProtocol protocolOrNull;
    private boolean trailingQuery;

    public URLBuilder(URLProtocol uRLProtocol, String host, int i, String str, String str2, List pathSegments, Parameters parameters, String fragment, boolean z) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.host = host;
        this.trailingQuery = z;
        this.port = i;
        this.protocolOrNull = uRLProtocol;
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? CodecsKt.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedFragment = CodecsKt.encodeURLQueryComponent$default(fragment, false, false, null, 7, null);
        List list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        ParametersBuilder encodeParameters = UrlDecodedParametersBuilderKt.encodeParameters(parameters);
        this.encodedParameters = encodeParameters;
        this.parameters = new UrlDecodedParametersBuilder(encodeParameters);
    }

    public /* synthetic */ URLBuilder(URLProtocol uRLProtocol, String str, int i, String str2, String str3, List list, Parameters parameters, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uRLProtocol, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Parameters.Companion.getEmpty() : parameters, (i2 & 128) == 0 ? str4 : "", (i2 & 256) == 0 ? z : false);
    }

    public final String getHost() {
        return this.host;
    }

    public final void setHost(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final void setTrailingQuery(boolean z) {
        this.trailingQuery = z;
    }

    public final int getPort() {
        return this.port;
    }

    public final void setPort(int i) {
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i).toString());
        }
        this.port = i;
    }

    public final URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final void setProtocolOrNull(URLProtocol uRLProtocol) {
        this.protocolOrNull = uRLProtocol;
    }

    public final URLProtocol getProtocol() {
        URLProtocol uRLProtocol = this.protocolOrNull;
        return uRLProtocol == null ? URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
    }

    public final void setProtocol(URLProtocol value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.protocolOrNull = value;
    }

    public final String getEncodedUser() {
        return this.encodedUser;
    }

    public final void setEncodedUser(String str) {
        this.encodedUser = str;
    }

    public final String getUser() {
        String str = this.encodedUser;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setUser(String str) {
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final void setEncodedPassword(String str) {
        this.encodedPassword = str;
    }

    public final String getPassword() {
        String str = this.encodedPassword;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final void setEncodedFragment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encodedFragment = str;
    }

    public final String getFragment() {
        return CodecsKt.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final List getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final void setEncodedPathSegments(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    public final List getPathSegments() {
        List list = this.encodedPathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.decodeURLPart$default((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final ParametersBuilder getEncodedParameters() {
        return this.encodedParameters;
    }

    public final void setEncodedParameters(ParametersBuilder value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodedParameters = value;
        this.parameters = new UrlDecodedParametersBuilder(value);
    }

    public final ParametersBuilder getParameters() {
        return this.parameters;
    }

    public final String buildString() {
        Appendable appendTo;
        applyOrigin();
        appendTo = URLBuilderKt.appendTo(this, new StringBuilder(256));
        String sb = ((StringBuilder) appendTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public String toString() {
        Appendable appendTo;
        appendTo = URLBuilderKt.appendTo(this, new StringBuilder(256));
        String sb = ((StringBuilder) appendTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public final Url build() {
        applyOrigin();
        return new Url(this.protocolOrNull, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    private final void applyOrigin() {
        if (this.host.length() <= 0 && !Intrinsics.areEqual(getProtocol().getName(), "file")) {
            Url url = originUrl;
            this.host = url.getHost();
            if (this.protocolOrNull == null) {
                this.protocolOrNull = url.getProtocolOrNull();
            }
            if (this.port == 0) {
                setPort(url.getSpecifiedPort());
            }
        }
    }

    /* compiled from: URLBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        originUrl = URLUtilsKt.Url(URLBuilderJvmKt.getOrigin(companion));
    }
}
