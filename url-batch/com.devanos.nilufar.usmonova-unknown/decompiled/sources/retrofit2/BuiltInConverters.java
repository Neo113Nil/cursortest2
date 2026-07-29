package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.AbstractC1166hO;
import o.C0782bY;
import o.JN;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* loaded from: classes.dex */
final class BuiltInConverters extends Converter.Factory {

    public static final class BufferingResponseBodyConverter implements Converter<AbstractC1166hO, AbstractC1166hO> {
        static final BufferingResponseBodyConverter INSTANCE = new BufferingResponseBodyConverter();

        @Override // retrofit2.Converter
        public AbstractC1166hO convert(AbstractC1166hO abstractC1166hO) {
            try {
                return Utils.buffer(abstractC1166hO);
            } finally {
                abstractC1166hO.close();
            }
        }
    }

    public static final class RequestBodyConverter implements Converter<JN, JN> {
        static final RequestBodyConverter INSTANCE = new RequestBodyConverter();

        @Override // retrofit2.Converter
        public JN convert(JN jn) {
            return jn;
        }
    }

    public static final class StreamingResponseBodyConverter implements Converter<AbstractC1166hO, AbstractC1166hO> {
        static final StreamingResponseBodyConverter INSTANCE = new StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public AbstractC1166hO convert(AbstractC1166hO abstractC1166hO) {
            return abstractC1166hO;
        }
    }

    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = new ToStringConverter();

        @Override // retrofit2.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class UnitResponseBodyConverter implements Converter<AbstractC1166hO, C0782bY> {
        static final UnitResponseBodyConverter INSTANCE = new UnitResponseBodyConverter();

        @Override // retrofit2.Converter
        public C0782bY convert(AbstractC1166hO abstractC1166hO) {
            abstractC1166hO.close();
            return C0782bY.a;
        }
    }

    public static final class VoidResponseBodyConverter implements Converter<AbstractC1166hO, Void> {
        static final VoidResponseBodyConverter INSTANCE = new VoidResponseBodyConverter();

        @Override // retrofit2.Converter
        public Void convert(AbstractC1166hO abstractC1166hO) {
            abstractC1166hO.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, JN> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (JN.class.isAssignableFrom(Utils.getRawType(type))) {
            return RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<AbstractC1166hO, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == AbstractC1166hO.class) {
            return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? StreamingResponseBodyConverter.INSTANCE : BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == Void.class) {
            return VoidResponseBodyConverter.INSTANCE;
        }
        if (Utils.isUnit(type)) {
            return UnitResponseBodyConverter.INSTANCE;
        }
        return null;
    }
}
