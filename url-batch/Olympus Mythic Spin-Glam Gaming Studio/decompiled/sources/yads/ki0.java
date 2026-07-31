package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.X3;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ki0 {
    public final ku a;
    public lu b;

    public ki0(ku kuVar) {
        this.a = kuVar;
    }

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(X3.i.L);
            ku kuVar = null;
            Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
            if (intOrNull == null) {
                kuVar = this.a;
            } else {
                lu luVar = this.b;
                if (luVar != null && (linkedHashMap = luVar.b) != null) {
                    kuVar = (ku) linkedHashMap.get(intOrNull);
                }
            }
            if (kuVar != null) {
                kuVar.a(view, queryParameter);
            }
        }
    }
}
