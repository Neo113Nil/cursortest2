package yads;

import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginLogger;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class od2 implements bo {
    public final String a;
    public final bu2 b;
    public final v83 c;
    public final a93 d;
    public final io2 e;

    public od2(String str, bu2 bu2Var, v83 v83Var, a93 a93Var, io2 io2Var) {
        this.a = str;
        this.b = bu2Var;
        this.c = v83Var;
        this.d = a93Var;
        this.e = io2Var;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        int i = ((u82) obj).a;
        boolean z = ob1.a;
        Map map = this.e.a;
        String lowerCase = this.d.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map plus = MapsKt.plus(MapsKt.plus(MapsKt.mutableMapOf(TuplesKt.to("tracking_result", "success"), TuplesKt.to("code", Integer.valueOf(i))), map), MapsKt.mapOf(TuplesKt.to("tracking_url_type", lowerCase), TuplesKt.to("tracking_url", ib3.a(this.a))));
        v83 v83Var = this.c;
        fo2 fo2Var = fo2.c;
        v83Var.a(plus, this.b);
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        l83 l83Var;
        l83 l83Var2;
        Integer valueOf;
        String str;
        l83 l83Var3;
        String str2;
        String str3;
        String str4;
        String message;
        hm3Var.getClass();
        boolean z = ob1.a;
        if (hm3Var instanceof i73) {
            l83Var = j73.a((i73) hm3Var);
        } else if (hm3Var instanceof p92) {
            l83Var = t82.a((p92) hm3Var);
        } else if (hm3Var instanceof s82) {
            s82 s82Var = (s82) hm3Var;
            Throwable cause = s82Var.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = s82Var.getMessage();
            }
            if (cause instanceof SSLException) {
                l83Var = r33.a((SSLException) cause);
            } else if (cause instanceof IOException) {
                l83Var = t82.a((IOException) cause);
                if (l83Var == null) {
                    m83 m83Var = m83.c;
                    if (message == null) {
                        message = "I/O error";
                    }
                    l83Var = new l83(m83Var, "io_error", message, null);
                }
            } else {
                m83 m83Var2 = m83.c;
                if (message == null) {
                    message = "Network error";
                }
                l83Var = new l83(m83Var2, "network_error", message, null);
            }
        } else {
            if (hm3Var instanceof kv) {
                kv kvVar = (kv) hm3Var;
                u82 u82Var = kvVar.b;
                valueOf = u82Var != null ? Integer.valueOf(u82Var.a) : null;
                String message2 = kvVar.getMessage();
                if (valueOf != null && valueOf.intValue() == 400) {
                    str3 = "Bad request";
                } else if (valueOf != null && valueOf.intValue() == 401) {
                    str3 = "Unauthorized";
                } else if (valueOf != null && valueOf.intValue() == 403) {
                    str3 = "Forbidden";
                } else {
                    str3 = (valueOf != null && valueOf.intValue() == 404) ? "Not found" : "Client error";
                }
                m83 m83Var3 = m83.f;
                if (valueOf != null && valueOf.intValue() == 400) {
                    str4 = "client_bad_request";
                } else if (valueOf != null && valueOf.intValue() == 401) {
                    str4 = "client_unauthorized";
                } else if (valueOf != null && valueOf.intValue() == 403) {
                    str4 = "client_forbidden";
                } else {
                    str4 = (valueOf != null && valueOf.intValue() == 404) ? "client_not_found" : "client_error";
                }
                if (message2 == null) {
                    message2 = str3;
                }
                l83Var3 = new l83(m83Var3, str4, message2, valueOf);
            } else if (hm3Var instanceof jy2) {
                jy2 jy2Var = (jy2) hm3Var;
                u82 u82Var2 = jy2Var.b;
                valueOf = u82Var2 != null ? Integer.valueOf(u82Var2.a) : null;
                String message3 = jy2Var.getMessage();
                if (valueOf != null && valueOf.intValue() == 500) {
                    str = "Internal server error";
                } else if (valueOf != null && valueOf.intValue() == 502) {
                    str = "Bad gateway";
                } else if (valueOf != null && valueOf.intValue() == 503) {
                    str = "Service unavailable";
                } else {
                    str = (valueOf != null && valueOf.intValue() == 504) ? "Gateway timeout" : "Server error";
                }
                m83 m83Var4 = m83.e;
                if (valueOf != null && valueOf.intValue() == 500) {
                    str2 = "server_internal_error";
                } else if (valueOf != null && valueOf.intValue() == 502) {
                    str2 = "server_bad_gateway";
                } else if (valueOf != null && valueOf.intValue() == 503) {
                    str2 = "server_unavailable";
                } else {
                    str2 = (valueOf != null && valueOf.intValue() == 504) ? "server_gateway_timeout" : "server_error";
                }
                if (message3 == null) {
                    message3 = str;
                }
                l83Var3 = new l83(m83Var4, str2, message3, valueOf);
            } else if (hm3Var instanceof ac2) {
                m83 m83Var5 = m83.h;
                String message4 = hm3Var.getMessage();
                if (message4 == null) {
                    message4 = "Response parsing error";
                }
                l83Var = new l83(m83Var5, "parse_error", message4, null);
            } else if (hm3Var instanceof lk) {
                m83 m83Var6 = m83.i;
                String message5 = hm3Var.getMessage();
                if (message5 == null) {
                    message5 = "Authentication failure";
                }
                l83Var = new l83(m83Var6, "auth_failure", message5, null);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(hm3Var);
                Throwable th = hm3Var;
                for (Throwable cause2 = hm3Var.getCause(); cause2 != null && !Intrinsics.areEqual(cause2, th) && !linkedHashSet.contains(cause2); cause2 = cause2.getCause()) {
                    linkedHashSet.add(cause2);
                    th = cause2;
                }
                if (Intrinsics.areEqual(th, hm3Var)) {
                    th = null;
                }
                if (th instanceof UnknownHostException) {
                    l83Var = t82.a(new p92((IOException) th));
                } else if (th instanceof SSLException) {
                    l83Var = r33.a((SSLException) th);
                } else if (th instanceof SocketTimeoutException) {
                    l83Var = j73.a(new i73());
                } else if (th instanceof ConnectException) {
                    l83Var = t82.a(new p92((IOException) th));
                } else if (!(th instanceof IOException) || (l83Var = t82.a((IOException) th)) == null) {
                    String message6 = hm3Var.getMessage();
                    if (message6 == null) {
                        message6 = th != null ? th.getMessage() : null;
                    }
                    if (message6 != null) {
                        String lowerCase = message6.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "unable to resolve host", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "nodename nor servname provided", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "temporary failure in name resolution", false, 2, (Object) null)) {
                            if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "timeout", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "timed out", false, 2, (Object) null)) {
                                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "connection refused", false, 2, (Object) null)) {
                                    l83Var2 = new l83(m83.c, "connection_refused", message6, null);
                                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "network is unreachable", false, 2, (Object) null)) {
                                    l83Var2 = new l83(m83.c, "network_unreachable", message6, null);
                                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "no route to host", false, 2, (Object) null)) {
                                    l83Var2 = new l83(m83.c, "no_route", message6, null);
                                } else if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "host is down", false, 2, (Object) null)) {
                                    l83Var2 = new l83(m83.c, "host_down", message6, null);
                                } else if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "ssl", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "tls", false, 2, (Object) null)) {
                                    l83Var2 = StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "interrupted", false, 2, (Object) null) ? new l83(m83.c, "interrupted", message6, null) : null;
                                } else {
                                    l83Var2 = new l83(m83.g, "ssl_error", message6, null);
                                }
                            } else {
                                l83Var2 = new l83(m83.d, "timeout", message6, null);
                            }
                        } else {
                            l83Var2 = new l83(m83.c, "unknown_host", message6, null);
                        }
                        if (l83Var2 != null) {
                            l83Var = l83Var2;
                        }
                    }
                    u82 u82Var3 = hm3Var.b;
                    Integer valueOf2 = u82Var3 != null ? Integer.valueOf(u82Var3.a) : null;
                    if (valueOf2 != null) {
                        l83Var = z01.a(valueOf2.intValue(), message6);
                    } else if (message6 != null) {
                        l83Var = new l83(m83.j, "unknown", StringsKt.take(new Regex("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}(:\\d+)?").replace(new Regex("https?://[^\\s]+").replace(message6, "[url]"), "[ip]"), 100), null);
                    } else {
                        l83Var = new l83(m83.j, "unknown", "Unknown error", null);
                    }
                }
            }
            l83Var = l83Var3;
        }
        if (l83Var.a == m83.j) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(hm3Var);
            Throwable th2 = hm3Var;
            for (Throwable cause3 = hm3Var.getCause(); cause3 != null && !Intrinsics.areEqual(cause3, th2) && !linkedHashSet2.contains(cause3); cause3 = cause3.getCause()) {
                linkedHashSet2.add(cause3);
                th2 = cause3;
            }
            Intrinsics.areEqual(th2, hm3Var);
            boolean z2 = ob1.a;
        }
        Map map = this.e.a;
        String lowerCase2 = this.d.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        Map mapOf = MapsKt.mapOf(TuplesKt.to("tracking_url_type", lowerCase2), TuplesKt.to("tracking_url", ib3.a(this.a)));
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("tracking_result", LoginLogger.EVENT_EXTRAS_FAILURE), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, l83Var.a.b), TuplesKt.to("error_code", l83Var.b), TuplesKt.to("error_message", l83Var.c));
        mutableMapOf.putAll(map);
        mutableMapOf.putAll(mapOf);
        Integer num = l83Var.d;
        if (num != null) {
            mutableMapOf.put("code", Integer.valueOf(num.intValue()));
        }
        v83 v83Var = this.c;
        fo2 fo2Var = fo2.c;
        v83Var.a(mutableMapOf, this.b);
    }
}
