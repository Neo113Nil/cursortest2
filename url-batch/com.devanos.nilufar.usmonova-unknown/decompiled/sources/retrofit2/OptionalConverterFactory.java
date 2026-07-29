package retrofit2;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import o.AbstractC1166hO;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;

@TargetApi(24)
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class OptionalConverterFactory extends Converter.Factory {

    @IgnoreJRERequirement
    public static final class OptionalConverter<T> implements Converter<AbstractC1166hO, Optional<T>> {
        private final Converter<AbstractC1166hO, T> delegate;

        public OptionalConverter(Converter<AbstractC1166hO, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(AbstractC1166hO abstractC1166hO) {
            return Optional.ofNullable(this.delegate.convert(abstractC1166hO));
        }
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<AbstractC1166hO, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
