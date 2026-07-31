package com.apollographql.apollo.api.json.internal;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonScope.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo/api/json/internal/JsonScope;", "", "<init>", "()V", "EMPTY_ARRAY", "", "NONEMPTY_ARRAY", "EMPTY_OBJECT", "DANGLING_NAME", "NONEMPTY_OBJECT", "EMPTY_DOCUMENT", "NONEMPTY_DOCUMENT", "CLOSED", "getPath", "", "stackSize", StackTraceHelper.STACK_KEY, "", "pathNames", "", "", "pathIndices", "(I[I[Ljava/lang/String;[I)Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final JsonScope INSTANCE = new JsonScope();
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public final List<Object> getPath(int stackSize, int[] stack, String[] pathNames, int[] pathIndices) {
        String str;
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(pathNames, "pathNames");
        Intrinsics.checkNotNullParameter(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < stackSize; i++) {
            int i2 = stack[i];
            if (i2 == 1 || i2 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i]));
            } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (str = pathNames[i]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
