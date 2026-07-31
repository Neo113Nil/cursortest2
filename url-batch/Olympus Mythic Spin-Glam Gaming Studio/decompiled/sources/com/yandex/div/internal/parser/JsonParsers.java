package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public class JsonParsers {

    @NonNull
    private static final ValueValidator<?> ALWAYS_VALID = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonParsers$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean lambda$static$0;
            lambda$static$0 = JsonParsers.lambda$static$0(obj);
            return lambda$static$0;
        }
    };

    @NonNull
    private static final ValueValidator<String> ALWAYS_VALID_STRING = new ValueValidator() { // from class: com.yandex.div.internal.parser.JsonParsers$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean lambda$static$1;
            lambda$static$1 = JsonParsers.lambda$static$1((String) obj);
            return lambda$static$1;
        }
    };

    @NonNull
    private static final ListValidator<?> ALWAYS_VALID_LIST = new ListValidator() { // from class: com.yandex.div.internal.parser.JsonParsers$$ExternalSyntheticLambda2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean lambda$static$2;
            lambda$static$2 = JsonParsers.lambda$static$2(list);
            return lambda$static$2;
        }
    };

    @NonNull
    private static final Function1 AS_IS = new Function1() { // from class: com.yandex.div.internal.parser.JsonParsers$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object lambda$static$3;
            lambda$static$3 = JsonParsers.lambda$static$3(obj);
            return lambda$static$3;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$2(List list) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        return obj;
    }

    private JsonParsers() {
    }

    @NonNull
    public static <T> ValueValidator<T> alwaysValid() {
        return (ValueValidator<T>) ALWAYS_VALID;
    }

    @NonNull
    static ValueValidator<String> alwaysValidString() {
        return ALWAYS_VALID_STRING;
    }

    @NonNull
    public static <T> ListValidator<T> alwaysValidList() {
        return (ListValidator<T>) ALWAYS_VALID_LIST;
    }

    @NonNull
    public static <T> Function1 doNotConvert() {
        return AS_IS;
    }
}
