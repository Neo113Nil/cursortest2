package com.yandex.div.internal.parser;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonTopologicalSorting.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0001\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002Jv\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122.\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0016`\u0017H\u0002J6\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0002J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010#\u001a\u00020$2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/yandex/div/internal/parser/JsonTopologicalSorting;", "", "()V", "TYPE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "parseTypeDependencies", "", "", "context", "Lcom/yandex/div/serialization/ParsingContext;", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "processType", "", "type", "types", "visited", "", "processed", "sorted", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "readObjectDependencies", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "requireParent", "", "dependencies", "", "readOptionalParent", "readParent", "sort", "", "throwCyclicDependency", "", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JsonTopologicalSorting {

    @NotNull
    public static final JsonTopologicalSorting INSTANCE = new JsonTopologicalSorting();

    @NotNull
    private static final ValueValidator<String> TYPE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonTopologicalSorting$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean TYPE_VALIDATOR$lambda$0;
            TYPE_VALIDATOR$lambda$0 = JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
            return TYPE_VALIDATOR$lambda$0;
        }
    };

    private JsonTopologicalSorting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TYPE_VALIDATOR$lambda$0(String str) {
        return str.length() > 0;
    }

    @NotNull
    public final Map<String, Set<String>> sort(@NotNull ParsingContext context, @NotNull JSONObject json) throws JSONException, ParsingException, CyclicDependencyException {
        Map<String, List<String>> parseTypeDependencies = parseTypeDependencies(context, json);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        Iterator<String> it = parseTypeDependencies.keySet().iterator();
        while (it.hasNext()) {
            processType(it.next(), parseTypeDependencies, linkedHashSet, linkedHashSet2, linkedHashMap);
        }
        return linkedHashMap;
    }

    private final Map<String, List<String>> parseTypeDependencies(ParsingContext context, JSONObject json) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(json.length());
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = json.get(next);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                ArrayList arrayList = new ArrayList();
                INSTANCE.readObjectDependencies(context, new TemplateParsingErrorLogger(context.getLogger(), next), jSONObject, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        return linkedHashMap;
    }

    private final void readObjectDependencies(ParsingContext context, ParsingErrorLogger logger, JSONObject json, boolean requireParent, List<String> dependencies) {
        String readOptionalParent;
        if (requireParent) {
            readOptionalParent = readParent(context, json);
        } else {
            readOptionalParent = readOptionalParent(context, json);
        }
        if (readOptionalParent != null) {
            dependencies.add(readOptionalParent);
        }
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            Object obj = json.get(keys.next());
            if (obj instanceof JSONObject) {
                INSTANCE.readObjectDependencies(context, logger, (JSONObject) obj, false, dependencies);
            }
        }
        Iterator<String> keys2 = json.keys();
        while (keys2.hasNext()) {
            Object obj2 = json.get(keys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj3 = jSONArray.get(i);
                    if (obj3 instanceof JSONObject) {
                        INSTANCE.readObjectDependencies(context, logger, (JSONObject) obj3, false, dependencies);
                    }
                }
            }
        }
    }

    private final String readParent(ParsingContext context, JSONObject json) {
        return (String) JsonPropertyParser.read(context, json, "type", TYPE_VALIDATOR);
    }

    private final String readOptionalParent(ParsingContext context, JSONObject json) {
        return (String) JsonPropertyParser.readOptional(context, json, "type", TYPE_VALIDATOR);
    }

    private final void processType(String type, Map<String, List<String>> types, Set<String> visited, Set<String> processed, LinkedHashMap<String, Set<String>> sorted) {
        List list;
        if (visited.contains(type)) {
            throwCyclicDependency(CollectionsKt.toList(visited), type);
            throw new KotlinNothingValueException();
        }
        if (processed.contains(type)) {
            return;
        }
        List<String> list2 = types.get(type);
        if (list2 != null) {
            list = new ArrayList();
            for (Object obj : list2) {
                if (types.containsKey((String) obj)) {
                    list.add(obj);
                }
            }
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            visited.add(type);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                processType((String) it.next(), types, visited, processed, sorted);
            }
            visited.remove(type);
        }
        processed.add(type);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        sorted.put(type, CollectionsKt.toSet(list));
    }

    private final Void throwCyclicDependency(List<String> visited, String type) {
        StringBuilder sb = new StringBuilder();
        int size = visited.size();
        for (int indexOf = visited.indexOf(type); indexOf < size; indexOf++) {
            sb.append(visited.get(indexOf));
            sb.append(" -> ");
        }
        sb.append(type);
        throw new CyclicDependencyException(sb.toString());
    }
}
