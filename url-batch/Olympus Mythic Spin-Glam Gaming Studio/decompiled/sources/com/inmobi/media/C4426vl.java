package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.appset.AppSetIdInfo;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4426vl extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4426vl(Context context, Continuation continuation) {
        super(2, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4426vl(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4426vl(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0051, code lost:
    
        if (com.inmobi.media.C4425vk.b(r18) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0048, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Context context;
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Intrinsics.checkNotNullExpressionValue("xl", "access$getTAG$p(...)");
            if (C4479xl.b) {
                Intrinsics.checkNotNullExpressionValue("xl", "access$getTAG$p(...)");
                return Unit.INSTANCE;
            }
            C4277q4 c4277q4 = AbstractC4015g4.a;
            this.a = 1;
            Object b = AbstractC4015g4.a.b(this);
            if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                b = Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Yk.a();
                AppSetIdInfo appSetIdInfo = F1.a;
                String str2 = F8.a;
                F5 f5 = F5.a;
                f5.getClass();
                F5.h();
                F5.q();
                ((Boolean) F5.q.getValue()).getClass();
                ((Number) F5.f.getValue(f5, F5.b[0])).intValue();
                int i3 = AbstractC4132kh.a;
                Context context2 = AbstractC4002fj.a;
                if (i3 != Integer.MIN_VALUE) {
                    AbstractC4132kh.a = i3;
                    if (context2 != null) {
                        ConcurrentHashMap concurrentHashMap = Qa.b;
                        Pa.a(context2, "user_info_store").a("user_age", i3, false);
                    }
                }
                String str3 = AbstractC4132kh.c;
                Context context3 = AbstractC4002fj.a;
                if (str3 != null) {
                    AbstractC4132kh.c = str3;
                    if (context3 != null) {
                        ConcurrentHashMap concurrentHashMap2 = Qa.b;
                        Pa.a(context3, "user_info_store").a("user_age_group", str3, false);
                    }
                }
                String str4 = AbstractC4132kh.d;
                Context context4 = AbstractC4002fj.a;
                AbstractC4132kh.d = str4;
                if (context4 != null && str4 != null) {
                    ConcurrentHashMap concurrentHashMap3 = Qa.b;
                    Pa.a(context4, "user_info_store").a("user_area_code", str4, false);
                }
                String str5 = AbstractC4132kh.e;
                Context context5 = AbstractC4002fj.a;
                if (str5 != null) {
                    AbstractC4132kh.e = str5;
                    if (context5 != null) {
                        ConcurrentHashMap concurrentHashMap4 = Qa.b;
                        Pa.a(context5, "user_info_store").a("user_post_code", str5, false);
                    }
                }
                String str6 = AbstractC4132kh.f;
                Context context6 = AbstractC4002fj.a;
                if (str6 != null) {
                    AbstractC4132kh.f = str6;
                    if (context6 != null) {
                        ConcurrentHashMap concurrentHashMap5 = Qa.b;
                        Pa.a(context6, "user_info_store").a("user_city_code", str6, false);
                    }
                }
                String str7 = AbstractC4132kh.g;
                Context context7 = AbstractC4002fj.a;
                if (str7 != null) {
                    AbstractC4132kh.g = str7;
                    if (context7 != null) {
                        ConcurrentHashMap concurrentHashMap6 = Qa.b;
                        Pa.a(context7, "user_info_store").a("user_state_code", str7, false);
                    }
                }
                String str8 = AbstractC4132kh.h;
                Context context8 = AbstractC4002fj.a;
                if (str8 != null) {
                    AbstractC4132kh.h = str8;
                    if (context8 != null) {
                        ConcurrentHashMap concurrentHashMap7 = Qa.b;
                        Pa.a(context8, "user_info_store").a("user_country_code", str8, false);
                    }
                }
                int i4 = AbstractC4132kh.i;
                Context context9 = AbstractC4002fj.a;
                if (i4 != Integer.MIN_VALUE) {
                    AbstractC4132kh.i = i4;
                    if (context9 != null) {
                        ConcurrentHashMap concurrentHashMap8 = Qa.b;
                        Pa.a(context9, "user_info_store").a("user_yob", i4, false);
                    }
                }
                String str9 = AbstractC4132kh.j;
                Context context10 = AbstractC4002fj.a;
                if (str9 != null) {
                    AbstractC4132kh.j = str9;
                    if (context10 != null) {
                        ConcurrentHashMap concurrentHashMap9 = Qa.b;
                        Pa.a(context10, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, str9, false);
                    }
                }
                String str10 = AbstractC4132kh.k;
                Context context11 = AbstractC4002fj.a;
                if (str10 != null) {
                    AbstractC4132kh.k = str10;
                    if (context11 != null) {
                        ConcurrentHashMap concurrentHashMap10 = Qa.b;
                        Pa.a(context11, "user_info_store").a("user_education", str10, false);
                    }
                }
                String str11 = AbstractC4132kh.l;
                Context context12 = AbstractC4002fj.a;
                if (str11 != null) {
                    AbstractC4132kh.l = str11;
                    if (context12 != null) {
                        ConcurrentHashMap concurrentHashMap11 = Qa.b;
                        Pa.a(context12, "user_info_store").a("user_language", str11, false);
                    }
                }
                String str12 = AbstractC4132kh.m;
                Context context13 = AbstractC4002fj.a;
                if (str12 != null) {
                    AbstractC4132kh.m = str12;
                    if (context13 != null) {
                        ConcurrentHashMap concurrentHashMap12 = Qa.b;
                        Pa.a(context13, "user_info_store").a("user_interest", str12, false);
                    }
                }
                Location location = AbstractC4132kh.n;
                Context context14 = AbstractC4002fj.a;
                if (location != null) {
                    AbstractC4132kh.n = location;
                    if (context14 != null) {
                        String a = AbstractC4132kh.a(location);
                        ConcurrentHashMap concurrentHashMap13 = Qa.b;
                        str = "user_interest";
                        Pa.a(context14, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, a, false);
                        int i5 = Integer.MIN_VALUE;
                        if (AbstractC4132kh.a == Integer.MIN_VALUE) {
                            Context context15 = AbstractC4002fj.a;
                            if (context15 != null) {
                                ConcurrentHashMap concurrentHashMap14 = Qa.b;
                                Qa a2 = Pa.a(context15, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age", "key");
                                i5 = a2.a.getInt("user_age", Integer.MIN_VALUE);
                            }
                            AbstractC4132kh.a = i5;
                        }
                        if (AbstractC4132kh.c == null) {
                            Context context16 = AbstractC4002fj.a;
                            if (context16 == null) {
                                string10 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap15 = Qa.b;
                                Qa a3 = Pa.a(context16, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_group", "key");
                                string10 = a3.a.getString("user_age_group", null);
                            }
                            AbstractC4132kh.c = string10;
                        }
                        if (AbstractC4132kh.d == null) {
                            Context context17 = AbstractC4002fj.a;
                            if (context17 == null) {
                                string9 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap16 = Qa.b;
                                Qa a4 = Pa.a(context17, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_area_code", "key");
                                string9 = a4.a.getString("user_area_code", null);
                            }
                            AbstractC4132kh.d = string9;
                        }
                        if (AbstractC4132kh.e == null) {
                            Context context18 = AbstractC4002fj.a;
                            if (context18 == null) {
                                string8 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap17 = Qa.b;
                                Qa a5 = Pa.a(context18, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_post_code", "key");
                                string8 = a5.a.getString("user_post_code", null);
                            }
                            AbstractC4132kh.e = string8;
                        }
                        if (AbstractC4132kh.f == null) {
                            Context context19 = AbstractC4002fj.a;
                            if (context19 == null) {
                                string7 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap18 = Qa.b;
                                Qa a6 = Pa.a(context19, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_city_code", "key");
                                string7 = a6.a.getString("user_city_code", null);
                            }
                            AbstractC4132kh.f = string7;
                        }
                        if (AbstractC4132kh.g == null) {
                            Context context20 = AbstractC4002fj.a;
                            if (context20 == null) {
                                string6 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap19 = Qa.b;
                                Qa a7 = Pa.a(context20, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_state_code", "key");
                                string6 = a7.a.getString("user_state_code", null);
                            }
                            AbstractC4132kh.g = string6;
                        }
                        if (AbstractC4132kh.h == null) {
                            Context context21 = AbstractC4002fj.a;
                            if (context21 == null) {
                                string5 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap20 = Qa.b;
                                Qa a8 = Pa.a(context21, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_country_code", "key");
                                string5 = a8.a.getString("user_country_code", null);
                            }
                            AbstractC4132kh.h = string5;
                        }
                        if (AbstractC4132kh.i == Integer.MIN_VALUE) {
                            Context context22 = AbstractC4002fj.a;
                            if (context22 == null) {
                                i = Integer.MIN_VALUE;
                            } else {
                                ConcurrentHashMap concurrentHashMap21 = Qa.b;
                                Qa a9 = Pa.a(context22, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_yob", "key");
                                i = a9.a.getInt("user_yob", Integer.MIN_VALUE);
                            }
                            AbstractC4132kh.i = i;
                        }
                        if (AbstractC4132kh.j == null) {
                            Context context23 = AbstractC4002fj.a;
                            if (context23 == null) {
                                string4 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap22 = Qa.b;
                                Qa a10 = Pa.a(context23, "user_info_store");
                                Intrinsics.checkNotNullParameter(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, "key");
                                string4 = a10.a.getString(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, null);
                            }
                            AbstractC4132kh.j = string4;
                        }
                        if (AbstractC4132kh.k == null) {
                            Context context24 = AbstractC4002fj.a;
                            if (context24 == null) {
                                string3 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap23 = Qa.b;
                                Qa a11 = Pa.a(context24, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_education", "key");
                                string3 = a11.a.getString("user_education", null);
                            }
                            AbstractC4132kh.k = string3;
                        }
                        if (AbstractC4132kh.l == null) {
                            Context context25 = AbstractC4002fj.a;
                            if (context25 == null) {
                                string2 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap24 = Qa.b;
                                Qa a12 = Pa.a(context25, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_language", "key");
                                string2 = a12.a.getString("user_language", null);
                            }
                            AbstractC4132kh.l = string2;
                        }
                        if (AbstractC4132kh.m == null) {
                            Context context26 = AbstractC4002fj.a;
                            if (context26 == null) {
                                string = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap25 = Qa.b;
                                Qa a13 = Pa.a(context26, "user_info_store");
                                String key = str;
                                Intrinsics.checkNotNullParameter(key, "key");
                                string = a13.a.getString(key, null);
                            }
                            AbstractC4132kh.m = string;
                        }
                        AbstractC4132kh.b();
                        if (AbstractC4132kh.b == null && (context = AbstractC4002fj.a) != null) {
                            ConcurrentHashMap concurrentHashMap26 = Qa.b;
                            Qa a14 = Pa.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC4132kh.b = Boolean.valueOf(a14.a.getBoolean("user_age_restricted", false));
                        }
                        C4400ul runnable = new C4400ul(this.b, null);
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        BuildersKt__Builders_commonKt.launch$default(AbstractC4002fj.h, null, null, new C3976ej(runnable, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }
                str = "user_interest";
                int i52 = Integer.MIN_VALUE;
                if (AbstractC4132kh.a == Integer.MIN_VALUE) {
                }
                if (AbstractC4132kh.c == null) {
                }
                if (AbstractC4132kh.d == null) {
                }
                if (AbstractC4132kh.e == null) {
                }
                if (AbstractC4132kh.f == null) {
                }
                if (AbstractC4132kh.g == null) {
                }
                if (AbstractC4132kh.h == null) {
                }
                if (AbstractC4132kh.i == Integer.MIN_VALUE) {
                }
                if (AbstractC4132kh.j == null) {
                }
                if (AbstractC4132kh.k == null) {
                }
                if (AbstractC4132kh.l == null) {
                }
                if (AbstractC4132kh.m == null) {
                }
                AbstractC4132kh.b();
                if (AbstractC4132kh.b == null) {
                    ConcurrentHashMap concurrentHashMap262 = Qa.b;
                    Qa a142 = Pa.a(context, "user_info_store");
                    Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                    AbstractC4132kh.b = Boolean.valueOf(a142.a.getBoolean("user_age_restricted", false));
                }
                C4400ul runnable2 = new C4400ul(this.b, null);
                Intrinsics.checkNotNullParameter(runnable2, "runnable");
                BuildersKt__Builders_commonKt.launch$default(AbstractC4002fj.h, null, null, new C3976ej(runnable2, null), 3, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.a = 2;
    }
}
