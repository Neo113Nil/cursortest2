package com.smaato.sdk.ng.vpaid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class c$$ExternalSyntheticBackport1 {
    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
