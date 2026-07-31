package com.yandex.div.core.expression.storedvalues;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.RawJsonRepositoryResult;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StoredValuesController.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u001a\u001a\u00020\u001b*\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0012J\u001a\u0010\u001e\u001a\u00020\u001b*\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0012J\u001e\u0010\"\u001a\u00020\u001b*\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0012J\u0014\u0010$\u001a\u00020%*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007H\u0012J\u001c\u0010&\u001a\u00020\u0011*\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012R\u0014\u0010\u0006\u001a\u00020\u00078RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006)"}, d2 = {"Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;", "", "divStorageComponentLazy", "Lcom/yandex/yatagan/Lazy;", "Lcom/yandex/div/storage/DivStorageComponent;", "(Lcom/yandex/yatagan/Lazy;)V", "currentTime", "", "getCurrentTime", "()J", "rawJsonRepository", "Lcom/yandex/div/storage/RawJsonRepository;", "getRawJsonRepository", "()Lcom/yandex/div/storage/RawJsonRepository;", "rawJsonRepository$delegate", "Lkotlin/Lazy;", "getStoredValue", "Lcom/yandex/div/data/StoredValue;", "name", "", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "setStoredValue", "", "storedValue", "lifetime", "logDeclarationFailed", "", "cause", "", "logRepositoryErrors", "errors", "", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "logUnknownType", "unknownType", "toJSONObject", "Lorg/json/JSONObject;", "toStoredValue", "type", "Lcom/yandex/div/data/StoredValue$Type;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes8.dex */
public class StoredValuesController {

    /* renamed from: rawJsonRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rawJsonRepository;

    /* compiled from: StoredValuesController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoredValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoredValue.Type.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoredValuesController(@NotNull final com.yandex.yatagan.Lazy lazy) {
        this.rawJsonRepository = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$rawJsonRepository$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final RawJsonRepository mo4828invoke() {
                return ((DivStorageComponent) com.yandex.yatagan.Lazy.this.get()).getRawJsonRepository();
            }
        });
    }

    private RawJsonRepository getRawJsonRepository() {
        return (RawJsonRepository) this.rawJsonRepository.getValue();
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static /* synthetic */ StoredValue getStoredValue$default(StoredValuesController storedValuesController, String str, ErrorCollector errorCollector, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStoredValue");
        }
        if ((i & 2) != 0) {
            errorCollector = null;
        }
        return storedValuesController.getStoredValue(str, errorCollector);
    }

    @Nullable
    public StoredValue getStoredValue(@NotNull String name, @Nullable ErrorCollector errorCollector) {
        JSONObject data;
        final String str = "stored_value_" + name;
        RawJsonRepositoryResult rawJsonRepositoryResult = getRawJsonRepository().get(CollectionsKt.listOf(str));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResult.getErrors());
        }
        RawJson rawJson = (RawJson) CollectionsKt.firstOrNull((List) rawJsonRepositoryResult.getResultData());
        if (rawJson != null && (data = rawJson.getData()) != null) {
            if (data.has("expiration_time")) {
                if (getCurrentTime() >= data.getLong("expiration_time")) {
                    getRawJsonRepository().remove(new Function1() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$getStoredValue$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull RawJson rawJson2) {
                            return Boolean.valueOf(Intrinsics.areEqual(rawJson2.getId(), str));
                        }
                    });
                    return null;
                }
            }
            try {
                String string = data.getString("type");
                StoredValue.Type fromString = StoredValue.Type.INSTANCE.fromString(string);
                if (fromString == null) {
                    logUnknownType(errorCollector, name, string);
                    return null;
                }
                return toStoredValue(data, fromString, name);
            } catch (JSONException e) {
                logDeclarationFailed(errorCollector, name, e);
            }
        }
        return null;
    }

    public static /* synthetic */ boolean setStoredValue$default(StoredValuesController storedValuesController, StoredValue storedValue, long j, ErrorCollector errorCollector, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStoredValue");
        }
        if ((i & 4) != 0) {
            errorCollector = null;
        }
        return storedValuesController.setStoredValue(storedValue, j, errorCollector);
    }

    public boolean setStoredValue(@NotNull StoredValue storedValue, long lifetime, @Nullable ErrorCollector errorCollector) {
        RawJsonRepositoryResult put = getRawJsonRepository().put(new RawJsonRepository.Payload(CollectionsKt.listOf(RawJson.INSTANCE.invoke("stored_value_" + storedValue.getName(), toJSONObject(storedValue, lifetime))), null, 2, null));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, put.getErrors());
        }
        return put.getErrors().isEmpty();
    }

    private void logRepositoryErrors(ErrorCollector errorCollector, List<RawJsonRepositoryException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            errorCollector.logError((RawJsonRepositoryException) it.next());
        }
    }

    private void logUnknownType(ErrorCollector errorCollector, String str, String str2) {
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + str2 + '\'', null, 2, null);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    static /* synthetic */ void logDeclarationFailed$default(StoredValuesController storedValuesController, ErrorCollector errorCollector, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDeclarationFailed");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        storedValuesController.logDeclarationFailed(errorCollector, str, th);
    }

    private void logDeclarationFailed(ErrorCollector errorCollector, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Stored value '");
        sb.append(str);
        sb.append("' declaration failed: ");
        sb.append(th != null ? th.getMessage() : null);
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException(sb.toString(), th);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private StoredValue toStoredValue(JSONObject jSONObject, StoredValue.Type type, String str) throws JSONException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, jSONObject.getString("value"));
            case 2:
                return new StoredValue.IntegerStoredValue(str, jSONObject.getLong("value"));
            case 3:
                return new StoredValue.BooleanStoredValue(str, jSONObject.getBoolean("value"));
            case 4:
                return new StoredValue.DoubleStoredValue(str, jSONObject.getDouble("value"));
            case 5:
                return new StoredValue.ColorStoredValue(str, Color.INSTANCE.m7334parseC4zCDoM(jSONObject.getString("value")), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, Url.INSTANCE.m7343fromVcSV9u8(jSONObject.getString("value")), null);
            case 7:
                return new StoredValue.ArrayStoredValue(str, jSONObject.getJSONArray("value"));
            case 8:
                return new StoredValue.DictStoredValue(str, jSONObject.getJSONObject("value"));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private JSONObject toJSONObject(StoredValue storedValue, long j) {
        Object obj;
        if (storedValue instanceof StoredValue.StringStoredValue ? true : storedValue instanceof StoredValue.IntegerStoredValue ? true : storedValue instanceof StoredValue.BooleanStoredValue ? true : storedValue instanceof StoredValue.ArrayStoredValue ? true : storedValue instanceof StoredValue.DictStoredValue ? true : storedValue instanceof StoredValue.DoubleStoredValue) {
            obj = storedValue.getValue();
        } else {
            if (!(storedValue instanceof StoredValue.UrlStoredValue ? true : storedValue instanceof StoredValue.ColorStoredValue)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = storedValue.getValue().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expiration_time", getCurrentTime() + (j * 1000));
        jSONObject.put("type", StoredValue.Type.INSTANCE.toString(storedValue.getType()));
        jSONObject.put("value", obj);
        return jSONObject;
    }
}
