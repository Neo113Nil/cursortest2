package io.ktor.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringValues.kt */
/* loaded from: classes4.dex */
public abstract class StringValuesBuilderImpl implements StringValuesBuilder {
    private final boolean caseInsensitiveName;
    private final Map values;

    protected void validateName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    protected void validateValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public StringValuesBuilderImpl(boolean z, int i) {
        this.caseInsensitiveName = z;
        this.values = z ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(i);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    protected final Map getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public List getAll(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) this.values.get(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.values.containsKey(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set names() {
        return this.values.keySet();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    public void set(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        validateValue(value);
        List ensureListForKey = ensureListForKey(name);
        ensureListForKey.clear();
        ensureListForKey.add(value);
    }

    public String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List all = getAll(name);
        if (all != null) {
            return (String) kotlin.collections.CollectionsKt.firstOrNull(all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void append(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        validateValue(value);
        ensureListForKey(name).add(value);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(StringValues stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.forEach(new Function2() { // from class: io.ktor.util.StringValuesBuilderImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit appendAll$lambda$0;
                appendAll$lambda$0 = StringValuesBuilderImpl.appendAll$lambda$0(StringValuesBuilderImpl.this, (String) obj, (List) obj2);
                return appendAll$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendAll$lambda$0(StringValuesBuilderImpl stringValuesBuilderImpl, String name, List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        stringValuesBuilderImpl.appendAll(name, values);
        return Unit.INSTANCE;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(String name, Iterable values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List ensureListForKey = ensureListForKey(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            validateValue((String) it.next());
        }
        kotlin.collections.CollectionsKt.addAll(ensureListForKey, values);
    }

    public void appendMissing(String name, Iterable values) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List list = (List) this.values.get(name);
        if (list == null || (emptySet = kotlin.collections.CollectionsKt.toSet(list)) == null) {
            emptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!emptySet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        appendAll(name, arrayList);
    }

    public void remove(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.values.remove(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void clear() {
        this.values.clear();
    }

    private final List ensureListForKey(String str) {
        List list = (List) this.values.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        validateName(str);
        this.values.put(str, arrayList);
        return arrayList;
    }
}
