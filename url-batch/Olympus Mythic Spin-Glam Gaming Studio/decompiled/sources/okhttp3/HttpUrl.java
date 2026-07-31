package okhttp3;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.B5;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", ShareConstants.MEDIA_URI, "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;
    private final boolean isHttps;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;

    @Nullable
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;

    @NotNull
    private final String url;

    @NotNull
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final int defaultPort(@NotNull String str) {
        return INSTANCE.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return INSTANCE.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return INSTANCE.get(url);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = Intrinsics.areEqual(scheme, "https");
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public final String username() {
        return this.username;
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String substring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.url, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    @NotNull
    public final String encodedPath() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String substring = this.url.substring(indexOf$default, Util.delimiterOffset(str, "?#", indexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, delimiterOffset2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = delimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String substring = this.url.substring(indexOf$default, Util.delimiterOffset(str, '#', indexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression step = RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression step = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression step = RangesKt.step(RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    @NotNull
    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Nullable
    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get((index * 2) + 1);
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(StringsKt.indexOf$default((CharSequence) this.url, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(newBuilder);
        return newBuilder.username("").password("").build().getUrl();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) other).url, this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m8412deprecated_url() {
        return url();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m8411deprecated_uri() {
        return uri();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m8400deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m8396deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @Deprecated
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @Deprecated
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m8405deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m8397deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m8398deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m8404deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m8399deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m8407deprecated_query() {
        return query();
    }

    @Deprecated
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m8409deprecated_querySize() {
        return querySize();
    }

    @Deprecated
    @NotNull
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m8408deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m8395deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated
    @Nullable
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", "password", "pop", "", Constants.PUSH, "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "index", "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        @Nullable
        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        @NotNull
        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        @NotNull
        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        @Nullable
        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @Nullable
        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.scheme = "http";
            } else if (StringsKt.equals(scheme, "https", true)) {
                this.scheme = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + scheme);
            }
            return this;
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: " + host);
            }
            this.host = canonicalHost;
            return this;
        }

        @NotNull
        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + port).toString());
            }
            this.port = port;
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                push(pathSegments, i, delimiterOffset, delimiterOffset < pathSegments.length(), alreadyEncoded);
                i = delimiterOffset + 1;
            } while (i <= pathSegments.length());
            return this;
        }

        @NotNull
        public final Builder setPathSegment(int index, @NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 251, null);
            if (isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) {
                throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
            }
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            return this;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int index, @NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        @NotNull
        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!StringsKt.startsWith$default(encodedPath, "/", false, 2, (Object) null)) {
                throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        @NotNull
        public final Builder query(@Nullable String query) {
            List<String> list;
            if (query != null) {
                Companion companion = HttpUrl.INSTANCE;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, query, 0, 0, " \"'<>#", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                Companion companion = HttpUrl.INSTANCE;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, encodedQuery, 0, 0, " \"'<>#", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(value != null ? Companion.canonicalize$okhttp$default(companion, value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null) : null);
            return this;
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null) : null);
            return this;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null));
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, null));
            return this;
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        @NotNull
        public final Builder fragment(@Nullable String fragment) {
            this.encodedFragment = fragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, list.get(i), 0, 0, "[]", true, true, false, false, null, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.INSTANCE;
            String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int effectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r1 != r4.defaultPort(r3)) goto L29;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.contains$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = HttpUrl.INSTANCE;
                    Intrinsics.checkNotNull(str3);
                }
                sb.append(':');
                sb.append(effectivePort);
            }
            Companion companion2 = HttpUrl.INSTANCE;
            companion2.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl base, @NotNull String input) {
            int delimiterOffset;
            int i;
            int i2;
            boolean z;
            int i3;
            boolean z2;
            String input2 = input;
            Intrinsics.checkNotNullParameter(input2, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z3 = true;
            char c = 65535;
            if (schemeDelimiterOffset != -1) {
                if (StringsKt.startsWith(input2, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (StringsKt.startsWith(input2, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = input2.substring(0, schemeDelimiterOffset);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (input.length() > 6) {
                    input2 = StringsKt.take(input2, 6) + "...";
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input2);
            }
            int slashCount = companion.slashCount(input2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (slashCount >= 2 || base == null || !Intrinsics.areEqual(base.scheme(), this.scheme)) {
                boolean z4 = false;
                boolean z5 = false;
                int i4 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input2, "@/\\?#", i4, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input2.charAt(delimiterOffset) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z4) {
                            int delimiterOffset2 = Util.delimiterOffset(input2, ':', i4, delimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            z = z3;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i4, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = z;
                            } else {
                                i2 = delimiterOffset;
                                z2 = z4;
                            }
                            z4 = z2;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            z5 = z;
                        } else {
                            i2 = delimiterOffset;
                            z = z3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, i4, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        }
                        i4 = i2 + 1;
                        z3 = z;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int portColonOffset = companion3.portColonOffset(input2, i4, delimiterOffset);
                int i5 = portColonOffset + 1;
                if (i5 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, input, i4, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input2, i5, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = input2.substring(i5, delimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i4, portColonOffset, false, 4, null));
                    String str = this.scheme;
                    Intrinsics.checkNotNull(str);
                    this.port = companion4.defaultPort(str);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = input2.substring(i4, portColonOffset);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i6 = i;
            int delimiterOffset3 = Util.delimiterOffset(input2, "?#", indexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(input2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i6 && input2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(input2, '#', delimiterOffset3, i6);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i6 && input2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, delimiterOffset3 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char charAt = input.charAt(startPos);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i = startPos;
                while (i < limit) {
                    startPos = Util.delimiterOffset(input, "/\\", i, limit);
                    boolean z = startPos < limit;
                    push(input, i, startPos, z, true);
                    if (z) {
                        i = startPos + 1;
                    }
                }
                return;
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r2.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final boolean isDot(String input) {
            return Intrinsics.areEqual(input, ".") || StringsKt.equals(input, "%2e", true);
        }

        private final boolean isDotDot(String input) {
            return Intrinsics.areEqual(input, "..") || StringsKt.equals(input, "%2e.", true) || StringsKt.equals(input, ".%2e", true) || StringsKt.equals(input, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        /* compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char charAt = input.charAt(pos);
                if ((Intrinsics.compare((int) charAt, 97) < 0 || Intrinsics.compare((int) charAt, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) > 0) && (Intrinsics.compare((int) charAt, 65) < 0 || Intrinsics.compare((int) charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char charAt = input.charAt(pos);
                    if (charAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (charAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", ShareConstants.MEDIA_URI, "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", B5.N, "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int defaultPort(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression step = RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append(B5.U);
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step2;
                }
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', i, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                int i2 = indexOf$default;
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, B5.U, i, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i2) {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(indexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        @NotNull
        public final HttpUrl get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "<this>");
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString()");
            return parse(url2);
        }

        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString()");
            return parse(uri2);
        }

        @Deprecated
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m8414deprecated_get(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @Deprecated
        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m8417deprecated_parse(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return parse(url);
        }

        @Deprecated
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m8416deprecated_get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @Deprecated
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m8415deprecated_get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i, int i2, @NotNull String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !StringsKt.contains$default((CharSequence) encodeSet, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i3, i2)) {
                                    Buffer buffer = new Buffer();
                                    buffer.writeUtf8(str, i, i3);
                                    writeCanonicalized(buffer, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                    return buffer.readUtf8();
                                }
                                if (codePointAt != 43 && z3) {
                                    Buffer buffer2 = new Buffer();
                                    buffer2.writeUtf8(str, i, i3);
                                    writeCanonicalized(buffer2, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                                    return buffer2.readUtf8();
                                }
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                    }
                    if (codePointAt != 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                Buffer buffer22 = new Buffer();
                buffer22.writeUtf8(str, i, i3);
                writeCanonicalized(buffer22, str, i3, i2, encodeSet, z, z2, z3, z4, charset);
                return buffer22.readUtf8();
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
        
            if (isPercentEncoded(r16, r5, r18) == false) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void writeCanonicalized(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int i3 = i;
            Buffer buffer2 = null;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                            if (!StringsKt.contains$default((CharSequence) str2, (char) codePointAt, false, 2, (Object) null)) {
                                if (codePointAt == 37) {
                                    if (z) {
                                        if (z2) {
                                        }
                                    }
                                }
                                buffer.writeUtf8CodePoint(codePointAt);
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(codePointAt);
                        } else {
                            buffer2.writeString(str, i3, Character.charCount(codePointAt) + i3, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte readByte = buffer2.readByte();
                            int i4 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[(i4 >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[readByte & 15]);
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                i3 += Character.charCount(codePointAt);
            }
        }
    }
}
