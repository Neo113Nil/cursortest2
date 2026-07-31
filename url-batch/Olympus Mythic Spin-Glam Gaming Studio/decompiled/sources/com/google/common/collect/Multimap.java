package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public interface Multimap {
    Map asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection entries();

    Collection get(Object obj);

    boolean isEmpty();

    Set keySet();

    boolean put(Object obj, Object obj2);

    boolean putAll(Multimap multimap);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
