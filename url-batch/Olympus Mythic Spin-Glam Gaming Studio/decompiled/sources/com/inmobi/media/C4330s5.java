package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4330s5 {
    public final Context a;
    public final ArrayList b;
    public final int c;
    public final ExecutorService d;

    public C4330s5(Context context, ArrayList tableInfos, int i, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter("com.im_11.3.0.db", "name");
        Intrinsics.checkNotNullParameter(tableInfos, "tableInfos");
        this.a = context;
        this.b = tableInfos;
        this.c = i;
        this.d = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4330s5)) {
            return false;
        }
        C4330s5 c4330s5 = (C4330s5) obj;
        return Intrinsics.areEqual(this.a, c4330s5.a) && Intrinsics.areEqual("com.im_11.3.0.db", "com.im_11.3.0.db") && Intrinsics.areEqual(this.b, c4330s5.b) && this.c == c4330s5.c && Intrinsics.areEqual(this.d, c4330s5.d);
    }

    public final int hashCode() {
        int a = Ai.a(this.c, (this.b.hashCode() + Ai.a(1, (((this.a == null ? 0 : r0.hashCode()) * 31) - 1959053993) * 31, 31)) * 31, 31);
        ExecutorService executorService = this.d;
        return a + (executorService != null ? executorService.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.a + ", name=com.im_11.3.0.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + this.d + ")";
    }
}
