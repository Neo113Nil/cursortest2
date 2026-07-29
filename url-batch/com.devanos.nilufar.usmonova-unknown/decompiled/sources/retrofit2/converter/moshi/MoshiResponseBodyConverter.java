package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import o.AbstractC1166hO;
import o.C1097gL;
import o.C1347k9;
import o.N8;
import retrofit2.Converter;

/* loaded from: classes.dex */
final class MoshiResponseBodyConverter<T> implements Converter<AbstractC1166hO, T> {
    private static final C1347k9 UTF8_BOM;
    private final JsonAdapter<T> adapter;

    static {
        C1347k9 c1347k9 = C1347k9.k;
        UTF8_BOM = C1097gL.c0("EFBBBF");
    }

    public MoshiResponseBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(AbstractC1166hO abstractC1166hO) {
        N8 source = abstractC1166hO.source();
        try {
            if (source.d(UTF8_BOM)) {
                source.skip(r1.b());
            }
            JsonReader of = JsonReader.of(source);
            T fromJson = this.adapter.fromJson(of);
            if (of.peek() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            abstractC1166hO.close();
            return fromJson;
        } catch (Throwable th) {
            abstractC1166hO.close();
            throw th;
        }
    }
}
