package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class D8 {
    public final HtmlVideoPlayerRequest a;
    public final Hi b;
    public final InterfaceC4466x9 c;
    public final CoroutineScope d;
    public final CoroutineScope e;
    public Job f;
    public final AtomicBoolean g;
    public final WeakReference h;
    public boolean i;
    public final HtmlVideoPlayerConfig j;
    public final V7 k;
    public boolean l;
    public C4265pi m;
    public C4423vi n;
    public boolean o;
    public Mf p;
    public final AtomicReference q;

    public D8(GestureDetectorOnGestureListenerC4476xi renderView, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest videoRequestConfig, C4423vi c4423vi, Hi hi, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(videoRequestConfig, "videoRequestConfig");
        this.a = videoRequestConfig;
        this.b = hi;
        this.c = interfaceC4466x9;
        C8 c8 = new C8(CoroutineExceptionHandler.Key, this);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(c8));
        this.d = CoroutineScope;
        this.e = X4.a(CoroutineScope, c8);
        this.g = new AtomicBoolean(false);
        this.h = new WeakReference(renderView.getContext());
        this.j = videoRequestConfig.getConfig();
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k = new V7(context, hybridNativeConfig, CoroutineScope, videoRequestConfig, interfaceC4466x9);
        this.n = c4423vi;
        this.q = new AtomicReference(A8.a);
    }

    public static /* synthetic */ boolean a(D8 d8, A8[] a8Arr, String str, String str2, A8 a8, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            a8 = null;
        }
        return d8.a(a8Arr, str, str2, a8);
    }

    public final void b(boolean z) {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? "show" : "hide");
        A8[] a8Arr = {A8.c, A8.e, A8.f, A8.g, A8.h};
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        if (a(this, a8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            V7 v7 = this.k;
            if (v7.h.get()) {
                return;
            }
            if (z) {
                v7.e();
            } else {
                v7.f();
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                v7.n.setVisibility(z ? 0 : 8);
            } else {
                BuildersKt__Builders_commonKt.launch$default(v7.c, null, null, new G7(null, v7, z), 3, null);
            }
        }
    }

    public final boolean a(A8[] a8Arr, String str, String str2, A8 a8) {
        A8 a82 = (A8) this.q.get();
        boolean z = false;
        if (ArraysKt.contains(a8Arr, a82)) {
            if (a8 != null && !a(a8, str, str2)) {
                z = true;
            }
            return !z;
        }
        if (str != null) {
            String format = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{a82, str2, ArraysKt.joinToString$default(a8Arr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            a(str, format, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r5 == com.inmobi.media.A8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r5 == com.inmobi.media.A8.i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r5 != com.inmobi.media.A8.h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0073, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007c, code lost:
    
        if (r5 != com.inmobi.media.A8.i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(A8 a8, String str, String str2) {
        InterfaceC4466x9 interfaceC4466x9;
        A8 a82 = (A8) this.q.get();
        if (a82 == a8) {
            return true;
        }
        Intrinsics.checkNotNull(a82);
        switch (a82.ordinal()) {
            case 0:
                if (a8 != A8.b) {
                    break;
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a("HybridVideoPlayerHandler", "State transition: " + a82 + " -> " + a8 + " (cause=" + str2 + ")");
                }
                this.q.set(a8);
                return true;
            case 1:
                if (a8 != A8.c) {
                    if (a8 != A8.d) {
                        if (a8 != A8.h) {
                            break;
                        }
                    }
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 2:
                if (a8 != A8.e) {
                    if (a8 != A8.f) {
                        if (a8 != A8.i) {
                            break;
                        }
                    }
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 3:
                break;
            case 4:
                if (a8 != A8.f) {
                    if (a8 != A8.g) {
                        if (a8 != A8.h) {
                            break;
                        }
                    }
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 5:
                if (a8 != A8.e) {
                    if (a8 != A8.i) {
                        break;
                    }
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 6:
                if (a8 != A8.e) {
                    if (a8 != A8.i) {
                        break;
                    }
                }
                interfaceC4466x9 = this.c;
                if (interfaceC4466x9 != null) {
                }
                this.q.set(a8);
                return true;
            case 7:
                break;
            case 8:
                if (str != null) {
                    String format = String.format("Illegal state transition from %s to %s for %s", Arrays.copyOf(new Object[]{a82, a8, str2 == null ? "state transition" : str2}, 3));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    a(str, format, str2);
                }
                A8 a83 = A8.h;
                if (a82 == a83 || a82 == A8.i) {
                    return false;
                }
                this.q.set(a83);
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.g.get()) {
            return;
        }
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        if (Intrinsics.areEqual(str, "unknown")) {
            return;
        }
        C3991f8 obj = new C3991f8(str3);
        C4423vi c4423vi = this.n;
        if (c4423vi != null) {
            EnumC4465x8 htmlVideoTemplateEvents = EnumC4465x8.e;
            Intrinsics.checkNotNullParameter(obj, "obj");
            JSONObject a = AbstractC4494ya.a(obj, C3991f8.class);
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c4423vi.a.a(htmlVideoTemplateEvents, a);
        }
    }

    public final void a(boolean z) {
        if (this.g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z ? "mute" : "unmute");
        A8[] a8Arr = {A8.c, A8.e, A8.f};
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        if (a(this, a8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            V7 v7 = this.k;
            if (v7.h.get()) {
                return;
            }
            if (z) {
                C3859a8 c3859a8 = v7.y;
                c3859a8.a();
                c3859a8.d.a();
            } else {
                C3859a8 c3859a82 = v7.y;
                X4.a(c3859a82.a, new Z7(c3859a82, null));
            }
        }
    }

    public final void a() {
        ViewGroup viewGroup;
        if (this.g.getAndSet(true)) {
            return;
        }
        A8 a8 = A8.i;
        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
        a(a8, "executeVideoPlayerActions", (String) null);
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        V7 v7 = this.k;
        if (!v7.h.getAndSet(true)) {
            InterfaceC4466x9 interfaceC4466x92 = v7.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("HtmlMediaPlayer", "destroy called");
            }
            Job job = v7.v;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            v7.v = null;
            v7.l.set(Jg.h);
            v7.g.set(false);
            X4.a(v7.k);
            v7.x.a();
            if (v7.f.get()) {
                v7.f.set(false);
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    BuildersKt__Builders_commonKt.launch$default(v7.c, null, null, new Q7(null, v7), 3, null);
                } else {
                    v7.p.removeListener(v7.B);
                }
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                BuildersKt__Builders_commonKt.launch$default(v7.c, null, null, new P7(null, v7), 3, null);
            } else {
                InMobiVideoBridge.exoPlayer3Stop(v7.p);
                v7.p.clearMediaItems();
                InMobiVideoBridge.exoPlayer3Release(v7.p);
                v7.z.a();
                v7.y.d.d();
            }
            v7.n.setOnPositionChangeListener(null);
            v7.n.removeAllViews();
            WeakReference weakReference = v7.r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(v7.n);
            }
            WeakReference weakReference2 = v7.r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            CoroutineScopeKt.cancel$default(v7.c, null, 1, null);
            CoroutineScopeKt.cancel$default(v7.d, null, 1, null);
        }
        V7 v72 = this.k;
        v72.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", v72.p.getDuration());
        jSONObject.put("playbackTime", v72.p.getCurrentPosition());
        jSONObject.put("bufferTime", v72.p.getBufferedPosition());
        String durationPayload = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(durationPayload, "toString(...)");
        Hi hi = this.b;
        if (hi != null) {
            Intrinsics.checkNotNullParameter(durationPayload, "durationPayload");
            Map a = hi.a();
            a.put("payload", durationPayload);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("VideoDestroyed", a, EnumC4530zk.a);
        }
        C4423vi c4423vi = this.n;
        if (c4423vi != null) {
            EnumC4465x8 htmlVideoTemplateEvents = EnumC4465x8.k;
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c4423vi.a.a(htmlVideoTemplateEvents, (Object) null);
        }
        Job job2 = this.f;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.f = null;
        this.m = null;
        this.n = null;
    }

    public final void a(AbstractC4295qm obj) {
        Hi hi;
        C4423vi c4423vi;
        C4423vi c4423vi2;
        C4265pi c4265pi;
        C4423vi c4423vi3;
        Mf mf;
        InterfaceC4466x9 interfaceC4466x9 = this.c;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + obj);
        }
        boolean z = obj instanceof Wm;
        if (z) {
            C4423vi c4423vi4 = this.n;
            if (c4423vi4 != null) {
                EnumC4465x8 htmlVideoTemplateEvents = EnumC4465x8.h;
                EnumC4045h8[] enumC4045h8Arr = EnumC4045h8.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
                c4423vi4.a.a(htmlVideoTemplateEvents, "q1");
            }
        } else if (obj instanceof Hn) {
            C4423vi c4423vi5 = this.n;
            if (c4423vi5 != null) {
                EnumC4465x8 htmlVideoTemplateEvents2 = EnumC4465x8.h;
                EnumC4045h8[] enumC4045h8Arr2 = EnumC4045h8.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents2, "htmlVideoTemplateEvents");
                c4423vi5.a.a(htmlVideoTemplateEvents2, "q2");
            }
        } else if (obj instanceof Qn) {
            C4423vi c4423vi6 = this.n;
            if (c4423vi6 != null) {
                EnumC4465x8 htmlVideoTemplateEvents3 = EnumC4465x8.h;
                EnumC4045h8[] enumC4045h8Arr3 = EnumC4045h8.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents3, "htmlVideoTemplateEvents");
                c4423vi6.a.a(htmlVideoTemplateEvents3, "q3");
            }
        } else if (obj instanceof Xm) {
            C4423vi c4423vi7 = this.n;
            if (c4423vi7 != null) {
                EnumC4465x8 htmlVideoTemplateEvents4 = EnumC4465x8.h;
                EnumC4045h8[] enumC4045h8Arr4 = EnumC4045h8.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents4, "htmlVideoTemplateEvents");
                c4423vi7.a.a(htmlVideoTemplateEvents4, "q4");
            }
        } else if (obj instanceof C4243om) {
            if (a(A8.g, (String) null, (String) null) && (c4423vi3 = this.n) != null) {
                EnumC4465x8 htmlVideoTemplateEvents5 = EnumC4465x8.c;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents5, "htmlVideoTemplateEvents");
                c4423vi3.a.a(htmlVideoTemplateEvents5, (Object) null);
            }
        } else if (obj instanceof C4229o8) {
            if (a(this, new A8[]{A8.b}, null, null, A8.c, 6)) {
                C4265pi c4265pi2 = this.m;
                if (c4265pi2 != null) {
                    HtmlVideoPlaybackState obj2 = ((C4229o8) obj).a;
                    Intrinsics.checkNotNullParameter(obj2, "videoInfo");
                    InterfaceC4466x9 interfaceC4466x92 = c4265pi2.a.i;
                    if (interfaceC4466x92 != null) {
                        ((C4493y9) interfaceC4466x92).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                    }
                    GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = c4265pi2.a;
                    EnumC4465x8 enumC4465x8 = EnumC4465x8.b;
                    Intrinsics.checkNotNullParameter(obj2, "obj");
                    gestureDetectorOnGestureListenerC4476xi.a(enumC4465x8, AbstractC4494ya.a(obj2, HtmlVideoPlaybackState.class));
                }
                if (this.o) {
                    this.k.e();
                }
            }
        } else if (obj instanceof C4097j8) {
            if (a(this, new A8[]{A8.b}, null, null, A8.d, 6) && (c4265pi = this.m) != null) {
                c4265pi.a((C4097j8) obj);
            }
        } else if (obj instanceof C4281q8) {
            a(A8.h, (String) null, (String) null);
            C4423vi c4423vi8 = this.n;
            if (c4423vi8 != null) {
                EnumC4465x8 htmlVideoTemplateEvents6 = EnumC4465x8.d;
                Intrinsics.checkNotNullParameter(obj, "obj");
                JSONObject a = AbstractC4494ya.a(obj, obj.getClass());
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents6, "htmlVideoTemplateEvents");
                c4423vi8.a.a(htmlVideoTemplateEvents6, a);
            }
        } else if (obj instanceof C4218nn) {
            A8[] a8Arr = {A8.e};
            A8 a8 = A8.f;
            a(this, a8Arr, null, null, a8, 6);
            if (this.q.get() == a8 && (c4423vi2 = this.n) != null) {
                EnumC4465x8 htmlVideoTemplateEvents7 = EnumC4465x8.f;
                HtmlVideoPlaybackState obj3 = this.k.a();
                Intrinsics.checkNotNullParameter(obj3, "obj");
                JSONObject a2 = AbstractC4494ya.a(obj3, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents7, "htmlVideoTemplateEvents");
                c4423vi2.a.a(htmlVideoTemplateEvents7, a2);
            }
        } else if (obj instanceof Gn) {
            A8[] a8Arr2 = {A8.c, A8.f, A8.g};
            A8 a82 = A8.e;
            a(this, a8Arr2, null, null, a82, 6);
            if (this.q.get() == a82 && (c4423vi = this.n) != null) {
                EnumC4465x8 htmlVideoTemplateEvents8 = EnumC4465x8.f;
                HtmlVideoPlaybackState obj4 = this.k.a();
                Intrinsics.checkNotNullParameter(obj4, "obj");
                JSONObject a3 = AbstractC4494ya.a(obj4, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents8, "htmlVideoTemplateEvents");
                c4423vi.a.a(htmlVideoTemplateEvents8, a3);
            }
        } else if (obj instanceof Jn) {
            C4423vi c4423vi9 = this.n;
            if (c4423vi9 != null) {
                EnumC4465x8 htmlVideoTemplateEvents9 = EnumC4465x8.h;
                EnumC4045h8[] enumC4045h8Arr5 = EnumC4045h8.a;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents9, "htmlVideoTemplateEvents");
                c4423vi9.a.a(htmlVideoTemplateEvents9, "q0");
            }
        } else if (obj instanceof C4360t8) {
            C4360t8 c4360t8 = (C4360t8) obj;
            float f = c4360t8.a / 1000.0f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", Float.valueOf(f));
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, Float.valueOf(c4360t8.b / 1000.0f));
            C4423vi c4423vi10 = this.n;
            if (c4423vi10 != null) {
                EnumC4465x8 htmlVideoTemplateEvents10 = EnumC4465x8.g;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents10, "htmlVideoTemplateEvents");
                c4423vi10.a.a(htmlVideoTemplateEvents10, jSONObject);
            }
        } else if (obj instanceof C4333s8) {
            C4423vi c4423vi11 = this.n;
            if (c4423vi11 != null) {
                EnumC4465x8 htmlVideoTemplateEvents11 = EnumC4465x8.m;
                VideoViewPosition obj5 = ((C4333s8) obj).a;
                Intrinsics.checkNotNullParameter(obj5, "obj");
                JSONObject a4 = AbstractC4494ya.a(obj5, VideoViewPosition.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents11, "htmlVideoTemplateEvents");
                c4423vi11.a.a(htmlVideoTemplateEvents11, a4);
            }
        } else if (obj instanceof C3963e8) {
            C4423vi c4423vi12 = this.n;
            if (c4423vi12 != null) {
                EnumC4465x8 htmlVideoTemplateEvents12 = EnumC4465x8.n;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents12, "htmlVideoTemplateEvents");
                c4423vi12.a.a(htmlVideoTemplateEvents12, (Object) null);
            }
        } else if (obj instanceof C4255p8) {
            C4423vi c4423vi13 = this.n;
            if (c4423vi13 != null) {
                EnumC4465x8 htmlVideoTemplateEvents13 = EnumC4465x8.o;
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents13, "htmlVideoTemplateEvents");
                c4423vi13.a.a(htmlVideoTemplateEvents13, (Object) null);
            }
        } else if (obj instanceof W1) {
            C4423vi c4423vi14 = this.n;
            if (c4423vi14 != null) {
                EnumC4465x8 htmlVideoTemplateEvents14 = EnumC4465x8.f;
                HtmlVideoPlaybackState obj6 = this.k.a();
                Intrinsics.checkNotNullParameter(obj6, "obj");
                JSONObject a5 = AbstractC4494ya.a(obj6, HtmlVideoPlaybackState.class);
                Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents14, "htmlVideoTemplateEvents");
                c4423vi14.a.a(htmlVideoTemplateEvents14, a5);
            }
        } else if ((obj instanceof C4492y8) && (hi = this.b) != null) {
            Map a6 = hi.a();
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("ViewStateOnParentAttached", a6, EnumC4530zk.a);
        }
        if ((z || (obj instanceof Hn) || (obj instanceof Qn) || (obj instanceof C4243om) || (obj instanceof Jn) || (obj instanceof C4218nn) || (obj instanceof Gn) || (obj instanceof C4281q8) || (obj instanceof W1)) && (mf = this.p) != null) {
            Intrinsics.checkNotNullParameter(obj, "videoEvent");
            Oe oe = mf.e;
            if (oe != null) {
                oe.a(obj);
            }
        }
    }
}
