package com.yandex.div.core.expression.variables;

import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivVariablesParser.kt */
@PublicApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/expression/variables/DivVariablesParser;", "", "()V", "parse", "", "Lcom/yandex/div/data/Variable;", "variablesArray", "Lorg/json/JSONArray;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivVariablesParser {

    @NotNull
    public static final DivVariablesParser INSTANCE = new DivVariablesParser();

    private DivVariablesParser() {
    }

    @NotNull
    public final List<Variable> parse(@NotNull JSONArray variablesArray, @NotNull ParsingErrorLogger logger) throws ParsingException {
        return parse(variablesArray, ExpressionResolver.EMPTY, logger);
    }

    @NotNull
    public final List<Variable> parse(@NotNull JSONArray variablesArray, @NotNull ExpressionResolver resolver, @NotNull ParsingErrorLogger logger) throws ParsingException {
        DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(logger, null, 2, null);
        DivVariablesParser$parse$listValidator$1 divVariablesParser$parse$listValidator$1 = new Function1() { // from class: com.yandex.div.core.expression.variables.DivVariablesParser$parse$listValidator$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull List<? extends DivVariable> list) {
                return Boolean.TRUE;
            }
        };
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("variables", variablesArray);
        List readList = JsonParser.readList(jSONObject, "variables", DivVariable.Companion.getCREATOR(), new DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0(divVariablesParser$parse$listValidator$1), logger, divParsingEnvironment);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(readList, 10));
        Iterator it = readList.iterator();
        while (it.hasNext()) {
            arrayList.add(DivVariablesParserKt.toVariable((DivVariable) it.next(), resolver));
        }
        return arrayList;
    }
}
