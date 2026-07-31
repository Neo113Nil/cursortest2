package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes12.dex */
public final class Io {
    public static final Io a = new Io();
    public static final Cb b = new Cb();
    public static final Bo c;

    static {
        Context context = AbstractC4002fj.a;
        c = context != null ? new Bo(context, a()) : null;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getWebAssetCache();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:3|(17:5|6|(1:(6:(1:(14:11|12|13|14|15|(3:36|37|(7:(2:42|43)|44|45|46|47|48|49))|17|(1:19)|20|21|22|23|24|25)(2:69|70))(9:71|72|73|74|75|(5:82|83|84|85|86)(1:77)|78|(11:81|15|(0)|17|(0)|20|21|22|23|24|25)|80)|66|29|(1:31)|24|25)(4:105|106|107|108))(2:131|(2:199|(2:201|202)(1:203))(10:135|136|137|(1:139)(1:194)|(2:141|(1:143)(5:144|(10:166|167|168|169|170|172|173|174|175|176)(1:146)|147|148|(4:(2:151|152)|153|154|155)(6:156|157|158|159|(1:161)|80)))|193|(0)(0)|147|148|(0)(0)))|109|110|111|112|113|114|115|116|(2:118|80)|75|(0)(0)|78|(0)|80))|204|6|(0)(0)|109|110|111|112|113|114|115|116|(0)|75|(0)(0)|78|(0)|80|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02fa, code lost:
    
        r4 = "ResourceCacheMiss";
        r3 = "networkType";
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f6, code lost:
    
        r4 = "ResourceCacheMiss";
        r3 = "networkType";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0302, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0303, code lost:
    
        r4 = "ResourceCacheMiss";
        r3 = "networkType";
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ef, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f1, code lost:
    
        r8 = r17;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e9, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02eb, code lost:
    
        r8 = r17;
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018b A[Catch: TimeoutCancellationException -> 0x0173, Exception -> 0x02fd, TRY_LEAVE, TryCatch #23 {Exception -> 0x02fd, blocks: (B:110:0x01aa, B:176:0x0126, B:148:0x0153, B:151:0x015b, B:152:0x016c, B:153:0x0175, B:154:0x0186, B:156:0x018b, B:157:0x0193, B:158:0x019b, B:159:0x01a0), top: B:175:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02b4 A[Catch: Exception -> 0x02ac, TimeoutCancellationException -> 0x02ae, TryCatch #29 {TimeoutCancellationException -> 0x02ae, Exception -> 0x02ac, blocks: (B:48:0x0289, B:19:0x02b4, B:20:0x02d7), top: B:15:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0226 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, InterfaceC4466x9 interfaceC4466x9, ContinuationImpl continuationImpl) {
        Fo fo;
        Object obj;
        Object coroutine_suspended;
        int i;
        Map linkedHashMap;
        long currentTimeMillis;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        String str6;
        Object obj3;
        String str7;
        String sb;
        C4493y9 c4493y9;
        InputStream a2;
        String str8;
        String str9;
        String str10;
        InterfaceC3892bf interfaceC3892bf;
        Cb cb;
        InterfaceC3892bf interfaceC3892bf2;
        String str11;
        String str12;
        long j;
        InterfaceC4466x9 interfaceC4466x92;
        InterfaceC4466x9 interfaceC4466x93;
        InterfaceC4466x9 interfaceC4466x94 = interfaceC4466x9;
        if (continuationImpl instanceof Fo) {
            Fo fo2 = (Fo) continuationImpl;
            int i2 = fo2.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo2.i = i2 - Integer.MIN_VALUE;
                fo = fo2;
                obj = fo.g;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fo.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Bo bo = c;
                    if (bo == null || bo.a == null) {
                        if (interfaceC4466x94 == null) {
                            return null;
                        }
                        ((C4493y9) interfaceC4466x94).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + bo + " for URL: " + str);
                        return null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("url", str);
                    currentTimeMillis = System.currentTimeMillis();
                    try {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                        String mimeTypeFromExtension = N3.a(fileExtensionFromUrl) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
                        try {
                            if (mimeTypeFromExtension != null) {
                                if (mimeTypeFromExtension.length() != 0) {
                                    str6 = mimeTypeFromExtension;
                                    if (interfaceC4466x94 == null) {
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            try {
                                                try {
                                                    sb2.append("mimeType is ");
                                                    sb2.append(str6);
                                                    sb2.append(" for ");
                                                    sb2.append(str);
                                                    sb = sb2.toString();
                                                    try {
                                                        c4493y9 = (C4493y9) interfaceC4466x94;
                                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                        str7 = "WebResourceHandler";
                                                    } catch (TimeoutCancellationException e) {
                                                        e = e;
                                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                        str7 = "WebResourceHandler";
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                    str7 = "WebResourceHandler";
                                                }
                                            } catch (TimeoutCancellationException e3) {
                                                e = e3;
                                                obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                str7 = "WebResourceHandler";
                                            }
                                            try {
                                                try {
                                                    c4493y9.a(str7, sb);
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str2 = "ResourceCacheMiss";
                                                    str3 = "networkType";
                                                    str4 = str7;
                                                    obj2 = obj3;
                                                    linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                                                    str11 = str3;
                                                    if (interfaceC4466x94 != null) {
                                                    }
                                                    linkedHashMap.put(str11, F5.o());
                                                    linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                    C4425vk c4425vk = C4425vk.a;
                                                    C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                                    return null;
                                                }
                                            } catch (TimeoutCancellationException e5) {
                                                e = e5;
                                                str2 = "ResourceCacheMiss";
                                                str3 = "networkType";
                                                str4 = str7;
                                                obj2 = obj3;
                                                str5 = str;
                                                linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                                                str11 = str3;
                                                if (interfaceC4466x94 != null) {
                                                }
                                                linkedHashMap.put(str11, F5.o());
                                                linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                C4425vk c4425vk2 = C4425vk.a;
                                                C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                                return null;
                                            }
                                        } catch (TimeoutCancellationException e6) {
                                            e = e6;
                                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                            str7 = "WebResourceHandler";
                                        } catch (Exception e7) {
                                            e = e7;
                                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                            str7 = "WebResourceHandler";
                                        }
                                    } else {
                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str7 = "WebResourceHandler";
                                    }
                                    a2 = bo.a(str, interfaceC4466x94);
                                    if (a2 == null) {
                                        if (interfaceC4466x94 != null) {
                                            ((C4493y9) interfaceC4466x94).a(str7, "Found in cache: " + str);
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap2.put("url", str);
                                        C4425vk c4425vk3 = C4425vk.a;
                                        C4425vk.b("ResourceCacheHit", linkedHashMap2, EnumC4530zk.a);
                                        return N3.a(a2, str6);
                                    }
                                    Cb cb2 = b;
                                    Go go = new Go(str, interfaceC4466x94, null);
                                    fo.a = str;
                                    fo.b = interfaceC4466x94;
                                    fo.c = linkedHashMap;
                                    fo.d = str6;
                                    fo.f = currentTimeMillis;
                                    fo.i = 1;
                                    obj = cb2.a(str, go, fo);
                                    if (obj != coroutine_suspended) {
                                        str5 = str;
                                        str8 = str6;
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            a2 = bo.a(str, interfaceC4466x94);
                            if (a2 == null) {
                            }
                        } catch (TimeoutCancellationException e8) {
                            e = e8;
                            str2 = "ResourceCacheMiss";
                            str3 = "networkType";
                            str4 = str7;
                            obj2 = obj3;
                            str5 = str;
                            linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                            str11 = str3;
                            if (interfaceC4466x94 != null) {
                            }
                            linkedHashMap.put(str11, F5.o());
                            linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C4425vk c4425vk22 = C4425vk.a;
                            C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                            return null;
                        }
                        str6 = POBCommonConstants.CONTENT_TYPE_HTML;
                        if (interfaceC4466x94 == null) {
                        }
                    } catch (TimeoutCancellationException e9) {
                        e = e9;
                        str2 = "ResourceCacheMiss";
                        str3 = "networkType";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str4 = "WebResourceHandler";
                    } catch (Exception e10) {
                        e = e10;
                        str2 = "ResourceCacheMiss";
                        str3 = "networkType";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str4 = "WebResourceHandler";
                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                        str11 = str3;
                        if (interfaceC4466x94 != null) {
                        }
                        linkedHashMap.put(str11, F5.o());
                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C4425vk c4425vk222 = C4425vk.a;
                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                        return null;
                    }
                } else if (i == 1) {
                    j = fo.f;
                    str8 = fo.d;
                    linkedHashMap = fo.c;
                    interfaceC4466x92 = fo.b;
                    str5 = fo.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str7 = "WebResourceHandler";
                        currentTimeMillis = j;
                        interfaceC4466x94 = interfaceC4466x92;
                    } catch (TimeoutCancellationException e11) {
                        e = e11;
                    } catch (Exception e12) {
                        e = e12;
                        interfaceC4466x93 = interfaceC4466x92;
                        str2 = "ResourceCacheMiss";
                        str3 = "networkType";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str4 = "WebResourceHandler";
                        currentTimeMillis = j;
                        interfaceC4466x94 = interfaceC4466x93;
                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                        str11 = str3;
                        if (interfaceC4466x94 != null) {
                        }
                        linkedHashMap.put(str11, F5.o());
                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C4425vk c4425vk2222 = C4425vk.a;
                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                        return null;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = fo.f;
                        interfaceC3892bf2 = fo.e;
                        str8 = fo.d;
                        linkedHashMap = fo.c;
                        interfaceC4466x92 = fo.b;
                        String str13 = fo.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str5 = str13;
                            str2 = "ResourceCacheMiss";
                            str10 = "networkType";
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            str4 = "WebResourceHandler";
                            currentTimeMillis = j;
                            interfaceC4466x94 = interfaceC4466x92;
                            str12 = str13;
                            try {
                                if (interfaceC3892bf2 != null) {
                                    try {
                                        if (Fl.a(interfaceC3892bf2) && interfaceC3892bf2.d().string(Charsets.UTF_8).length() > 0) {
                                            if (interfaceC4466x94 != null) {
                                                ((C4493y9) interfaceC4466x94).c(str4, "onSuccessfulResponse: " + str5);
                                            }
                                            linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                            linkedHashMap.put("size", Boxing.boxLong(interfaceC3892bf2.b().c / 1024));
                                            linkedHashMap.put(str10, F5.o());
                                            C4425vk c4425vk4 = C4425vk.a;
                                            C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                            IntRange intRange = AbstractC4026gf.a;
                                            Intrinsics.checkNotNullParameter(interfaceC3892bf2, "<this>");
                                            return N3.a(new ByteArrayInputStream(interfaceC3892bf2.d().toByteArray()), str8);
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str3 = str10;
                                        obj2 = obj3;
                                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                                        str11 = str3;
                                        if (interfaceC4466x94 != null) {
                                        }
                                        linkedHashMap.put(str11, F5.o());
                                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                        C4425vk c4425vk22222 = C4425vk.a;
                                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                        return null;
                                    }
                                }
                                str3 = str10;
                                if (interfaceC4466x94 != null) {
                                    ((C4493y9) interfaceC4466x94).b(str4, "onFailedResponse: " + str5 + " " + interfaceC3892bf2);
                                }
                                obj2 = obj3;
                            } catch (TimeoutCancellationException e14) {
                                e = e14;
                                str3 = str12;
                                obj2 = obj3;
                                linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                                str11 = str3;
                                if (interfaceC4466x94 != null) {
                                }
                                linkedHashMap.put(str11, F5.o());
                                linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C4425vk c4425vk222222 = C4425vk.a;
                                C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                return null;
                            } catch (Exception e15) {
                                e = e15;
                                str3 = str12;
                                obj2 = obj3;
                                linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                                str11 = str3;
                                if (interfaceC4466x94 != null) {
                                }
                                linkedHashMap.put(str11, F5.o());
                                linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C4425vk c4425vk2222222 = C4425vk.a;
                                C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                return null;
                            }
                        } catch (TimeoutCancellationException e16) {
                            e = e16;
                            str5 = str13;
                        } catch (Exception e17) {
                            e = e17;
                            str2 = "ResourceCacheMiss";
                            str3 = "networkType";
                            obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                            str4 = "WebResourceHandler";
                            currentTimeMillis = j;
                            interfaceC4466x94 = interfaceC4466x92;
                            linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                            str11 = str3;
                            if (interfaceC4466x94 != null) {
                            }
                            linkedHashMap.put(str11, F5.o());
                            linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C4425vk c4425vk22222222 = C4425vk.a;
                            C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                            return null;
                        }
                        try {
                            linkedHashMap.put(obj2, Boxing.boxShort((short) 2194));
                            str11 = str3;
                        } catch (TimeoutCancellationException e18) {
                            e = e18;
                        } catch (Exception e19) {
                            e = e19;
                            linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                            str11 = str3;
                            if (interfaceC4466x94 != null) {
                            }
                            linkedHashMap.put(str11, F5.o());
                            linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C4425vk c4425vk222222222 = C4425vk.a;
                            C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                            return null;
                        }
                        linkedHashMap.put(str11, F5.o());
                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C4425vk c4425vk2222222222 = C4425vk.a;
                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                        return null;
                    }
                    j = fo.f;
                    str8 = fo.d;
                    Map map = fo.c;
                    interfaceC4466x93 = fo.b;
                    String str14 = fo.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str2 = "ResourceCacheMiss";
                        str10 = "networkType";
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str9 = "WebResourceHandler";
                        currentTimeMillis = j;
                        interfaceC4466x94 = interfaceC4466x93;
                        str5 = str14;
                        linkedHashMap = map;
                        interfaceC3892bf = (InterfaceC3892bf) obj;
                        if (interfaceC4466x94 != null) {
                            try {
                                str4 = str9;
                                try {
                                    try {
                                        ((C4493y9) interfaceC4466x94).c(str4, "Response received for url: " + str5);
                                    } catch (TimeoutCancellationException e20) {
                                        e = e20;
                                        str3 = str10;
                                        obj2 = obj3;
                                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                                        str11 = str3;
                                        if (interfaceC4466x94 != null) {
                                        }
                                        linkedHashMap.put(str11, F5.o());
                                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                        C4425vk c4425vk22222222222 = C4425vk.a;
                                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                        return null;
                                    }
                                } catch (Exception e21) {
                                    e = e21;
                                    str3 = str10;
                                    obj2 = obj3;
                                    linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                                    str11 = str3;
                                    if (interfaceC4466x94 != null) {
                                        ((C4493y9) interfaceC4466x94).a(str4, "Unhandled exception occurred: " + e.getMessage(), e);
                                        str11 = str3;
                                    }
                                    linkedHashMap.put(str11, F5.o());
                                    linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                    C4425vk c4425vk222222222222 = C4425vk.a;
                                    C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                    return null;
                                }
                            } catch (TimeoutCancellationException e22) {
                                e = e22;
                                str4 = str9;
                                str3 = str10;
                                obj2 = obj3;
                                linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                                str11 = str3;
                                if (interfaceC4466x94 != null) {
                                }
                                linkedHashMap.put(str11, F5.o());
                                linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C4425vk c4425vk2222222222222 = C4425vk.a;
                                C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                return null;
                            } catch (Exception e23) {
                                e = e23;
                                str4 = str9;
                                str3 = str10;
                                obj2 = obj3;
                                linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                                str11 = str3;
                                if (interfaceC4466x94 != null) {
                                }
                                linkedHashMap.put(str11, F5.o());
                                linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C4425vk c4425vk22222222222222 = C4425vk.a;
                                C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                                return null;
                            }
                        } else {
                            str4 = str9;
                        }
                        cb = b;
                        fo.a = str5;
                        fo.b = interfaceC4466x94;
                        fo.c = linkedHashMap;
                        fo.d = str8;
                        fo.e = interfaceC3892bf;
                        fo.f = currentTimeMillis;
                        fo.i = 3;
                    } catch (TimeoutCancellationException e24) {
                        e = e24;
                        str5 = str14;
                        linkedHashMap = map;
                        interfaceC4466x92 = interfaceC4466x93;
                    } catch (Exception e25) {
                        e = e25;
                        linkedHashMap = map;
                        str2 = "ResourceCacheMiss";
                        str3 = "networkType";
                        obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str4 = "WebResourceHandler";
                        currentTimeMillis = j;
                        interfaceC4466x94 = interfaceC4466x93;
                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2195));
                        str11 = str3;
                        if (interfaceC4466x94 != null) {
                        }
                        linkedHashMap.put(str11, F5.o());
                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C4425vk c4425vk222222222222222 = C4425vk.a;
                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                        return null;
                    }
                    if (cb.a(str5, fo) != coroutine_suspended) {
                        interfaceC3892bf2 = interfaceC3892bf;
                        str12 = fo;
                        if (interfaceC3892bf2 != null) {
                        }
                        str3 = str10;
                        if (interfaceC4466x94 != null) {
                        }
                        obj2 = obj3;
                        linkedHashMap.put(obj2, Boxing.boxShort((short) 2194));
                        str11 = str3;
                        linkedHashMap.put(str11, F5.o());
                        linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C4425vk c4425vk2222222222222222 = C4425vk.a;
                        C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                        return null;
                    }
                    return coroutine_suspended;
                    str2 = "ResourceCacheMiss";
                    str3 = "networkType";
                    obj2 = IronSourceConstants.EVENTS_ERROR_CODE;
                    str4 = "WebResourceHandler";
                    currentTimeMillis = j;
                    interfaceC4466x94 = interfaceC4466x92;
                    linkedHashMap.put(obj2, Boxing.boxShort((short) 2193));
                    str11 = str3;
                    if (interfaceC4466x94 != null) {
                        ((C4493y9) interfaceC4466x94).a(str4, "Timeout occurred for url: " + str5, e);
                        str11 = str3;
                    }
                    linkedHashMap.put(str11, F5.o());
                    linkedHashMap.put("latency", Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                    C4425vk c4425vk22222222222222222 = C4425vk.a;
                    C4425vk.b(str2, linkedHashMap, EnumC4530zk.a);
                    return null;
                }
                str9 = str7;
                str2 = "ResourceCacheMiss";
                str10 = "networkType";
                long max = Math.max(1, a().getMaxRetries()) * a().getTimeout();
                Ho ho = new Ho(interfaceC4466x94, str5, (Deferred) obj, null);
                fo.a = str5;
                fo.b = interfaceC4466x94;
                fo.c = linkedHashMap;
                fo.d = str8;
                fo.f = currentTimeMillis;
                fo.i = 2;
                obj = TimeoutKt.withTimeout(max, ho, fo);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC3892bf = (InterfaceC3892bf) obj;
                if (interfaceC4466x94 != null) {
                }
                cb = b;
                fo.a = str5;
                fo.b = interfaceC4466x94;
                fo.c = linkedHashMap;
                fo.d = str8;
                fo.e = interfaceC3892bf;
                fo.f = currentTimeMillis;
                fo.i = 3;
                if (cb.a(str5, fo) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        fo = new Fo(this, continuationImpl);
        obj = fo.g;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fo.i;
        if (i != 0) {
        }
        str9 = str7;
        str2 = "ResourceCacheMiss";
        str10 = "networkType";
        long max2 = Math.max(1, a().getMaxRetries()) * a().getTimeout();
        Ho ho2 = new Ho(interfaceC4466x94, str5, (Deferred) obj, null);
        fo.a = str5;
        fo.b = interfaceC4466x94;
        fo.c = linkedHashMap;
        fo.d = str8;
        fo.f = currentTimeMillis;
        fo.i = 2;
        obj = TimeoutKt.withTimeout(max2, ho2, fo);
        if (obj == coroutine_suspended) {
        }
        interfaceC3892bf = (InterfaceC3892bf) obj;
        if (interfaceC4466x94 != null) {
        }
        cb = b;
        fo.a = str5;
        fo.b = interfaceC4466x94;
        fo.c = linkedHashMap;
        fo.d = str8;
        fo.e = interfaceC3892bf;
        fo.f = currentTimeMillis;
        fo.i = 3;
        if (cb.a(str5, fo) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static Deferred a(String str, InterfaceC4466x9 interfaceC4466x9) {
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("WebResourceHandler", "downloadResourceFile(): " + str);
        }
        return ((F9) Ve.d.getValue()).a(new Xe(str, null, new Ok(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new Vi(500L, a().getMaxRetries()), false, 42));
    }
}
