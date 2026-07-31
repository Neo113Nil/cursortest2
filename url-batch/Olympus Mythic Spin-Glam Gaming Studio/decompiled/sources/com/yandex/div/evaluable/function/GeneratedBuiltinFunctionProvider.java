package com.yandex.div.evaluable.function;

import com.facebook.AuthenticationTokenClaims;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GeneratedBuiltinFunctionProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/evaluable/function/GeneratedBuiltinFunctionProvider;", "Lcom/yandex/div/evaluable/FunctionProvider;", "()V", "get", "Lcom/yandex/div/evaluable/Function;", "name", "", "args", "", "Lcom/yandex/div/evaluable/EvaluableType;", "getMethod", "warmUp", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GeneratedBuiltinFunctionProvider implements FunctionProvider {

    @NotNull
    public static final GeneratedBuiltinFunctionProvider INSTANCE = new GeneratedBuiltinFunctionProvider();

    private GeneratedBuiltinFunctionProvider() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        switch (name.hashCode()) {
            case -2129095909:
                if (name.equals("getArrayInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayInteger.INSTANCE, args);
                }
                break;
            case -2096254100:
                if (name.equals("getArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromArray.INSTANCE, args);
                }
                break;
            case -2015731347:
                if (name.equals("formatDateAsUTCWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTCWithLocale.INSTANCE, args);
                }
                break;
            case -1930505522:
                if (name.equals("getOptIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromArray.INSTANCE, args);
                }
                break;
            case -1919300188:
                if (name.equals("toNumber")) {
                    IntegerToNumber integerToNumber = IntegerToNumber.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable = integerToNumber.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable, ok)) {
                        return integerToNumber;
                    }
                    StringToNumber stringToNumber = StringToNumber.INSTANCE;
                    if (Intrinsics.areEqual(stringToNumber.matchesArguments$div_evaluable(args), ok)) {
                        return stringToNumber;
                    }
                    if (Intrinsics.areEqual(integerToNumber.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return integerToNumber;
                    }
                    if (Intrinsics.areEqual(stringToNumber.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return stringToNumber;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -1857218874:
                if (name.equals("getIntervalTotalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalHours.INSTANCE, args);
                }
                break;
            case -1843679562:
                if (name.equals("getIntervalTotalWeeks")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalWeeks.INSTANCE, args);
                }
                break;
            case -1776922004:
                if (name.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable2 = arrayToString.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable2, ok2)) {
                        return arrayToString;
                    }
                    BooleanToString booleanToString = BooleanToString.INSTANCE;
                    if (Intrinsics.areEqual(booleanToString.matchesArguments$div_evaluable(args), ok2)) {
                        return booleanToString;
                    }
                    ColorToString colorToString = ColorToString.INSTANCE;
                    if (Intrinsics.areEqual(colorToString.matchesArguments$div_evaluable(args), ok2)) {
                        return colorToString;
                    }
                    DictToString dictToString = DictToString.INSTANCE;
                    if (Intrinsics.areEqual(dictToString.matchesArguments$div_evaluable(args), ok2)) {
                        return dictToString;
                    }
                    IntegerToString integerToString = IntegerToString.INSTANCE;
                    if (Intrinsics.areEqual(integerToString.matchesArguments$div_evaluable(args), ok2)) {
                        return integerToString;
                    }
                    NumberToString numberToString = NumberToString.INSTANCE;
                    if (Intrinsics.areEqual(numberToString.matchesArguments$div_evaluable(args), ok2)) {
                        return numberToString;
                    }
                    StringToString stringToString = StringToString.INSTANCE;
                    if (Intrinsics.areEqual(stringToString.matchesArguments$div_evaluable(args), ok2)) {
                        return stringToString;
                    }
                    UrlToString urlToString = UrlToString.INSTANCE;
                    if (Intrinsics.areEqual(urlToString.matchesArguments$div_evaluable(args), ok2)) {
                        return urlToString;
                    }
                    if (Intrinsics.areEqual(arrayToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return arrayToString;
                    }
                    if (Intrinsics.areEqual(booleanToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return booleanToString;
                    }
                    if (Intrinsics.areEqual(colorToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return colorToString;
                    }
                    if (Intrinsics.areEqual(dictToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return dictToString;
                    }
                    if (Intrinsics.areEqual(integerToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return integerToString;
                    }
                    if (Intrinsics.areEqual(numberToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return numberToString;
                    }
                    if (Intrinsics.areEqual(stringToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return stringToString;
                    }
                    if (Intrinsics.areEqual(urlToString.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return urlToString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -1730341801:
                if (name.equals("getDictOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptInteger.INSTANCE, args);
                }
                break;
            case -1603949422:
                if (name.equals("getBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromDict.INSTANCE, args);
                }
                break;
            case -1601021533:
                if (name.equals("getDictUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictUrl.INSTANCE, args);
                }
                break;
            case -1598503635:
                if (name.equals("toBoolean")) {
                    IntegerToBoolean integerToBoolean = IntegerToBoolean.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable3 = integerToBoolean.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable3, ok3)) {
                        return integerToBoolean;
                    }
                    StringToBoolean stringToBoolean = StringToBoolean.INSTANCE;
                    if (Intrinsics.areEqual(stringToBoolean.matchesArguments$div_evaluable(args), ok3)) {
                        return stringToBoolean;
                    }
                    if (Intrinsics.areEqual(integerToBoolean.matchesArgumentsWithCast$div_evaluable(args), ok3)) {
                        return integerToBoolean;
                    }
                    if (Intrinsics.areEqual(stringToBoolean.matchesArgumentsWithCast$div_evaluable(args), ok3)) {
                        return stringToBoolean;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -1586214751:
                if (name.equals("getOptIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptIntegerFromDict.INSTANCE, args);
                }
                break;
            case -1544450268:
                if (name.equals("getOptBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromArray.INSTANCE, args);
                }
                break;
            case -1536224128:
                if (name.equals("getArrayColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayColor.INSTANCE, args);
                }
                break;
            case -1506310026:
                if (name.equals("getIntervalTotalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalSeconds.INSTANCE, args);
                }
                break;
            case -1436100668:
                if (name.equals("getIntervalSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalSeconds.INSTANCE, args);
                }
                break;
            case -1288010167:
                if (name.equals("getSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetSeconds.INSTANCE, args);
                }
                break;
            case -1249364890:
                if (name.equals("getDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDay.INSTANCE, args);
                }
                break;
            case -1233067443:
                if (name.equals("replaceAll")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringReplaceAll.INSTANCE, args);
                }
                break;
            case -1223509624:
                if (name.equals("getStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromArray.INSTANCE, args);
                }
                break;
            case -1192573227:
                if (name.equals("testRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(TestRegex.INSTANCE, args);
                }
                break;
            case -1180629592:
                if (name.equals("toColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToColor.INSTANCE, args);
                }
                break;
            case -1168421440:
                if (name.equals("getIntervalTotalDays")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalDays.INSTANCE, args);
                }
                break;
            case -1162978502:
                if (name.equals("maxInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMaxValue.INSTANCE, args);
                }
                break;
            case -1148047119:
                if (name.equals("parseUnixTimeAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTimeAsLocal.INSTANCE, args);
                }
                break;
            case -1137582698:
                if (name.equals("toLowerCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToLowerCase.INSTANCE, args);
                }
                break;
            case -1133026611:
                if (name.equals("formatDateAsUTC")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsUTC.INSTANCE, args);
                }
                break;
            case -1131397482:
                if (name.equals("getUrlFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromArray.INSTANCE, args);
                }
                break;
            case -1077888264:
                if (name.equals("getArrayOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptBoolean.INSTANCE, args);
                }
                break;
            case -1072121784:
                if (name.equals("parseUnixTime")) {
                    return FunctionValidatorKt.withArgumentsValidation(ParseUnixTime.INSTANCE, args);
                }
                break;
            case -1071222151:
                if (name.equals("getArrayOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptNumber.INSTANCE, args);
                }
                break;
            case -1013579358:
                if (name.equals("getColorFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromArray.INSTANCE, args);
                }
                break;
            case -1000110441:
                if (name.equals("getDictColor")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictColor.INSTANCE, args);
                }
                break;
            case -995871928:
                if (name.equals("padEnd")) {
                    PadEndInteger padEndInteger = PadEndInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable4 = padEndInteger.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable4, ok4)) {
                        return padEndInteger;
                    }
                    PadEndString padEndString = PadEndString.INSTANCE;
                    if (Intrinsics.areEqual(padEndString.matchesArguments$div_evaluable(args), ok4)) {
                        return padEndString;
                    }
                    if (Intrinsics.areEqual(padEndInteger.matchesArgumentsWithCast$div_evaluable(args), ok4)) {
                        return padEndInteger;
                    }
                    if (Intrinsics.areEqual(padEndString.matchesArgumentsWithCast$div_evaluable(args), ok4)) {
                        return padEndString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -962804868:
                if (name.equals("getOptArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromDict.INSTANCE, args);
                }
                break;
            case -928843967:
                if (name.equals("getArrayOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptString.INSTANCE, args);
                }
                break;
            case -905815078:
                if (name.equals("setDay")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetDay.INSTANCE, args);
                }
                break;
            case -902467307:
                if (name.equals("signum")) {
                    DoubleSignum doubleSignum = DoubleSignum.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable5 = doubleSignum.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable5, ok5)) {
                        return doubleSignum;
                    }
                    IntegerSignum integerSignum = IntegerSignum.INSTANCE;
                    if (Intrinsics.areEqual(integerSignum.matchesArguments$div_evaluable(args), ok5)) {
                        return integerSignum;
                    }
                    if (Intrinsics.areEqual(doubleSignum.matchesArgumentsWithCast$div_evaluable(args), ok5)) {
                        return doubleSignum;
                    }
                    if (Intrinsics.areEqual(integerSignum.matchesArgumentsWithCast$div_evaluable(args), ok5)) {
                        return integerSignum;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -863899827:
                if (name.equals("getColorFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetColorFromDict.INSTANCE, args);
                }
                break;
            case -823914681:
                if (name.equals("getStoredColorValue")) {
                    GetStoredColorValue getStoredColorValue = GetStoredColorValue.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable6 = getStoredColorValue.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable6, ok6)) {
                        return getStoredColorValue;
                    }
                    GetStoredColorValueString getStoredColorValueString = GetStoredColorValueString.INSTANCE;
                    if (Intrinsics.areEqual(getStoredColorValueString.matchesArguments$div_evaluable(args), ok6)) {
                        return getStoredColorValueString;
                    }
                    if (Intrinsics.areEqual(getStoredColorValue.matchesArgumentsWithCast$div_evaluable(args), ok6)) {
                        return getStoredColorValue;
                    }
                    if (Intrinsics.areEqual(getStoredColorValueString.matchesArgumentsWithCast$div_evaluable(args), ok6)) {
                        return getStoredColorValueString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -792903165:
                if (name.equals("getDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromArray.INSTANCE, args);
                }
                break;
            case -775185381:
                if (name.equals("setColorBlue")) {
                    ColorBlueComponentSetter colorBlueComponentSetter = ColorBlueComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable7 = colorBlueComponentSetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable7, ok7)) {
                        return colorBlueComponentSetter;
                    }
                    ColorStringBlueComponentSetter colorStringBlueComponentSetter = ColorStringBlueComponentSetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringBlueComponentSetter.matchesArguments$div_evaluable(args), ok7)) {
                        return colorStringBlueComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok7)) {
                        return colorBlueComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorStringBlueComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok7)) {
                        return colorStringBlueComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -757068958:
                if (name.equals("getStoredBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredBooleanValue.INSTANCE, args);
                }
                break;
            case -740156815:
                if (name.equals("getDayOfWeek")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDayOfWeek.INSTANCE, args);
                }
                break;
            case -719400499:
                if (name.equals("maxNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMaxValue.INSTANCE, args);
                }
                break;
            case -718233908:
                if (name.equals("getDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictFromDict.INSTANCE, args);
                }
                break;
            case -711609332:
                if (name.equals("getStoredIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredIntegerValue.INSTANCE, args);
                }
                break;
            case -694406281:
                if (name.equals("toRadians")) {
                    return FunctionValidatorKt.withArgumentsValidation(DegreesToRadians.INSTANCE, args);
                }
                break;
            case -637295986:
                if (name.equals("getOptStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromDict.INSTANCE, args);
                }
                break;
            case -625627966:
                if (name.equals("getStoredDictValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredDictValue.INSTANCE, args);
                }
                break;
            case -618173803:
                if (name.equals("getDictNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictNumber.INSTANCE, args);
                }
                break;
            case -593965816:
                if (name.equals("getDictOptUrl")) {
                    GetDictOptUrlWithStringFallback getDictOptUrlWithStringFallback = GetDictOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable8 = getDictOptUrlWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable8, ok8)) {
                        return getDictOptUrlWithStringFallback;
                    }
                    GetDictOptUrlWithUrlFallback getDictOptUrlWithUrlFallback = GetDictOptUrlWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getDictOptUrlWithUrlFallback.matchesArguments$div_evaluable(args), ok8)) {
                        return getDictOptUrlWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getDictOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return getDictOptUrlWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getDictOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return getDictOptUrlWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -567445985:
                if (name.equals("contains")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringContains.INSTANCE, args);
                }
                break;
            case -505987374:
                if (name.equals("copySign")) {
                    DoubleCopySign doubleCopySign = DoubleCopySign.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable9 = doubleCopySign.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable9, ok9)) {
                        return doubleCopySign;
                    }
                    IntegerCopySign integerCopySign = IntegerCopySign.INSTANCE;
                    if (Intrinsics.areEqual(integerCopySign.matchesArguments$div_evaluable(args), ok9)) {
                        return integerCopySign;
                    }
                    if (Intrinsics.areEqual(doubleCopySign.matchesArgumentsWithCast$div_evaluable(args), ok9)) {
                        return doubleCopySign;
                    }
                    if (Intrinsics.areEqual(integerCopySign.matchesArgumentsWithCast$div_evaluable(args), ok9)) {
                        return integerCopySign;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case -496262374:
                if (name.equals("trimRight")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimRight.INSTANCE, args);
                }
                break;
            case -475795619:
                if (name.equals("getDictString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictString.INSTANCE, args);
                }
                break;
            case -407622546:
                if (name.equals("getDictValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictValues.INSTANCE, args);
                }
                break;
            case -399551817:
                if (name.equals("toUpperCase")) {
                    return FunctionValidatorKt.withArgumentsValidation(ToUpperCase.INSTANCE, args);
                }
                break;
            case -342730167:
                if (name.equals("getOptNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromArray.INSTANCE, args);
                }
                break;
            case -288070202:
                if (name.equals("getOptNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptNumberFromDict.INSTANCE, args);
                }
                break;
            case -256399843:
                if (name.equals("setMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMinutes.INSTANCE, args);
                }
                break;
            case -230929496:
                if (name.equals("getIntegerFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromDict.INSTANCE, args);
                }
                break;
            case -181255609:
                if (name.equals("addMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(AddMillis.INSTANCE, args);
                }
                break;
            case -174963751:
                if (name.equals("getUrlFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetUrlFromDict.INSTANCE, args);
                }
                break;
            case -116997076:
                if (name.equals("toDegrees")) {
                    return FunctionValidatorKt.withArgumentsValidation(RadiansToDegrees.INSTANCE, args);
                }
                break;
            case -92937393:
                if (name.equals("getStoredNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredNumberValue.INSTANCE, args);
                }
                break;
            case -74977101:
                if (name.equals("getYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetYear.INSTANCE, args);
                }
                break;
            case -57828916:
                if (name.equals("getArrayNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayNumber.INSTANCE, args);
                }
                break;
            case -33620929:
                if (name.equals("getArrayOptUrl")) {
                    GetArrayOptUrlWithStringFallback getArrayOptUrlWithStringFallback = GetArrayOptUrlWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable10 = getArrayOptUrlWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable10, ok10)) {
                        return getArrayOptUrlWithStringFallback;
                    }
                    GetArrayOptUrlWithUrlFallback getArrayOptUrlWithUrlFallback = GetArrayOptUrlWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getArrayOptUrlWithUrlFallback.matchesArguments$div_evaluable(args), ok10)) {
                        return getArrayOptUrlWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getArrayOptUrlWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok10)) {
                        return getArrayOptUrlWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getArrayOptUrlWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok10)) {
                        return getArrayOptUrlWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 3577:
                if (name.equals("pi")) {
                    return FunctionValidatorKt.withArgumentsValidation(Pi.INSTANCE, args);
                }
                break;
            case 96370:
                if (name.equals("abs")) {
                    DoubleAbs doubleAbs = DoubleAbs.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable11 = doubleAbs.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable11, ok11)) {
                        return doubleAbs;
                    }
                    IntegerAbs integerAbs = IntegerAbs.INSTANCE;
                    if (Intrinsics.areEqual(integerAbs.matchesArguments$div_evaluable(args), ok11)) {
                        return integerAbs;
                    }
                    if (Intrinsics.areEqual(doubleAbs.matchesArgumentsWithCast$div_evaluable(args), ok11)) {
                        return doubleAbs;
                    }
                    if (Intrinsics.areEqual(integerAbs.matchesArgumentsWithCast$div_evaluable(args), ok11)) {
                        return integerAbs;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 98695:
                if (name.equals("cos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cos.INSTANCE, args);
                }
                break;
            case 98696:
                if (name.equals("cot")) {
                    return FunctionValidatorKt.withArgumentsValidation(Cot.INSTANCE, args);
                }
                break;
            case 99473:
                if (name.equals("div")) {
                    DoubleDiv doubleDiv = DoubleDiv.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable12 = doubleDiv.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok12 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable12, ok12)) {
                        return doubleDiv;
                    }
                    IntegerDiv integerDiv = IntegerDiv.INSTANCE;
                    if (Intrinsics.areEqual(integerDiv.matchesArguments$div_evaluable(args), ok12)) {
                        return integerDiv;
                    }
                    if (Intrinsics.areEqual(doubleDiv.matchesArgumentsWithCast$div_evaluable(args), ok12)) {
                        return doubleDiv;
                    }
                    if (Intrinsics.areEqual(integerDiv.matchesArgumentsWithCast$div_evaluable(args), ok12)) {
                        return integerDiv;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 107029:
                if (name.equals("len")) {
                    GetArrayLength getArrayLength = GetArrayLength.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable13 = getArrayLength.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok13 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable13, ok13)) {
                        return getArrayLength;
                    }
                    GetDictLength getDictLength = GetDictLength.INSTANCE;
                    if (Intrinsics.areEqual(getDictLength.matchesArguments$div_evaluable(args), ok13)) {
                        return getDictLength;
                    }
                    StringLength stringLength = StringLength.INSTANCE;
                    if (Intrinsics.areEqual(stringLength.matchesArguments$div_evaluable(args), ok13)) {
                        return stringLength;
                    }
                    if (Intrinsics.areEqual(getArrayLength.matchesArgumentsWithCast$div_evaluable(args), ok13)) {
                        return getArrayLength;
                    }
                    if (Intrinsics.areEqual(getDictLength.matchesArgumentsWithCast$div_evaluable(args), ok13)) {
                        return getDictLength;
                    }
                    if (Intrinsics.areEqual(stringLength.matchesArgumentsWithCast$div_evaluable(args), ok13)) {
                        return stringLength;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 107876:
                if (name.equals("max")) {
                    DoubleMax doubleMax = DoubleMax.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable14 = doubleMax.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok14 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable14, ok14)) {
                        return doubleMax;
                    }
                    IntegerMax integerMax = IntegerMax.INSTANCE;
                    if (Intrinsics.areEqual(integerMax.matchesArguments$div_evaluable(args), ok14)) {
                        return integerMax;
                    }
                    if (Intrinsics.areEqual(doubleMax.matchesArgumentsWithCast$div_evaluable(args), ok14)) {
                        return doubleMax;
                    }
                    if (Intrinsics.areEqual(integerMax.matchesArgumentsWithCast$div_evaluable(args), ok14)) {
                        return integerMax;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 108114:
                if (name.equals("min")) {
                    DoubleMin doubleMin = DoubleMin.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable15 = doubleMin.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok15 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable15, ok15)) {
                        return doubleMin;
                    }
                    IntegerMin integerMin = IntegerMin.INSTANCE;
                    if (Intrinsics.areEqual(integerMin.matchesArguments$div_evaluable(args), ok15)) {
                        return integerMin;
                    }
                    if (Intrinsics.areEqual(doubleMin.matchesArgumentsWithCast$div_evaluable(args), ok15)) {
                        return doubleMin;
                    }
                    if (Intrinsics.areEqual(integerMin.matchesArgumentsWithCast$div_evaluable(args), ok15)) {
                        return integerMin;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 108290:
                if (name.equals("mod")) {
                    DoubleMod doubleMod = DoubleMod.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable16 = doubleMod.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok16 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable16, ok16)) {
                        return doubleMod;
                    }
                    IntegerMod integerMod = IntegerMod.INSTANCE;
                    if (Intrinsics.areEqual(integerMod.matchesArguments$div_evaluable(args), ok16)) {
                        return integerMod;
                    }
                    if (Intrinsics.areEqual(doubleMod.matchesArgumentsWithCast$div_evaluable(args), ok16)) {
                        return doubleMod;
                    }
                    if (Intrinsics.areEqual(integerMod.matchesArgumentsWithCast$div_evaluable(args), ok16)) {
                        return integerMod;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 108484:
                if (name.equals("mul")) {
                    DoubleMul doubleMul = DoubleMul.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable17 = doubleMul.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok17 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable17, ok17)) {
                        return doubleMul;
                    }
                    IntegerMul integerMul = IntegerMul.INSTANCE;
                    if (Intrinsics.areEqual(integerMul.matchesArguments$div_evaluable(args), ok17)) {
                        return integerMul;
                    }
                    if (Intrinsics.areEqual(doubleMul.matchesArgumentsWithCast$div_evaluable(args), ok17)) {
                        return doubleMul;
                    }
                    if (Intrinsics.areEqual(integerMul.matchesArgumentsWithCast$div_evaluable(args), ok17)) {
                        return integerMul;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 112845:
                if (name.equals("rgb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorRgb.INSTANCE, args);
                }
                break;
            case 113880:
                if (name.equals("sin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Sine.INSTANCE, args);
                }
                break;
            case 114240:
                if (name.equals(AuthenticationTokenClaims.JSON_KEY_SUB)) {
                    DoubleSub doubleSub = DoubleSub.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable18 = doubleSub.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok18 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable18, ok18)) {
                        return doubleSub;
                    }
                    IntegerSub integerSub = IntegerSub.INSTANCE;
                    if (Intrinsics.areEqual(integerSub.matchesArguments$div_evaluable(args), ok18)) {
                        return integerSub;
                    }
                    if (Intrinsics.areEqual(doubleSub.matchesArgumentsWithCast$div_evaluable(args), ok18)) {
                        return doubleSub;
                    }
                    if (Intrinsics.areEqual(integerSub.matchesArgumentsWithCast$div_evaluable(args), ok18)) {
                        return integerSub;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 114251:
                if (name.equals("sum")) {
                    DoubleSum doubleSum = DoubleSum.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable19 = doubleSum.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok19 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable19, ok19)) {
                        return doubleSum;
                    }
                    IntegerSum integerSum = IntegerSum.INSTANCE;
                    if (Intrinsics.areEqual(integerSum.matchesArguments$div_evaluable(args), ok19)) {
                        return integerSum;
                    }
                    if (Intrinsics.areEqual(doubleSum.matchesArgumentsWithCast$div_evaluable(args), ok19)) {
                        return doubleSum;
                    }
                    if (Intrinsics.areEqual(integerSum.matchesArgumentsWithCast$div_evaluable(args), ok19)) {
                        return integerSum;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 114593:
                if (name.equals("tan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Tan.INSTANCE, args);
                }
                break;
            case 2988422:
                if (name.equals("acos")) {
                    return FunctionValidatorKt.withArgumentsValidation(Acos.INSTANCE, args);
                }
                break;
            case 3002572:
                if (name.equals("argb")) {
                    return FunctionValidatorKt.withArgumentsValidation(ColorArgb.INSTANCE, args);
                }
                break;
            case 3003607:
                if (name.equals("asin")) {
                    return FunctionValidatorKt.withArgumentsValidation(Asin.INSTANCE, args);
                }
                break;
            case 3004320:
                if (name.equals("atan")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan.INSTANCE, args);
                }
                break;
            case 3049733:
                if (name.equals("ceil")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleCeil.INSTANCE, args);
                }
                break;
            case 3568674:
                if (name.equals("trim")) {
                    return FunctionValidatorKt.withArgumentsValidation(Trim.INSTANCE, args);
                }
                break;
            case 53078075:
                if (name.equals("minNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleMinValue.INSTANCE, args);
                }
                break;
            case 81708636:
                if (name.equals("getDictBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictBoolean.INSTANCE, args);
                }
                break;
            case 84549268:
                if (name.equals("getArrayString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayString.INSTANCE, args);
                }
                break;
            case 88715890:
                if (name.equals("getNumberValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberValue.INSTANCE, args);
                }
                break;
            case 93133970:
                if (name.equals("atan2")) {
                    return FunctionValidatorKt.withArgumentsValidation(Atan2.INSTANCE, args);
                }
                break;
            case 97526796:
                if (name.equals("floor")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleFloor.INSTANCE, args);
                }
                break;
            case 100346066:
                if (name.equals("index")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringIndex.INSTANCE, args);
                }
                break;
            case 108704142:
                if (name.equals("round")) {
                    return FunctionValidatorKt.withArgumentsValidation(DoubleRound.INSTANCE, args);
                }
                break;
            case 110520564:
                if (name.equals("toUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringToUrl.INSTANCE, args);
                }
                break;
            case 181165108:
                if (name.equals("formatDateAsLocalWithLocale")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocalWithLocale.INSTANCE, args);
                }
                break;
            case 215331667:
                if (name.equals("getOptArrayFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptArrayFromArray.INSTANCE, args);
                }
                break;
            case 232128784:
                if (name.equals("getDictOptNumber")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptNumber.INSTANCE, args);
                }
                break;
            case 272530949:
                if (name.equals("getArrayBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayBoolean.INSTANCE, args);
                }
                break;
            case 294836803:
                if (name.equals("toInteger")) {
                    BooleanToInteger booleanToInteger = BooleanToInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable20 = booleanToInteger.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok20 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable20, ok20)) {
                        return booleanToInteger;
                    }
                    NumberToInteger numberToInteger = NumberToInteger.INSTANCE;
                    if (Intrinsics.areEqual(numberToInteger.matchesArguments$div_evaluable(args), ok20)) {
                        return numberToInteger;
                    }
                    StringToInteger stringToInteger = StringToInteger.INSTANCE;
                    if (Intrinsics.areEqual(stringToInteger.matchesArguments$div_evaluable(args), ok20)) {
                        return stringToInteger;
                    }
                    if (Intrinsics.areEqual(booleanToInteger.matchesArgumentsWithCast$div_evaluable(args), ok20)) {
                        return booleanToInteger;
                    }
                    if (Intrinsics.areEqual(numberToInteger.matchesArgumentsWithCast$div_evaluable(args), ok20)) {
                        return numberToInteger;
                    }
                    if (Intrinsics.areEqual(stringToInteger.matchesArgumentsWithCast$div_evaluable(args), ok20)) {
                        return stringToInteger;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 374506968:
                if (name.equals("getDictOptString")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptString.INSTANCE, args);
                }
                break;
            case 407302472:
                if (name.equals("setMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMillis.INSTANCE, args);
                }
                break;
            case 412791996:
                if (name.equals("getDictOptColor")) {
                    GetDictOptColorWithColorFallback getDictOptColorWithColorFallback = GetDictOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable21 = getDictOptColorWithColorFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok21 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable21, ok21)) {
                        return getDictOptColorWithColorFallback;
                    }
                    GetDictOptColorWithStringFallback getDictOptColorWithStringFallback = GetDictOptColorWithStringFallback.INSTANCE;
                    if (Intrinsics.areEqual(getDictOptColorWithStringFallback.matchesArguments$div_evaluable(args), ok21)) {
                        return getDictOptColorWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getDictOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(args), ok21)) {
                        return getDictOptColorWithColorFallback;
                    }
                    if (Intrinsics.areEqual(getDictOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok21)) {
                        return getDictOptColorWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 515198110:
                if (name.equals("decodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringDecodeUri.INSTANCE, args);
                }
                break;
            case 530542161:
                if (name.equals("substring")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringSubstring.INSTANCE, args);
                }
                break;
            case 579215519:
                if (name.equals("getBooleanValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanValue.INSTANCE, args);
                }
                break;
            case 609553469:
                if (name.equals("getOptUrlFromArray")) {
                    GetOptUrlFromArrayWithStringFallback getOptUrlFromArrayWithStringFallback = GetOptUrlFromArrayWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable22 = getOptUrlFromArrayWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok22 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable22, ok22)) {
                        return getOptUrlFromArrayWithStringFallback;
                    }
                    GetOptUrlFromArrayWithUrlFallback getOptUrlFromArrayWithUrlFallback = GetOptUrlFromArrayWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getOptUrlFromArrayWithUrlFallback.matchesArguments$div_evaluable(args), ok22)) {
                        return getOptUrlFromArrayWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getOptUrlFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok22)) {
                        return getOptUrlFromArrayWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getOptUrlFromArrayWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok22)) {
                        return getOptUrlFromArrayWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 621919548:
                if (name.equals("getMillis")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMillis.INSTANCE, args);
                }
                break;
            case 624675145:
                if (name.equals("getIntegerValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerValue.INSTANCE, args);
                }
                break;
            case 648795069:
                if (name.equals("setSeconds")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetSeconds.INSTANCE, args);
                }
                break;
            case 671285057:
                if (name.equals("getDictOptBoolean")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictOptBoolean.INSTANCE, args);
                }
                break;
            case 757893007:
                if (name.equals("padStart")) {
                    PadStartInteger padStartInteger = PadStartInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable23 = padStartInteger.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok23 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable23, ok23)) {
                        return padStartInteger;
                    }
                    PadStartString padStartString = PadStartString.INSTANCE;
                    if (Intrinsics.areEqual(padStartString.matchesArguments$div_evaluable(args), ok23)) {
                        return padStartString;
                    }
                    if (Intrinsics.areEqual(padStartInteger.matchesArgumentsWithCast$div_evaluable(args), ok23)) {
                        return padStartInteger;
                    }
                    if (Intrinsics.areEqual(padStartString.matchesArgumentsWithCast$div_evaluable(args), ok23)) {
                        return padStartString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 785010124:
                if (name.equals("getArrayUrl")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayUrl.INSTANCE, args);
                }
                break;
            case 815452174:
                if (name.equals("getArrayOptInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayOptInteger.INSTANCE, args);
                }
                break;
            case 833284859:
                if (name.equals("getStoredUrlValue")) {
                    GetStoredUrlValueWithStringFallback getStoredUrlValueWithStringFallback = GetStoredUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable24 = getStoredUrlValueWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok24 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable24, ok24)) {
                        return getStoredUrlValueWithStringFallback;
                    }
                    GetStoredUrlValueWithUrlFallback getStoredUrlValueWithUrlFallback = GetStoredUrlValueWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getStoredUrlValueWithUrlFallback.matchesArguments$div_evaluable(args), ok24)) {
                        return getStoredUrlValueWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getStoredUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok24)) {
                        return getStoredUrlValueWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getStoredUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok24)) {
                        return getStoredUrlValueWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 851027282:
                if (name.equals("getOptUrlFromDict")) {
                    GetOptUrlFromDictWithStringFallback getOptUrlFromDictWithStringFallback = GetOptUrlFromDictWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable25 = getOptUrlFromDictWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok25 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable25, ok25)) {
                        return getOptUrlFromDictWithStringFallback;
                    }
                    GetOptUrlFromDictWithUrlFallback getOptUrlFromDictWithUrlFallback = GetOptUrlFromDictWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getOptUrlFromDictWithUrlFallback.matchesArguments$div_evaluable(args), ok25)) {
                        return getOptUrlFromDictWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getOptUrlFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok25)) {
                        return getOptUrlFromDictWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getOptUrlFromDictWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok25)) {
                        return getOptUrlFromDictWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 902290499:
                if (name.equals("getArrayFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetArrayFromDict.INSTANCE, args);
                }
                break;
            case 963997617:
                if (name.equals("getColorAlpha")) {
                    ColorAlphaComponentGetter colorAlphaComponentGetter = ColorAlphaComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable26 = colorAlphaComponentGetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok26 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable26, ok26)) {
                        return colorAlphaComponentGetter;
                    }
                    ColorStringAlphaComponentGetter colorStringAlphaComponentGetter = ColorStringAlphaComponentGetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringAlphaComponentGetter.matchesArguments$div_evaluable(args), ok26)) {
                        return colorStringAlphaComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok26)) {
                        return colorAlphaComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorStringAlphaComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok26)) {
                        return colorStringAlphaComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 968898065:
                if (name.equals("getStoredArrayValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredArrayValue.INSTANCE, args);
                }
                break;
            case 969706838:
                if (name.equals("getColorGreen")) {
                    ColorGreenComponentGetter colorGreenComponentGetter = ColorGreenComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable27 = colorGreenComponentGetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok27 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable27, ok27)) {
                        return colorGreenComponentGetter;
                    }
                    ColorStringGreenComponentGetter colorStringGreenComponentGetter = ColorStringGreenComponentGetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringGreenComponentGetter.matchesArguments$div_evaluable(args), ok27)) {
                        return colorStringGreenComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok27)) {
                        return colorGreenComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorStringGreenComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok27)) {
                        return colorStringGreenComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 983060420:
                if (name.equals("getColorValue")) {
                    GetColorValue getColorValue = GetColorValue.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable28 = getColorValue.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok28 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable28, ok28)) {
                        return getColorValue;
                    }
                    GetColorValueString getColorValueString = GetColorValueString.INSTANCE;
                    if (Intrinsics.areEqual(getColorValueString.matchesArguments$div_evaluable(args), ok28)) {
                        return getColorValueString;
                    }
                    if (Intrinsics.areEqual(getColorValue.matchesArgumentsWithCast$div_evaluable(args), ok28)) {
                        return getColorValue;
                    }
                    if (Intrinsics.areEqual(getColorValueString.matchesArgumentsWithCast$div_evaluable(args), ok28)) {
                        return getColorValueString;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1012555088:
                if (name.equals("getNumberFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromArray.INSTANCE, args);
                }
                break;
            case 1022717043:
                if (name.equals("getOptDictFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromDict.INSTANCE, args);
                }
                break;
            case 1098852024:
                if (name.equals("getUrlValue")) {
                    GetUrlValueWithStringFallback getUrlValueWithStringFallback = GetUrlValueWithStringFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable29 = getUrlValueWithStringFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok29 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable29, ok29)) {
                        return getUrlValueWithStringFallback;
                    }
                    GetUrlValueWithUrlFallback getUrlValueWithUrlFallback = GetUrlValueWithUrlFallback.INSTANCE;
                    if (Intrinsics.areEqual(getUrlValueWithUrlFallback.matchesArguments$div_evaluable(args), ok29)) {
                        return getUrlValueWithUrlFallback;
                    }
                    if (Intrinsics.areEqual(getUrlValueWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok29)) {
                        return getUrlValueWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getUrlValueWithUrlFallback.matchesArgumentsWithCast$div_evaluable(args), ok29)) {
                        return getUrlValueWithUrlFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1194358440:
                if (name.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable30 = integerDecimalFormat.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok30 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable30, ok30)) {
                        return integerDecimalFormat;
                    }
                    LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(args), ok30)) {
                        return localizedIntegerDecimalFormat;
                    }
                    LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(localizedNumberDecimalFormat.matchesArguments$div_evaluable(args), ok30)) {
                        return localizedNumberDecimalFormat;
                    }
                    NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(numberDecimalFormat.matchesArguments$div_evaluable(args), ok30)) {
                        return numberDecimalFormat;
                    }
                    if (Intrinsics.areEqual(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok30)) {
                        return integerDecimalFormat;
                    }
                    if (Intrinsics.areEqual(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok30)) {
                        return localizedIntegerDecimalFormat;
                    }
                    if (Intrinsics.areEqual(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok30)) {
                        return localizedNumberDecimalFormat;
                    }
                    if (Intrinsics.areEqual(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok30)) {
                        return numberDecimalFormat;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1298006409:
                if (name.equals("getOptColorFromArray")) {
                    GetOptColorFromArrayWithColorFallback getOptColorFromArrayWithColorFallback = GetOptColorFromArrayWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable31 = getOptColorFromArrayWithColorFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok31 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable31, ok31)) {
                        return getOptColorFromArrayWithColorFallback;
                    }
                    GetOptColorFromArrayWithStringFallback getOptColorFromArrayWithStringFallback = GetOptColorFromArrayWithStringFallback.INSTANCE;
                    if (Intrinsics.areEqual(getOptColorFromArrayWithStringFallback.matchesArguments$div_evaluable(args), ok31)) {
                        return getOptColorFromArrayWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getOptColorFromArrayWithColorFallback.matchesArgumentsWithCast$div_evaluable(args), ok31)) {
                        return getOptColorFromArrayWithColorFallback;
                    }
                    if (Intrinsics.areEqual(getOptColorFromArrayWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok31)) {
                        return getOptColorFromArrayWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1309020812:
                if (name.equals("minInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(IntegerMinValue.INSTANCE, args);
                }
                break;
            case 1335732619:
                if (name.equals("getOptBooleanFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptBooleanFromDict.INSTANCE, args);
                }
                break;
            case 1346085543:
                if (name.equals("getStringFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringFromDict.INSTANCE, args);
                }
                break;
            case 1360482480:
                if (name.equals("setColorRed")) {
                    ColorRedComponentSetter colorRedComponentSetter = ColorRedComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable32 = colorRedComponentSetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok32 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable32, ok32)) {
                        return colorRedComponentSetter;
                    }
                    ColorStringRedComponentSetter colorStringRedComponentSetter = ColorStringRedComponentSetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringRedComponentSetter.matchesArguments$div_evaluable(args), ok32)) {
                        return colorStringRedComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorRedComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok32)) {
                        return colorRedComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorStringRedComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok32)) {
                        return colorStringRedComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1394182093:
                if (name.equals("setHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetHours.INSTANCE, args);
                }
                break;
            case 1398793022:
                if (name.equals("setMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetMonth.INSTANCE, args);
                }
                break;
            case 1428631719:
                if (name.equals("getIntegerFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntegerFromArray.INSTANCE, args);
                }
                break;
            case 1449062308:
                if (name.equals("getColorRed")) {
                    ColorRedComponentGetter colorRedComponentGetter = ColorRedComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable33 = colorRedComponentGetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok33 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable33, ok33)) {
                        return colorRedComponentGetter;
                    }
                    ColorStringRedComponentGetter colorStringRedComponentGetter = ColorStringRedComponentGetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringRedComponentGetter.matchesArguments$div_evaluable(args), ok33)) {
                        return colorStringRedComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorRedComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok33)) {
                        return colorRedComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorStringRedComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok33)) {
                        return colorStringRedComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1507829577:
                if (name.equals("trimLeft")) {
                    return FunctionValidatorKt.withArgumentsValidation(TrimLeft.INSTANCE, args);
                }
                break;
            case 1508134774:
                if (name.equals("encodeUri")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringEncodeUri.INSTANCE, args);
                }
                break;
            case 1565972102:
                if (name.equals("getOptColorFromDict")) {
                    GetOptColorFromDictWithColorFallback getOptColorFromDictWithColorFallback = GetOptColorFromDictWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable34 = getOptColorFromDictWithColorFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok34 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable34, ok34)) {
                        return getOptColorFromDictWithColorFallback;
                    }
                    GetOptColorFromDictWithStringFallback getOptColorFromDictWithStringFallback = GetOptColorFromDictWithStringFallback.INSTANCE;
                    if (Intrinsics.areEqual(getOptColorFromDictWithStringFallback.matchesArguments$div_evaluable(args), ok34)) {
                        return getOptColorFromDictWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getOptColorFromDictWithColorFallback.matchesArgumentsWithCast$div_evaluable(args), ok34)) {
                        return getOptColorFromDictWithColorFallback;
                    }
                    if (Intrinsics.areEqual(getOptColorFromDictWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok34)) {
                        return getOptColorFromDictWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1636968764:
                if (name.equals("getOptDictFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptDictFromArray.INSTANCE, args);
                }
                break;
            case 1644730933:
                if (name.equals("nowLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(NowLocal.INSTANCE, args);
                }
                break;
            case 1695311327:
                if (name.equals("getNumberFromDict")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetNumberFromDict.INSTANCE, args);
                }
                break;
            case 1716172417:
                if (name.equals("getOptStringFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetOptStringFromArray.INSTANCE, args);
                }
                break;
            case 1738128829:
                if (name.equals("setColorAlpha")) {
                    ColorAlphaComponentSetter colorAlphaComponentSetter = ColorAlphaComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable35 = colorAlphaComponentSetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok35 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable35, ok35)) {
                        return colorAlphaComponentSetter;
                    }
                    ColorStringAlphaComponentSetter colorStringAlphaComponentSetter = ColorStringAlphaComponentSetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringAlphaComponentSetter.matchesArguments$div_evaluable(args), ok35)) {
                        return colorStringAlphaComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok35)) {
                        return colorAlphaComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorStringAlphaComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok35)) {
                        return colorStringAlphaComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1743838050:
                if (name.equals("setColorGreen")) {
                    ColorGreenComponentSetter colorGreenComponentSetter = ColorGreenComponentSetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable36 = colorGreenComponentSetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok36 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable36, ok36)) {
                        return colorGreenComponentSetter;
                    }
                    ColorStringGreenComponentSetter colorStringGreenComponentSetter = ColorStringGreenComponentSetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringGreenComponentSetter.matchesArguments$div_evaluable(args), ok36)) {
                        return colorStringGreenComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok36)) {
                        return colorGreenComponentSetter;
                    }
                    if (Intrinsics.areEqual(colorStringGreenComponentSetter.matchesArgumentsWithCast$div_evaluable(args), ok36)) {
                        return colorStringGreenComponentSetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1745084820:
                if (name.equals("getIntervalHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalHours.INSTANCE, args);
                }
                break;
            case 1814686973:
                if (name.equals("getBooleanFromArray")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetBooleanFromArray.INSTANCE, args);
                }
                break;
            case 1883462358:
                if (name.equals("getIntervalTotalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalTotalMinutes.INSTANCE, args);
                }
                break;
            case 1907630144:
                if (name.equals("getDictKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictKeys.INSTANCE, args);
                }
                break;
            case 1910382545:
                if (name.equals("encodeRegex")) {
                    return FunctionValidatorKt.withArgumentsValidation(EncodeRegex.INSTANCE, args);
                }
                break;
            case 1953671716:
                if (name.equals("getIntervalMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetIntervalMinutes.INSTANCE, args);
                }
                break;
            case 1953831815:
                if (name.equals("getStoredStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStoredStringValue.INSTANCE, args);
                }
                break;
            case 1955294553:
                if (name.equals("getHours")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetHours.INSTANCE, args);
                }
                break;
            case 1959905482:
                if (name.equals("getMonth")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMonth.INSTANCE, args);
                }
                break;
            case 1970789287:
                if (name.equals("getColorBlue")) {
                    ColorBlueComponentGetter colorBlueComponentGetter = ColorBlueComponentGetter.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable37 = colorBlueComponentGetter.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok37 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable37, ok37)) {
                        return colorBlueComponentGetter;
                    }
                    ColorStringBlueComponentGetter colorStringBlueComponentGetter = ColorStringBlueComponentGetter.INSTANCE;
                    if (Intrinsics.areEqual(colorStringBlueComponentGetter.matchesArguments$div_evaluable(args), ok37)) {
                        return colorStringBlueComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok37)) {
                        return colorBlueComponentGetter;
                    }
                    if (Intrinsics.areEqual(colorStringBlueComponentGetter.matchesArgumentsWithCast$div_evaluable(args), ok37)) {
                        return colorStringBlueComponentGetter;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 1975049074:
                if (name.equals("getDictInteger")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetDictInteger.INSTANCE, args);
                }
                break;
            case 1985132479:
                if (name.equals("setYear")) {
                    return FunctionValidatorKt.withArgumentsValidation(SetYear.INSTANCE, args);
                }
                break;
            case 1992807388:
                if (name.equals("lastIndex")) {
                    return FunctionValidatorKt.withArgumentsValidation(StringLastIndex.INSTANCE, args);
                }
                break;
            case 2033316403:
                if (name.equals("getArrayOptColor")) {
                    GetArrayOptColorWithColorFallback getArrayOptColorWithColorFallback = GetArrayOptColorWithColorFallback.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable38 = getArrayOptColorWithColorFallback.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok38 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable38, ok38)) {
                        return getArrayOptColorWithColorFallback;
                    }
                    GetArrayOptColorWithStringFallback getArrayOptColorWithStringFallback = GetArrayOptColorWithStringFallback.INSTANCE;
                    if (Intrinsics.areEqual(getArrayOptColorWithStringFallback.matchesArguments$div_evaluable(args), ok38)) {
                        return getArrayOptColorWithStringFallback;
                    }
                    if (Intrinsics.areEqual(getArrayOptColorWithColorFallback.matchesArgumentsWithCast$div_evaluable(args), ok38)) {
                        return getArrayOptColorWithColorFallback;
                    }
                    if (Intrinsics.areEqual(getArrayOptColorWithStringFallback.matchesArgumentsWithCast$div_evaluable(args), ok38)) {
                        return getArrayOptColorWithStringFallback;
                    }
                    throw FunctionValidatorKt.getFunctionArgumentsException$default(name, args, false, 4, null);
                }
                break;
            case 2075646548:
                if (name.equals("formatDateAsLocal")) {
                    return FunctionValidatorKt.withArgumentsValidation(FormatDateAsLocal.INSTANCE, args);
                }
                break;
            case 2101762217:
                if (name.equals("getMinutes")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetMinutes.INSTANCE, args);
                }
                break;
            case 2135485098:
                if (name.equals("getStringValue")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetStringValue.INSTANCE, args);
                }
                break;
        }
        throw new EvaluableException("Unknown function name: " + name + '.', null, 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        switch (name.hashCode()) {
            case -1776922004:
                if (name.equals("toString")) {
                    ArrayToString arrayToString = ArrayToString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable = arrayToString.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable, ok)) {
                        return arrayToString;
                    }
                    BooleanToString booleanToString = BooleanToString.INSTANCE;
                    if (Intrinsics.areEqual(booleanToString.matchesArguments$div_evaluable(args), ok)) {
                        return booleanToString;
                    }
                    ColorToString colorToString = ColorToString.INSTANCE;
                    if (Intrinsics.areEqual(colorToString.matchesArguments$div_evaluable(args), ok)) {
                        return colorToString;
                    }
                    DictToString dictToString = DictToString.INSTANCE;
                    if (Intrinsics.areEqual(dictToString.matchesArguments$div_evaluable(args), ok)) {
                        return dictToString;
                    }
                    IntegerToString integerToString = IntegerToString.INSTANCE;
                    if (Intrinsics.areEqual(integerToString.matchesArguments$div_evaluable(args), ok)) {
                        return integerToString;
                    }
                    NumberToString numberToString = NumberToString.INSTANCE;
                    if (Intrinsics.areEqual(numberToString.matchesArguments$div_evaluable(args), ok)) {
                        return numberToString;
                    }
                    StringToString stringToString = StringToString.INSTANCE;
                    if (Intrinsics.areEqual(stringToString.matchesArguments$div_evaluable(args), ok)) {
                        return stringToString;
                    }
                    UrlToString urlToString = UrlToString.INSTANCE;
                    if (Intrinsics.areEqual(urlToString.matchesArguments$div_evaluable(args), ok)) {
                        return urlToString;
                    }
                    if (Intrinsics.areEqual(arrayToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return arrayToString;
                    }
                    if (Intrinsics.areEqual(booleanToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return booleanToString;
                    }
                    if (Intrinsics.areEqual(colorToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return colorToString;
                    }
                    if (Intrinsics.areEqual(dictToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return dictToString;
                    }
                    if (Intrinsics.areEqual(integerToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return integerToString;
                    }
                    if (Intrinsics.areEqual(numberToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return numberToString;
                    }
                    if (Intrinsics.areEqual(stringToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return stringToString;
                    }
                    if (Intrinsics.areEqual(urlToString.matchesArgumentsWithCast$div_evaluable(args), ok)) {
                        return urlToString;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case -1300054776:
                if (name.equals("getInteger")) {
                    ArrayGetInteger arrayGetInteger = ArrayGetInteger.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable2 = arrayGetInteger.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok2 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable2, ok2)) {
                        return arrayGetInteger;
                    }
                    GetInteger getInteger = GetInteger.INSTANCE;
                    if (Intrinsics.areEqual(getInteger.matchesArguments$div_evaluable(args), ok2)) {
                        return getInteger;
                    }
                    if (Intrinsics.areEqual(arrayGetInteger.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return arrayGetInteger;
                    }
                    if (Intrinsics.areEqual(getInteger.matchesArgumentsWithCast$div_evaluable(args), ok2)) {
                        return getInteger;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case -1249348039:
                if (name.equals("getUrl")) {
                    ArrayGetUrl arrayGetUrl = ArrayGetUrl.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable3 = arrayGetUrl.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok3 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable3, ok3)) {
                        return arrayGetUrl;
                    }
                    GetUrl getUrl = GetUrl.INSTANCE;
                    if (Intrinsics.areEqual(getUrl.matchesArguments$div_evaluable(args), ok3)) {
                        return getUrl;
                    }
                    if (Intrinsics.areEqual(arrayGetUrl.matchesArgumentsWithCast$div_evaluable(args), ok3)) {
                        return arrayGetUrl;
                    }
                    if (Intrinsics.areEqual(getUrl.matchesArgumentsWithCast$div_evaluable(args), ok3)) {
                        return getUrl;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case -75598804:
                if (name.equals("getDict")) {
                    ArrayGetDict arrayGetDict = ArrayGetDict.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable4 = arrayGetDict.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok4 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable4, ok4)) {
                        return arrayGetDict;
                    }
                    GetDict getDict = GetDict.INSTANCE;
                    if (Intrinsics.areEqual(getDict.matchesArguments$div_evaluable(args), ok4)) {
                        return getDict;
                    }
                    if (Intrinsics.areEqual(arrayGetDict.matchesArgumentsWithCast$div_evaluable(args), ok4)) {
                        return arrayGetDict;
                    }
                    if (Intrinsics.areEqual(getDict.matchesArgumentsWithCast$div_evaluable(args), ok4)) {
                        return getDict;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case -75393430:
                if (name.equals("getKeys")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetKeys.INSTANCE, args);
                }
                break;
            case 208013248:
                if (name.equals("containsKey")) {
                    return FunctionValidatorKt.withArgumentsValidation(DictContainsKey.INSTANCE, args);
                }
                break;
            case 661651007:
                if (name.equals("getNumber")) {
                    ArrayGetNumber arrayGetNumber = ArrayGetNumber.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable5 = arrayGetNumber.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok5 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable5, ok5)) {
                        return arrayGetNumber;
                    }
                    GetNumber getNumber = GetNumber.INSTANCE;
                    if (Intrinsics.areEqual(getNumber.matchesArguments$div_evaluable(args), ok5)) {
                        return getNumber;
                    }
                    if (Intrinsics.areEqual(arrayGetNumber.matchesArgumentsWithCast$div_evaluable(args), ok5)) {
                        return arrayGetNumber;
                    }
                    if (Intrinsics.areEqual(getNumber.matchesArgumentsWithCast$div_evaluable(args), ok5)) {
                        return getNumber;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 804029191:
                if (name.equals("getString")) {
                    ArrayGetString arrayGetString = ArrayGetString.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable6 = arrayGetString.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok6 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable6, ok6)) {
                        return arrayGetString;
                    }
                    GetString getString = GetString.INSTANCE;
                    if (Intrinsics.areEqual(getString.matchesArguments$div_evaluable(args), ok6)) {
                        return getString;
                    }
                    if (Intrinsics.areEqual(arrayGetString.matchesArgumentsWithCast$div_evaluable(args), ok6)) {
                        return arrayGetString;
                    }
                    if (Intrinsics.areEqual(getString.matchesArgumentsWithCast$div_evaluable(args), ok6)) {
                        return getString;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 872202264:
                if (name.equals("getValues")) {
                    return FunctionValidatorKt.withArgumentsValidation(GetValues.INSTANCE, args);
                }
                break;
            case 1101572082:
                if (name.equals("getBoolean")) {
                    ArrayGetBoolean arrayGetBoolean = ArrayGetBoolean.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable7 = arrayGetBoolean.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok7 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable7, ok7)) {
                        return arrayGetBoolean;
                    }
                    GetBoolean getBoolean = GetBoolean.INSTANCE;
                    if (Intrinsics.areEqual(getBoolean.matchesArguments$div_evaluable(args), ok7)) {
                        return getBoolean;
                    }
                    if (Intrinsics.areEqual(arrayGetBoolean.matchesArgumentsWithCast$div_evaluable(args), ok7)) {
                        return arrayGetBoolean;
                    }
                    if (Intrinsics.areEqual(getBoolean.matchesArgumentsWithCast$div_evaluable(args), ok7)) {
                        return getBoolean;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 1194358440:
                if (name.equals("decimalFormat")) {
                    IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable8 = integerDecimalFormat.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok8 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable8, ok8)) {
                        return integerDecimalFormat;
                    }
                    LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(localizedIntegerDecimalFormat.matchesArguments$div_evaluable(args), ok8)) {
                        return localizedIntegerDecimalFormat;
                    }
                    LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(localizedNumberDecimalFormat.matchesArguments$div_evaluable(args), ok8)) {
                        return localizedNumberDecimalFormat;
                    }
                    NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
                    if (Intrinsics.areEqual(numberDecimalFormat.matchesArguments$div_evaluable(args), ok8)) {
                        return numberDecimalFormat;
                    }
                    if (Intrinsics.areEqual(integerDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return integerDecimalFormat;
                    }
                    if (Intrinsics.areEqual(localizedIntegerDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return localizedIntegerDecimalFormat;
                    }
                    if (Intrinsics.areEqual(localizedNumberDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return localizedNumberDecimalFormat;
                    }
                    if (Intrinsics.areEqual(numberDecimalFormat.matchesArgumentsWithCast$div_evaluable(args), ok8)) {
                        return numberDecimalFormat;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 1948915875:
                if (name.equals("getArray")) {
                    ArrayGetArray arrayGetArray = ArrayGetArray.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable9 = arrayGetArray.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok9 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable9, ok9)) {
                        return arrayGetArray;
                    }
                    GetArray getArray = GetArray.INSTANCE;
                    if (Intrinsics.areEqual(getArray.matchesArguments$div_evaluable(args), ok9)) {
                        return getArray;
                    }
                    if (Intrinsics.areEqual(arrayGetArray.matchesArgumentsWithCast$div_evaluable(args), ok9)) {
                        return arrayGetArray;
                    }
                    if (Intrinsics.areEqual(getArray.matchesArgumentsWithCast$div_evaluable(args), ok9)) {
                        return getArray;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 1950668205:
                if (name.equals("getColor")) {
                    ArrayGetColor arrayGetColor = ArrayGetColor.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable10 = arrayGetColor.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok10 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable10, ok10)) {
                        return arrayGetColor;
                    }
                    GetColor getColor = GetColor.INSTANCE;
                    if (Intrinsics.areEqual(getColor.matchesArguments$div_evaluable(args), ok10)) {
                        return getColor;
                    }
                    if (Intrinsics.areEqual(arrayGetColor.matchesArgumentsWithCast$div_evaluable(args), ok10)) {
                        return arrayGetColor;
                    }
                    if (Intrinsics.areEqual(getColor.matchesArgumentsWithCast$div_evaluable(args), ok10)) {
                        return getColor;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
            case 2058039875:
                if (name.equals("isEmpty")) {
                    ArrayIsEmpty arrayIsEmpty = ArrayIsEmpty.INSTANCE;
                    Function.MatchResult matchesArguments$div_evaluable11 = arrayIsEmpty.matchesArguments$div_evaluable(args);
                    Function.MatchResult.Ok ok11 = Function.MatchResult.Ok.INSTANCE;
                    if (Intrinsics.areEqual(matchesArguments$div_evaluable11, ok11)) {
                        return arrayIsEmpty;
                    }
                    DictIsEmpty dictIsEmpty = DictIsEmpty.INSTANCE;
                    if (Intrinsics.areEqual(dictIsEmpty.matchesArguments$div_evaluable(args), ok11)) {
                        return dictIsEmpty;
                    }
                    if (Intrinsics.areEqual(arrayIsEmpty.matchesArgumentsWithCast$div_evaluable(args), ok11)) {
                        return arrayIsEmpty;
                    }
                    if (Intrinsics.areEqual(dictIsEmpty.matchesArgumentsWithCast$div_evaluable(args), ok11)) {
                        return dictIsEmpty;
                    }
                    throw FunctionValidatorKt.getMethodArgumentsException(name, args);
                }
                break;
        }
        throw new EvaluableException("Unknown method name: " + name + '.', null, 2, null);
    }

    public final void warmUp() {
        Acos acos = Acos.INSTANCE;
        AddMillis addMillis = AddMillis.INSTANCE;
        ArrayToString arrayToString = ArrayToString.INSTANCE;
        Asin asin = Asin.INSTANCE;
        Atan atan = Atan.INSTANCE;
        Atan2 atan2 = Atan2.INSTANCE;
        BooleanToInteger booleanToInteger = BooleanToInteger.INSTANCE;
        BooleanToString booleanToString = BooleanToString.INSTANCE;
        ColorAlphaComponentGetter colorAlphaComponentGetter = ColorAlphaComponentGetter.INSTANCE;
        ColorAlphaComponentSetter colorAlphaComponentSetter = ColorAlphaComponentSetter.INSTANCE;
        ColorArgb colorArgb = ColorArgb.INSTANCE;
        ColorBlueComponentGetter colorBlueComponentGetter = ColorBlueComponentGetter.INSTANCE;
        ColorBlueComponentSetter colorBlueComponentSetter = ColorBlueComponentSetter.INSTANCE;
        ColorGreenComponentGetter colorGreenComponentGetter = ColorGreenComponentGetter.INSTANCE;
        ColorGreenComponentSetter colorGreenComponentSetter = ColorGreenComponentSetter.INSTANCE;
        ColorRedComponentGetter colorRedComponentGetter = ColorRedComponentGetter.INSTANCE;
        ColorRedComponentSetter colorRedComponentSetter = ColorRedComponentSetter.INSTANCE;
        ColorRgb colorRgb = ColorRgb.INSTANCE;
        ColorStringAlphaComponentGetter colorStringAlphaComponentGetter = ColorStringAlphaComponentGetter.INSTANCE;
        ColorStringAlphaComponentSetter colorStringAlphaComponentSetter = ColorStringAlphaComponentSetter.INSTANCE;
        ColorStringBlueComponentGetter colorStringBlueComponentGetter = ColorStringBlueComponentGetter.INSTANCE;
        ColorStringBlueComponentSetter colorStringBlueComponentSetter = ColorStringBlueComponentSetter.INSTANCE;
        ColorStringGreenComponentGetter colorStringGreenComponentGetter = ColorStringGreenComponentGetter.INSTANCE;
        ColorStringGreenComponentSetter colorStringGreenComponentSetter = ColorStringGreenComponentSetter.INSTANCE;
        ColorStringRedComponentGetter colorStringRedComponentGetter = ColorStringRedComponentGetter.INSTANCE;
        ColorStringRedComponentSetter colorStringRedComponentSetter = ColorStringRedComponentSetter.INSTANCE;
        ColorToString colorToString = ColorToString.INSTANCE;
        Cos cos = Cos.INSTANCE;
        Cot cot = Cot.INSTANCE;
        DegreesToRadians degreesToRadians = DegreesToRadians.INSTANCE;
        DictToString dictToString = DictToString.INSTANCE;
        DoubleAbs doubleAbs = DoubleAbs.INSTANCE;
        DoubleCeil doubleCeil = DoubleCeil.INSTANCE;
        DoubleCopySign doubleCopySign = DoubleCopySign.INSTANCE;
        DoubleDiv doubleDiv = DoubleDiv.INSTANCE;
        DoubleFloor doubleFloor = DoubleFloor.INSTANCE;
        DoubleMax doubleMax = DoubleMax.INSTANCE;
        DoubleMaxValue doubleMaxValue = DoubleMaxValue.INSTANCE;
        DoubleMin doubleMin = DoubleMin.INSTANCE;
        DoubleMinValue doubleMinValue = DoubleMinValue.INSTANCE;
        DoubleMod doubleMod = DoubleMod.INSTANCE;
        DoubleMul doubleMul = DoubleMul.INSTANCE;
        DoubleRound doubleRound = DoubleRound.INSTANCE;
        DoubleSignum doubleSignum = DoubleSignum.INSTANCE;
        DoubleSub doubleSub = DoubleSub.INSTANCE;
        DoubleSum doubleSum = DoubleSum.INSTANCE;
        EncodeRegex encodeRegex = EncodeRegex.INSTANCE;
        FormatDateAsLocal formatDateAsLocal = FormatDateAsLocal.INSTANCE;
        FormatDateAsLocalWithLocale formatDateAsLocalWithLocale = FormatDateAsLocalWithLocale.INSTANCE;
        FormatDateAsUTC formatDateAsUTC = FormatDateAsUTC.INSTANCE;
        FormatDateAsUTCWithLocale formatDateAsUTCWithLocale = FormatDateAsUTCWithLocale.INSTANCE;
        GetArrayBoolean getArrayBoolean = GetArrayBoolean.INSTANCE;
        GetArrayColor getArrayColor = GetArrayColor.INSTANCE;
        GetArrayFromArray getArrayFromArray = GetArrayFromArray.INSTANCE;
        GetArrayFromDict getArrayFromDict = GetArrayFromDict.INSTANCE;
        GetArrayInteger getArrayInteger = GetArrayInteger.INSTANCE;
        GetArrayLength getArrayLength = GetArrayLength.INSTANCE;
        GetArrayNumber getArrayNumber = GetArrayNumber.INSTANCE;
        GetArrayOptBoolean getArrayOptBoolean = GetArrayOptBoolean.INSTANCE;
        GetArrayOptColorWithColorFallback getArrayOptColorWithColorFallback = GetArrayOptColorWithColorFallback.INSTANCE;
        GetArrayOptColorWithStringFallback getArrayOptColorWithStringFallback = GetArrayOptColorWithStringFallback.INSTANCE;
        GetArrayOptInteger getArrayOptInteger = GetArrayOptInteger.INSTANCE;
        GetArrayOptNumber getArrayOptNumber = GetArrayOptNumber.INSTANCE;
        GetArrayOptString getArrayOptString = GetArrayOptString.INSTANCE;
        GetArrayOptUrlWithStringFallback getArrayOptUrlWithStringFallback = GetArrayOptUrlWithStringFallback.INSTANCE;
        GetArrayOptUrlWithUrlFallback getArrayOptUrlWithUrlFallback = GetArrayOptUrlWithUrlFallback.INSTANCE;
        GetArrayString getArrayString = GetArrayString.INSTANCE;
        GetArrayUrl getArrayUrl = GetArrayUrl.INSTANCE;
        GetBooleanFromArray getBooleanFromArray = GetBooleanFromArray.INSTANCE;
        GetBooleanFromDict getBooleanFromDict = GetBooleanFromDict.INSTANCE;
        GetBooleanValue getBooleanValue = GetBooleanValue.INSTANCE;
        GetColorFromArray getColorFromArray = GetColorFromArray.INSTANCE;
        GetColorFromDict getColorFromDict = GetColorFromDict.INSTANCE;
        GetColorValue getColorValue = GetColorValue.INSTANCE;
        GetColorValueString getColorValueString = GetColorValueString.INSTANCE;
        GetDay getDay = GetDay.INSTANCE;
        GetDayOfWeek getDayOfWeek = GetDayOfWeek.INSTANCE;
        GetDictBoolean getDictBoolean = GetDictBoolean.INSTANCE;
        GetDictColor getDictColor = GetDictColor.INSTANCE;
        GetDictFromArray getDictFromArray = GetDictFromArray.INSTANCE;
        GetDictFromDict getDictFromDict = GetDictFromDict.INSTANCE;
        GetDictInteger getDictInteger = GetDictInteger.INSTANCE;
        GetDictKeys getDictKeys = GetDictKeys.INSTANCE;
        GetDictLength getDictLength = GetDictLength.INSTANCE;
        GetDictNumber getDictNumber = GetDictNumber.INSTANCE;
        GetDictOptBoolean getDictOptBoolean = GetDictOptBoolean.INSTANCE;
        GetDictOptColorWithColorFallback getDictOptColorWithColorFallback = GetDictOptColorWithColorFallback.INSTANCE;
        GetDictOptColorWithStringFallback getDictOptColorWithStringFallback = GetDictOptColorWithStringFallback.INSTANCE;
        GetDictOptInteger getDictOptInteger = GetDictOptInteger.INSTANCE;
        GetDictOptNumber getDictOptNumber = GetDictOptNumber.INSTANCE;
        GetDictOptString getDictOptString = GetDictOptString.INSTANCE;
        GetDictOptUrlWithStringFallback getDictOptUrlWithStringFallback = GetDictOptUrlWithStringFallback.INSTANCE;
        GetDictOptUrlWithUrlFallback getDictOptUrlWithUrlFallback = GetDictOptUrlWithUrlFallback.INSTANCE;
        GetDictString getDictString = GetDictString.INSTANCE;
        GetDictUrl getDictUrl = GetDictUrl.INSTANCE;
        GetDictValues getDictValues = GetDictValues.INSTANCE;
        GetHours getHours = GetHours.INSTANCE;
        GetIntegerFromArray getIntegerFromArray = GetIntegerFromArray.INSTANCE;
        GetIntegerFromDict getIntegerFromDict = GetIntegerFromDict.INSTANCE;
        GetIntegerValue getIntegerValue = GetIntegerValue.INSTANCE;
        GetIntervalHours getIntervalHours = GetIntervalHours.INSTANCE;
        GetIntervalMinutes getIntervalMinutes = GetIntervalMinutes.INSTANCE;
        GetIntervalSeconds getIntervalSeconds = GetIntervalSeconds.INSTANCE;
        GetIntervalTotalDays getIntervalTotalDays = GetIntervalTotalDays.INSTANCE;
        GetIntervalTotalHours getIntervalTotalHours = GetIntervalTotalHours.INSTANCE;
        GetIntervalTotalMinutes getIntervalTotalMinutes = GetIntervalTotalMinutes.INSTANCE;
        GetIntervalTotalSeconds getIntervalTotalSeconds = GetIntervalTotalSeconds.INSTANCE;
        GetIntervalTotalWeeks getIntervalTotalWeeks = GetIntervalTotalWeeks.INSTANCE;
        GetMillis getMillis = GetMillis.INSTANCE;
        GetMinutes getMinutes = GetMinutes.INSTANCE;
        GetMonth getMonth = GetMonth.INSTANCE;
        GetNumberFromArray getNumberFromArray = GetNumberFromArray.INSTANCE;
        GetNumberFromDict getNumberFromDict = GetNumberFromDict.INSTANCE;
        GetNumberValue getNumberValue = GetNumberValue.INSTANCE;
        GetOptArrayFromArray getOptArrayFromArray = GetOptArrayFromArray.INSTANCE;
        GetOptArrayFromDict getOptArrayFromDict = GetOptArrayFromDict.INSTANCE;
        GetOptBooleanFromArray getOptBooleanFromArray = GetOptBooleanFromArray.INSTANCE;
        GetOptBooleanFromDict getOptBooleanFromDict = GetOptBooleanFromDict.INSTANCE;
        GetOptColorFromArrayWithColorFallback getOptColorFromArrayWithColorFallback = GetOptColorFromArrayWithColorFallback.INSTANCE;
        GetOptColorFromArrayWithStringFallback getOptColorFromArrayWithStringFallback = GetOptColorFromArrayWithStringFallback.INSTANCE;
        GetOptColorFromDictWithColorFallback getOptColorFromDictWithColorFallback = GetOptColorFromDictWithColorFallback.INSTANCE;
        GetOptColorFromDictWithStringFallback getOptColorFromDictWithStringFallback = GetOptColorFromDictWithStringFallback.INSTANCE;
        GetOptDictFromArray getOptDictFromArray = GetOptDictFromArray.INSTANCE;
        GetOptDictFromDict getOptDictFromDict = GetOptDictFromDict.INSTANCE;
        GetOptIntegerFromArray getOptIntegerFromArray = GetOptIntegerFromArray.INSTANCE;
        GetOptIntegerFromDict getOptIntegerFromDict = GetOptIntegerFromDict.INSTANCE;
        GetOptNumberFromArray getOptNumberFromArray = GetOptNumberFromArray.INSTANCE;
        GetOptNumberFromDict getOptNumberFromDict = GetOptNumberFromDict.INSTANCE;
        GetOptStringFromArray getOptStringFromArray = GetOptStringFromArray.INSTANCE;
        GetOptStringFromDict getOptStringFromDict = GetOptStringFromDict.INSTANCE;
        GetOptUrlFromArrayWithStringFallback getOptUrlFromArrayWithStringFallback = GetOptUrlFromArrayWithStringFallback.INSTANCE;
        GetOptUrlFromArrayWithUrlFallback getOptUrlFromArrayWithUrlFallback = GetOptUrlFromArrayWithUrlFallback.INSTANCE;
        GetOptUrlFromDictWithStringFallback getOptUrlFromDictWithStringFallback = GetOptUrlFromDictWithStringFallback.INSTANCE;
        GetOptUrlFromDictWithUrlFallback getOptUrlFromDictWithUrlFallback = GetOptUrlFromDictWithUrlFallback.INSTANCE;
        GetSeconds getSeconds = GetSeconds.INSTANCE;
        GetStoredArrayValue getStoredArrayValue = GetStoredArrayValue.INSTANCE;
        GetStoredBooleanValue getStoredBooleanValue = GetStoredBooleanValue.INSTANCE;
        GetStoredColorValue getStoredColorValue = GetStoredColorValue.INSTANCE;
        GetStoredColorValueString getStoredColorValueString = GetStoredColorValueString.INSTANCE;
        GetStoredDictValue getStoredDictValue = GetStoredDictValue.INSTANCE;
        GetStoredIntegerValue getStoredIntegerValue = GetStoredIntegerValue.INSTANCE;
        GetStoredNumberValue getStoredNumberValue = GetStoredNumberValue.INSTANCE;
        GetStoredStringValue getStoredStringValue = GetStoredStringValue.INSTANCE;
        GetStoredUrlValueWithStringFallback getStoredUrlValueWithStringFallback = GetStoredUrlValueWithStringFallback.INSTANCE;
        GetStoredUrlValueWithUrlFallback getStoredUrlValueWithUrlFallback = GetStoredUrlValueWithUrlFallback.INSTANCE;
        GetStringFromArray getStringFromArray = GetStringFromArray.INSTANCE;
        GetStringFromDict getStringFromDict = GetStringFromDict.INSTANCE;
        GetStringValue getStringValue = GetStringValue.INSTANCE;
        GetUrlFromArray getUrlFromArray = GetUrlFromArray.INSTANCE;
        GetUrlFromDict getUrlFromDict = GetUrlFromDict.INSTANCE;
        GetUrlValueWithStringFallback getUrlValueWithStringFallback = GetUrlValueWithStringFallback.INSTANCE;
        GetUrlValueWithUrlFallback getUrlValueWithUrlFallback = GetUrlValueWithUrlFallback.INSTANCE;
        GetYear getYear = GetYear.INSTANCE;
        IntegerAbs integerAbs = IntegerAbs.INSTANCE;
        IntegerCopySign integerCopySign = IntegerCopySign.INSTANCE;
        IntegerDecimalFormat integerDecimalFormat = IntegerDecimalFormat.INSTANCE;
        IntegerDiv integerDiv = IntegerDiv.INSTANCE;
        IntegerMax integerMax = IntegerMax.INSTANCE;
        IntegerMaxValue integerMaxValue = IntegerMaxValue.INSTANCE;
        IntegerMin integerMin = IntegerMin.INSTANCE;
        IntegerMinValue integerMinValue = IntegerMinValue.INSTANCE;
        IntegerMod integerMod = IntegerMod.INSTANCE;
        IntegerMul integerMul = IntegerMul.INSTANCE;
        IntegerSignum integerSignum = IntegerSignum.INSTANCE;
        IntegerSub integerSub = IntegerSub.INSTANCE;
        IntegerSum integerSum = IntegerSum.INSTANCE;
        IntegerToBoolean integerToBoolean = IntegerToBoolean.INSTANCE;
        IntegerToNumber integerToNumber = IntegerToNumber.INSTANCE;
        IntegerToString integerToString = IntegerToString.INSTANCE;
        LocalizedIntegerDecimalFormat localizedIntegerDecimalFormat = LocalizedIntegerDecimalFormat.INSTANCE;
        LocalizedNumberDecimalFormat localizedNumberDecimalFormat = LocalizedNumberDecimalFormat.INSTANCE;
        NowLocal nowLocal = NowLocal.INSTANCE;
        NumberDecimalFormat numberDecimalFormat = NumberDecimalFormat.INSTANCE;
        NumberToInteger numberToInteger = NumberToInteger.INSTANCE;
        NumberToString numberToString = NumberToString.INSTANCE;
        PadEndInteger padEndInteger = PadEndInteger.INSTANCE;
        PadEndString padEndString = PadEndString.INSTANCE;
        PadStartInteger padStartInteger = PadStartInteger.INSTANCE;
        PadStartString padStartString = PadStartString.INSTANCE;
        ParseUnixTime parseUnixTime = ParseUnixTime.INSTANCE;
        ParseUnixTimeAsLocal parseUnixTimeAsLocal = ParseUnixTimeAsLocal.INSTANCE;
        Pi pi = Pi.INSTANCE;
        RadiansToDegrees radiansToDegrees = RadiansToDegrees.INSTANCE;
        SetDay setDay = SetDay.INSTANCE;
        SetHours setHours = SetHours.INSTANCE;
        SetMillis setMillis = SetMillis.INSTANCE;
        SetMinutes setMinutes = SetMinutes.INSTANCE;
        SetMonth setMonth = SetMonth.INSTANCE;
        SetSeconds setSeconds = SetSeconds.INSTANCE;
        SetYear setYear = SetYear.INSTANCE;
        Sine sine = Sine.INSTANCE;
        StringContains stringContains = StringContains.INSTANCE;
        StringDecodeUri stringDecodeUri = StringDecodeUri.INSTANCE;
        StringEncodeUri stringEncodeUri = StringEncodeUri.INSTANCE;
        StringIndex stringIndex = StringIndex.INSTANCE;
        StringLastIndex stringLastIndex = StringLastIndex.INSTANCE;
        StringLength stringLength = StringLength.INSTANCE;
        StringReplaceAll stringReplaceAll = StringReplaceAll.INSTANCE;
        StringSubstring stringSubstring = StringSubstring.INSTANCE;
        StringToBoolean stringToBoolean = StringToBoolean.INSTANCE;
        StringToColor stringToColor = StringToColor.INSTANCE;
        StringToInteger stringToInteger = StringToInteger.INSTANCE;
        StringToNumber stringToNumber = StringToNumber.INSTANCE;
        StringToString stringToString = StringToString.INSTANCE;
        StringToUrl stringToUrl = StringToUrl.INSTANCE;
        Tan tan = Tan.INSTANCE;
        TestRegex testRegex = TestRegex.INSTANCE;
        ToLowerCase toLowerCase = ToLowerCase.INSTANCE;
        ToUpperCase toUpperCase = ToUpperCase.INSTANCE;
        Trim trim = Trim.INSTANCE;
        TrimLeft trimLeft = TrimLeft.INSTANCE;
        TrimRight trimRight = TrimRight.INSTANCE;
        UrlToString urlToString = UrlToString.INSTANCE;
    }
}
