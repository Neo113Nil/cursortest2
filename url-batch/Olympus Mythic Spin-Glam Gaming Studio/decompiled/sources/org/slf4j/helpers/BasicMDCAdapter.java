package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

/* loaded from: classes13.dex */
public class BasicMDCAdapter implements MDCAdapter {
    private final ThreadLocalMapOfStacks threadLocalMapOfDeques = new ThreadLocalMapOfStacks();
    private final InheritableThreadLocal inheritableThreadLocalMap = new InheritableThreadLocal() { // from class: org.slf4j.helpers.BasicMDCAdapter.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    };
}
