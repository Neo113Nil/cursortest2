package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public abstract class ForwardingMap extends ForwardingObject implements Map {
    @Override // com.google.common.collect.ForwardingObject
    protected abstract Map delegate();

    protected ForwardingMap() {
    }

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public Object get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    public Set<Object> keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return delegate().values();
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(Map<Object, Object> map) {
        Maps.putAllImpl(this, map);
    }

    protected Object standardRemove(Object obj) {
        Iterator<Map.Entry<Object, Object>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (Objects.equal(next.getKey(), obj)) {
                Object value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return Maps.containsKeyImpl(this, obj);
    }

    protected boolean standardContainsValue(Object obj) {
        return Maps.containsValueImpl(this, obj);
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected boolean standardEquals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    protected String standardToString() {
        return Maps.toStringImpl(this);
    }
}
