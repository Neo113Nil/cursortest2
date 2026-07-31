package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionUpdateStructure;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivActionTypedUpdateStructureHandler.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J*\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J.\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006 "}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "findStructureElement", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "root", "pathSegments", "", "", "handleAction", "", "action", "Lcom/yandex/div2/DivActionUpdateStructure;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "scopeId", "Lcom/yandex/div2/DivActionTyped;", "view", "setValue", "target", "pathSegment", "newValue", "", "updateArrayStructure", "", "variable", "Lcom/yandex/div/data/Variable$ArrayVariable;", "updateDictStructure", "Lcom/yandex/div/data/Variable$DictVariable;", "Structure", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivActionTypedUpdateStructureHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof DivActionTyped.UpdateStructure) {
            return handleAction(((DivActionTyped.UpdateStructure) action).getValue(), view, resolver);
        }
        return false;
    }

    private final boolean handleAction(DivActionUpdateStructure action, final Div2View divView, ExpressionResolver resolver) {
        String str = (String) action.variableName.evaluate(resolver);
        String str2 = (String) action.path.evaluate(resolver);
        List split$default = StringsKt.split$default((CharSequence) str2, new String[]{"/"}, false, 0, 6, (Object) null);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        final Object evaluate = DivActionTypedUtilsKt.evaluate(action.value, resolver);
        if (str2.length() > 0 && arrayList.isEmpty()) {
            DivActionTypedUtilsKt.logError(divView, new RuntimeException("Malformed path '" + str2 + "': all path segments are empty"));
            return true;
        }
        VariableMutationHandler.INSTANCE.setVariable(divView, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler$handleAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                if (variable instanceof Variable.ArrayVariable) {
                    DivActionTypedUpdateStructureHandler.this.updateArrayStructure(divView, (Variable.ArrayVariable) variable, arrayList, evaluate);
                } else if (variable instanceof Variable.DictVariable) {
                    DivActionTypedUpdateStructureHandler.this.updateDictStructure(divView, (Variable.DictVariable) variable, arrayList, evaluate);
                } else {
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Action requires array or dictionary variable"));
                }
                return variable;
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateArrayStructure(Div2View divView, Variable.ArrayVariable variable, List<String> pathSegments, Object newValue) {
        Object value = variable.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) value;
        Structure findStructureElement = findStructureElement(divView, new Structure.Array(jSONArray), CollectionsKt.dropLast(pathSegments, 1));
        if (findStructureElement == null || !setValue(divView, findStructureElement, (String) CollectionsKt.last((List) pathSegments), newValue)) {
            return;
        }
        variable.set(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDictStructure(Div2View divView, Variable.DictVariable variable, List<String> pathSegments, Object newValue) {
        Object value = variable.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) value;
        Structure findStructureElement = findStructureElement(divView, new Structure.Dictionary(jSONObject), CollectionsKt.dropLast(pathSegments, 1));
        if (findStructureElement == null || !setValue(divView, findStructureElement, (String) CollectionsKt.last((List) pathSegments), newValue)) {
            return;
        }
        variable.set(jSONObject);
    }

    private final Structure findStructureElement(Div2View divView, Structure root, List<String> pathSegments) {
        int i = 0;
        Structure structure = root;
        for (Object obj : pathSegments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            try {
                structure = structure.get(str);
                if (Intrinsics.areEqual(structure, Structure.NonStructure.INSTANCE)) {
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Element with path '" + CollectionsKt.joinToString$default(CollectionsKt.take(pathSegments, i2), "/", null, null, 0, null, null, 62, null) + "' is not a structure"));
                    return null;
                }
                if (structure == null) {
                    DivActionTypedUtilsKt.logError(divView, new RuntimeException("Element with path '" + CollectionsKt.joinToString$default(CollectionsKt.take(pathSegments, i2), "/", null, null, 0, null, null, 62, null) + "' is not found"));
                    return null;
                }
                i = i2;
            } catch (NumberFormatException e) {
                DivActionTypedUtilsKt.logError(divView, new RuntimeException("Unable to use '" + str + "' as array index", e));
                return null;
            }
        }
        return structure;
    }

    private final boolean setValue(Div2View divView, Structure target, String pathSegment, Object newValue) {
        try {
            target.set(pathSegment, newValue);
            return true;
        } catch (IndexOutOfBoundsException e) {
            DivActionTypedUtilsKt.logError(divView, new RuntimeException("Position '" + pathSegment + "' is out of array bounds", e));
            return false;
        } catch (NumberFormatException e2) {
            DivActionTypedUtilsKt.logError(divView, new RuntimeException("Unable to use '" + pathSegment + "' as array index", e2));
            return false;
        }
    }

    /* compiled from: DivActionTypedUpdateStructureHandler.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\f\r\u000eJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "", "size", "", "getSize", "()I", "get", "key", "", "set", "", "value", "Array", "Dictionary", "NonStructure", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Array;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Dictionary;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$NonStructure;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface Structure {
        @Nullable
        Structure get(@NotNull String key);

        int getSize();

        void set(@NotNull String key, @NotNull Object value);

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Array;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "array", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "size", "", "getSize", "()I", "get", "key", "", "set", "", "value", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Array implements Structure {

            @NotNull
            private final JSONArray array;

            public Array(@NotNull JSONArray jSONArray) {
                this.array = jSONArray;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public int getSize() {
                return this.array.length();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                Object opt = this.array.opt(Integer.parseInt(key));
                if (opt instanceof JSONArray) {
                    return new Array((JSONArray) opt);
                }
                if (opt instanceof JSONObject) {
                    return new Dictionary((JSONObject) opt);
                }
                if (opt == null ? true : Intrinsics.areEqual(opt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                int parseInt = Integer.parseInt(key);
                if (parseInt < 0 || parseInt > getSize()) {
                    throw new IndexOutOfBoundsException();
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m8023constructorimpl(this.array.put(parseInt, value));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
            }
        }

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$Dictionary;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "dictionary", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "size", "", "getSize", "()I", "get", "key", "", "set", "", "value", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dictionary implements Structure {

            @NotNull
            private final JSONObject dictionary;

            public Dictionary(@NotNull JSONObject jSONObject) {
                this.dictionary = jSONObject;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public int getSize() {
                return this.dictionary.length();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                Object opt = this.dictionary.opt(key);
                if (opt instanceof JSONArray) {
                    return new Array((JSONArray) opt);
                }
                if (opt instanceof JSONObject) {
                    return new Dictionary((JSONObject) opt);
                }
                if (opt == null ? true : Intrinsics.areEqual(opt, JSONObject.NULL)) {
                    return null;
                }
                return NonStructure.INSTANCE;
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m8023constructorimpl(this.dictionary.put(key, value));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
            }
        }

        /* compiled from: DivActionTypedUpdateStructureHandler.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure$NonStructure;", "Lcom/yandex/div/core/actions/DivActionTypedUpdateStructureHandler$Structure;", "()V", "size", "", "getSize", "()I", "get", "key", "", "set", "", "value", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NonStructure implements Structure {

            @NotNull
            public static final NonStructure INSTANCE = new NonStructure();

            private NonStructure() {
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public int getSize() {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            @Nullable
            public Structure get(@NotNull String key) {
                throw new UnsupportedOperationException();
            }

            @Override // com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler.Structure
            public void set(@NotNull String key, @NotNull Object value) {
                throw new UnsupportedOperationException();
            }
        }
    }
}
