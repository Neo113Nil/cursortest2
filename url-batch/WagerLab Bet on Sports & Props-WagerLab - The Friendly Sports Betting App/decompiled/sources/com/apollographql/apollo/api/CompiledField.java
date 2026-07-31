package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okio.Buffer;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001)BM\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u001bj\u0002` 0\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ8\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0018\u00010\u001bj\u0002` 0\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%0$H\u0007J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010'\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/apollographql/apollo/api/CompiledField;", "Lcom/apollographql/apollo/api/CompiledSelection;", "name", "", "type", "Lcom/apollographql/apollo/api/CompiledType;", "alias", "condition", "", "Lcom/apollographql/apollo/api/CompiledCondition;", "arguments", "Lcom/apollographql/apollo/api/CompiledArgument;", "selections", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/CompiledType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/apollographql/apollo/api/CompiledType;", "getAlias", "getCondition", "()Ljava/util/List;", "getArguments", "getSelections", "responseName", "getResponseName", "resolveArgument", "", "variables", "Lcom/apollographql/apollo/api/Executable$Variables;", "argumentValue", "Lcom/apollographql/apollo/api/Optional;", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "argumentValues", "", ViewProps.FILTER, "Lkotlin/Function1;", "", "nameWithArguments", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/CompiledField$Builder;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledField extends CompiledSelection {
    private final String alias;
    private final List<CompiledArgument> arguments;
    private final List<CompiledCondition> condition;
    private final String name;
    private final List<CompiledSelection> selections;
    private final CompiledType type;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean argumentValues$lambda$1(CompiledArgument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public final CompiledType getType() {
        return this.type;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final List<CompiledCondition> getCondition() {
        return this.condition;
    }

    public final List<CompiledArgument> getArguments() {
        return this.arguments;
    }

    public final List<CompiledSelection> getSelections() {
        return this.selections;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompiledField(String name, CompiledType type, String str, List<CompiledCondition> condition, List<CompiledArgument> arguments, List<? extends CompiledSelection> selections) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(selections, "selections");
        this.name = name;
        this.type = type;
        this.alias = str;
        this.condition = condition;
        this.arguments = arguments;
        this.selections = selections;
    }

    public final String getResponseName() {
        String str = this.alias;
        return str == null ? this.name : str;
    }

    @Deprecated(message = "This function does not distinguish between null and absent arguments. Use argumentValue instead", replaceWith = @ReplaceWith(expression = "argumentValue(name = name, variables = variables)", imports = {}))
    public final Object resolveArgument(String name, Executable.Variables variables) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variables, "variables");
        return argumentValue(name, variables).getOrNull();
    }

    public final Optional<Object> argumentValue(String name, Executable.Variables variables) {
        Object obj;
        Object resolveVariables;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variables, "variables");
        Iterator<T> it = this.arguments.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((CompiledArgument) obj).getDefinition().getName(), name)) {
                break;
            }
        }
        CompiledArgument compiledArgument = (CompiledArgument) obj;
        if (compiledArgument == null) {
            return Optional.Absent.INSTANCE;
        }
        if (compiledArgument.getValue() instanceof Optional.Absent) {
            return Optional.Absent.INSTANCE;
        }
        Object orThrow = compiledArgument.getValue().getOrThrow();
        if (orThrow instanceof CompiledVariable) {
            CompiledVariable compiledVariable = (CompiledVariable) orThrow;
            if (variables.getValueMap().containsKey(compiledVariable.getName())) {
                return Optional.INSTANCE.present(variables.getValueMap().get(compiledVariable.getName()));
            }
            return Optional.Absent.INSTANCE;
        }
        Optional.Companion companion = Optional.INSTANCE;
        resolveVariables = CompiledGraphQL.resolveVariables(orThrow, variables);
        return companion.present(resolveVariables);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map argumentValues$default(CompiledField compiledField, Executable.Variables variables, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.apollographql.apollo.api.CompiledField$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean argumentValues$lambda$1;
                    argumentValues$lambda$1 = CompiledField.argumentValues$lambda$1((CompiledArgument) obj2);
                    return Boolean.valueOf(argumentValues$lambda$1);
                }
            };
        }
        return compiledField.argumentValues(variables, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Object> argumentValues(Executable.Variables variables, Function1<? super CompiledArgument, Boolean> filter) {
        Object resolveVariables;
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(filter, "filter");
        List<CompiledArgument> list = this.arguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (filter.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CompiledArgument) obj2).getValue() instanceof Optional.Present) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return MapsKt.emptyMap();
        }
        ArrayList<CompiledArgument> arrayList4 = arrayList3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
        for (CompiledArgument compiledArgument : arrayList4) {
            Pair pair = TuplesKt.to(compiledArgument.getDefinition().getName(), compiledArgument.getValue().getOrThrow());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        resolveVariables = CompiledGraphQL.resolveVariables(linkedHashMap, variables);
        Intrinsics.checkNotNull(resolveVariables, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) resolveVariables;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nameWithArguments$lambda$4(CompiledArgument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.getDefinition().getIsPagination();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String nameWithArguments(Executable.Variables variables) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        Map<String, Object> argumentValues = argumentValues(variables, new Function1() { // from class: com.apollographql.apollo.api.CompiledField$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean nameWithArguments$lambda$4;
                nameWithArguments$lambda$4 = CompiledField.nameWithArguments$lambda$4((CompiledArgument) obj);
                return Boolean.valueOf(nameWithArguments$lambda$4);
            }
        });
        if (argumentValues.isEmpty()) {
            return this.name;
        }
        try {
            Buffer buffer = new Buffer();
            BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer, null, 2, 0 == true ? 1 : 0);
            JsonWriters.writeAny(bufferedSinkJsonWriter, argumentValues);
            bufferedSinkJsonWriter.close();
            return this.name + '(' + buffer.readUtf8() + ')';
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* compiled from: CompiledGraphQL.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011J\u0006\u0010\u0017\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/apollographql/apollo/api/CompiledField$Builder;", "", "name", "", "type", "Lcom/apollographql/apollo/api/CompiledType;", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/CompiledType;)V", "compiledField", "Lcom/apollographql/apollo/api/CompiledField;", "(Lcom/apollographql/apollo/api/CompiledField;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/apollographql/apollo/api/CompiledType;", "alias", "condition", "", "Lcom/apollographql/apollo/api/CompiledCondition;", "arguments", "Lcom/apollographql/apollo/api/CompiledArgument;", "selections", "Lcom/apollographql/apollo/api/CompiledSelection;", InAppPurchaseConstants.METHOD_BUILD, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private String alias;
        private List<CompiledArgument> arguments;
        private List<CompiledCondition> condition;
        private final String name;
        private List<? extends CompiledSelection> selections;
        private final CompiledType type;

        public Builder(String name, CompiledType type) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
            this.condition = CollectionsKt.emptyList();
            this.arguments = CollectionsKt.emptyList();
            this.selections = CollectionsKt.emptyList();
        }

        public final String getName() {
            return this.name;
        }

        public final CompiledType getType() {
            return this.type;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(CompiledField compiledField) {
            this(compiledField.getName(), compiledField.getType());
            Intrinsics.checkNotNullParameter(compiledField, "compiledField");
            this.alias = compiledField.getAlias();
            this.condition = compiledField.getCondition();
            this.arguments = compiledField.getArguments();
            this.selections = compiledField.getSelections();
        }

        public final Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        public final Builder condition(List<CompiledCondition> condition) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            this.condition = condition;
            return this;
        }

        public final Builder arguments(List<CompiledArgument> arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            this.arguments = arguments;
            return this;
        }

        public final Builder selections(List<? extends CompiledSelection> selections) {
            Intrinsics.checkNotNullParameter(selections, "selections");
            this.selections = selections;
            return this;
        }

        public final CompiledField build() {
            return new CompiledField(this.name, this.type, this.alias, this.condition, this.arguments, this.selections);
        }
    }
}
