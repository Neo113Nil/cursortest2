package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import o.AbstractC1166hO;
import o.JN;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final Moshi moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(Moshi moshi, boolean z, boolean z2, boolean z3) {
        this.moshi = moshi;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new Moshi.Builder().build());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, JN> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        JsonAdapter adapter = this.moshi.adapter(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            adapter = adapter.lenient();
        }
        if (this.failOnUnknown) {
            adapter = adapter.failOnUnknown();
        }
        if (this.serializeNulls) {
            adapter = adapter.serializeNulls();
        }
        return new MoshiRequestBodyConverter(adapter);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<AbstractC1166hO, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        JsonAdapter adapter = this.moshi.adapter(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            adapter = adapter.lenient();
        }
        if (this.failOnUnknown) {
            adapter = adapter.failOnUnknown();
        }
        if (this.serializeNulls) {
            adapter = adapter.serializeNulls();
        }
        return new MoshiResponseBodyConverter(adapter);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(Moshi moshi) {
        if (moshi != null) {
            return new MoshiConverterFactory(moshi, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
