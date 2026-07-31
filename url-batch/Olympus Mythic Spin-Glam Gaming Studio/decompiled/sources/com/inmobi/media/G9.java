package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class G9 {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.G9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return G9.b();
        }
    });
    public static final String b;

    static {
        String simpleName = G9.class.getSimpleName();
        b = simpleName;
        Intrinsics.checkNotNull(simpleName);
    }

    public static String a() {
        Qa qa = (Qa) a.getValue();
        String str = null;
        if (qa != null) {
            Intrinsics.checkNotNullParameter("cip", "key");
            str = qa.a.getString("cip", null);
        }
        String TAG = b;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return str;
    }

    public static final Qa b() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        return Pa.a(context, "inmobi_store");
    }

    public static void a(String str) {
        Qa qa = (Qa) a.getValue();
        if (qa != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa.a("cip", str, false);
            Unit unit = Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(b);
    }
}
