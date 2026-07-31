package io.ktor.http;

import io.ktor.util.StringValues;
import io.ktor.util.StringValuesBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlDecodedParametersBuilder.kt */
/* loaded from: classes15.dex */
public abstract class UrlDecodedParametersBuilderKt {
    public static final Parameters decodeParameters(StringValuesBuilder parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllDecoded(ParametersBuilder$default, parameters);
        return ParametersBuilder$default.build();
    }

    public static final ParametersBuilder encodeParameters(StringValues parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllEncoded(ParametersBuilder$default, parameters);
        return ParametersBuilder$default;
    }

    private static final void appendAllDecoded(StringValuesBuilder stringValuesBuilder, StringValuesBuilder stringValuesBuilder2) {
        for (String str : stringValuesBuilder2.names()) {
            List all = stringValuesBuilder2.getAll(str);
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            String decodeURLQueryComponent$default = CodecsKt.decodeURLQueryComponent$default(str, 0, 0, false, null, 15, null);
            List list = all;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CodecsKt.decodeURLQueryComponent$default((String) it.next(), 0, 0, true, null, 11, null));
            }
            stringValuesBuilder.appendAll(decodeURLQueryComponent$default, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendAllEncoded(StringValuesBuilder stringValuesBuilder, StringValues stringValues) {
        for (String str : stringValues.names()) {
            List all = stringValues.getAll(str);
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            String encodeURLParameter$default = CodecsKt.encodeURLParameter$default(str, false, 1, null);
            List list = all;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CodecsKt.encodeURLParameterValue((String) it.next()));
            }
            stringValuesBuilder.appendAll(encodeURLParameter$default, arrayList);
        }
    }
}
