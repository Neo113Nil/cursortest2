package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class K7 implements Converter {
    public final H7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public K7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull J7 j7) {
        ContentValues contentValues = new ContentValues();
        Long l = j7.a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC5600pl enumC5600pl = j7.b;
        if (enumC5600pl != null) {
            contentValues.put("type", Integer.valueOf(enumC5600pl.a));
        }
        String str = j7.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        H7 h7 = this.a;
        contentValues.put("session_description", MessageNano.toByteArray(h7.a.fromModel(j7.d)));
        return contentValues;
    }

    public K7(@NotNull H7 h7) {
        this.a = h7;
    }

    public /* synthetic */ K7(H7 h7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new H7(null, 1, null) : h7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J7 toModel(@NotNull ContentValues contentValues) {
        EnumC5600pl enumC5600pl;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC5600pl = EnumC5600pl.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC5600pl = EnumC5600pl.BACKGROUND;
            }
        } else {
            enumC5600pl = null;
        }
        return new J7(asLong, enumC5600pl, contentValues.getAsString("report_request_parameters"), this.a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
