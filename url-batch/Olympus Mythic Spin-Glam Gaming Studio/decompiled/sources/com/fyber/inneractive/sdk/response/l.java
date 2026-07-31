package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l extends b {
    public com.fyber.inneractive.sdk.response.nativead.j e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.a == null || (jVar = this.e) == null) {
            throw new Exception("Missing response ".concat(this.a == null ? "data" : "data native"));
        }
        if (r0Var == null) {
            jVar.i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.e.i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i a = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.e.S;
            kVar.M = a;
            if (kVar.d()) {
                a(this.e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
            if (e.getCause() != null) {
                this.e.i = e.getCause().getMessage();
            }
            this.e.j = e.getMessage();
            throw e;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e2) {
            if (e2.getCause() != null) {
                this.e.i = e2.getCause().getMessage();
            }
            this.e.j = e2.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            this.e.j = e3.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.e;
            jVar2.i = "ErrorInvalidNativeOrtbObject";
            jVar2.w = e3;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e3.getMessage());
            if (IAlog.a == 2) {
                e3.printStackTrace();
            }
            throw e3;
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e c = jVar.S.c();
        String str = c != null ? c.a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.a = new g();
            dVar.e = this.e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    public static com.fyber.inneractive.sdk.response.nativead.i a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("assets") && !jSONObject.isNull("assets")) {
                if (jSONObject.has("link") && !jSONObject.isNull("link")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("assets");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        boolean z = false;
                        boolean z2 = false;
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                com.fyber.inneractive.sdk.response.nativead.f fVar = new com.fyber.inneractive.sdk.response.nativead.f();
                                fVar.a = optJSONObject.optInt("id");
                                optJSONObject.optInt("required");
                                fVar.f = com.fyber.inneractive.sdk.response.nativead.parser.c.a(optJSONObject.optJSONObject("link"));
                                if (optJSONObject.has("title")) {
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("title");
                                    com.fyber.inneractive.sdk.response.nativead.d dVar = new com.fyber.inneractive.sdk.response.nativead.d();
                                    if (optJSONObject2 != null) {
                                        dVar.a = v.a(optJSONObject2, "text");
                                        optJSONObject2.optInt("len");
                                    }
                                    fVar.b = dVar;
                                } else if (optJSONObject.has("video")) {
                                    if (!z) {
                                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("video");
                                        com.fyber.inneractive.sdk.response.nativead.e eVar = new com.fyber.inneractive.sdk.response.nativead.e();
                                        if (optJSONObject3 != null) {
                                            eVar.a = v.a(optJSONObject3, POBNativeConstants.NATIVE_VAST_AD_TAG);
                                        }
                                        fVar.c = eVar;
                                        z = !TextUtils.isEmpty(eVar.a);
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("img")) {
                                    int i2 = fVar.a;
                                    boolean z3 = i2 == 2;
                                    if ((!z3 || !z) && (z3 || !z2)) {
                                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("img");
                                        com.fyber.inneractive.sdk.response.nativead.c cVar = new com.fyber.inneractive.sdk.response.nativead.c();
                                        if (optJSONObject4 != null) {
                                            optJSONObject4.optInt("width");
                                            optJSONObject4.optInt("height");
                                            cVar.a = v.a(optJSONObject4, "url");
                                        }
                                        if (i2 == 2) {
                                            z = !TextUtils.isEmpty(cVar.a);
                                        } else if (i2 == 4) {
                                            z2 = !TextUtils.isEmpty(cVar.a);
                                        }
                                        fVar.d = cVar;
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("data")) {
                                    JSONObject optJSONObject5 = optJSONObject.optJSONObject("data");
                                    com.fyber.inneractive.sdk.response.nativead.b bVar = new com.fyber.inneractive.sdk.response.nativead.b();
                                    if (optJSONObject5 != null) {
                                        bVar.a = v.a(optJSONObject5, "value");
                                    }
                                    fVar.e = bVar;
                                }
                                if (fVar != null) {
                                    arrayList.add(fVar);
                                }
                            }
                        }
                        if (!z) {
                            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing valid main asset (video/image)", "ErrorNoMainAsset");
                        }
                    }
                    com.fyber.inneractive.sdk.response.nativead.h a = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObject.optJSONObject("link"));
                    if (!TextUtils.isEmpty(a.a)) {
                        String a2 = v.a(jSONObject, "jstracker");
                        v.a(jSONObject, "privacy");
                        ArrayList a3 = com.fyber.inneractive.sdk.response.nativead.parser.b.a(jSONObject.optJSONArray("imptrackers"));
                        ArrayList a4 = com.fyber.inneractive.sdk.response.nativead.parser.a.a(jSONObject.optJSONArray("eventtrackers"));
                        com.fyber.inneractive.sdk.response.nativead.i iVar = new com.fyber.inneractive.sdk.response.nativead.i();
                        iVar.a = arrayList;
                        iVar.b = a;
                        iVar.d = a2;
                        iVar.c = a3;
                        iVar.e = a4;
                        return iVar;
                    }
                    throw new com.fyber.inneractive.sdk.response.nativead.a("Missing url in main link object", "ErrorNoMainLink");
                }
                throw new com.fyber.inneractive.sdk.response.nativead.a("Missing main link object", "ErrorNoMainLink");
            }
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing assets", "ErrorNoAssets");
        }
        throw new com.fyber.inneractive.sdk.response.nativead.a("Empty native body", "ErrorNoNativeBody");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.a = jVar;
        this.e = jVar;
        return jVar;
    }
}
