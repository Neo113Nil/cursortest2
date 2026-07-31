package com.mbridge.msdk.config.component.common.express;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class a$$ExternalSyntheticBackport1 {
    public static /* synthetic */ Map m(Map.Entry[] entryArr) {
        HashMap hashMap = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
