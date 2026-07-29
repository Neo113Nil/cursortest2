package o;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* renamed from: o.y10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2261y10 extends AbstractC2225xU implements InterfaceC2312yp {
    public I8 h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ContentResolver k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ C2060v0 m;
    public final /* synthetic */ J8 n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261y10(ContentResolver contentResolver, Uri uri, C2060v0 c2060v0, J8 j8, Context context, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = contentResolver;
        this.l = uri;
        this.m = c2060v0;
        this.n = j8;
        this.f245o = context;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C2261y10 c2261y10 = new C2261y10(this.k, this.l, this.m, this.n, this.f245o, interfaceC2235xe);
        c2261y10.j = obj;
        return c2261y10;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C2261y10) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:15:0x0055, B:17:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2309ym interfaceC2309ym;
        I8 i8;
        InterfaceC2309ym interfaceC2309ym2;
        I8 i82;
        Object b;
        int i = this.i;
        C2060v0 c2060v0 = this.m;
        ContentResolver contentResolver = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                interfaceC2309ym = (InterfaceC2309ym) this.j;
                contentResolver.registerContentObserver(this.l, false, c2060v0);
                i8 = new I8(this.n);
                this.j = interfaceC2309ym;
                this.h = i8;
                this.i = 1;
                b = i8.b(this);
                if (b != enumC0448Re) {
                }
            } else if (i == 1) {
                i82 = this.h;
                interfaceC2309ym2 = (InterfaceC2309ym) this.j;
                AbstractC1494mO.l(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i82 = this.h;
                interfaceC2309ym2 = (InterfaceC2309ym) this.j;
                AbstractC1494mO.l(obj);
                interfaceC2309ym = interfaceC2309ym2;
                i8 = i82;
                this.j = interfaceC2309ym;
                this.h = i8;
                this.i = 1;
                b = i8.b(this);
                if (b != enumC0448Re) {
                    return enumC0448Re;
                }
                I8 i83 = i8;
                interfaceC2309ym2 = interfaceC2309ym;
                obj = b;
                i82 = i83;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(c2060v0);
                    return C0782bY.a;
                }
                i82.c();
                Float f = new Float(Settings.Global.getFloat(this.f245o.getContentResolver(), "animator_duration_scale", 1.0f));
                this.j = interfaceC2309ym2;
                this.h = i82;
                this.i = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(c2060v0);
            throw th;
        }
    }
}
