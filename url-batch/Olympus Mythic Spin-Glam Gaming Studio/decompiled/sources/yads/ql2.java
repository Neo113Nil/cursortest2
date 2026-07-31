package yads;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public abstract class ql2 {
    public static Uri a(Uri uri, jd3 jd3Var) {
        Map map;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            map = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
            for (String str : queryParameterNames) {
                Pair pair = TuplesKt.to(str, uri.getQueryParameter(str));
                map.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        rl2 rl2Var = (rl2) jd3Var.invoke(new rl2(map));
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : rl2Var.a.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery.build();
    }
}
