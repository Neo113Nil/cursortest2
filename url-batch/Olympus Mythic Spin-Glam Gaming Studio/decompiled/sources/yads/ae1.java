package yads;

import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ae1 {
    public final ku a;

    public ae1(ku kuVar) {
        this.a = kuVar;
    }

    public final boolean a(View view, String str) {
        Uri parse = Uri.parse(str);
        if (!Intrinsics.areEqual(parse.getScheme(), "light-bundles") || !Intrinsics.areEqual(parse.getHost(), "click")) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("assetName");
        if (queryParameter == null && (queryParameter = parse.getQueryParameter("asset")) == null) {
            return false;
        }
        boolean z = ob1.a;
        this.a.a(view, queryParameter);
        return true;
    }
}
