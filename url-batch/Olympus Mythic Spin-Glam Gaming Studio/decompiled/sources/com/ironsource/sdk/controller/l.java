package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4822p8;
import com.ironsource.InterfaceC4871s4;
import com.ironsource.InterfaceC4889t4;
import com.ironsource.InterfaceC4907u4;
import com.ironsource.Nb;
import com.ironsource.T4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface l {

    public interface a {
        void a(@NotNull f.a aVar);
    }

    public interface b {
        void a(@NotNull Nb nb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(T4 t4);

    void a(T4 t4, Map<String, String> map, InterfaceC4871s4 interfaceC4871s4);

    void a(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4);

    void a(f.c cVar, @Nullable a aVar);

    void a(String str, InterfaceC4889t4 interfaceC4889t4);

    void a(String str, String str2, T4 t4, InterfaceC4871s4 interfaceC4871s4);

    void a(String str, String str2, T4 t4, InterfaceC4889t4 interfaceC4889t4);

    void a(String str, String str2, T4 t4, InterfaceC4907u4 interfaceC4907u4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4871s4 interfaceC4871s4);

    void a(JSONObject jSONObject, InterfaceC4889t4 interfaceC4889t4);

    void a(JSONObject jSONObject, InterfaceC4907u4 interfaceC4907u4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(T4 t4);

    void b(T4 t4, Map<String, String> map, InterfaceC4889t4 interfaceC4889t4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4822p8.c h();
}
