package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import o.AbstractC0048Bt;
import o.AbstractC1888sN;
import o.C1852rr;
import o.C1878sD;
import o.JN;

/* loaded from: classes.dex */
abstract class ParameterHandler<T> {

    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, JN> converter;
        private final Method method;
        private final int p;

        public Body(Method method, int i, Converter<T, JN> converter) {
            this.method = method;
            this.p = i;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                throw Utils.parameterError(this.method, this.p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t));
            } catch (IOException e) {
                throw Utils.parameterError(this.method, e, this.p, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Field(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, convert, this.encoded);
        }
    }

    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public FieldMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) {
            if (map == null) {
                throw Utils.parameterError(this.method, this.p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.p, AbstractC1888sN.k("Field map contained null value for key '", key, "'."), new Object[0]);
                }
                String convert = this.valueConverter.convert(value);
                if (convert == null) {
                    throw Utils.parameterError(this.method, this.p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, convert, this.encoded);
            }
        }
    }

    public static final class Header<T> extends ParameterHandler<T> {
        private final boolean allowUnsafeNonAsciiValues;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Header(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, convert, this.allowUnsafeNonAsciiValues);
        }
    }

    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean allowUnsafeNonAsciiValues;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public HeaderMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) {
            if (map == null) {
                throw Utils.parameterError(this.method, this.p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.p, AbstractC1888sN.k("Header map contained null value for key '", key, "'."), new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value), this.allowUnsafeNonAsciiValues);
            }
        }
    }

    public static final class Headers extends ParameterHandler<C1852rr> {
        private final Method method;
        private final int p;

        public Headers(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable C1852rr c1852rr) {
            if (c1852rr == null) {
                throw Utils.parameterError(this.method, this.p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(c1852rr);
        }
    }

    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, JN> converter;
        private final C1852rr headers;
        private final Method method;
        private final int p;

        public Part(Method method, int i, C1852rr c1852rr, Converter<T, JN> converter) {
            this.method = method;
            this.p = i;
            this.headers = c1852rr;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t));
            } catch (IOException e) {
                throw Utils.parameterError(this.method, this.p, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, JN> valueConverter;

        public PartMap(Method method, int i, Converter<T, JN> converter, String str) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) {
            if (map == null) {
                throw Utils.parameterError(this.method, this.p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.p, AbstractC1888sN.k("Part map contained null value for key '", key, "'."), new Object[0]);
                }
                requestBuilder.addPart(AbstractC0048Bt.N("Content-Disposition", AbstractC1888sN.k("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }
    }

    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        public Path(Method method, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                throw Utils.parameterError(this.method, this.p, AbstractC1888sN.l(new StringBuilder("Path parameter \""), this.name, "\" value must not be null."), new Object[0]);
            }
            requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
        }
    }

    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Query(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, convert, this.encoded);
        }
    }

    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public QueryMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) {
            if (map == null) {
                throw Utils.parameterError(this.method, this.p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.p, AbstractC1888sN.k("Query map contained null value for key '", key, "'."), new Object[0]);
                }
                String convert = this.valueConverter.convert(value);
                if (convert == null) {
                    throw Utils.parameterError(this.method, this.p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, convert, this.encoded);
            }
        }
    }

    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            if (t == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
        }
    }

    public static final class RawPart extends ParameterHandler<C1878sD> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable C1878sD c1878sD) {
            if (c1878sD != null) {
                requestBuilder.addPart(c1878sD);
            }
        }
    }

    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        public RelativeUrl(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }
    }

    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        public Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, @Nullable T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, @Nullable T t);

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}
