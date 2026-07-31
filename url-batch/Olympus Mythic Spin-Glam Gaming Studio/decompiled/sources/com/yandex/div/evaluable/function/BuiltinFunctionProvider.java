package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.FunctionProvider;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltinFunctionProvider.kt */
@Deprecated
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u001e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016J\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016R&\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/evaluable/function/BuiltinFunctionProvider;", "Lcom/yandex/div/evaluable/FunctionProvider;", "()V", "exposedFunctions", "", "", "", "Lcom/yandex/div/evaluable/Function;", "getExposedFunctions$div_evaluable", "()Ljava/util/Map;", "exposedMethods", "getExposedMethods$div_evaluable", "registry", "Lcom/yandex/div/evaluable/function/FunctionRegistry;", "ensureFunctionRegistered", "", "name", "args", "", "Lcom/yandex/div/evaluable/FunctionArgument;", "resultType", "Lcom/yandex/div/evaluable/EvaluableType;", "isMethod", "", "ensureFunctionRegistered$div_evaluable", "get", "getMethod", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuiltinFunctionProvider implements FunctionProvider {

    @NotNull
    public static final BuiltinFunctionProvider INSTANCE = new BuiltinFunctionProvider();

    @NotNull
    private static final FunctionRegistry registry;

    private BuiltinFunctionProvider() {
    }

    static {
        FunctionRegistry functionRegistry = new FunctionRegistry();
        registry = functionRegistry;
        functionRegistry.register(IntegerSum.INSTANCE);
        functionRegistry.register(DoubleSum.INSTANCE);
        functionRegistry.register(IntegerSub.INSTANCE);
        functionRegistry.register(DoubleSub.INSTANCE);
        functionRegistry.register(IntegerMul.INSTANCE);
        functionRegistry.register(DoubleMul.INSTANCE);
        functionRegistry.register(IntegerDiv.INSTANCE);
        functionRegistry.register(DoubleDiv.INSTANCE);
        functionRegistry.register(IntegerMod.INSTANCE);
        functionRegistry.register(DoubleMod.INSTANCE);
        functionRegistry.register(IntegerMaxValue.INSTANCE);
        functionRegistry.register(IntegerMinValue.INSTANCE);
        functionRegistry.register(DoubleMaxValue.INSTANCE);
        functionRegistry.register(DoubleMinValue.INSTANCE);
        functionRegistry.register(IntegerMax.INSTANCE);
        functionRegistry.register(DoubleMax.INSTANCE);
        functionRegistry.register(IntegerMin.INSTANCE);
        functionRegistry.register(DoubleMin.INSTANCE);
        functionRegistry.register(IntegerAbs.INSTANCE);
        functionRegistry.register(DoubleAbs.INSTANCE);
        functionRegistry.register(IntegerSignum.INSTANCE);
        functionRegistry.register(DoubleSignum.INSTANCE);
        functionRegistry.register(IntegerCopySign.INSTANCE);
        functionRegistry.register(DoubleCopySign.INSTANCE);
        functionRegistry.register(DoubleCeil.INSTANCE);
        functionRegistry.register(DoubleFloor.INSTANCE);
        functionRegistry.register(DoubleRound.INSTANCE);
        functionRegistry.register(Pi.INSTANCE);
        functionRegistry.register(DegreesToRadians.INSTANCE);
        functionRegistry.register(RadiansToDegrees.INSTANCE);
        functionRegistry.register(Sine.INSTANCE);
        functionRegistry.register(Cos.INSTANCE);
        functionRegistry.register(Tan.INSTANCE);
        functionRegistry.register(Asin.INSTANCE);
        functionRegistry.register(Acos.INSTANCE);
        functionRegistry.register(Atan.INSTANCE);
        functionRegistry.register(Atan2.INSTANCE);
        functionRegistry.register(Cot.INSTANCE);
        functionRegistry.register(ColorAlphaComponentGetter.INSTANCE);
        functionRegistry.register(ColorStringAlphaComponentGetter.INSTANCE);
        functionRegistry.register(ColorRedComponentGetter.INSTANCE);
        functionRegistry.register(ColorStringRedComponentGetter.INSTANCE);
        functionRegistry.register(ColorGreenComponentGetter.INSTANCE);
        functionRegistry.register(ColorStringGreenComponentGetter.INSTANCE);
        functionRegistry.register(ColorBlueComponentGetter.INSTANCE);
        functionRegistry.register(ColorStringBlueComponentGetter.INSTANCE);
        functionRegistry.register(ColorAlphaComponentSetter.INSTANCE);
        functionRegistry.register(ColorStringAlphaComponentSetter.INSTANCE);
        functionRegistry.register(ColorRedComponentSetter.INSTANCE);
        functionRegistry.register(ColorStringRedComponentSetter.INSTANCE);
        functionRegistry.register(ColorGreenComponentSetter.INSTANCE);
        functionRegistry.register(ColorStringGreenComponentSetter.INSTANCE);
        functionRegistry.register(ColorBlueComponentSetter.INSTANCE);
        functionRegistry.register(ColorStringBlueComponentSetter.INSTANCE);
        functionRegistry.register(ColorArgb.INSTANCE);
        functionRegistry.register(ColorRgb.INSTANCE);
        functionRegistry.register(ParseUnixTime.INSTANCE);
        functionRegistry.register(ParseUnixTimeAsLocal.INSTANCE);
        functionRegistry.register(NowLocal.INSTANCE);
        functionRegistry.register(AddMillis.INSTANCE);
        functionRegistry.register(SetYear.INSTANCE);
        functionRegistry.register(SetMonth.INSTANCE);
        functionRegistry.register(SetDay.INSTANCE);
        functionRegistry.register(SetHours.INSTANCE);
        functionRegistry.register(SetMinutes.INSTANCE);
        functionRegistry.register(SetSeconds.INSTANCE);
        functionRegistry.register(SetMillis.INSTANCE);
        functionRegistry.register(GetYear.INSTANCE);
        functionRegistry.register(GetMonth.INSTANCE);
        functionRegistry.register(GetDay.INSTANCE);
        functionRegistry.register(GetDayOfWeek.INSTANCE);
        functionRegistry.register(GetHours.INSTANCE);
        functionRegistry.register(GetMinutes.INSTANCE);
        functionRegistry.register(GetSeconds.INSTANCE);
        functionRegistry.register(GetMillis.INSTANCE);
        functionRegistry.register(FormatDateAsLocal.INSTANCE);
        functionRegistry.register(FormatDateAsUTC.INSTANCE);
        functionRegistry.register(FormatDateAsLocalWithLocale.INSTANCE);
        functionRegistry.register(FormatDateAsUTCWithLocale.INSTANCE);
        functionRegistry.register(GetIntervalTotalWeeks.INSTANCE);
        functionRegistry.register(GetIntervalTotalDays.INSTANCE);
        functionRegistry.register(GetIntervalTotalHours.INSTANCE);
        functionRegistry.register(GetIntervalHours.INSTANCE);
        functionRegistry.register(GetIntervalTotalMinutes.INSTANCE);
        functionRegistry.register(GetIntervalMinutes.INSTANCE);
        functionRegistry.register(GetIntervalTotalSeconds.INSTANCE);
        functionRegistry.register(GetIntervalSeconds.INSTANCE);
        functionRegistry.register(EncodeRegex.INSTANCE);
        functionRegistry.register(StringLength.INSTANCE);
        functionRegistry.register(StringContains.INSTANCE);
        functionRegistry.register(StringSubstring.INSTANCE);
        functionRegistry.register(StringReplaceAll.INSTANCE);
        functionRegistry.register(StringIndex.INSTANCE);
        functionRegistry.register(StringLastIndex.INSTANCE);
        functionRegistry.register(StringEncodeUri.INSTANCE);
        functionRegistry.register(StringDecodeUri.INSTANCE);
        functionRegistry.register(TestRegex.INSTANCE);
        functionRegistry.register(ToLowerCase.INSTANCE);
        functionRegistry.register(ToUpperCase.INSTANCE);
        functionRegistry.register(Trim.INSTANCE);
        functionRegistry.register(TrimLeft.INSTANCE);
        functionRegistry.register(TrimRight.INSTANCE);
        functionRegistry.register(PadStartString.INSTANCE);
        functionRegistry.register(PadStartInteger.INSTANCE);
        functionRegistry.register(PadEndString.INSTANCE);
        functionRegistry.register(PadEndInteger.INSTANCE);
        IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
        functionRegistry.register(integerDecimalFormat);
        LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
        functionRegistry.register(localizedIntegerDecimalFormat);
        NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
        functionRegistry.register(numberDecimalFormat);
        LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
        functionRegistry.register(localizedNumberDecimalFormat);
        functionRegistry.registerMethod(integerDecimalFormat);
        functionRegistry.registerMethod(localizedIntegerDecimalFormat);
        functionRegistry.registerMethod(numberDecimalFormat);
        functionRegistry.registerMethod(localizedNumberDecimalFormat);
        functionRegistry.register(NumberToInteger.INSTANCE);
        functionRegistry.register(BooleanToInteger.INSTANCE);
        functionRegistry.register(StringToInteger.INSTANCE);
        functionRegistry.register(IntegerToNumber.INSTANCE);
        functionRegistry.register(StringToNumber.INSTANCE);
        functionRegistry.register(IntegerToBoolean.INSTANCE);
        functionRegistry.register(StringToBoolean.INSTANCE);
        IntegerToString integerToString = IntegerToString.INSTANCE;
        functionRegistry.register(integerToString);
        NumberToString numberToString = NumberToString.INSTANCE;
        functionRegistry.register(numberToString);
        BooleanToString booleanToString = BooleanToString.INSTANCE;
        functionRegistry.register(booleanToString);
        ColorToString colorToString = ColorToString.INSTANCE;
        functionRegistry.register(colorToString);
        UrlToString urlToString = UrlToString.INSTANCE;
        functionRegistry.register(urlToString);
        StringToString stringToString = StringToString.INSTANCE;
        functionRegistry.register(stringToString);
        functionRegistry.register(StringToColor.INSTANCE);
        functionRegistry.register(StringToUrl.INSTANCE);
        DictToString dictToString = DictToString.INSTANCE;
        functionRegistry.register(dictToString);
        ArrayToString arrayToString = ArrayToString.INSTANCE;
        functionRegistry.register(arrayToString);
        functionRegistry.registerMethod(integerToString);
        functionRegistry.registerMethod(numberToString);
        functionRegistry.registerMethod(booleanToString);
        functionRegistry.registerMethod(colorToString);
        functionRegistry.registerMethod(urlToString);
        functionRegistry.registerMethod(stringToString);
        functionRegistry.registerMethod(dictToString);
        functionRegistry.registerMethod(arrayToString);
        functionRegistry.register(GetIntegerValue.INSTANCE);
        functionRegistry.register(GetNumberValue.INSTANCE);
        functionRegistry.register(GetStringValue.INSTANCE);
        functionRegistry.register(GetColorValueString.INSTANCE);
        functionRegistry.register(GetColorValue.INSTANCE);
        functionRegistry.register(GetUrlValueWithStringFallback.INSTANCE);
        functionRegistry.register(GetUrlValueWithUrlFallback.INSTANCE);
        functionRegistry.register(GetBooleanValue.INSTANCE);
        functionRegistry.register(GetStoredIntegerValue.INSTANCE);
        functionRegistry.register(GetStoredNumberValue.INSTANCE);
        functionRegistry.register(GetStoredStringValue.INSTANCE);
        functionRegistry.register(GetStoredColorValueString.INSTANCE);
        functionRegistry.register(GetStoredColorValue.INSTANCE);
        functionRegistry.register(GetStoredBooleanValue.INSTANCE);
        functionRegistry.register(GetStoredUrlValueWithStringFallback.INSTANCE);
        functionRegistry.register(GetStoredUrlValueWithUrlFallback.INSTANCE);
        functionRegistry.register(GetStoredArrayValue.INSTANCE);
        functionRegistry.register(GetStoredDictValue.INSTANCE);
        functionRegistry.register(GetDictInteger.INSTANCE);
        functionRegistry.register(GetDictNumber.INSTANCE);
        functionRegistry.register(GetDictString.INSTANCE);
        functionRegistry.register(GetDictColor.INSTANCE);
        functionRegistry.register(GetDictUrl.INSTANCE);
        functionRegistry.register(GetDictBoolean.INSTANCE);
        functionRegistry.register(GetArrayFromDict.INSTANCE);
        functionRegistry.register(GetDictFromDict.INSTANCE);
        functionRegistry.register(GetDictOptInteger.INSTANCE);
        functionRegistry.register(GetDictOptNumber.INSTANCE);
        functionRegistry.register(GetDictOptString.INSTANCE);
        functionRegistry.register(GetDictOptColorWithColorFallback.INSTANCE);
        functionRegistry.register(GetDictOptColorWithStringFallback.INSTANCE);
        functionRegistry.register(GetDictOptUrlWithStringFallback.INSTANCE);
        functionRegistry.register(GetDictOptUrlWithUrlFallback.INSTANCE);
        functionRegistry.register(GetDictOptBoolean.INSTANCE);
        functionRegistry.register(GetOptArrayFromDict.INSTANCE);
        functionRegistry.register(GetOptDictFromDict.INSTANCE);
        functionRegistry.register(GetIntegerFromDict.INSTANCE);
        functionRegistry.register(GetNumberFromDict.INSTANCE);
        functionRegistry.register(GetStringFromDict.INSTANCE);
        functionRegistry.register(GetColorFromDict.INSTANCE);
        functionRegistry.register(GetUrlFromDict.INSTANCE);
        functionRegistry.register(GetBooleanFromDict.INSTANCE);
        functionRegistry.register(GetOptIntegerFromDict.INSTANCE);
        functionRegistry.register(GetOptNumberFromDict.INSTANCE);
        functionRegistry.register(GetOptStringFromDict.INSTANCE);
        functionRegistry.register(GetOptColorFromDictWithColorFallback.INSTANCE);
        functionRegistry.register(GetOptColorFromDictWithStringFallback.INSTANCE);
        functionRegistry.register(GetOptUrlFromDictWithStringFallback.INSTANCE);
        functionRegistry.register(GetOptUrlFromDictWithUrlFallback.INSTANCE);
        functionRegistry.register(GetOptBooleanFromDict.INSTANCE);
        functionRegistry.registerMethod(DictContainsKey.INSTANCE);
        functionRegistry.registerMethod(GetArray.INSTANCE);
        functionRegistry.registerMethod(GetBoolean.INSTANCE);
        functionRegistry.registerMethod(GetColor.INSTANCE);
        functionRegistry.registerMethod(GetDict.INSTANCE);
        functionRegistry.registerMethod(GetInteger.INSTANCE);
        functionRegistry.registerMethod(GetNumber.INSTANCE);
        functionRegistry.registerMethod(GetString.INSTANCE);
        functionRegistry.registerMethod(GetUrl.INSTANCE);
        functionRegistry.registerMethod(DictIsEmpty.INSTANCE);
        functionRegistry.register(GetDictLength.INSTANCE);
        functionRegistry.register(GetDictKeys.INSTANCE);
        functionRegistry.registerMethod(GetKeys.INSTANCE);
        functionRegistry.register(GetDictValues.INSTANCE);
        functionRegistry.registerMethod(GetValues.INSTANCE);
        functionRegistry.register(GetArrayInteger.INSTANCE);
        functionRegistry.register(GetArrayNumber.INSTANCE);
        functionRegistry.register(GetArrayString.INSTANCE);
        functionRegistry.register(GetArrayColor.INSTANCE);
        functionRegistry.register(GetArrayUrl.INSTANCE);
        functionRegistry.register(GetArrayBoolean.INSTANCE);
        functionRegistry.register(GetArrayOptInteger.INSTANCE);
        functionRegistry.register(GetArrayOptNumber.INSTANCE);
        functionRegistry.register(GetArrayOptString.INSTANCE);
        functionRegistry.register(GetArrayOptColorWithColorFallback.INSTANCE);
        functionRegistry.register(GetArrayOptColorWithStringFallback.INSTANCE);
        functionRegistry.register(GetArrayOptUrlWithUrlFallback.INSTANCE);
        functionRegistry.register(GetArrayOptUrlWithStringFallback.INSTANCE);
        functionRegistry.register(GetArrayOptBoolean.INSTANCE);
        functionRegistry.register(GetIntegerFromArray.INSTANCE);
        functionRegistry.register(GetNumberFromArray.INSTANCE);
        functionRegistry.register(GetStringFromArray.INSTANCE);
        functionRegistry.register(GetColorFromArray.INSTANCE);
        functionRegistry.register(GetUrlFromArray.INSTANCE);
        functionRegistry.register(GetBooleanFromArray.INSTANCE);
        functionRegistry.register(GetArrayFromArray.INSTANCE);
        functionRegistry.register(GetDictFromArray.INSTANCE);
        functionRegistry.register(GetOptIntegerFromArray.INSTANCE);
        functionRegistry.register(GetOptNumberFromArray.INSTANCE);
        functionRegistry.register(GetOptStringFromArray.INSTANCE);
        functionRegistry.register(GetOptColorFromArrayWithColorFallback.INSTANCE);
        functionRegistry.register(GetOptColorFromArrayWithStringFallback.INSTANCE);
        functionRegistry.register(GetOptUrlFromArrayWithUrlFallback.INSTANCE);
        functionRegistry.register(GetOptUrlFromArrayWithStringFallback.INSTANCE);
        functionRegistry.register(GetOptBooleanFromArray.INSTANCE);
        functionRegistry.register(GetOptArrayFromArray.INSTANCE);
        functionRegistry.register(GetOptDictFromArray.INSTANCE);
        functionRegistry.register(GetArrayLength.INSTANCE);
        functionRegistry.registerMethod(ArrayGetArray.INSTANCE);
        functionRegistry.registerMethod(ArrayGetBoolean.INSTANCE);
        functionRegistry.registerMethod(ArrayGetColor.INSTANCE);
        functionRegistry.registerMethod(ArrayGetDict.INSTANCE);
        functionRegistry.registerMethod(ArrayGetInteger.INSTANCE);
        functionRegistry.registerMethod(ArrayGetNumber.INSTANCE);
        functionRegistry.registerMethod(ArrayGetString.INSTANCE);
        functionRegistry.registerMethod(ArrayGetUrl.INSTANCE);
        functionRegistry.registerMethod(ArrayIsEmpty.INSTANCE);
    }

    @NotNull
    public final Map<String, List<Function>> getExposedFunctions$div_evaluable() {
        return registry.getExposedFunctions();
    }

    @NotNull
    public final Map<String, List<Function>> getExposedMethods$div_evaluable() {
        return registry.getExposedMethods();
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return registry.get(name, args);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return registry.getMethod(name, args);
    }

    public final void ensureFunctionRegistered$div_evaluable(@NotNull String name, @NotNull List<FunctionArgument> args, @NotNull EvaluableType resultType, boolean isMethod) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        registry.ensureRegistered(name, args, resultType, isMethod);
    }
}
