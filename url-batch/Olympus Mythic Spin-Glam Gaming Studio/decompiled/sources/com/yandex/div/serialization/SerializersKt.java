package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Serializers.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0006\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\u000b\u001aL\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002`\r\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aJ\u0010\u0013\u001a$\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0010j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002`\u0012\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"V", "Lcom/yandex/div/serialization/Serializer;", "Lorg/json/JSONObject;", "Lcom/yandex/div/serialization/ParsingContext;", "context", "value", "serialize", "(Lcom/yandex/div/serialization/Serializer;Lcom/yandex/div/serialization/ParsingContext;Ljava/lang/Object;)Lorg/json/JSONObject;", "", "list", "Lorg/json/JSONArray;", "(Lcom/yandex/div/serialization/Serializer;Lcom/yandex/div/serialization/ParsingContext;Ljava/util/List;)Lorg/json/JSONArray;", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "asConverter", "(Lcom/yandex/div/serialization/Serializer;Lcom/yandex/div/serialization/ParsingContext;)Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lcom/yandex/div/internal/parser/Creator;", "asCreator", "(Lcom/yandex/div/serialization/Serializer;)Lkotlin/jvm/functions/Function2;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SerializersKt {
    @ExperimentalApi
    @Nullable
    public static final <V> JSONObject serialize(@NotNull Serializer<JSONObject, V> serializer, @NotNull ParsingContext parsingContext, @Nullable V v) {
        if (v == null) {
            return null;
        }
        try {
            return serializer.serialize(parsingContext, v);
        } catch (ParsingException e) {
            parsingContext.getLogger().logError(e);
            return null;
        }
    }

    @ExperimentalApi
    @Nullable
    public static final <V> JSONArray serialize(@NotNull Serializer<JSONObject, V> serializer, @NotNull ParsingContext parsingContext, @Nullable List<? extends V> list) {
        if (list == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jSONArray.put(serializer.serialize(parsingContext, list.get(i)));
            }
            return jSONArray;
        } catch (ParsingException e) {
            parsingContext.getLogger().logError(e);
            return null;
        }
    }

    @ExperimentalApi
    public static final /* synthetic */ <V> Function1 asConverter(final Serializer<JSONObject, V> serializer, final ParsingContext parsingContext) {
        Intrinsics.needClassReification();
        return new Function1() { // from class: com.yandex.div.serialization.SerializersKt$asConverter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((SerializersKt$asConverter$1) obj);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONObject invoke(V v) {
                return serializer.serialize(parsingContext, v);
            }
        };
    }

    public static final /* synthetic */ <V> Function2 asCreator(final Serializer<JSONObject, V> serializer) {
        Intrinsics.needClassReification();
        return new Function2() { // from class: com.yandex.div.serialization.SerializersKt$asCreator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((ParsingEnvironment) obj, (ParsingEnvironment) obj2);
            }

            @NotNull
            public final JSONObject invoke(@NotNull ParsingEnvironment parsingEnvironment, V v) {
                return serializer.serialize(parsingEnvironment, v);
            }
        };
    }
}
