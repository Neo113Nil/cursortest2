package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes5.dex */
public interface Multiset extends Collection {

    public interface Entry {
        int getCount();

        Object getElement();
    }

    int add(Object obj, int i);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    int count(Object obj);

    Set elementSet();

    Set entrySet();

    int remove(Object obj, int i);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    boolean remove(Object obj);

    int setCount(Object obj, int i);

    boolean setCount(Object obj, int i, int i2);

    @Override // java.util.Collection, com.google.common.collect.Multiset
    int size();
}
