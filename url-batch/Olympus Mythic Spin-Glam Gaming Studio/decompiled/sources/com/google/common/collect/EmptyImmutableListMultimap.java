package com.google.common.collect;

import java.util.Collection;

/* loaded from: classes13.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    static final EmptyImmutableListMultimap INSTANCE = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.of(), 0);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
