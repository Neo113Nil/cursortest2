package com.ogury.ad.internal;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class oe {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pf a(JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        String str2;
        JSONObject optJSONObject4;
        String string;
        JSONObject optJSONObject5;
        JSONArray optJSONArray;
        Object obj;
        Object obj2;
        String string2;
        String string3;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("response");
        if (optJSONObject6 == null) {
            return new pf();
        }
        pf pfVar = new pf();
        JSONObject optJSONObject7 = optJSONObject6.optJSONObject("global");
        if (optJSONObject7 != null) {
            Intrinsics.checkNotNull(optJSONObject7);
            ef efVar = pfVar.b;
            Integer b = pe.b("request_timeout", optJSONObject7);
            if (b != null) {
                efVar.a = b.intValue();
            }
            Integer b2 = pe.b("children_request_permissions_filter", optJSONObject7);
            if (b2 != null) {
                efVar.b = b2.intValue();
            }
        }
        JSONObject optJSONObject8 = optJSONObject6.optJSONObject("config_pull");
        if (optJSONObject8 != null) {
            Intrinsics.checkNotNull(optJSONObject8);
            bf bfVar = pfVar.c;
            Integer b3 = pe.b("limit_per_day", optJSONObject8);
            if (b3 != null) {
                bfVar.a = b3.intValue();
            }
        }
        JSONObject optJSONObject9 = optJSONObject6.optJSONObject("ad_serving");
        if (optJSONObject9 != null) {
            Intrinsics.checkNotNull(optJSONObject9);
            te teVar = pfVar.d;
            Boolean a = pe.a("enabled", optJSONObject9);
            if (a != null) {
                teVar.a = a.booleanValue();
            }
            String str3 = "";
            if (!teVar.a) {
                Intrinsics.checkNotNullParameter(optJSONObject9, "<this>");
                Intrinsics.checkNotNullParameter("disabling_reason", "name");
                if (optJSONObject9.has("disabling_reason")) {
                    try {
                        string3 = optJSONObject9.getString("disabling_reason");
                    } catch (Exception unused) {
                    }
                    if (string3 != null) {
                        str3 = string3;
                    }
                }
                string3 = null;
                if (string3 != null) {
                }
            }
            Intrinsics.checkNotNullParameter(str3, "<set-?>");
            teVar.c = str3;
            Integer b4 = pe.b("bid_token_mode", optJSONObject9);
            if (b4 != null) {
                teVar.d = b4.intValue();
            }
            Integer b5 = pe.b("request_permissions", optJSONObject9);
            if (b5 != null) {
                teVar.b = b5.intValue();
            }
            Long c = pe.c("ad_expiration_time", optJSONObject9);
            if (c != null) {
                teVar.e = c.longValue();
            }
            JSONObject optJSONObject10 = optJSONObject9.optJSONObject(X3.i.K);
            if (optJSONObject10 != null) {
                of ofVar = teVar.f;
                Boolean a2 = pe.a("back_button_enabled", optJSONObject10);
                if (a2 != null) {
                    ofVar.a = a2.booleanValue();
                }
                Boolean a3 = pe.a("close_ad_when_leaving_app", optJSONObject10);
                if (a3 != null) {
                    ofVar.b = a3.booleanValue();
                }
                Long c2 = pe.c("webview_load_timeout", optJSONObject10);
                if (c2 != null) {
                    ofVar.c = c2.longValue();
                }
                Long c3 = pe.c("show_close_button_delay", optJSONObject10);
                if (c3 != null) {
                    ofVar.d = c3.longValue();
                }
            }
            JSONObject optJSONObject11 = optJSONObject9.optJSONObject("thumbnail");
            if (optJSONObject11 != null) {
                jf jfVar = teVar.g;
                JSONObject optJSONObject12 = optJSONObject11.optJSONObject("default");
                if (optJSONObject12 != null) {
                    df dfVar = jfVar.a;
                    Integer b6 = pe.b("gravity", optJSONObject12);
                    if (b6 != null) {
                        dfVar.a = b6.intValue();
                    }
                    Integer b7 = pe.b("x_margin", optJSONObject12);
                    if (b7 != null) {
                        dfVar.b = b7.intValue();
                    }
                    Integer b8 = pe.b("y_margin", optJSONObject12);
                    if (b8 != null) {
                        dfVar.c = b8.intValue();
                    }
                    Integer b9 = pe.b("max_width", optJSONObject12);
                    if (b9 != null) {
                        dfVar.d = b9.intValue();
                    }
                    Integer b10 = pe.b("max_height", optJSONObject12);
                    if (b10 != null) {
                        dfVar.e = b10.intValue();
                    }
                }
                JSONObject optJSONObject13 = optJSONObject11.optJSONObject("view");
                if (optJSONObject13 != null) {
                    kf kfVar = jfVar.c;
                    str = "name";
                    Boolean a4 = pe.a("multiactivity_enabled", optJSONObject13);
                    if (a4 != null) {
                        kfVar.f = a4.booleanValue();
                    }
                    Boolean a5 = pe.a("default_whitelist_enabled", optJSONObject13);
                    if (a5 != null) {
                        kfVar.a = a5.booleanValue();
                    }
                    Boolean a6 = pe.a("publisher_whitelist_enabled", optJSONObject13);
                    if (a6 != null) {
                        kfVar.b = a6.booleanValue();
                    }
                    Boolean a7 = pe.a("publisher_blacklist_enabled", optJSONObject13);
                    if (a7 != null) {
                        kfVar.c = a7.booleanValue();
                    }
                    JSONArray optJSONArray2 = optJSONObject13.optJSONArray("whitelist");
                    if (optJSONArray2 != null) {
                        List a8 = m4.a(optJSONArray2);
                        kfVar.getClass();
                        Intrinsics.checkNotNullParameter(a8, "<set-?>");
                        kfVar.d = a8;
                    }
                    JSONArray optJSONArray3 = optJSONObject13.optJSONArray("blacklist");
                    if (optJSONArray3 != null) {
                        List a9 = m4.a(optJSONArray3);
                        kfVar.getClass();
                        Intrinsics.checkNotNullParameter(a9, "<set-?>");
                        kfVar.e = a9;
                    }
                } else {
                    str = "name";
                }
                JSONObject optJSONObject14 = optJSONObject11.optJSONObject("view_fragment");
                if (optJSONObject14 != null) {
                    lf lfVar = jfVar.b;
                    Boolean a10 = pe.a("fragment_filter_enabled", optJSONObject14);
                    if (a10 != null) {
                        lfVar.f = a10.booleanValue();
                    }
                    Boolean a11 = pe.a("default_whitelist_enabled", optJSONObject14);
                    if (a11 != null) {
                        lfVar.a = a11.booleanValue();
                    }
                    Boolean a12 = pe.a("publisher_whitelist_enabled", optJSONObject14);
                    if (a12 != null) {
                        lfVar.b = a12.booleanValue();
                    }
                    Boolean a13 = pe.a("publisher_blacklist_enabled", optJSONObject14);
                    if (a13 != null) {
                        lfVar.c = a13.booleanValue();
                    }
                    JSONArray optJSONArray4 = optJSONObject14.optJSONArray("whitelist");
                    if (optJSONArray4 != null) {
                        List a14 = m4.a(optJSONArray4);
                        lfVar.getClass();
                        Intrinsics.checkNotNullParameter(a14, "<set-?>");
                        lfVar.d = a14;
                    }
                    JSONArray optJSONArray5 = optJSONObject14.optJSONArray("blacklist");
                    if (optJSONArray5 != null) {
                        List a15 = m4.a(optJSONArray5);
                        lfVar.getClass();
                        Intrinsics.checkNotNullParameter(a15, "<set-?>");
                        lfVar.e = a15;
                    }
                }
                optJSONObject = optJSONObject6.optJSONObject("monitoring");
                if (optJSONObject != null) {
                    Intrinsics.checkNotNull(optJSONObject);
                    ff ffVar = pfVar.e;
                    Integer b11 = pe.b("request_permissions", optJSONObject);
                    if (b11 != null) {
                        ffVar.a = b11.intValue();
                    }
                    JSONObject optJSONObject15 = optJSONObject.optJSONObject("tracks");
                    if (optJSONObject15 != null) {
                        mf mfVar = ffVar.b;
                        Boolean a16 = pe.a("enabled", optJSONObject15);
                        if (a16 != null) {
                            mfVar.a = a16.booleanValue();
                        }
                    }
                    JSONObject optJSONObject16 = optJSONObject.optJSONObject("precaching_logs");
                    if (optJSONObject16 != null) {
                        hf hfVar = ffVar.c;
                        Boolean a17 = pe.a("enabled", optJSONObject16);
                        if (a17 != null) {
                            hfVar.a = a17.booleanValue();
                        }
                    }
                    JSONObject optJSONObject17 = optJSONObject.optJSONObject("ad_life_cycle");
                    if (optJSONObject17 != null) {
                        re reVar = ffVar.d;
                        Boolean a18 = pe.a("enabled", optJSONObject17);
                        if (a18 != null) {
                            reVar.a = a18.booleanValue();
                        }
                        JSONArray optJSONArray6 = optJSONObject17.optJSONArray("blacklist");
                        if (optJSONArray6 != null) {
                            List a19 = m4.a(optJSONArray6);
                            reVar.getClass();
                            Intrinsics.checkNotNullParameter(a19, "<set-?>");
                            reVar.b = a19;
                        }
                    }
                }
                optJSONObject2 = optJSONObject6.optJSONObject(CampaignEx.KEY_OMID);
                if (optJSONObject2 != null) {
                    Intrinsics.checkNotNull(optJSONObject2);
                    gf gfVar = pfVar.f;
                    Boolean a20 = pe.a("enabled", optJSONObject2);
                    if (a20 != null) {
                        gfVar.a = a20.booleanValue();
                    }
                }
                optJSONObject3 = optJSONObject6.optJSONObject("crash_report");
                if (optJSONObject3 == null) {
                    Intrinsics.checkNotNull(optJSONObject3);
                    cf cfVar = pfVar.g;
                    Intrinsics.checkNotNullParameter(optJSONObject3, "<this>");
                    str2 = str;
                    Intrinsics.checkNotNullParameter("url", str2);
                    if (optJSONObject3.has("url")) {
                        try {
                            string2 = optJSONObject3.getString("url");
                        } catch (Exception unused2) {
                        }
                        if (string2 != null) {
                            cfVar.getClass();
                            Intrinsics.checkNotNullParameter(string2, "<set-?>");
                            cfVar.a = string2;
                        }
                    }
                    string2 = null;
                    if (string2 != null) {
                    }
                } else {
                    str2 = str;
                }
                optJSONObject4 = optJSONObject6.optJSONObject("ad_quality");
                if (optJSONObject4 != null) {
                    Intrinsics.checkNotNull(optJSONObject4);
                    se seVar = pfVar.h;
                    JSONObject optJSONObject18 = optJSONObject4.optJSONObject("blank_ad_detection");
                    if (optJSONObject18 != null) {
                        af afVar = seVar.a;
                        Boolean a21 = pe.a("enabled", optJSONObject18);
                        if (a21 != null) {
                            afVar.a = a21.booleanValue();
                        }
                        JSONArray optJSONArray7 = optJSONObject18.optJSONArray("algo");
                        if (optJSONArray7 != null) {
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray7.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject19 = optJSONArray7.optJSONObject(i);
                                if (optJSONObject19 != null) {
                                    we weVar = new we();
                                    Intrinsics.checkNotNullParameter(optJSONObject19, "<this>");
                                    Intrinsics.checkNotNullParameter(str2, str2);
                                    if (optJSONObject19.has(str2)) {
                                        try {
                                            string = optJSONObject19.getString(str2);
                                        } catch (Exception unused3) {
                                        }
                                        if (string != null) {
                                            ye.b.getClass();
                                            Iterator<E> it = ye.f.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    obj2 = null;
                                                    break;
                                                }
                                                obj2 = it.next();
                                                if (Intrinsics.areEqual(((ye) obj2).a, string)) {
                                                    break;
                                                }
                                            }
                                            ye yeVar = (ye) obj2;
                                            if (yeVar == null) {
                                                yeVar = ye.d;
                                            }
                                            Intrinsics.checkNotNullParameter(yeVar, "<set-?>");
                                            weVar.a = yeVar;
                                        }
                                        optJSONObject5 = optJSONObject19.optJSONObject("params");
                                        if (optJSONObject5 != null) {
                                            Intrinsics.checkNotNull(optJSONObject5);
                                            ze zeVar = new ze();
                                            Integer b12 = pe.b("height", optJSONObject5);
                                            if (b12 != null) {
                                                zeVar.a = b12.intValue();
                                            }
                                            Integer b13 = pe.b("width", optJSONObject5);
                                            if (b13 != null) {
                                                zeVar.b = b13.intValue();
                                            }
                                            Long c4 = pe.c("start_after_ms", optJSONObject5);
                                            if (c4 != null) {
                                                zeVar.c = c4.longValue();
                                            }
                                            Integer b14 = pe.b("threshold", optJSONObject5);
                                            if (b14 != null) {
                                                zeVar.d = b14.intValue();
                                            }
                                            Intrinsics.checkNotNullParameter(zeVar, "<set-?>");
                                            weVar.b = zeVar;
                                        }
                                        optJSONArray = optJSONObject19.optJSONArray("ad_unit_types");
                                        if (optJSONArray != null) {
                                            Intrinsics.checkNotNull(optJSONArray);
                                            List a22 = m4.a(optJSONArray);
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a22, 10));
                                            ArrayList arrayList3 = (ArrayList) a22;
                                            int size = arrayList3.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj3 = arrayList3.get(i2);
                                                i2++;
                                                String str4 = (String) obj3;
                                                ve.b.getClass();
                                                Iterator<E> it2 = ve.j.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    obj = it2.next();
                                                    if (Intrinsics.areEqual(((ve) obj).a, str4)) {
                                                        break;
                                                    }
                                                }
                                                ve veVar = (ve) obj;
                                                if (veVar == null) {
                                                    veVar = ve.h;
                                                }
                                                arrayList2.add(veVar);
                                            }
                                            Intrinsics.checkNotNullParameter(arrayList2, "<set-?>");
                                            weVar.c = arrayList2;
                                        }
                                        arrayList.add(weVar);
                                    }
                                    string = null;
                                    if (string != null) {
                                    }
                                    optJSONObject5 = optJSONObject19.optJSONObject("params");
                                    if (optJSONObject5 != null) {
                                    }
                                    optJSONArray = optJSONObject19.optJSONArray("ad_unit_types");
                                    if (optJSONArray != null) {
                                    }
                                    arrayList.add(weVar);
                                }
                            }
                            afVar.getClass();
                            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                            afVar.b = arrayList;
                        }
                    }
                }
                pfVar.a = true;
                return pfVar;
            }
        }
        str = "name";
        optJSONObject = optJSONObject6.optJSONObject("monitoring");
        if (optJSONObject != null) {
        }
        optJSONObject2 = optJSONObject6.optJSONObject(CampaignEx.KEY_OMID);
        if (optJSONObject2 != null) {
        }
        optJSONObject3 = optJSONObject6.optJSONObject("crash_report");
        if (optJSONObject3 == null) {
        }
        optJSONObject4 = optJSONObject6.optJSONObject("ad_quality");
        if (optJSONObject4 != null) {
        }
        pfVar.a = true;
        return pfVar;
    }
}
