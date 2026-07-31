package io.ktor.http;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* compiled from: ContentTypes.kt */
/* loaded from: classes12.dex */
public final class ContentType extends HeaderValueWithParameters {
    private final String contentSubtype;
    private final String contentType;
    public static final Companion Companion = new Companion(null);
    private static final ContentType Any = new ContentType(Marker.ANY_MARKER, Marker.ANY_MARKER, null, 4, null);

    public final String getContentType() {
        return this.contentType;
    }

    private ContentType(String str, String str2, String str3, List list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentType(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final ContentType withParameter(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return hasParameter(name, value) ? this : new ContentType(this.contentType, this.contentSubtype, getContent(), CollectionsKt.plus(getParameters(), new HeaderValueParam(name, value)));
    }

    private final boolean hasParameter(String str, String str2) {
        int size = getParameters().size();
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            HeaderValueParam headerValueParam = (HeaderValueParam) getParameters().get(0);
            if (!StringsKt.equals(headerValueParam.getName(), str, true) || !StringsKt.equals(headerValueParam.getValue(), str2, true)) {
                return false;
            }
        } else {
            List<HeaderValueParam> parameters = getParameters();
            if ((parameters instanceof Collection) && parameters.isEmpty()) {
                return false;
            }
            for (HeaderValueParam headerValueParam2 : parameters) {
                if (!StringsKt.equals(headerValueParam2.getName(), str, true) || !StringsKt.equals(headerValueParam2.getValue(), str2, true)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if (r4 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean match(ContentType pattern) {
        boolean equals;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!Intrinsics.areEqual(pattern.contentType, Marker.ANY_MARKER) && !StringsKt.equals(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern.contentSubtype, Marker.ANY_MARKER) && !StringsKt.equals(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (HeaderValueParam headerValueParam : pattern.getParameters()) {
            String component1 = headerValueParam.component1();
            String component2 = headerValueParam.component2();
            if (Intrinsics.areEqual(component1, Marker.ANY_MARKER)) {
                if (!Intrinsics.areEqual(component2, Marker.ANY_MARKER)) {
                    List parameters = getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.equals(((HeaderValueParam) it.next()).getValue(), component2, true)) {
                            }
                        }
                    }
                    equals = false;
                }
                equals = true;
                break;
            }
            String parameter = parameter(component1);
            if (!Intrinsics.areEqual(component2, Marker.ANY_MARKER)) {
                equals = StringsKt.equals(parameter, component2, true);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ContentType) {
            ContentType contentType = (ContentType) obj;
            if (StringsKt.equals(this.contentType, contentType.contentType, true) && StringsKt.equals(this.contentSubtype, contentType.contentSubtype, true) && Intrinsics.areEqual(getParameters(), contentType.getParameters())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.contentType;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (getParameters().hashCode() * 31);
    }

    /* compiled from: ContentTypes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentType parse(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.isBlank(value)) {
                return getAny();
            }
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.Companion;
            HeaderValue headerValue = (HeaderValue) CollectionsKt.last(HttpHeaderValueParserKt.parseHeaderValue(value));
            String value2 = headerValue.getValue();
            List params = headerValue.getParams();
            int indexOf$default = StringsKt.indexOf$default((CharSequence) value2, '/', 0, false, 6, (Object) null);
            if (indexOf$default == -1) {
                if (Intrinsics.areEqual(StringsKt.trim(value2).toString(), Marker.ANY_MARKER)) {
                    return ContentType.Companion.getAny();
                }
                throw new BadContentTypeFormatException(value);
            }
            String substring = value2.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String obj = StringsKt.trim(substring).toString();
            if (obj.length() == 0) {
                throw new BadContentTypeFormatException(value);
            }
            String substring2 = value2.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String obj2 = StringsKt.trim(substring2).toString();
            if (StringsKt.contains$default((CharSequence) obj, ' ', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) obj2, ' ', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            if (obj2.length() == 0 || StringsKt.contains$default((CharSequence) obj2, '/', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            return new ContentType(obj, obj2, params);
        }

        public final ContentType getAny() {
            return ContentType.Any;
        }
    }

    /* compiled from: ContentTypes.kt */
    public static final class Application {
        private static final ContentType Any;
        private static final ContentType Atom;
        private static final ContentType Cbor;
        private static final ContentType Docx;
        private static final ContentType FormUrlEncoded;
        private static final ContentType GZip;
        private static final ContentType HalJson;
        public static final Application INSTANCE = new Application();
        private static final ContentType JavaScript;
        private static final ContentType Json;
        private static final ContentType OctetStream;
        private static final ContentType Pdf;
        private static final ContentType Pptx;
        private static final ContentType ProblemJson;
        private static final ContentType ProblemXml;
        private static final ContentType ProtoBuf;
        private static final ContentType Rss;
        private static final ContentType Soap;
        private static final ContentType Wasm;
        private static final ContentType Xlsx;
        private static final ContentType Xml;
        private static final ContentType Xml_Dtd;
        private static final ContentType Yaml;
        private static final ContentType Zip;

        private Application() {
        }

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("application", Marker.ANY_MARKER, list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Atom = new ContentType("application", "atom+xml", list2, i2, defaultConstructorMarker2);
            Cbor = new ContentType("application", "cbor", list, i, defaultConstructorMarker);
            Json = new ContentType("application", PreferencesSerializer.fileExtension, list2, i2, defaultConstructorMarker2);
            HalJson = new ContentType("application", "hal+json", list, i, defaultConstructorMarker);
            JavaScript = new ContentType("application", "javascript", list2, i2, defaultConstructorMarker2);
            OctetStream = new ContentType("application", "octet-stream", list, i, defaultConstructorMarker);
            Rss = new ContentType("application", "rss+xml", list2, i2, defaultConstructorMarker2);
            Soap = new ContentType("application", "soap+xml", list, i, defaultConstructorMarker);
            Xml = new ContentType("application", "xml", list2, i2, defaultConstructorMarker2);
            Xml_Dtd = new ContentType("application", "xml-dtd", list, i, defaultConstructorMarker);
            Yaml = new ContentType("application", "yaml", list2, i2, defaultConstructorMarker2);
            Zip = new ContentType("application", "zip", list, i, defaultConstructorMarker);
            GZip = new ContentType("application", "gzip", list2, i2, defaultConstructorMarker2);
            FormUrlEncoded = new ContentType("application", "x-www-form-urlencoded", list, i, defaultConstructorMarker);
            Pdf = new ContentType("application", "pdf", list2, i2, defaultConstructorMarker2);
            Xlsx = new ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", list, i, defaultConstructorMarker);
            Docx = new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", list2, i2, defaultConstructorMarker2);
            Pptx = new ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", list, i, defaultConstructorMarker);
            ProtoBuf = new ContentType("application", "protobuf", list2, i2, defaultConstructorMarker2);
            Wasm = new ContentType("application", "wasm", list, i, defaultConstructorMarker);
            ProblemJson = new ContentType("application", "problem+json", list2, i2, defaultConstructorMarker2);
            ProblemXml = new ContentType("application", "problem+xml", list, i, defaultConstructorMarker);
        }

        public final ContentType getOctetStream() {
            return OctetStream;
        }

        public final ContentType getProtoBuf() {
            return ProtoBuf;
        }
    }

    /* compiled from: ContentTypes.kt */
    public static final class MultiPart {
        private static final ContentType Alternative;
        private static final ContentType Any;
        private static final ContentType ByteRanges;
        private static final ContentType Encrypted;
        private static final ContentType FormData;
        public static final MultiPart INSTANCE = new MultiPart();
        private static final ContentType Mixed;
        private static final ContentType Related;
        private static final ContentType Signed;

        private MultiPart() {
        }

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("multipart", Marker.ANY_MARKER, list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Mixed = new ContentType("multipart", "mixed", list2, i2, defaultConstructorMarker2);
            Alternative = new ContentType("multipart", "alternative", list, i, defaultConstructorMarker);
            Related = new ContentType("multipart", "related", list2, i2, defaultConstructorMarker2);
            FormData = new ContentType("multipart", "form-data", list, i, defaultConstructorMarker);
            Signed = new ContentType("multipart", "signed", list2, i2, defaultConstructorMarker2);
            Encrypted = new ContentType("multipart", "encrypted", list, i, defaultConstructorMarker);
            ByteRanges = new ContentType("multipart", "byteranges", list2, i2, defaultConstructorMarker2);
        }

        public final ContentType getFormData() {
            return FormData;
        }

        public final boolean contains(CharSequence contentType) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            return StringsKt.startsWith(contentType, (CharSequence) "multipart/", true);
        }
    }

    /* compiled from: ContentTypes.kt */
    public static final class Text {
        private static final ContentType Any;
        private static final ContentType CSS;
        private static final ContentType CSV;
        private static final ContentType EventStream;
        private static final ContentType Html;
        public static final Text INSTANCE = new Text();
        private static final ContentType JavaScript;
        private static final ContentType Plain;
        private static final ContentType VCard;
        private static final ContentType Xml;

        private Text() {
        }

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("text", Marker.ANY_MARKER, list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Plain = new ContentType("text", "plain", list2, i2, defaultConstructorMarker2);
            CSS = new ContentType("text", "css", list, i, defaultConstructorMarker);
            CSV = new ContentType("text", "csv", list2, i2, defaultConstructorMarker2);
            Html = new ContentType("text", "html", list, i, defaultConstructorMarker);
            JavaScript = new ContentType("text", "javascript", list2, i2, defaultConstructorMarker2);
            VCard = new ContentType("text", "vcard", list, i, defaultConstructorMarker);
            Xml = new ContentType("text", "xml", list2, i2, defaultConstructorMarker2);
            EventStream = new ContentType("text", "event-stream", list, i, defaultConstructorMarker);
        }

        public final ContentType getPlain() {
            return Plain;
        }
    }
}
