package io.bidmachine.rendering.internal.event;

import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.PrivacySheetParamsParser;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.UtilsKt;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class a implements d {
    public static final C1797a c = new C1797a(null);
    private final f a;
    private final String b;

    /* renamed from: io.bidmachine.rendering.internal.event.a$a, reason: collision with other inner class name */
    public static final class C1797a {
        public /* synthetic */ C1797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1797a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventTaskType.values().length];
            try {
                iArr[EventTaskType.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventTaskType.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventTaskType.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventTaskType.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventTaskType.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventTaskType.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EventTaskType.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EventTaskType.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EventTaskType.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EventTaskType.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EventTaskType.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EventTaskType.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EventTaskType.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EventTaskType.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EventTaskType.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EventTaskType.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EventTaskType.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EventTaskType.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EventTaskType.Expand.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EventTaskType.Collapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EventTaskType.RequestPermission.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EventTaskType.ReportClick.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(f eventTaskExecutor, String sourceName) {
        Intrinsics.checkNotNullParameter(eventTaskExecutor, "eventTaskExecutor");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.a = eventTaskExecutor;
        this.b = sourceName;
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object obj, Object... objArr) {
        try {
            switch (b.$EnumSwitchMapping$0[eventTaskType.ordinal()]) {
                case 1:
                    c(eventType, eventTaskType, obj);
                    break;
                case 2:
                    b(eventType, eventTaskType, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 3:
                    a(eventType, eventTaskType, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 4:
                    e(eventType, eventTaskType);
                    break;
                case 5:
                    a(eventType, eventTaskType);
                    break;
                case 6:
                    c(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 7:
                    f(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 8:
                    b(eventType, eventTaskType, str);
                    break;
                case 9:
                    e(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 10:
                    a(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 11:
                    d(eventType, eventTaskType, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 12:
                    a(eventType, eventTaskType, str, obj);
                    break;
                case 13:
                    c(eventType, eventTaskType, str, obj);
                    break;
                case 14:
                    a(eventType, eventTaskType, str, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 15:
                    c(eventType, eventTaskType, str);
                    break;
                case 16:
                    b(eventType, eventTaskType, str, obj);
                    break;
                case 17:
                    a(eventType, eventTaskType, obj);
                    break;
                case 18:
                    b(eventType, eventTaskType, obj);
                    break;
                case 19:
                    c(eventType, eventTaskType);
                    break;
                case 20:
                    b(eventType, eventTaskType);
                    break;
                case 21:
                    a("RequestPermission task must not be executed with other tasks! Check integration!");
                    break;
                case 22:
                    a(eventType, eventTaskType, Arrays.copyOf(objArr, objArr.length));
                    break;
            }
        } catch (Throwable th) {
            k.b(th);
        }
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null || StringsKt.isBlank(obj2)) {
            a(eventType, eventTaskType, "track url");
        } else {
            b(eventType, eventTaskType, "%s", obj2);
            this.a.d(obj2);
        }
    }

    private final void d(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        if (objArr.length < 2) {
            a(eventType, eventTaskType, "progress parameters");
            return;
        }
        Long longOrDefault$default = UtilsKt.toLongOrDefault$default(objArr[0], null, 1, null);
        long longValue = longOrDefault$default != null ? longOrDefault$default.longValue() : Long.MIN_VALUE;
        Long longOrDefault$default2 = UtilsKt.toLongOrDefault$default(objArr[1], null, 1, null);
        long longValue2 = longOrDefault$default2 != null ? longOrDefault$default2.longValue() : Long.MIN_VALUE;
        if (longValue < 1 || longValue2 < 0) {
            a(eventType, eventTaskType, "maxProgressMs, currentProgressMs");
        } else {
            this.a.a(str, longValue, longValue2, (longValue2 * 100.0f) / longValue);
        }
    }

    private final void e(EventType eventType, EventTaskType eventTaskType) {
        d(eventType, eventTaskType);
        this.a.d();
    }

    private final void f(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        b(eventType, eventTaskType, "target - %s", str);
        f fVar = this.a;
        Object firstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.d(str, firstOrNull != null ? UtilsKt.toIntOrDefault$default(firstOrNull, null, 1, null) : null);
    }

    @Override // io.bidmachine.rendering.internal.event.d
    public void a(EventType eventType, EventTaskParams eventTaskParams, Object... params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTaskParams, "eventTaskParams");
        Intrinsics.checkNotNullParameter(params, "params");
        b(eventType, eventTaskParams.getEventTaskType(), eventTaskParams.getTarget(), eventTaskParams.getValue(), Arrays.copyOf(params, params.length));
    }

    private final void e(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        b(eventType, eventTaskType, "target - %s", str);
        f fVar = this.a;
        Object firstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.b(str, firstOrNull != null ? UtilsKt.toIntOrDefault$default(firstOrNull, null, 1, null) : null);
    }

    @Override // io.bidmachine.rendering.internal.event.d
    public void a(EventTaskParams requestPermissionEventTaskParams, EventType eventType, String str, List eventTaskParamsList, Function1 callback) {
        Intrinsics.checkNotNullParameter(requestPermissionEventTaskParams, "requestPermissionEventTaskParams");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        EventTaskType eventTaskType = EventTaskType.RequestPermission;
        Object value = requestPermissionEventTaskParams.getValue();
        String obj = value != null ? value.toString() : null;
        if (obj != null && !StringsKt.isBlank(obj)) {
            b(eventType, eventTaskType, "%s", obj);
            this.a.a(this.b, eventType, str, eventTaskParamsList, obj, callback);
        } else {
            a(eventType, eventTaskType, "request permission url");
            callback.invoke(null);
        }
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        b(eventType, eventTaskType, "target - %s", str);
        f fVar = this.a;
        Object firstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.c(str, firstOrNull != null ? UtilsKt.toIntOrDefault$default(firstOrNull, null, 1, null) : null);
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, String str, Object obj) {
        String obj2;
        if (obj == null || (obj2 = obj.toString()) == null) {
            return;
        }
        b(eventType, eventTaskType, "target - %s, value - %s", str, obj2);
        this.a.a(str, obj2);
    }

    private final void c(EventType eventType, EventTaskType eventTaskType, String str) {
        b(eventType, eventTaskType, "target - %s", str);
        this.a.c(str);
    }

    private final void c(EventType eventType, EventTaskType eventTaskType) {
        d(eventType, eventTaskType);
        this.a.c();
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, Object obj, Object... objArr) {
        String a = a(obj, Arrays.copyOf(objArr, objArr.length));
        if (a != null && !StringsKt.isBlank(a)) {
            b(eventType, eventTaskType, "%s", a);
            this.a.b(this.b, a);
        } else {
            a(eventType, eventTaskType, "notify open url");
        }
    }

    private final void d(EventType eventType, EventTaskType eventTaskType) {
        b(eventType, eventTaskType, (String) null, new Object[0]);
    }

    private final void a(EventType eventType, EventTaskType eventTaskType) {
        d(eventType, eventTaskType);
        this.a.a();
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        b(eventType, eventTaskType, "target - %s", str);
        f fVar = this.a;
        Object firstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.a(str, firstOrNull != null ? UtilsKt.toIntOrDefault$default(firstOrNull, null, 1, null) : null);
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object obj) {
        Long longOrDefault$default;
        long longValue = (obj == null || (longOrDefault$default = UtilsKt.toLongOrDefault$default(obj, null, 1, null)) == null) ? Long.MIN_VALUE : longOrDefault$default.longValue();
        if (longValue < 0) {
            a(eventType, eventTaskType, "schedule time");
        } else {
            b(eventType, eventTaskType, "target - %s, timeMs - %s", str, Long.valueOf(longValue));
            this.a.a(str, longValue);
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str, Object obj, Object... objArr) {
        Boolean booleanOrDefault$default = UtilsKt.toBooleanOrDefault$default(obj, null, 1, null);
        if (booleanOrDefault$default == null && objArr.length != 0) {
            booleanOrDefault$default = UtilsKt.toBooleanOrDefault$default(objArr[0], null, 1, null);
        }
        if (booleanOrDefault$default == null) {
            a(eventType, eventTaskType, "visibility value");
        } else {
            b(eventType, eventTaskType, "target - %s, lockVisibility - %s", str, booleanOrDefault$default);
            this.a.a(str, booleanOrDefault$default.booleanValue());
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 != null && !StringsKt.isBlank(obj2)) {
            PrivacySheetParams parseJson = PrivacySheetParamsParser.parseJson(obj2);
            if (parseJson == null) {
                a(eventType, eventTaskType, "value");
                return;
            } else {
                b(eventType, eventTaskType, "%s", obj2);
                this.a.a(parseJson);
                return;
            }
        }
        a(eventType, eventTaskType, "value");
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, Object... objArr) {
        Object firstOrNull = ArraysKt.firstOrNull(objArr);
        SystemComponent systemComponent = firstOrNull instanceof SystemComponent ? (SystemComponent) firstOrNull : null;
        b(eventType, eventTaskType, "component name - %s", systemComponent);
        this.a.a(systemComponent);
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, Object obj, Object... objArr) {
        String a = a(obj, Arrays.copyOf(objArr, objArr.length));
        if (a != null && !StringsKt.isBlank(a)) {
            b(eventType, eventTaskType, "%s", a);
            this.a.c(this.b, a);
        } else {
            a(eventType, eventTaskType, "open url");
        }
    }

    private final void a(EventType eventType, EventTaskType eventTaskType, String str) {
        if (k.a()) {
            a("Could not find required params (" + str + ") for execute task (" + eventType + ", " + eventTaskType + ')');
        }
    }

    private final void a(String str) {
        if (k.a()) {
            k.a("Event", str, new Object[0]);
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str) {
        b(eventType, eventTaskType, "target - %s", str);
        this.a.b(str);
    }

    private final String a(Object obj, Object... objArr) {
        String obj2 = obj != null ? obj.toString() : null;
        if ((obj2 != null && obj2.length() != 0) || objArr.length == 0) {
            return obj2;
        }
        Object obj3 = objArr[0];
        if (obj3 != null) {
            return obj3.toString();
        }
        return null;
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object obj) {
        b(eventType, eventTaskType, "target - %s", str);
        this.a.a(str, new ClickAreaFactory(obj != null ? obj.toString() : null));
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 != null && !StringsKt.isBlank(obj2)) {
            b(eventType, eventTaskType, "%s", obj2);
            this.a.a(obj2);
        } else {
            a(eventType, eventTaskType, "state groups value");
        }
    }

    private final void b(EventType eventType, EventTaskType eventTaskType) {
        d(eventType, eventTaskType);
        this.a.b();
    }

    private final void b(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        if (k.a()) {
            if (str == null) {
                b("Event - " + eventType.getKey() + " (source - " + this.b + "), Task - " + eventTaskType.getKey());
                return;
            }
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                b("Event - " + eventType.getKey() + " (source - " + this.b + "), Task - " + eventTaskType.getKey() + " (" + format + ')');
            } catch (Throwable th) {
                k.b(th);
            }
        }
    }

    private final void b(String str) {
        if (k.a()) {
            k.b("Event", str, new Object[0]);
        }
    }
}
