package io.bidmachine.internal;

import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.TargetingParams;
import io.bidmachine.protobuf.sdk.App;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class M {
    public static final void a(Context.App.Builder builder, TargetingParams params) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        a(builder, params.getData());
    }

    public static final void a(App.Builder builder, TargetingParams params) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        a(builder, params.getData());
    }

    private static final void a(Context.App.Builder builder, TargetingParams.Data data) {
        String storeUrl = data.getStoreUrl();
        if (storeUrl != null) {
            builder.setStoreurl(storeUrl);
        }
        builder.setPaid(Intrinsics.areEqual(data.isPaid(), Boolean.TRUE));
    }

    private static final void a(App.Builder builder, TargetingParams.Data data) {
        String storeCategory = data.getStoreCategory();
        if (storeCategory != null) {
            builder.setStorecat(storeCategory);
        }
        List<String> storeSubCategories = data.getStoreSubCategories();
        if (storeSubCategories != null) {
            Iterator<T> it = storeSubCategories.iterator();
            while (it.hasNext()) {
                builder.addStoresubcat((String) it.next());
            }
        }
        String framework = data.getFramework();
        if (framework != null) {
            builder.setFmwname(framework);
        }
    }
}
