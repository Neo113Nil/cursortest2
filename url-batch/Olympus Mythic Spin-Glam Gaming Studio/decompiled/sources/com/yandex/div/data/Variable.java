package com.yandex.div.data;

import android.net.Uri;
import androidx.annotation.MainThread;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.StrVariable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Variable.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t*+,-./012B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\r\u001a\u00020\u0001H\u0016J\b\u0010\u000e\u001a\u00020\u0001H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0000H\u0014J\u001c\u0010\u0011\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0017J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0000H\u0017J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0001H\u0017J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0004H\u0012J\u001c\u0010\u001b\u001a\u00020\u001c*\u00020\u0004H\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u001f\u001a\u00020 *\u00020\u0004H\u0012J\f\u0010!\u001a\u00020\"*\u00020\u0004H\u0012J\f\u0010#\u001a\u00020$*\u00020\u0004H\u0012J\f\u0010%\u001a\u00020\u0018*\u00020\u0004H\u0012J\f\u0010&\u001a\u00020'*\u00020\u0004H\u0012J\f\u0010(\u001a\u00020)*\u00020\u0004H\u0012R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t0\bX\u0092\u0004¢\u0006\u0002\n\u0000\u0082\u0001\t3456789:;\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/yandex/div/data/Variable;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "observers", "Lcom/yandex/div/core/ObserverList;", "Lkotlin/Function1;", "", "addObserver", "observer", "getDefaultValue", "getValue", "notifyVariableChanged", "v", "removeObserver", "set", "newValue", "setValue", "from", "setValueDirectly", "writeToJSON", "Lorg/json/JSONObject;", "parseAsBoolean", "", "parseAsColor", "Lcom/yandex/div/evaluable/types/Color;", "parseAsColor-C4zCDoM", "(Ljava/lang/String;)I", "parseAsDouble", "", "parseAsInt", "", "parseAsJsonArray", "Lorg/json/JSONArray;", "parseAsJsonObject", "parseAsLong", "", "parseAsUri", "Landroid/net/Uri;", "ArrayVariable", "BooleanVariable", "ColorVariable", "DictVariable", "DoubleVariable", "IntegerVariable", "PropertyVariable", "StringVariable", "UrlVariable", "Lcom/yandex/div/data/Variable$ArrayVariable;", "Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable$DictVariable;", "Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable$PropertyVariable;", "Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable$UrlVariable;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Variable {

    @NotNull
    private final ObserverList<Function1> observers;

    public /* synthetic */ Variable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    private Variable() {
        this.observers = new ObserverList<>();
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultValue", "()Ljava/lang/String;", "getName", "value", "getValue$div_data_release", "setValue$div_data_release", "(Ljava/lang/String;)V", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class StringVariable extends Variable {

        @NotNull
        private final String defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private String value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public StringVariable(@NotNull String str, @NotNull String str2) {
            super(null);
            this.name = str;
            this.defaultValue = str2;
            this.value = getDefaultValue();
        }

        @NotNull
        /* renamed from: getValue$div_data_release, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull String str) {
            if (Intrinsics.areEqual(this.value, str)) {
                return;
            }
            this.value = str;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;J)V", "getDefaultValue", "()J", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(J)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class IntegerVariable extends Variable {
        private final long defaultValue;

        @NotNull
        private final String name;
        private long value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        public IntegerVariable(@NotNull String str, long j) {
            super(null);
            this.name = str;
            this.defaultValue = j;
            this.value = getDefaultValue();
        }

        /* renamed from: getValue$div_data_release, reason: from getter */
        public long getValue() {
            return this.value;
        }

        public void setValue$div_data_release(long j) {
            if (this.value == j) {
                return;
            }
            this.value = j;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(long newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;Z)V", "getDefaultValue", "()Z", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Z)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;

        @NotNull
        private final String name;
        private boolean value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        public BooleanVariable(@NotNull String str, boolean z) {
            super(null);
            this.name = str;
            this.defaultValue = z;
            this.value = getDefaultValue();
        }

        /* renamed from: getValue$div_data_release, reason: from getter */
        public boolean getValue() {
            return this.value;
        }

        public void setValue$div_data_release(boolean z) {
            if (this.value == z) {
                return;
            }
            this.value = z;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(boolean newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;D)V", "getDefaultValue", "()D", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(D)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class DoubleVariable extends Variable {
        private final double defaultValue;

        @NotNull
        private final String name;
        private double value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        public DoubleVariable(@NotNull String str, double d) {
            super(null);
            this.name = str;
            this.defaultValue = d;
            this.value = getDefaultValue();
        }

        /* renamed from: getValue$div_data_release, reason: from getter */
        public double getValue() {
            return this.value;
        }

        public void setValue$div_data_release(double d) {
            if (this.value == d) {
                return;
            }
            this.value = d;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(double newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR/\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@PX\u0090\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "", "(Ljava/lang/String;I)V", "getDefaultValue", "()I", "getName", "()Ljava/lang/String;", "value", "Lcom/yandex/div/evaluable/types/Color;", "getValue-WpymAT4$div_data_release", "setValue-cIhhviA$div_data_release", "(I)V", "I", "set", "", "newValue", "set-cIhhviA", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ColorVariable extends Variable {
        private final int defaultValue;

        @NotNull
        private final String name;
        private int value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        public ColorVariable(@NotNull String str, int i) {
            super(null);
            this.name = str;
            this.defaultValue = i;
            this.value = Color.m7325constructorimpl(getDefaultValue());
        }

        /* renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name and from getter */
        public int getValue() {
            return this.value;
        }

        /* renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m7267setValuecIhhviA$div_data_release(int i) {
            if (Color.m7327equalsimpl0(this.value, i)) {
                return;
            }
            this.value = i;
            notifyVariableChanged(this);
        }

        @MainThread
        /* renamed from: set-cIhhviA, reason: not valid java name */
        public void m7266setcIhhviA(int newValue) throws VariableMutationException {
            Integer num = (Integer) ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m7324boximpl(newValue));
            if (num == null) {
                throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m7331toStringimpl(newValue)) + '\'', null, 2, null);
            }
            m7267setValuecIhhviA$div_data_release(Color.m7325constructorimpl(num.intValue()));
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$UrlVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Landroid/net/Uri;", "(Ljava/lang/String;Landroid/net/Uri;)V", "getDefaultValue", "()Landroid/net/Uri;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Landroid/net/Uri;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class UrlVariable extends Variable {

        @NotNull
        private final Uri defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private Uri value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        public UrlVariable(@NotNull String str, @NotNull Uri uri) {
            super(null);
            this.name = str;
            this.defaultValue = uri;
            this.value = getDefaultValue();
        }

        @NotNull
        /* renamed from: getValue$div_data_release, reason: from getter */
        public Uri getValue() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull Uri uri) {
            if (Intrinsics.areEqual(this.value, uri)) {
                return;
            }
            this.value = uri;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(@NotNull Uri newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$DictVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getDefaultValue", "()Lorg/json/JSONObject;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Lorg/json/JSONObject;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class DictVariable extends Variable {

        @NotNull
        private final JSONObject defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONObject value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        public DictVariable(@NotNull String str, @NotNull JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.defaultValue = jSONObject;
            this.value = getDefaultValue();
        }

        @NotNull
        /* renamed from: getValue$div_data_release, reason: from getter */
        public JSONObject getValue() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull JSONObject jSONObject) {
            if (Intrinsics.areEqual(this.value, jSONObject)) {
                return;
            }
            this.value = jSONObject;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(@NotNull JSONObject newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@PX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/data/Variable$ArrayVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "defaultValue", "Lorg/json/JSONArray;", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "getDefaultValue", "()Lorg/json/JSONArray;", "getName", "()Ljava/lang/String;", "value", "getValue$div_data_release", "setValue$div_data_release", "(Lorg/json/JSONArray;)V", "set", "", "newValue", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ArrayVariable extends Variable {

        @NotNull
        private final JSONArray defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONArray value;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        public ArrayVariable(@NotNull String str, @NotNull JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.defaultValue = jSONArray;
            this.value = getDefaultValue();
        }

        @NotNull
        /* renamed from: getValue$div_data_release, reason: from getter */
        public JSONArray getValue() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull JSONArray jSONArray) {
            if (Intrinsics.areEqual(this.value, jSONArray)) {
                return;
            }
            this.value = jSONArray;
            notifyVariableChanged(this);
        }

        @MainThread
        public void set(@NotNull JSONArray newValue) {
            setValue$div_data_release(newValue);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/data/Variable$PropertyVariable;", "Lcom/yandex/div/data/Variable;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class PropertyVariable extends Variable {

        @NotNull
        private final String name;

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public PropertyVariable(@NotNull String str) {
            super(null);
            this.name = str;
        }
    }

    @NotNull
    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue());
        }
        if (this instanceof ColorVariable) {
            return Color.m7324boximpl(((ColorVariable) this).getValue());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue();
        }
        if (!(this instanceof PropertyVariable)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }

    @NotNull
    public Object getDefaultValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getDefaultValue();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getDefaultValue());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getDefaultValue());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getDefaultValue());
        }
        if (this instanceof ColorVariable) {
            return Integer.valueOf(((ColorVariable) this).getDefaultValue());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getDefaultValue();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getDefaultValue();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getDefaultValue();
        }
        if (!(this instanceof PropertyVariable)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }

    public void addObserver(@NotNull Function1 observer) {
        this.observers.addObserver(observer);
    }

    public void removeObserver(@NotNull Function1 observer) {
        this.observers.removeObserver(observer);
    }

    protected void notifyVariableChanged(@NotNull Variable v) {
        Assert.assertMainThread();
        Iterator<Function1> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(v);
        }
    }

    @MainThread
    public void set(@NotNull String newValue) throws VariableMutationException {
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(newValue);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(newValue));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(newValue));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(newValue));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m7267setValuecIhhviA$div_data_release(m7264parseAsColorC4zCDoM(newValue));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(newValue));
            return;
        }
        if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(newValue));
            return;
        }
        if (this instanceof ArrayVariable) {
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(newValue));
        } else {
            if (!(this instanceof PropertyVariable)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new NotImplementedError("An operation is not implemented: Support property variables");
        }
    }

    @MainThread
    public void setValue(@NotNull Variable from) throws VariableMutationException {
        if ((this instanceof StringVariable) && (from instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) from).getValue());
            return;
        }
        if ((this instanceof IntegerVariable) && (from instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) from).getValue());
            return;
        }
        if ((this instanceof BooleanVariable) && (from instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) from).getValue());
            return;
        }
        if ((this instanceof DoubleVariable) && (from instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) from).getValue());
            return;
        }
        if ((this instanceof ColorVariable) && (from instanceof ColorVariable)) {
            ((ColorVariable) this).m7267setValuecIhhviA$div_data_release(((ColorVariable) from).getValue());
            return;
        }
        if ((this instanceof UrlVariable) && (from instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) from).getValue());
            return;
        }
        if ((this instanceof DictVariable) && (from instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) from).getValue());
            return;
        }
        if ((this instanceof ArrayVariable) && (from instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) from).getValue());
            return;
        }
        if ((this instanceof PropertyVariable) && (from instanceof PropertyVariable)) {
            throw new NotImplementedError("An operation is not implemented: Support property variables");
        }
        throw new VariableMutationException("Setting value to " + this + " from " + from + " not supported!", null, 2, null);
    }

    @InternalApi
    @MainThread
    public void setValueDirectly(@NotNull Object newValue) throws VariableMutationException {
        try {
            if (this instanceof StringVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.String");
                ((StringVariable) this).setValue$div_data_release((String) newValue);
                return;
            }
            if (this instanceof IntegerVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Number");
                ((IntegerVariable) this).setValue$div_data_release(((Number) newValue).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Boolean");
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) newValue).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type kotlin.Number");
                ((DoubleVariable) this).setValue$div_data_release(((Number) newValue).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
                ((ColorVariable) this).m7267setValuecIhhviA$div_data_release(((Color) newValue).m7332unboximpl());
                return;
            }
            if (this instanceof UrlVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type android.net.Uri");
                ((UrlVariable) this).setValue$div_data_release((Uri) newValue);
                return;
            }
            if (this instanceof DictVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type org.json.JSONObject");
                ((DictVariable) this).setValue$div_data_release((JSONObject) newValue);
            } else if (this instanceof ArrayVariable) {
                Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type org.json.JSONArray");
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) newValue);
            } else {
                if (!(this instanceof PropertyVariable)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError("An operation is not implemented: Support property variables");
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + newValue.getClass() + " to " + this, null, 2, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private boolean parseAsBoolean(String str) {
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str);
        if (booleanStrictOrNull != null || (booleanStrictOrNull = ConvertUtilsKt.toBoolean(parseAsInt(str))) != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new VariableMutationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m7264parseAsColorC4zCDoM(String str) {
        Integer num = (Integer) ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (num == null) {
            throw new VariableMutationException("Wrong value format for color variable: '" + str + '\'', null, 2, null);
        }
        return Color.m7325constructorimpl(num.intValue());
    }

    private Uri parseAsUri(String str) {
        try {
            return Uri.parse(str);
        } catch (IllegalArgumentException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    @NotNull
    public JSONObject writeToJSON() {
        JSONSerializable urlVariable;
        if (this instanceof ArrayVariable) {
            urlVariable = new com.yandex.div2.ArrayVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((ArrayVariable) this).getValue(), null, 2, null));
        } else if (this instanceof BooleanVariable) {
            urlVariable = new BoolVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Boolean.valueOf(((BooleanVariable) this).getValue()), null, 2, null));
        } else if (this instanceof ColorVariable) {
            urlVariable = new com.yandex.div2.ColorVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Integer.valueOf(((ColorVariable) this).getValue()), null, 2, null));
        } else if (this instanceof DictVariable) {
            urlVariable = new com.yandex.div2.DictVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((DictVariable) this).getValue(), null, 2, null));
        } else if (this instanceof DoubleVariable) {
            urlVariable = new NumberVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Double.valueOf(((DoubleVariable) this).getValue()), null, 2, null));
        } else if (this instanceof IntegerVariable) {
            urlVariable = new com.yandex.div2.IntegerVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, Long.valueOf(((IntegerVariable) this).getValue()), null, 2, null));
        } else if (this instanceof StringVariable) {
            urlVariable = new StrVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((StringVariable) this).getValue(), null, 2, null));
        } else {
            if (!(this instanceof UrlVariable)) {
                if (!(this instanceof PropertyVariable)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError("An operation is not implemented: Support property variables");
            }
            urlVariable = new com.yandex.div2.UrlVariable(getName(), Expression.Companion.constant$default(Expression.INSTANCE, ((UrlVariable) this).getValue(), null, 2, null));
        }
        return urlVariable.writeToJSON();
    }
}
