package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.util.regex.Pattern;
import o.AbstractC0868ct;
import o.G8;
import o.JN;
import o.NB;
import retrofit2.Converter;

/* loaded from: classes.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, JN> {
    private static final NB MEDIA_TYPE;
    private final JsonAdapter<T> adapter;

    static {
        Pattern pattern = NB.d;
        MEDIA_TYPE = AbstractC0868ct.v("application/json; charset=UTF-8");
    }

    public MoshiRequestBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ JN convert(Object obj) {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public JN convert(T t) {
        G8 g8 = new G8();
        this.adapter.toJson(JsonWriter.of(g8), (JsonWriter) t);
        return JN.create(MEDIA_TYPE, g8.i(g8.i));
    }
}
