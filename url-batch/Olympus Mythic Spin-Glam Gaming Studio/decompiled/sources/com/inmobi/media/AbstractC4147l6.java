package com.inmobi.media;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4147l6 {
    public final String a;
    public final C4308r9 b;

    public AbstractC4147l6(String tableName, C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = tableName;
        this.b = databaseHelper;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        String str = "SELECT COUNT(*) FROM " + this.a;
        C4308r9 c4308r9 = this.b;
        c4308r9.getClass();
        return c4308r9.a(new C4072i9(c4308r9, str, null), continuationImpl);
    }

    public abstract Object b(int i, ContinuationImpl continuationImpl);

    public final Object a(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, new Function1() { // from class: com.inmobi.media.l6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC4147l6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object a = C4308r9.a(this.b, this.a, "id IN (" + joinToString$default + ")", suspendLambda, 4);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public static final CharSequence a(int i) {
        return String.valueOf(i);
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        Object a = C4308r9.a(this.b, this.a, "ts < " + j, continuationImpl, 4);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final Object a(int i, ContinuationImpl continuationImpl) {
        String str = this.a;
        Object a = this.b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i + ")", continuationImpl);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
