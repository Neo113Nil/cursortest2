package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5768w7 implements Converter {
    public final C5690t7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5768w7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C5742v7 c5742v7) {
        ContentValues contentValues = new ContentValues();
        Long l = c5742v7.a;
        if (l != null) {
            contentValues.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, Long.valueOf(l.longValue()));
        }
        EnumC5600pl enumC5600pl = c5742v7.b;
        if (enumC5600pl != null) {
            contentValues.put("session_type", Integer.valueOf(enumC5600pl.a));
        }
        Long l2 = c5742v7.c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        EnumC5798xb enumC5798xb = c5742v7.d;
        if (enumC5798xb != null) {
            contentValues.put("type", Integer.valueOf(enumC5798xb.a));
        }
        Long l3 = c5742v7.e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c5742v7.f;
        if (l4 != null) {
            contentValues.put("time", Long.valueOf(l4.longValue()));
        }
        C5690t7 c5690t7 = this.a;
        contentValues.put("event_description", MessageNano.toByteArray(c5690t7.a.fromModel(c5742v7.g)));
        return contentValues;
    }

    public C5768w7(@NotNull C5690t7 c5690t7) {
        this.a = c5690t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5768w7(C5690t7 c5690t7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5690t7(null, 1, 0 == true ? 1 : 0) : c5690t7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5742v7 toModel(@NotNull ContentValues contentValues) {
        EnumC5600pl enumC5600pl;
        Long asLong = contentValues.getAsLong(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC5600pl = EnumC5600pl.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC5600pl = EnumC5600pl.BACKGROUND;
            }
        } else {
            enumC5600pl = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C5742v7(asLong, enumC5600pl, asLong2, asInteger2 != null ? EnumC5798xb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
