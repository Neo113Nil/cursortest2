package io.bidmachine.rendering.internal.event;

import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.SystemComponent;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
public interface f {
    void a();

    void a(PrivacySheetParams privacySheetParams);

    void a(SystemComponent systemComponent);

    void a(String str);

    void a(String str, long j);

    void a(String str, long j, long j2, float f);

    void a(String str, ClickAreaFactory clickAreaFactory);

    void a(String str, EventType eventType, String str2, List list, String str3, Function1 function1);

    void a(String str, Integer num);

    void a(String str, String str2);

    void a(String str, boolean z);

    void b();

    void b(String str);

    void b(String str, Integer num);

    void b(String str, String str2);

    void c();

    void c(String str);

    void c(String str, Integer num);

    void c(String str, String str2);

    void d();

    void d(String str);

    void d(String str, Integer num);
}
