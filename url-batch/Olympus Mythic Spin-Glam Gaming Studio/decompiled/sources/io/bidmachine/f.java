package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;

/* loaded from: classes5.dex */
final class f {
    f() {
    }

    void a(Context context, Context.App.Builder builder) {
        builder.setRelease(a(context));
    }

    void a(android.content.Context context, App.Builder builder) {
        builder.setRelease(a(context));
    }

    private Context.App.Release a(android.content.Context context) {
        BuildInfo obtain = BuildInfo.obtain(context);
        Context.App.Release.Builder newBuilder = Context.App.Release.newBuilder();
        newBuilder.setType(a(obtain));
        String sha1Signature = obtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            newBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = obtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            newBuilder.setSignatureSHA256(sha256Signature);
        }
        return newBuilder.build();
    }

    private String a(BuildInfo buildInfo) {
        if (buildInfo.isDebuggable()) {
            return "debug";
        }
        return "release";
    }
}
