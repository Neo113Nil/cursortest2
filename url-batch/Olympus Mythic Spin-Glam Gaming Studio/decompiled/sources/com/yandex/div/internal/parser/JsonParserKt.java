package com.yandex.div.internal.parser;

import com.ironsource.B5;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.MutableExpressionList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001ax\u0010\u000b\u001a\u00028\u0001\"\u0006\b\u0000\u0010\r\u0018\u0001\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000ej\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u000f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\u0011\u001a!\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0012\u001a]\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0017\u001aE\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\f\u001as\u0010\u0018\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000ej\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u000f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0011\u001a_\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0017\u001aY\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0087\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000ej\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u000f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001e\u001as\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aQ\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"\u001a\u007f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000ej\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u000f2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010#\u001as\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010 \u001aO\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\"\u001a}\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001b\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000ej\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010#\u001a\u0085\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b\"\b\b\u0000\u0010\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010'\u001aS\u0010*\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00018\u00002$\b\u0002\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000`\u000f¢\u0006\u0004\b*\u0010+\u001a2\u0010*\u001a\u00020)\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0013*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b*\u0010,\u001a3\u0010*\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b¢\u0006\u0004\b*\u0010-\u001aW\u0010*\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000`\u000f¢\u0006\u0004\b*\u0010.\u001a3\u00100\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/¢\u0006\u0004\b0\u00101\u001a]\u00100\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\r*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/2\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0004\b0\u00102\u001a3\u00104\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000103¢\u0006\u0004\b4\u00105\u001a]\u00104\u001a\u00020)\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\r*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001032\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000ej\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0004\b4\u00106¨\u00067"}, d2 = {"", "T", "Lorg/json/JSONObject;", "", "key", "Lcom/yandex/div/internal/parser/ValueValidator;", "validator", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "Lcom/yandex/div/json/ParsingEnvironment;", B5.o, "read", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/lang/Object;", "R", "Lkotlin/Function1;", "Lcom/yandex/div/internal/parser/Converter;", "converter", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/lang/Object;", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/ParsingErrorLogger;)Ljava/lang/String;", "Lcom/yandex/div/json/JSONSerializable;", "Lkotlin/Function2;", "Lcom/yandex/div/internal/parser/Creator;", "creator", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Lcom/yandex/div/json/JSONSerializable;", "readOptional", "Lcom/yandex/div/internal/parser/ListValidator;", "itemValidator", "", "readList", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/util/List;", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/util/List;", "readSerializableList", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/util/List;", "readStrictList", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;)Ljava/util/List;", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;)Ljava/util/List;", "readStrictSerializableList", "readOptionalList", "readOptionalSerializableList", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/yandex/div/internal/parser/ListValidator;Lcom/yandex/div/internal/parser/ValueValidator;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/json/ParsingEnvironment;)Ljava/util/List;", "value", "", "write", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/JSONSerializable;)V", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/json/expressions/Expression;", "writeExpression", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/expressions/Expression;)V", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/expressions/Expression;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/json/expressions/ExpressionList;", "writeExpressionList", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionList;)V", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionList;Lkotlin/jvm/functions/Function1;)V", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JsonParserKt {
    public static final <T> void write(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable List<? extends T> list) {
        if (list != null) {
            List<? extends T> list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            if (CollectionsKt.first((List) list) instanceof JSONSerializable) {
                jSONObject.put(str, JsonParserInternalsKt.toJsonArray(list));
            } else {
                jSONObject.put(str, new JSONArray((Collection) list2));
            }
        }
    }

    public static final <T> void write(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable List<? extends T> list, @NotNull Function1 function1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (CollectionsKt.first((List) list) instanceof JSONSerializable) {
            jSONObject.put(str, JsonParserInternalsKt.toJsonArray(list));
            return;
        }
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        jSONObject.put(str, new JSONArray((Collection) arrayList));
    }

    public static /* synthetic */ Object read$default(JSONObject jSONObject, String str, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 2) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return read(jSONObject, str, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NotNull
    public static final <T> T read(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        T t = (T) JsonParserInternalsKt.optSafe(jSONObject, str);
        if (t == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        if (valueValidator.isValid(t)) {
            return t;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, t);
    }

    public static /* synthetic */ Object read$default(JSONObject jSONObject, String str, Function1 function1, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        Object obj2;
        if ((i & 4) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        Object optSafe = JsonParserInternalsKt.optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        Intrinsics.reifiedOperationMarker(2, "R");
        try {
            obj2 = function1.invoke(optSafe);
        } catch (Exception unused) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
        }
        if (valueValidator.isValid(obj2)) {
            return obj2;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, obj2);
    }

    public static final /* synthetic */ <R, T> T read(JSONObject jSONObject, String str, Function1 function1, ValueValidator<T> valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment) {
        T t;
        Object optSafe = JsonParserInternalsKt.optSafe(jSONObject, str);
        if (optSafe == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        Intrinsics.reifiedOperationMarker(2, "R");
        try {
            t = (T) function1.invoke(optSafe);
        } catch (Exception unused) {
            t = null;
        }
        if (t == null) {
            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
        }
        if (valueValidator.isValid(t)) {
            return t;
        }
        throw ParsingExceptionKt.invalidValue(jSONObject, str, t);
    }

    @NotNull
    public static final String read(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingErrorLogger parsingErrorLogger) {
        String optString = jSONObject.optString(str);
        if (optString != null) {
            return optString;
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @NotNull
    public static final <T extends JSONSerializable> T read(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Function2 function2, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        try {
            return (T) function2.invoke(parsingEnvironment, optJSONObject);
        } catch (ParsingException e) {
            throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e);
        }
    }

    public static /* synthetic */ Object readOptional$default(JSONObject jSONObject, String str, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 2) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readOptional(jSONObject, str, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static final <T> T readOptional(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        T t = (T) JsonParserInternalsKt.optSafe(jSONObject, str);
        if (t == null) {
            return null;
        }
        if (valueValidator.isValid(t)) {
            return t;
        }
        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, t));
        return null;
    }

    public static /* synthetic */ Object readOptional$default(JSONObject jSONObject, String str, Function1 function1, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 4) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readOptional(jSONObject, str, function1, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <R, T> T readOptional(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Function1 function1, @NotNull ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        Object obj;
        Object optSafe = JsonParserInternalsKt.optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        try {
            obj = function1.invoke(optSafe);
        } catch (Exception unused) {
            obj = null;
        }
        if (obj == null) {
            parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
            return null;
        }
        if (valueValidator.isValid(obj)) {
            return (T) obj;
        }
        parsingErrorLogger.logError(ParsingExceptionKt.invalidValue(jSONObject, str, obj));
        return null;
    }

    @Nullable
    public static final <T extends JSONSerializable> T readOptional(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Function2 function2, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return (T) JsonParserInternalsKt.tryCreate(function2, parsingEnvironment, optJSONObject, parsingErrorLogger);
    }

    public static /* synthetic */ List readList$default(JSONObject jSONObject, String str, ListValidator listValidator, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 2) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        ListValidator listValidator2 = listValidator;
        if ((i & 4) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readList(jSONObject, str, listValidator2, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NotNull
    public static final <T> List<T> readList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull final ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe == null) {
                    optSafe = null;
                }
                if (optSafe == null) {
                    return null;
                }
                T t = valueValidator.isValid(optSafe) ? optSafe : 0;
                ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                String str2 = str;
                if (t == 0) {
                    parsingErrorLogger2.logError(ParsingExceptionKt.invalidValue(jSONArray, str2, i, optSafe));
                }
                return t;
            }
        });
    }

    public static /* synthetic */ List readList$default(JSONObject jSONObject, String str, Function1 function1, ListValidator listValidator, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 4) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        ListValidator listValidator2 = listValidator;
        if ((i & 8) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readList(jSONObject, str, function1, listValidator2, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @NotNull
    public static final <R, T> List<T> readList(@NotNull final JSONObject jSONObject, @NotNull final String str, @NotNull final Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull final ParsingErrorLogger parsingErrorLogger, @NotNull ParsingEnvironment parsingEnvironment) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object obj;
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe == null) {
                    optSafe = null;
                }
                if (optSafe == null) {
                    return null;
                }
                try {
                    obj = Function1.this.invoke(optSafe);
                } catch (Exception unused) {
                    obj = null;
                }
                ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                JSONObject jSONObject2 = jSONObject;
                String str2 = str;
                if (obj == null) {
                    parsingErrorLogger2.logError(ParsingExceptionKt.invalidValue(jSONObject2, str2, optSafe));
                }
                if (obj == null) {
                    return null;
                }
                T t = valueValidator.isValid(obj) ? obj : 0;
                ParsingErrorLogger parsingErrorLogger3 = parsingErrorLogger;
                String str3 = str;
                if (t == 0) {
                    parsingErrorLogger3.logError(ParsingExceptionKt.invalidValue(jSONArray, str3, i, obj));
                }
                return t;
            }
        });
    }

    @NotNull
    public static final <T extends JSONSerializable> List<T> readSerializableList(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull final Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull final ParsingErrorLogger parsingErrorLogger, @NotNull final ParsingEnvironment parsingEnvironment) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Incorrect return type in method signature: (Lorg/json/JSONArray;I)TT; */
            @Nullable
            public final JSONSerializable invoke(@NotNull JSONArray jSONArray, int i) {
                JSONSerializable tryCreate;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || (tryCreate = JsonParserInternalsKt.tryCreate(Function2.this, parsingEnvironment, optJSONObject, parsingErrorLogger)) == null) {
                    return null;
                }
                return tryCreate;
            }
        });
    }

    public static /* synthetic */ List readStrictList$default(JSONObject jSONObject, String str, ListValidator listValidator, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        if ((i & 4) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readStrictList(jSONObject, str, listValidator, valueValidator, parsingErrorLogger);
    }

    @NotNull
    public static final <T> List<T> readStrictList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readStrictList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe == null) {
                    throw ParsingExceptionKt.missingValue(jSONArray, str, i);
                }
                T t = valueValidator.isValid(optSafe) ? optSafe : 0;
                if (t != 0) {
                    return t;
                }
                throw ParsingExceptionKt.invalidValue(jSONArray, str, i, optSafe);
            }
        });
    }

    public static /* synthetic */ List readStrictList$default(JSONObject jSONObject, String str, Function1 function1, ListValidator listValidator, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, int i, Object obj) {
        if ((i & 4) != 0) {
            listValidator = JsonParser.alwaysValidList();
        }
        ListValidator listValidator2 = listValidator;
        if ((i & 8) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readStrictList(jSONObject, str, function1, listValidator2, valueValidator, parsingErrorLogger);
    }

    @NotNull
    public static final <R, T> List<T> readStrictList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull final Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readStrictList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object obj;
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe != null) {
                    try {
                        obj = function1.invoke(optSafe);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    if (obj == null) {
                        throw ParsingExceptionKt.invalidValue(jSONArray, str, i, optSafe);
                    }
                    T t = valueValidator.isValid(obj) ? obj : 0;
                    if (t != 0) {
                        return t;
                    }
                    throw ParsingExceptionKt.invalidValue(jSONArray, str, i, obj);
                }
                throw ParsingExceptionKt.missingValue(jSONArray, str, i);
            }
        });
    }

    @NotNull
    public static final <T extends JSONSerializable> List<T> readStrictSerializableList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull final Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull final ParsingEnvironment parsingEnvironment) {
        return JsonParserInternalsKt.getList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readStrictList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Incorrect return type in method signature: (Lorg/json/JSONArray;I)TT; */
            @Nullable
            public final JSONSerializable invoke(@NotNull JSONArray jSONArray, int i) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    throw ParsingExceptionKt.missingValue(jSONArray, str, i);
                }
                try {
                    return (JSONSerializable) function2.invoke(parsingEnvironment, optJSONObject);
                } catch (ParsingException e) {
                    throw ParsingExceptionKt.dependencyFailed(jSONArray, str, i, e);
                }
            }
        });
    }

    @Nullable
    public static final <T> List<T> readOptionalList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull final ParsingErrorLogger parsingErrorLogger) {
        return JsonParserInternalsKt.optList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readOptionalList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe == null) {
                    optSafe = null;
                }
                if (optSafe == null) {
                    return null;
                }
                T t = valueValidator.isValid(optSafe) ? optSafe : 0;
                ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                String str2 = str;
                if (t == 0) {
                    parsingErrorLogger2.logError(ParsingExceptionKt.invalidValue(jSONArray, str2, i, optSafe));
                }
                return t;
            }
        });
    }

    @Nullable
    public static final <R, T> List<T> readOptionalList(@NotNull final JSONObject jSONObject, @NotNull final String str, @NotNull final Function1 function1, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull final ParsingErrorLogger parsingErrorLogger) {
        return JsonParserInternalsKt.optList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readOptionalList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final T invoke(@NotNull JSONArray jSONArray, int i) {
                Object obj;
                Object optSafe = JsonParserInternalsKt.optSafe(jSONArray, i);
                if (optSafe == null) {
                    optSafe = null;
                }
                if (optSafe == null) {
                    return null;
                }
                try {
                    obj = Function1.this.invoke(optSafe);
                } catch (Exception unused) {
                    obj = null;
                }
                ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                JSONObject jSONObject2 = jSONObject;
                String str2 = str;
                if (obj == null) {
                    parsingErrorLogger2.logError(ParsingExceptionKt.invalidValue(jSONObject2, str2, optSafe));
                }
                if (obj == null) {
                    return null;
                }
                T t = valueValidator.isValid(obj) ? obj : 0;
                ParsingErrorLogger parsingErrorLogger3 = parsingErrorLogger;
                String str3 = str;
                if (t == 0) {
                    parsingErrorLogger3.logError(ParsingExceptionKt.invalidValue(jSONArray, str3, i, obj));
                }
                return t;
            }
        });
    }

    public static /* synthetic */ List readOptionalSerializableList$default(JSONObject jSONObject, String str, Function2 function2, ListValidator listValidator, ValueValidator valueValidator, ParsingErrorLogger parsingErrorLogger, ParsingEnvironment parsingEnvironment, int i, Object obj) {
        if ((i & 8) != 0) {
            valueValidator = JsonParser.alwaysValid();
        }
        return readOptionalSerializableList(jSONObject, str, function2, listValidator, valueValidator, parsingErrorLogger, parsingEnvironment);
    }

    @Nullable
    public static final <T extends JSONSerializable> List<T> readOptionalSerializableList(@NotNull JSONObject jSONObject, @NotNull final String str, @NotNull final Function2 function2, @NotNull ListValidator<T> listValidator, @NotNull final ValueValidator<T> valueValidator, @NotNull final ParsingErrorLogger parsingErrorLogger, @NotNull final ParsingEnvironment parsingEnvironment) {
        return JsonParserInternalsKt.optList(jSONObject, str, listValidator, parsingErrorLogger, new Function2() { // from class: com.yandex.div.internal.parser.JsonParserKt$readOptionalList$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((JSONArray) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Incorrect return type in method signature: (Lorg/json/JSONArray;I)TT; */
            @Nullable
            public final JSONSerializable invoke(@NotNull JSONArray jSONArray, int i) {
                JSONSerializable tryCreate;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || (tryCreate = JsonParserInternalsKt.tryCreate(Function2.this, parsingEnvironment, optJSONObject, parsingErrorLogger)) == null) {
                    return null;
                }
                JSONSerializable jSONSerializable = valueValidator.isValid(tryCreate) ? tryCreate : null;
                ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                String str2 = str;
                if (jSONSerializable == null) {
                    parsingErrorLogger2.logError(ParsingExceptionKt.invalidValue(jSONArray, str2, i, tryCreate));
                }
                return jSONSerializable;
            }
        });
    }

    public static /* synthetic */ void write$default(JSONObject jSONObject, String str, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.internal.parser.JsonParserKt$write$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Object invoke(@NotNull Object obj3) {
                    return obj3;
                }
            };
        }
        write(jSONObject, str, obj, function1);
    }

    public static final <T> void write(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable T t, @NotNull Function1 function1) {
        if (t != null) {
            jSONObject.put(str, function1.invoke(t));
        }
    }

    public static final /* synthetic */ <T extends JSONSerializable> void write(JSONObject jSONObject, String str, T t) {
        if (t != null) {
            jSONObject.put(str, t.writeToJSON());
        }
    }

    public static final <T> void writeExpression(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Expression<T> expression) {
        writeExpression(jSONObject, str, expression, new Function1() { // from class: com.yandex.div.internal.parser.JsonParserKt$writeExpression$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull T t) {
                return t;
            }
        });
    }

    public static final <T, R> void writeExpression(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Expression<T> expression, @NotNull Function1 function1) {
        if (expression == null) {
            return;
        }
        Object rawValue = expression.getRawValue();
        if (!Expression.INSTANCE.mayBeExpression(rawValue)) {
            Intrinsics.checkNotNull(rawValue, "null cannot be cast to non-null type T of com.yandex.div.internal.parser.JsonParserKt.writeExpression");
            jSONObject.put(str, function1.invoke(rawValue));
        } else {
            jSONObject.put(str, rawValue);
        }
    }

    public static final <T> void writeExpressionList(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable ExpressionList<T> expressionList) {
        writeExpressionList(jSONObject, str, expressionList, new Function1() { // from class: com.yandex.div.internal.parser.JsonParserKt$writeExpressionList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final T invoke(@NotNull T t) {
                return t;
            }
        });
    }

    public static final <T, R> void writeExpressionList(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable ExpressionList<T> expressionList, @NotNull Function1 function1) {
        Object rawValue;
        if (expressionList == null) {
            return;
        }
        if (expressionList instanceof MutableExpressionList) {
            List<Expression<T>> expressionsInternal = ((MutableExpressionList) expressionList).getExpressionsInternal();
            if (expressionsInternal.isEmpty()) {
                return;
            }
            List<Expression<T>> list = expressionsInternal;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Expression expression = (Expression) it.next();
                if (expression instanceof Expression.ConstantExpression) {
                    rawValue = function1.invoke(expression.evaluate(ExpressionResolver.EMPTY));
                } else {
                    rawValue = expression.getRawValue();
                }
                arrayList.add(rawValue);
            }
            jSONObject.put(str, new JSONArray((Collection) arrayList));
            return;
        }
        if (expressionList instanceof ConstantExpressionList) {
            List<T> evaluate = ((ConstantExpressionList) expressionList).evaluate(ExpressionResolver.EMPTY);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(evaluate, 10));
            Iterator<T> it2 = evaluate.iterator();
            while (it2.hasNext()) {
                arrayList2.add(function1.invoke(it2.next()));
            }
            jSONObject.put(str, new JSONArray((Collection) arrayList2));
        }
    }
}
