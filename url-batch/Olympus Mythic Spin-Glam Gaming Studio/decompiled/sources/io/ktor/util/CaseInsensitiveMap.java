package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: CaseInsensitiveMap.kt */
/* loaded from: classes15.dex */
public final class CaseInsensitiveMap implements Map, KMutableMap {
    private final Map delegate = new LinkedHashMap();

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    public int getSize() {
        return this.delegate.size();
    }

    public boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.containsKey(new CaseInsensitiveString(key));
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.delegate.containsValue(obj);
    }

    public Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.get(TextKt.caseInsensitive(key));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public Object put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.put(TextKt.caseInsensitive(key), value);
    }

    public Object remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.remove(TextKt.caseInsensitive(key));
    }

    public Set getKeys() {
        return new DelegatingMutableSet(this.delegate.keySet(), new Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String _get_keys_$lambda$1;
                _get_keys_$lambda$1 = CaseInsensitiveMap._get_keys_$lambda$1((CaseInsensitiveString) obj);
                return _get_keys_$lambda$1;
            }
        }, new Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CaseInsensitiveString _get_keys_$lambda$2;
                _get_keys_$lambda$2 = CaseInsensitiveMap._get_keys_$lambda$2((String) obj);
                return _get_keys_$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_keys_$lambda$1(CaseInsensitiveString DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return DelegatingMutableSet.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CaseInsensitiveString _get_keys_$lambda$2(String DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return TextKt.caseInsensitive(DelegatingMutableSet);
    }

    public Set getEntries() {
        return new DelegatingMutableSet(this.delegate.entrySet(), new Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map.Entry _get_entries_$lambda$3;
                _get_entries_$lambda$3 = CaseInsensitiveMap._get_entries_$lambda$3((Map.Entry) obj);
                return _get_entries_$lambda$3;
            }
        }, new Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map.Entry _get_entries_$lambda$4;
                _get_entries_$lambda$4 = CaseInsensitiveMap._get_entries_$lambda$4((Map.Entry) obj);
                return _get_entries_$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$3(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new Entry(((CaseInsensitiveString) DelegatingMutableSet.getKey()).getContent(), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$4(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new Entry(TextKt.caseInsensitive((String) DelegatingMutableSet.getKey()), DelegatingMutableSet.getValue());
    }

    public Collection getValues() {
        return this.delegate.values();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CaseInsensitiveMap)) {
            return false;
        }
        return Intrinsics.areEqual(((CaseInsensitiveMap) obj).delegate, this.delegate);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }
}
